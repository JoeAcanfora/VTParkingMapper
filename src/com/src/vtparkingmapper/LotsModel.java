package com.src.vtparkingmapper;

import java.util.ArrayList;
import java.util.List;

import com.google.android.gms.maps.model.LatLng;

public class LotsModel {
    
    List<ParkingLot> lots;
    
    
    public LotsModel() {
        lots = new ArrayList<ParkingLot>();
        List<LatLng> wCD = new ArrayList<LatLng>();
        wCD.add(new LatLng(37.231396, -80.428725));
        wCD.add(new LatLng(37.23170370212619, -80.42803555727005));
        wCD.add(new LatLng(37.23084947245539, -80.42696535587311));
        wCD.add(new LatLng(37.229918351090596, -80.42818039655685));
        ParkingLot westCampusDrive = new ParkingLot(wCD, Credential.Pass.CARPOOLFS, 8, 5 + 12);
        lots.add(westCampusDrive);
        List<LatLng> bG = new ArrayList<LatLng>();
        bG.add(new LatLng(37.23172078662087, -80.42770564556122));
        bG.add(new LatLng(37.23137482484868, -80.42722016572952));
        bG.add(new LatLng(37.231955698030454, -80.42643561959267));
        bG.add(new LatLng(37.2323315547634, -80.42678765952587));
        ParkingLot behindGarage = new ParkingLot(bG, Credential.Pass.COMMUTER, 8, 5 + 12);
        lots.add(behindGarage);
        List<LatLng> gHL = new ArrayList<LatLng>();
        gHL.add(new LatLng(37.231635364108676, -80.4257744550705));
        gHL.add(new LatLng(37.23116553856154, -80.42518705129623));
        gHL.add(new LatLng(37.23228243722858, -80.42386338114738));
        ParkingLot goodwinHallLot = new ParkingLot(gHL, Credential.Pass.COMMUTER, 8, 5 + 12);
        lots.add(goodwinHallLot);
        List<LatLng> surge = new ArrayList<LatLng>();
        surge.add(new LatLng(37.232557922118964, -80.42395859956741));
        surge.add(new LatLng(37.23225253958304, -80.42305067181587));
        surge.add(new LatLng(37.23258141303202, -80.42261347174644));
        surge.add(new LatLng(37.23298396072317, -80.42378090322018));
        ParkingLot surgeLot = new ParkingLot(surge, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(surgeLot);
        List<LatLng> hanh = new ArrayList<LatLng>();
        hanh.add(new LatLng(37.227791250892956, -80.42647317051888));
        hanh.add(new LatLng(37.227156953376785, -80.4259816557169));
        hanh.add(new LatLng(37.22512801977121, -80.424380376935));
        hanh.add(new LatLng(37.22577568266661, -80.42465765029192));
        ParkingLot hanhLot = new ParkingLot(hanh, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(hanhLot);
        List<LatLng> slusher = new ArrayList<LatLng>();
        slusher.add(new LatLng(37.22558079705477, -80.42303994297981));
        slusher.add(new LatLng(37.22511413740591, -80.42302586138248));
        slusher.add(new LatLng(37.224821539265314, -80.42282737791538));
        slusher.add(new LatLng(37.225204372734815, -80.42261850088835));
        slusher.add(new LatLng( 37.22558506852563, -80.42263258248568));
        ParkingLot slusherLot = new ParkingLot(slusher, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(slusherLot);
        List<LatLng> dHL = new ArrayList<LatLng>();
        dHL.add(new LatLng(37.2246117008487, -80.42182993143797));
        dHL.add(new LatLng(37.22445739181868, -80.42168542742729));
        dHL.add(new LatLng(37.224950752452756, -80.42095050215721));
        dHL.add(new LatLng(37.22508957629177, -80.4211275279522));
        ParkingLot dietrickHallLot = new ParkingLot(dHL, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(dietrickHallLot);
        List<LatLng> wEL = new ArrayList<LatLng>();
        wEL.add(new LatLng(37.22316096992112, -80.42374938726425));
        wEL.add(new LatLng(37.22281496887627, -80.42359918355942));
        wEL.add(new LatLng(37.22313106865893, -80.4226604104042));
        wEL.add(new LatLng(37.223746177952115, -80.42294472455978));
        wEL.add(new LatLng(37.22357958634724, -80.42355626821518));
        wEL.add(new LatLng(37.22326776004651, -80.4234328866005));
        ParkingLot westEndLot = new ParkingLot(wEL, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(westEndLot);
        List<LatLng> bL1 = new ArrayList<LatLng>();
        bL1.add(new LatLng(37.22342367335803, -80.4253976047039));
        bL1.add(new LatLng(37.222817104690066, -80.42536273598671 ));
        bL1.add(new LatLng(37.22300932768328, -80.42475387454033));
        bL1.add(new LatLng(37.22352832731786, -80.42474582791328));
        ParkingLot bioishLot1 = new ParkingLot(bL1, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(bioishLot1);
        List<LatLng> bL2 = new ArrayList<LatLng>();
        bL2.add(new LatLng(37.223175920547774, -80.42562827467918));
        bL2.add(new LatLng(37.22292175949157, -80.42683526873589));
        bL2.add(new LatLng(37.22259284391214, -80.42704179883003));
        bL2.add(new LatLng(37.222765845142476, -80.42555585503578));
        ParkingLot bioishLot2 = new ParkingLot(bL2, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(bioishLot2);
        List<LatLng> bL3 = new ArrayList<LatLng>();
        bL3.add(new LatLng(37.22240061985746, -80.42771369218826));
        bL3.add(new LatLng(37.22143522052986, -80.42691439390182));
        bL3.add(new LatLng(37.22252449763771, -80.42565912008286));
        bL3.add(new LatLng(37.222659054306426, -80.42573556303978));
        ParkingLot bioishLot3 = new ParkingLot(bL3, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(bioishLot3);
        List<LatLng> bL4 = new ArrayList<LatLng>();
        bL4.add(new LatLng(37.2212429935249, -80.42616203427315));
        bL4.add(new LatLng(37.221089211568184, -80.42566582560539));
        bL4.add(new LatLng(37.22159113762963, -80.42528226971626));
        bL4.add(new LatLng(37.22167016398178, -80.42603865265846));
        ParkingLot bioishLot4 = new ParkingLot(bL4, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(bioishLot4);
        List<LatLng> bL5 = new ArrayList<LatLng>();
        bL5.add(new LatLng(37.22230664347464, -80.42494028806686));
        bL5.add(new LatLng(37.221815401386, -80.42484909296036));
        bL5.add(new LatLng(37.22211869035774, -80.42389959096909));
        bL5.add(new LatLng(37.22254158421212, -80.42410343885422));
        ParkingLot bioishLot5 = new ParkingLot(bL5, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(bioishLot5);
        List<LatLng> cage = new ArrayList<LatLng>();
        cage.add(new LatLng(37.22187093326076, -80.43049648404121));
        cage.add(new LatLng(37.220608640932646, -80.4296113550663));
        cage.add(new LatLng(37.22044845004036, -80.42985275387764));
        cage.add(new LatLng(37.21920535715328, -80.42894884943962));
        cage.add(new LatLng(37.21931215287924, -80.42871281504631));
        cage.add(new LatLng(37.218872153516486, -80.4269827902317));
        cage.add(new LatLng(37.219190405739575, -80.42631760239601));
        cage.add(new LatLng(37.22242624975972, -80.42862698435783));
        cage.add(new LatLng(37.22223188945015, -80.42910978198051));
        cage.add(new LatLng(37.22260138719208, -80.42932972311974));
        cage.add(new LatLng(37.22275730188116, -80.43001636862755));
        ParkingLot cageLot = new ParkingLot(cage, Credential.Pass.RESIDENT, 8, 5 + 12);
        lots.add(cageLot);
        List<LatLng> mccomas = new ArrayList<LatLng>();
        mccomas.add(new LatLng(37.221627447044945, -80.42147487401962));
        mccomas.add(new LatLng(37.22079019019925, -80.42148023843765));
        mccomas.add(new LatLng(37.22091834235965, -80.41969388723373));
        mccomas.add(new LatLng(37.22250313941424, -80.42021960020065));
        ParkingLot mccomasLot = new ParkingLot(mccomas, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
        lots.add(mccomasLot);
    }
    
    public List<ParkingLot> getLots() {
        return lots;
    }
}
