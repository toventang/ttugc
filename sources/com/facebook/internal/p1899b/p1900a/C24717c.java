package com.facebook.internal.p1899b.p1900a;

import android.os.Build;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.AccessToken;
import com.facebook.C24872m;
import com.facebook.C24912q;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.internal.p1899b.AbstractC24713a;
import com.facebook.internal.p1899b.AbstractC24725c;
import com.facebook.internal.p1899b.AbstractC24726d;
import com.facebook.internal.p1899b.AbstractC24727e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.b.a.c */
public final class C24717c implements AbstractC24726d {

    /* renamed from: e */
    private static final Integer f58691e = 100;

    /* renamed from: f */
    private static C24717c f58692f;

    /* renamed from: h */
    private static String f58693h = Build.VERSION.RELEASE;

    /* renamed from: i */
    private static String f58694i = Build.MODEL;

    /* renamed from: a */
    public final ScheduledExecutorService f58695a;

    /* renamed from: b */
    public AbstractC24725c f58696b;

    /* renamed from: c */
    public ScheduledFuture f58697c;

    /* renamed from: d */
    public final Runnable f58698d = new Runnable() {
        /* class com.facebook.internal.p1899b.p1900a.C24717c.RunnableC247181 */

        static {
            Covode.recordClassIndex(28871);
        }

        public final void run() {
            if (!C24677a.m47209a(this)) {
                try {
                    C24717c.this.mo40557b();
                } catch (Throwable th) {
                    C24677a.m47208a(th, this);
                }
            }
        }
    };

    /* renamed from: g */
    private AbstractC24727e f58699g;

    @Override // com.facebook.internal.p1899b.AbstractC24726d
    /* renamed from: a */
    public final void mo40556a() {
        this.f58696b.mo40560a(this.f58699g.mo40562a());
        mo40557b();
    }

    static {
        Covode.recordClassIndex(28870);
    }

    /* renamed from: b */
    public final void mo40557b() {
        ScheduledFuture scheduledFuture = this.f58697c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        AbstractC24725c cVar = this.f58696b;
        ArrayList arrayList = new ArrayList();
        C24699ae.m47299a();
        if (!C24693ad.m47261a(C24872m.f59041a)) {
            while (!cVar.mo40559a()) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < f58691e.intValue() && !cVar.mo40559a(); i++) {
                    arrayList2.add(cVar.mo40561b());
                }
                GraphRequest a = m47336a(arrayList2);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        try {
            new C24912q(arrayList).mo40792a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static GraphRequest m47336a(List<? extends AbstractC24713a> list) {
        C24699ae.m47299a();
        String packageName = C24872m.f59047g.getPackageName();
        JSONArray jSONArray = new JSONArray();
        for (AbstractC24713a aVar : list) {
            jSONArray.put(aVar.convertToJSONObject());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", f58693h);
            jSONObject.put("device_model", f58694i);
            jSONObject.put("unique_application_identifier", packageName);
            jSONObject.put("entries", jSONArray.toString());
            C24699ae.m47299a();
            return GraphRequest.m45067a((AccessToken) null, C1764a.m5928a("%s/monitorings", new Object[]{C24872m.f59041a}), jSONObject, (GraphRequest.AbstractC23858b) null);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static synchronized C24717c m47337a(AbstractC24725c cVar, AbstractC24727e eVar) {
        C24717c cVar2;
        synchronized (C24717c.class) {
            MethodCollector.m26663i(6572);
            if (f58692f == null) {
                f58692f = new C24717c(cVar, eVar);
            }
            cVar2 = f58692f;
            MethodCollector.m26664o(6572);
        }
        return cVar2;
    }

    private C24717c(AbstractC24725c cVar, AbstractC24727e eVar) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        this.f58695a = (ScheduledExecutorService) C40780g.m82242a(a.mo70028a());
        if (this.f58696b == null) {
            this.f58696b = cVar;
        }
        if (this.f58699g == null) {
            this.f58699g = eVar;
        }
    }
}
