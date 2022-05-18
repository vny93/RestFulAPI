package com.example.APIdemo.Repositories;

import com.example.APIdemo.BangLaiXe.Cauhoi;
import com.example.APIdemo.DTO.CauhoiDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CauhoiRepository extends JpaRepository<Cauhoi, Integer> {
    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT * FROM Cauhoi e ORDER BY newid()")
    List<Cauhoi> findCauHoi();

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT c.* FROM KETQUA e,CAUHOI c WHERE e.MACAUHOI = c.MACAUHOI and e.LUOTTHI =:luotthi and e.MAUSER=:email " +
            "and c.MABODE =:mabode")
    List<Cauhoi> getKQ_Cauhoi(@Param("email") String email,@Param("luotthi") Integer luotthi,@Param("mabode") Integer mabode);

    @Modifying
    @Transactional
    @Query(nativeQuery = true,value = "SELECT c.* FROM KETQUA e,CAUHOI c WHERE e.MACAUHOI = c.MACAUHOI and e.MAUSER=:email " +
            "and c.MABODE =:mabode")
    List<Cauhoi> getCauHoi(@Param("email") String email,@Param("mabode") Integer mabode);
}