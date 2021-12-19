package com.bytedance.android.live.publicscreen.impl.p399e;

import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.e.f */
public abstract class AbstractC5949f extends AbstractC5950g {

    /* renamed from: b */
    public long f14881b;

    /* renamed from: c */
    public long f14882c;

    /* renamed from: d */
    public long f14883d;

    static {
        Covode.recordClassIndex(6557);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g
    /* renamed from: b */
    public final void mo11795b() {
        super.mo11795b();
        this.f14881b = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5950g
    /* renamed from: a */
    public void mo11790a(AbstractC5873h hVar, long j) {
        C89219l.m154721d(hVar, "");
        super.mo11790a(hVar, j);
        if (j == 0) {
            this.f14883d = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.p399e.C5945c, com.bytedance.android.live.publicscreen.impl.p399e.AbstractC5944b
    /* renamed from: b */
    public final void mo11797b(AbstractC5873h hVar, long j) {
        C89219l.m154721d(hVar, "");
        super.mo11797b(hVar, j);
        if (j == 0) {
            this.f14882c = System.currentTimeMillis();
        }
    }
}
