function validate2() {
    valCheck = true;
    var image1 = getImage(emailCheck(document.forms["validation2"]["email"].value), "email");
    document.getElementById("x").appendChild(image1);
	var image2 = getImage(phoneNumCheck(document.forms["validation2"]["phone"].value), "phone");
	document.getElementById("y").appendChild(image2);
	var image3 = getImage(addressCheck(document.forms["validation2"]["address"].value), "address");
	document.getElementById("z").appendChild(image3);
	
	var check1 = emailCheck(document.forms["validation2"]["email"].value);
	var check2 = phoneNumCheck(document.forms["validation2"]["phone"].value);
	var check3 = addressCheck(document.forms["validation2"]["address"].value);
	
	if(!check1){
		alert ("Email entered must be in the form xxx@xxx.xxxx and should be alphanumeric (e.g. no special symbols)");
	}
	else if(!check2){
		alert ("Phone number entered must be in the form xxx-xxx-xxxx or xxxxxxxxxx. x should be numeric");
	}
	else if(!check3){
		alert ("Address entered must be in the form of city & state. example: Ames,IA");
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

function emailCheck(email) {
    atSplit = email.split('@');
    if (atSplit.length == 2 && alphaNumCheck(atSplit[0])) {
        periodSplit = atSplit[1].split('.')
        if (periodSplit.length == 2 && alphaNumCheck(periodSplit[0] + periodSplit[1])) {
            return true;
        }
    }
    valCheck = false;
    return false;
}

function phoneNumCheck(entry) {
	let regex = /^[+]*[(]{0,1}[0-9]{1,3}[)]{0,1}[-\s\./0-9]*$/g;
	if (entry != null && entry.match(regex)) {
        return true;
    } else {
        return false;
    }
}

function addressCheck(entry) {
	let regex = /^[a-z,AZ]+$/i;
	if (entry != null && entry.match(regex)) {
        return true;
    } else {
        return false;
    }
	
	
}

function alphaNumCheck(entry) {
    let regex = /^[a-z0-9]+$/i;
    if (entry != null && entry.match(regex)) {
        return true;
    } else {
        return false;
    }
}