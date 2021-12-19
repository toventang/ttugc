package com.bytedance.ies.bullet.service.p1170d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.frameworks.baselib.network.http.p983b.C14620c;
import com.bytedance.frameworks.baselib.network.http.p983b.C14621d;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16654o;
import com.bytedance.ies.bullet.service.base.C16607an;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.p1191d.p1192a.AbstractC17125m;
import com.bytedance.ies.p1191d.p1192a.AbstractC17126n;
import com.bytedance.ies.p1191d.p1192a.C17143x;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.d.a */
public final class C16706a extends AbstractC16164e {

    /* renamed from: b */
    public final CopyOnWriteArraySet<AbstractC17126n> f39882b;

    /* renamed from: c */
    public final C16708b f39883c;

    /* renamed from: d */
    public final C16248b f39884d;

    /* renamed from: e */
    private AbstractC16183k.EnumC16184a f39885e = AbstractC16183k.EnumC16184a.PRIVATE;

    /* renamed from: f */
    private final String f39886f;

    /* renamed from: g */
    private boolean f39887g;

    /* renamed from: h */
    private final AbstractC17125m f39888h;

    static {
        Covode.recordClassIndex(19146);
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: b */
    public final AbstractC16183k.EnumC16184a mo25723b() {
        return this.f39885e;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q, com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    public final boolean bh_() {
        return this.f39887g;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f39886f;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e, com.bytedance.ies.bullet.p1129c.p1136e.AbstractC16246a
    /* renamed from: a */
    public final void mo25721a() {
        this.f39882b.clear();
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16164e
    /* renamed from: a */
    public final void mo25722a(AbstractC16183k.EnumC16184a aVar) {
        C89219l.m154719c(aVar, "");
        this.f39885e = aVar;
    }

    /* renamed from: com.bytedance.ies.bullet.service.d.a$a */
    public static final class C16707a extends AbstractC17126n.C17127a {

        /* renamed from: a */
        final /* synthetic */ C16706a f39889a;

        /* renamed from: b */
        final /* synthetic */ AbstractC16183k.AbstractC16185b f39890b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f39891c;

        static {
            Covode.recordClassIndex(19147);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17126n.C17127a, com.bytedance.ies.p1191d.p1192a.AbstractC17126n
        /* renamed from: a */
        public final void mo26540a(JSONObject jSONObject) {
            C89219l.m154719c(jSONObject, "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("data", jSONObject);
            this.f39890b.mo25704a(jSONObject2);
            this.f39889a.f39882b.remove(this);
            AbstractC16654o oVar = (AbstractC16654o) this.f39889a.f39883c.mo26380a(AbstractC16654o.class);
            if (oVar != null) {
                C16607an anVar = new C16607an("bdx_monitor_prefetch_data", null, null, 254);
                anVar.f39738c = (AbstractC16640d) this.f39889a.f39884d.mo25832c(AbstractC16640d.class);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("prefetch_state", "success");
                jSONObject3.put("prefetch_cached", jSONObject.optInt("cached"));
                jSONObject3.put("prefetch_api", this.f39891c.optString("url"));
                anVar.f39742g = jSONObject3;
                oVar.mo26319a(anVar);
            }
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17126n.C17127a, com.bytedance.ies.p1191d.p1192a.AbstractC17126n
        /* renamed from: a */
        public final void mo13353a(Throwable th) {
            int i;
            String str = "";
            C89219l.m154719c(th, str);
            JSONObject jSONObject = new JSONObject();
            try {
                if (th instanceof C14620c) {
                    jSONObject.put("status", ((C14620c) th).getStatusCode());
                } else if (th instanceof C14652c) {
                    jSONObject.put("status", ((C14652c) th).getStatusCode());
                }
                if (th instanceof C14621d) {
                    i = -106;
                } else {
                    i = 1001;
                }
                C89379q.m157068constructorimpl(jSONObject.put("error_code", i));
            } catch (Throwable th2) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
            AbstractC16183k.AbstractC16185b bVar = this.f39890b;
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            bVar.mo25703a(4, str, jSONObject);
            this.f39889a.f39882b.remove(this);
            AbstractC16654o oVar = (AbstractC16654o) this.f39889a.f39883c.mo26380a(AbstractC16654o.class);
            if (oVar != null) {
                C16607an anVar = new C16607an("bdx_monitor_prefetch_data", null, null, 254);
                anVar.f39738c = (AbstractC16640d) this.f39889a.f39884d.mo25832c(AbstractC16640d.class);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("prefetch_state", "fail");
                jSONObject2.put("prefetch_error", th.getMessage());
                jSONObject2.put("prefetch_api", this.f39891c.optString("url"));
                anVar.f39742g = jSONObject2;
                oVar.mo26319a(anVar);
            }
        }

        C16707a(C16706a aVar, AbstractC16183k.AbstractC16185b bVar, JSONObject jSONObject) {
            this.f39889a = aVar;
            this.f39890b = bVar;
            this.f39891c = jSONObject;
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16183k
    /* renamed from: a */
    public final void mo25748a(JSONObject jSONObject, AbstractC16183k.AbstractC16185b bVar) {
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(bVar, "");
        C16707a aVar = new C16707a(this, bVar, jSONObject);
        this.f39882b.add(aVar);
        new C17143x(this.f39888h, aVar).mo27039a(jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16706a(String str, C16708b bVar, C16248b bVar2, AbstractC17125m mVar) {
        super(bVar2);
        C89219l.m154719c(str, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(bVar2, "");
        C89219l.m154719c(mVar, "");
        this.f39883c = bVar;
        this.f39884d = bVar2;
        this.f39888h = mVar;
        this.f39886f = str;
        this.f39882b = new CopyOnWriteArraySet<>();
    }
}
