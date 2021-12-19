package com.toutiao.proxyserver.p4491c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.toutiao.proxyserver.c.d */
public final class C87304d extends SQLiteOpenHelper {
    static {
        Covode.recordClassIndex(103200);
    }

    public C87304d(Context context) {
        super(context, "video.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(8064);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)");
        MethodCollector.m26664o(8064);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        MethodCollector.m26663i(8197);
        if (i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
            MethodCollector.m26664o(8197);
        } else if (i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
            MethodCollector.m26664o(8197);
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_http_header_t");
            onCreate(sQLiteDatabase);
            MethodCollector.m26664o(8197);
        }
    }
}
