// let a=45;
// console.log("i am drish")
// let b=45;
// let c=a>b?(a-b):(b-a);
// console.log(c)
// console.log(a===b)
// let dum={
//     "drish":"mahajan",
//     "office code":45
// }   
// for (const c of  "drish") {
//     console.log(c)
// }
// let i=0;
// while (i<5) {
//     console.log(i)
//     i++
// }
// for (let i = 0; i < 10; i++) {
//     console.log(i)
// }
// function hello(name) {
//     console.log("iam starting js " + name)
//     console.log("iam starting js " + name)
//     console.log("iam starting js " + name)
//     console.log("iam starting js " + name)
// }
// hello("manya")
// hello("drish")

// function sum(a,b,c=10){
//     // console.log(a+b)
//     return a+b+c
// }
//  result=sum(9,5)
//  console.log("the sum of no. is ", result)

//  const funct1=(x) => {
//     console.log("i am a boy",x)
//  }
//  funct1(34)
// let a="harry"
// console.log(a.length)
// let real="drish"
// let wife="noom"
// console.log(`my name is ${real} and my gf is ${wife}`)
// console.log(real.toUpperCase())
// console.log(wife.toLowerCase())
// console.log(real.slice(1,3))
// console.log(wife.replace("prachi","single"))
// console.log(wife.concat("u"))
// let arr=[2,3,6,9,8]
// console.log(arr)
// console.log(arr.length)
// console.log(arr[0],arr[2])
// console.log(arr.toString())
// console.log(arr.join("or"))
// arr.forEach((value,index,arr) => {
//     console.log(value,index,arr)
// });
// let newarr = arr.map((e)=>{
//     return e**2
// })
// console.log(newarr)
// function greater7(a) {
//     if(a>7){
//         return true;
//     }
//     return false
// }
// console.log(arr.filter(greater7))
// const red=(a,b)=>{
//     return a+b
// }
// console.log(arr.reduce(red))
// console.log(Array.from("drish")) 
// document.getElementById("you").style.backgroundColor ="yellow"
// document.querySelector(".groom").style.backgroundColor="red"
// document.querySelectorAll(".groom").forEach(element => {
//     element.style.backgroundColor="violet"
// });
// document.getElementsByTagName("div")
//  document.querySelector(".box").innerHTML
//  document.querySelector(".box").hasAttribute("style")
//   let div = document.createElement("div")
//  div.classname = "alert"
//  div.innerHTML="<div><b>helooooo</b></div>"
// document.body.append(div)
// let btn = document.getElementById("btn")
//  btn.addEventListener("click", ()=>{
//     alert("i touched")
//  })

//  let but = document.getElementById("btn")
//  but.addEventListener("dblclick", ()=>{
//     document.querySelector(".box").innerHTML="you were happy"
//  })

// let but = document.getElementById("btn")
// but.addEventListener("contextmenu", ()=>{
//    document.querySelector(".box").innerHTML="you were happy"
// })
// setInterval(() => {
//     document.querySelector(".class").Style.background = "#"+Math.floor((Math.random()*1000000)+1)
// }, 1000);
// const callback = (arg) => {
//   console.log(arg)
// }

// const loadscript = (src,callback) => {
//   let s = document.createElement("script")
//     s.src=src
//     s.onload=callback("dishu")
//     document.head.append(s)
// }
// loadscript("https://cdnjs.cloudflare.com/ajax/libs/prism/9000.0.1/prism.min.js",callback)
// console.log('this is promise');
// let prom1 = new Promise ((resolve,reject)=> {
//     let p = Math.random()
//     console.log(p)
//     if(p<0.5){
//         reject('no random no. was not supporting us sed op')
//     }
//     else{
//         setTimeout(() => {
//               console.log('yes i done');
//               resolve("lopu")
//         }, 1000);

//     }
// }
// )

// prom1.then((a) => {
//   console.log(a);
// }
// ).catch((err) => {
//   console.log(err);
  
// }
// )

// let prom2 = new Promise ((resolve,reject)=> {
//     let p = Math.random()
//     console.log(p)
//     if(p<0.5){
//         reject('htt bsdk...')
//     }
//     else{
//         setTimeout(() => {
//               console.log('yes i loveeee');
//               resolve("lompo")
//         }, 1000);

//     }
// }
// )
// let p3 = Promise.reject([prom1,prom2])
// p3.then((a) => {
//   console.log(a);
// }
// ).catch((err) => {
//   console.log(err);
  
// }
// )
//  async function getdata() {
//     let x =  await fetch('https://jsonplaceholder.typicode.com/todos/1')
//     let data = await x.json()
//     return data
// }
// async function getdata() {
//     return new Promise((resolve,reject) => {
//       setTimeout(() => {
//         resolve(2012)
//       }, 2000);
//     }
// )
// }
// async function main() {
//     console.log("hi see below")
//     let data = await getdata()
//     console.log(data)
    
// }
// main()
// let a = prompt("enter no.")
// let b = prompt("enter no.")
// if(isNaN(a) || isNaN(b)){
//     throw SyntaxError("jaa na lvde")
// }
// let sum = parseInt(a)+parseInt(b)
// function hellow() {
    
//     try{
//         console.log(sum*f)
//         return mm
//     }catch(error){
//     console.log("maafi hukum bhai")
//     return mm
//     }
//     finally{
//         console.log('yes i did it!!');
        
// }
// }
// let k = hellow()
// console.log(k);
// let a = {
//     eats:true
// }
// let b={
//     tummy:true
// }
// b.__proto__=a
// console.log(a);
// console.log(b);
// class animal{
//     constructor(name){
//         this.name=name
//         console.log('obj is created....');
        
//     }
//     eats(){
//         console.log('hlo kaise ho');
        
//     }
//     jumps(){
//         console.log('bhadwo ke khiladi');
        
//     }
// }
// class lion extends animal{
//     constructor(name){
//         super(name)
//         console.log('this one is lion....');
        
//     }
// }
// let a = new animal("chunu")
// console.log(a);
// let b= new lion("meera")
// console.log(b);
// important below
// async function wow() {
//     return new Promise((resolve,reject) => {
//       setTimeout(() => {
//         resolve(33)
//       }, 1000);
//     }
//     )
// }
// (async function main() {
    
//     let x= await wow()
//     console.log(x)
//     let y= await wow()
//     console.log(y)
// })()
// const a="the", b="me"
// const c={a,b}
// console.log(c);
// let[x,y,...rest]=[1,3,4,43,3,34,5]
// console.log(x,y,rest)
// let obj={
//     a:1,
//     b:2,
//     c:3
// }
// let{a,b}=obj
// console.log(obj)
function sum(a,b,c){
    return a+b+c
}
let arr=[1,5,3,4,5]
console.log(sum(...arr))


