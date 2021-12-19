package com.google.android.play.core.p1966e.p1968b;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1966e.AbstractC27054z;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.e.b.j */
public final class C27027j implements AbstractC27054z {

    /* renamed from: a */
    final /* synthetic */ List f63975a;

    /* renamed from: b */
    final /* synthetic */ List f63976b;

    /* renamed from: c */
    final /* synthetic */ long f63977c;

    /* renamed from: d */
    final /* synthetic */ boolean f63978d;

    /* renamed from: e */
    final /* synthetic */ List f63979e;

    /* renamed from: f */
    final /* synthetic */ C27018a f63980f;

    static {
        Covode.recordClassIndex(32503);
    }

    C27027j(C27018a aVar, List list, List list2, long j, boolean z, List list3) {
        this.f63980f = aVar;
        this.f63975a = list;
        this.f63976b = list2;
        this.f63977c = j;
        this.f63978d = z;
        this.f63979e = list3;
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27054z
    /* renamed from: a */
    public final void mo44716a() {
        this.f63980f.f63941f.addAll(this.f63975a);
        this.f63980f.f63942g.addAll(this.f63976b);
        this.f63980f.mo44723a(5, 0, Long.valueOf(this.f63977c), Long.valueOf(this.f63977c), null, null, null);
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27054z
    /* renamed from: b */
    public final void mo44718b() {
        if (!this.f63978d) {
            this.f63980f.mo44722a(this.f63979e, this.f63975a, this.f63976b, this.f63977c, true);
        }
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27054z
    /* renamed from: a */
    public final void mo44717a(int i) {
        this.f63980f.mo44725c(i);
    }
}
