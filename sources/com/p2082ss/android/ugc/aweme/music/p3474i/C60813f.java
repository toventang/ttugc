package com.p2082ss.android.ugc.aweme.music.p3474i;

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

/* renamed from: com.ss.android.ugc.aweme.music.i.f */
public final class C60813f implements AbstractC60817g {

    /* renamed from: a */
    public long f138196a = -1;

    /* renamed from: b */
    public Long f138197b;

    /* renamed from: c */
    public C60814a f138198c;

    /* renamed from: d */
    public boolean f138199d;

    /* renamed from: e */
    public boolean f138200e;

    /* renamed from: f */
    final AbstractC60807c f138201f;

    /* renamed from: g */
    private boolean f138202g = true;

    /* renamed from: h */
    private long f138203h = -1;

    /* renamed from: i */
    private final AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z> f138204i = new C60815b(this);

    /* renamed from: j */
    private final AbstractC89172b<HashMap<String, Object>, C89391z> f138205j = new C60816c(this);

    static {
        Covode.recordClassIndex(71370);
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60817g
    /* renamed from: c */
    public final void mo98222c() {
        this.f138202g = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60817g
    /* renamed from: b */
    public final boolean mo98221b() {
        return this.f138202g;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60817g
    /* renamed from: d */
    public final void mo98223d() {
        mo98224e();
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60817g
    /* renamed from: e */
    public final void mo98224e() {
        try {
            this.f138199d = true;
            this.f138200e = true;
            C81997c.m141957a(this.f138203h);
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3474i.AbstractC60805a
    /* renamed from: a */
    public final void mo98211a() {
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
            this.f138203h = C81997c.m141955a(bVar, new C81989d(str, ""), this.f138204i, this.f138205j);
            this.f138196a = System.currentTimeMillis();
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.i.f$c */
    static final class C60816c extends AbstractC89220m implements AbstractC89172b<HashMap<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60813f f138209a;

        static {
            Covode.recordClassIndex(71373);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60816c(C60813f fVar) {
            super(1);
            this.f138209a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(HashMap<String, Object> hashMap) {
            C89219l.m154721d(hashMap, "");
            if (!this.f138209a.f138200e) {
                this.f138209a.f138200e = true;
            }
            return C89391z.f203057a;
        }
    }

    public C60813f(AbstractC60807c cVar) {
        C89219l.m154721d(cVar, "");
        this.f138201f = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.music.i.f$a */
    static final class C60814a {

        /* renamed from: a */
        public final EnumC81991b f138206a;

        /* renamed from: b */
        public final HashMap<String, HashMap<String, Object>> f138207b;

        static {
            Covode.recordClassIndex(71371);
        }

        public C60814a(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(hashMap, "");
            this.f138206a = bVar;
            this.f138207b = hashMap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.i.f$b */
    static final class C60815b extends AbstractC89220m implements AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60813f f138208a;

        static {
            Covode.recordClassIndex(71372);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60815b(C60813f fVar) {
            super(2);
            this.f138208a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            EnumC81991b bVar2 = bVar;
            HashMap<String, HashMap<String, Object>> hashMap2 = hashMap;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(hashMap2, "");
            if (!this.f138208a.f138199d) {
                this.f138208a.f138199d = true;
                this.f138208a.f138197b = Long.valueOf(System.currentTimeMillis());
                this.f138208a.f138198c = new C60814a(bVar2, hashMap2);
                C60813f fVar = this.f138208a;
                C89219l.m154721d(bVar2, "");
                C89219l.m154721d(hashMap2, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("start_time", fVar.f138196a);
                jSONObject.put("duration", System.currentTimeMillis() - fVar.f138196a);
                jSONObject.put("detect_result", bVar2.name());
                fVar.f138201f.mo98213a(fVar, bVar2, hashMap2, jSONObject);
            }
            return C89391z.f203057a;
        }
    }
}
