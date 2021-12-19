package com.p2082ss.android.common.applog;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.common.applog.d */
public final class C29786d {

    /* renamed from: a */
    static volatile String f71034a = "ss_app_log.db";

    /* renamed from: b */
    static final String[] f71035b = {"_id", StringSet.name, "duration", "session_id"};

    /* renamed from: c */
    static final String[] f71036c = {"_id", "value", "is_crash", "timestamp", "retry_count", "retry_time", "log_type"};

    /* renamed from: d */
    static final String[] f71037d = {"_id", "value", "timestamp", "duration", "non_page", "app_version", "version_code", "pausetime", "launch_sent", "event_index"};

    /* renamed from: e */
    static final String[] f71038e = {"_id", "category", "tag", "label", "value", "ext_value", "ext_json", "user_id", "timestamp", "session_id", "event_index"};

    /* renamed from: f */
    static final String[] f71039f = {"_id", "log_type", "value", "session_id"};

    /* renamed from: g */
    static final String[] f71040g = {"_id", "log_type", "value"};

    /* renamed from: h */
    static final Object f71041h = new Object();

    /* renamed from: i */
    static C29786d f71042i;

    /* renamed from: j */
    private static final String[] f71043j = {"event", "page", "session", "misc_log", "succ_rate", "queue"};

    /* renamed from: k */
    private SQLiteDatabase f71044k;

    /* renamed from: l */
    private final Context f71045l;

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo52054a(com.p2082ss.android.common.applog.C29796j r7, long r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29786d.mo52054a(com.ss.android.common.applog.j, long):long");
    }

