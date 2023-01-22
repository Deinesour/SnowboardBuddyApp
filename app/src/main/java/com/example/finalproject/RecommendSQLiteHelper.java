package com.example.finalproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class RecommendSQLiteHelper extends SQLiteOpenHelper {
    private static final String Name = "recommend.sqlite";
    private static final int Version = 1;
    Cursor cursor;

    public RecommendSQLiteHelper(Context context) {
        super(context, Name, null, Version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE recommend ("
                + "id INTEGER PRIMARY KEY,"
                + "height INTEGER,"
                + "name TEXT,"
                + "size INTEGER,"
                + "ability TEXT,"
                + "price INTEGER,"
                + "gender TEXT,"
                + "image TEXT);"
        );
        insert(sqLiteDatabase);
    }

    public int getSize(){
        if (cursor == null){
            selectAll();
        }
        return cursor.getCount();
    }

    public String getName(int position){
        if (cursor == null){
            selectAll();
        }
        if (cursor.moveToPosition(position)){
            return cursor.getString(2);
        }
        return null;
    }

    public String getUrl(int position) {
        if (cursor == null){
            selectAll();
        }
        if (cursor.moveToPosition(position)){
            return cursor.getString(7);
        }
        return null;
    }

    public int getBSize(int position) {
        if (cursor == null){
            selectAll();
        }
        if (cursor.moveToPosition(position)) {
            return cursor.getInt(3);
        }
        return 0;
    }

    public int getPrice(int position) {
        if (cursor == null){
            selectAll();
        }
        if (cursor.moveToPosition(position)) {
            return cursor.getInt(5);
        }
        return 0;
    }

    public void selectAll() {
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        String query = "SELECT * FROM recommend";
       cursor = sqLiteDatabase.rawQuery(query,null,null);
    }

    public void sortFemale152(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"152","Female"},null,null,"size");
    }
    public void sortFemale158(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"158","Female"},null,null,"size");
    }
    public void sortFemale163(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
         cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"163","Female"},null,null,"size");
    }
    public void sortFemale168(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"168","Female"},null,null,"size");
    }
    public void sortFemale173(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"173","Female"},null,null,"size");
    }
    public void sortFemale178(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"178","Female"},null,null,"size");
    }
    public void sortMale168(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"168","Male"},null,null,"size");
    }
    public void sortMale173(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"173","Male"},null,null,"size");
    }
    public void sortMale178(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"178","Male"},null,null,"size");
    }
    public void sortMale183(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"183","Male"},null,null,"size");
    }
    public void sortMale188(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"188","Male"},null,null,"size");
    }
    public void sortMale193(){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();
        cursor = sqLiteDatabase.query("recommend",new String[]{"id","height","name","size",
                        "ability","price","gender","image"},
                "height = ? AND gender = ?",new String[]{"193","Male"},null,null,"size");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {}

    public void insert(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (1,152,'Arbor Ethos Rocker',141,'Beginner',399.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AVeHeuk7QOYGAczwqZcMGOw.jpg?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (2,152,'Head Fountain',139,'Beginner',269.99,'Female','https://curated-uploads.imgix.net/AgAAAB0AzcNkz1GpNfyxkK39S9x0_w.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (3,152,'Burton Stylus',138,'Beginner',399.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AOS3E6ilxNn6gSyUmeKytag.jpg?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (4,152,'Nitro Lectra',138,'Intermediate',296.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AS2C_BZBsOCSTxJWH4vntoA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (5,152,'Salomon Lotus',138,'Intermediate',349.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A9OXhGvi5NO-WaVErPKXkIA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (6,152,'K2 First Lite',142,'Intermediate',399.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A_GbX8xdyPAi5jqn98mChsQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (7,152,'Jones Twin Sister',140,'Expert',549.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AbqSFt6BjPtO8n9qjpVm6Fw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (8,152,'CAPiTA Paradise',139,'Expert',449.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AgS3S3poyM9mQEfZiq1mXaA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (9,152,'Rome Heist',139,'Expert',429.95,'Female','https://curated-uploads.imgix.net/AgAAAB0Aly4WKhPFPUKgbMNwBViu-g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (10,158,'Lib Tech Glider',143,'Beginner',549.95,'Female','https://curated-uploads.imgix.net/AgAAAB0Am3460eAFNqioWygamNMF8A.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (11,158,'CAPiTA Space Metal Fantasy',145,'Beginner',429.95,'Female','https://curated-uploads.imgix.net/AgAAAB0ASpPCoPSfM9eYkbBz4xLkTA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (12,158,'Nitro Arial',146,'Beginner',319.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AiHipulIbP1KSTyFa5FVDMA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (13,158,'Dreamscape by Decathlon Endzone 500',146,'Intermediate',249.00,'Female','https://curated-uploads.imgix.net/AgAAAB0AnYwsvPm4N-2J35wRyaSGlw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (14,158,'GNU Ladies Choice',143,'Intermediate',629.99,'Female','https://curated-uploads.imgix.net/AgAAAB0AMhr9XDyNPLyP5CSbHXC-Uw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (15,158,'Bataleon Spirit',146,'Intermediate',429.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AGZjpcOZkMCKL_EcKOHFn9g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (16,158,'Never Summer Lady FR',147,'Expert',589.99,'Female','https://curated-uploads.imgix.net/AgAAAB0Asu73VGC3Ngi2pWOj3DJpdw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (17,158,'Jones Airheart 2.0',146,'Expert',599.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AixpOvy8gON26qW77M2JEIQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (18,158,'K2 Outline',146,'Expert',423.96,'Female','https://curated-uploads.imgix.net/AgAAAB0AEpvC5qLCNZKDnty-ccn10Q.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (19,163,'Decathlon SNB 100',147,'Beginner',229.00,'Female','https://curated-uploads.imgix.net/AgAAAB0ApJJhP3ojP46RP9RqL8vzuw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (20,163,'Arbor Foundation Rocker',152,'Beginner',399.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AN1VKpsGyMQOyk4JVdOWvSw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (21,163,'GNU B-Nice',148,'Beginner',459.99,'Female','https://curated-uploads.imgix.net/AgAAAB0AChrXNRuCMy2_KSxhPKvY1g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (22,163,'CAPiTA Birds of a Feather',150,'Intermediate',499.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AviXru0RoMbCcUnCGgux0BQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (23,163,'Burton Hideaway',152,'Intermediate',439.95,'Female','https://curated-uploads.imgix.net/AgAAAB0Aml3uVdAOOMGr8BtSUkkeSg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (24,163,'Never Summer Infinity',151,'Intermediate',549.99,'Female','https://curated-uploads.imgix.net/AgAAAB0AuH8K5_6KOwam4A4vZ6xt_g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (25,163,'Arbor Formula Rocker',152,'Expert',449.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AwVT_pmAmOiGhWMVmRIz8HQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (26,163,'GNU Velvet',147,'Expert',529.99,'Female','https://curated-uploads.imgix.net/AgAAAB0A80iVC05eMe6xJ9sV0pm2_g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (27,163,'Salomon No Drama',152,'Expert',479.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AqkTg71_nPDi6jyG4OB59yw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (28,168,'Head Pride 2.0',152,'Beginner',359.00,'Female','https://curated-uploads.imgix.net/AgAAAB0A9xRBGfJRMVSkZ3ssJMpYJQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (29,168,'Decathlon SNB 100',152,'Beginner',229.00,'Female','https://curated-uploads.imgix.net/AgAAAB0ApJJhP3ojP46RP9RqL8vzuw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (30,168,'Rossignol Soulside',153,'Beginner',419.95,'Female','https://curated-uploads.imgix.net/AgAAAB0Al70SPzklPwGW1KrqsCiOjQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (31,168,'Arbor Westmark Camber Frank April',156,'Intermediate',549.95,'Female','https://curated-uploads.imgix.net/AgAAAB0ALQY-1RSTOc26akK7i1zdSQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (32,168,'Lib Tech Dynamiss',153,'Intermediate',549.99,'Female','https://curated-uploads.imgix.net/AgAAAB0AdBueStQWNpGeGsZip68Rww.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (33,168,'Bataleon Storm',156,'Intermediate',529.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AHEX7dYkJN3aWTY7Sn-HbOA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (34,168,'Arbor Bryan Iguchi Pro Camber',159,'Expert',649.95,'Female','https://curated-uploads.imgix.net/AgAAAB0ASzCKFS7oOsKOdkJOhQ6qQQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (35,168,'Lib Tech Cortado',154,'Expert',529.99,'Female','https://curated-uploads.imgix.net/AgAAAB0Ac1m8q8YhPhiB6dzTPbVQPg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (36,168,'Burton Talent Scout',152,'Expert',549.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AUEeh0_yLNE2t7mw5njsn1A.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (37,173,'Abor Foundation Rocker',158,'Beginner',399.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AN1VKpsGyMQOyk4JVdOWvSw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (38,173,'Salomon Lotus',155,'Beginner',349.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A9OXhGvi5NO-WaVErPKXkIA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (39,173,'Nitro Mystique',155,'Beginner',439.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AngCLWm0nPsG1gINChVo86Q.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (40,173,'Arbor Draft Camber',156,'Intermediate',449.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AZ0WnV40vP62AiWt5WHqVsg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (41,173,'Salomon Bellevue',155,'Intermediate',499.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AGnmtueEoPx2gqHszObeDtg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (42,173,'Weston Riva',155,'Intermediate',429.97,'Female','https://curated-uploads.imgix.net/AgAAAB0Agn0wyUC7N6yOWRL3Ygao4g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (43,173,'Yes. Hel Yes.',155,'Expert',499.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A5NU9qrrNO3eVLZcZswn_cg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (44,173,'Arbor Shiloh Camber',162,'Expert',549.95,'Female','https://curated-uploads.imgix.net/AgAAAB0Auiy3kw4MNcmWtXFfQpzjiw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (45,173,'Pallas Epiphany',155,'Expert',574.00,'Female','https://curated-uploads.imgix.net/AgAAAB0A3nZLReNKMUudoDxB0pevug.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (46,178,'Salomon Pulse',160,'Beginner',349.95,'Female','https://curated-uploads.imgix.net/AgAAAB0Ap3CdSoFBMyuM8G77oL0Mdw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (47,178,'K2 Raygun Pop',162,'Beginner',429.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AdiP6kbBiMiCWOnwV6MHFeg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (48,178,'Rossignol District Black',161,'Beginner',369.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AjA6xQ98tNRyngMKdjxYHdw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (49,178,'Nitro Cinema',162,'Intermediate',439.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A76vSxSTiP5ybNSbkyZDDkQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (50,178,'Ride Algorythm',161,'Intermediate',599.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AqFu5joXfNLWciU4sP0_QZg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (51,178,'Salomon Assassin',165,'Intermediate',549.95,'Female','https://curated-uploads.imgix.net/AgAAAB0AhdiYur6fOjOKOJ_Cm_2cjg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (52,178,'CAPiTA Mercury',161,'Expert',599.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A-UX5WgBiMjyl9_2AvDuiOQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (53,178,'Bataleon Evil Twin',159,'Expert',559.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A_UR9n6p5PISJ-7w55pshqA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (54,178,'K2 Manifest',162,'Expert',579.95,'Female','https://curated-uploads.imgix.net/AgAAAB0A7z4R2EK2O5ie7dkJogEsWQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (55,168,'Rossignol District Infrablack',155,'Beginner',269.99,'Male','https://curated-uploads.imgix.net/AgAAAB0ANH58oN-1M2aUz-OCwzRT2Q.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (56,168,'Burton Instigator Flat Top',150,'Beginner',439.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Aqe5tn_eVPfi34TAV8-j0pQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (57,168,'GNU GWO',153,'Beginner',459.99,'Male','https://curated-uploads.imgix.net/AgAAAB0A4kNqTL76Mn-EH8OlQyY8hw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (58,168,'CAPiTA Defenders of Awesome',156,'Intermediate',499.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AMGlui_sOOsGFk-q2WMPPIA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (59,168,'Lib Tech Cold Brew',157,'Intermediate',529.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AxI5kS5I3NlW1OXnBTb0cFw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (60,168,'Salomon Sleepwalker',153,'Intermediate',379.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AXb8TMIl_Ngi0ysaRgLwN1g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (61,168,'Nitro Prime Raw',155,'Expert',329.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AtPDBQaPFMXCopgXsktuiqQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (62,168,'CAPiTA Outerspace Living',156,'Expert',449.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Apnpi0OW9O3KDmBwJs4V3jg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (63,168,'Salomon Huck Knife',152,'Expert',479.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AgTpTBh_MMSSzrjZDWRmRjw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (64,173,'K2 Standard',158,'Beginner',419.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AJnipIgK2M3idEfe6JpzxPg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (65,173,'Arbor Element Rocker LTD',161,'Beginner',399.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AmBjz5ZMUNhuKk8Qz4_rBJQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (66,173,'Lib Tech Skate Banana',156,'Beginner',559.99,'Male','https://curated-uploads.imgix.net/AgAAAB0Ail6vK26KO6G03yLdVjmhBw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (67,173,'Jones Mountain Twin',157,'Intermediate',549.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AKIcSUwsEPd-5pi-ihkXv5w.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (68,173,'Lib Tech Orca',159,'Intermediate',699.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AtxOP1S3AMiyefZ2k9ZRGRQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (69,173,'Burton Custom Flying V',162,'Intermediate',659.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AbP02HBLDORiW7afSPVcX3Q.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (70,173,'CAPiTA Indoor Survival',160,'Expert',549.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AkO5TD5U0Mk-DgkBL_YBK1Q.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (71,173,'Ride Shadowban',157,'Expert',499.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Aa5smU-SiNhWvwIvcZuTcfg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (72,173,'Rossignol Revenant',162,'Expert',579.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AQ0juo6AqM_iObhNpNFF_2A.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (73,178,'Bataleon Chaser',159,'Beginner',429.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AQrRQWvW3Ppq6DKtr_EaNKg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (74,178,'Rossignol Evader',164,'Beginner',419.95,'Male','https://curated-uploads.imgix.net/AgAAAB0ARl9i667xOXWYgSj9Cx7qMA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (75,178,'Ride Manic',160,'Beginner',429.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AGfNGiX1KPhePmuS_IYLSYg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (76,178,'Arbor Element Camber',162,'Intermediate',499.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AI75G-QLLM_m3Hw5lyf1L6Q.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (77,178,'GNU Antigravity',162,'Intermediate',479.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AVpPfNFvUOrGWuvCrmMj_QQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (78,178,'Never Summer Snowtrooper',159,'Intermediate',599.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AIs9V4MrNOMu57cGfzjTW_g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (79,178,'Lib Tech T.Rice Pro',161,'Expert',659.99,'Male','https://curated-uploads.imgix.net/AgAAAB0ArJTD2O2HNSOKJU4kG2GKiw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (80,178,'Jones Stratos',159,'Expert',629.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AfoAXMXAyN9-rbxbpxEZuxQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (81,178,'CAPiTA Kazu Kokubo Pro',160,'Expert',649.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AdrGo94pSMk6OwT70fb24Pw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (82,183,'Arbor Element Rocker LTD',161,'Beginner',399.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AmBjz5ZMUNhuKk8Qz4_rBJQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (83,183,'Arbor Foundation Rocker',161,'Beginner',399.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AN1VKpsGyMQOyk4JVdOWvSw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (84,183,'Salomon Pulse',160,'Beginner',349.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Ap3CdSoFBMyuM8G77oL0Mdw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (85,183,'Yes. Hybrid',161,'Intermediate',549.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AklCzxuFaO_S1aOQGw-sVFA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (86,183,'Never Summer Proto Synthesis',161,'Intermediate',654.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AN0gu8CyyPFmi4zRjcX63xg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (87,183,'Yes. PYL',165,'Intermediate',499.95,'Male','https://curated-uploads.imgix.net/AgAAAB0ANxlkVr4vO7ivtN2e0EdvAQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (88,183,'CAPiTA Super D.O.A.',163,'Expert',749.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Aq7NwE4Y7O_eBR2hH8nGdKg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (89,183,'Ride MTNPIG',162,'Expert',649.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AIIzN5-nfO22WvP7vs7o0Ig.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (90,183,'Burton Skeleton Key',162,'Expert',579.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AnNjT110dNSK38_C82FwKKw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (91,188,'Arbor Element Rocker LTD',161,'Beginner',399.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AmBjz5ZMUNhuKk8Qz4_rBJQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (92,188,'Arbor Foundation Rocker',161,'Beginner',399.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AN1VKpsGyMQOyk4JVdOWvSw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (93,188,'Salomon Pulse',160,'Beginner',349.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Ap3CdSoFBMyuM8G77oL0Mdw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (94,188,'Burton Cartographer',162,'Intermediate',499.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AuX_xCJttMFSJN3OAqR-Ajw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (95,188,'Weston Backwoods',163,'Intermediate',624.00,'Male','https://curated-uploads.imgix.net/AgAAAB0AMGX44QddPLO0w3a6QhYgBw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (96,188,'Kemper Aggressor',162,'Intermediate',525.00,'Male','https://curated-uploads.imgix.net/AgAAAB0AxnewXB3vNi2UXR7hYzSUnA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (97,188,'Ride Algorythm',161,'Expert',599.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AqFu5joXfNLWciU4sP0_QZg.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (98,188,'Lib Tech TRS',162,'Expert',659.95,'Male','https://curated-uploads.imgix.net/AgAAAB0A0bry_XseO9myaxpflWvayA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (99,188,'Bataleon Cruiser',164,'Expert',459.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AQEoO7dsMMiSVpQnd_v9xZQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");

        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (100,193,'Arbor Element Rocker LTD',161,'Beginner',399.99,'Male','https://curated-uploads.imgix.net/AgAAAB0AmBjz5ZMUNhuKk8Qz4_rBJQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (101,193,'Arbor Foundation Rocker',161,'Beginner',399.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AN1VKpsGyMQOyk4JVdOWvSw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (102,193,'Salomon Pulse',160,'Beginner',349.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Ap3CdSoFBMyuM8G77oL0Mdw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=2066')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (103,193,'Burton Fish 3D Directional',161,'Intermediate',659.95,'Male','https://curated-uploads.imgix.net/AgAAAB0Ay-qATSJXMRWZWDk2uvsnaA.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (104,193,'K2 Afterblack',160,'Intermediate',459.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AkrOT0elTNvaq0ruYYdsgug.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=753')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (105,193,'Weston Ridgeline x Vernan Kee',162,'Intermediate',624.00,'Male','https://curated-uploads.imgix.net/AgAAAB0A34LRK0HHMmaoS0e4pgVL1g.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (106,193,'Jones Ultra Mountain Twin',163,'Expert',649.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AcYX7SAZ4O3-DFKy3Ow7sqQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (107,193,'K2 Alchemist',163,'Expert',699.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AuYE6GBXpPIqqopAKKir6FQ.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");
        sqLiteDatabase.execSQL("INSERT INTO recommend VALUES (108,193,'Nitro Mountain',163,'Expert',599.95,'Male','https://curated-uploads.imgix.net/AgAAAB0AdEjaDavIPDuG8ci85LGunw.png?auto=compress%2Cformat&ch=Width%2CDPR%2CSave-Data&ixlib=react-9.4.0&w=538')");







    }

}
