let result = new Array();
function fibonacci(number) {
    if(result[number]) return result[number];
    if(number == 0) return 0;
    if(number == 1) return 1;
    result[number] = fibonacci(number - 1 ) + fibonacci(number - 2);
    return result[number];
}

console.log(" fib number: ",  fibonacci(100));

