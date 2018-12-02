function subsetSumPair(arr, targetSum) {
	let compliments = new Set();
	for(let item of arr) {
		if(compliments.has(item)) {
			console.log("pair", item, targetSum - item);
			return;
		} else {
			compliments.add(targetSum - item);
		}
	}
	console.log("not found");
}

let arr = [2,4,1,5,8];
subsetSumPair(arr, 7);
subsetSumPair(arr, 5);
subsetSumPair(arr, 11);