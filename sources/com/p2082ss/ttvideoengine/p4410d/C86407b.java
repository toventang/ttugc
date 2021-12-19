package com.p2082ss.ttvideoengine.p4410d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttvideoengine.d.b */
public final class C86407b extends SQLiteOpenHelper {

    /* renamed from: a */
    private static Integer f193688a = 1;

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    static {
        Covode.recordClassIndex(101635);
    }

    public C86407b(Context context, String str) {
        this(context, str, f193688a.intValue(), (byte) 0);
    }

    private C86407b(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
    }

    private C86407b(Context context, String str, int i, byte b) {
        this(context, str, i);
    }
}
