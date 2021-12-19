package com.bytedance.sdk.p1625a.p1657l.p1660c;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.sdk.a.l.c.a */
public final class C22489a extends SQLiteOpenHelper {
    static {
        Covode.recordClassIndex(26305);
    }

    public C22489a(Context context) {
        super(context, "account_db", (SQLiteDatabase.CursorFactory) null, 2);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(2246);
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS login_info (time integer primary key , type integer , info text , uid integer , avatar_url text , screen_name text , platform_avatar_url text, platform_screen_name text,sec_uid text,ext text);");
            MethodCollector.m26664o(2246);
        } catch (SQLException e) {
            e.printStackTrace();
            MethodCollector.m26664o(2246);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(2249);
        if (i < 2) {
            sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN sec_uid text ");
            sQLiteDatabase.execSQL("alter TABLE login_info add COLUMN ext text ");
        }
        MethodCollector.m26664o(2249);
    }
}
