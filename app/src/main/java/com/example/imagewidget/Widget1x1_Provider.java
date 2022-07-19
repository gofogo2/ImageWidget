package com.example.imagewidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
        super.onUpdate(context,appWidgetManager,appWidgetIds);
//        ComponentName widget = new ComponentName(context,Widget1x1_Provider.class);
        RemoteViews views  = new RemoteViews(context.getPackageName(), R.layout.widget1x1__provider);
            Intent intent=new Intent(context, MainActivity.class);

            PendingIntent pe=PendingIntent.getActivity(context, 0, intent, 0);



            appWidgetManager.updateAppWidget(appWidgetIds,views);



    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        ComponentName widget = new ComponentName(context,Widget1x1_Provider.class);
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        RemoteViews views  = new RemoteViews(context.getPackageName(), R.layout.widget1x1__provider);
        views.setImageViewResource(R.id.img1,R.drawable.img_1x1_4);
        appWidgetManager.updateAppWidget(widget,views);
    }

    @Override
    public void onEnabled(Context context) {
        Log.d("aaaaaa","onEnabled");
        super.onEnabled(context);
    }

    @Override
    public void onRestored(Context context, int[] oldWidgetIds, int[] newWidgetIds) {
        Log.d("aaaaaa","onRestored");
        super.onRestored(context, oldWidgetIds, newWidgetIds);
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId, Bundle newOptions) {
        Log.d("aaaaaa","onAppWidgetOptionsChanged");
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    }
}