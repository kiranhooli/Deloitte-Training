function Validate(){
    // document.getElementsByClassName("errMSG").innerHTML = "";
    var a = nameCheck()
    var b = emailCheck()
    var c = mobileCheck()
    var d = genderCheck()
    var e = langCheck()
    var f = stateCheck()

    // console.log(a)
    // console.log(b)
    // console.log(c)
    // console.log(d)
    // console.log(e)
    // console.log(f)

    // console.log(a && b && c && d && e && f)

    if(a && b && c && d && e && f)return true;
    else return false;
}

function nameCheck(){
    var fname = document.getElementById("fName").value;
    var lname = document.getElementById("lName").value;
    var exp = "^[A-Z]{1}[A-Za-z]{2,}$"
    var err = false;

    if(!fname.match(exp)){
        err = true;
        document.getElementById("fNameErr").innerHTML = "Please Follow the Pattern";
    }
    if(!lname.match(exp)){
        err = true;
        document.getElementById("lNameErr").innerHTML = "Please Follow the Pattern";
    }
    return !err

}
function emailCheck(){
    var email = document.getElementById("email").value
    var exp = "^[A-Za-z0-9._%+-]+[@]{1}[A-Za-z0-9.-]+[.]{1}[A-Za-z]{2,4}$"

    if(!email.match(exp)){
        document.getElementById("emailErr").innerHTML = "Enter Valid Email ID"
        return false;
    }
    return true
}
function mobileCheck(){
    var mobile = document.getElementById("mobile").value
    var exp = "^[6-9]{1}[0-9]{9}$"

    if(!mobile.match(exp)){
        document.getElementById("mobileErr").innerHTML = "Entre Valid Mobile Number"
        return false
    }
    else
    return true
}
function genderCheck(){
    var err = true
    var ele = document.getElementsByName("G")
    for(i = 0; i < ele.length; i++) { 
        if(ele[i].checked) {
            err = false;
        }
    }
    if(err)document.getElementById("GErr").innerHTML = "Please Select Gender"
    return !err
}
function langCheck(){
    var err = true
    var ele = document.getElementsByName("l")
    for(i = 0; i < ele.length; i++) { 
        if(ele[i].checked) {
            err = false;
        }
    }
    if(err)document.getElementById("langErr").innerHTML = "Please Select Language"
    return !err
}
function stateCheck(){
    var state = document.getElementById("state").value;
    if(state == "NONE"){
        document.getElementById("stateErr").innerHTML = "Please Select a State"
        return false
    }else return true
}