package net.davdayanandvihar.dav.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import net.dav.myapplication.R;

public class learn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        WebView wb;
        int identifier;
        wb = (WebView) findViewById(R.id.webview4);
        WebSettings wbsettings = wb.getSettings();
        wbsettings.setJavaScriptEnabled(true);
        wb.setWebViewClient(new WebViewClient());
        Intent i = getIntent();
        identifier = i.getIntExtra("identifier",0);
        if (identifier==1){
            wb.clearCache(true);
            wb.clearHistory();

            wb.loadUrl("http://informatics.byethost7.com/csappnew/classxi1.html");
        }
        if (identifier==2){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/classxi2.html");
        }
        if (identifier==3){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/classxi3.html");
        }
        if (identifier==4){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/control.html");
        }
        if (identifier==5){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/functions.html");
        }
        if (identifier==6){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/xiarray.html");
        }
        if (identifier==7){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/structures.html");
        }
        if (identifier==8){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/oops.html");
        }
        if (identifier==9){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/classes.html");
        }
        if (identifier==10){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/constructor.html");
        }
        if (identifier==11){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/inherit.html");
        }
        if (identifier==12){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/ds.html");
        }
        if (identifier==13){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/stack.html");
        }
        if (identifier==14){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/queue.html");
        }
        if (identifier==15){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/pointers.html");
        }
        if (identifier==16){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/files.html");
        }

        if (identifier==17){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/sql.html");
        }

        if (identifier==18){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/boolean.html");
        }



        if(identifier==19){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("http://informatics.byethost7.com/csappnew/networking.html");

        }
        if (identifier==20){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("http://letsrevisecomputersc.blogspot.in/");
        }
        if (identifier==21){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("http://projectscsclassxii.blogspot.in/");
        }
        if (identifier==22){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("http://cspracticalsxixii.blogspot.in/");
        }
        if (identifier==23){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("https://www.youtube.com/watch?v=8TdQgL3Xbyc");
        }
        if (identifier==24){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("http://crosswordlabs.com/view/computer-netwoks");

        }
        if (identifier==25){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("https://www.youtube.com/watch?v=JtHgKw98csk");

        }
        if (identifier==26){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("https://www.youtube.com/playlist?list=PLqLgLXyqvDZgQNrwDdDRzQNF_c1uRB3X6");

        }

        if (identifier==27){
            wb.clearHistory();
            wb.clearCache(true);
            wb.loadUrl("https://www.youtube.com/playlist?list=PLqLgLXyqvDZimJU18d8_BzDvH6sD3IMDT");

        }

        if (identifier==100){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQzg3SlJVTDhKRkFYOTM2UTZBTFdZUUozNS4u");
        }
        if (identifier==101){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUMzdVTzNIT1BPN0w1SEROQlUwTTRPNTdENi4u");
        }
        if (identifier==102){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlURDgzVkhEOFZXT0E0QkhBTTBWMlpDNlBETS4u");
        }
        if (identifier==103){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUOFZURVU0RThPRzVPR0syTTc0TVE2MTBKQi4u");
        }
        if (identifier==104){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUMVAyUjQ4SzlXR1RORzc4QVJYTFJITUxUUi4u");
        }
        if (identifier==200){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUNEhWWUlVQVM0VzM1Vkg2WldMUldUQVNSNy4u");
        } if (identifier==201){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUNUkwT0dJTENaS0lWWDVUNEY1VkhWMEdQNy4u");
        } if (identifier==202){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQ1lDUzQ5RUgwM0xYRURaTTlMTFNVSzY1My4u");
        } if (identifier==203){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQkZUUTZaWDIxMkJGUzEwRTZFMzdLQ0RESC4u");
        } if (identifier==204){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUM1Q3ODcyVVZKRVFGNU8yNE1LMklXRUIwWi4u");
        } if (identifier==205){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUNDBQOFMzSFNPWVpMSzZWNktJUVZZTExYVC4u");
        } if (identifier==206){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUOThDQks0OVZPRVk4TU1VOEk1WE5NMlI5TC4u");
        } if (identifier==207){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQ1pXMElXNktGNk9KWVBQUlhSTEJRQU5VQS4u");
        } if (identifier==208){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQzM1MzM0MElWWDdZVlBGWFlJSTdYWFEyTy4u");
        } if (identifier==209){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUMlk2UU4wQkNWTVNQVVU1VEFLWVROSVlFTi4u");
        } if (identifier==210){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQVk4TUpFTVRDOTU1QjcyN0ZFNkQyVjkxUC4u");
        } if (identifier==211){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUN1FJNTVIRFJDOFdDVFZIQUZGNTg0UlZLMS4u");
        } if (identifier==212){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQVFWVlJGSE4wQTAzM0tQQ05EMlZIWVI0Si4u");
        } if (identifier==213){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQTc0SjI4RVg2MElVN0Q4VVJNV0VXRzBRVS4u");
        } if (identifier==214){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUNkQyWVFJN1BQUDVRREpRQlEwV1BOS1AwMC4u");
        }
        if (identifier==215){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlURjVLNkRMOEpYODc0T1pYOUtTVEhEVlNFTi4u");
        }
        if (identifier==216){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlURjVLNkRMOEpYODc0T1pYOUtTVEhEVlNFTi4u");
        }
        if (identifier==217){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUOFZURVU0RThPRzVPR0syTTc0TVE2MTBKQi4u");
        }
        if (identifier==218){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUMVAyUjQ4SzlXR1RORzc4QVJYTFJITUxUUi4u");
        }
        if (identifier==219){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUNjVUU0FQMVFQMktWWVJaQ1ExSTZFRTJEQS4u");
        }
        if (identifier==220){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUNUtKTDI3TFNWS1ZIMVlMMVpIMVdMNjNVWC4u");
        }
        if (identifier==221){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUQzlUUVVHVjhCMURTN0hZNkhXOUpHSTNQTy4u");
        }
        if (identifier==222){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("https://forms.office.com/Pages/ResponsePage.aspx?id=uVdSLCoxHUWYThBldv57gLCki1hl4KZIgda4rLKRFOlUODNaVURLQjdSUjRXMVNRQ0dJOTJXUUEzRy4u");
        }
        if (identifier==500){
            wb.clearCache(true);
            wb.clearHistory();
            wb.loadUrl("www.edutechforums.com");

        }


    }
}
