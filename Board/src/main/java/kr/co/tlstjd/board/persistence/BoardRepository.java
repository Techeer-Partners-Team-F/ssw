package kr.co.tlstjd.board.persistence;

import org.springframework.data.repository.CrudRepository;

import kr.co.tlstjd.board.bean.Board;

public interface BoardRepository extends CrudRepository<Board, Long> {

}
