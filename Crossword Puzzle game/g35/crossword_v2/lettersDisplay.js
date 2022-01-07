let createLetters = function(){
    var d = document.createDocumentFragment();
    for(var i = 0; i < letters.length ; i++){
        var element = document.createElement("input");
        element.type  = "button";
        element.value = letters[i];
        d.appendChild(element);
    }
    document.body.appendChild(d);

}