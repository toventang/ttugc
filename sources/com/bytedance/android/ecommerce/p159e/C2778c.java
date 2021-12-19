package com.bytedance.android.ecommerce.p159e;

import android.text.TextUtils;
import com.bytedance.android.ecommerce.p156b.C2754b;
import com.bytedance.android.ecommerce.p156b.C2755c;
import com.bytedance.android.ecommerce.p156b.C2756d;
import com.bytedance.android.ecommerce.p156b.C2758e;
import com.bytedance.android.ecommerce.p156b.C2761f;
import com.bytedance.android.ecommerce.p156b.C2762g;
import com.bytedance.android.ecommerce.p156b.C2763h;
import com.bytedance.android.ecommerce.p156b.C2764i;
import com.bytedance.android.ecommerce.p157c.AbstractC2767b;
import com.bytedance.android.ecommerce.p163i.AbstractC2800a;
import com.bytedance.android.ecommerce.p164j.AbstractC2805d;
import com.bytedance.android.ecommerce.p164j.AbstractC2806e;
import com.bytedance.android.ecommerce.p164j.AbstractC2807f;
import com.bytedance.android.ecommerce.p164j.AbstractC2808g;
import com.bytedance.android.ecommerce.p164j.AbstractC2809h;
import com.bytedance.android.ecommerce.p164j.AbstractC2810i;
import com.bytedance.android.ecommerce.p164j.AbstractC2811j;
import com.bytedance.android.ecommerce.p164j.AbstractC2813k;
import com.bytedance.android.ecommerce.p164j.C2802a;
import com.bytedance.android.ecommerce.p164j.C2803b;
import com.bytedance.android.ecommerce.p164j.C2804c;
import com.bytedance.android.ecommerce.p164j.C2814l;
import com.bytedance.android.ecommerce.p164j.C2815m;
import com.bytedance.android.ecommerce.p164j.C2819n;
import com.bytedance.android.ecommerce.p164j.C2820o;
import com.bytedance.android.ecommerce.p164j.C2824p;
import com.bytedance.android.ecommerce.p165k.C2826b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.C18371a;
import com.bytedance.ies.xbridge.EnumC18483e;
import java.util.Map;

/* renamed from: com.bytedance.android.ecommerce.e.c */
public final class C2778c implements AbstractC2781e {

    /* renamed from: a */
    public static C2778c f8362a = new C2778c();

    /* renamed from: b */
    public boolean f8363b;

    /* renamed from: c */
    private C2773a f8364c;

    /* renamed from: d */
    private volatile AbstractC2806e f8365d;

    /* renamed from: e */
    private volatile AbstractC2809h f8366e;

    /* renamed from: f */
    private volatile AbstractC2800a f8367f;

    /* renamed from: g */
    private volatile AbstractC2807f f8368g;

    /* renamed from: h */
    private volatile AbstractC2810i f8369h;

    /* renamed from: i */
    private volatile AbstractC2811j f8370i;

    /* renamed from: j */
    private volatile AbstractC2805d f8371j;

    /* renamed from: k */
    private volatile AbstractC2813k f8372k;

    /* renamed from: l */
    private volatile AbstractC2808g f8373l;

