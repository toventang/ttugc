package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1425a;

import android.database.sqlite.SQLiteStatement;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;

/* renamed from: com.bytedance.im.core.internal.a.c.b.a.c */
public final class C19762c implements AbstractC19766c {

    /* renamed from: a */
    private SQLiteStatement f46947a;

    static {
        Covode.recordClassIndex(22606);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: a */
    public final int mo31723a() {
        return this.f46947a.executeUpdateDelete();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: b */
    public final long mo31726b() {
        return this.f46947a.executeInsert();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: c */
    public final void mo31727c() {
        this.f46947a.close();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: d */
    public final void mo31728d() {
        this.f46947a.clearBindings();
    }

    public C19762c(SQLiteStatement sQLiteStatement) {
        this.f46947a = sQLiteStatement;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: a */
    public final void mo31724a(int i, long j) {
        this.f46947a.bindLong(i, j);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: a */
    public final void mo31725a(int i, String str) {
        this.f46947a.bindString(i, str);
    }
}
