//  async function getdata(data) {
//      let html = `<div class="box">
//      ${data} 
//      </div>`
//      return new Promise((resolve,reject) => {
//          setTimeout(() => {
//              resolve(data)
//             }, 1000);
//         }
//     )
//     document.querySelector(".container").innerHTML=document.querySelector(".container").innerHTML + html
// }
// async function main() {
//      await getdata("  initialize hacking...  ")
//      await getdata("reading your files...")
//      await getdata("  pswrd files detected...  ")
//      await getdata("  sending all password and personal files to server...  ")
//      await getdata("  cleaning up... ")
    
// }
// main()
function getRandomDelay(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

async function hecker(data) {
    let randomDelay = getRandomDelay(1000, 7000);
    console.log(`Random delay: ${randomDelay} ms`);
    return new Promise((resolve) => {
        setTimeout(() => {
            let html = `<div class="box">
                        <h3>${data}<span class="dots"></span></h3>
                        </div>`;
            document.querySelector(".container").innerHTML += html;
            resolve();
        }, randomDelay);
    });
}

async function main() {
    const messages = [
        "Initializing data",
        "Reading your files",
        "Password Files detected",
        "Sending all Password and Personal files to server",
        "Cleaning up"
    ];

    for (let i = 0; i < messages.length; i++) {
        await hecker(messages[i]);
        let dots = document.querySelectorAll('.dots')[i];
        setInterval(() => {
            if (dots.innerText.length >= 3) {
                dots.innerText = '';
            } else {
                dots.innerText += '.';
            }
        }, 500);
    }
}

main();