function findBiggestNumber(arr) {
    
    let data = arr.reduce((accumulator, item) => {
        return String(accumulator) + item > String(item) + accumulator ? String(accumulator) + item : String(item) + accumulator;
    });

    console.log(data);
}

findBiggestNumber([54, 546, 548, 60]);