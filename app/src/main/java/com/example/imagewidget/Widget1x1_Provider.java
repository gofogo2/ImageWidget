package com.example.imagewidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Implementation of App Widget functionality.
 */
public class Widget1x1_Provider  extends AppWidgetProvider {
    Integer cnt =0;
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
            ComponentName widget = new ComponentName(context,Widget1x1_Provider.class);
            for (int appWidgetId : appWidgetIds) {
            RemoteViews views  = new RemoteViews(context.getPackageName(), R.layout.widget1x1__provider);
            TimerTask timerTask = new TimerTask() {
                @Override
                public void run() {
                    cnt++;
                    cnt=cnt%5;

                    switch (cnt){
                        case 1:
                            views.setImageViewResource(R.id.img1,R.drawable.img_1x1_1);
                            break;
                        case 2:
                            views.setImageViewResource(R.id.img1,R.drawable.img_1x1_2);
                            break;
                        case 3:
                            views.setImageViewResource(R.id.img1,R.drawable.img_1x1_3);
                            break;
                        case 4:
                            views.setImageViewResource(R.id.img1,R.drawable.img_1x1_4);
                            break;
                        case 5:
                            views.setImageViewResource(R.id.img1,R.drawable.img_1x1_5);
                            break;
                        default:
                            break;
                    }
                    appWidgetManager.updateAppWidget(widget,views);
                }
            };

            Timer timer = new Timer();
            timer.schedule(timerTask,0,3000);
        }
    }
}