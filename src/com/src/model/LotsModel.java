package com.src.model;

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
        ParkingLot westCampusDrive = new ParkingLot(wCD, Credential.Pass.CARPOOLFS, 8, 5 + 12, 
                "West Campus Drive", "Commuter Lot");
        lots.add(westCampusDrive);
        List<LatLng> bG = new ArrayList<LatLng>();
        bG.add(new LatLng(37.23172078662087, -80.42770564556122));
        bG.add(new LatLng(37.23137482484868, -80.42722016572952));
        bG.add(new LatLng(37.231955698030454, -80.42643561959267));
        bG.add(new LatLng(37.2323315547634, -80.42678765952587));
        ParkingLot behindGarage = new ParkingLot(bG, Credential.Pass.COMMUTER, 8, 5 + 12,
                "West Campus Drive", "Commuter Lot Behind Garage");
        lots.add(behindGarage);
        List<LatLng> gHL = new ArrayList<LatLng>();
        gHL.add(new LatLng(37.231635364108676, -80.4257744550705));
        gHL.add(new LatLng(37.23116553856154, -80.42518705129623));
        gHL.add(new LatLng(37.23228243722858, -80.42386338114738));
        ParkingLot goodwinHallLot = new ParkingLot(gHL, Credential.Pass.COMMUTER, 8, 5 + 12,
                "Goodwin Hall Lot", "");
        lots.add(goodwinHallLot);
        List<LatLng> surge = new ArrayList<LatLng>();
        surge.add(new LatLng(37.232557922118964, -80.42395859956741));
        surge.add(new LatLng(37.23225253958304, -80.42305067181587));
        surge.add(new LatLng(37.23258141303202, -80.42261347174644));
        surge.add(new LatLng(37.23298396072317, -80.42378090322018));
        ParkingLot surgeLot = new ParkingLot(surge, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Lower Stanger Lot", "Surge Lot");
        lots.add(surgeLot);
        List<LatLng> hanh = new ArrayList<LatLng>();
        hanh.add(new LatLng(37.227791250892956, -80.42647317051888));
        hanh.add(new LatLng(37.227156953376785, -80.4259816557169));
        hanh.add(new LatLng(37.22512801977121, -80.424380376935));
        hanh.add(new LatLng(37.22577568266661, -80.42465765029192));
        ParkingLot hanhLot = new ParkingLot(hanh, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Hanh Lot", "");
        lots.add(hanhLot);
        List<LatLng> slusher = new ArrayList<LatLng>();
        slusher.add(new LatLng(37.22558079705477, -80.42303994297981));
        slusher.add(new LatLng(37.22511413740591, -80.42302586138248));
        slusher.add(new LatLng(37.224821539265314, -80.42282737791538));
        slusher.add(new LatLng(37.225204372734815, -80.42261850088835));
        slusher.add(new LatLng( 37.22558506852563, -80.42263258248568));
        ParkingLot slusherLot = new ParkingLot(slusher, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "AG Quad Lot", "Slusher Lot");
        lots.add(slusherLot);
        List<LatLng> dHL = new ArrayList<LatLng>();
        dHL.add(new LatLng(37.2246117008487, -80.42182993143797));
        dHL.add(new LatLng(37.22445739181868, -80.42168542742729));
        dHL.add(new LatLng(37.224950752452756, -80.42095050215721));
        dHL.add(new LatLng(37.22508957629177, -80.4211275279522));
        ParkingLot dietrickHallLot = new ParkingLot(dHL, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Dietrick Lot", "");
        lots.add(dietrickHallLot);
        List<LatLng> wEL = new ArrayList<LatLng>();
        wEL.add(new LatLng(37.22316096992112, -80.42374938726425));
        wEL.add(new LatLng(37.22281496887627, -80.42359918355942));
        wEL.add(new LatLng(37.22313106865893, -80.4226604104042));
        wEL.add(new LatLng(37.223746177952115, -80.42294472455978));
        wEL.add(new LatLng(37.22357958634724, -80.42355626821518));
        wEL.add(new LatLng(37.22326776004651, -80.4234328866005));
        ParkingLot westEndLot = new ParkingLot(wEL, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Engel Lot", "West End Lot");
        lots.add(westEndLot);
        List<LatLng> bL1 = new ArrayList<LatLng>();
        bL1.add(new LatLng(37.22342367335803, -80.4253976047039));
        bL1.add(new LatLng(37.222817104690066, -80.42536273598671 ));
        bL1.add(new LatLng(37.22300932768328, -80.42475387454033));
        bL1.add(new LatLng(37.22352832731786, -80.42474582791328));
        ParkingLot bioishLot1 = new ParkingLot(bL1, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Litton Reaves Lot", "");
        lots.add(bioishLot1);
        List<LatLng> bL2 = new ArrayList<LatLng>();
        bL2.add(new LatLng(37.223175920547774, -80.42562827467918));
        bL2.add(new LatLng(37.22292175949157, -80.42683526873589));
        bL2.add(new LatLng(37.22259284391214, -80.42704179883003));
        bL2.add(new LatLng(37.222765845142476, -80.42555585503578));
        ParkingLot bioishLot2 = new ParkingLot(bL2, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Litton Reaves Lot", "");
        lots.add(bioishLot2);
        List<LatLng> bL3 = new ArrayList<LatLng>();
        bL3.add(new LatLng(37.22240061985746, -80.42771369218826));
        bL3.add(new LatLng(37.22143522052986, -80.42691439390182));
        bL3.add(new LatLng(37.22252449763771, -80.42565912008286));
        bL3.add(new LatLng(37.222659054306426, -80.42573556303978));
        ParkingLot bioishLot3 = new ParkingLot(bL3, Credential.Pass.COMMUTER, 8, 5 + 12,
                "Litton Reaves Lot", "");
        lots.add(bioishLot3);
        List<LatLng> bL4 = new ArrayList<LatLng>();
        bL4.add(new LatLng(37.2212429935249, -80.42616203427315));
        bL4.add(new LatLng(37.221089211568184, -80.42566582560539));
        bL4.add(new LatLng(37.22159113762963, -80.42528226971626));
        bL4.add(new LatLng(37.22167016398178, -80.42603865265846));
        ParkingLot bioishLot4 = new ParkingLot(bL4, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Litton Reaves Lot", "");
        lots.add(bioishLot4);
        List<LatLng> bL5 = new ArrayList<LatLng>();
        bL5.add(new LatLng(37.22230664347464, -80.42494028806686));
        bL5.add(new LatLng(37.221815401386, -80.42484909296036));
        bL5.add(new LatLng(37.22211869035774, -80.42389959096909));
        bL5.add(new LatLng(37.22254158421212, -80.42410343885422));
        ParkingLot bioishLot5 = new ParkingLot(bL5, Credential.Pass.RESIDENT, 8, 5 + 12,
                "Wallace Lot", "");
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
        ParkingLot cageLot = new ParkingLot(cage, Credential.Pass.RESIDENT, 8, 5 + 12,
                "Duck Pond Road Lot R", "The Cage");
        lots.add(cageLot);
        List<LatLng> mccomas = new ArrayList<LatLng>();
        mccomas.add(new LatLng(37.221627447044945, -80.42147487401962));
        mccomas.add(new LatLng(37.22079019019925, -80.42148023843765));
        mccomas.add(new LatLng(37.22091834235965, -80.41969388723373));
        mccomas.add(new LatLng(37.22250313941424, -80.42021960020065));
        ParkingLot mccomasLot = new ParkingLot(mccomas, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Coliseum Lot", "McComas Lot");
        lots.add(mccomasLot);
        //------------------
//        List<LatLng> mccomas = new ArrayList<LatLng>();
//        mccomas.add(new LatLng(37.221627447044945, -80.42147487401962));
//        mccomas.add(new LatLng(37.22079019019925, -80.42148023843765));
//        mccomas.add(new LatLng(37.22091834235965, -80.41969388723373));
//        mccomas.add(new LatLng(37.22250313941424, -80.42021960020065));
//        ParkingLot mccomasLot = new ParkingLot(mccomas, Credential.Pass.FACILITYSTAFF, 8, 5 + 12);
//        lots.add(mccomasLot);



        List<LatLng> duckpond1 = new ArrayList<LatLng>();
        duckpond1.add(new LatLng(37.223212229200165, -80.42951613664627));
        duckpond1.add(new LatLng(37.222720993009744, -80.42930155992508));
        duckpond1.add(new LatLng(37.22278933910612, -80.42886704206467));
        duckpond1.add(new LatLng(37.22368210430149, -80.42920500040054));
        duckpond1.add(new LatLng(37.22357958634724, -80.42940884828568));
        duckpond1.add(new LatLng(37.223272031648385, -80.42932838201523));
        ParkingLot duckpond1Lot = new ParkingLot(duckpond1, Credential.Pass.COMMUTER, 8, 5 + 12,
                "Smithfield Road Lot", "");
        lots.add(duckpond1Lot);


        List<LatLng> duckpond2 = new ArrayList<LatLng>();
        duckpond2.add(new LatLng(37.22417760578254, -80.43061316013336));
        duckpond2.add(new LatLng(37.223272031648385, -80.43145000934601));
        duckpond2.add(new LatLng(37.22303282157107, -80.43094575405121));
        duckpond2.add(new LatLng(37.223955484831535, -80.43019473552704));
        ParkingLot duckpond2Lot = new ParkingLot(duckpond2, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Duck Pond Lot","Overflow Lot");
        lots.add(duckpond2Lot);

        List<LatLng> basketball = new ArrayList<LatLng>();
        basketball.add(new LatLng(37.22342367335803, -80.41896298527718));
        basketball.add(new LatLng(37.22295166083676, -80.4184265434742));
        basketball.add(new LatLng(37.22307767351836, -80.41826292872429));
        basketball.add(new LatLng(37.22337668581862, -80.41858211159706));
        basketball.add(new LatLng(37.22357104317809, -80.41838899254799));
        basketball.add(new LatLng(37.22372054849841, -80.41855797171593));
        ParkingLot basketballLot = new ParkingLot(basketball, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Hahn-Hurst Lot", "Pritchard Pick Up");
        lots.add(basketballLot);

        List<LatLng> washington = new ArrayList<LatLng>();
        washington.add(new LatLng(37.22402596558876, -80.41809126734734));
        washington.add(new LatLng(37.223618030596406, -80.4176352918148));
        washington.add(new LatLng(37.22372054849841, -80.41749313473701));
        washington.add(new LatLng(37.22413489026584, -80.41795447468758));
        ParkingLot washingtonLot = new ParkingLot(washington, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Basketball Extension Lot", "Lee Hall Pick Up");
        lots.add(washingtonLot);

        List<LatLng> owens = new ArrayList<LatLng>();
        owens.add(new LatLng(37.2262151078283, -80.41889861226082));
        owens.add(new LatLng(37.226057064565595, -80.41863039135933));
        owens.add(new LatLng(37.22645217210133, -80.41814759373665));
        owens.add(new LatLng(37.22669777844508, -80.41856870055199));
        owens.add(new LatLng(37.22645644352286, -80.41882887482643));
        owens.add(new LatLng(37.22638810074969, -80.41874840855598));
        ParkingLot owensLot = new ParkingLot(owens, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Owens Lot", "");
        lots.add(owensLot);        
        //TODO: Change credentials
        List<LatLng> bookstore = new ArrayList<LatLng>();
        bookstore.add(new LatLng(37.22784037135346, -80.41869208216667));
        bookstore.add(new LatLng(37.227722909329486, -80.41861429810524));
        bookstore.add(new LatLng(37.22766097473409, -80.41771575808525));
        bookstore.add(new LatLng(37.22776775848751, -80.41754946112633));
        bookstore.add(new LatLng(37.228355066428286, -80.41810467839241));
        bookstore.add(new LatLng(37.228207705956635, -80.41837826371193));
        bookstore.add(new LatLng(37.228053938200944, -80.4182656109333));
        ParkingLot bookstoreLot = new ParkingLot(bookstore, Credential.Pass.METERED, 8, 5 + 12,
                "Book Store Lot", "");
        lots.add(bookstoreLot);        

        List<LatLng> powerplant = new ArrayList<LatLng>();
        powerplant.add(new LatLng(37.232197015352696, -80.42294338345528));
        powerplant.add(new LatLng(37.23165671974579, -80.42217895388603));
        powerplant.add(new LatLng(37.23173573555056, -80.42203143239021));
        powerplant.add(new LatLng(37.232310199317396, -80.42280659079552));
        ParkingLot powerplantLot = new ParkingLot(powerplant, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Sub Station Lot", "");
        lots.add(powerplantLot);    

        List<LatLng> track = new ArrayList<LatLng>();
        track.add(new LatLng(37.218269820130246, -80.41999965906143));
        track.add(new LatLng(37.21737699087266, -80.41983872652054));
        track.add(new LatLng(37.21746670146699, -80.41950076818466));
        track.add(new LatLng(37.21824418881562, -80.4196348786354));
        ParkingLot trackLot = new ParkingLot(track, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Track/Field House Lot", "");
        lots.add(trackLot);          

        List<LatLng> lane1 = new ArrayList<LatLng>();
        lane1.add(new LatLng(37.2186158420251, -80.41919767856598));
        lane1.add(new LatLng(37.21741971021661, -80.41910111904144));
        lane1.add(new LatLng(37.217582043502944, -80.41791021823883));
        lane1.add(new LatLng(37.217334271504534, -80.41698753833771));
        lane1.add(new LatLng(37.21793234045695, -80.41637599468231));
        lane1.add(new LatLng(37.21852186092672, -80.41721284389496));
        ParkingLot lane1Lot = new ParkingLot(lane1, Credential.Pass.RESIDENT, 8, 5 + 12,
                "Stadium Lot", "");
        lots.add(lane1Lot);         

        //Side Lot
        List<LatLng> lane2 = new ArrayList<LatLng>();
        lane2.add(new LatLng(37.21763330657344, -80.41645109653473));
        lane2.add(new LatLng(37.217317183750495, -80.41640818119049));
        lane2.add(new LatLng(37.21745388567433, -80.41524946689606));
        lane2.add(new LatLng(37.21838516093823, -80.41544258594513));
        ParkingLot lane2Lot = new ParkingLot(lane2, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "South Gate Center", "");
        lots.add(lane2Lot); 
        //Chicken hill lot
        List<LatLng> lane3 = new ArrayList<LatLng>();
        lane3.add(new LatLng(37.2172744643485, -80.4190045595169));
        lane3.add(new LatLng(37.21660803854496, -80.41885435581207));
        lane3.add(new LatLng(37.2167020220277, -80.41801750659943));
        lane3.add(new LatLng(37.21603559116715, -80.41471302509308));
        lane3.add(new LatLng(37.21700960351613, -80.41515290737152));
        lane3.add(new LatLng(37.21691562041659, -80.41582882404327));
        lane3.add(new LatLng(37.217402622481934, -80.41780292987823));
        ParkingLot lane3Lot = new ParkingLot(lane3, Credential.Pass.ANY, 8, 5 + 12,
                "Chicken Hill Lot", "");
        lots.add(lane3Lot);

        List<LatLng> drill = new ArrayList<LatLng>();
        drill.add(new LatLng(37.22574951996989, -80.42429387569427));
        drill.add(new LatLng(37.22578369165359, -80.4233068227768));
        drill.add(new LatLng(37.22612540763879, -80.42186915874481));
        drill.add(new LatLng(37.22790230580148, -80.4198306798935));
        drill.add(new LatLng(37.22885053720648, -80.41988432407379));
        drill.add(new LatLng(37.22949122735154, -80.42109668254852));
        drill.add(new LatLng(37.22932891969633, -80.42186915874481));
        drill.add(new LatLng(37.22742391426107, -80.42444407939911));
        drill.add(new LatLng(37.22684300616764, -80.42463719844818));
        drill.add(new LatLng(37.2260826932253, -80.42407929897308));
        drill.add(new LatLng(37.22596309273886, -80.42454063892365));
        ParkingLot drillLot = new ParkingLot(drill, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Drill Field", "");
        lots.add(drillLot);
       
        List<LatLng> innVisitor = new ArrayList<LatLng>();
        innVisitor.add(new LatLng(37.23109720005629, -80.42911648750305));
        innVisitor.add(new LatLng(37.23107157310083, -80.43231904506683));
        innVisitor.add(new LatLng(37.23051632026059, -80.43213665485382));
        innVisitor.add(new LatLng(37.230396726805964, -80.43026983737946));
        innVisitor.add(new LatLng(37.230089199908775, -80.42979776859283));
        innVisitor.add(new LatLng(37.23059320166696, -80.42901456356049));
        ParkingLot innVisitorLot = new ParkingLot(innVisitor, Credential.Pass.ANY, 8, 5 + 12,
                "VT Inn Visitor", "");
        lots.add(innVisitorLot); 

        List<LatLng> innFaculty = new ArrayList<LatLng>();
        innFaculty.add(new LatLng(37.230200251433004, -80.42920768260956));
        innFaculty.add(new LatLng(37.22922640941827, -80.42836010456085));
        innFaculty.add(new LatLng(37.228944505435095, -80.42890727519989));
        innFaculty.add(new LatLng(37.228543004003264, -80.42861759662628));
        innFaculty.add(new LatLng(37.229004303337774, -80.42780220508575));
        innFaculty.add(new LatLng(37.23021733626836, -80.42862832546234));
        ParkingLot innFacultyLot = new ParkingLot(innFaculty, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "VT Inn Faculty", "");
        lots.add(innFacultyLot);               

        List<LatLng> tennisCourt = new ArrayList<LatLng>();
        tennisCourt.add(new LatLng(37.21478815347695, -80.4182642698288));
        tennisCourt.add(new LatLng(37.21436948825939, -80.41813552379608));
        tennisCourt.add(new LatLng(37.21451473972052, -80.41760981082916));
        tennisCourt.add(new LatLng(37.21484796260409, -80.41779220104218));
        ParkingLot tennisCourtLot = new ParkingLot(tennisCourt, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Health and Safety Lot", "Tennis Court Lot");
        lots.add(tennisCourtLot);

        List<LatLng> parkingDeck = new ArrayList<LatLng>();
        parkingDeck.add(new LatLng(37.23062737115573, -80.42630016803741));
        parkingDeck.add(new LatLng(37.23115699625178, -80.42551696300507));
        parkingDeck.add(new LatLng(37.23173787111171, -80.42625725269318));
        parkingDeck.add(new LatLng(37.23121679239988, -80.42696535587311));
        ParkingLot parkingDeckLot = new ParkingLot(parkingDeck, Credential.Pass.COMMUTER, 8, 5 + 12,
                "Perry St. Garage", "Parking Deck");
        lots.add(parkingDeckLot);
        List<LatLng> oak = new ArrayList<LatLng>();
        oak.add(new LatLng(37.22316096992112, -80.42374938726425));
        oak.add(new LatLng(37.22281496887627, -80.42359918355942));
        oak.add(new LatLng(37.22313106865893, -80.4226604104042));
        oak.add(new LatLng(37.223746177952115, -80.42294472455978));
        oak.add(new LatLng(37.22357958634724, -80.42355626821518));
        oak.add(new LatLng(37.22326776004651, -80.4234328866005));
        ParkingLot oakLaneLot = new ParkingLot(oak, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Oak Lane Lot", "Frat Boy Lot");
        lots.add(oakLaneLot);

List<LatLng> squires = new ArrayList<LatLng>();
        squires.add(new LatLng(37.22918369676129, -80.41748374700546));
        squires.add(new LatLng(37.22862415872037, -80.41695803403854));
        squires.add(new LatLng(37.22915379788701, -80.41613727807999));
        squires.add(new LatLng(37.22967489085584, -80.41670590639114));
        ParkingLot squiresLot = new ParkingLot(squires, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Squires Lot", "");
        lots.add(squiresLot);

        List<LatLng> annex = new ArrayList<LatLng>();
        annex.add(new LatLng(37.2281671283849, -80.41652351617813));
        annex.add(new LatLng(37.22785104971019, -80.4162284731865));
        annex.add(new LatLng(37.22847893442805, -80.41528433561325));
        annex.add(new LatLng(37.22876084015177, -80.41558474302292));
        annex.add(new LatLng(37.22897867567101, -80.41530579328537));
        annex.add(new LatLng(37.22918796802809, -80.41555255651474));
        annex.add(new LatLng(37.22896586183435, -80.41586369276047));
        annex.add(new LatLng(37.22868395687711, -80.4157617688179));
        ParkingLot annexLot = new ParkingLot(annex, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Architcture Annex Lot", "");
        lots.add(annexLot);
        
        List<LatLng> northEndGarage = new ArrayList<LatLng>();
        northEndGarage.add(new LatLng(37.23370469724139, -80.42105510830879));
        northEndGarage.add(new LatLng(37.233493281910135, -80.4211476445198));
        northEndGarage.add(new LatLng(37.233356609057275, -80.42070239782333));
        northEndGarage.add(new LatLng(37.23380506592848, -80.42058974504471));
        ParkingLot northEndGarageLot = new ParkingLot(northEndGarage, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "North End Center Garage", "");
        lots.add(northEndGarageLot);

List<LatLng> bdubs = new ArrayList<LatLng>();
        bdubs.add(new LatLng(37.23360859943705, -80.4224619269371));
        bdubs.add(new LatLng(37.23332671183768, -80.4214158654213));
        bdubs.add(new LatLng(37.233822149946995, -80.42118519544601));
        bdubs.add(new LatLng(37.23399298991946, -80.42154461145401));
        bdubs.add(new LatLng(37.23424497817217, -80.42107790708542));
        bdubs.add(new LatLng(37.23434748162723, -80.42119055986404));
        bdubs.add(new LatLng(37.23393319597314, -80.42211323976517));
        ParkingLot bdubsLot = new ParkingLot(bdubs, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Five Guys Lot", "");
        lots.add(bdubsLot);


        List<LatLng> sharkeys = new ArrayList<LatLng>();
        sharkeys.add(new LatLng(37.23131929997198, -80.41403710842133));
        sharkeys.add(new LatLng(37.23120825009589, -80.41434422135353));
        sharkeys.add(new LatLng(37.23111214910961, -80.41499868035316));
        sharkeys.add(new LatLng(37.23059533726048, -80.41440859436989));
        sharkeys.add(new LatLng(37.231052352878535, -80.41375145316124));
        ParkingLot sharkeysLot = new ParkingLot(sharkeys, Credential.Pass.FACILITYSTAFF, 8, 5 + 12,
                "Sharkeys Lot", "");
        lots.add(sharkeysLot);
    }
    
    public List<ParkingLot> getLots() {
        return lots;
    }
}
