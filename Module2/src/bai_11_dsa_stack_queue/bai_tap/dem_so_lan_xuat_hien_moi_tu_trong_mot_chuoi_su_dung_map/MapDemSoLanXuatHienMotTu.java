package bai_11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien_moi_tu_trong_mot_chuoi_su_dung_map;

import java.util.*;

public class MapDemSoLanXuatHienMotTu {

        public static void main(String[] args){
            String str = "TreeMap dem so lan tu xuat hien hien";
            str = str.replaceAll(",","");
            String[] arr = str.split(" ");
            String key="";
            Integer value;
            TreeMap<String, Integer> map = new TreeMap<String, Integer>();
            for(int i=0;i<arr.length;i++){
                key = arr[i];
                if(map.containsKey(key)){
                    value = map.get(key);
                    map.remove(key);
                    map.put(key, value+1);
                } else{
                    map.put(key, 1);
                }
            }

            Set set=map.keySet();
            Iterator i = set.iterator();

            while(i.hasNext()){
                key=(String)i.next();
                System.out.println("Từ '"+key+"' xuất hiện "+map.get(key)+" lần");
            }
        }
    }

