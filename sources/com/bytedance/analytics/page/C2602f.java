package com.bytedance.analytics.page;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.analytics.C2592b;
import com.bytedance.analytics.p124a.C2580a;
import com.bytedance.analytics.p125b.C2593a;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89062h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.analytics.page.f */
public final class C2602f {

    /* renamed from: a */
    public String f7821a;

    /* renamed from: b */
    public String f7822b;

    /* renamed from: c */
    public C2602f f7823c;

    /* renamed from: d */
    public final C2596a f7824d;

    /* renamed from: e */
    public final C89062h<C2602f> f7825e = new C89062h<>(C2580a.f7782e);

    /* renamed from: f */
    public boolean f7826f;

    /* renamed from: g */
    public boolean f7827g;

    /* renamed from: h */
    public boolean f7828h;

    /* renamed from: i */
    public String f7829i;

    /* renamed from: j */
    public Fragment f7830j;

    /* renamed from: k */
    public boolean f7831k;

    /* renamed from: l */
    public String f7832l;

    /* renamed from: m */
    public long f7833m;

    /* renamed from: n */
    public long f7834n;

    /* renamed from: o */
    public boolean f7835o;

    /* renamed from: p */
    public String f7836p;

    /* renamed from: q */
    public String f7837q;

    /* renamed from: r */
    public String f7838r;

    /* renamed from: s */
    public String f7839s;

    /* renamed from: t */
    public long f7840t;

    /* renamed from: u */
    public C2602f f7841u;

    static {
        Covode.recordClassIndex(2990);
    }

    public final int hashCode() {
        return this.f7821a.hashCode();
    }

    /* renamed from: a */
    public final Map<String, String> mo7088a() {
        Map<String, String> b = m7546b();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.f7825e.iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(it.next().m7546b()));
        }
        String jSONArray2 = jSONArray.toString();
        C89219l.m154716b(jSONArray2, "");
        b.put("btm_chain", jSONArray2);
        return b;
    }

    public final String toString() {
        return "PageObject{id='" + this.f7821a + "', name='" + this.f7822b + "'}";
    }

    /* renamed from: b */
    private final Map<String, String> m7546b() {
        String str;
        C89378p[] pVarArr = new C89378p[5];
        boolean z = false;
        pVarArr[0] = C89387v.m154943a("duration", String.valueOf(this.f7834n));
        pVarArr[1] = C89387v.m154943a("is_back", String.valueOf(this.f7835o));
        String str2 = this.f7837q;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[2] = C89387v.m154943a("btm_pre", str2);
        String str3 = this.f7838r;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[3] = C89387v.m154943a("btm_ppre", str3);
        String str4 = this.f7839s;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[4] = C89387v.m154943a("btm_last_stay", str4);
        Map<String, String> b = C89041ag.m154427b(pVarArr);
        String str5 = C2592b.f7808b;
        if (str5 == null || str5.length() == 0) {
            z = true;
        }
        if (z) {
            b.put("btm", "");
        } else {
            b.put("btm", this.f7836p);
        }
        if (TextUtils.isEmpty(b.get("btm"))) {
            C2602f fVar = this.f7823c;
            if (fVar == null) {
                str = null;
            } else {
                str = fVar.f7822b;
            }
            C2593a.m7539a("btmNull", C89219l.m154704a("preName:", (Object) str));
        }
        return b;
    }

    /* renamed from: a */
    public final void mo7089a(C2602f fVar) {
        C89219l.m154721d(fVar, "");
        this.f7825e.add(fVar);
        while (this.f7825e.size() > C2580a.f7782e) {
            this.f7825e.mo143487b();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2602f)) {
            return false;
        }
        return C89219l.m154714a((Object) ((C2602f) obj).f7821a, (Object) this.f7821a);
    }

    /* renamed from: a */
    public final void mo7090a(List<C2602f> list) {
        C89219l.m154721d(list, "");
        this.f7825e.addAll(list);
        while (this.f7825e.size() > C2580a.f7782e) {
            this.f7825e.mo143487b();
        }
    }

    public C2602f(String str, String str2, C2602f fVar, C2596a aVar) {
        String sb;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f7821a = str;
        this.f7822b = str2;
        this.f7823c = fVar;
        this.f7824d = aVar;
        C2602f fVar2 = this.f7823c;
        if (fVar2 != null) {
            this.f7837q = (aVar == null || (sb = new StringBuilder().append(C2592b.f7808b).append('.').append(aVar.f7816a.f7822b).append('.').append(aVar.f7817b).append('.').append(aVar.f7818c).toString()) == null) ? fVar2.f7836p : sb;
            this.f7838r = fVar2.f7837q;
            this.f7840t = fVar2.f7834n;
            fVar2.f7841u = this;
        }
        this.f7836p = ((Object) C2592b.f7808b) + '.' + this.f7822b + ".0.0";
    }
}
