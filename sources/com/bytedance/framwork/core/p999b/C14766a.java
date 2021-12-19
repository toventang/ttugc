package com.bytedance.framwork.core.p999b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.sdkmonitor.C14822i;

/* renamed from: com.bytedance.framwork.core.b.a */
public class C14766a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C14766a f35983a;

    static {
        Covode.recordClassIndex(16866);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(12758);
        try {
            sQLiteDatabase.execSQL("CREATE TABLE monitor_log ( _id Integer PRIMARY KEY AUTOINCREMENT, aid Integer, type VARCHAR, type2 VARCHAR, time Integer, data TEXT, data2 TEXT, data3 TEXT  )");
            sQLiteDatabase.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            MethodCollector.m26664o(12758);
        } catch (Exception unused) {
            MethodCollector.m26664o(12758);
        }
    }

    /* renamed from: a */
    public static C14766a m27096a(Context context) {
        MethodCollector.m26663i(12757);
        if (f35983a == null) {
            synchronized (C14766a.class) {
                try {
                    if (f35983a == null) {
                        f35983a = new C14766a(context, C14822i.m27214a(context) + "sdkmon_v2.db");
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12757);
                    throw th;
                }
            }
        }
        C14766a aVar = f35983a;
        MethodCollector.m26664o(12757);
        return aVar;
    }

    private C14766a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
