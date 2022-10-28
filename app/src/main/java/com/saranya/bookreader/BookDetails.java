package com.saranya.bookreader;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.saranya.bookreader.R;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.imageview.ShapeableImageView;
public class BookDetails extends AppCompatActivity {

    ShapeableImageView bookimage;
    TextView name, desc, pages;
    Button readbookbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);

        bookimage = findViewById(R.id.bookimage);
        name = findViewById(R.id.bookname);
        desc = findViewById(R.id.bookdescription);
        pages = findViewById(R.id.booknoofpages);
        readbookbtn = findViewById(R.id.btn_readbook);

        int image = getIntent().getExtras().getInt("bookindex", 0);

        if (image == 0) {
            bookimage.setImageResource(R.drawable.computer_cover);
            name.setText("Computer Book");
            desc.setText("A computer book for class 6th students, with a range of interesting activities and projects at the end of each chapter");
            pages.setText("98 pages");

            readbookbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookDetails.this, BooKReader.class);
                    intent.putExtra("openbook", 0);
                    startActivity(intent);
                }
            });

        }

        if (image == 1) {
            bookimage.setImageResource(R.drawable.science_cover);
            name.setText("Learn Science");
            desc.setText("A Science book for Class 10th students, based on the ncert curriculum, published by XYZ publications");
            pages.setText("360 pages");

            readbookbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookDetails.this, BooKReader.class);
                    intent.putExtra("openbook", 1);
                    startActivity(intent);
                }
            });

        }

        if (image == 2) {
            bookimage.setImageResource(R.drawable.maths_frontcover);
            name.setText("Learn Mathematics");
            desc.setText("A Mathematics book for Class 10th students, based on the ncert curriculum, published by XYZ publications");
            pages.setText("344 pages");

            readbookbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookDetails.this, BooKReader.class);
                    intent.putExtra("openbook", 2);
                    startActivity(intent);
                }
            });

        }

        if (image == 3) {
            bookimage.setImageResource(R.drawable.maths_problem_cover);
            name.setText("1000+ Mathematics Problems");
            desc.setText("A maths problem solving textbook with numerous tricks and tips for fast calculation");
            pages.setText("117 pages");

            readbookbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(BookDetails.this, BooKReader.class);
                    intent.putExtra("openbook", 3);
                    startActivity(intent);
                }
            });

        }



    }
}