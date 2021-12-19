package com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49518j;
import com.p2082ss.android.ugc.p4267g.p4268a.C81997c;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81989d;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81990e;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.p.a.a */
public abstract class AbstractC49775a implements AbstractC49782e {

    /* renamed from: a */
    public long f114520a = -1;

    /* renamed from: b */
    public Long f114521b;

    /* renamed from: c */
    public C49776a f114522c;

    /* renamed from: d */
    public boolean f114523d;

    /* renamed from: e */
    public boolean f114524e;

    /* renamed from: f */
    private long f114525f = -1;

    /* renamed from: g */
    private final AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z> f114526g = new C49777b(this);

    /* renamed from: h */
    private final AbstractC89172b<HashMap<String, Object>, C89391z> f114527h = new C49778c(this);

    static {
        Covode.recordClassIndex(58880);
    }

    /* renamed from: a */
    public abstract void mo84315a(C33744d dVar);

    /* renamed from: a */
    public abstract void mo84316a(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap);

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49779b
    /* renamed from: a */
    public final void mo84314a() {
        mo84318c();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49779b
    /* renamed from: b */
    public final void mo84317b() {
        mo84319d();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49782e
    /* renamed from: e */
    public final void mo84320e() {
        try {
            this.f114523d = true;
            this.f114524e = true;
            C81997c.m141957a(this.f114525f);
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: c */
    public void mo84318c() {
        try {
            this.f114520a = System.currentTimeMillis();
            this.f114525f = C81997c.m141955a(C49518j.m92754a(), new C81989d(C49907s.m93688b(), C49907s.f115050b.name()), this.f114526g, this.f114527h);
            C89379q.m157068constructorimpl(C89391z.f203057a);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
    }

    /* renamed from: d */
    public void mo84319d() {
        C89391z zVar;
        try {
            C49776a aVar = this.f114522c;
            if (aVar != null) {
                if (aVar.f114528a == EnumC81991b.NO_NETWORK) {
                    C33744d a = new C33744d().mo59982a(C81990e.f183490k, aVar.f114529b);
                    C89219l.m154716b(a, "");
                    mo84315a(a);
                    C39162r.m79460a(C81990e.f183481b, a.f79943a);
                }
                zVar = C89391z.f203057a;
            } else {
                zVar = null;
            }
            C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        mo84320e();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.a.a$c */
    static final class C49778c extends AbstractC89220m implements AbstractC89172b<HashMap<String, Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49775a f114531a;

        static {
            Covode.recordClassIndex(58883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49778c(AbstractC49775a aVar) {
            super(1);
            this.f114531a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(HashMap<String, Object> hashMap) {
            HashMap<String, Object> hashMap2 = hashMap;
            C89219l.m154721d(hashMap2, "");
            if (!this.f114531a.f114524e) {
                this.f114531a.f114524e = true;
                C33744d dVar = new C33744d();
                for (Map.Entry<String, Object> entry : hashMap2.entrySet()) {
                    dVar.mo59982a(entry.getKey(), entry.getValue());
                }
                C39162r.m79460a(C81990e.f183480a, dVar.f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.p.a.a$a */
    public static final class C49776a {

        /* renamed from: a */
        public final EnumC81991b f114528a;

        /* renamed from: b */
        public final HashMap<String, HashMap<String, Object>> f114529b;

        static {
            Covode.recordClassIndex(58881);
        }

        public C49776a(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(hashMap, "");
            this.f114528a = bVar;
            this.f114529b = hashMap;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.a.a$b */
    static final class C49777b extends AbstractC89220m implements AbstractC89183m<EnumC81991b, HashMap<String, HashMap<String, Object>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC49775a f114530a;

        static {
            Covode.recordClassIndex(58882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49777b(AbstractC49775a aVar) {
            super(2);
            this.f114530a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            EnumC81991b bVar2 = bVar;
            HashMap<String, HashMap<String, Object>> hashMap2 = hashMap;
            C89219l.m154721d(bVar2, "");
            C89219l.m154721d(hashMap2, "");
            if (!this.f114530a.f114523d) {
                this.f114530a.f114523d = true;
                this.f114530a.f114521b = Long.valueOf(System.currentTimeMillis());
                this.f114530a.f114522c = new C49776a(bVar2, hashMap2);
                this.f114530a.mo84316a(bVar2, hashMap2);
            }
            return C89391z.f203057a;
        }
    }
}
