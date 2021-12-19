package com.bytedance.p1542m.p1543a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1542m.AbstractC21408b;
import com.bytedance.p1542m.C21411c;
import com.bytedance.p1542m.C21412d;
import com.bytedance.p1542m.p1544b.C21409a;
import com.google.android.play.core.p1966e.AbstractC27030c;
import com.google.android.play.core.p1966e.AbstractC27034f;
import com.google.android.play.core.p1966e.AbstractC27035g;
import com.google.android.play.core.p1966e.C26993a;
import com.google.android.play.core.p1966e.C27017b;
import com.google.android.play.core.p1966e.C27031d;
import com.google.android.play.core.p1966e.C27032e;
import com.google.android.play.core.tasks.AbstractC27059a;
import com.google.android.play.core.tasks.AbstractC27060b;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.AbstractC27072n;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.m.a.b */
public class C21399b implements AbstractC21408b {

    /* renamed from: d */
    private static volatile C21399b f50771d;

    /* renamed from: a */
    public List<AbstractC27035g> f50772a = new CopyOnWriteArrayList();

    /* renamed from: b */
    final AbstractC27035g f50773b;

    /* renamed from: c */
    public AbstractC27030c f50774c = C27031d.m53717a(C21411c.f50798b);

    static {
        Covode.recordClassIndex(25019);
    }

    @Override // com.bytedance.p1542m.AbstractC21408b
    /* renamed from: a */
    public final Map<String, C21409a> mo35001a() {
        return C21412d.m40193a().f50803b;
    }

    private C21399b() {
        C214001 r1 = new AbstractC27035g() {
            /* class com.bytedance.p1542m.p1543a.C21399b.C214001 */

            static {
                Covode.recordClassIndex(25020);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.play.core.p1964c.AbstractC26967a
            /* renamed from: a */
            public final /* synthetic */ void mo35005a(AbstractC27034f fVar) {
                final AbstractC27034f fVar2 = fVar;
                if (fVar2.mo44735b() == 5 && Build.VERSION.SDK_INT >= 26) {
                    Context context = C21411c.f50798b;
                    if (Build.VERSION.SDK_INT > 25 && Build.VERSION.SDK_INT < 28) {
                        C27017b.f63935a.mo44598d("Calling dispatchPackageBroadcast", new Object[0]);
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Method method = cls.getMethod("currentActivityThread", new Class[0]);
                            method.setAccessible(true);
                            Object invoke = method.invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mAppThread");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(invoke);
                            obj.getClass().getMethod("dispatchPackageBroadcast", Integer.TYPE, String[].class).invoke(obj, 3, new String[]{context.getPackageName()});
                            C27017b.f63935a.mo44598d("Called dispatchPackageBroadcast", new Object[0]);
                        } catch (Exception unused) {
                            C27017b.f63935a.mo44597c("Update app info with dispatchPackageBroadcast failed!", new Object[0]);
                        }
                    }
                    new Handler().post(new Runnable() {
                        /* class com.bytedance.p1542m.p1543a.C21399b.C214001.RunnableC214011 */

                        static {
                            Covode.recordClassIndex(25021);
                        }

                        public final void run() {
                            C21411c.f50798b.getAssets();
                        }
                    });
                }
                new Handler().post(new Runnable() {
                    /* class com.bytedance.p1542m.p1543a.C21399b.C214001.RunnableC214022 */

                    static {
                        Covode.recordClassIndex(25022);
                    }

                    public final void run() {
                        AbstractC27034f fVar = fVar2;
                        for (String str : fVar.mo44739f()) {
                            String str2 = C21406d.m40180a().f50785b.get(str);
                            if (str2 != null) {
                                str = str2;
                            }
                            C21412d.m40193a().mo35015a(C21399b.m40168a(str, fVar));
                            C21398a.m40167a().f50770a.put(str, fVar);
                        }
                    }
                });
                for (AbstractC27035g gVar : C21399b.this.f50772a) {
                    gVar.mo35005a(fVar2);
                }
            }
        };
        this.f50773b = r1;
        this.f50774c.mo44706a(r1);
        m40171c();
    }

