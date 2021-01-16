

/*
 * Complete the vowelsAndConsonants function.
 * Print your output using 'console.log()'.
 */
function vowelsAndConsonants(s) {
    
    let v = ['a', 'e', 'i', 'o', 'u'];

    for(let vowel of s){
        if(v.indexOf(vowel)!=-1){
            console.log(vowel);
        }
    }
    for(let vowel of s){
        if(v.indexOf(vowel)==-1){
            console.log(vowel);
        }
    }

    
    
}

