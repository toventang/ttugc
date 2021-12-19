package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1426b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a;
import com.tencent.wcdb.AbstractC87236d;

/* renamed from: com.bytedance.im.core.internal.a.c.b.b.a */
public final class C19763a implements AbstractC19751a {

    /* renamed from: a */
    private AbstractC87236d f46948a;

    static {
        Covode.recordClassIndex(22607);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: b */
    public final int mo31690b() {
        return this.f46948a.getCount();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: d */
    public final boolean mo31694d() {
        return this.f46948a.moveToNext();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: c */
    public final boolean mo31693c() {
        return this.f46948a.moveToFirst();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: a */
    public final void mo31689a() {
        this.f46948a.close();
    }

    public C19763a(AbstractC87236d dVar) {
        this.f46948a = dVar;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: a */
    public final int mo31687a(int i) {
        return this.f46948a.getInt(i);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: c */
    public final String mo31692c(int i) {
        return this.f46948a.getString(i);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: a */
    public final int mo31688a(String str) {
        return this.f46948a.getColumnIndex(str);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19751a
    /* renamed from: b */
    public final long mo31691b(int i) {
        return this.f46948a.getLong(i);
    }
}
