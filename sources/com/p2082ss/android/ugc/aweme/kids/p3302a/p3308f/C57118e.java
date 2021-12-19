package com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.p4267g.p4268a.C81997c;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81987b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81989d;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.a.f.e */
public final class C57118e implements AbstractC57122f {

    /* renamed from: a */
    public long f130041a = -1;

    /* renamed from: b */
    public Long f130042b;

    /* renamed from: c */
    public C57119a f130043c;

    /* renamed from: d */
    public boolean f130044d;

    /* renamed from: e */
    public boolean f130045e;

    /* renamed from: f */
    final AbstractC57115c f130046f;

    /* renamed from: g */
    private boolean f130047g = true;

    /* renamed from: h */
    private long f130048h = -1;

    /* renamed from: i */
    private final AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z> f130049i = new C57120b(this);

    /* renamed from: j */
    private final AbstractC89172b<HashMap<String, Object>, C89391z> f130050j = new C57121c(this);

    static {
        Covode.recordClassIndex(67012);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57122f
    /* renamed from: c */
    public final void mo94266c() {
        this.f130047g = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57122f
    /* renamed from: b */
    public final boolean mo94265b() {
        return this.f130047g;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57122f
    /* renamed from: d */
    public final void mo94267d() {
        mo94268e();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57122f
    /* renamed from: e */
    public final void mo94268e() {
        try {
            this.f130044d = true;
            this.f130045e = true;
            C81997c.m141957a(this.f130048h);
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.p3302a.p3308f.AbstractC57113a
    /* renamed from: a */
    public final void mo94261a() {
        String str;
        Class<?> cls;
        try {
            C81987b bVar = new C81987b(new String[]{"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"});
            Activity j = C17873f.m33102j();
            if (j == null || (cls = j.getClass()) == null) {
                str = null;
            } else {
                str = cls.getSimpleName();
            }
            this.f130048h = C81997c.m141955a(bVar, new C81989d(str, ""), this.f130049i, this.f130050j);
            this.f130041a = System.currentTimeMillis();
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.f.e$c */
    static final class C57121c extends AbstractC89220m implements AbstractC89172b<HashMap<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57118e f130054a;

        static {
            Covode.recordClassIndex(67015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57121c(C57118e eVar) {
            super(1);
            this.f130054a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(HashMap<String, Object> hashMap) {
            C89219l.m154721d(hashMap, "");
            if (!this.f130054a.f130045e) {
                this.f130054a.f130045e = true;
            }
            return C89391z.f203057a;
        }
    }

    public C57118e(AbstractC57115c cVar) {
        C89219l.m154721d(cVar, "");
        this.f130046f = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.f.e$a */
    static final class C57119a {

        /* renamed from: a */
        public final EnumC81991b f130051a;

        /* renamed from: b */
        public final HashMap<String, HashMap<String, Object>> f130052b;

        static {
            Covode.recordClassIndex(67013);
        }

        public C57119a(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(hashMap, "");
            this.f130051a = bVar;
            this.f130052b = hashMap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.a.f.e$b */
    static final class C57120b extends AbstractC89220m implements AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C57118e f130053a;

        static {
            Covode.recordClassIndex(67014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57120b(C57118e eVar) {
            super(2);
            this.f130053a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            EnumC81991b bVar2 = bVar;
            HashMap<String, HashMap<String, Object>> hashMap2 = hashMap;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(hashMap2, "");
            if (!this.f130053a.f130044d) {
                this.f130053a.f130044d = true;
                this.f130053a.f130042b = Long.valueOf(System.currentTimeMillis());
                this.f130053a.f130043c = new C57119a(bVar2, hashMap2);
                C57118e eVar = this.f130053a;
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(hashMap2, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_time", eVar.f130041a);
                jSONObject.put("duration", System.currentTimeMillis() - eVar.f130041a);
                jSONObject.put("detect_result", bVar2.name());
                eVar.f130046f.mo94263a(eVar, bVar2, hashMap2, jSONObject);
            }
            return C89391z.f203057a;
        }
    }
}
