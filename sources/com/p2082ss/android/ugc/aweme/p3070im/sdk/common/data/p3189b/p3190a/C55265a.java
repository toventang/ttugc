package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55271a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55272b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55274d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.C55836b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.p3228a.EnumC55835a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.data.b.a.a */
public final class C55265a extends SQLiteOpenHelper {

    /* renamed from: a */
    private Context f126367a;

    /* renamed from: b */
    private String f126368b;

    /* renamed from: c */
    private int f126369c;

    static {
        Covode.recordClassIndex(65014);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m101024a(sQLiteDatabase);
    }

    /* renamed from: a */
    private static void m101024a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.m26663i(4356);
        sQLiteDatabase.execSQL(C55273c.m101051b());
        sQLiteDatabase.execSQL(C55274d.m101067b());
        sQLiteDatabase.execSQL(C55271a.m101037b());
        sQLiteDatabase.execSQL(C55272b.m101039a());
        MethodCollector.m26664o(4356);
    }

    public C55265a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 22);
        this.f126367a = context;
        this.f126368b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r3.isClosed() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r3.isClosed() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r3.close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m101025a(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55265a.m101025a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f126369c++;
        if (this.f126367a == null || TextUtils.isEmpty(this.f126368b)) {
            m101023a(i, i2, 0);
            super.onDowngrade(sQLiteDatabase, i, i2);
            return;
        }
        try {
            this.f126367a.deleteDatabase(this.f126368b);
            m101024a(sQLiteDatabase);
            if (this.f126369c <= 1) {
                C55836b.m101604a(EnumC55835a.COLDUP_FULL, true);
            }
            m101023a(i, i2, 1);
        } catch (Exception e) {
            m101023a(i, i2, 0);
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2 + " and recover failed", e);
        }
    }

    /* renamed from: a */
    private void m101023a(int i, int i2, int i3) {
        C56244a.m102191c("DBHelper", "onDowngrade: " + this.f126368b + ", [" + i + "->" + i2 + "], " + this.f126369c + ", " + i3);
        HashMap hashMap = new HashMap();
        hashMap.put("error_stack", "[" + i + "," + i2 + "]");
        hashMap.put("count", Integer.valueOf(this.f126369c));
        hashMap.put("status", Integer.valueOf(i3));
        C55197c.m100916a("im_db_downgrade_error", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x03e6, code lost:
        if (r8 <= 10) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 1002
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3190a.C55265a.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
