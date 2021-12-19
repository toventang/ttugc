package com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c;
import com.bytedance.ies.p1208im.core.api.p1216f.C17458d;
import com.bytedance.ies.p1208im.core.api.p1217g.AbstractC17462b;
import com.bytedance.ies.p1208im.core.api.p1217g.C17459a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19672u;
import com.bytedance.p1399im.core.proto.Request;
import com.bytedance.p1399im.core.proto.Response;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Map;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89717a;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89725i;
import p4640l.p4644b.AbstractC89726j;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89737u;
import p4640l.p4644b.AbstractC89740x;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi */
public interface PlatformApi {

    /* renamed from: a */
    public static final C55625a f126880a = C55625a.f126881a;

    static {
        Covode.recordClassIndex(65406);
    }

    @AbstractC89722f
    AbstractC88979t<String> get(@AbstractC89740x String str, @AbstractC89726j Map<String, String> map, @AbstractC89737u Map<String, String> map2);

    @AbstractC89731o
    AbstractC88979t<String> post(@AbstractC89740x String str, @AbstractC89726j Map<String, String> map, @AbstractC89737u Map<String, String> map2, @AbstractC89717a Object obj);

    @AbstractC89731o
    AbstractC88979t<Response> postSDK(@AbstractC89740x String str, @AbstractC89725i(mo144281a = "Content-Type") String str2, @AbstractC89717a Request request, @AbstractC21996d Object obj);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a */
    public static final class C55625a implements AbstractC17450c {

        /* renamed from: a */
        static final /* synthetic */ C55625a f126881a;

        /* renamed from: b */
        private static final AbstractC89244h f126882b;

        @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
        /* renamed from: a */
        public final boolean mo27844a() {
            return false;
        }

        private C55625a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a$c */
        static final class C55628c extends AbstractC89220m implements AbstractC89171a<PlatformApi> {

            /* renamed from: a */
            final /* synthetic */ C55625a f126886a;

            static {
                Covode.recordClassIndex(65410);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C55628c(C55625a aVar) {
                super(0);
                this.f126886a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ PlatformApi invoke() {
                return m101339a();
            }

            /* renamed from: a */
            private static PlatformApi m101339a() {
                try {
                    return (PlatformApi) RetrofitFactory.m33635a().mo28817b(C55074a.f126040b).mo28832d().mo28858a(PlatformApi.class);
                } catch (Throwable th) {
                    C56244a.m102187a("PlatformAPI", th);
                    return null;
                }
            }
        }

        static {
            Covode.recordClassIndex(65407);
            C55625a aVar = new C55625a();
            f126881a = aVar;
            f126882b = C89250i.m154773a((AbstractC89171a) new C55628c(aVar));
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a$a */
        static final class C55626a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractC19479b f126883a;

            static {
                Covode.recordClassIndex(65408);
            }

            C55626a(AbstractC19479b bVar) {
                this.f126883a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f126883a.mo27861a(obj);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a$d */
        static final class C55629d<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractC19479b f126887a;

            static {
                Covode.recordClassIndex(65411);
            }

            C55629d(AbstractC19479b bVar) {
                this.f126887a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f126887a.mo27861a(obj);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a$b */
        static final class C55627b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C55625a f126884a;

            /* renamed from: b */
            final /* synthetic */ AbstractC19479b f126885b;

            static {
                Covode.recordClassIndex(65409);
            }

            C55627b(C55625a aVar, AbstractC19479b bVar) {
                this.f126884a = aVar;
                this.f126885b = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f126885b.mo27860a(C55625a.m101334a((Throwable) obj));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.iescore.api.PlatformApi$a$e */
        static final class C55630e<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C55625a f126888a;

            /* renamed from: b */
            final /* synthetic */ AbstractC19479b f126889b;

            static {
                Covode.recordClassIndex(65412);
            }

            C55630e(C55625a aVar, AbstractC19479b bVar) {
                this.f126888a = aVar;
                this.f126889b = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                this.f126889b.mo27860a(C55625a.m101334a((Throwable) obj));
            }
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
        /* renamed from: a */
        public final void mo27842a(AbstractC17462b bVar) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(bVar, "");
        }

        /* renamed from: a */
        public static C19672u m101334a(Throwable th) {
            C19672u.C19673a a = C19672u.m36755a();
            a.f46736a.f46735h = th;
            if (th instanceof C34485a) {
                C34485a aVar = (C34485a) th;
                a.mo31629a(aVar.getErrorCode());
                a.mo31630a(aVar.getErrorMsg());
                a.f46736a.f46734g = aVar.getResponse();
            }
            C19672u uVar = a.f46736a;
            C89219l.m154716b(uVar, "");
            return uVar;
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
        /* renamed from: a */
        public final void mo27841a(C17459a<Request> aVar, AbstractC19479b<Response> bVar) {
            AbstractC88979t<Response> tVar;
            String str = "";
            C89219l.m154721d(aVar, str);
            C89219l.m154721d(bVar, str);
            String str2 = aVar.f41813c.get("Content-Type");
            if (str2 != null) {
                str = str2;
            }
            PlatformApi platformApi = (PlatformApi) f126882b.getValue();
            if (platformApi != null) {
                tVar = platformApi.postSDK(aVar.f41811a, str, aVar.f41815e, aVar.f41816f);
            } else {
                tVar = null;
            }
            AbstractC88403ab.m153601a((AbstractC88984x) tVar).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C55629d(bVar), new C55630e(this, bVar));
        }

        @Override // com.bytedance.ies.p1208im.core.api.p1214d.AbstractC17450c
        /* renamed from: a */
        public final void mo27843a(boolean z, AbstractC19479b<C17458d> bVar) {
            C89219l.m154721d(bVar, "");
            AbstractC88979t<C17458d> fetchMixInit = C55257a.f126351a.fetchMixInit(0, 0, 1);
            C89219l.m154716b(fetchMixInit, "");
            fetchMixInit.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C55626a(bVar), new C55627b(this, bVar));
        }
    }
}
