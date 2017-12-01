Array.prototype.quickSort = function() {
	var r = this;
	if (this.length <= 1) {
		return this;
	}

	var smaller = [];
	var bigger = [];
	var pivot = r.splice(Math.floor(r.length/2),1);

	for (var i = r.length - 1; i >= 0; i--) {
		if (r[i] <= pivot) {
			smaller.push(r[i]);
		} else {
			bigger.push(r[i]);
		}
	}
	var combined = [];

	return combined.concat(smaller.quickSort(), pivot, bigger.quickSort());
};

var arr = [5, 7, 4, 2, 9, 66, 22, 6, 11, 33];
console.log("Original Array");
console.log(arr);
console.log("Sorted Array");
console.log(arr.quickSort());