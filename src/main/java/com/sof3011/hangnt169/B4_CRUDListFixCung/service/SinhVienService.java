package com.sof3011.hangnt169.B4_CRUDListFixCung.service;

import com.sof3011.hangnt169.B4_CRUDListFixCung.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {

    private List<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienService() {
        // Fake du lieu vao day
        listSinhVien.add(new SinhVien("SV1", "Thanh", "Thai binh", true, 21));
        listSinhVien.add(new SinhVien("SV2", "Thanh1", "Thai hgsdbinh", true, 21));
        listSinhVien.add(new SinhVien("SV3", "Thanh2", "Thai hsgbinh", false, 21));
        listSinhVien.add(new SinhVien("SV4", "Than3", "Thai sfdhbinh", true, 20));
        listSinhVien.add(new SinhVien("SV5", "Thanh4", "Thaifsdh binh", false, 21));
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }

    public SinhVien detail(String mssv) {
        for (SinhVien sv : listSinhVien) {
            if (sv.getMssv().equals(mssv)) {
                return sv;
            }
        }
        return null;
    }

    public void xoaSinhVien(String mssv) {
//        for (SinhVien sv : listSinhVien) {
//            if (sv.getMssv().equals(mssv)) {
//                listSinhVien.remove(sv);
//            }
//        }
        for (int i = 0; i < listSinhVien.size(); i++) {
            if (listSinhVien.get(i).getMssv().equals(mssv)) {
                listSinhVien.remove(i);
            }
        }
    }

}
