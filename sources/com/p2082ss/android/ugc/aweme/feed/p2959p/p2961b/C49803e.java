package com.p2082ss.android.ugc.aweme.feed.p2959p.p2961b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49775a;
import com.p2082ss.android.ugc.p4267g.p4268a.EnumC81991b;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81990e;
import com.p2082ss.android.ugc.p4267g.p4268a.p4271c.C82001b;
import java.util.HashMap;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.p.b.e */
public final class C49803e extends AbstractC49775a {

    /* renamed from: g */
    public static final C49804a f114566g = new C49804a((byte) 0);

    /* renamed from: f */
    public final AbstractC49784a f114567f;

    static {
        Covode.recordClassIndex(58908);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.e$a */
    public static final class C49804a {
        static {
            Covode.recordClassIndex(58909);
        }

        private C49804a() {
        }

        public /* synthetic */ C49804a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49775a
    /* renamed from: c */
    public final void mo84318c() {
        super.mo84318c();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49775a
    /* renamed from: d */
    public final void mo84319d() {
        super.mo84319d();
        this.f114567f.mo84322a();
    }

    public C49803e(AbstractC49784a aVar) {
        C89219l.m154721d(aVar, "");
        this.f114567f = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.p.b.e$b */
    static final class C49805b extends AbstractC89220m implements AbstractC89172b<Long, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C49803e f114568a;

        /* renamed from: b */
        final /* synthetic */ EnumC81991b f114569b;

        /* renamed from: c */
        final /* synthetic */ HashMap f114570c;

        static {
            Covode.recordClassIndex(58910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49805b(C49803e eVar, EnumC81991b bVar, HashMap hashMap) {
            super(1);
            this.f114568a = eVar;
            this.f114569b = bVar;
            this.f114570c = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Long l) {
            l.longValue();
            this.f114568a.f114567f.mo84323a(this.f114568a, this.f114569b, this.f114570c);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49775a
    /* renamed from: a */
    public final void mo84315a(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        dVar.mo59981a(C81990e.f183483d, this.f114520a);
        dVar.mo59981a(C81990e.f183488i, System.currentTimeMillis() - this.f114520a);
        Long l = this.f114521b;
        if (l != null) {
            dVar.mo59981a(C81990e.f183487h, l.longValue() - this.f114520a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2959p.p2960a.AbstractC49775a
    /* renamed from: a */
    public final void mo84316a(EnumC81991b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
        C89391z zVar;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(hashMap, "");
        try {
            if (!hashMap.containsKey("extra_info")) {
                hashMap.put("extra_info", new HashMap<>());
            }
            HashMap<String, Object> hashMap2 = hashMap.get("extra_info");
            if (hashMap2 != null) {
                C89219l.m154716b(hashMap2, "");
                hashMap2.put("start_time", Long.valueOf(this.f114520a));
                zVar = C89391z.f203057a;
            } else {
                zVar = null;
            }
            C89379q.m157068constructorimpl(zVar);
        } catch (Throwable th) {
            C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (bVar == EnumC81991b.NETWORK_GOOD || bVar == EnumC81991b.UNKNOWN_STATUS) {
            new C82001b().mo127168a(10000, new C49805b(this, bVar, hashMap));
        } else {
            this.f114567f.mo84323a(this, bVar, hashMap);
        }
    }
}