    /* renamed from: b */
    public static C21399b m40170b() {
        MethodCollector.m26663i(10265);
        if (f50771d == null) {
            synchronized (C21399b.class) {
                try {
                    if (f50771d == null) {
                        f50771d = new C21399b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(10265);
                    throw th;
                }
            }
        }
        C21399b bVar = f50771d;
        MethodCollector.m26664o(10265);
        return bVar;
    }

    /* renamed from: c */
    private void m40171c() {
        HashMap hashMap = new HashMap();
        Set<String> b = this.f50774c.mo44709b();
        try {
            JSONArray jSONArray = new JSONArray(C21405c.m40179a(C21411c.f50798b, "plugins.json"));
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("packageName");
                    String optString2 = optJSONObject.optString("aabName");
                    if (optString2 == null) {
                        optString2 = optString;
                    }
                    C21406d a = C21406d.m40180a();
                    if (a.f50784a.containsKey(optString)) {
                        throw new IllegalArgumentException("duplicate config for package name ".concat(String.valueOf(optString)));
                    } else if (!a.f50785b.containsKey(optString2)) {
                        a.f50784a.put(optString, optString2);
                        a.f50785b.put(optString2, optString);
                        if (b.contains(optString2)) {
                            hashMap.put(optString, new C21409a(optString, C21411c.f50799c.mo35000b(), 5));
                        } else {
                            int a2 = C21407e.m40182a().mo35011a(optString);
                            if (a2 == -1) {
                                hashMap.put(optString, new C21409a(optString, C21411c.f50799c.mo35000b(), 0));
                            } else {
                                AbstractC27062d<AbstractC27034f> b2 = this.f50774c.mo44708b(a2);
                                if (!b2.mo44773a()) {
                                    hashMap.put(optString, new C21409a(optString, C21411c.f50799c.mo35000b(), 0));
                                } else {
                                    hashMap.put(optString, m40168a(optString, b2.mo44775c()));
                                }
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("duplicate config for aab name ".concat(String.valueOf(optString2)));
                    }
                }
            }
        } catch (Exception unused) {
        }
        C21412d.m40193a().f50803b.putAll(hashMap);
    }

    @Override // com.bytedance.p1542m.AbstractC21408b
    /* renamed from: b */
    public final C21409a mo35004b(String str) {
        return C21412d.m40193a().f50803b.get(str);
    }

    @Override // com.bytedance.p1542m.AbstractC21408b
    /* renamed from: a */
    public final void mo35002a(final String str) {
        this.f50774c.mo44704a(C27032e.m53718a().mo44732a(C21406d.m40180a().mo35010a(str)).mo44733a()).mo44770a(new AbstractC27060b<Integer>() {
            /* class com.bytedance.p1542m.p1543a.C21399b.C214043 */

            static {
                Covode.recordClassIndex(25024);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.android.play.core.tasks.AbstractC27060b
            /* renamed from: a */
            public final /* synthetic */ void mo35009a(Integer num) {
                C21407e.m40182a().mo35012a(str, num.intValue());
            }
        }).mo44769a(new AbstractC27059a() {
            /* class com.bytedance.p1542m.p1543a.C21399b.C214032 */

            static {
                Covode.recordClassIndex(25023);
            }

            @Override // com.google.android.play.core.tasks.AbstractC27059a
            /* renamed from: a */
            public final void mo35008a(Exception exc) {
                C21399b.m40169a(exc, str);
            }
        });
    }

    /* renamed from: a */
    static C21409a m40168a(String str, AbstractC27034f fVar) {
        C21409a aVar = new C21409a(str, C21411c.f50799c.mo35000b(), fVar.mo44735b());
        aVar.f50791d = fVar.mo44738e();
        aVar.f50792e = fVar.mo44737d();
        aVar.f50795h = fVar.mo44741h();
        aVar.f50794g = fVar.mo44736c();
        return aVar;
    }

    /* renamed from: a */
    public static void m40169a(Exception exc, String str) {
        C21409a aVar = new C21409a(str, C21411c.f50799c.mo35000b(), 6);
        if (exc instanceof C26993a) {
            aVar.f50794g = ((AbstractC27072n) exc).getErrorCode();
        }
        aVar.f50796i = exc;
        C21412d.m40193a().mo35015a(aVar);
    }

    @Override // com.bytedance.p1542m.AbstractC21408b
    /* renamed from: a */
    public final boolean mo35003a(String str, String str2) {
        if (!this.f50774c.mo44709b().contains(C21406d.m40180a().mo35010a(str))) {
            return false;
        }
        try {
            Context context = C21411c.f50798b;
            C27017b.m53684a(context.createPackageContext(context.getPackageName(), 0), str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
