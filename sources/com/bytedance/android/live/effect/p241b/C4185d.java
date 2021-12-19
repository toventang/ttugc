package com.bytedance.android.live.effect.p241b;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.android.live.effect.model.p246a.C4310a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.b.d */
public final class C4185d extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final C4186a f11649a = new C4186a((byte) 0);

    /* renamed from: b */
    private long f11650b;

    static {
        Covode.recordClassIndex(4755);
    }

    /* renamed from: com.bytedance.android.live.effect.b.d$a */
    public static final class C4186a {
        static {
            Covode.recordClassIndex(4756);
        }

        private C4186a() {
        }

        public /* synthetic */ C4186a(byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010b A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.android.live.effect.model.p246a.C4310a> mo9906a() {
        /*
        // Method dump skipped, instructions count: 328
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.p241b.C4185d.mo9906a():java.util.List");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4185d(Context context) {
        super(context, "live_composer.db", (SQLiteDatabase.CursorFactory) null, 2);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    private final void m10259a(boolean z) {
        if (z) {
            this.f11650b = System.currentTimeMillis();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(6202);
        m10259a(true);
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_node (id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,panel TEXT,effect_id TEXT,resource_id TEXT,path TEXT,update_time INTEGER,use INTEGER)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS live_composer_tag_node(id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,tag TEXT,value REAL,node_id INTEGER)");
        }
        m10259a(false);
        MethodCollector.m26664o(6202);
    }

    /* renamed from: a */
    public final void mo9907a(List<C4310a> list) {
        MethodCollector.m26663i(6205);
        C89219l.m154721d(list, "");
        m10259a(true);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            writableDatabase.delete("live_composer_node", null, null);
            writableDatabase.delete("sqlite_sequence", "name=?", new String[]{"live_composer_node"});
            writableDatabase.delete("live_composer_tag_node", null, null);
            writableDatabase.delete("sqlite_sequence", "name=?", new String[]{"live_composer_tag_node"});
            writableDatabase.setTransactionSuccessful();
        } catch (Throwable th) {
            writableDatabase.endTransaction();
            MethodCollector.m26664o(6205);
            throw th;
        }
        writableDatabase.endTransaction();
        writableDatabase.close();
        SQLiteDatabase writableDatabase2 = getWritableDatabase();
        Iterator<T> it = list.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                T next = it.next();
                writableDatabase2.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("panel", next.f11847a);
                    contentValues.put("effect_id", next.f11848b);
                    contentValues.put("path", next.f11849c);
                    contentValues.put("update_time", Long.valueOf(next.f11851e));
                    if (next.f11854h) {
                        i = 1;
                    }
                    contentValues.put("use", Integer.valueOf(i));
                    long insert = writableDatabase2.insert("live_composer_node", null, contentValues);
                    for (T t : next.f11853g) {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("tag", t.f11856b);
                        contentValues2.put("value", t.f11855a);
                        contentValues2.put("node_id", Long.valueOf(insert));
                        writableDatabase2.insert("live_composer_tag_node", null, contentValues2);
                    }
                    writableDatabase2.setTransactionSuccessful();
                } catch (Throwable th2) {
                    writableDatabase2.endTransaction();
                    MethodCollector.m26664o(6205);
                    throw th2;
                }
                writableDatabase2.endTransaction();
            } else {
                writableDatabase2.close();
                m10259a(false);
                MethodCollector.m26664o(6205);
                return;
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(6374);
        if (sQLiteDatabase == null) {
            MethodCollector.m26664o(6374);
            return;
        }
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_node");
        sQLiteDatabase.execSQL("Drop Table if exists live_composer_tag_node");
        onCreate(sQLiteDatabase);
        MethodCollector.m26664o(6374);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(6209);
        if (i >= 2 || sQLiteDatabase == null) {
            MethodCollector.m26664o(6209);
            return;
        }
        sQLiteDatabase.execSQL("ALTER TABLE live_composer_node ADD COLUMN resource_id TEXT DEFAULT \"\" NOT NULL;");
        MethodCollector.m26664o(6209);
    }
}
