package com.bytedance.apm.battery.p762d;

import com.bytedance.apm.C12397c;
import com.bytedance.apm.battery.p761c.C12324a;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p772e.C12447a;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.battery.d.b */
public abstract class AbstractC12337b implements AbstractC12343g {

    /* renamed from: a */
    boolean f29729a = ActivityLifeObserver.getInstance().isForeground();

    /* renamed from: b */
    public boolean f29730b = C12397c.m22285b();

    /* renamed from: c */
    private String f29731c;

    static {
        Covode.recordClassIndex(14142);
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: b */
    public void mo20068b() {
        this.f29729a = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo20080b(boolean z);

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: c */
    public void mo20069c() {
        this.f29729a = true;
    }

    @Override // com.bytedance.apm.battery.p762d.AbstractC12343g
    /* renamed from: m_ */
    public final void mo20081m_() {
        mo20078a(this.f29729a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20078a(final boolean z) {
        C12560b.C12564a.f30567a.mo20387a(new Runnable() {
            /* class com.bytedance.apm.battery.p762d.AbstractC12337b.RunnableC123381 */

            static {
                Covode.recordClassIndex(14143);
            }

            public final void run() {
                AbstractC12337b.this.mo20080b(z);
            }
        });
    }

    AbstractC12337b(String str) {
        this.f29731c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo20079a(boolean z, long j) {
        C12324a.C12327a.f29677a.mo20054a(new C12447a(z, System.currentTimeMillis(), this.f29731c, j));
    }
}
