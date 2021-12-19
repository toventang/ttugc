package com.bytedance.p1781y;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.y.f */
public final class C23715f {

    /* renamed from: d */
    private static C23715f f56086d;

    /* renamed from: a */
    public Context f56087a = null;

    /* renamed from: b */
    public C23708b f56088b = null;

    /* renamed from: c */
    public final HashMap<String, C23720g> f56089c;

    /* renamed from: e */
    private final ReentrantReadWriteLock f56090e = new ReentrantReadWriteLock();

    /* renamed from: f */
    private final ArrayList<Object> f56091f = new ArrayList<>();

    /* renamed from: g */
    private boolean f56092g = true;

    /* renamed from: h */
    private long f56093h = 0;

    /* renamed from: i */
    private int f56094i = 600;

    /* renamed from: j */
    private long f56095j = 0;

    /* renamed from: k */
    private Timer f56096k = null;

    /* renamed from: l */
    private TimerTask f56097l = null;

    /* renamed from: m */
    private final long f56098m = 0;

    static {
        Covode.recordClassIndex(27820);
    }

    /* renamed from: a */
    public static synchronized C23715f m44812a() {
        C23715f fVar;
        synchronized (C23715f.class) {
            MethodCollector.m26663i(4736);
            if (f56086d == null) {
                f56086d = new C23715f();
            }
            fVar = f56086d;
            MethodCollector.m26664o(4736);
        }
        return fVar;
    }

    /* renamed from: b */
    private void m44813b() {
        this.f56090e.readLock().lock();
        Iterator<Object> it = this.f56091f.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f56090e.readLock().unlock();
    }

    private C23715f() {
        HashMap<String, C23720g> hashMap = new HashMap<>();
        this.f56089c = hashMap;
        hashMap.put("vod", new C23720g("vod", 3));
        hashMap.put("mdl", new C23720g("mdl", 3));
        hashMap.put("upload", new C23720g("upload", 3));
        hashMap.put("common", new C23720g("common", 2));
    }

    /* renamed from: a */
    public static Context m44811a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: b */
    public final void mo39146b(String str) {
        C23708b bVar = this.f56088b;
        if (bVar != null) {
            bVar.f56071d = 0;
            bVar.mo39135a(str, null);
        }
    }

