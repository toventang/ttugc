package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;

/* renamed from: com.twitter.sdk.android.core.p */
public class C87807p extends ContextWrapper {

    /* renamed from: a */
    private final String f199458a;

    /* renamed from: b */
    private final String f199459b;

    static {
        Covode.recordClassIndex(103808);
    }

    public File getCacheDir() {
        return new File(super.getCacheDir(), this.f199458a);
    }

    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.f199458a);
    }

    public File getFilesDir() {
        return new File(super.getFilesDir(), this.f199458a);
    }

    public File getExternalFilesDir(String str) {
        return new File(super.getExternalFilesDir(str), this.f199458a);
    }

    public File getDatabasePath(String str) {
        File file = new File(super.getDatabasePath(str).getParentFile(), this.f199458a);
        file.mkdirs();
        return new File(file, str);
    }

    public SharedPreferences getSharedPreferences(String str, int i) {
        MethodCollector.m26663i(6682);
        SharedPreferences sharedPreferences = super.getSharedPreferences(this.f199459b + ":" + str, i);
        MethodCollector.m26664o(6682);
        return sharedPreferences;
    }

    C87807p(Context context, String str, String str2) {
        super(context);
        this.f199459b = str;
        this.f199458a = str2;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        MethodCollector.m26663i(6393);
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str), cursorFactory);
        MethodCollector.m26664o(6393);
        return openOrCreateDatabase;
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
        MethodCollector.m26663i(6528);
        SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(getDatabasePath(str).getPath(), cursorFactory, databaseErrorHandler);
        MethodCollector.m26664o(6528);
        return openOrCreateDatabase;
    }
}
