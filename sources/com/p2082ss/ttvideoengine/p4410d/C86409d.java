package com.p2082ss.ttvideoengine.p4410d;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ttvideoengine.p4430s.C86641i;

/* renamed from: com.ss.ttvideoengine.d.d */
public class C86409d {

    /* renamed from: a */
    public static SQLiteDatabase f193693a;

    /* renamed from: b */
    public static int f193694b = 200;

    /* renamed from: c */
    private static C86409d f193695c;

    /* renamed from: com.ss.ttvideoengine.d.d$a */
    public static class C86410a {

        /* renamed from: a */
        public long f193696a;

        /* renamed from: b */
        public String f193697b;

        /* renamed from: c */
        public String f193698c;

        static {
            Covode.recordClassIndex(101638);
        }
    }

    static {
        Covode.recordClassIndex(101637);
    }

    /* renamed from: a */
    public static int m149060a() {
        MethodCollector.m26663i(5689);
        if (f193693a == null) {
            MethodCollector.m26664o(5689);
            return -1;
        }
        int i = 0;
        try {
            Cursor rawQuery = f193693a.rawQuery(C1764a.m5928a("SELECT COUNT(*) FROM %s", new Object[]{"videomodel"}), null);
            if (rawQuery.moveToFirst()) {
                i = (int) rawQuery.getLong(0);
            }
            rawQuery.close();
        } catch (Exception unused) {
        }
        C86641i.m150113b("VideoModelDBManager", "count:".concat(String.valueOf(i)));
        MethodCollector.m26664o(5689);
        return i;
    }

    private C86409d(Context context) {
        MethodCollector.m26663i(5685);
        if (context == null) {
            MethodCollector.m26664o(5685);
            return;
        }
        C86406a a = C86406a.m149056a(context);
        if (a != null) {
            try {
                SQLiteDatabase writableDatabase = a.getWritableDatabase();
                f193693a = writableDatabase;
                if (writableDatabase != null) {
                    f193693a.execSQL(C1764a.m5928a("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", new Object[]{"videomodel"}));
                }
                MethodCollector.m26664o(5685);
                return;
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(5685);
    }

    /* renamed from: a */
    public static C86409d m149062a(Context context) {
        MethodCollector.m26663i(5562);
        if (f193695c == null) {
            synchronized (C86409d.class) {
                try {
                    if (f193695c == null) {
                        f193695c = new C86409d(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5562);
                    throw th;
                }
            }
        }
        C86409d dVar = f193695c;
        MethodCollector.m26664o(5562);
        return dVar;
    }

    /* renamed from: a */
    public static C86410a m149061a(String str) {
        C86410a aVar;
        MethodCollector.m26663i(5687);
        C86410a aVar2 = null;
        if (TextUtils.isEmpty(str) || f193693a == null) {
            MethodCollector.m26664o(5687);
            return null;
        }
        try {
            Cursor rawQuery = f193693a.rawQuery(C1764a.m5928a("SELECT * FROM %s WHERE vid='%s'", new Object[]{"videomodel", str}), null);
            aVar = new C86410a();
            try {
                aVar.f193698c = str;
                if (rawQuery.moveToFirst()) {
                    aVar.f193697b = rawQuery.getString(rawQuery.getColumnIndex("videomodel"));
                    aVar.f193696a = rawQuery.getLong(rawQuery.getColumnIndex("time"));
                }
                rawQuery.close();
                C86641i.m150113b("VideoModelDBManager", "query vid:" + str + " videomodel:" + aVar.f193697b);
            } catch (Exception unused) {
                aVar2 = aVar;
                aVar = aVar2;
                MethodCollector.m26664o(5687);
                return aVar;
            }
        } catch (Exception unused2) {
            aVar = aVar2;
            MethodCollector.m26664o(5687);
            return aVar;
        }
        MethodCollector.m26664o(5687);
        return aVar;
    }
}
