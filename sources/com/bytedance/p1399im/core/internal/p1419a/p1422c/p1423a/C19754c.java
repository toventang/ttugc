package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1420a.C19741a;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19759b;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1425a.C19761b;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;

/* renamed from: com.bytedance.im.core.internal.a.c.a.c */
public final class C19754c extends SQLiteOpenHelper implements AbstractC19752a {

    /* renamed from: a */
    private C19761b f46938a = new C19761b();

    static {
        Covode.recordClassIndex(22598);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.AbstractC19752a
    /* renamed from: a */
    public final AbstractC19759b mo31695a() {
        C19761b bVar = this.f46938a;
        bVar.f46946a = getWritableDatabase();
        return bVar;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.p1423a.AbstractC19752a, java.lang.AutoCloseable
    public final void close() {
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper close", (Throwable) null);
        super.close();
    }

    public final void setWriteAheadLoggingEnabled(boolean z) {
        super.setWriteAheadLoggingEnabled(z);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper onOpen", (Throwable) null);
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper onConfigure", (Throwable) null);
        if (C19483d.m36365a().mo31141b().f46243ah) {
            sQLiteDatabase.enableWriteAheadLogging();
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper onCreate", (Throwable) null);
        C19741a.m36958a();
        C19761b bVar = this.f46938a;
        bVar.f46946a = sQLiteDatabase;
        C19741a.m36962a(bVar);
    }

    public C19754c(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 38);
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper constructor", (Throwable) null);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper onDowngrade", (Throwable) null);
        C19741a a = C19741a.m36958a();
        this.f46938a.f46946a = sQLiteDatabase;
        a.mo31682a(i, i2);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C19512f.m36457b("imsdk", "LocalSQLiteOpenHelper onUpgrade", (Throwable) null);
        C19741a.m36958a();
        C19761b bVar = this.f46938a;
        bVar.f46946a = sQLiteDatabase;
        C19741a.m36963a(bVar, i, i2);
    }
}