    /* renamed from: c */
    public final void mo39147c(String str) {
        C23720g gVar = this.f56089c.get(str);
        if (!gVar.mo39156a(m44811a(this.f56087a))) {
            return;
        }
        if (this.f56092g) {
            m44813b();
        } else {
            gVar.mo39153a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo39143a(long j) {
        long j2 = j;
        synchronized (this) {
            MethodCollector.m26663i(4803);
            TimerTask timerTask = this.f56097l;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f56097l = new TimerTask() {
                /* class com.bytedance.p1781y.C23715f.C237183 */

                static {
                    Covode.recordClassIndex(27823);
                }

                public final void run() {
                    C23715f.this.mo39146b("all");
                }
            };
            Timer timer = this.f56096k;
            if (timer != null) {
                timer.purge();
            } else {
                this.f56096k = new Timer(true);
            }
            if (j2 * 1000 < 1000) {
                j2 = 86400;
            }
            C23712d.m44807a("Manager", "reset schedule");
            try {
                long j3 = j2 * 1000;
                this.f56096k.schedule(this.f56097l, j3, j3);
                MethodCollector.m26664o(4803);
            } catch (Throwable th) {
                C23712d.m44808b("Manager", "reset schedule fail. " + th.toString());
                MethodCollector.m26664o(4803);
            }
        }
    }

    /* renamed from: a */
    public final void mo39144a(final String str) {
        new Thread(new Runnable() {
            /* class com.bytedance.p1781y.C23715f.RunnableC237172 */

            static {
                Covode.recordClassIndex(27822);
            }

            public final void run() {
                C23715f.this.mo39148d(str);
            }
        }).start();
    }

    /* renamed from: d */
    public final synchronized void mo39148d(String str) {
        MethodCollector.m26663i(4776);
        if (this.f56093h < 1) {
            C23720g gVar = this.f56089c.get("common");
            gVar.mo39156a(m44811a(this.f56087a));
            boolean z = false;
            try {
                this.f56094i = gVar.mo39157b("fetch_interval", 0);
                this.f56095j = gVar.mo39152a("config_version");
                this.f56093h = gVar.mo39152a("local_cache_expire");
                if (gVar.mo39157b("use_local_cache", 1) > 0) {
                    z = true;
                }
                this.f56092g = z;
            } catch (Throwable th) {
                C23712d.m44808b("Manager", th.toString());
            }
            mo39147c("vod");
            mo39147c("mdl");
            mo39147c("upload");
        }
        C23708b bVar = this.f56088b;
        if (bVar != null) {
            bVar.mo39133a(this.f56094i);
            this.f56088b.mo39134a(this.f56095j);
        }
        long currentTimeMillis = System.currentTimeMillis();
        C23712d.m44807a("Manager", "use cache: " + this.f56092g + ", expire = " + this.f56093h + ", curTimeMs = " + currentTimeMillis);
        if (!this.f56092g || this.f56093h <= currentTimeMillis) {
            mo39146b(str);
        }
        mo39143a((long) this.f56094i);
        MethodCollector.m26664o(4776);
    }

    /* renamed from: com.bytedance.y.f$a */
    public class C23719a implements AbstractC23711c {

        /* renamed from: b */
        private final WeakReference<C23715f> f56105b;

        static {
            Covode.recordClassIndex(27824);
        }

        public C23719a(C23715f fVar) {
            this.f56105b = new WeakReference<>(fVar);
        }

        @Override // com.bytedance.p1781y.AbstractC23711c
        /* renamed from: a */
        public final void mo39139a(int i, String str) {
            mo39140a(i, str, null, null, null);
        }

        @Override // com.bytedance.p1781y.AbstractC23711c
        /* renamed from: a */
        public final void mo39140a(int i, String str, JSONObject jSONObject, String str2, String str3) {
            C23715f fVar = this.f56105b.get();
            if (fVar != null) {
                C23712d.m44807a("Manager", "refresh settings: code " + i + ", message = " + str);
                if (i != 0) {
                    C23712d.m44808b("Manager", "refresh data fail. code = ".concat(String.valueOf(i)));
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("general_settings");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("config_version");
                    fVar.f56088b.mo39134a(optLong);
                    C23720g gVar = C23715f.this.f56089c.get("common");
                    gVar.mo39155a("config_version", optLong);
                    int optInt = optJSONObject.optInt("fetch_interval");
                    if (optInt > 0 && optInt != gVar.mo39157b("fetch_interval", -1)) {
                        gVar.mo39154a("fetch_interval", optInt);
                        fVar.f56088b.mo39133a(optInt);
                        C23715f.this.mo39143a((long) optInt);
                    }
                    long optLong2 = optJSONObject.optLong("local_cache_expire");
                    if (optLong2 > 0) {
                        gVar.mo39155a("local_cache_expire", System.currentTimeMillis() + (optLong2 * 1000));
                    }
                    boolean optBoolean = optJSONObject.optBoolean("use_local_cache");
                    gVar.mo39154a("use_local_cache", optBoolean ? 1 : 0);
                    if (!optBoolean) {
                        C23715f.this.f56089c.get("vod").mo39153a();
                        C23715f.this.f56089c.get("mdl").mo39153a();
                        C23715f.this.f56089c.get("upload").mo39153a();
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("custom_settings");
                if (optJSONObject2 == null) {
                    return;
                }
                if (str2 == null || str2.equals("all")) {
                    C23715f.this.mo39145a("vod", str3, optJSONObject2.optJSONObject("vod"));
                    C23715f.this.mo39145a("mdl", str3, optJSONObject2.optJSONObject("mdl"));
                    C23715f.this.mo39145a("upload", str3, optJSONObject2.optJSONObject("upload"));
                    return;
                }
                C23715f.this.mo39145a(str2, str3, optJSONObject2.optJSONObject(str2));
            }
        }
    }

    /* renamed from: a */
    public final int mo39142a(String str, String str2, int i) {
        return this.f56089c.get(str).mo39157b(str2, i);
    }

    /* renamed from: a */
    public final void mo39145a(String str, String str2, JSONObject jSONObject) {
        boolean z;
        if (jSONObject != null) {
            C23720g gVar = this.f56089c.get(str);
            JSONObject b = gVar.mo39159b();
            if (b == null || !b.toString().equals(jSONObject.toString())) {
                if (str2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                gVar.mo39156a(gVar.f56110e);
                gVar.f56106a.writeLock().lock();
                try {
                    if (gVar.f56107b != null) {
                        if (z) {
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                gVar.f56107b.putOpt(next, jSONObject.opt(next));
                                C23712d.m44807a("Storage", "update json, key = " + next + ", value = " + jSONObject.opt(next));
                            }
                            if ((gVar.f56108c & 2) > 0 && gVar.f56109d != null) {
                                SharedPreferences.Editor edit = gVar.f56109d.edit();
                                edit.putString(gVar.mo39160c(), gVar.f56107b.toString());
                                edit.apply();
                            }
                            gVar.f56106a.writeLock().unlock();
                            m44813b();
                        }
                    }
                    gVar.f56107b = jSONObject;
                    SharedPreferences.Editor edit2 = gVar.f56109d.edit();
                    edit2.putString(gVar.mo39160c(), gVar.f56107b.toString());
                    edit2.apply();
                } catch (JSONException e) {
                    e.printStackTrace();
                    C23712d.m44808b("Storage", e.toString());
                } catch (Throwable th) {
                    gVar.f56106a.writeLock().unlock();
                    throw th;
                }
                gVar.f56106a.writeLock().unlock();
                m44813b();
            }
        }
    }
}
