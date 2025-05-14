async function makeRequest(url, isJson) {
    try {
        console.log("performing request to: " + url);
        const response = await fetch(url, {
            method: "GET",
            headers: {
                "origin": 'local'
            }
        });
        if(!response.ok) {
            throw new Error("Error during perform request to: " + url);
        }
        return await (isJson ? response.json() : response.text());
    } catch (error) {
        console.log(error);
        throw error;
    }
}

(async () => {

    selic = await makeRequest('https://www.bcb.gov.br/api/servico/sitebcb/historicotaxasjuros',true);

    document.getElementById("SELIC").textContent = selic.conteudo[0].MetaSelic + '%';

    inflacao = await makeRequest("https://www.ibge.gov.br/explica/inflacao.php",false);

    inf = new DOMParser().parseFromString(inflacao, "text/html").querySelectorAll("#dadoBrasil li")[1].children[1].textContent;
    document.getElementById("IPCA").textContent = inf;

    poupanca = await makeRequest("https://cors-anywhere.herokuapp.com/https://www4.bcb.gov.br/pec/poupanca/poupanca.asp",false);
    poup = new DOMParser().parseFromString(poupanca, "text/html").getElementsByTagName("td");

    document.getElementById("TR").textContent = poup[poup.length - 3].textContent.trim() + '%';
    document.getElementById("Poupanca").textContent = poup[poup.length - 1].textContent.trim() + '%';
})();