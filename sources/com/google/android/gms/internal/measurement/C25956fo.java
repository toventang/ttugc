package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.fo */
public final class C25956fo implements AbstractC26037ig {

    /* renamed from: a */
    private final AbstractC25955fn f61127a;

    /* renamed from: b */
    private int f61128b;

    /* renamed from: c */
    private int f61129c;

    /* renamed from: d */
    private int f61130d;

    static {
        Covode.recordClassIndex(31371);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: b */
    public final int mo42457b() {
        return this.f61128b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: e */
    public final float mo42465e() {
        m50283a(5);
        return this.f61127a.mo42431c();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: f */
    public final long mo42467f() {
        m50283a(0);
        return this.f61127a.mo42433d();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: g */
    public final long mo42469g() {
        m50283a(0);
        return this.f61127a.mo42435e();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: h */
    public final int mo42471h() {
        m50283a(0);
        return this.f61127a.mo42436f();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: i */
    public final long mo42473i() {
        m50283a(1);
        return this.f61127a.mo42437g();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: j */
    public final int mo42475j() {
        m50283a(5);
        return this.f61127a.mo42438h();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: k */
    public final boolean mo42478k() {
        m50283a(0);
        return this.f61127a.mo42439i();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: l */
    public final String mo42479l() {
        m50283a(2);
        return this.f61127a.mo42440j();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: m */
    public final String mo42481m() {
        m50283a(2);
        return this.f61127a.mo42441k();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: n */
    public final AbstractC25943fb mo42483n() {
        m50283a(2);
        return this.f61127a.mo42442l();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: o */
    public final int mo42485o() {
        m50283a(0);
        return this.f61127a.mo42443m();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: p */
    public final int mo42487p() {
        m50283a(0);
        return this.f61127a.mo42444n();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: q */
    public final int mo42489q() {
        m50283a(5);
        return this.f61127a.mo42445o();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: r */
    public final long mo42491r() {
        m50283a(1);
        return this.f61127a.mo42446p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: s */
    public final int mo42492s() {
        m50283a(0);
        return this.f61127a.mo42447q();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: t */
    public final long mo42493t() {
        m50283a(0);
        return this.f61127a.mo42448r();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: c */
    public final boolean mo42462c() {
        int i;
        if (this.f61127a.mo42450t() || (i = this.f61128b) == this.f61129c) {
            return false;
        }
        return this.f61127a.mo42430b(i);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: d */
    public final double mo42463d() {
        m50283a(1);
        return this.f61127a.mo42429b();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: a */
    public final int mo42452a() {
        int i = this.f61130d;
        if (i != 0) {
            this.f61128b = i;
            this.f61130d = 0;
        } else {
            this.f61128b = this.f61127a.mo42427a();
        }
        int i2 = this.f61128b;
        if (i2 == 0 || i2 == this.f61129c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: i */
    public final void mo42474i(List<String> list) {
        m50284a(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: j */
    public final void mo42476j(List<String> list) {
        m50284a(list, true);
    }

    C25956fo(AbstractC25955fn fnVar) {
        AbstractC25955fn fnVar2 = (AbstractC25955fn) C25989gm.m50601a((Object) fnVar, "input");
        this.f61127a = fnVar2;
        fnVar2.f61125c = this;
    }

    /* renamed from: a */
    private final void m50283a(int i) {
        if ((this.f61128b & 7) != i) {
            throw C25994gr.m50612f();
        }
    }

    /* renamed from: b */
    private static void m50285b(int i) {
        if ((i & 7) != 0) {
            throw C25994gr.m50613g();
        }
    }

    /* renamed from: c */
    private static void m50287c(int i) {
        if ((i & 3) != 0) {
            throw C25994gr.m50613g();
        }
    }

    /* renamed from: d */
    private final void m50289d(int i) {
        if (this.f61127a.mo42451u() != i) {
            throw C25994gr.m50607a();
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: k */
    public final void mo42477k(List<AbstractC25943fb> list) {
        int a;
        if ((this.f61128b & 7) == 2) {
            do {
                list.add(mo42483n());
                if (!this.f61127a.mo42450t()) {
                    a = this.f61127a.mo42427a();
                } else {
                    return;
                }
            } while (a == this.f61128b);
            this.f61130d = a;
            return;
        }
        throw C25994gr.m50612f();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: b */
    public final void mo42459b(List<Float> list) {
        int a;
        int a2;
        if (list instanceof C25976ge) {
            C25976ge geVar = (C25976ge) list;
            int i = this.f61128b & 7;
            if (i == 2) {
                int m = this.f61127a.mo42443m();
                m50287c(m);
                int u = this.f61127a.mo42451u() + m;
                do {
                    geVar.mo42605a(this.f61127a.mo42431c());
                } while (this.f61127a.mo42451u() < u);
            } else if (i == 5) {
                do {
                    geVar.mo42605a(this.f61127a.mo42431c());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 2) {
                int m2 = this.f61127a.mo42443m();
                m50287c(m2);
                int u2 = this.f61127a.mo42451u() + m2;
                do {
                    list.add(Float.valueOf(this.f61127a.mo42431c()));
                } while (this.f61127a.mo42451u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Float.valueOf(this.f61127a.mo42431c()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: c */
    public final void mo42461c(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    hdVar.mo42662a(this.f61127a.mo42433d());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    hdVar.mo42662a(this.f61127a.mo42433d());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f61127a.mo42433d()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Long.valueOf(this.f61127a.mo42433d()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: d */
    public final void mo42464d(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    hdVar.mo42662a(this.f61127a.mo42435e());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    hdVar.mo42662a(this.f61127a.mo42435e());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f61127a.mo42435e()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Long.valueOf(this.f61127a.mo42435e()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: e */
    public final void mo42466e(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    gkVar.mo42634d(this.f61127a.mo42436f());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    gkVar.mo42634d(this.f61127a.mo42436f());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42436f()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42436f()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: f */
    public final void mo42468f(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            int i = this.f61128b & 7;
            if (i == 1) {
                do {
                    hdVar.mo42662a(this.f61127a.mo42437g());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int m = this.f61127a.mo42443m();
                m50285b(m);
                int u = this.f61127a.mo42451u() + m;
                do {
                    hdVar.mo42662a(this.f61127a.mo42437g());
                } while (this.f61127a.mo42451u() < u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f61127a.mo42437g()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int m2 = this.f61127a.mo42443m();
                m50285b(m2);
                int u2 = this.f61127a.mo42451u() + m2;
                do {
                    list.add(Long.valueOf(this.f61127a.mo42437g()));
                } while (this.f61127a.mo42451u() < u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: g */
    public final void mo42470g(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            int i = this.f61128b & 7;
            if (i == 2) {
                int m = this.f61127a.mo42443m();
                m50287c(m);
                int u = this.f61127a.mo42451u() + m;
                do {
                    gkVar.mo42634d(this.f61127a.mo42438h());
                } while (this.f61127a.mo42451u() < u);
            } else if (i == 5) {
                do {
                    gkVar.mo42634d(this.f61127a.mo42438h());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 2) {
                int m2 = this.f61127a.mo42443m();
                m50287c(m2);
                int u2 = this.f61127a.mo42451u() + m2;
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42438h()));
                } while (this.f61127a.mo42451u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42438h()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: h */
    public final void mo42472h(List<Boolean> list) {
        int a;
        int a2;
        if (list instanceof C25938ez) {
            C25938ez ezVar = (C25938ez) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    ezVar.mo42383a(this.f61127a.mo42439i());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    ezVar.mo42383a(this.f61127a.mo42439i());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f61127a.mo42439i()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Boolean.valueOf(this.f61127a.mo42439i()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: l */
    public final void mo42480l(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    gkVar.mo42634d(this.f61127a.mo42443m());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    gkVar.mo42634d(this.f61127a.mo42443m());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42443m()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42443m()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: m */
    public final void mo42482m(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    gkVar.mo42634d(this.f61127a.mo42444n());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    gkVar.mo42634d(this.f61127a.mo42444n());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42444n()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42444n()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: n */
    public final void mo42484n(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            int i = this.f61128b & 7;
            if (i == 2) {
                int m = this.f61127a.mo42443m();
                m50287c(m);
                int u = this.f61127a.mo42451u() + m;
                do {
                    gkVar.mo42634d(this.f61127a.mo42445o());
                } while (this.f61127a.mo42451u() < u);
            } else if (i == 5) {
                do {
                    gkVar.mo42634d(this.f61127a.mo42445o());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 2) {
                int m2 = this.f61127a.mo42443m();
                m50287c(m2);
                int u2 = this.f61127a.mo42451u() + m2;
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42445o()));
                } while (this.f61127a.mo42451u() < u2);
            } else if (i2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42445o()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: o */
    public final void mo42486o(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            int i = this.f61128b & 7;
            if (i == 1) {
                do {
                    hdVar.mo42662a(this.f61127a.mo42446p());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int m = this.f61127a.mo42443m();
                m50285b(m);
                int u = this.f61127a.mo42451u() + m;
                do {
                    hdVar.mo42662a(this.f61127a.mo42446p());
                } while (this.f61127a.mo42451u() < u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.f61127a.mo42446p()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int m2 = this.f61127a.mo42443m();
                m50285b(m2);
                int u2 = this.f61127a.mo42451u() + m2;
                do {
                    list.add(Long.valueOf(this.f61127a.mo42446p()));
                } while (this.f61127a.mo42451u() < u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: p */
    public final void mo42488p(List<Integer> list) {
        int a;
        int a2;
        if (list instanceof C25987gk) {
            C25987gk gkVar = (C25987gk) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    gkVar.mo42634d(this.f61127a.mo42447q());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    gkVar.mo42634d(this.f61127a.mo42447q());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42447q()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Integer.valueOf(this.f61127a.mo42447q()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: q */
    public final void mo42490q(List<Long> list) {
        int a;
        int a2;
        if (list instanceof C26007hd) {
            C26007hd hdVar = (C26007hd) list;
            int i = this.f61128b & 7;
            if (i == 0) {
                do {
                    hdVar.mo42662a(this.f61127a.mo42448r());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int u = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    hdVar.mo42662a(this.f61127a.mo42448r());
                } while (this.f61127a.mo42451u() < u);
                m50289d(u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.f61127a.mo42448r()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int u2 = this.f61127a.mo42451u() + this.f61127a.mo42443m();
                do {
                    list.add(Long.valueOf(this.f61127a.mo42448r()));
                } while (this.f61127a.mo42451u() < u2);
                m50289d(u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: a */
    public final void mo42454a(List<Double> list) {
        int a;
        int a2;
        if (list instanceof C25964fu) {
            C25964fu fuVar = (C25964fu) list;
            int i = this.f61128b & 7;
            if (i == 1) {
                do {
                    fuVar.mo42569a(this.f61127a.mo42429b());
                    if (!this.f61127a.mo42450t()) {
                        a2 = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a2 == this.f61128b);
                this.f61130d = a2;
            } else if (i == 2) {
                int m = this.f61127a.mo42443m();
                m50285b(m);
                int u = this.f61127a.mo42451u() + m;
                do {
                    fuVar.mo42569a(this.f61127a.mo42429b());
                } while (this.f61127a.mo42451u() < u);
            } else {
                throw C25994gr.m50612f();
            }
        } else {
            int i2 = this.f61128b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.f61127a.mo42429b()));
                    if (!this.f61127a.mo42450t()) {
                        a = this.f61127a.mo42427a();
                    } else {
                        return;
                    }
                } while (a == this.f61128b);
                this.f61130d = a;
            } else if (i2 == 2) {
                int m2 = this.f61127a.mo42443m();
                m50285b(m2);
                int u2 = this.f61127a.mo42451u() + m2;
                do {
                    list.add(Double.valueOf(this.f61127a.mo42429b()));
                } while (this.f61127a.mo42451u() < u2);
            } else {
                throw C25994gr.m50612f();
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: a */
    public final <T> T mo42453a(AbstractC26041ik<T> ikVar, C25965fv fvVar) {
        m50283a(2);
        return (T) m50286c(ikVar, fvVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: b */
    public final <T> T mo42458b(AbstractC26041ik<T> ikVar, C25965fv fvVar) {
        m50283a(3);
        return (T) m50288d(ikVar, fvVar);
    }

    /* renamed from: d */
    private final <T> T m50288d(AbstractC26041ik<T> ikVar, C25965fv fvVar) {
        int i = this.f61129c;
        this.f61129c = ((this.f61128b >>> 3) << 3) | 4;
        try {
            T a = ikVar.mo42694a();
            ikVar.mo42695a(a, this, fvVar);
            ikVar.mo42701c(a);
            if (this.f61128b == this.f61129c) {
                return a;
            }
            throw C25994gr.m50613g();
        } finally {
            this.f61129c = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m50284a(java.util.List<java.lang.String> r3, boolean r4) {
        /*
            r2 = this;
            int r0 = r2.f61128b
            r1 = r0 & 7
            r0 = 2
            if (r1 != r0) goto L_0x0050
            boolean r0 = r3 instanceof com.google.android.gms.internal.measurement.AbstractC26005hb
            if (r0 == 0) goto L_0x002c
            if (r4 != 0) goto L_0x002e
            com.google.android.gms.internal.measurement.hb r3 = (com.google.android.gms.internal.measurement.AbstractC26005hb) r3
        L_0x000f:
            com.google.android.gms.internal.measurement.fb r0 = r2.mo42483n()
            r3.mo42651a(r0)
            com.google.android.gms.internal.measurement.fn r0 = r2.f61127a
            boolean r0 = r0.mo42450t()
            if (r0 == 0) goto L_0x001f
            return
        L_0x001f:
            com.google.android.gms.internal.measurement.fn r0 = r2.f61127a
            int r1 = r0.mo42427a()
            int r0 = r2.f61128b
            if (r1 == r0) goto L_0x000f
            r2.f61130d = r1
            return
        L_0x002c:
            if (r4 == 0) goto L_0x004b
        L_0x002e:
            java.lang.String r0 = r2.mo42481m()
        L_0x0032:
            r3.add(r0)
            com.google.android.gms.internal.measurement.fn r0 = r2.f61127a
            boolean r0 = r0.mo42450t()
            if (r0 == 0) goto L_0x003e
            return
        L_0x003e:
            com.google.android.gms.internal.measurement.fn r0 = r2.f61127a
            int r1 = r0.mo42427a()
            int r0 = r2.f61128b
            if (r1 == r0) goto L_0x002c
            r2.f61130d = r1
            return
        L_0x004b:
            java.lang.String r0 = r2.mo42479l()
            goto L_0x0032
        L_0x0050:
            com.google.android.gms.internal.measurement.gu r0 = com.google.android.gms.internal.measurement.C25994gr.m50612f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25956fo.m50284a(java.util.List, boolean):void");
    }

    /* renamed from: c */
    private final <T> T m50286c(AbstractC26041ik<T> ikVar, C25965fv fvVar) {
        int m = this.f61127a.mo42443m();
        if (this.f61127a.f61123a < this.f61127a.f61124b) {
            int c = this.f61127a.mo42432c(m);
            T a = ikVar.mo42694a();
            this.f61127a.f61123a++;
            ikVar.mo42695a(a, this, fvVar);
            ikVar.mo42701c(a);
            this.f61127a.mo42428a(0);
            AbstractC25955fn fnVar = this.f61127a;
            fnVar.f61123a--;
            this.f61127a.mo42434d(c);
            return a;
        }
        throw new C25994gr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: b */
    public final <T> void mo42460b(List<T> list, AbstractC26041ik<T> ikVar, C25965fv fvVar) {
        int a;
        int i = this.f61128b;
        if ((i & 7) == 3) {
            do {
                list.add(m50288d(ikVar, fvVar));
                if (!this.f61127a.mo42450t() && this.f61130d == 0) {
                    a = this.f61127a.mo42427a();
                } else {
                    return;
                }
            } while (a == i);
            this.f61130d = a;
            return;
        }
        throw C25994gr.m50612f();
    }

    /* renamed from: a */
    private final Object m50282a(EnumC26076jo joVar, Class<?> cls, C25965fv fvVar) {
        switch (C25961fr.f61146a[joVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo42478k());
            case 2:
                return mo42483n();
            case 3:
                return Double.valueOf(mo42463d());
            case 4:
                return Integer.valueOf(mo42487p());
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return Integer.valueOf(mo42475j());
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return Long.valueOf(mo42473i());
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return Float.valueOf(mo42465e());
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return Integer.valueOf(mo42471h());
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return Long.valueOf(mo42469g());
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                m50283a(2);
                return m50286c(C26036if.f61331a.mo42707a((Class) cls), fvVar);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                return Integer.valueOf(mo42489q());
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                return Long.valueOf(mo42491r());
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                return Integer.valueOf(mo42492s());
            case ABRConfig.ABR_SELECT_SCENE:
                return Long.valueOf(mo42493t());
            case 15:
                return mo42481m();
            case 16:
                return Integer.valueOf(mo42485o());
            case 17:
                return Long.valueOf(mo42467f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: a */
    public final <T> void mo42455a(List<T> list, AbstractC26041ik<T> ikVar, C25965fv fvVar) {
        int a;
        int i = this.f61128b;
        if ((i & 7) == 2) {
            do {
                list.add(m50286c(ikVar, fvVar));
                if (!this.f61127a.mo42450t() && this.f61130d == 0) {
                    a = this.f61127a.mo42427a();
                } else {
                    return;
                }
            } while (a == i);
            this.f61130d = a;
            return;
        }
        throw C25994gr.m50612f();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Map<K, V> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC26037ig
    /* renamed from: a */
    public final <K, V> void mo42456a(Map<K, V> map, C26015hl<K, V> hlVar, C25965fv fvVar) {
        m50283a(2);
        int c = this.f61127a.mo42432c(this.f61127a.mo42443m());
        Object obj = hlVar.f61292b;
        Object obj2 = hlVar.f61294d;
        while (true) {
            try {
                int a = mo42452a();
                if (a == Integer.MAX_VALUE || this.f61127a.mo42450t()) {
                    map.put(obj, obj2);
                } else if (a == 1) {
                    obj = m50282a(hlVar.f61291a, (Class<?>) null, (C25965fv) null);
                } else if (a != 2) {
                    try {
                        if (!mo42462c()) {
                            throw new C25994gr("Unable to parse map entry.");
                        }
                    } catch (C25997gu unused) {
                        if (!mo42462c()) {
                            throw new C25994gr("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj2 = m50282a(hlVar.f61293c, hlVar.f61294d.getClass(), fvVar);
                }
            } finally {
                this.f61127a.mo42434d(c);
            }
        }
        map.put(obj, obj2);
    }
}
