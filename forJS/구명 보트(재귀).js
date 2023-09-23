function solution(people, limit) {
  let boat = 0;

  function method(list) {
    let finish = false;
    if (list.length === 0) {
      return;
    }
    for (let i = 1; i < list.length; i++) {
      if (list[0] + list[i] <= limit) {
        boat += 1;
        list.splice(i, 1);
        list.shift();
        finish = true;
        break;
      }
    }
    if (!finish) {
      list.shift();
      boat += 1;
    }
    method(list);
  }

  const sorted = people.slice().sort((a, b) => b - a);
  method(sorted);

  return boat;
}

//shift() 는 배열의 첫번째 요소를 제거하고 제거한 값을 반환함
