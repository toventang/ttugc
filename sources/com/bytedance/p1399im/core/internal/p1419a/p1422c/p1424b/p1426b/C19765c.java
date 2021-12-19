package com.bytedance.p1399im.core.internal.p1419a.p1422c.p1424b.p1426b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c;
import com.tencent.wcdb.database.C87260m;

/* renamed from: com.bytedance.im.core.internal.a.c.b.b.c */
public final class C19765c implements AbstractC19766c {

    /* renamed from: a */
    private C87260m f46950a;

    static {
        Covode.recordClassIndex(22609);
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: a */
    public final int mo31723a() {
        return this.f46950a.mo141265g();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: b */
    public final long mo31726b() {
        return this.f46950a.mo141266h();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: c */
    public final void mo31727c() {
        this.f46950a.close();
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: d */
    public final void mo31728d() {
        this.f46950a.mo141249f();
    }

    public C19765c(C87260m mVar) {
        this.f46950a = mVar;
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: a */
    public final void mo31724a(int i, long j) {
        this.f46950a.mo141246a(i, Long.valueOf(j));
    }

    @Override // com.bytedance.p1399im.core.internal.p1419a.p1422c.AbstractC19766c
    /* renamed from: a */
    public final void mo31725a(int i, String str) {
        C87260m mVar = this.f46950a;
        if (str != null) {
            mVar.mo141246a(i, str);
            return;
        }
        throw new IllegalArgumentException("the bind value at index " + i + " is null");
    }
}
