public class MemberGold extends Member implements CanRequestDelivery, CanRequestCicilan {

    @Override
    public Integer hitungTotalBayar(Integer totalBayar) {
        if (totalBayar >= 500000 && totalBayar <= 1000000){
            totalBayar = totalBayar - totalBayar * 2/100;
            this.totalBayar = totalBayar;
        }
        if (totalBayar > 1000000 && totalBayar <= 7000000){
            totalBayar = totalBayar - totalBayar * 4/100;
            this.totalBayar = totalBayar;
        }
        else if (totalBayar > 7000000){
            totalBayar =  totalBayar - totalBayar * 6/100;
            this.totalBayar = totalBayar;
        }
        
        this.totalBayar = totalBayar;
        return this.totalBayar;
    }

    @Override
    public Integer hitungOngkir(Double jarakTujuan) {
        Integer hargaOngkir = 0;
        if (jarakTujuan >= 7.0){
            for (Integer i = 7; i < jarakTujuan; i = i + 1){
                hargaOngkir = hargaOngkir + 1000;
            }
        }
        return hargaOngkir;
    }

    @Override
    public Integer hitungCicilanPerBulan(Integer totalBelanja, Integer jumlahBulan) {
       
        throw new UnsupportedOperationException("Unimplemented method 'hitungCicilanPerBulan'");
    }


    
}