    /* renamed from: m */
    private boolean f8374m;

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: a */
    public final boolean mo7369a() {
        return this.f8363b;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: d */
    public final C2773a mo7372d() {
        return this.f8364c;
    }

    static {
        Covode.recordClassIndex(3204);
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: b */
    public final AbstractC2806e mo7370b() {
        MethodCollector.m26663i(3837);
        if (this.f8365d == null) {
            synchronized (this) {
                try {
                    if (this.f8365d == null) {
                        this.f8365d = new C2802a(this.f8364c.f8317c, this.f8364c.f8318d, this.f8364c.f8319e, mo7376h());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3837);
                    throw th;
                }
            }
        }
        AbstractC2806e eVar = this.f8365d;
        MethodCollector.m26664o(3837);
        return eVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: c */
    public final AbstractC2809h mo7371c() {
        MethodCollector.m26663i(3839);
        if (this.f8366e == null) {
            synchronized (this) {
                try {
                    if (this.f8366e == null) {
                        this.f8366e = new C2815m();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3839);
                    throw th;
                }
            }
        }
        AbstractC2809h hVar = this.f8366e;
        MethodCollector.m26664o(3839);
        return hVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: e */
    public final AbstractC2800a mo7373e() {
        MethodCollector.m26663i(3841);
        if (this.f8367f == null) {
            synchronized (this) {
                try {
                    if (this.f8367f == null) {
                        this.f8367f = new C2803b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3841);
                    throw th;
                }
            }
        }
        AbstractC2800a aVar = this.f8367f;
        MethodCollector.m26664o(3841);
        return aVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: f */
    public final AbstractC2807f mo7374f() {
        MethodCollector.m26663i(3843);
        if (this.f8368g == null) {
            synchronized (this) {
                try {
                    if (this.f8368g == null) {
                        this.f8368g = new C2804c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3843);
                    throw th;
                }
            }
        }
        AbstractC2807f fVar = this.f8368g;
        MethodCollector.m26664o(3843);
        return fVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: g */
    public final AbstractC2810i mo7375g() {
        MethodCollector.m26663i(3906);
        if (this.f8369h == null) {
            synchronized (this) {
                try {
                    if (this.f8369h == null) {
                        this.f8369h = new C2819n(this.f8364c.f8315a);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3906);
                    throw th;
                }
            }
        }
        AbstractC2810i iVar = this.f8369h;
        MethodCollector.m26664o(3906);
        return iVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: h */
    public final AbstractC2811j mo7376h() {
        MethodCollector.m26663i(3908);
        if (this.f8370i == null) {
            synchronized (this) {
                try {
                    if (this.f8370i == null) {
                        this.f8370i = new C2820o();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3908);
                    throw th;
                }
            }
        }
        AbstractC2811j jVar = this.f8370i;
        MethodCollector.m26664o(3908);
        return jVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: i */
    public final AbstractC2805d mo7377i() {
        MethodCollector.m26663i(3910);
        if (this.f8371j == null) {
            synchronized (this) {
                try {
                    if (this.f8371j == null) {
                        this.f8371j = new C2826b(this.f8364c.f8315a);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3910);
                    throw th;
                }
            }
        }
        AbstractC2805d dVar = this.f8371j;
        MethodCollector.m26664o(3910);
        return dVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: j */
    public final AbstractC2813k mo7378j() {
        MethodCollector.m26663i(3911);
        if (this.f8372k == null) {
            synchronized (this) {
                try {
                    if (this.f8372k == null) {
                        this.f8372k = new C2824p(this.f8364c.f8330p);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3911);
                    throw th;
                }
            }
        }
        AbstractC2813k kVar = this.f8372k;
        MethodCollector.m26664o(3911);
        return kVar;
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: k */
    public final AbstractC2808g mo7379k() {
        MethodCollector.m26663i(3912);
        if (this.f8373l == null) {
            synchronized (this) {
                try {
                    if (this.f8373l == null) {
                        this.f8373l = new C2814l(this.f8364c.f8315a);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3912);
                    throw th;
                }
            }
        }
        AbstractC2808g gVar = this.f8373l;
        MethodCollector.m26664o(3912);
        return gVar;
    }

    /* renamed from: a */
    private static void m7975a(Class cls) {
        C18371a.m34208a(cls, EnumC18483e.ALL, null, 4);
    }

    @Override // com.bytedance.android.ecommerce.p159e.AbstractC2781e
    /* renamed from: a */
    public final void mo7368a(final C2773a aVar) {
        C2773a aVar2 = this.f8364c;
        if (aVar2 == null) {
            this.f8364c = aVar;
        } else {
            if (TextUtils.isEmpty(aVar2.f8316b) && !TextUtils.isEmpty(aVar.f8316b)) {
                aVar2.f8316b = aVar.f8316b;
            }
            if (!(aVar.f8317c == null || aVar.f8318d == null || aVar.f8319e == null)) {
                aVar2.f8317c = aVar.f8317c;
                aVar2.f8318d = aVar.f8318d;
                aVar2.f8319e = aVar.f8319e;
            }
            if (!TextUtils.isEmpty(aVar.f8321g)) {
                aVar2.f8321g = aVar.f8321g;
            }
            if (!TextUtils.isEmpty(aVar.f8322h)) {
                aVar2.f8322h = aVar.f8322h;
            }
            if (!TextUtils.isEmpty(aVar.f8323i)) {
                aVar2.f8323i = aVar.f8323i;
            }
            if (!TextUtils.isEmpty(aVar.f8324j)) {
                aVar2.f8324j = aVar.f8324j;
            }
            if (aVar.f8325k != null) {
                aVar2.f8325k = aVar.f8325k;
            }
            if (!TextUtils.isEmpty(aVar.f8326l)) {
                aVar2.f8326l = aVar.f8326l;
            }
            if (aVar.f8327m != null) {
                aVar2.f8327m = aVar.f8327m;
            }
            if (!TextUtils.isEmpty(aVar.f8329o)) {
                aVar2.f8329o = aVar.f8329o;
            }
            if (!TextUtils.isEmpty(aVar.f8328n)) {
                aVar2.f8328n = aVar.f8328n;
            }
            if (aVar.f8330p != null) {
                aVar2.f8330p = aVar.f8330p;
            }
            if (!TextUtils.isEmpty(aVar.f8331q)) {
                aVar2.f8331q = aVar.f8331q;
            }
            if (!TextUtils.isEmpty(aVar.f8332r)) {
                aVar2.f8332r = aVar.f8332r;
            }
            if (aVar.f8333s != null) {
                aVar2.f8333s = aVar.f8333s;
            }
        }
        this.f8365d = null;
        mo7376h().mo7405a(this.f8364c.f8326l, new AbstractC2811j.AbstractC2812a() {
            /* class com.bytedance.android.ecommerce.p159e.C2778c.C27791 */

            static {
                Covode.recordClassIndex(3205);
            }

            @Override // com.bytedance.android.ecommerce.p164j.AbstractC2811j.AbstractC2812a
            /* renamed from: a */
            public final void mo7349a(Map<String, String> map) {
                C2778c.this.f8363b = true;
                AbstractC2767b bVar = aVar.f8333s;
                if (bVar != null) {
                    bVar.mo7351a();
                }
            }
        });
        if (!this.f8374m) {
            m7975a(C2755c.class);
            m7975a(C2756d.class);
            m7975a(C2761f.class);
            m7975a(C2762g.class);
            m7975a(C2762g.class);
            m7975a(C2763h.class);
            m7975a(C2764i.class);
            m7975a(C2754b.class);
            m7975a(C2758e.class);
        }
        this.f8374m = true;
    }
}
