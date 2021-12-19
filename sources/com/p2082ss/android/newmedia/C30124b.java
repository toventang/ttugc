package com.p2082ss.android.newmedia;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import java.io.File;

/* renamed from: com.ss.android.newmedia.b */
public final class C30124b extends ContextWrapper {
    static {
        Covode.recordClassIndex(36623);
    }

    public final File getCacheDir() {
        return super.getCacheDir();
    }

    public C30124b(Context context) {
        super(context);
    }

    public final File getDir(String str, int i) {
        Logger.debug();
        String b = C29843f.m60132b(this);
        if (!C13627m.m24498a(b) && !C13627m.m24498a(str) && b.endsWith(":ad")) {
            str = "ad_".concat(String.valueOf(str));
            Logger.debug();
        }
        return super.getDir(str, i);
    }

    public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
        Logger.debug();
        String b = C29843f.m60132b(this);
        if (!C13627m.m24498a(b) && !C13627m.m24498a(str) && b.endsWith(":ad")) {
            str = "ad_".concat(String.valueOf(str));
            Logger.debug();
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
