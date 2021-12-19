package com.bytedance.ies.web.jsbridge2;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.ad */
public final class C18315ad {

    /* renamed from: a */
    public final Map<String, C18309ac> f43808a = new ConcurrentHashMap();

    /* renamed from: b */
    final AbstractC18347m f43809b;

    /* renamed from: c */
    public final Set<AbstractC18319a> f43810c = new CopyOnWriteArraySet();

    /* renamed from: d */
    public final String f43811d;

    /* renamed from: e */
    public final Executor f43812e;

    /* renamed from: f */
    public volatile boolean f43813f = false;

    /* renamed from: g */
    private final Collection<String> f43814g;

    /* renamed from: h */
    private final Handler f43815h = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.web.jsbridge2.ad$a */
    public interface AbstractC18319a {
        static {
            Covode.recordClassIndex(20991);
        }

        /* renamed from: b */
        void mo29327b();
    }

    static {
        Covode.recordClassIndex(20987);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo29319a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("aid", this.f43809b.mo29381b());
            jSONObject2.put("app_version", this.f43809b.mo29383d());
            jSONObject2.put("os", 0);
            jSONObject2.put("device_id", this.f43809b.mo29384e());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("channel", "_jsb_auth");
            jSONObject3.put("local_version", 0);
            jSONArray.put(jSONObject3);
            for (String str : this.f43814g) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("channel", "_jsb_auth.".concat(String.valueOf(str)));
                jSONObject4.put("local_version", 0);
                jSONArray.put(jSONObject4);
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(this.f43809b.mo29385f(), jSONArray);
            jSONObject.put("common", jSONObject2);
            jSONObject.put("deployment", jSONObject5);
        } catch (JSONException e) {
            C18344j.m34125b(e);
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43691G, e.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43692H, e.getMessage()).mo29301a(TimeLineEvent.C18303b.f43753b, jSONObject.toString()).mo29302a(TimeLineEvent.C18303b.f43728ab, C18364w.f43929f);
        }
        return jSONObject;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29320a(AbstractC18319a aVar) {
        this.f43810c.remove(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29321a(C18364w.AbstractC18367b bVar) {
        this.f43812e.execute(new RunnableC18320ae(this, bVar));
    }

    C18315ad(AbstractC18347m mVar) {
        this.f43809b = mVar;
        String j = mVar.mo29389j();
        if (TextUtils.isEmpty(j)) {
            this.f43811d = mVar.mo29379a().url;
        } else {
            this.f43811d = j;
        }
        this.f43812e = mVar.mo29388i();
        this.f43814g = new LinkedList(mVar.mo29386g());
    }

    /* renamed from: a */
    public final C18309ac mo29318a(String str, List<TimeLineEvent> list) {
        if (this.f43814g.contains(str) || TextUtils.equals(str, "host")) {
            return m34058a(str, (JSONObject) null, list);
        }
        new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43765n, str).mo29301a(TimeLineEvent.C18303b.f43766o, str).mo29302a(TimeLineEvent.C18303b.f43738al, list);
        throw new IllegalArgumentException("Namespace: " + str + " not registered.");
    }

    /* renamed from: a */
    private C18309ac m34058a(String str, JSONObject jSONObject, List<TimeLineEvent> list) {
        C18309ac acVar = this.f43808a.get(str);
        TimeLineEvent.C18302a a = new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43765n, str);
        if (acVar == null) {
            C18309ac acVar2 = new C18309ac(str, this.f43809b.mo29387h(), this.f43809b.mo29388i(), jSONObject, list);
            this.f43808a.put(str, acVar2);
            a.mo29302a(TimeLineEvent.C18303b.f43734ah, list);
            return acVar2;
        } else if (jSONObject == null) {
            return acVar;
        } else {
            acVar.mo29311a(jSONObject, list);
            a.mo29302a(TimeLineEvent.C18303b.f43735ai, list);
            return acVar;
        }
    }

    /* renamed from: a */
    public static void m34059a(String str, String str2, String str3) {
        TimeLineEvent.C18302a a = new TimeLineEvent.C18302a().mo29300a().mo29301a(TimeLineEvent.C18303b.f43758g, str2);
        a.f43678a = TimeLineEvent.C18303b.f43729ac;
        if (!TextUtils.isEmpty(str3)) {
            a.mo29301a(TimeLineEvent.C18303b.f43711a, str3);
        }
        if (TextUtils.isEmpty(str)) {
            a.mo29301a(TimeLineEvent.C18303b.f43754c, TimeLineEvent.C18303b.f43759h);
            C18364w.f43929f.add(a.mo29303b());
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject == null) {
                a.mo29301a(TimeLineEvent.C18303b.f43754c, str);
                C18364w.f43929f.add(a.mo29303b());
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("packages");
            if (optJSONObject2 == null) {
                a.mo29301a(TimeLineEvent.C18303b.f43754c, str);
                C18364w.f43929f.add(a.mo29303b());
                return;
            }
            Iterator<String> keys = optJSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = optJSONObject2.getJSONArray(next);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    String string = jSONObject.getString("channel");
                    a.mo29301a(next + "_" + string, Long.valueOf(jSONObject.getLong("package_version")));
                }
            }
            C18364w.f43929f.add(a.mo29303b());
        } catch (JSONException e) {
            a.mo29301a(TimeLineEvent.C18303b.f43754c, str).mo29301a(TimeLineEvent.C18303b.f43691G, e.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43692H, e.getMessage());
            C18364w.f43929f.add(a.mo29303b());
        }
    }

    /* renamed from: a */
    public final void mo29322a(boolean z, String str, final C18364w.AbstractC18367b bVar) {
        if (!TextUtils.isEmpty(str)) {
            if (!z) {
                this.f43809b.mo29387h().mo29391a("com.bytedance.ies.web.jsbridge2.PermissionConfigRepository.permission_config_response", new C18321af(this, str));
            }
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONObject("data").getJSONObject("packages").getJSONArray(this.f43809b.mo29385f());
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("channel");
                    if (TextUtils.equals(optString, "_jsb_auth")) {
                        m34058a("host", jSONObject, C18364w.f43929f);
                    } else if (optString.startsWith("_jsb_auth.")) {
                        m34058a(optString.replace("_jsb_auth.", ""), jSONObject, C18364w.f43929f);
                    }
                }
                new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43757f, this.f43809b.mo29385f()).mo29302a(TimeLineEvent.C18303b.f43732af, C18364w.f43929f);
            } catch (JSONException e) {
                C18344j.m34125b(e);
                TimeLineEvent.C18302a a = new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43691G, e.getClass().getSimpleName()).mo29301a(TimeLineEvent.C18303b.f43692H, e.getMessage());
                String str2 = TimeLineEvent.C18303b.f43754c;
                if (TextUtils.isEmpty(str)) {
                    str = TimeLineEvent.C18303b.f43759h;
                }
                a.mo29301a(str2, str).mo29302a(TimeLineEvent.C18303b.f43733ag, C18364w.f43929f);
            }
            this.f43813f = true;
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43763l, TimeLineEvent.C18303b.f43761j).mo29302a(TimeLineEvent.C18303b.f43720aI, C18364w.f43929f);
            this.f43815h.post(new Runnable() {
                /* class com.bytedance.ies.web.jsbridge2.C18315ad.RunnableC183182 */

                static {
                    Covode.recordClassIndex(20990);
                }

                public final void run() {
                    C18364w.AbstractC18367b bVar = bVar;
                    if (bVar != null) {
                        bVar.mo29407a();
                    }
                    for (AbstractC18319a aVar : C18315ad.this.f43810c) {
                        aVar.mo29327b();
                    }
                }
            });
        }
    }
}
