// // document.querySelector(".container").firstElementChild.style.backgroundColor="red"
// // document.querySelector(".container").lastElementChild.style.backgroundColor="red"

//  let e = document.getElementsByTagName("div")
//  let i = Math.random()
//  console.log(i)
//   if(i<=0.2){
//     e[1].style.color="white"
//     e[1].style.backgroundColor="red"
//     e[2].style.color="black"
//     e[2].style.backgroundColor="yellow"
//     e[3].style.color="pink"
//     e[3].style.backgroundColor="blue"
//     e[4].style.color="violet"
//     e[4].style.backgroundColor="green"
//     e[5].style.color="brown"
//     e[5].style.backgroundColor="pink"
//  }
//  else if(i<=0.4){
//     e[2].style.color="white"
//     e[2].style.backgroundColor="red"
//     e[3].style.color="black"
//     e[3].style.backgroundColor="yellow"
//     e[4].style.color="pink"
//     e[4].style.backgroundColor="blue"
//     e[5].style.color="violet"
//     e[5].style.backgroundColor="green"
//     e[1].style.color="brown"
//     e[1].style.backgroundColor="pink"
//  }
//  else if(i<=0.6){
//     e[3].style.color="white"
//     e[3].style.backgroundColor="red"
//     e[4].style.color="black"
//     e[4].style.backgroundColor="yellow"
//     e[5].style.color="pink"
//     e[5].style.backgroundColor="blue"
//     e[1].style.color="violet"
//     e[1].style.backgroundColor="green"
//     e[2].style.color="brown"
//     e[2].style.backgroundColor="pink"
//  }
//  else if(i<=0.8) {
//     e[4].style.color="white"
//     e[4].style.backgroundColor="red"
//     e[5].style.color="black"
//     e[5].style.backgroundColor="yellow"
//     e[1].style.color="pink"
//     e[1].style.backgroundColor="blue"
//     e[2].style.color="violet"
//     e[2].style.backgroundColor="green"
//     e[3].style.color="brown"
//     e[3].style.backgroundColor="pink"
//  }
//  else{
//     e[5].style.color="white"
//     e[5].style.backgroundColor="red"
//     e[1].style.color="black"
//     e[1].style.backgroundColor="yellow"
//     e[2].style.color="pink"
//     e[2].style.backgroundColor="blue"
//     e[3].style.color="violet"
//     e[3].style.backgroundColor="green"
//     e[4].style.color="brown"
//     e[4].style.backgroundColor="pink"
//  }

groom=document.querySelectorAll(".groom")
;for(let i=0;i<groom.length;i++){
cur_groom=groom[i];
rand_bg="#"+Math.floor((Math.random()*1000000)+1);
cur_groom.style.backgroundColor=rand_bg;
}