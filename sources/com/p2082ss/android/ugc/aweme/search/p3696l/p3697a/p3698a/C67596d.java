package com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.p3698a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.search.p3696l.p3697a.C67592a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.a.a.d */
public final class C67596d extends C67593a {

    /* renamed from: b */
    public long f151383b = -1;

    /* renamed from: c */
    public long f151384c = -1;

    /* renamed from: d */
    public long f151385d = -1;

    /* renamed from: e */
    public long f151386e = -1;

    /* renamed from: f */
    public long f151387f = -1;

    /* renamed from: g */
    public long f151388g = -1;

    /* renamed from: h */
    public long f151389h = -1;

    /* renamed from: i */
    public long f151390i = -1;

    /* renamed from: j */
    public long f151391j = -1;

    /* renamed from: k */
    public long f151392k = -1;

    /* renamed from: l */
    public long f151393l = -1;

    /* renamed from: m */
    public long f151394m = -1;

    /* renamed from: n */
    public C28022o f151395n;

    /* renamed from: o */
    public boolean f151396o;

    /* renamed from: p */
    public Long f151397p;

    /* renamed from: q */
    public Long f151398q;

    /* renamed from: r */
    public Long f151399r;

    /* renamed from: s */
    public Long f151400s;

    /* renamed from: t */
    public Long f151401t;

    /* renamed from: u */
    public Long f151402u;

    /* renamed from: v */
    public Long f151403v;

    /* renamed from: w */
    public Integer f151404w;

    static {
        Covode.recordClassIndex(79235);
    }

    /* renamed from: d */
    public final boolean mo106563d() {
        if (this.f151386e != -1 || this.f151396o) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo106564e() {
        if (this.f151383b != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo106562c() {
        if (this.f151386e == -1) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f151386e = currentTimeMillis;
            m119692a(currentTimeMillis - this.f151385d);
        }
    }

    /* renamed from: a */
    public final void mo106558a() {
        if (this.f151385d == -1) {
            this.f151385d = System.currentTimeMillis();
            this.f151386e = -1;
        }
    }

    /* renamed from: b */
    public final void mo106561b() {
        Integer num;
        if (this.f151386e == -1 && (num = C67592a.f151370c.f151408c) != null && num.intValue() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f151386e = currentTimeMillis;
            m119692a(currentTimeMillis - this.f151385d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.l.a.a.d$a */
    public static final class RunnableC67597a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C67596d f151405a;

        static {
            Covode.recordClassIndex(79236);
        }

        RunnableC67597a(C67596d dVar) {
            this.f151405a = dVar;
        }

        public final void run() {
            Integer num;
            if (this.f151405a.f151393l == -1) {
                this.f151405a.f151393l = System.currentTimeMillis();
                C67596d dVar = this.f151405a;
                long j = dVar.f151393l - this.f151405a.f151383b;
                if (dVar.f151397p == null) {
                    dVar.f151397p = Long.valueOf(j);
                    dVar.mo106552a("cost", Long.valueOf(j));
                }
                if (this.f151405a.f151396o && (!this.f151405a.f151396o || (num = C67592a.f151370c.f151409d) == null || num.intValue() != 0)) {
                    this.f151405a.f151393l = -1;
                } else if (!C67592a.f151368a && !C67592a.f151369b && C67592a.f151371d.f151397p != null && C67592a.m119685c()) {
                    C67592a.m119684b();
                }
            }
        }
    }

    public final String toString() {
        return "SearchChainWholeProgressCost(cost=" + this.f151397p + ", triggerNetCost=" + this.f151398q + ", triggerRealRequstCost=" + this.f151399r + ", netCost=" + this.f151400s + ", dataParseCost=" + this.f151401t + ", viewDrawCost=" + this.f151402u + ')';
    }

    /* renamed from: a */
    private final void m119692a(long j) {
        this.f151400s = Long.valueOf(j);
        mo106552a("net_cost", Long.valueOf(j));
    }

    /* renamed from: b */
    private static boolean m119694b(String str) {
        return C89219l.m154714a((Object) str, (Object) C67592a.f151372e.f151379e);
    }

    /* renamed from: a */
    private boolean m119693a(String str) {
        C89219l.m154721d(str, "");
        boolean z = C67592a.f151368a;
        boolean z2 = C67592a.f151369b;
        boolean d = mo106563d();
        if (z || !d || z2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo106560a(Integer num) {
        if (this.f151385d == -1) {
            this.f151385d = System.currentTimeMillis();
            this.f151386e = -1;
            C67592a.f151370c.mo106570a(num);
        }
    }

    /* renamed from: a */
    public final void mo106559a(View view, String str) {
        C89219l.m154721d(view, "");
        if (m119693a("onEventEnd") && m119694b(str)) {
            view.postOnAnimation(new RunnableC67597a(this));
        }
    }
}
