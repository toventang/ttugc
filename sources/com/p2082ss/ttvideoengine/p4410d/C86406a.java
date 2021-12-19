package com.p2082ss.ttvideoengine.p4410d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.ttvideoengine.d.a */
public class C86406a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C86406a f193687a;

    static {
        Covode.recordClassIndex(101634);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private C86406a(Context context) {
        super(context, "fangqing.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static C86406a m149056a(Context context) {
        MethodCollector.m26663i(6561);
        if (f193687a == null) {
            synchronized (C86406a.class) {
                try {
                    if (f193687a == null) {
                        f193687a = new C86406a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6561);
                    throw th;
                }
            }
        }
        C86406a aVar = f193687a;
        MethodCollector.m26664o(6561);
        return aVar;
    }
}
