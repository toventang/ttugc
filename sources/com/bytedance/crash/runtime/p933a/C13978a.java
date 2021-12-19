package com.bytedance.crash.runtime.p933a;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.p931i.AbstractC13883a;
import com.bytedance.crash.runtime.C14019n;
import com.bytedance.crash.runtime.C14022p;
import com.bytedance.crash.util.C14040a;
import com.bytedance.crash.util.C14047d;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14062n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.runtime.a.a */
public class C13978a {

    /* renamed from: B */
    private static volatile C13978a f34062B;

    /* renamed from: a */
    public static boolean f34063a = true;

    /* renamed from: b */
    public static boolean f34064b;

    /* renamed from: c */
    public static boolean f34065c;

    /* renamed from: d */
    public static int f34066d = 1;

    /* renamed from: e */
    public static boolean f34067e;

    /* renamed from: f */
    public static long f34068f = -1;

    /* renamed from: A */
    private final Application f34069A;

    /* renamed from: g */
    public final List<String> f34070g = new ArrayList();

    /* renamed from: h */
    public final List<Long> f34071h = new ArrayList();

    /* renamed from: i */
    public final List<String> f34072i = new ArrayList();

    /* renamed from: j */
    public final List<Long> f34073j = new ArrayList();

    /* renamed from: k */
    final LinkedList<C13982a> f34074k = new LinkedList<>();

    /* renamed from: l */
    public String f34075l;

    /* renamed from: m */
    public long f34076m;

    /* renamed from: n */
    public String f34077n;

    /* renamed from: o */
    public long f34078o;

    /* renamed from: p */
    public String f34079p;

    /* renamed from: q */
    public long f34080q;

    /* renamed from: r */
    public String f34081r;

    /* renamed from: s */
    public long f34082s;

    /* renamed from: t */
    public String f34083t;

    /* renamed from: u */
    public long f34084u;

    /* renamed from: v */
    public boolean f34085v;

    /* renamed from: w */
    public long f34086w = -1;

    /* renamed from: x */
    public int f34087x = 50;

    /* renamed from: y */
    public int f34088y;

    /* renamed from: z */
    public AbstractC13883a f34089z;

    /* renamed from: b */
    public final long mo22492b() {
        return SystemClock.uptimeMillis() - this.f34086w;
    }

    static {
        Covode.recordClassIndex(16043);
    }

    /* renamed from: a */
    public static C13978a m25303a() {
        MethodCollector.m26663i(3106);
        if (f34062B == null) {
            synchronized (C13978a.class) {
                try {
                    if (f34062B == null) {
                        f34062B = new C13978a(C13933m.f33937b);
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3106);
                    throw th;
                }
            }
        }
        C13978a aVar = f34062B;
        MethodCollector.m26664o(3106);
        return aVar;
    }

    /* renamed from: c */
    public final JSONArray mo22493c() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = new ArrayList(this.f34074k).iterator();
        while (it.hasNext()) {
            jSONArray.put(((C13982a) it.next()).toString());
        }
        return jSONArray;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.a.a$a */
    public static class C13982a {

        /* renamed from: a */
        String f34097a;

        /* renamed from: b */
        String f34098b;

        /* renamed from: c */
        long f34099c;

        static {
            Covode.recordClassIndex(16047);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            if (C14047d.f34224a == null) {
                C14047d.f34224a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            }
            return sb.append(C14047d.f34224a.format(new Date(this.f34099c))).append(" : ").append(this.f34097a).append(' ').append(this.f34098b).toString();
        }

        C13982a(String str, String str2, long j) {
            this.f34098b = str2;
            this.f34099c = j;
            this.f34097a = str;
        }
    }

