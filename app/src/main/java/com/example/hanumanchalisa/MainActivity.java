package com.example.hanumanchalisa;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt,play,pause,stop;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.lyrics);
        play=findViewById(R.id.play);
        pause=findViewById(R.id.pause);
        stop=findViewById(R.id.stop);
        ImageView mimageView=(ImageView) findViewById(R.id.imageView);
        Bitmap mbitmap=((BitmapDrawable) getResources().getDrawable(R.drawable.hanuman)).getBitmap();
        Bitmap imageRounded=Bitmap.createBitmap(mbitmap.getWidth(), mbitmap.getHeight(), mbitmap.getConfig());
        Canvas canvas=new Canvas(imageRounded);
        Paint mpaint=new Paint();
        mpaint.setAntiAlias(true);
        mpaint.setShader(new BitmapShader(mbitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
        canvas.drawRoundRect((new RectF(0, 0, mbitmap.getWidth(), mbitmap.getHeight())), 100, 100, mpaint); // Round Image Corner 100 100 100 100
        mimageView.setImageBitmap(imageRounded);
        String para="Shri Guru Charan Saroj Raj\n"+"Nij mane mukure sudhar\n"+"Varnao Raghuvar Vimal Jasu\n"+"Jo dayaku phal char\n"+"\n"+"Budhi Hin Tanu Janike\n"+"Sumirau Pavan Kumar\n"+"Bal budhi Vidya dehu mohe\n"+"Harahu Kalesa Vikar\n"+"\n"+"Jai Hanuman gyan gun sagar\n"+"Jai Kapis tihun lok ujagar\n"+"\n"+"Ram doot atulit bal dhama\n"+"Anjani-putra Pavan sut nama\n"+"\n"+"Mahavir Vikram Bajrangi\n"+"Kumati nivar sumati Ke sangi\n"+"\n"+"Kanchan varan viraj subesa\n"+"Kanan Kundal Kunchit Kesa\n"+"\n"+"Hath Vajra Aur Dhuvaje Viraje\n"+"Kandhe moonj janehu sajai\n"+"\n"+"Sankar suvan kesri Nandan\n"+"Tej pratap maha jag vandan\n"+"\n"+"Vidyavan guni ati chatur\n"+"Ram kaj karibe ko aatur\n"+"\n"+"Prabu charitra sunibe ko rasiya \n"+"Ram Lakhan Sita man Basiya\n"+"\n"+"Sukshma roop dhari Siyahi dikhava\n"+"Vikat roop dhari lanka jarava\n"+"\n"+"Bhima roop dhari asur sanghare\n"+"Ramachandra ke kaj sanvare\n"+"\n"+"Laye Sanjivan Lakhan Jiyaye\n"+"Shri Raghuvir Harashi ur laye\n"+"\n"+"Raghupati Kinhi bahut badai\n"+"Tum mam priye Bharat-hi sam bhai\n"+"\n"+"Sahas badan tumharo yash gaave\n"+"Us kahi Shripati kanth lagaave\n"+"\n"+"Sankadik Brahmadi Muneesa\n"+"Narad Sarad sahit Aheesa\n"+"\n"+"Yam Kuber Digpal Jahan te\n"+"Kavi kovid kahi sake kahan te\n"+"\n"+"Tum upkar Sugreevahin keenha\n"+"Ram milaye rajpad deenha\n"+"Tumharo mantra Vibheeshan mana\n"+"Lankeshwar Bhaye Sub jag jana\n"+"\n"+"Yug sahastra jojan par Bhanu\n"+"Leelyo tahi madhur phal janu\n"+"\n"+"Prabhu mudrika meli mukh mahee\n"+"Jaladhi langhi gaye achraj nahee\n"+"\n"+"Durgaam kaj jagat ke jete\n"+"Sugam anugraha tumhre tete\n"+"\n"+"Ram dware tum rakhvare,\n"+"Hoat na agya binu paisare\n"+"\n"+"Sub sukh lahai tumhari sarna\n"+"Tum rakshak kahu ko dar na\n"+"\n"+"Aapan tej samharo aapai\n"+"Teenhon lok hank te kanpai\n"+"\n"+"Bhoot pisach Nikat nahin aavai\n"+"Mahavir jab naam sunavai\n"+"\n"+"Nase rog harai sab peera\n"+"Japat nirantar Hanumant beera\n"+"\n"+"Sankat se Hanuman chudavai\n"+"Man Karam Vachan dyan jo lavai\n"+"\n"+"Sub par Ram tapasvee raja\n"+"Tin ke kaj sakal Tum saja\n"+"\n"+"Aur manorath jo koi lavai\n"+"Sohi amit jeevan phal pavai\n"+"\n"+"Charon Yug partap tumhara\n"+"Hai persidh jagat ujiyara\n"+"\n"+"Sadhu Sant ke tum Rakhware\n"+"Asur nikandan Ram dulhare\n"+"\n"+"Ashta sidhi nav nidhi ke dhata\n"+"Us var deen Janki mata\n"+"\n"+"Ram rasayan tumhare pasa\n"+"Sada raho Raghupati ke dasa\n"+"\n"+"Tumhare bhajan Ram ko pavai\n"+"Janam janam ke dukh bisravai\n"+"\n"+"Anth kaal Raghuvir pur jayee \n"+"Jahan janam Hari-Bakht Kahayee\n"+"\n"+"Aur Devta Chit na dharehi\n"+"Hanumanth se hi sarve sukh karehi\n"+"\n"+"Sankat kate mite sab peera\n"+"Jo sumirai Hanumat Balbeera\n"+"\n"+"Jai Jai Jai Hanuman Gosahin\n"+"Kripa Karahu Gurudev ki nyahin\n"+"\n"+"Jo sat bar path kare kohi \n"+"Chutehi bandhi maha sukh hohi \n"+"\n"+"Jo yah padhe Hanuman Chalisa\n"+"Hoye siddhi sakhi Gaureesa\n"+"\n"+"Tulsidas sada hari chera\n"+"Keejai Das Hrdaye mein dera\n"+"\n"+"Pavantnai sankat haran,\n"+"Mangal murti roop. \n"+"Ram Lakhan Sita sahit,\n"+"Hrdaye basahu sur bhoop.";
        txt.setText(para);
        txt.setMovementMethod(new ScrollingMovementMethod());
        music = MediaPlayer.create(this, R.raw.musiq);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.stop();
                music.release();
                music = MediaPlayer.create(MainActivity.this, R.raw.musiq);
            }
        });

    }
}