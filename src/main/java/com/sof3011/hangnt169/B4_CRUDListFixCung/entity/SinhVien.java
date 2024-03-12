package com.sof3011.hangnt169.B4_CRUDListFixCung.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor // contructor full
@NoArgsConstructor // contructor k tham so
@Builder //contructor tuy y
//@Data => Cam dung
public class SinhVien {

    private String mssv;

    private String ten;

    private String diaChi;

    private boolean gioiTinh;

    private int tuoi;

}
