async function getUniversities(){
    try{
        const unidata = document.getElementById("uniname").value.trim();
        const resultDiv = document.getElementById("result");
        if (unidata === "") {
            resultDiv.innerHTML = "<p>Please enter a country name.</p>";
            return;
        }
    
        const response = await fetch(`http://universities.hipolabs.com/search?country=${unidata}`);
        if(!response.ok){
            throw new Error("Could not fetch data")
        }
        const data = await response.json();
        if (data.length === 0) {
            resultDiv.innerHTML = "<p>No universities found.</p>";
            return;
        }

        let output = "<ul>";
        data.forEach(uni => {
            output += `
                <li>
                    <strong>${uni.name}</strong><br>
                    Country: ${uni.country}<br>
                    Website: 
                    <a href="${uni.web_pages[0]}" target="_blank">
                        ${uni.web_pages[0]}
                    </a>
                </li><br>
            `;
        });
        output += "</ul>";

        resultDiv.innerHTML = output;
    }
    catch(error){
        console.error(error)
        document.getElementById("result").innerHTML =
            "<p>Error fetching university data.</p>";
    }
}