package com.p2082ss.android.message.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.ss.android.message.log.a */
public final class C30067a {

    /* renamed from: a */
    static final String[] f71761a = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json"};

    /* renamed from: b */
    private static final Object f71762b = new Object();

    /* renamed from: c */
    private static C30067a f71763c;

    /* renamed from: d */
    private SQLiteDatabase f71764d;

    static {
        Covode.recordClassIndex(36563);
    }

    /* renamed from: com.ss.android.message.log.a$a */
    static class C30068a extends SQLiteOpenHelper {
        static {
            Covode.recordClassIndex(36564);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C30068a(Context context) {
            super(context, "ss_push_log.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            MethodCollector.m26663i(714);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
                MethodCollector.m26664o(714);
            } catch (Exception unused) {
                MethodCollector.m26664o(714);
            }
        }
    }

    private C30067a(Context context) {
        this.f71764d = new C30068a(context).getWritableDatabase();
    }

    /* renamed from: a */
    private static void m60820a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static C30067a m60819a(Context context) {
        MethodCollector.m26663i(932);
        synchronized (f71762b) {
            try {
                if (f71763c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    f71763c = new C30067a(applicationContext);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(932);
                throw th;
            }
        }
        C30067a aVar = f71763c;
        MethodCollector.m26664o(932);
        return aVar;
    }

    /* renamed from: a */
    public final synchronized long mo53437a(C30069b bVar) {
        MethodCollector.m26663i(961);
        SQLiteDatabase sQLiteDatabase = this.f71764d;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", bVar.f71765a);
                contentValues.put("tag", bVar.f71766b);
                if (!C13627m.m24498a(bVar.f71767c)) {
                    contentValues.put("label", bVar.f71767c);
                }
                contentValues.put("value", Long.valueOf(bVar.f71768d));
                contentValues.put("ext_value", Long.valueOf(bVar.f71769e));
                if (!C13627m.m24498a(bVar.f71770f)) {
                    contentValues.put("ext_json", bVar.f71770f);
                }
                long insert = this.f71764d.insert("event", null, contentValues);
                MethodCollector.m26664o(961);
                return insert;
            }
        }
        MethodCollector.m26664o(961);
        return -1;
    }

    /* renamed from: a */
    public final synchronized boolean mo53438a(long j) {
        MethodCollector.m26663i(966);
        SQLiteDatabase sQLiteDatabase = this.f71764d;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(966);
            return false;
        }
        if (this.f71764d.delete("event", "_id = ?", new String[]{String.valueOf(j)}) > 0) {
            MethodCollector.m26664o(966);
            return true;
        }
        MethodCollector.m26664o(966);
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONArray mo53439b(long r18) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.message.log.C30067a.mo53439b(long):org.json.JSONArray");
    }
}
