package com.bytedance.disk.p957b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.disk.b.a */
public class C14428a extends SQLiteOpenHelper {

    /* renamed from: a */
    private static volatile C14428a f34899a;

    static {
        Covode.recordClassIndex(16506);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(1222);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS migration_items_table");
        sQLiteDatabase.execSQL("CREATE TABLE migration_items_table (_id INTEGER PRIMARY KEY AUTOINCREMENT, mig_opt_dir TEXT, mig_opt_reason TEXT NOT NULL, mig_opt_file_len INTEGER NOT NULL DEFAULT -1, mig_opt_from TEXT NOT NULL, mig_opt_to TEXT NOT NULL , mig_opt_policy INTEGER NOT NULL DEFAULT 0, mig_opt_type INTEGER NOT NULL DEFAULT -1, mig_event INTEGER NOT NULL, mig_event_time LONG NOT NULL DEFAULT 0, mig_event_elapsed TEXT, mig_deleted INTEGER NOT NULL DEFAULT 0);");
        MethodCollector.m26664o(1222);
    }

    /* renamed from: a */
    public static C14428a m26339a(Context context) {
        MethodCollector.m26663i(1214);
        if (f34899a == null) {
            synchronized (C14428a.class) {
                try {
                    if (f34899a == null) {
                        f34899a = new C14428a(context, "migration.db");
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(1214);
                    throw th;
                }
            }
        }
        C14428a aVar = f34899a;
        MethodCollector.m26664o(1214);
        return aVar;
    }

    private C14428a(Context context, String str) {
        this(context, str, (byte) 0);
    }

    private C14428a(Context context, String str, byte b) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
