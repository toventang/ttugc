package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.ad */
public abstract class AbstractC34303ad extends AbstractC34293a implements AbstractC34349u {

    /* renamed from: d */
    public final Uri f81137d;

    /* renamed from: e */
    public final C34324g f81138e;

    /* renamed from: f */
    public final Map<String, String> f81139f;

    /* renamed from: g */
    private final AbstractC89244h f81140g = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C34305b(this));

    /* renamed from: h */
    private final AbstractC89244h f81141h = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, new C34304a(this));

    /* renamed from: i */
    private String f81142i;

    /* renamed from: j */
    private String f81143j;

    static {
        Covode.recordClassIndex(41247);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34349u
    /* renamed from: a */
    public final C34350v mo60740a() {
        return (C34350v) this.f81140g.getValue();
    }

    /* renamed from: a */
    public abstract void mo60742a(String str, AbstractC34348t tVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: q */
    public final C34351w mo60749q() {
        return (C34351w) this.f81141h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34349u
    /* renamed from: l */
    public final String mo60744l() {
        return this.f81142i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34349u
    /* renamed from: m */
    public final String mo60745m() {
        return this.f81143j;
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.ad$b */
    static final class C34305b extends AbstractC89220m implements AbstractC89171a<C34350v> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34303ad f81145a;

        static {
            Covode.recordClassIndex(41249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34305b(AbstractC34303ad adVar) {
            super(0);
            this.f81145a = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34350v invoke() {
            return new C34350v(this.f81145a.f81137d, null, this.f81145a.f81139f, 2);
        }
    }

    /* renamed from: n */
    public final AbstractC34342o mo60746n() {
        return (AbstractC34342o) this.f81138e.mo60766a(AbstractC34342o.class);
    }

    /* renamed from: o */
    public final AbstractC34341n mo60747o() {
        return (AbstractC34341n) this.f81138e.mo60766a(AbstractC34341n.class);
    }

    /* renamed from: p */
    public final AbstractC34349u mo60748p() {
        return (AbstractC34349u) this.f81138e.mo60766a(AbstractC34349u.class);
    }

    /* renamed from: com.ss.android.ugc.aweme.ax.a.ad$a */
    static final class C34304a extends AbstractC89220m implements AbstractC89171a<C34351w> {

        /* renamed from: a */
        final /* synthetic */ AbstractC34303ad f81144a;

        static {
            Covode.recordClassIndex(41248);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34304a(AbstractC34303ad adVar) {
            super(0);
            this.f81144a = adVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C34351w invoke() {
            return new C34351w(this.f81144a.f81137d, this.f81144a.f81137d, this.f81144a.f81139f);
        }
    }

    /* renamed from: r */
    public final C34350v mo60750r() {
        AbstractC34349u p = mo60748p();
        if (p != null) {
            return new C34350v(p.mo60740a().f81207a, "original_", null, 4);
        }
        return null;
    }

    public AbstractC34303ad(Uri uri, C34324g gVar, Map<String, String> map) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(map, "");
        this.f81137d = uri;
        this.f81138e = gVar;
        this.f81139f = map;
    }

    /* renamed from: a */
    public final void mo60741a(Exception exc, String str, String str2) {
        C89219l.m154721d(exc, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        exc.printStackTrace();
        AbstractC34341n o = mo60747o();
        if (o != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("url", str);
            linkedHashMap.put(StringSet.type, str2);
            o.mo60795a(exc, "hybrid " + str2 + " report failed", linkedHashMap);
        }
    }

    /* renamed from: a */
    public void mo60743a(String str, Integer num, JSONObject jSONObject, JSONObject jSONObject2) {
        AbstractC34341n o = mo60747o();
        if (o != null) {
            o.mo60796a(str, num, jSONObject, jSONObject2);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m70177a(AbstractC34303ad adVar, String str, AbstractC34348t tVar, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = null;
        if ((i & 4) != 0) {
            jSONObject3 = null;
        }
        if ((i & 8) == 0) {
            jSONObject4 = jSONObject2;
        }
        adVar.mo60742a(str, tVar, jSONObject3, jSONObject4, null);
    }
}
