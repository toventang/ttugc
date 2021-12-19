package com.p2082ss.android.ugc.aweme.p4173ug.p4176b;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.ug.b.a */
public class C79583a extends SQLiteOpenHelper {

    /* renamed from: c */
    private static C79583a f178576c;

    /* renamed from: a */
    public SQLiteDatabase f178577a = getWritableDatabase();

    /* renamed from: b */
    public SQLiteDatabase f178578b = getReadableDatabase();

    static {
        Covode.recordClassIndex(92791);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private C79583a() {
        super(C17867d.m33078a(), "TIKTOK.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static C79583a m138334a() {
        MethodCollector.m26663i(6161);
        if (f178576c == null) {
            synchronized (C79583a.class) {
                try {
                    if (f178576c == null) {
                        f178576c = new C79583a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6161);
                    throw th;
                }
            }
        }
        C79583a aVar = f178576c;
        MethodCollector.m26664o(6161);
        return aVar;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(6319);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_open` (\n\t`open_time`\tINTEGER UNIQUE);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `like_dialog_open` (\n\t`open_time`\tINTEGER,\n\t`version`\tINTEGER\n);");
        MethodCollector.m26664o(6319);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            super.onDowngrade(sQLiteDatabase, i, i2);
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            System.exit(0);
        }
    }
}
