package com.bytedance.lighten.loader;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.C20818s;
import com.bytedance.lighten.p1477a.C20762s;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20726c;
import com.bytedance.lighten.p1482b.C20769a;
import com.bytedance.lighten.p1482b.C20770b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.common.p1829a.C24064c;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.fresco.animation.p1869d.AbstractC24299c;
import com.facebook.imagepipeline.memory.C24477ab;
import com.facebook.imagepipeline.memory.C24479ac;
import com.facebook.imagepipeline.p1871a.p1873b.C24328b;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24420i;
import com.facebook.imagepipeline.p1882g.C24443d;
import com.facebook.imageutils.C24658b;
import com.facebook.net.C24893c;
import com.facebook.p1826c.p1827a.AbstractC24023c;
import com.facebook.p1826c.p1827a.AbstractC24024d;
import com.facebook.p1826c.p1828b.C24042c;
import com.p1812f.p1813a.C23835b;
import com.p1812f.p1813a.C23836c;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.util.HashSet;

/* renamed from: com.bytedance.lighten.loader.v */
final class C20823v {
    static {
        Covode.recordClassIndex(24399);
    }

    /* renamed from: a */
    private static AbstractC24024d m39166a(final AbstractC20726c cVar) {
        return new AbstractC24024d() {
            /* class com.bytedance.lighten.loader.C20823v.C208252 */

            static {
                Covode.recordClassIndex(24401);
            }

            @Override // com.facebook.p1826c.p1827a.AbstractC24024d
            /* renamed from: a */
            public final void mo34229a(AbstractC24023c cVar) {
            }
        };
    }

    /* renamed from: g */
    private static void m39180g(final C20762s sVar) {
        C24290a.f57583c = new AbstractC24299c() {
            /* class com.bytedance.lighten.loader.C20823v.C208263 */

            static {
                Covode.recordClassIndex(24402);
            }

            /* JADX WARNING: Removed duplicated region for block: B:39:0x0096 A[LOOP:3: B:38:0x0094->B:39:0x0096, LOOP_END] */
            @Override // com.facebook.fresco.animation.p1869d.AbstractC24299c
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.facebook.fresco.animation.p1869d.AbstractC24298b mo34257a(com.facebook.fresco.animation.p1862a.AbstractC24270a r13, java.lang.Object r14) {
                /*
                // Method dump skipped, instructions count: 188
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lighten.loader.C20823v.C208263.mo34257a(com.facebook.fresco.animation.a.a, java.lang.Object):com.facebook.fresco.animation.d.b");
            }
        };
    }

    /* renamed from: b */
    private static void m39171b(final C20762s sVar) {
        if (sVar.f49019x != null) {
            C24658b.f58579a = new C24658b.AbstractC24659a() {
                /* class com.bytedance.lighten.loader.C20823v.C208241 */

                static {
                    Covode.recordClassIndex(24400);
                }

                @Override // com.facebook.imageutils.C24658b.AbstractC24659a
                /* renamed from: a */
                public final void mo34256a(String str) {
                }
            };
        }
    }

    /* renamed from: c */
    private static void m39173c(C20762s sVar) {
        if (sVar.f48998c >= 0) {
            C24328b.f57690b = sVar.f48998c;
        }
    }

    /* renamed from: a */
    private static void m39170a(C24420i.C24422a aVar) {
        aVar.f57948y = new C24443d.C24444a().mo40283a(C20770b.f49132a, new C20770b(), new C20769a()).mo40284a();
    }

    /* renamed from: f */
    private static void m39179f(C20762s sVar) {
        C23835b.f56372e = sVar.f48996a;
        C23835b.f56368a = new C20827w(sVar.f49015t);
        C23835b.f56369b = false;
        C23835b.f56370c = true;
        C23835b.f56371d = sVar.f49013r;
    }

    /* renamed from: a */
    static C24420i m39167a(C20762s sVar) {
        m39173c(sVar);
        C24420i.C24422a a = C24420i.m46539a(sVar.f48996a);
        a.f57937n = m39175d(sVar);
        a.f57946w = m39177e(sVar);
        a.f57924a = sVar.f48997b;
        a.f57929f = true;
        m39172b(sVar, a);
        m39174c(sVar, a);
        m39176d(sVar, a);
        m39170a(a);
        m39178e(sVar, a);
        m39180g(sVar);
        m39171b(sVar);
        m39169a(sVar, a);
        return a.mo40240a();
    }

    /* renamed from: d */
    private static C24042c m39175d(C20762s sVar) {
        C24042c.C24043a a = C24042c.m45500a(sVar.f48996a).mo39572a(sVar.f49000e);
        a.f56929b = "fresco_cache";
        if (sVar.f49003h > 0) {
            a.f56931d = sVar.f49003h;
        }
        a.f56937j = C24064c.m45574a();
        if (sVar.f49016u != null) {
            a.f56936i = m39166a(sVar.f49016u);
        }
        return a.mo39573a();
    }

    /* renamed from: e */
    private static C24042c m39177e(C20762s sVar) {
        C24042c.C24043a a = C24042c.m45500a(sVar.f48996a).mo39572a(sVar.f49000e);
        a.f56929b = "fresco_small_cache";
        if (sVar.f49004i > 0) {
            a.f56931d = sVar.f49004i;
        }
        a.f56937j = C24064c.m45574a();
        if (sVar.f49016u != null) {
            a.f56936i = m39166a(sVar.f49016u);
        }
        return a.mo39573a();
    }

    /* renamed from: a */
    private static void m39169a(C20762s sVar, C24420i.C24422a aVar) {
        if (sVar.f49020y) {
            aVar.f57922A.mo40242a();
        }
    }

    /* renamed from: b */
    private static void m39172b(C20762s sVar, C24420i.C24422a aVar) {
        if (sVar.f49018w) {
            aVar.f57938o = C20818s.C20819a.f49249a;
            C24477ab.C24478a a = C24477ab.m46748a();
            a.f58151d = C20818s.C20819a.f49249a;
            aVar.f57942s = new C24479ac(a.mo40352a());
        }
    }

    /* renamed from: c */
    private static void m39174c(C20762s sVar, C24420i.C24422a aVar) {
        if (sVar.f48999d != null) {
            aVar.f57940q = new C20802p(sVar.f48999d);
            return;
        }
        try {
            aVar.f57940q = new C24893c();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    private static void m39178e(C20762s sVar, C24420i.C24422a aVar) {
        if (sVar.f49012q) {
            HashSet hashSet = new HashSet();
            C20820t.f49250a = new C23836c();
            hashSet.add(C20820t.f49250a);
            aVar.f57944u = hashSet;
            m39179f(sVar);
        }
    }

    /* renamed from: a */
    private static Object m39168a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(10466);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(10466);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: d */
    private static void m39176d(C20762s sVar, C24420i.C24422a aVar) {
        aVar.mo40239a(new C20783b((ActivityManager) m39168a(sVar.f48996a, "activity"), (int) sVar.f49001f));
        aVar.mo40241b(new C20790h((int) sVar.f49002g));
        if (sVar.f49010o) {
            aVar.f57932i = C20817r.m39155a();
        }
        if (sVar.f49007l) {
            C24389j.m46446a().mo40209a(sVar.f49009n);
        }
        if (sVar.f49008m) {
            C24389j.m46446a().f57843a = true;
        }
    }
}
