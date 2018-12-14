// URLs
let url = 'http://192.168.2.31:8080/lofeofmylife/api';
let url1 = 'http://javabank.herokuapp.com/api/customer';

// Elements
const panelLoading = document.getElementById('panelLoading');
const panelListUsers = document.getElementById('panelListUsers');
const panelUser = document.getElementById('panelUser');
const listUsers = document.getElementById('ListUsers');

// Buttons
const btnSelfProfile = document.getElementById('btnSelfProfile');
const btnBackList = document.getElementById('btnBackList');


// Variables
let panelVisible = panelLoading;

 

// Events

// Event delegation
document.getElementById('listUsers').addEventListener("click", function(event){
    let elementCard = event.target.parentNode.parentNode.parentNode;
    let userId = elementCard.getAttribute("id");
    panelToShow(panelUser);
    buildUserProfile(userId);
});
btnBackList.addEventListener("click", function(){
    panelToShow(panelListUsers);
});



// load
window.onload = (function(){

    panelToShow(panelListUsers)
    setTimeout(function(){
        
        // temp data for testing
        //buildUserCards()
        url+= '/list';

        fetchData('GET',url, buildUserCards);


    }, 1000);
}());




// Page Self Profile
function openPanelSelfProfile(){

}


// build UI list lovers
function buildUserCards(users) {
    const listUsers = document.getElementById('listUsers');
    let output='';
    
    console.log(users);
    
    users.forEach( user => {
        output+=`
            <div class="card m-3" id="${user.id}">
                <div class="box">
                    <div class="img">
                        <img src="${user.image}">
                    </div>
                    <h2>${user.city}<br><span>${user.name}</span></h2>
                    <p></p>
                    <p>Age: ${user.age}</p>
                    <p>Gender: ${user.gender}</p>
                </div>
            </div>
        `;
    });
    
    listUsers.innerHTML=output;
}

// build UI profile page
function buildUserProfile(id) {
    const userProfileCol = document.getElementById('userProfileCol');
    const userProfileRateCol = document.getElementById('userProfileRateCol');
    let outputProfile='';
    let outputProfileRate='';

    const userProfile = getProfileById(id);
    const userRate = getProfileIdRate(id);
    
    userProfile.forEach( user => {
        if( user.id === id){
            outputProfile+=`
                <div class="row">
                    <div class="col">
                        <img src="https://via.placeholder.com/150"/>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <h3>${user.name}</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <p>${user.age}</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <p>${user.city}</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <p>${user.gender}</p>
                    </div>
                </div>
            `;
        }
    });


    userRate.forEach( user => {
        if( user.id === id){
            outputProfileRate+=`
                <div class="row">
                    <div class="col">rate</div>
                </div>
            `;
        }
    });
    
    userProfileCol.innerHTML = outputProfile;
    userProfileRateCol.innerHTML = outputProfileRate;
}









function fetchData(verb, url, fncBuildElement){
    let ajax = new XMLHttpRequest();

    ajax.onreadystatechange = function() {
        if (ajax.readyState === 4 && ajax.status === 200) {
           //fncBuildElement(JSON.parse(ajax.responseText));
            console.log(ajax.responseText)
        }
    };
    console.log(url)
    ajax.open(verb, url, true);
    ajax.setRequestHeader('Content-type', 'application/json');
    ajax.send();

}


function panelToShow(panelToOpen) {
    if(panelVisible !== ''){
        panelVisible.style.display = "none";
    }
    panelToOpen.style.display = "block";
    panelVisible = panelToOpen;
}