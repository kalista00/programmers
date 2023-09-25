function solution(n) {
    let result = "";
    const array = ["박", "수", "박"];
    for (let i = 1; i <= n; i++) {
        result += array[i % 2];
    }
    return result;
}
