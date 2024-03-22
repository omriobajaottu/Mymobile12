package com.example.mymobile;

import java.util.ArrayList;

public class wirehouse {
    private static String [] namahotel = {


        "horison",
    "aston",

};
    private static String [] lokasi = {
            "jayapura",
            "jayapura",

    };
    private static int [] image = {
            R.drawable.suni_hotel,
            R.drawable.suni_hotel,


    };

    static ArrayList<data_hotel>  getlistdata () {
        ArrayList<data_hotel> list = new ArrayList <> ();
        for (int position = 0; position <namahotel.length; position++) {
            data_hotel data_hotel = new data_hotel ();
            data_hotel.setNama(namahotel[position]);
            data_hotel.setLokasi(lokasi[position]);
            data_hotel.setImage(image[position]);
            list.add(data_hotel);



        }
        return list;
    }



    }