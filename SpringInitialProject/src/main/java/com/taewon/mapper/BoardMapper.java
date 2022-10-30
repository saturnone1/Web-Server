package com.taewon.mapper;
import com.taewon.model.BoardVO;

import java.util.List;

public interface BoardMapper {
    /* 작가 등록 */
    public void enroll(BoardVO board);
    
    /* 게시판 목록 */
    public List<BoardVO> getList();
    
    /* 게시판 조회 */
    public BoardVO getPage(int bno);

    /* 게시판 수정 */
    public int modify(BoardVO board);

    /* 게시판 삭제 */
    public int delete(int bno);
}
