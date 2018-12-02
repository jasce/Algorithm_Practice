function nonRepeatingChar(str) {
    let characters = str.split("");
    // for(let index in characters) {
    //     let character = characters[index]
    //     if(characters.indexOf(character) == index && characters.indexOf(character, index+1) == -1) {
    //         return character;
    //     }
    // }
    // return null;

    let data=[];
    
    for(let character of characters) {
        data[character] = data[character] ? ++data[character] : 1;
    }

    for(let index in data) {
        if(data[index] == 1) {
            return index;
        }
    }

}

console.log(nonRepeatingChar("HHelloWorldH"));
