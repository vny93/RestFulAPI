package com.example.APIdemo.Services;

import com.example.APIdemo.BangLaiXe.Cauhoi;
import com.example.APIdemo.DTO.CauhoiDTO;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public interface CauhoiService {

    List<CauhoiDTO> getListCauhoi();

    CauhoiDTO getCauhoiById(Integer id);

    List<CauhoiDTO> getCauHoiLT(Integer maBoDe, Integer maLoailt);

    List<CauhoiDTO> randCauHoi(Integer maBoDe);

    List<CauhoiDTO> getKQ_Cauhoi(String email,Integer luotthi, Integer mabode);

    List<CauhoiDTO> getCausai(String email, Integer maBoDe);

    // List<CauhoiDTO> randCauHoi2(Integer maBoDe);
}
