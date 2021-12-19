package com.p2082ss.android.ugc.aweme.sticker.p3947a.p3951d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63269z;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a;
import com.p2082ss.android.ugc.aweme.utils.C80561hz;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.a.d.a */
public final class C75266a extends AbstractC75248a {

    /* renamed from: b */
    public static final C75267a f169228b = new C75267a((byte) 0);

    /* renamed from: c */
    private String f169229c = "NICK";

    /* renamed from: d */
    private boolean f169230d = true;

    static {
        Covode.recordClassIndex(88168);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.d.a$a */
    public static final class C75267a {
        static {
            Covode.recordClassIndex(88169);
        }

        private C75267a() {
        }

        public /* synthetic */ C75267a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final String mo118587a() {
        return this.f169229c;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: b */
    public final boolean mo118590b() {
        return this.f169230d;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.a.d.a$b */
    static final class C75268b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C75268b f169231a = new C75268b();

        static {
            Covode.recordClassIndex(88170);
        }

        C75268b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC63269z zVar = C63238c.f143594u;
            Activity c = C40964c.m82474c();
            C89219l.m154716b(c, "");
            zVar.mo93897a(c, "", "", null, null);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75266a(AbstractC14177d dVar) {
        super(dVar);
        C89219l.m154721d(dVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.p3947a.AbstractC75248a
    /* renamed from: a */
    public final void mo118588a(int i, String str) {
        if (!C63238c.f143594u.mo93903b()) {
            C75268b bVar = C75268b.f169231a;
            C89219l.m154721d(bVar, "");
            C80561hz.m139645a(new C80561hz.RunnableC80563b(bVar));
            return;
        }
        AbstractC32846a e = C63244g.m114602a().mo73255A().mo93906e();
        if (e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interface", "NICK");
            jSONObject.put("status", 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("handle", e.mo58658a());
            jSONObject2.put("nickname", e.mo58665h());
            jSONObject.put("body", jSONObject2);
            String jSONObject3 = jSONObject.toString();
            C89219l.m154716b(jSONObject3, "");
            mo118589a((long) i, jSONObject3);
            return;
        }
        C84911q.m145922a("EffectUserInfoHandler", "handleEffectMessage::currentUser is null");
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("interface", "NICK");
        jSONObject4.put("status", 1);
        String jSONObject5 = jSONObject4.toString();
        C89219l.m154716b(jSONObject5, "");
        mo118589a((long) i, jSONObject5);
    }
}
