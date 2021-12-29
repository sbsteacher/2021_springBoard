/*
삭제버튼 누르면 "삭제하시겠습니까" confirm창이 나타나고
긍정을 눌렀을 때 삭제 처리를 한다.
    주소 이동 /board/del?iboard=글 pk값 시켜주면 된다.
*/

const btnContainerElem = document.querySelector('#btnContainer');
const btnDelElem = btnContainerElem.querySelector('#btnDel');
btnDelElem.addEventListener('click', function() {
    // console.log(btnContainerElem.getAttribute('iboard'));
    if(confirm('삭제하시겠습니까?')) {
        location.href = '/board/del?iboard=' + btnContainerElem.dataset.iboard;
    }
});



