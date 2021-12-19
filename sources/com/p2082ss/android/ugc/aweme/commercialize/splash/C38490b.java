package com.p2082ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p1795d.p1796a.p1797a.p1798a.C23759a;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.AbstractC23771b;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23766a;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23772c;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23773d;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23779j;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23780k;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.EnumC23774e;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.EnumC23775f;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.EnumC23777h;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.EnumC23778i;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23768b;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.C23770d;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.EnumC23767a;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a.EnumC23769c;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29472o;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37473i;
import com.p2082ss.android.ugc.aweme.commercialize.p2562f.C37842a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.b */
public final class C38490b implements AbstractC29503a {

    /* renamed from: a */
    C38491a f90911a;

    /* renamed from: b */
    private Context f90912b;

    /* renamed from: c */
    private Handler f90913c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f90914d = false;

    /* renamed from: e */
    private boolean f90915e = false;

    /* renamed from: f */
    private boolean f90916f = true;

    static {
        Covode.recordClassIndex(46015);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.b$a */
    public static class C38491a {

        /* renamed from: a */
        final boolean f90917a;

        /* renamed from: b */
        AbstractC23771b f90918b;

        /* renamed from: c */
        C23768b f90919c;

        static {
            Covode.recordClassIndex(46016);
        }

        /* renamed from: a */
        public final void mo67049a() {
            AbstractC23771b bVar = this.f90918b;
            if (bVar != null) {
                bVar.mo39237b();
                this.f90918b = null;
            }
        }

        C38491a(AbstractC29383a aVar) {
            EnumC23775f fVar;
            this.f90917a = aVar.mo51374r();
            if (aVar.mo51367B() != null) {
                try {
                    C23779j a = C23779j.m44937a("Bytedance", C17867d.m33088i());
                    String a2 = C37473i.m75557a(C17867d.m33078a());
                    C29472o B = aVar.mo51367B();
                    ArrayList arrayList = new ArrayList();
                    for (C29472o.C29473a aVar2 : B.f70117a) {
                        arrayList.add(C23780k.m44938a(aVar2.f70118a, new URL(aVar2.f70119b), aVar2.f70120c));
                    }
                    C23801d.m44992a(a, "Partner is null");
                    C23801d.m44992a((Object) a2, "OM SDK JS script content is null");
                    C23801d.m44992a(arrayList, "VerificationScriptResources is null");
                    C23773d dVar = new C23773d(a, a2, arrayList, null, EnumC23774e.NATIVE);
                    if (aVar.mo51374r()) {
                        fVar = EnumC23775f.VIDEO;
                    } else {
                        fVar = EnumC23775f.NATIVE_DISPLAY;
                    }
                    EnumC23777h hVar = EnumC23777h.BEGIN_TO_RENDER;
                    EnumC23778i iVar = EnumC23778i.NATIVE;
                    this.f90918b = AbstractC23771b.m44929a(C23772c.m44935a(fVar, hVar, iVar, iVar), dVar);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: a */
    public final void mo51589a() {
        C38491a aVar = this.f90911a;
        if (aVar != null && aVar.f90918b != null && aVar.f90919c != null) {
            aVar.f90919c.mo39224a();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: b */
    public final void mo51593b() {
        C38491a aVar = this.f90911a;
        if (aVar != null && aVar.f90918b != null && aVar.f90919c != null) {
            aVar.f90919c.mo39227b();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: c */
    public final void mo51594c() {
        C38491a aVar = this.f90911a;
        if (aVar != null && aVar.f90918b != null && aVar.f90919c != null) {
            aVar.f90919c.mo39228c();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: d */
    public final void mo51595d() {
        C38491a aVar = this.f90911a;
        if (aVar != null) {
            if (!(aVar.f90918b == null || aVar.f90919c == null)) {
                aVar.f90919c.mo39229d();
            }
            this.f90914d = true;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: e */
    public final void mo51596e() {
        C38491a aVar = this.f90911a;
        if (aVar != null && aVar.f90918b != null && aVar.f90919c != null) {
            aVar.f90919c.mo39230e();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: f */
    public final void mo51597f() {
        C38491a aVar = this.f90911a;
        if (aVar != null && aVar.f90918b != null && aVar.f90919c != null) {
            aVar.f90919c.mo39231f();
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: g */
    public final void mo51598g() {
        C38491a aVar = this.f90911a;
        if (aVar != null && !this.f90915e) {
            if (!(aVar.f90918b == null || aVar.f90919c == null)) {
                aVar.f90919c.mo39232g();
            }
            this.f90915e = true;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: h */
    public final void mo51599h() {
        C38491a aVar = this.f90911a;
        if (aVar != null) {
            this.f90914d = true;
            if (aVar.f90918b != null && aVar.f90919c != null) {
                aVar.f90919c.mo39226a(EnumC23767a.CLICK);
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: i */
    public final void mo51600i() {
        if (this.f90911a != null) {
            int a = C37842a.m76507a();
            if (a > 0) {
                if (!this.f90914d) {
                    mo51598g();
                }
                if (!this.f90916f) {
                    a = 0;
                }
                this.f90913c.postDelayed(new RunnableC38492c(this), (long) (a * 1000));
                return;
            }
            this.f90911a.mo67049a();
            this.f90911a = null;
        }
    }

    public C38490b(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            this.f90912b = applicationContext;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: a */
    public final void mo51590a(long j) {
        C38491a aVar = this.f90911a;
        if (aVar != null && aVar.f90918b != null && aVar.f90919c != null) {
            aVar.f90919c.mo39225a((float) j, 0.0f);
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: a */
    public final void mo51592a(AbstractC29383a aVar) {
        Context context = this.f90912b;
        if (!C23759a.f56213a.f56268a) {
            C23759a.m44907a(context);
        }
        if (C23759a.f56213a.f56268a) {
            if (this.f90911a != null) {
                mo51600i();
            }
            this.f90911a = new C38491a(aVar);
            this.f90916f = aVar.mo51374r();
            this.f90914d = false;
            this.f90915e = false;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a
    /* renamed from: a */
    public final void mo51591a(View view, List<View> list) {
        C38491a aVar = this.f90911a;
        if (!(aVar == null || aVar.f90918b == null)) {
            aVar.f90918b.mo39236a(view);
            if (list != null) {
                for (View view2 : list) {
                    aVar.f90918b.mo39238b(view2);
                }
            }
            if (aVar.f90917a) {
                aVar.f90919c = C23768b.m44917a(aVar.f90918b);
            }
            aVar.f90918b.mo39235a();
            C23766a a = C23766a.m44914a(aVar.f90918b);
            a.mo39222a(C23770d.m44927a(EnumC23769c.STANDALONE));
            a.mo39221a();
        }
    }
}
