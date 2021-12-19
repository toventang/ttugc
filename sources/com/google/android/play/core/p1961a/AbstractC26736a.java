package com.google.android.play.core.p1961a;

import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.play.core.a.a */
public abstract class AbstractC26736a {
    static {
        Covode.recordClassIndex(32208);
    }

    /* renamed from: b */
    private final boolean m53082b(AbstractC26741d dVar) {
        return dVar.mo44407b() && mo44395i() <= mo44396j();
    }

    /* renamed from: a */
    public final PendingIntent mo44386a(AbstractC26741d dVar) {
        if (dVar.mo44406a() != 0) {
            if (dVar.mo44406a() == 1) {
                if (mo44397k() != null) {
                    return mo44397k();
                }
                if (m53082b(dVar)) {
                    return mo44399m();
                }
            }
            return null;
        } else if (mo44398l() != null) {
            return mo44398l();
        } else {
            if (m53082b(dVar)) {
                return mo44400n();
            }
            return null;
        }
    }

    /* renamed from: a */
    public abstract String mo44387a();

    /* renamed from: b */
    public abstract int mo44388b();

    /* renamed from: c */
    public abstract int mo44389c();

    /* renamed from: d */
    public abstract int mo44390d();

    /* renamed from: e */
    public abstract Integer mo44391e();

    /* renamed from: f */
    public abstract int mo44392f();

    /* renamed from: g */
    public abstract long mo44393g();

    /* renamed from: h */
    public abstract long mo44394h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract long mo44395i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract long mo44396j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract PendingIntent mo44397k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract PendingIntent mo44398l();

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract PendingIntent mo44399m();

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract PendingIntent mo44400n();
}
