package com.bytedance.bdturing.p862b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.bytedance.bdturing.C13285g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.bdturing.b.b */
public final class C13251b {

    /* renamed from: a */
    public static C13249a f32364a;

    /* renamed from: b */
    public static final C13251b f32365b = new C13251b();

    private C13251b() {
    }

    static {
        Covode.recordClassIndex(15213);
    }

    /* renamed from: a */
    private static SQLiteDatabase m23822a() {
        try {
            C13249a aVar = f32364a;
            if (aVar != null) {
                return aVar.getWritableDatabase();
            }
            return null;
        } catch (SQLiteException e) {
            C13285g.m23900a(e);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo21416a(String str) {
        if (str != null) {
            m23821a("settings", str);
        }
    }

    /* renamed from: b */
    public final String mo21417b(String str) {
        String str2;
        Cursor cursor;
        MethodCollector.m26663i(2654);
        synchronized (this) {
            try {
                C13285g.m23905d("query");
                SQLiteDatabase a = m23822a();
                str2 = null;
                if (a != null) {
                    cursor = a.query("h5_storage", new String[]{"content"}, "primary_key=?", new String[]{str}, null, null, null, "1");
                } else {
                    cursor = null;
                }
                if (cursor != null && cursor.moveToFirst()) {
                    str2 = cursor.getString(0);
                }
                if (cursor != null) {
                    cursor.close();
                }
            } finally {
                MethodCollector.m26664o(2654);
            }
        }
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0077, code lost:
        if (r3 == null) goto L_0x007d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m23821a(java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.p862b.C13251b.m23821a(java.lang.String, java.lang.String):long");
    }
}
