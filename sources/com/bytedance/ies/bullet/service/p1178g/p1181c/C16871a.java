package com.bytedance.ies.bullet.service.p1178g.p1181c;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1130a.C16148a;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16595af;
import com.bytedance.ies.bullet.service.base.AbstractC16668s;
import com.bytedance.ies.bullet.service.base.AbstractC16697x;
import com.bytedance.ies.bullet.service.base.EnumC16605al;
import com.bytedance.ies.bullet.service.base.p1164b.C16622e;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.g.c.a */
public final class C16871a extends AbstractC16164e {

    /* renamed from: b */
    public final C16248b f40088b;

    /* renamed from: c */
    private AbstractC16183k.EnumC16184a f40089c = AbstractC16183k.EnumC16184a.PRIVATE;

    /* renamed from: d */
    private final String f40090d;

    /* renamed from: e */
    private boolean f40091e;

    /* renamed from: f */
    private final AbstractC89244h f40092f;

    /* renamed from: g */
    private final long f40093g;

    /* renamed from: h */
    private final C16874b f40094h;

    static {
        Covode.recordClassIndex(19311);
    }

    /* renamed from: e */
    private final AbstractC16668s m31099e() {
        return (AbstractC16668s) this.f40092f.getValue();
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f40089c;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    public final boolean bh_() {
        return this.f40091e;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f40090d;
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.c.a$a */
    public static final class C16872a implements AbstractC16697x {

        /* renamed from: a */
        final /* synthetic */ C16871a f40095a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f40096b;

        static {
            Covode.recordClassIndex(19312);
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16697x
        /* renamed from: a */
        public final void mo25870a() {
            this.f40096b.mo25704a(C16871a.m31098a(true, 0, "succeed"));
        }

        C16872a(C16871a aVar, AbstractC16183k.AbstractC16185b bVar) {
            this.f40095a = aVar;
            this.f40096b = bVar;
        }

        @Override // com.bytedance.ies.bullet.service.base.AbstractC16697x
        /* renamed from: a */
        public final void mo25871a(EnumC16605al alVar, String str) {
            C89219l.m154719c(alVar, "");
            this.f40096b.mo25704a(C16871a.m31098a(false, -2, "load failed"));
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.g.c.a$b */
    static final class C16873b extends AbstractC89220m implements AbstractC89171a<AbstractC16668s> {

        /* renamed from: a */
        final /* synthetic */ C16871a f40097a;

        static {
            Covode.recordClassIndex(19313);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16873b(C16871a aVar) {
            super(0);
            this.f40097a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC16668s invoke() {
            String str;
            C16148a aVar = (C16148a) this.f40097a.f40088b.mo25832c(C16148a.class);
            if (aVar == null || (str = aVar.f38891a) == null) {
                str = "default_bid";
            }
            return C16622e.C16623a.m30858a().mo26347a(str, AbstractC16668s.class);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154719c(aVar, "");
        this.f40089c = aVar;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(bVar, "");
        String optString = jSONObject.optString("schema");
        Context context = (Context) this.f40088b.mo25832c(Context.class);
        if (context == null) {
            bVar.mo25704a(m31098a(false, -1, "context is null"));
            return;
        }
        AbstractC16595af afVar = (AbstractC16595af) C16622e.C16623a.m30858a().mo26346a(AbstractC16595af.class);
        Uri parse = Uri.parse(optString);
        if (afVar != null) {
            C89219l.m154709a((Object) parse, "");
            Uri a = AbstractC16595af.C16596a.m30820a(afVar, parse, null, null, 14);
            if (a != null) {
                parse = a;
            }
        }
        AbstractC16668s e = m31099e();
        if (e != null) {
            C89219l.m154709a((Object) parse, "");
            e.mo25875a(parse, context, this.f40093g, new C16872a(this, bVar));
        }
        if (m31099e() == null) {
            bVar.mo25704a(m31098a(false, -3, "poolService is null"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16871a(String str, C16874b bVar, C16248b bVar2) {
        super(bVar2);
        C89219l.m154719c(str, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        this.f40094h = bVar;
        this.f40088b = bVar2;
        this.f40090d = str;
        this.f40092f = C89250i.m154773a((AbstractC89171a) new C16873b(this));
        this.f40093g = 10000;
    }

    /* renamed from: a */
    public static JSONObject m31098a(boolean z, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("__status_message__", str);
        jSONObject2.put("container", "BulletX");
        jSONObject2.put("result", z);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }
}
