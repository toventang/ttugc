package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.a.b */
public class C55266b {

    /* renamed from: a */
    private static C55266b f126370a;

    /* renamed from: b */
    private C55265a f126371b;

    /* renamed from: c */
    private SQLiteDatabase f126372c = m101028e();

    /* renamed from: d */
    private String f126373d;

    static {
        Covode.recordClassIndex(65015);
    }

    private C55266b() {
    }

    /* renamed from: d */
    private boolean m101027d() {
        SQLiteDatabase sQLiteDatabase = this.f126372c;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            this.f126372c = m101028e();
        }
        if (this.f126372c == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C55266b m101026a() {
        MethodCollector.m26663i(3765);
        if (f126370a == null) {
            synchronized (C55266b.class) {
                try {
                    if (f126370a == null) {
                        f126370a = new C55266b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3765);
                    throw th;
                }
            }
        }
        C55266b bVar = f126370a;
        MethodCollector.m26664o(3765);
        return bVar;
    }

    /* renamed from: c */
    public final void mo92266c() {
        MethodCollector.m26663i(4027);
        if (m101027d()) {
            MethodCollector.m26664o(4027);
        } else if (this.f126372c.inTransaction()) {
            try {
                this.f126372c.setTransactionSuccessful();
                this.f126372c.endTransaction();
                MethodCollector.m26664o(4027);
            } catch (Exception e) {
                e.printStackTrace();
                C56244a.m102188a(e);
                MethodCollector.m26664o(4027);
            }
        } else {
            Thread.currentThread();
            new RuntimeException();
            MethodCollector.m26664o(4027);
        }
    }

    /* renamed from: e */
    private SQLiteDatabase m101028e() {
        MethodCollector.m26663i(3784);
        try {
            if (this.f126372c == null || !TextUtils.equals("db_im_xx", this.f126373d) || !this.f126372c.isOpen()) {
                SQLiteDatabase sQLiteDatabase = this.f126372c;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        C56244a.m102188a(e);
                    }
                }
                if (this.f126371b == null) {
                    this.f126371b = new C55265a(C17867d.m33078a(), "db_im_xx");
                }
                this.f126373d = "db_im_xx";
                this.f126372c = this.f126371b.getWritableDatabase();
                SQLiteDatabase sQLiteDatabase2 = this.f126372c;
                MethodCollector.m26664o(3784);
                return sQLiteDatabase2;
            }
            SQLiteDatabase sQLiteDatabase3 = this.f126372c;
            MethodCollector.m26664o(3784);
            return sQLiteDatabase3;
        } catch (Exception e2) {
            if (C80720e.m139940f() < 20971520) {
                C13628n.m24506a(C17867d.m33078a(), (int) R.string.cgs);
            }
            e2.printStackTrace();
            C56244a.m102188a(e2);
        }
    }

    /* renamed from: b */
    public final void mo92265b() {
        MethodCollector.m26663i(4022);
        if (m101027d()) {
            MethodCollector.m26664o(4022);
        } else if (this.f126372c.inTransaction()) {
            Thread.currentThread();
            new RuntimeException();
            MethodCollector.m26664o(4022);
        } else {
            try {
                this.f126372c.beginTransaction();
                MethodCollector.m26664o(4022);
            } catch (Exception e) {
                e.printStackTrace();
                C56244a.m102188a(e);
                MethodCollector.m26664o(4022);
            }
        }
    }

    /* renamed from: b */
    public final Cursor mo92264b(String str) {
        MethodCollector.m26663i(4002);
        Cursor cursor = null;
        if (m101027d()) {
            MethodCollector.m26664o(4002);
            return null;
        }
        try {
            cursor = this.f126372c.rawQuery(str, null);
        } catch (Exception e) {
            e.printStackTrace();
            C56244a.m102188a(e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", Log.getStackTraceString(e));
            C55197c.m100916a("db_query_failed", hashMap);
        }
        MethodCollector.m26664o(4002);
        return cursor;
    }

    /* renamed from: c */
    public final boolean mo92267c(String str) {
        MethodCollector.m26663i(4014);
        if (m101027d()) {
            MethodCollector.m26664o(4014);
            return false;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(4014);
            return false;
        } else {
            try {
                if (this.f126372c.delete(str, null, null) > 0) {
                    MethodCollector.m26664o(4014);
                    return true;
                }
                MethodCollector.m26664o(4014);
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                C56244a.m102188a(e);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e.toString());
                hashMap.put("error_stack", Log.getStackTraceString(e));
                C55197c.m100916a("db_delete_failed", hashMap);
                MethodCollector.m26664o(4014);
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo92263a(String str) {
        MethodCollector.m26663i(3845);
        boolean z = false;
        if (m101027d()) {
            MethodCollector.m26664o(3845);
            return false;
        }
        try {
            this.f126372c.execSQL(str);
            z = true;
        } catch (Exception e) {
            e.printStackTrace();
            C56244a.m102188a(e);
            HashMap hashMap = new HashMap();
            hashMap.put("error", e.toString());
            hashMap.put("error_stack", Log.getStackTraceString(e));
            C55197c.m100916a("db_exec_failed", hashMap);
        }
        MethodCollector.m26664o(3845);
        return z;
    }

    /* renamed from: a */
    public final long mo92262a(String str, ContentValues contentValues) {
        MethodCollector.m26663i(3989);
        if (m101027d()) {
            MethodCollector.m26664o(3989);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(3989);
            return -1;
        } else {
            try {
                long replace = this.f126372c.replace(str, null, contentValues);
                MethodCollector.m26664o(3989);
                return replace;
            } catch (Exception e) {
                e.printStackTrace();
                C56244a.m102188a(e);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e.toString());
                hashMap.put("error_stack", Log.getStackTraceString(e));
                C55197c.m100916a("db_replace_failed", hashMap);
                MethodCollector.m26664o(3989);
                return -1;
            }
        }
    }

    /* renamed from: a */
    public final int mo92261a(String str, ContentValues contentValues, String str2, String[] strArr) {
        MethodCollector.m26663i(3855);
        if (m101027d()) {
            MethodCollector.m26664o(3855);
            return -1;
        } else if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(3855);
            return -1;
        } else {
            try {
                int update = this.f126372c.update(str, contentValues, str2, strArr);
                MethodCollector.m26664o(3855);
                return update;
            } catch (Exception e) {
                e.printStackTrace();
                C56244a.m102188a(e);
                HashMap hashMap = new HashMap();
                hashMap.put("error", e.toString());
                hashMap.put("error_stack", Log.getStackTraceString(e));
                C55197c.m100916a("db_update_failed", hashMap);
                MethodCollector.m26664o(3855);
                return -1;
            }
        }
    }
}
