package com.bytedance.android.ecommerce.p159e;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p153a.C2733a;
import com.bytedance.android.ecommerce.p153a.C2743c;
import com.bytedance.android.ecommerce.p153a.C2744d;
import com.bytedance.android.ecommerce.p153a.C2746f;
import com.bytedance.android.ecommerce.p153a.C2748h;
import com.bytedance.android.ecommerce.p153a.p154a.C2736c;
import com.bytedance.android.ecommerce.p153a.p154a.C2737d;
import com.bytedance.android.ecommerce.p153a.p155b.C2740b;
import com.bytedance.android.ecommerce.p153a.p155b.C2741c;
import com.bytedance.android.ecommerce.p157c.AbstractC2768c;
import com.bytedance.android.ecommerce.p157c.AbstractC2769d;
import com.bytedance.android.ecommerce.p157c.AbstractC2770e;
import com.bytedance.android.ecommerce.p157c.AbstractC2771f;
import com.bytedance.android.ecommerce.p164j.AbstractC2806e;
import com.bytedance.android.ecommerce.p164j.AbstractC2807f;
import com.bytedance.android.ecommerce.p165k.C2838i;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.android.ecommerce.e.b */
public final class C2775b implements AbstractC2780d {

    /* renamed from: a */
    private final String f8354a = "ECommerceServiceImpl";

    /* renamed from: b */
    private AtomicBoolean f8355b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(3201);
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final boolean mo7362a() {
        return C2778c.f8362a.mo7369a();
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: d */
    public final void mo7366d(String str) {
        C2778c.f8362a.mo7372d().f8332r = str;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: b */
    public final String mo7364b(String str) {
        if (this.f8355b.get()) {
            return C2838i.m8117a(C2778c.f8362a.mo7372d().f8324j, str);
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: e */
    public final boolean mo7367e(String str) {
        return TextUtils.equals(C2778c.f8362a.mo7377i().mo7392a(str), "success");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final C2748h mo7357a(String str) {
        C2746f b;
        if (this.f8355b.get()) {
            AbstractC2806e b2 = C2778c.f8362a.mo7370b();
            C2733a a = b2.mo7385a(str);
            if (a == null || (b = b2.mo7386b(a.f8152g)) == null) {
                return null;
            }
            return new C2748h(a, b);
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: c */
    public final void mo7365c(String str) {
        if (this.f8355b.get()) {
            C2778c.f8362a.mo7372d().f8331q = str;
            C2778c.f8362a.mo7379k().mo7394a(str);
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final void mo7360a(C2773a aVar) {
        if (aVar != null) {
            this.f8355b.getAndSet(true);
            long currentTimeMillis = System.currentTimeMillis();
            C2778c.f8362a.mo7368a(aVar);
            C2778c.f8362a.mo7374f().mo7389a(System.currentTimeMillis() - currentTimeMillis);
            return;
        }
        throw new IllegalArgumentException("configuration should not be null!");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final void mo7358a(final C2736c cVar, final AbstractC2770e eVar) {
        if (this.f8355b.get()) {
            final long currentTimeMillis = System.currentTimeMillis();
            C2778c.f8362a.mo7371c().mo7397a(cVar, new AbstractC2770e() {
                /* class com.bytedance.android.ecommerce.p159e.C2775b.C27761 */

                static {
                    Covode.recordClassIndex(3202);
                }

                @Override // com.bytedance.android.ecommerce.p157c.AbstractC2770e
                /* renamed from: a */
                public final void mo7352a(C2741c cVar) {
                    String str;
                    long currentTimeMillis = System.currentTimeMillis();
                    AbstractC2807f f = C2778c.f8362a.mo7374f();
                    C2736c cVar2 = cVar;
                    if (cVar2.f8164i == null) {
                        str = "";
                    } else {
                        str = cVar2.f8164i.f8268a;
                    }
                    f.mo7391a(str, cVar.f8165j, cVar.f8193c, cVar.f8194d, cVar.f8195e, currentTimeMillis - currentTimeMillis, cVar.toString());
                    eVar.mo7352a(cVar);
                }
            });
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final void mo7359a(C2737d dVar, AbstractC2771f fVar) {
        if (this.f8355b.get()) {
            C2783g gVar = new C2783g(dVar, fVar);
            gVar.f8381e = System.currentTimeMillis();
            gVar.f8377a.sendEmptyMessage(1);
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final void mo7361a(String str, final AbstractC2768c cVar) {
        if (this.f8355b.get()) {
            C2773a d = C2778c.f8362a.mo7372d();
            C2778c.f8362a.mo7379k().mo7395a(str, d.f8332r, d.f8331q, new AbstractC2769d() {
                /* class com.bytedance.android.ecommerce.p159e.C2775b.C27772 */

                static {
                    Covode.recordClassIndex(3203);
                }

                @Override // com.bytedance.android.ecommerce.p157c.AbstractC2769d
                /* renamed from: a */
                public final void mo7348a(int i, int i2, String str, C2740b bVar) {
                    cVar.mo7348a(i, i2, str, bVar);
                }
            });
            return;
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: a */
    public final C2744d mo7356a(String str, String str2, String str3) {
        if (this.f8355b.get()) {
            AbstractC2806e b = C2778c.f8362a.mo7370b();
            C2746f b2 = b.mo7386b(str);
            if (b2 == null) {
                return C2744d.m7914a("methodWithCardBrand is null");
            }
            C2743c a = b2.mo7331a(str2);
            if (a == null) {
                return C2744d.m7914a("element is null");
            }
            if (TextUtils.equals("eg_ccdc_global_cvv", str2)) {
                a.f8229n = b.mo7388d(str);
            }
            a.f8224i = str3;
            return C2778c.f8362a.mo7373e().mo7383a(a);
        }
        throw new IllegalArgumentException("please init first");
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2780d
    /* renamed from: b */
    public final C2744d mo7363b(String str, String str2, String str3) {
        if (this.f8355b.get()) {
            C2746f b = C2778c.f8362a.mo7370b().mo7386b(str);
            if (b == null) {
                return C2744d.m7914a("methodWithCardBrand is null");
            }
            C2743c a = b.mo7331a("eg_ccdc_global_expiration_year");
            if (a == null) {
                return C2744d.m7914a("yearElement is null");
            }
            a.f8224i = str2;
            C2743c a2 = b.mo7331a("eg_ccdc_global_expiration_month");
            if (a2 == null) {
                return C2744d.m7914a("monthElement is null");
            }
            a2.f8224i = str3;
            return C2778c.f8362a.mo7373e().mo7383a(a, a2);
        }
        throw new IllegalArgumentException("please init first");
    }
}
