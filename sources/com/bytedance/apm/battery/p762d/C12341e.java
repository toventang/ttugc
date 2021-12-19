package com.bytedance.apm.battery.p762d;

import com.bytedance.apm.battery.p761c.C12328b;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p789q.C12576b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.battery.d.e */
public final class C12341e extends AbstractC12337b {

    /* renamed from: c */
    private long f29744c;

    static {
        Covode.recordClassIndex(14146);
    }

    public C12341e() {
        super("cpu_active_time");
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12337b, com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: b */
    public final void mo20068b() {
        mo20078a(this.f29729a);
        super.mo20068b();
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12337b, com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: c */
    public final void mo20069c() {
        mo20078a(this.f29729a);
        super.mo20069c();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12337b
    /* renamed from: b */
    public final void mo20080b(boolean z) {
        long d = C12576b.m22637d();
        long j = d - this.f29744c;
        if (j > 0) {
            mo20079a(z, j);
            this.f29744c = d;
        }
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: a */
    public final void mo20083a(C12328b bVar, C12447a aVar) {
        if (aVar.f30225b) {
            double d = (double) aVar.f30230g;
            double g = (double) C12576b.m22640g();
            Double.isNaN(d);
            Double.isNaN(g);
            bVar.f29681c += (long) ((d / g) * 1000.0d);
            return;
        }
        double d2 = (double) aVar.f30230g;
        double g2 = (double) C12576b.m22640g();
        Double.isNaN(d2);
        Double.isNaN(g2);
        bVar.f29686h += (long) ((d2 / g2) * 1000.0d);
    }
}
