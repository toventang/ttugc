package com.bytedance.push;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.notification.C21873f;
import com.bytedance.push.notification.C21876g;
import com.bytedance.push.p1590c.AbstractC21773d;
import com.bytedance.push.p1590c.AbstractC21774e;
import com.bytedance.push.p1590c.AbstractC21775f;
import com.bytedance.push.p1590c.AbstractC21776g;
import com.bytedance.push.p1590c.AbstractC21778i;
import com.bytedance.push.p1590c.AbstractC21780k;
import com.bytedance.push.p1590c.AbstractC21781l;
import com.bytedance.push.p1592e.AbstractC21796a;
import com.bytedance.push.p1592e.C21797b;
import com.bytedance.push.p1596g.C21828d;
import com.bytedance.push.p1596g.C21829e;
import com.bytedance.push.p1597h.C21835a;
import com.p2082ss.android.message.p2159a.C30062a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.push.f */
public final class C21798f implements AbstractC21780k {

    /* renamed from: a */
    public static C21798f f51646a = new C21798f();

    /* renamed from: b */
    private C21797b f51647b = new C21797b();

    /* renamed from: c */
    private C21767c f51648c;

    /* renamed from: d */
    private C21835a f51649d;

    /* renamed from: e */
    private volatile AbstractC21775f f51650e;

    /* renamed from: f */
    private volatile C21820g f51651f;

    /* renamed from: g */
    private volatile C21833h f51652g;

    /* renamed from: h */
    private volatile AbstractC21776g f51653h;

    /* renamed from: i */
    private volatile AbstractC21774e f51654i;

    /* renamed from: j */
    private volatile JSONObject f51655j;

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: h */
    public final C21767c mo35451h() {
        return this.f51648c;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: j */
    public final AbstractC21796a mo35453j() {
        return this.f51647b;
    }

    /* renamed from: a */
    public static AbstractC21796a m40813a() {
        return f51646a.mo35453j();
    }

    /* renamed from: b */
    public static AbstractC21781l m40814b() {
        return f51646a.mo35452i();
    }

    /* renamed from: c */
    public static AbstractC21776g m40815c() {
        return f51646a.mo35454k();
    }

    /* renamed from: d */
    public static AbstractC21774e m40816d() {
        return f51646a.mo35456m();
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: e */
    public final Map<String, String> mo35448e() {
        return this.f51649d.mo35512a();
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: l */
    public final AbstractC21773d mo35455l() {
        return this.f51648c.f51592l;
    }

    static {
        Covode.recordClassIndex(25447);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: f */
    public final AbstractC21775f mo35449f() {
        MethodCollector.m26663i(3072);
        if (this.f51650e == null) {
            synchronized (this) {
                try {
                    if (this.f51650e == null) {
                        this.f51650e = new C21873f(this);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3072);
                    throw th;
                }
            }
        }
        AbstractC21775f fVar = this.f51650e;
        MethodCollector.m26664o(3072);
        return fVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: g */
    public final AbstractC21778i mo35450g() {
        MethodCollector.m26663i(3075);
        if (this.f51651f == null) {
            synchronized (this) {
                try {
                    if (this.f51651f == null) {
                        this.f51651f = new C21820g();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3075);
                    throw th;
                }
            }
        }
        C21820g gVar = this.f51651f;
        MethodCollector.m26664o(3075);
        return gVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: i */
    public final AbstractC21781l mo35452i() {
        MethodCollector.m26663i(3078);
        if (this.f51652g == null) {
            synchronized (this) {
                try {
                    if (this.f51652g == null) {
                        this.f51652g = new C21833h(mo35450g(), mo35454k(), this.f51648c);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3078);
                    throw th;
                }
            }
        }
        C21833h hVar = this.f51652g;
        MethodCollector.m26664o(3078);
        return hVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: k */
    public final AbstractC21776g mo35454k() {
        MethodCollector.m26663i(3162);
        if (this.f51653h == null) {
            synchronized (this) {
                try {
                    if (this.f51653h == null) {
                        this.f51653h = new C21876g(this.f51648c);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3162);
                    throw th;
                }
            }
        }
        AbstractC21776g gVar = this.f51653h;
        MethodCollector.m26664o(3162);
        return gVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: m */
    public final AbstractC21774e mo35456m() {
        MethodCollector.m26663i(3167);
        if (this.f51654i == null) {
            synchronized (this) {
                try {
                    if (this.f51654i == null) {
                        if (C30062a.m60803a(this.f51648c.f51581a)) {
                            this.f51654i = new C21828d(this.f51648c);
                        } else {
                            this.f51654i = new C21829e();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3167);
                    throw th;
                }
            }
        }
        AbstractC21774e eVar = this.f51654i;
        MethodCollector.m26664o(3167);
        return eVar;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: a */
    public final void mo35447a(JSONObject jSONObject) {
        this.f51655j = jSONObject;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21780k
    /* renamed from: a */
    public final void mo35446a(C21767c cVar, C21835a aVar) {
        this.f51648c = cVar;
        this.f51649d = aVar;
    }
}
