package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Musica extends AppCompatActivity {
    ImageView imagem;
    TextView cantor, musica;
    static int gerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
        getSupportActionBar().hide();
        imagem = findViewById(R.id.imagem);
        cantor = findViewById(R.id.cantor);
        musica = findViewById(R.id.musica);
        musica_nova();
    }


    public void musica_nova() {
        if (gerar == 1) {
            imagem.setImageResource(R.drawable.promqueen);
            musica.setText("Prom Queen");
            cantor.setText("Beach Bunny");
            Toast.makeText(this, "Álbum: Prom Queen", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 2) {
            imagem.setImageResource(R.drawable.calm);
            musica.setText("Teeth");
            cantor.setText("5 Seconds of Summer");
            Toast.makeText(this, "Álbum: CALM", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 3) {
            imagem.setImageResource(R.drawable.afterhours);
            musica.setText("Save Your Tears");
            cantor.setText("The Weeknd");
            Toast.makeText(this, "Álbum: After Hours", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 4) {
            imagem.setImageResource(R.drawable.thumbs);
            musica.setText("Thumbs");
            cantor.setText("Sabrina Carpenter");
            Toast.makeText(this, "Álbum: EVOLution", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 5) {
            imagem.setImageResource(R.drawable.futurenostalgia);
            musica.setText("Break My Heart");
            cantor.setText("Dua Lipa");
            Toast.makeText(this, "Álbum: Future Nostalgia", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 6) {
            imagem.setImageResource(R.drawable.k12);
            musica.setText("The Principal");
            cantor.setText("Melanie Martinez");
            Toast.makeText(this, "Álbum: K-12", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 7) {
            imagem.setImageResource(R.drawable.crybaby);
            musica.setText("Dollhouse");
            cantor.setText("Melanie Martinez");
            Toast.makeText(this, "Álbum: Cry Baby", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 8) {
            imagem.setImageResource(R.drawable.k12);
            musica.setText("Show & Tell");
            cantor.setText("Melanie Martinez");
            Toast.makeText(this, "Álbum: K-12", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 9) {
            imagem.setImageResource(R.drawable.killthislove);
            musica.setText("Kill This Love");
            cantor.setText("BLACKPINK");
            Toast.makeText(this, "Álbum: KILL THIS LOVE", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 10) {
            imagem.setImageResource(R.drawable.killthislove);
            musica.setText("Kick It");
            cantor.setText("BLACKPINK");
            Toast.makeText(this, "Álbum: KILL THIS LOVE", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 11) {
            imagem.setImageResource(R.drawable.telepath);
            musica.setText("Telepath");
            cantor.setText("Conan Grey");
            Toast.makeText(this, "Álbum: Telepath", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 12) {
            imagem.setImageResource(R.drawable.summeroflove);
            musica.setText("Summer of Love");
            cantor.setText("Shaw Mendes");
            Toast.makeText(this, "Álbum: Summer of Love", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 13) {
            imagem.setImageResource(R.drawable.riot);
            musica.setText("Misery Business");
            cantor.setText("Paramore");
            Toast.makeText(this, "Álbum: Riot!", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 14) {
            imagem.setImageResource(R.drawable.equals);
            musica.setText("Bad Habits");
            cantor.setText("Ed Sheeran");
            Toast.makeText(this, "Álbum: =", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 15) {
            imagem.setImageResource(R.drawable.hamilton);
            musica.setText("Burn");
            cantor.setText("Phillipa Soo");
            Toast.makeText(this, "Álbum: Hamilton", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 16) {
            imagem.setImageResource(R.drawable.hamilton);
            musica.setText("Satisfied");
            cantor.setText("Renée Elise Goldsberry");
            Toast.makeText(this, "Álbum: Hamilton", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 17) {
            imagem.setImageResource(R.drawable.jolene);
            musica.setText("Jolene");
            cantor.setText("Dolly Parton");
            Toast.makeText(this, "Álbum: Jolene", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 18) {
            imagem.setImageResource(R.drawable.sour);
            musica.setText("enough for you");
            cantor.setText("Olivia Rodrigo");
            Toast.makeText(this, "Álbum: SOUR", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 19) {
            imagem.setImageResource(R.drawable.sour);
            musica.setText("brutal");
            cantor.setText("Olivia Rodrigo");
            Toast.makeText(this, "Álbum: SOUR", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 20) {
            imagem.setImageResource(R.drawable.confetti);
            musica.setText("Confetti");
            cantor.setText("Little Mix");
            Toast.makeText(this, "Álbum: Confetti", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 21) {
            imagem.setImageResource(R.drawable.confetti);
            musica.setText("Sweet Melody");
            cantor.setText("Little Mix");
            Toast.makeText(this, "Álbum: Confetti", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 22) {
            imagem.setImageResource(R.drawable.rose);
            musica.setText("On The Ground");
            cantor.setText("ROSÉ");
            Toast.makeText(this, "Álbum: R", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 23) {
            imagem.setImageResource(R.drawable.v);
            musica.setText("Maps");
            cantor.setText("Maroon 5");
            Toast.makeText(this, "Álbum: V", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 24) {
            imagem.setImageResource(R.drawable.itsybitsy);
            musica.setText("Itsy Bitsy");
            cantor.setText("Lyn Ladip");
            Toast.makeText(this, "Álbum: Itsy Bitsy", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 25) {
            imagem.setImageResource(R.drawable.halsey);
            musica.setText("More");
            cantor.setText("Halsey");
            Toast.makeText(this, "Álbum: Manic", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 26) {
            imagem.setImageResource(R.drawable.sinmiedo);
            musica.setText("telepatía");
            cantor.setText("Kali Uchis");
            Toast.makeText(this, "Álbum: Sin Miedo", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 27) {
            imagem.setImageResource(R.drawable.strangetrails);
            musica.setText("The Night We Met");
            cantor.setText("Lord Huron");
            Toast.makeText(this, "Álbum: Strange Trails", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 28) {
            imagem.setImageResource(R.drawable.skin);
            musica.setText("Skin");
            cantor.setText("Sabrina Carpenter");
            Toast.makeText(this, "Álbum: Skin", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 29) {
            imagem.setImageResource(R.drawable.withoutme);
            musica.setText("Without Me");
            cantor.setText("Halsey");
            Toast.makeText(this, "Álbum: Without Me", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 30) {
            imagem.setImageResource(R.drawable.bekind);
            musica.setText("Be Kind");
            cantor.setText("Marshmello");
            Toast.makeText(this, "Álbum: Be Kind", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 31) {
            imagem.setImageResource(R.drawable.itrust);
            musica.setText("LION");
            cantor.setText("(G)I-DLE");
            Toast.makeText(this, "Álbum: I trust", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 32) {
            imagem.setImageResource(R.drawable.onmyway);
            musica.setText("On My Way");
            cantor.setText("Alan Walker");
            Toast.makeText(this, "Álbum: On My Way", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 33) {
            imagem.setImageResource(R.drawable.levelofconcert);
            musica.setText("Level of Concern");
            cantor.setText("Twenty One Pilots");
            Toast.makeText(this, "Álbum: Level of Concern", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 34) {
            imagem.setImageResource(R.drawable.youngblood);
            musica.setText("Youngblood");
            cantor.setText("5 Seconds of Summer");
            Toast.makeText(this, "Álbum: Youngblood", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 35) {
            imagem.setImageResource(R.drawable.judas);
            musica.setText("Judas");
            cantor.setText("Lady Gaga");
            Toast.makeText(this, "Álbum: Born This Way", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 36) {
            imagem.setImageResource(R.drawable.thetreeoflanguage);
            musica.setText("Black or White");
            cantor.setText("Dreamcatcher");
            Toast.makeText(this, "Álbum: [Dystopia: The Tree of Language]", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 37) {
            imagem.setImageResource(R.drawable.thetreeoflanguage);
            musica.setText("Scream");
            cantor.setText("Dreamcatcher");
            Toast.makeText(this, "Álbum: [Dystopia: The Tree of Language]", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 38) {
            imagem.setImageResource(R.drawable.raidofdream);
            musica.setText("Deja Vu");
            cantor.setText("Dreamcatcher");
            Toast.makeText(this, "Álbum: Raid of Dream", Toast.LENGTH_SHORT).show();
        }

        else if (gerar == 39) {
            imagem.setImageResource(R.drawable.losemyself);
            musica.setText("BOCA");
            cantor.setText("Dreamcatcher");
            Toast.makeText(this, "Álbum: [Dystopia: Lose Myself]", Toast.LENGTH_SHORT).show();
        }

        else {
            imagem.setImageResource(R.drawable.teenagedream);
            musica.setText("Part Of Me");
            cantor.setText("Katy Perry");
            Toast.makeText(this, "Álbum: Teenage Dream", Toast.LENGTH_SHORT).show();
        }
    }
}