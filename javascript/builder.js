function formatViews(views) {
    if (views >= 1000000) {
        return (views / 1000000).toFixed(1) + 'M';
    } else if (views >= 1000) {
        return (views / 1000).toFixed(1) + 'k';
    } else {
        return views.toString();
    }
}

function container(title, cname, views, monthsold, duration , thumbnail) {
    document.body.style.margin = "5px";
    document.body.style.paddingLeft = "200px";
    
    let div2 = document.createElement("div");
    div2.className = "container";
    div2.style.backgroundColor = "black";
    div2.style.height = "110px";
    div2.style.width = "65%";
    div2.style.display = "flex";
    div2.style.justifyContent = "flex-start";
    div2.style.alignItems = "center";
    div2.style.paddingLeft = "20px";
    div2.style.position = "relative";
    div2.style.marginBottom = "20px";
    div2.style.borderRadius="5px"
    
    let div6 = document.createElement("img");
    div6.className = "card";
    div6.src = thumbnail;
    div6.style.padding = "10px";
    div6.style.height = "100px";
    div6.style.width = "170px";
    div6.style.marginRight = "20px";
    div6.style.borderRadius="22px"
    
    let contentDiv = document.createElement("div");
    contentDiv.style.flexGrow = "1";
    contentDiv.style.display = "flex";
    contentDiv.style.flexDirection = "column";
    contentDiv.style.justifyContent = "space-between";
    contentDiv.style.height = "100%";
    
    let titleDiv = document.createElement("div");
    titleDiv.className = "card";
    titleDiv.innerText = title;
    titleDiv.style.color = "white";
    titleDiv.style.fontSize = "20px";
    titleDiv.style.marginBottom = "10px";
    
    let bottomDiv = document.createElement("div");
    bottomDiv.style.display = "flex";
    bottomDiv.style.justifyContent = "flex-start"
    bottomDiv.style.alignItems = "center";
    bottomDiv.style.width = "100%";
    
    let div1 = document.createElement("div");
    div1.className = "card";
    div1.innerText = cname;
    div1.style.padding = "1px";
    div1.style.color = "rgba(255, 255, 255, 0.888)";
    div1.style.width = "110px";
    div1.style.marginBottom = "50px";
    
    let div3 = document.createElement("div");
    div3.className = "card";
    div3.innerText = formatViews(views)+ " views   • ";
    div3.style.color = "rgba(255, 255, 255, 0.888)";
    div3.style.marginBottom = "50px";
    
    let div4 = document.createElement("div");
    div4.className = "card";
    div4.innerText = monthsold + " months ago";
    div4.style.padding = "5px";
    div4.style.color = "rgba(255, 255, 255, 0.888)";
    div4.style.marginBottom = "50px";
    
    let div5 = document.createElement("div");
    div5.className = "card";
    div5.innerText = duration;
    div5.style.paddingBottom = "3px";
    div5.style.color = "white";
    div5.style.fontWeight = "bolder";
    div5.style.backgroundColor = "rgba(0, 0, 0, 0.34)";
    div5.style.textAlign = "center";
    div5.style.position="absolute"
    div5.style.width="50px"
    div5.style.height="17px"
    div5.style.right="687px"
    div5.style.borderRadius="5px"
    
    bottomDiv.appendChild(div1);
    bottomDiv.appendChild(div3);
    bottomDiv.appendChild(div4);
    bottomDiv.appendChild(div5);
    
    contentDiv.appendChild(titleDiv);
    contentDiv.appendChild(bottomDiv);
    
    div2.appendChild(div6);
    div2.appendChild(contentDiv);
    
    document.body.appendChild(div2);
}

container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #13", "Code with Me  •",254000,9 , "21:22", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");
container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #14", "Code with Me  •",4000000,18 , "20:00", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");
container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #15", "Code with Me  •",25000,9 , "21:22", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");
container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #16", "Code with Me  •",254000,9 , "21:22", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");
container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #17", "Code with Me  •",25400,9 , "21:22", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");
container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #18", "Code with Me  •",2540,9 , "21:22", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");
container("Installing VS Code & How Websites Work | Sigma Web Development Course - Tutorial #19", "Code with Me  •",254,2, "21:22", "https://i.ytimg.com/vi/KB7GzBv5p4Q/hqdefault.jpg?sqp=-oaymwEbCKgBEF5IVfKriqkDDggBFQAAiEIYAXABwAEG&rs=AOn4CLDVLIUfmrskNAha1yNa-7ygsEeNEA");