    /* renamed from: a */
    public final synchronized long mo52055a(C29802p pVar) {
        MethodCollector.m26663i(13660);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                boolean z = pVar.f71118i;
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", pVar.f71111b);
                contentValues.put("timestamp", Long.valueOf(pVar.f71112c));
                contentValues.put("duration", Integer.valueOf(pVar.f71114e));
                contentValues.put("non_page", Integer.valueOf(z ? 1 : 0));
                contentValues.put("app_version", pVar.f71115f);
                contentValues.put("version_code", Integer.valueOf(pVar.f71116g));
                contentValues.put("event_index", Long.valueOf(pVar.f71113d));
                long insert = this.f71044k.insert("session", null, contentValues);
                MethodCollector.m26664o(13660);
                return insert;
            }
        }
        MethodCollector.m26664o(13660);
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo52057a(String str) {
        long insert;
        MethodCollector.m26663i(13738);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        contentValues.put("retry_time", (Long) 0L);
        contentValues.put("log_type", (Integer) 0);
        insert = this.f71044k.insert("queue", null, contentValues);
        MethodCollector.m26664o(13738);
        return insert;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo52060a(long j, String str) {
        MethodCollector.m26663i(13795);
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", str);
        this.f71044k.update("queue", contentValues, "_id = ?", new String[]{String.valueOf(j)});
        MethodCollector.m26664o(13795);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a2, code lost:
        if (1 != 0) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d4, code lost:
        if (r21 == false) goto L_0x00df;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo52061a(long r19, boolean r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29786d.mo52061a(long, boolean, java.lang.String):boolean");
    }

    /* renamed from: a */
    public final synchronized void mo52059a() {
        MethodCollector.m26663i(13915);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(13915);
            return;
        }
        try {
            this.f71044k.delete("queue", "timestamp <= ? OR retry_count > 10", new String[]{String.valueOf(System.currentTimeMillis() - 432000000)});
            MethodCollector.m26664o(13915);
        } catch (Exception unused) {
            MethodCollector.m26664o(13915);
        }
    }

    /* renamed from: a */
    public final synchronized C29795i mo52058a(long j) {
        Cursor cursor;
        Throwable th;
        MethodCollector.m26663i(13959);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        Cursor cursor2 = null;
        C29795i iVar = null;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(13959);
            return null;
        }
        try {
            cursor = this.f71044k.query("queue", f71036c, "_id > ?", new String[]{String.valueOf(j)}, null, null, "_id ASC", "1");
            try {
                if (cursor.moveToNext()) {
                    C29795i iVar2 = new C29795i();
                    iVar2.f71077a = (long) cursor.getInt(0);
                    iVar2.f71078b = cursor.getString(1);
                    iVar2.f71079c = cursor.getLong(3);
                    iVar2.f71080d = cursor.getInt(4);
                    iVar2.f71081e = cursor.getLong(5);
                    iVar2.f71082f = cursor.getInt(6);
                    iVar = iVar2;
                }
                m59987a(cursor);
                MethodCollector.m26664o(13959);
                return iVar;
            } catch (Exception unused) {
                m59987a(cursor);
                MethodCollector.m26664o(13959);
                return null;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                m59987a(cursor2);
                MethodCollector.m26664o(13959);
                throw th;
            }
        } catch (Exception unused2) {
            cursor = null;
            m59987a(cursor);
            MethodCollector.m26664o(13959);
            return null;
        } catch (Throwable th3) {
            th = th3;
            m59987a(cursor2);
            MethodCollector.m26664o(13959);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0592, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0594, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0209 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0351  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0389 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03c9 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03d9 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03e8 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0428 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0437 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0447 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0469 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x049d A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04e2 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04e3 A[Catch:{ Exception -> 0x05ad, all -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0592 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:141:0x0361] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0594 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:88:0x0211] */
    /* JADX WARNING: Removed duplicated region for block: B:241:? A[ExcHandler: Exception (unused java.lang.Exception), PHI: r2 
      PHI: (r2v3 com.ss.android.common.applog.d) = (r2v4 com.ss.android.common.applog.d), (r2v0 com.ss.android.common.applog.d) binds: [B:141:0x0361, B:22:0x008c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:22:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0203 A[SYNTHETIC, Splitter:B:83:0x0203] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo52056a(com.p2082ss.android.common.applog.C29802p r47, com.p2082ss.android.common.applog.C29802p r48, org.json.JSONObject r49, boolean r50, long[] r51, java.lang.String[] r52, java.util.List<com.p2082ss.android.common.applog.AppLog.AbstractC29762h> r53, boolean r54, org.json.JSONObject r55) {
        /*
        // Method dump skipped, instructions count: 1479
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29786d.mo52056a(com.ss.android.common.applog.p, com.ss.android.common.applog.p, org.json.JSONObject, boolean, long[], java.lang.String[], java.util.List, boolean, org.json.JSONObject):long");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo52063b() {
        MethodCollector.m26663i(6310);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(6310);
            return;
        }
        for (String str : f71043j) {
            try {
                this.f71044k.delete(str, null, null);
            } catch (Throwable unused) {
            }
        }
        MethodCollector.m26664o(6310);
    }

    static {
        Covode.recordClassIndex(36191);
    }

    /* renamed from: com.ss.android.common.applog.d$a */
    static class C29787a extends SQLiteOpenHelper {
        static {
            Covode.recordClassIndex(36192);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public C29787a(Context context) {
            super(context, C29786d.f71034a, (SQLiteDatabase.CursorFactory) null, 10);
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            MethodCollector.m26663i(7070);
            try {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value VARCHAR NOT NULL, timestamp INTEGER, duration INTEGER, non_page INTEGER, app_version VARCHAR, version_code INTEGER, pausetime INTEGER,launch_sent INTEGER NOT NULL DEFAULT 0, event_index INTEGER NOT NULL DEFAULT 0  )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT, user_id INTEGER, timestamp INTEGER, session_id INTEGER, event_index INTEGER NOT NULL DEFAULT 0 )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS page ( _id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, duration INTEGER, session_id INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value TEXT, is_crash INTEGER NOT NULL DEFAULT 0, log_type INTEGER NOT NULL DEFAULT 0, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS succ_rate ( _id INTEGER PRIMARY KEY AUTOINCREMENT, event_name VARCHAR, event_fail_reason INTEGER, event_fail_cnt INTEGER NOT NULL DEFAULT 0, event_date INTEGER )");
                MethodCollector.m26664o(7070);
            } catch (Exception unused) {
                MethodCollector.m26664o(7070);
            }
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            MethodCollector.m26663i(7214);
            if (i < 2) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN user_id INTEGER");
            }
            if (i < 3) {
                sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN launch_sent INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE queue ADD COLUMN is_crash INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN ext_json TEXT");
            }
            if (i < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE queue ADD COLUMN log_type INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 7) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS misc_log ( _id INTEGER PRIMARY KEY AUTOINCREMENT, log_type VARCHAR, value TEXT, session_id INTEGER  )");
            }
            if (i < 8) {
                sQLiteDatabase.execSQL("ALTER TABLE event ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 9) {
                sQLiteDatabase.execSQL("ALTER TABLE session ADD COLUMN event_index INTEGER NOT NULL DEFAULT 0");
            }
            if (i < 10) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS succ_rate ( _id INTEGER PRIMARY KEY AUTOINCREMENT, event_name VARCHAR, event_fail_reason INTEGER, event_fail_cnt INTEGER NOT NULL DEFAULT 0, event_date INTEGER )");
            }
            MethodCollector.m26664o(7214);
        }
    }

    /* renamed from: a */
    private static void m59987a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C29786d(Context context) {
        this.f71044k = new C29787a(context).getWritableDatabase();
        this.f71045l = context;
    }

    /* renamed from: a */
    public static C29786d m59984a(Context context) {
        MethodCollector.m26663i(13369);
        synchronized (f71041h) {
            try {
                if (f71042i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    f71042i = new C29786d(applicationContext);
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(13369);
                throw th;
            }
        }
        C29786d dVar = f71042i;
        MethodCollector.m26664o(13369);
        return dVar;
    }

    /* renamed from: c */
    public final synchronized void mo52064c(long j) {
        MethodCollector.m26663i(14023);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(14023);
            return;
        }
        try {
            String[] strArr = {String.valueOf(j)};
            ContentValues contentValues = new ContentValues();
            contentValues.put("launch_sent", (Integer) 1);
            this.f71044k.update("session", contentValues, "_id=?", strArr);
            MethodCollector.m26664o(14023);
        } catch (Exception unused) {
            MethodCollector.m26664o(14023);
        }
    }

    /* renamed from: b */
    public final synchronized C29802p mo52062b(long j) {
        Cursor cursor;
        Throwable th;
        String str;
        String[] strArr;
        boolean z;
        MethodCollector.m26663i(13998);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        C29802p pVar = null;
        Cursor cursor2 = null;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(13998);
            return null;
        }
        boolean z2 = true;
        if (j > 0) {
            str = "_id < ?";
            try {
                strArr = new String[]{String.valueOf(j)};
            } catch (Exception unused) {
                cursor = null;
                m59987a(cursor);
                MethodCollector.m26664o(13998);
                return null;
            } catch (Throwable th2) {
                th = th2;
                m59987a(cursor2);
                MethodCollector.m26664o(13998);
                throw th;
            }
        } else {
            str = null;
            strArr = null;
        }
        cursor = this.f71044k.query("session", f71037d, str, strArr, null, null, "_id DESC", "1");
        try {
            if (cursor.moveToNext()) {
                C29802p pVar2 = new C29802p();
                pVar2.f71110a = (long) cursor.getInt(0);
                pVar2.f71111b = cursor.getString(1);
                pVar2.f71112c = cursor.getLong(2);
                if (cursor.getInt(4) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                pVar2.f71118i = z;
                pVar2.f71115f = cursor.getString(5);
                pVar2.f71116g = cursor.getInt(6);
                pVar2.f71117h = (long) cursor.getInt(7);
                if (cursor.getInt(8) <= 0) {
                    z2 = false;
                }
                pVar2.f71119j = z2;
                pVar2.f71113d = cursor.getLong(9);
                pVar2.f71120k = false;
                pVar = pVar2;
            }
            m59987a(cursor);
            MethodCollector.m26664o(13998);
            return pVar;
        } catch (Exception unused2) {
            m59987a(cursor);
            MethodCollector.m26664o(13998);
            return null;
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            m59987a(cursor2);
            MethodCollector.m26664o(13998);
            throw th;
        }
    }

    /* renamed from: a */
    public final synchronized long mo52053a(C29794h hVar) {
        MethodCollector.m26663i(13561);
        SQLiteDatabase sQLiteDatabase = this.f71044k;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("category", hVar.f71065b);
                contentValues.put("tag", hVar.f71066c);
                if (!C13627m.m24498a(hVar.f71067d)) {
                    contentValues.put("label", hVar.f71067d);
                }
                contentValues.put("value", Long.valueOf(hVar.f71068e));
                contentValues.put("ext_value", Long.valueOf(hVar.f71069f));
                if (!C13627m.m24498a(hVar.f71073j)) {
                    contentValues.put("ext_json", hVar.f71073j);
                }
                contentValues.put("user_id", Long.valueOf(hVar.f71070g));
                contentValues.put("timestamp", Long.valueOf(hVar.f71071h));
                contentValues.put("session_id", Long.valueOf(hVar.f71072i));
                contentValues.put("event_index", Long.valueOf(hVar.f71076m));
                long insert = this.f71044k.insert("event", null, contentValues);
                MethodCollector.m26664o(13561);
                return insert;
            }
        }
        MethodCollector.m26664o(13561);
        return -1;
    }

    /* renamed from: a */
    private static void m59988a(Cursor cursor, SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(13445);
        m59987a(cursor);
        if (sQLiteDatabase != null) {
            try {
                if (sQLiteDatabase.inTransaction()) {
                    sQLiteDatabase.endTransaction();
                }
            } catch (Exception unused) {
                MethodCollector.m26664o(13445);
                return;
            }
        }
        MethodCollector.m26664o(13445);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0103, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0106, code lost:
        m59987a(r2);
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6307);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:4:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x0049] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0105 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.json.JSONArray m59985a(long r29, org.json.JSONObject r31, org.json.JSONObject r32) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29786d.m59985a(long, org.json.JSONObject, org.json.JSONObject):org.json.JSONArray");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized long mo52052a(long j, String str, String str2) {
        long insert;
        MethodCollector.m26663i(13796);
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_type", str);
        contentValues.put("value", str2);
        contentValues.put("session_id", Long.valueOf(j));
        insert = this.f71044k.insert("misc_log", null, contentValues);
        MethodCollector.m26664o(13796);
        return insert;
    }

    /* renamed from: b */
    private static void m59990b(List<AppLog.AbstractC29762h> list, long j, String str, JSONObject jSONObject) {
        MethodCollector.m26663i(6304);
        if (list == null) {
            MethodCollector.m26664o(6304);
            return;
        }
        synchronized (list) {
            try {
                for (AppLog.AbstractC29762h hVar : list) {
                    try {
                        hVar.mo29091b(j, str, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } finally {
                MethodCollector.m26664o(6304);
            }
        }
    }

    /* renamed from: a */
    private static void m59989a(List<AppLog.AbstractC29762h> list, long j, String str, JSONObject jSONObject) {
        MethodCollector.m26663i(6301);
        if (list == null) {
            MethodCollector.m26664o(6301);
            return;
        }
        synchronized (list) {
            try {
                for (AppLog.AbstractC29762h hVar : list) {
                    try {
                        hVar.mo29090a(j, str, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } finally {
                MethodCollector.m26664o(6301);
            }
        }
    }

    /* renamed from: a */
    private static void m59986a(long j, String str, String str2, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("db_id", j);
            jSONObject.put("fail_cause", str);
            if (th != null) {
                jSONObject.put("exception", th.toString());
            }
            JSONArray optJSONArray = new JSONObject(str2).optJSONArray("event_v3");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                long j2 = Long.MIN_VALUE;
                long j3 = Long.MAX_VALUE;
                long j4 = Long.MAX_VALUE;
                String str3 = null;
                String str4 = null;
                long j5 = Long.MIN_VALUE;
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        long optLong = jSONObject2.optLong("tea_event_index");
                        long optLong2 = jSONObject2.optLong("local_time_ms");
                        if (optLong > j2) {
                            str4 = jSONObject2.optString("event");
                            j2 = optLong;
                            j5 = optLong2;
                        }
                        if (optLong < j3) {
                            str3 = jSONObject2.optString("event");
                            j3 = optLong;
                            j4 = optLong2;
                        }
                    }
                }
                jSONObject.put("session_id", (Object) null);
                jSONObject.put("min_event_index", j3);
                jSONObject.put("min_event_time", j4);
                jSONObject.put("min_event_name", str3);
                jSONObject.put("max_event_index", j2);
                jSONObject.put("max_event_time", j5);
                jSONObject.put("max_event_name", str4);
            }
        } catch (JSONException unused) {
        }
        C29819a.m60077a("monitor_delete_failed", jSONObject);
    }
}
