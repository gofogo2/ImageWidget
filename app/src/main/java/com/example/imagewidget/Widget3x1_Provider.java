package com.example.imagewidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;

/**
 * Implementation of App Widget functionality.
 */
public class Widget3x1_Provider extends AppWidgetProvider {

//    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
//                                int appWidgetId) {
//        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget3x1__provider);
//        Intent intent=new Intent(context, MainActivity.class);
//        PendingIntent pe= PendingIntent.getActivity(context, 0, intent, 0);
//        views.setOnClickPendingIntent(R.id.llRoot, pe);
//        appWidgetManager.updateAppWidget(appWidgetId, views);
//    }
}