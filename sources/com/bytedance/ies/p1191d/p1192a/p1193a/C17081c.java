package com.bytedance.ies.p1191d.p1192a.p1193a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17125m;
import com.bytedance.ies.p1191d.p1192a.AbstractC17126n;
import com.bytedance.ies.p1191d.p1192a.C17143x;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.d.a.a.c */
public final class C17081c extends AbstractC18334e<JSONObject, JSONObject> implements AbstractC17126n {

    /* renamed from: a */
    public static final C17082a f40651a = new C17082a((byte) 0);

    /* renamed from: b */
    private final C17143x f40652b;

    static {
        Covode.recordClassIndex(19538);
    }

    /* renamed from: com.bytedance.ies.d.a.a.c$a */
    public static final class C17082a {
        static {
            Covode.recordClassIndex(19539);
        }

        private C17082a() {
        }

        public /* synthetic */ C17082a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        this.f40652b.mo27038a();
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17126n
    /* renamed from: a */
    public final void mo13353a(Throwable th) {
        C89219l.m154719c(th, "");
        finishWithFailure(th);
    }

    public C17081c(AbstractC17125m mVar) {
        C89219l.m154719c(mVar, "");
        this.f40652b = new C17143x(mVar, this);
    }

    @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17126n
    /* renamed from: a */
    public final void mo26540a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        finishWithResult(jSONObject);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154719c(jSONObject2, "");
        C89219l.m154719c(gVar, "");
        this.f40652b.mo27039a(jSONObject2);
    }
}
