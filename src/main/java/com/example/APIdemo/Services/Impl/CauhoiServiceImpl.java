package com.example.APIdemo.Services.Impl;

import com.example.APIdemo.BangLaiXe.Cauhoi;
import com.example.APIdemo.BangLaiXe.Ketqua;
import com.example.APIdemo.DTO.CauhoiDTO;
import com.example.APIdemo.Mapper.CauhoiMapper;
import com.example.APIdemo.Repositories.CauhoiRepository;
import com.example.APIdemo.Repositories.KetquaRepository;
import com.example.APIdemo.Services.CauhoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CauhoiServiceImpl implements CauhoiService {
    @Autowired
    private CauhoiRepository cauhoiRepository;

    @Autowired
    private KetquaRepository ketquaRepository;

    @Override
    public List<CauhoiDTO> getListCauhoi(){
        List<CauhoiDTO> result = new ArrayList<CauhoiDTO>();
        List<Cauhoi> cauhois = cauhoiRepository.findAll();
        for(Cauhoi cauhoi : cauhois){
            result.add(CauhoiMapper.toCauhoiDTO(cauhoi));
        }
        return result;
    }

    @Override
    public CauhoiDTO getCauhoiById(Integer id) {
        List<Cauhoi> cauhois = cauhoiRepository.findAll();
        for(Cauhoi cauhoi : cauhois){
            if(cauhoi.getMacauhoi().equals(id)){
                return CauhoiMapper.toCauhoiDTO(cauhoi);
            }
        }
        return null;
    }

    @Override
    public List<CauhoiDTO> getCauHoiLT(Integer maBoDe, Integer maLoailt) {
        List<Cauhoi> cauhois = cauhoiRepository.findAll();
        List<CauhoiDTO> list = new ArrayList<>();
        for(Cauhoi cauhoi : cauhois){
            if((cauhoi.getMaBoDe().getMabodethi())==maBoDe && (cauhoi.getMaLoaiLiThuyet().getMaLoaiLiThuyet())==maLoailt){
                list.add(CauhoiMapper.toCauhoiDTO(cauhoi));
            }
        }
        return list;
    }

    @Override
    public List<CauhoiDTO> randCauHoi(Integer maBoDe) {
        List<Cauhoi> cauhois = cauhoiRepository.findCauHoi();
        List<CauhoiDTO> list = new ArrayList<>();
        for(Cauhoi cauhoi : cauhois){
            if(cauhoi.getMaBoDe().getMabodethi()==maBoDe) {
                list.add(CauhoiMapper.toCauhoiDTO(cauhoi));
            }
        }
        return list;
    }

    @Override
    public List<CauhoiDTO> getKQ_Cauhoi(String email,Integer luotthi,Integer maBoDe) {
        List<Cauhoi> cauhois = cauhoiRepository.getKQ_Cauhoi(email,luotthi,maBoDe);
        List<CauhoiDTO> list = new ArrayList<>();
        for(Cauhoi cauhoi : cauhois){
            list.add(CauhoiMapper.toCauhoiDTO(cauhoi));
        }
        return list;
    }

    @Override
    public List<CauhoiDTO> getCausai(String email, Integer maBoDe){
        List<Cauhoi> cauhois = cauhoiRepository.getCauHoi(email,maBoDe);
        List<CauhoiDTO> list = new ArrayList<>();
        List<Ketqua> ketquas = ketquaRepository.findAll();
        for(int i =0;i< cauhois.size();i++){
            if(!(cauhois.get(i).getDapan().trim().equals(ketquas.get(i).getPhuongan().trim())))
                list.add(CauhoiMapper.toCauhoiDTO(cauhois.get(i)));
        }
        return list;
    }

}
