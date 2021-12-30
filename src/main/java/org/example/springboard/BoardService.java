package org.example.springboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardMapper mapper;

    public int insBoard(BoardEntity entity) {
        int result = 0;

        try {
            result = mapper.insBoard(entity);
        } catch (Exception e) { e.printStackTrace(); }
        return result;
    }
    public List<BoardEntity> selBoardList() {
        return mapper.selBoardList();
    }

    public BoardEntity selBoard(BoardEntity entity) {
        return mapper.selBoard(entity);
    }

    public int updBoard(BoardEntity entity) {
        try {
            return mapper.updBoard(entity);
        } catch (Exception e) { e.printStackTrace(); }
        return 0;
    }

    // 조회수 올리기
    public void updBoardHitsUp(BoardEntity entity) {
        entity.setHits(1);
        //mapper.updBoard(entity);
        updBoard(entity);
    }

    public int delBoard(BoardEntity entity) {
        try { return mapper.delBoard(entity);}
        catch (Exception e) { e.printStackTrace(); }
        return 0;
    }
}
