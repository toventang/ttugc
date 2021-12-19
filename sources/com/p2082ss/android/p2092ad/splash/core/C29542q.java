package com.p2082ss.android.p2092ad.splash.core;

import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.AbstractC29671l;
import com.p2082ss.android.p2092ad.splash.C29676q;
import com.p2082ss.android.p2092ad.splash.core.p2098c.C29446b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29457c;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29506c;
import com.p2082ss.android.p2092ad.splash.p2094b.C29381b;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29643f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.p2092ad.splash.p2109f.C29662p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.q */
final class C29542q implements AbstractC29541p {

    /* renamed from: a */
    private AbstractC29671l f70394a;

    /* renamed from: b */
    private volatile boolean f70395b;

    /* renamed from: c */
    private long f70396c;

    /* renamed from: d */
    private View f70397d;

    static {
        Covode.recordClassIndex(35936);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: b */
    public final void mo51662b() {
        this.f70396c = System.currentTimeMillis();
    }

    /* renamed from: d */
    private void m59253d() {
        this.f70395b = true;
        C29545s.m59268s().f70401a = false;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: c */
    public final void mo51665c() {
        this.f70394a.mo28734a(m59251a(4));
        m59253d();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: a */
    public final void mo51658a() {
        if (!this.f70395b) {
            m59253d();
            C29381b.m58846a().mo51366c();
            this.f70394a.mo28734a(m59251a(0));
        }
    }

    /* renamed from: a */
    private static C29540o m59251a(int i) {
        C29540o oVar = new C29540o();
        oVar.f70393a = i;
        return oVar;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: b */
    public final void mo51663b(C29455b bVar) {
        this.f70394a.mo28733a(bVar.f70026d, bVar.f70032j);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: a */
    public final void mo51659a(C29455b bVar) {
        String str;
        if (!this.f70395b) {
            int i = bVar.f70039q;
            if (C29495h.f70237m) {
                int i2 = 1;
                if (i == 0 || i == 1 || i == 4) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    if (bVar.f69978C) {
                        str = "real_time";
                    } else {
                        str = "not_real_time";
                    }
                    if (C29495h.f70200X != -1) {
                        if (C29495h.f70200X != 1) {
                            i2 = 2;
                        }
                        hashMap2.put("awemelaunch", Integer.valueOf(i2));
                    }
                    hashMap2.put("show_type", str);
                    hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - this.f70396c));
                    hashMap.put("is_ad_event", "1");
                    if (!TextUtils.isEmpty(bVar.f70032j)) {
                        hashMap.put("log_extra", bVar.f70032j);
                    }
                    hashMap.put("ad_fetch_time", Long.valueOf(bVar.f70024b));
                    C29446b.m58971a();
                    C29446b.m58973a(bVar, 0, "show_over", hashMap, hashMap2);
                }
            }
            m59253d();
            C29381b.m58846a().mo51366c();
            this.f70394a.mo28734a(m59251a(2));
        }
    }

    public C29542q(View view, AbstractC29671l lVar) {
        this.f70397d = view;
        this.f70394a = lVar;
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: c */
    public final void mo51666c(C29455b bVar, C29457c cVar) {
        boolean z;
        if (this.f70395b) {
            C29644g.m59688b("mAdEnded");
        }
        C29644g.m59688b("onVideoAdEndAndGoLandingPage");
        List<C29676q.C29678b> a = m59252a("", "", bVar.f70033k);
        if (C29643f.m59684b(a)) {
            C29676q w = bVar.mo51553w();
            w.f70768n = cVar.f70057h;
            if (bVar.f69982G == 3) {
                z = true;
            } else {
                z = false;
            }
            w.f70769o = z;
            w.f70764j = a;
            this.f70394a.mo28735a(w);
        } else {
            this.f70394a.mo28734a(m59251a(2));
        }
        m59253d();
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: a */
    public final void mo51660a(C29455b bVar, int i) {
        if (!this.f70395b) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            if (i != -1) {
                try {
                    jSONObject2.putOpt("position", Integer.valueOf(i));
                } catch (Exception unused) {
                    jSONObject = null;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f70396c;
            long j2 = currentTimeMillis - j;
            if (j != 0 && (bVar.f70039q == 2 || bVar.f70039q == 3)) {
                jSONObject2.putOpt("duration", Long.valueOf(j2));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            if (bVar.f70039q == 0 || bVar.f70039q == 4) {
                jSONObject.putOpt("show_time", Long.valueOf(j2));
            }
            if (!C29657l.m59760a(bVar.f70032j)) {
                jSONObject.putOpt("log_extra", bVar.f70032j);
            }
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", bVar.f70024b);
            C29495h.m59099a(bVar.f70026d, "splash_ad", "skip", jSONObject);
            C29381b.m58846a().mo51366c();
            m59253d();
            this.f70394a.mo28734a(m59251a(1));
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: b */
    public final boolean mo51664b(C29455b bVar, C29457c cVar) {
        JSONObject jSONObject;
        String str;
        if (this.f70395b) {
            C29644g.m59688b("mAdEnded");
        }
        C29644g.m59688b("onVideoAdClick");
        List<C29676q.C29678b> a = m59252a(bVar.f70027e, bVar.f70029g, bVar.f70033k);
        boolean z = false;
        if (!C29643f.m59684b(a)) {
            return false;
        }
        C29676q w = bVar.mo51553w();
        w.f70768n = cVar.f70057h;
        if (bVar.f69982G == 3) {
            z = true;
        }
        w.f70769o = z;
        w.f70764j = a;
        this.f70394a.mo28735a(w);
        try {
            Point point = cVar.f70052c;
            jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
            jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
            if (bVar.f69982G == 3 && cVar.f70056g == 0) {
                jSONObject2.putOpt("duration", Long.valueOf(cVar.f70057h));
            }
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.put("ad_fetch_time", bVar.f70024b);
            if (!C29657l.m59760a(bVar.f70032j)) {
                jSONObject.put("log_extra", bVar.f70032j);
            }
            jSONObject.putOpt("is_ad_event", "1");
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (!TextUtils.isEmpty(cVar.f70058i)) {
            str = cVar.f70058i;
        } else if (cVar.f70051b) {
            str = "click";
        } else {
            str = "banner_click";
        }
        C29495h.m59099a(bVar.f70026d, "splash_ad", str, jSONObject);
        C29495h.m59109h().mo51599h();
        if (bVar.f70040r != null) {
            C29506c.C29507a aVar = new C29506c.C29507a();
            aVar.f70264a = C29654j.m59706a((AbstractC29383a) bVar);
            C29506c a2 = aVar.mo51606a();
            if (C29495h.m59095a().f70654b) {
                C29495h.m59108g().mo51602a(null, "click", bVar.f70026d, bVar.f70047y, bVar.f70032j, true, -1, null, a2);
            } else {
                C29495h.m59108g().mo51603b(null, bVar.f70026d, bVar.f70047y, bVar.f70032j, true, -1, null, a2);
            }
        }
        m59253d();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01a8 A[RETURN] */
    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29541p
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51661a(com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b r28, com.p2082ss.android.p2092ad.splash.core.p2100e.C29457c r29) {
        /*
        // Method dump skipped, instructions count: 426
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.p2092ad.splash.core.C29542q.mo51661a(com.ss.android.ad.splash.core.e.b, com.ss.android.ad.splash.core.e.c):boolean");
    }

    /* renamed from: a */
    private static List<C29676q.C29678b> m59252a(String str, String str2, String str3) {
        int a;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && C29654j.m59742b(str) && (a = C29654j.m59703a(str)) != 0) {
            if (a != 5) {
                arrayList.add(new C29676q.C29678b(str, a));
            } else if (C29495h.f70228d != null && C29495h.f70228d.mo51942a()) {
                arrayList.add(new C29676q.C29678b(str, 1));
            }
        }
        if (C29662p.m59779b(str2) && C29495h.f70228d != null && C29495h.f70228d.mo51942a()) {
            arrayList.add(new C29676q.C29678b(str2, 5));
        }
        if (C29662p.m59778a(str3)) {
            arrayList.add(new C29676q.C29678b(str3, 2));
        }
        return arrayList;
    }
}
