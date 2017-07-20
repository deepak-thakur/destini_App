package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView StoryLine;
    Button TopButton;
    Button BottomButton;
    int mStoryIndex; // this starts the story from first position.









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

            StoryLine = (TextView) findViewById(R.id.storyTextView);
            TopButton = (Button) findViewById(R.id.buttonTop);
            BottomButton = (Button) findViewById(R.id.buttonBottom);
            mStoryIndex = 1;









        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

            TopButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("Destini","top button is presses ");

                        Exit1();


                    switch(mStoryIndex){

                        case 1:
                            mStoryIndex =3;
                            StoryLine.setText(R.string.T3_Story);
                            TopButton.setText(R.string.T3_Ans1);
                            BottomButton.setText(R.string.T3_Ans2);
                            break;
                        case 4:
                            StoryLine.setText(R.string.T3_Story);
                           // TopButton.setText(R.string.T3_Ans1);
                            //BottomButton.setText(R.string.T3_Ans2);
                            break;
                        case 3:


                            StoryLine.setText(R.string.T6_End);
                            TopButton.setVisibility(View.GONE);
                            BottomButton.setVisibility(View.GONE);
                            break;

                        case 2:
                           mStoryIndex =3;
                           StoryLine.setText(R.string.T3_Story);
                            TopButton.setText(R.string.T3_Ans1);
                            BottomButton.setText(R.string.T3_Ans2);

                            break;


                    }






                }
            });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:



            BottomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("destini","bottom button is pressed");
                        Exit1();

                    switch (mStoryIndex){

                        case 1:
                            mStoryIndex =2;
                            StoryLine.setText(R.string.T2_Story);
                            TopButton.setText(R.string.T2_Ans1);
                            BottomButton.setText(R.string.T2_Ans2);
                            break;
                        case 2:
                            StoryLine.setText(R.string.T4_End);
                            TopButton.setVisibility(View.GONE);
                            BottomButton.setVisibility(View.GONE);
                            break;

                        case 3:
                            StoryLine.setText(R.string.T5_End);
                            TopButton.setVisibility(View.GONE);
                            BottomButton.setVisibility(View.GONE);
                            break;
                        case 4:
                            StoryLine.setText(R.string.T6_End);
                            TopButton.setVisibility(View.GONE);
                            BottomButton.setVisibility(View.GONE);
                        default:
                            TopButton.setVisibility(View.GONE);
                            BottomButton.setVisibility(View.GONE);
                            break;




                    }











                }
            });


    }




        private void  Exit1()
        {
            if (mStoryIndex == 2 || mStoryIndex == 3 ){


                AlertDialog.Builder alert = new AlertDialog.Builder(this);
                alert.setTitle("End Of The Story");
                alert.setCancelable(false);
                alert.setPositiveButton("Close Application", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }

                });

                alert.show();
            }


        }






}
