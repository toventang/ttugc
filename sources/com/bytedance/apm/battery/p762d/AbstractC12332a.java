package com.bytedance.apm.battery.p762d;

import com.bytedance.apm.battery.p761c.C12324a;
import com.bytedance.apm.battery.p762d.p763a.AbstractC12335b;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.battery.d.a */
public abstract class AbstractC12332a<T extends AbstractC12335b> extends AbstractC12339c<T> {

    /* renamed from: e */
    private volatile int f29713e;

    /* renamed from: f */
    private long f29714f;

    /* renamed from: g */
    private int f29715g;

    /* renamed from: h */
    private long f29716h;

    static {
        Covode.recordClassIndex(14137);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo20064a(double d, double d2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo20066a(T t, long j);

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g, com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: b */
    public final void mo20068b() {
        if (this.f29713e > 0 && this.f29716h > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m22123a(currentTimeMillis - this.f29716h, this.f29736c);
            this.f29716h = currentTimeMillis;
        }
        super.mo20068b();
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g, com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: c */
    public final void mo20069c() {
        if (this.f29713e > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m22123a(currentTimeMillis - this.f29716h, this.f29736c);
            this.f29716h = currentTimeMillis;
        }
        super.mo20069c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo20070d() {
        this.f29713e++;
        if (this.f29713e == 1) {
            this.f29716h = System.currentTimeMillis();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void mo20071e() {
        this.f29713e--;
        if (this.f29713e == 0) {
            m22123a(System.currentTimeMillis() - this.f29716h, this.f29736c);
            this.f29716h = -1;
        }
    }

    AbstractC12332a(String str) {
        super(str);
    }

    /* renamed from: a */
    private void m22123a(final long j, final boolean z) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.battery.p762d.AbstractC12332a.RunnableC123331 */

            static {
                Covode.recordClassIndex(14138);
            }

            public final void run() {
                C12324a.C12327a.f29677a.mo20054a(new C12447a(z, System.currentTimeMillis(), AbstractC12332a.this.f29734a, j));
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: a */
    public final void mo20065a(long j, long j2) {
        this.f29715g = 0;
        this.f29714f = 0;
        if (this.f29713e > 0 && this.f29716h > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            m22123a(currentTimeMillis - this.f29716h, this.f29736c);
            this.f29716h = currentTimeMillis;
        }
        super.mo20065a(j, j2);
        long currentTimeMillis2 = System.currentTimeMillis();
        double d = (double) this.f29714f;
        double d2 = (double) (currentTimeMillis2 - this.f29735b);
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = (double) this.f29715g;
        double d4 = (double) (currentTimeMillis2 - this.f29735b);
        Double.isNaN(d3);
        Double.isNaN(d4);
        mo20064a((d / d2) * 60000.0d * 10.0d, (d3 / d4) * 60000.0d * 10.0d);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.apm.battery.p762d.AbstractC12339c
    /* renamed from: a */
    public final void mo20067a(T t, long j, long j2) {
        this.f29715g++;
        long j3 = t.f29723d;
        if (j3 >= j) {
            j = j3;
        }
        long j4 = t.f29724e;
        if (j4 > 0 && j2 >= j4) {
            j2 = j4;
        }
        mo20066a(t, j2 - t.f29723d);
        long j5 = j2 - j;
        if (j5 > 0) {
            this.f29714f += j5;
        }
    }
}
