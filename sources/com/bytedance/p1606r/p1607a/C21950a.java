package com.bytedance.p1606r.p1607a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1606r.p1607a.C21961c;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21958a;
import com.bytedance.p1606r.p1607a.p1608a.AbstractC21959b;
import com.google.android.play.core.p1966e.AbstractC27030c;
import com.google.android.play.core.p1966e.AbstractC27035g;
import com.google.android.play.core.p1966e.C27031d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.r.a.a */
public final class C21950a {

    /* renamed from: a */
    public AbstractC27030c f51943a;

    /* renamed from: b */
    public final Queue<C21961c> f51944b = new LinkedList();

    /* renamed from: c */
    public final Handler f51945c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public boolean f51946d;

    /* renamed from: e */
    public SharedPreferences f51947e;

    /* renamed from: f */
    private AbstractC27035g f51948f;

    static {
        Covode.recordClassIndex(25616);
    }

    /* renamed from: b */
    public final void mo35707b() {
        this.f51945c.post(new Runnable() {
            /* class com.bytedance.p1606r.p1607a.C21950a.RunnableC219564 */

            static {
                Covode.recordClassIndex(25622);
            }

            public final void run() {
                C21950a.this.f51946d = false;
                C21950a.this.mo35708c();
            }
        });
    }

    C21950a() {
    }

    /* renamed from: a */
    public final void mo35704a() {
        AbstractC27035g gVar;
        AbstractC27030c cVar = this.f51943a;
        if (cVar != null && (gVar = this.f51948f) != null) {
            cVar.mo44710b(gVar);
            this.f51948f = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r4 = r6.f51944b.poll();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35708c() {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1606r.p1607a.C21950a.mo35708c():void");
    }

    /* renamed from: a */
    public static void m41289a(AbstractC21959b bVar) {
        if (bVar != null) {
            bVar.mo10645a();
        }
    }

    /* renamed from: b */
    public static void m41292b(AbstractC21959b bVar) {
        if (bVar != null) {
            bVar.mo10646b();
        }
    }

    /* renamed from: a */
    public static Context m41286a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    static String m41287a(C21961c cVar) {
        return TextUtils.join(",", cVar.f51964a);
    }

    /* renamed from: b */
    private static long m41291b(C21961c cVar) {
        if (cVar.f51967d <= 0) {
            return 60000;
        }
        if (cVar.f51967d >= 960000) {
            return 960000;
        }
        return cVar.f51967d * 2;
    }

    /* renamed from: b */
    public final Set<String> mo35706b(Context context) {
        if (this.f51943a == null) {
            this.f51943a = C27031d.m53717a(m41286a(context));
        }
        return this.f51943a.mo44709b();
    }

    /* renamed from: a */
    static JSONObject m41288a(C21961c cVar, String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", str);
            jSONObject.put("plugin_names", m41287a(cVar));
            if (cVar.f51968e) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            jSONObject.put("is_retry", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo35705a(final C21961c cVar, boolean z) {
        if (z) {
            final long b = m41291b(cVar);
            this.f51945c.postDelayed(new Runnable() {
                /* class com.bytedance.p1606r.p1607a.C21950a.RunnableC219575 */

                static {
                    Covode.recordClassIndex(25623);
                }

                public final void run() {
                    C21961c.C21962a aVar = new C21961c.C21962a(cVar.f51964a);
                    aVar.f51969a = null;
                    aVar.f51970b = cVar.f51966c;
                    C21961c a = aVar.mo35713a();
                    a.f51967d = b;
                    a.f51968e = true;
                    C21950a.this.f51944b.add(a);
                    C21950a.this.mo35708c();
                }
            }, b);
            return;
        }
        cVar.f51967d = 0;
        cVar.f51968e = false;
        this.f51944b.add(cVar);
        mo35708c();
    }

    /* renamed from: a */
    public static void m41290a(C21961c cVar, long j, int i, String str) {
        AbstractC21958a aVar = cVar.f51966c;
        if (aVar != null) {
            JSONObject a = m41288a(cVar, "plugin_install_failed");
            try {
                a.put("duration", j);
                a.put("error_code", i);
                a.put("error_msg", str);
            } catch (JSONException unused) {
            }
            aVar.mo18050a(a);
        }
    }
}
