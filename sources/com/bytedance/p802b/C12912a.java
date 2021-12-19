package com.bytedance.p802b;

import android.content.Context;
import android.util.Pair;
import com.bytedance.apm.C12397c;
import com.bytedance.apm.C12440d;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12577c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.p977a.p978a.C14578a;
import com.bytedance.p802b.p806b.p807a.AbstractC12976g;
import com.bytedance.p802b.p824f.AbstractC13080b;
import com.bytedance.p802b.p824f.C13044a;
import com.bytedance.p802b.p827g.AbstractC13081a;
import com.bytedance.p802b.p827g.p828a.AbstractC13083b;
import com.bytedance.p802b.p834j.p835a.AbstractC13101a;
import com.bytedance.p802b.p834j.p836b.AbstractC13103a;
import com.bytedance.services.apm.api.AbstractC22712e;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.slardar.config.AbstractC22716b;
import com.p2082ss.android.common.util.C29843f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.b.a */
public final class C12912a {

    /* renamed from: a */
    public static List<AbstractC22716b> f31433a;

    static {
        Covode.recordClassIndex(14748);
    }

    /* renamed from: a */
    public static Runnable m23153a(final Context context) {
        return C13044a.m23472a(new AbstractC13080b() {
            /* class com.bytedance.p802b.C12912a.C129131 */

            static {
                Covode.recordClassIndex(14749);
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: a */
            public final IHttpService mo20738a() {
                return C12397c.f29938h;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: b */
            public final Context mo20739b() {
                return context;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: g */
            public final String mo20744g() {
                return C29843f.m60132b(C12397c.f29931a);
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: o */
            public final AbstractC22712e mo20752o() {
                return ApmDelegate.C12507a.f30372a.f30338f;
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: p */
            public final AbstractC13103a mo20753p() {
                return new AbstractC13103a() {
                    /* class com.bytedance.p802b.C12912a.C129131.C129141 */

                    static {
                        Covode.recordClassIndex(14750);
                    }

                    @Override // com.bytedance.p802b.p834j.p836b.AbstractC13103a
                    /* renamed from: a */
                    public final String mo20761a(String str, List<Pair<String, String>> list) {
                        return C14578a.m26655a(str, list);
                    }
                };
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b, com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: r */
            public final JSONObject mo20755r() {
                return super.mo20755r();
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: t */
            public final AbstractC12976g mo20757t() {
                return new AbstractC12976g() {
                    /* class com.bytedance.p802b.C12912a.C129131.C129152 */

                    static {
                        Covode.recordClassIndex(14751);
                    }

                    @Override // com.bytedance.p802b.p806b.p807a.AbstractC12976g
                    /* renamed from: a */
                    public final void mo20762a(final JSONObject jSONObject) {
                        if (C12397c.m22285b()) {
                            C12560b.C12564a.f30567a.mo20387a(new Runnable() {
                                /* class com.bytedance.p802b.C12912a.C129131.C129152.RunnableC129161 */

                                static {
                                    Covode.recordClassIndex(14752);
                                }

                                public final void run() {
                                    if (C12912a.f31433a != null) {
                                        Iterator<AbstractC22716b> it = C12912a.f31433a.iterator();
                                        while (it.hasNext()) {
                                            it.next();
                                        }
                                    }
                                }
                            });
                        }
                    }
                };
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: u */
            public final AbstractC13083b mo20758u() {
                return new C12977c();
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: v */
            public final AbstractC13081a mo20759v() {
                return new C12926b();
            }

            @Override // com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: w */
            public final AbstractC13101a mo20760w() {
                return new AbstractC13101a() {
                    /* class com.bytedance.p802b.C12912a.C129131.C129173 */

                    static {
                        Covode.recordClassIndex(14753);
                    }

                    @Override // com.bytedance.p802b.p834j.p835a.AbstractC13101a
                    /* renamed from: a */
                    public final JSONObject mo20764a() {
                        JSONObject jSONObject = new JSONObject();
                        C12577c.C12579a.f30614a.mo20405b(jSONObject, false);
                        return jSONObject;
                    }
                };
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: c */
            public final int mo20740c() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30199a;
                }
                return 0;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: d */
            public final String mo20741d() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30200b;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: h */
            public final String mo20745h() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30202d;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: i */
            public final int mo20746i() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30203e;
                }
                return 0;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: j */
            public final String mo20747j() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30204f;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: k */
            public final int mo20748k() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30203e;
                }
                return 0;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: l */
            public final String mo20749l() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30207i;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: m */
            public final String mo20750m() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30208j;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: n */
            public final int mo20751n() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30205g;
                }
                return 0;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b, com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: q */
            public final JSONObject mo20754q() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30209k;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b, com.bytedance.p802b.p824f.AbstractC13080b
            /* renamed from: s */
            public final Map<String, String> mo20756s() {
                C12440d g = C12397c.m22290g();
                if (g != null) {
                    return g.f30210l;
                }
                return null;
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: e */
            public final long mo20742e() {
                if (C12397c.m22290g() == null || C12397c.f29937g == null) {
                    return 0;
                }
                return C12397c.f29937g.mo20252c();
            }

            @Override // com.bytedance.p802b.p821e.p822a.AbstractC13038b
            /* renamed from: f */
            public final String mo20743f() {
                if (C12397c.m22290g() == null || C12397c.f29937g == null) {
                    return null;
                }
                return C12397c.f29937g.mo20251b();
            }
        });
    }
}
