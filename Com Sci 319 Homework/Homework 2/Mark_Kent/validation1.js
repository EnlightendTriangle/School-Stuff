function validate1() {
    valCheck = true;
    var image1 = getImage(alphaNumCheck(document.forms["validation1"]["firstName"].value), "firstName");
    document.getElementById("x").appendChild(image1);
	var image2 = getImage(alphaNumCheck(document.forms["validation1"]["lastName"].value), "lastName");
	document.getElementById("y").appendChild(image2);
	var image3 = getImage(alphaNumCheck(document.forms["validation1"]["gender"].value), "gender");
	document.getElementById("z").appendChild(image3);
	var image4 = getImage(alphaNumCheck(document.forms["validation1"]["state"].value), "state");
	document.getElementById("w").appendChild(image4);
	
	var check1 = alphaNumCheck(document.forms["validation1"]["firstName"].value);
	var check2 = alphaNumCheck(document.forms["validation1"]["lastName"].value);
	var check3 = alphaNumCheck(document.forms["validation1"]["gender"].value);
	var check4 = alphaNumCheck(document.forms["validation1"]["state"].value);
	
	if(!check1){
		alert ("First name field must contain only alphabetic or numeric characters.");
	}
	else if(!check2){
		alert ("Last name field must contain only alphabetic or numeric characters.");
	}
	else if(!check3){
		alert ("You must choose a gender");
	}
	else if(!check4){
		alert ("You must select a state from the given list...");
	}
	
	if(check1 && check2 && check3 && check4){
		window.location = "validation2.html";
	}

}

function getImage(bool, ID) {
    var image = document.getElementById("image" + ID);
    if (image == null) {
        image = new Image(50, 50);
        image.id = "image" + ID;
    }
    image.src = bool ? './correct.png' : './wrong.png';
    return image;
}

function alphaNumCheck(entry) {
    let regex = /^[a-z0-9]+$/i;
    if (entry != null && entry.match(regex)) {
        return true;
    } else {
        return false;
    }
}

