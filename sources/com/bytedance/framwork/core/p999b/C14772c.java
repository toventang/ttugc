package com.bytedance.framwork.core.p999b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.framwork.core.p999b.p1001b.C14771a;
import com.bytedance.framwork.core.p999b.p1004e.C14796b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.framwork.core.b.c */
public final class C14772c {

    /* renamed from: a */
    static boolean f36003a;

    /* renamed from: b */
    static boolean f36004b;

    /* renamed from: c */
    static long f36005c = 5000;

    /* renamed from: d */
    static final String[] f36006d = {"_id", "data"};

    /* renamed from: j */
    private static C14772c f36007j;

    /* renamed from: k */
    private static String f36008k = "SELECT count(*) FROM monitor_log WHERE aid = ?";

    /* renamed from: l */
    private static String f36009l = "SELECT count(*) FROM monitor_log";

    /* renamed from: e */
    String f36010e = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    /* renamed from: f */
    private Map<String, Integer> f36011f = new HashMap(2);

    /* renamed from: g */
    private int f36012g = 0;

    /* renamed from: h */
    private Context f36013h;

    /* renamed from: i */
    private SQLiteDatabase f36014i;

    /* renamed from: a */
    public final synchronized void mo23801a(String str, List<C14771a> list) {
        MethodCollector.m26663i(11022);
        if (this.f36014i == null || C14796b.m27161a(list)) {
            MethodCollector.m26664o(11022);
            return;
        }
        m27123b();
        this.f36014i.beginTransaction();
        try {
            SQLiteStatement compileStatement = this.f36014i.compileStatement(this.f36010e);
            for (C14771a aVar : list) {
                compileStatement.bindString(1, String.valueOf(aVar.f35998b));
                compileStatement.bindString(2, aVar.f35999c == null ? "" : aVar.f35999c);
                compileStatement.bindString(3, aVar.f36000d == null ? "" : aVar.f36000d);
                compileStatement.bindLong(4, aVar.f36002f);
                compileStatement.bindString(5, aVar.f36001e == null ? "" : aVar.f36001e);
                compileStatement.executeInsert();
            }
            this.f36014i.setTransactionSuccessful();
            m27120a(str, list.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.f36014i.endTransaction();
            MethodCollector.m26664o(11022);
        }
    }

    /* renamed from: a */
    public final List<C14771a> mo23800a(int i, int i2) {
        MethodCollector.m26663i(11477);
        Cursor cursor = null;
        try {
            Cursor query = this.f36014i.query("monitor_log", f36006d, "aid= ?", new String[]{String.valueOf(i)}, null, null, "_id ASC ", String.valueOf(i2));
            try {
                if (query.getCount() == 0) {
                    m27119a(query);
                    MethodCollector.m26664o(11477);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (query.moveToNext()) {
                    linkedList.add(new C14771a(query.getLong(query.getColumnIndex("_id")), query.getString(query.getColumnIndex("data"))));
                }
                m27119a(query);
                MethodCollector.m26664o(11477);
                return linkedList;
            } catch (Throwable unused) {
                cursor = query;
                m27119a(cursor);
                List<C14771a> emptyList = Collections.emptyList();
                MethodCollector.m26664o(11477);
                return emptyList;
            }
        } catch (Throwable unused2) {
            m27119a(cursor);
            List<C14771a> emptyList2 = Collections.emptyList();
            MethodCollector.m26664o(11477);
            return emptyList2;
        }
    }

    static {
        Covode.recordClassIndex(16872);
    }

    /* renamed from: a */
    private synchronized int m27117a() {
        MethodCollector.m26663i(11969);
        SQLiteDatabase sQLiteDatabase = this.f36014i;
        int i = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(11969);
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f36014i.rawQuery(f36009l, null);
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m27119a((Cursor) null);
            MethodCollector.m26664o(11969);
            throw th;
        }
        m27119a(cursor);
        MethodCollector.m26664o(11969);
        return i;
    }

    /* renamed from: c */
    private synchronized void m27124c() {
        MethodCollector.m26663i(12111);
        if (this.f36014i != null) {
            try {
                this.f36014i.execSQL(new StringBuilder(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT 500)").toString());
                MethodCollector.m26664o(12111);
            } catch (Exception e) {
                e.printStackTrace();
                MethodCollector.m26664o(12111);
            }
        } else {
            MethodCollector.m26664o(12111);
        }
    }

    /* renamed from: b */
    private synchronized void m27123b() {
        MethodCollector.m26663i(12110);
        if (!f36004b) {
            f36004b = true;
            if (((long) m27117a()) >= f36005c) {
                m27124c();
            }
        }
        if (!f36003a) {
            f36003a = true;
            try {
                File databasePath = this.f36013h.getDatabasePath("psdkmon" + ".db");
                if (databasePath.exists()) {
                    m27121a(databasePath);
                }
                MethodCollector.m26664o(12110);
                return;
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(12110);
    }

    /* renamed from: a */
    private static void m27119a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private C14772c(Context context) {
        this.f36013h = context;
        this.f36014i = C14766a.m27096a(context).getWritableDatabase();
    }

    /* renamed from: a */
    public static C14772c m27118a(Context context) {
        MethodCollector.m26663i(10880);
        if (f36007j == null) {
            synchronized (C14766a.class) {
                try {
                    if (f36007j == null) {
                        f36007j = new C14772c(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10880);
                    throw th;
                }
            }
        }
        C14772c cVar = f36007j;
        MethodCollector.m26664o(10880);
        return cVar;
    }

    /* renamed from: b */
    private synchronized int m27122b(String str) {
        MethodCollector.m26663i(11814);
        SQLiteDatabase sQLiteDatabase = this.f36014i;
        int i = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            MethodCollector.m26664o(11814);
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f36014i.rawQuery(f36008k, new String[]{str});
            if (cursor.moveToNext()) {
                i = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            m27119a((Cursor) null);
            MethodCollector.m26664o(11814);
            throw th;
        }
        m27119a(cursor);
        MethodCollector.m26664o(11814);
        return i;
    }

    /* renamed from: a */
    private static boolean m27121a(File file) {
        MethodCollector.m26663i(12253);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(12253);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(12253);
        return delete;
    }

    /* renamed from: a */
    public final synchronized int mo23798a(String str) {
        int i;
        MethodCollector.m26663i(11970);
        if (this.f36012g > 10 || !this.f36011f.containsKey(str)) {
            i = m27122b(str);
            this.f36011f.put(str, Integer.valueOf(i));
            this.f36012g = 0;
        } else {
            i = this.f36011f.get(str).intValue();
            this.f36012g++;
        }
        MethodCollector.m26664o(11970);
        return i;
    }

    /* renamed from: a */
    private void m27120a(String str, int i) {
        if (this.f36011f.containsKey(str) || i <= 0) {
            this.f36011f.put(str, Integer.valueOf(Math.max(0, i + this.f36011f.get(str).intValue())));
            return;
        }
        this.f36011f.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized int mo23799a(String str, long j) {
        MethodCollector.m26663i(11651);
        if (this.f36014i != null) {
            if (j >= 0) {
                int delete = this.f36014i.delete("monitor_log", "aid = ? AND _id<= ? ", new String[]{str, String.valueOf(j)});
                m27120a(str, delete * -1);
                MethodCollector.m26664o(11651);
                return delete;
            }
        }
        MethodCollector.m26664o(11651);
        return -1;
    }
}