    private C13978a(Application application) {
        this.f34069A = application;
        try {
            int i = Build.VERSION.SDK_INT;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                    /* class com.bytedance.crash.runtime.p933a.C13978a.C139813 */

                    static {
                        Covode.recordClassIndex(16046);
                    }

                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    public final void onActivityStarted(Activity activity) {
                        String a;
                        C13978a aVar = C13978a.this;
                        if (aVar.f34089z == null) {
                            a = activity.getClass().getName();
                        } else {
                            a = C13978a.this.f34089z.mo22365a(activity);
                        }
                        aVar.f34077n = a;
                        C13978a.this.f34078o = System.currentTimeMillis();
                        C13978a aVar2 = C13978a.this;
                        aVar2.mo22491a(aVar2.f34077n, C13978a.this.f34078o, "onStart", activity.hashCode());
                    }

                    public final void onActivityStopped(Activity activity) {
                        String a;
                        C13978a aVar = C13978a.this;
                        if (aVar.f34089z == null) {
                            a = activity.getClass().getName();
                        } else {
                            a = C13978a.this.f34089z.mo22365a(activity);
                        }
                        aVar.f34083t = a;
                        C13978a.this.f34084u = System.currentTimeMillis();
                        C13978a aVar2 = C13978a.this;
                        aVar2.mo22491a(aVar2.f34083t, C13978a.this.f34084u, "onStop", activity.hashCode());
                    }

                    public final void onActivityDestroyed(Activity activity) {
                        String a;
                        if (C13978a.this.f34089z == null) {
                            a = activity.getClass().getName();
                        } else {
                            a = C13978a.this.f34089z.mo22365a(activity);
                        }
                        int indexOf = C13978a.this.f34070g.indexOf(a);
                        if (indexOf >= 0 && indexOf < C13978a.this.f34070g.size()) {
                            C13978a.this.f34070g.remove(indexOf);
                            C13978a.this.f34071h.remove(indexOf);
                        }
                        C13978a.this.f34072i.add(a);
                        long currentTimeMillis = System.currentTimeMillis();
                        C13978a.this.f34073j.add(Long.valueOf(currentTimeMillis));
                        C13978a.this.mo22491a(a, currentTimeMillis, "onDestroy", activity.hashCode());
                    }

                    public final void onActivityPaused(Activity activity) {
                        String a;
                        C13978a aVar = C13978a.this;
                        if (aVar.f34089z == null) {
                            a = activity.getClass().getName();
                        } else {
                            a = C13978a.this.f34089z.mo22365a(activity);
                        }
                        aVar.f34081r = a;
                        C13978a.this.f34082s = System.currentTimeMillis();
                        C13978a aVar2 = C13978a.this;
                        aVar2.f34088y--;
                        if (C13978a.this.f34088y == 0) {
                            C13978a.this.f34085v = false;
                            C13978a.f34065c = false;
                            C13978a.this.f34086w = SystemClock.uptimeMillis();
                        } else if (C13978a.this.f34088y < 0) {
                            C13978a.this.f34088y = 0;
                            C13978a.this.f34085v = false;
                            C13978a.f34065c = false;
                            C13978a.this.f34086w = SystemClock.uptimeMillis();
                        }
                        C13978a aVar3 = C13978a.this;
                        aVar3.mo22491a(aVar3.f34081r, C13978a.this.f34082s, "onPause", activity.hashCode());
                    }

                    public final void onActivityResumed(Activity activity) {
                        String a;
                        C13978a aVar = C13978a.this;
                        if (aVar.f34089z == null) {
                            a = activity.getClass().getName();
                        } else {
                            a = C13978a.this.f34089z.mo22365a(activity);
                        }
                        aVar.f34079p = a;
                        C13978a.this.f34080q = System.currentTimeMillis();
                        C13978a.this.f34088y++;
                        if (!C13978a.this.f34085v) {
                            C13978a.this.f34085v = true;
                            if (C13978a.f34063a) {
                                C13978a.f34063a = false;
                                C13978a.f34066d = 1;
                                C13978a.f34068f = C13978a.this.f34080q;
                            }
                            if (C13978a.this.f34079p.equals(C13978a.this.f34081r)) {
                                if (C13978a.f34065c && !C13978a.f34064b) {
                                    C13978a.f34066d = 4;
                                    C13978a.f34068f = C13978a.this.f34080q;
                                } else if (!C13978a.f34065c) {
                                    C13978a.f34066d = 3;
                                    C13978a.f34068f = C13978a.this.f34080q;
                                }
                            }
                        }
                        C13978a aVar2 = C13978a.this;
                        aVar2.mo22491a(aVar2.f34079p, C13978a.this.f34080q, "onResume", activity.hashCode());
                    }

                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        String a;
                        boolean z;
                        C13978a aVar = C13978a.this;
                        if (aVar.f34089z == null) {
                            a = activity.getClass().getName();
                        } else {
                            a = C13978a.this.f34089z.mo22365a(activity);
                        }
                        aVar.f34075l = a;
                        C13978a.this.f34076m = System.currentTimeMillis();
                        if (bundle != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C13978a.f34064b = z;
                        C13978a.f34065c = true;
                        C13978a.this.f34070g.add(C13978a.this.f34075l);
                        C13978a.this.f34071h.add(Long.valueOf(C13978a.this.f34076m));
                        C13978a aVar2 = C13978a.this;
                        aVar2.mo22491a(aVar2.f34075l, C13978a.this.f34076m, "onCreate", activity.hashCode());
                    }
                });
            }
        } catch (Throwable unused) {
        }
        C14040a.f34211a = new Callable<JSONArray>() {
            /* class com.bytedance.crash.runtime.p933a.C13978a.CallableC139791 */

            static {
                Covode.recordClassIndex(16044);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ JSONArray call() {
                return C13978a.m25303a().mo22493c();
            }
        };
    }

    /* renamed from: a */
    public static JSONObject m25304a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        C14062n.m25593a(jSONObject, StringSet.name, str);
        C14062n.m25593a(jSONObject, "time", Long.valueOf(j));
        return jSONObject;
    }

    /* renamed from: a */
    public final JSONArray mo22490a(List<String> list, List<Long> list2) {
        JSONArray jSONArray = new JSONArray();
        if (this.f34070g != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                try {
                    jSONArray.put(m25304a(list.get(i), list2.get(i).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final void mo22491a(final String str, final long j, final String str2, final int i) {
        C14019n.m25421b().mo22551a(new Runnable() {
            /* class com.bytedance.crash.runtime.p933a.C13978a.RunnableC139802 */

            static {
                Covode.recordClassIndex(16045);
            }

            public final void run() {
                C13982a aVar;
                try {
                    C13978a aVar2 = C13978a.this;
                    String str = str;
                    String str2 = str2;
                    long j = j;
                    if (aVar2.f34074k.size() < aVar2.f34087x || (aVar = aVar2.f34074k.poll()) == null) {
                        aVar = new C13982a(str, str2, j);
                        aVar2.f34074k.add(aVar);
                    } else {
                        aVar2.f34074k.add(aVar);
                    }
                    aVar.f34098b = str2;
                    aVar.f34097a = str;
                    aVar.f34099c = j;
                } catch (Throwable unused) {
                }
                String str3 = str + '.' + str2 + '@' + Long.toHexString((long) i);
                long j2 = j;
                try {
                    File a = C14022p.m25425a();
                    if (a != null) {
                        C14056j.m25566a(a, "activityLifeCycle" + ' ' + str3 + ' ' + C14047d.m25529a().format(new Date(j2)) + '\n', true);
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }
}
