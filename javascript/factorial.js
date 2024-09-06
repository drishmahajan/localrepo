arr=[1,2,3,4,5,6]
console.log(arr)
const array=(a,b)=>{
    return a*b
}
let element = 1
console.log(arr.reduce(array))
for (let i = 1; i <= arr.length; i++) {
     element = element*i
}
console.log(element)
