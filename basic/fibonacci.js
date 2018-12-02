let result = new Array();

// Top Down Memoized Version
function fibonacci_memoized(number) {
    if(result[number]) return result[number];
    if(number == 0) return 0;
    if(number == 1) return 1;
    result[number] = fibonacci_memoized(number - 1 ) + fibonacci_memoized(number - 2);
    return result[number];
}

// Bottom Up DP
function fibonacci_bottom_up(number) {
    let fib = new Array();
    fib[0] = 0;
    fib[1] = 1;
    fib[2] = 1;
    for(let i = 3; i <= number; i++) {
        fib[i] = fib[i-1] + fib[i-2];
    }
    return fib[number];
}

console.log(" fib number: ",  fibonacci_memoized(100));
console.log(" fib number bottom up: ",  fibonacci_bottom_up(100));

