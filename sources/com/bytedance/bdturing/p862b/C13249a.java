package com.bytedance.bdturing.p862b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.bdturing.b.a */
public final class C13249a extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final C13250a f32363a = new C13250a((byte) 0);

    static {
        Covode.recordClassIndex(15211);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C89219l.m154719c(sQLiteDatabase, "");
    }

    /* renamed from: com.bytedance.bdturing.b.a$a */
    public static final class C13250a {
        static {
            Covode.recordClassIndex(15212);
        }

        private C13250a() {
        }

        public /* synthetic */ C13250a(byte b) {
            this();
        }
    }

    public C13249a(Context context) {
        super(context, "verifystorage.db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(2451);
        C89219l.m154719c(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS h5_storage (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    primary_key TEXT,\n    time_stamp LONG, \n    content TEXT\n    )");
        MethodCollector.m26664o(2451);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(2452);
        C89219l.m154719c(sQLiteDatabase, "");
        sQLiteDatabase.execSQL("DROP TABLE h5_storage");
        onCreate(sQLiteDatabase);
        MethodCollector.m26664o(2452);
    }
}
