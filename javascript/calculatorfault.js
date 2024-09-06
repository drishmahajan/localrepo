alert("faulty calc.")
let random= Math.random()
let a= prompt("enter your first no.");
let b = prompt("enter your  second no.")
a = Number(a);
b = Number(b);
console.log(random)
if(random>0.1){
    function sum(a,b) {
        return (+a)+(+b)
    }
    function multiply(a,b) {
        return a*b
    }
    function div(a,b) {
        return a/b
    }
    function sub(a,b) {
        return a-b
    }
}
else{
    function sum(a,b) {
        return a-b
    }
    function multiply(a,b) {
        return (+a)+(+b)
    }
    function div(a,b) {
        return a**b
    }
    function sub(a,b) {
        return a/b
    }

}
 cos=sum(a,b)
 dos=multiply(a,b)
 eos=div(a,b)
 fos=sub(a,b)
console.log("sum is",cos)
console.log("mutiply is",dos)
console.log("div is",eos)
console.log("sub is",fos)
