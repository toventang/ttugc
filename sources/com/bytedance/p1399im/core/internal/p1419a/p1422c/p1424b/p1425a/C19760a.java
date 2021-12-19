package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1425a;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;

/* renamed from: com.bytedance.im.core.internal.a.c.b.a.a */
public final class C19760a implements AbstractC19751a {

    /* renamed from: a */
    private Cursor f46945a;

    static {
        Covode.recordClassIndex(22604);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: b */
    public final int mo31690b() {
        return this.f46945a.getCount();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: d */
    public final boolean mo31694d() {
        return this.f46945a.moveToNext();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: c */
    public final boolean mo31693c() {
        return this.f46945a.moveToFirst();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: a */
    public final void mo31689a() {
        this.f46945a.close();
    }

    public C19760a(Cursor cursor) {
        this.f46945a = cursor;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: a */
    public final int mo31687a(int i) {
        return this.f46945a.getInt(i);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: c */
    public final String mo31692c(int i) {
        return this.f46945a.getString(i);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: a */
    public final int mo31688a(String str) {
        return this.f46945a.getColumnIndex(str);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: b */
    public final long mo31691b(int i) {
        return this.f46945a.getLong(i);
    }
}
