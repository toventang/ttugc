package com.bytedance.ies.web.jsbridge2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18304a;
import com.bytedance.ies.web.jsbridge2.C18339h;
import com.bytedance.ies.web.jsbridge2.C18362v;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.p2082ss.android.ugc.tiktok.security.p4334b.C84357h;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.b */
public abstract class AbstractC18329b {

    /* renamed from: a */
    private final Map<String, C18339h> f43842a = new HashMap();

    /* renamed from: e */
    protected Context f43843e;

    /* renamed from: f */
    protected Set<AbstractC18356p> f43844f;

    /* renamed from: g */
    protected C18343i f43845g;

    /* renamed from: h */
    protected Handler f43846h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    protected String f43847i;

    /* renamed from: j */
    protected volatile boolean f43848j = false;

    /* renamed from: k */
    protected AbstractC18304a f43849k;

    /* renamed from: l */
    public C18339h f43850l;

    /* renamed from: m */
    protected List<TimeLineEvent> f43851m;

    static {
        Covode.recordClassIndex(21001);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo16233a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16235a(C18345k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo16236a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Context mo16239b(C18345k kVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16238a(JSONObject jSONObject, C18362v vVar) {
        mo16237a(jSONObject.toString(), vVar);
    }

    /* renamed from: a */
    public final void mo29338a(String str, String str2, int i, String str3, List<TimeLineEvent> list) {
        for (AbstractC18356p pVar : this.f43844f) {
            pVar.mo13320a(str, str2, i, str3, new C18326ak(C18364w.f43929f, this.f43851m, list));
        }
    }

    /* renamed from: b */
    public View mo16240b() {
        return this.f43849k.mo29304b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo29330c() {
        this.f43850l.mo29358a();
        for (C18339h hVar : this.f43842a.values()) {
            hVar.mo29358a();
        }
        this.f43846h.removeCallbacksAndMessages(null);
        this.f43848j = true;
    }

    /* access modifiers changed from: protected */
    public void invokeMethod(final String str) {
        if (!this.f43848j) {
            TimeLineEvent.C18302a a = new TimeLineEvent.C18302a().mo29300a();
            a.f43678a = TimeLineEvent.C18303b.f43723aL;
            final TimeLineEvent b = a.mo29303b();
            this.f43846h.post(new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.AbstractC18329b.RunnableC183301 */

                static {
                    Covode.recordClassIndex(21002);
                }

                public final void run() {
                    if (!AbstractC18329b.this.f43848j) {
                        C18362v vVar = null;
                        try {
                            vVar = AbstractC18329b.this.mo29333a(new JSONObject(str));
                            if (vVar != null) {
                                vVar.f43920i.add(b);
                            }
                        } catch (JSONException e) {
                            C18344j.m34125b(e);
                        }
                        if (!C18362v.m34177a(vVar)) {
                            AbstractC18329b.this.mo29339b(vVar);
                        } else if (vVar != null) {
                            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43756e, str).mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43704T).mo29302a(TimeLineEvent.C18303b.f43745as, vVar.f43920i);
                            AbstractC18329b bVar = AbstractC18329b.this;
                            bVar.mo29338a(bVar.mo16233a(), vVar.f43915d, 3, TimeLineEvent.C18303b.f43704T, vVar.f43920i);
                            AbstractC18329b.this.mo29340b(C18324ai.m34071a((Throwable) new C18369y(vVar.f43912a, "Failed to parse invocation.")), vVar);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final C18362v mo29333a(JSONObject jSONObject) {
        if (this.f43848j) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        String a = mo16233a();
        if (a == null) {
            mo29338a(null, null, 3, TimeLineEvent.C18303b.f43702R, null);
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String string2 = jSONObject.getString("params");
            String string3 = jSONObject.getString("JSSDK");
            String optString3 = jSONObject.optString("namespace");
            String optString4 = jSONObject.optString("__iframe_url");
            C18362v.C18363a a2 = C18362v.m34176a();
            a2.f43921a = string3;
            a2.f43922b = string;
            a2.f43923c = optString2;
            a2.f43924d = string2;
            a2.f43925e = optString;
            a2.f43926f = optString3;
            a2.f43927g = optString4;
            return a2.mo29399a();
        } catch (JSONException e) {
            C18344j.m34125b(e);
            mo29338a(a, optString2, 3, TimeLineEvent.C18303b.f43703S, null);
            return new C18362v(optString);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29335a(final C18362v vVar) {
        if (!this.f43848j) {
            TimeLineEvent.C18302a a = new TimeLineEvent.C18302a().mo29300a();
            a.f43678a = TimeLineEvent.C18303b.f43723aL;
            final TimeLineEvent b = a.mo29303b();
            this.f43846h.post(new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.AbstractC18329b.RunnableC183312 */

                static {
                    Covode.recordClassIndex(21003);
                }

                public final void run() {
                    if (!AbstractC18329b.this.f43848j) {
                        C18362v vVar = vVar;
                        if (vVar != null) {
                            vVar.f43920i.add(b);
                        }
                        if (!C18362v.m34177a(vVar)) {
                            AbstractC18329b.this.mo29339b(vVar);
                        } else if (vVar != null) {
                            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43705U).mo29302a(TimeLineEvent.C18303b.f43745as, vVar.f43920i);
                            AbstractC18329b bVar = AbstractC18329b.this;
                            bVar.mo29338a(bVar.mo16233a(), vVar.f43915d, 3, TimeLineEvent.C18303b.f43705U, vVar.f43920i);
                            AbstractC18329b.this.mo29340b(C18324ai.m34071a((Throwable) new C18369y(vVar.f43912a, "Failed to parse invocation.")), vVar);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo29339b(C18362v vVar) {
        String str;
        C18339h hVar;
        C84357h.f188595a.mo129372a(this, vVar);
        if (!this.f43848j) {
            String a = mo16233a();
            TimeLineEvent.C18302a aVar = new TimeLineEvent.C18302a();
            String str2 = TimeLineEvent.C18303b.f43711a;
            if (a == null) {
                str = TimeLineEvent.C18303b.f43759h;
            } else {
                str = a;
            }
            aVar.mo29301a(str2, str).mo29302a(TimeLineEvent.C18303b.f43721aJ, vVar.f43920i);
            if (a != null) {
                String str3 = vVar.f43918g;
                if (TextUtils.equals(str3, this.f43847i) || TextUtils.isEmpty(str3)) {
                    hVar = this.f43850l;
                } else {
                    hVar = this.f43842a.get(str3);
                }
                if (hVar == null) {
                    new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43699O).mo29302a(TimeLineEvent.C18303b.f43745as, vVar.f43920i);
                    mo29338a(mo16233a(), vVar.f43915d, 2, TimeLineEvent.C18303b.f43699O, vVar.f43920i);
                    mo29340b(C18324ai.m34071a((Throwable) new C18369y(-4, "Namespace " + vVar.f43918g + " unknown.")), vVar);
                    return;
                }
                C18338g gVar = new C18338g();
                gVar.f43860b = a;
                gVar.f43859a = this.f43843e;
                gVar.f43861c = hVar;
                gVar.f43862d = this.f43849k.mo29304b();
                try {
                    C18339h.C18342a a2 = hVar.mo29357a(vVar, gVar);
                    if (a2 == null) {
                        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43755d, TimeLineEvent.C18303b.f43700P).mo29302a(TimeLineEvent.C18303b.f43745as, vVar.f43920i);
                        mo29338a(mo16233a(), vVar.f43915d, 2, TimeLineEvent.C18303b.f43700P, vVar.f43920i);
                        mo29340b(C18324ai.m34071a((Throwable) new C18369y(-2, "Function " + vVar.f43915d + " is not registered.")), vVar);
                        return;
                    }
                    if (a2.f43879a) {
                        if (a2.f43881c != null) {
                            mo29341b(a2.f43881c, vVar);
                        } else {
                            mo29340b(a2.f43880b, vVar);
                        }
                    }
                    m34080a(mo16233a(), vVar.f43915d, vVar.f43920i);
                } catch (Exception e) {
                    C18344j.m34124a(e);
                    mo29340b(C18324ai.m34071a((Throwable) e), vVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29334a(C18345k kVar, C18309ac acVar) {
        AbstractC18304a aVar;
        this.f43843e = mo16239b(kVar);
        this.f43845g = kVar.f43889e;
        this.f43844f = kVar.f43894j;
        this.f43850l = new C18339h(kVar, this, acVar);
        this.f43847i = kVar.f43896l;
        this.f43851m = kVar.f43903s;
        if (kVar.f43885a != null) {
            aVar = new AbstractC18304a.C18305a(kVar.f43885a);
        } else {
            aVar = kVar.f43886b;
        }
        this.f43849k = aVar;
        mo16235a(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29341b(JSONObject jSONObject, C18362v vVar) {
        if (!this.f43848j && !TextUtils.isEmpty(vVar.f43917f)) {
            new TimeLineEvent.C18302a().mo29302a(TimeLineEvent.C18303b.f43724aM, vVar.f43920i);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("__msg_type", "callback");
                jSONObject2.put("__callback_id", vVar.f43917f);
                jSONObject2.put("__params", jSONObject);
                mo16238a(jSONObject2, vVar);
                new TimeLineEvent.C18302a().mo29302a(TimeLineEvent.C18303b.f43725aN, vVar.f43920i);
            } catch (JSONException unused) {
                mo29340b(jSONObject.toString(), vVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29340b(String str, C18362v vVar) {
        String str2;
        JSONObject jSONObject;
        if (!this.f43848j && !TextUtils.isEmpty(vVar.f43917f)) {
            new TimeLineEvent.C18302a().mo29302a(TimeLineEvent.C18303b.f43724aM, vVar.f43920i);
            if (!str.startsWith("{") || !str.endsWith("}")) {
                C18344j.m34123a((RuntimeException) new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
            }
            if (C18364w.f43930g == null || !C18364w.f43930g.mo29406a(EnumC18325aj.XSS_CALLBACK_ID_SWITCH)) {
                str2 = "{\"__msg_type\":\"callback\",\"__callback_id\":\"" + vVar.f43917f + "\",\"__params\":" + str + "}";
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (Exception unused) {
                    jSONObject = new JSONObject();
                }
                str2 = new C18361u().mo29396a("__msg_type", "callback").mo29396a("__callback_id", vVar.f43917f).mo29396a("__params", jSONObject).mo29397a();
            }
            mo16237a(str2, vVar);
            new TimeLineEvent.C18302a().mo29302a(TimeLineEvent.C18303b.f43725aN, vVar.f43920i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29336a(String str, C18339h hVar) {
        this.f43842a.put(str, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16237a(String str, C18362v vVar) {
        mo16236a(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T> void mo29337a(String str, T t) {
        String str2;
        JSONObject jSONObject;
        if (!this.f43848j) {
            if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("__msg_type", "event");
                    jSONObject2.put("__event_id", str);
                    jSONObject2.put("__params", t);
                    mo16236a(jSONObject2.toString());
                    return;
                } catch (JSONException unused) {
                }
            }
            String a = this.f43845g.mo29364a((Object) t);
            if (C18364w.f43930g == null || !C18364w.f43930g.mo29406a(EnumC18325aj.XSS_CALLBACK_ID_SWITCH)) {
                str2 = "{\"__msg_type\":\"event\",\"__event_id\":\"" + str + "\",\"__params\":" + a + "}";
            } else {
                try {
                    jSONObject = new JSONObject(a);
                } catch (Exception unused2) {
                    jSONObject = new JSONObject();
                }
                str2 = new C18361u().mo29396a("__msg_type", "event").mo29396a("__event_id", str).mo29396a("__params", jSONObject).mo29397a();
            }
            mo16236a(str2);
        }
    }

    /* renamed from: a */
    private void m34080a(String str, String str2, List<TimeLineEvent> list) {
        for (AbstractC18356p pVar : this.f43844f) {
            pVar.mo13318a(str2, new C18326ak(C18364w.f43929f, this.f43851m, list));
        }
    }
}
