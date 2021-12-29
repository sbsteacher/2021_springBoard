function moveToDetail(iboard) {
    location.href='/board/detail?iboard=' + iboard;
}

function setEvent(tr) {
    tr.addEventListener('click', function() {
        console.log(tr.dataset.iboard);
        moveToDetail(tr.dataset.iboard);
    });
}

var trList = document.querySelectorAll('.record');
for(var i=0; i<trList.length; i++) {
    setEvent(trList[i]);
}



