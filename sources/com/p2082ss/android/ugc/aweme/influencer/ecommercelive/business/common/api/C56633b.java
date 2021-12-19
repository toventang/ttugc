package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.C56653a;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.b */
public final class C56633b {

    /* renamed from: a */
    public final ProductApi f129082a = ((ProductApi) C56653a.m102653a(ProductApi.class, "https://oec-api.tiktokv.com"));

    static {
        Covode.recordClassIndex(66478);
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.b$a */
    public static final class C56634a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C56632a>, Object> {

        /* renamed from: a */
        int f129083a;

        /* renamed from: b */
        final /* synthetic */ C56633b f129084b;

        /* renamed from: c */
        final /* synthetic */ boolean f129085c;

        /* renamed from: d */
        final /* synthetic */ String f129086d;

        /* renamed from: e */
        final /* synthetic */ String f129087e;

        static {
            Covode.recordClassIndex(66479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56634a(C56633b bVar, boolean z, String str, String str2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f129084b = bVar;
            this.f129085c = z;
            this.f129086d = str;
            this.f129087e = str2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C56634a(this.f129084b, this.f129085c, this.f129086d, this.f129087e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C56632a> dVar) {
            return ((C56634a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Map<String, String> map;
            if (this.f129083a == 0) {
                C89382r.m154942a(obj);
                try {
                    if (this.f129085c) {
                        map = C89041ag.m154412a(C89387v.m154943a("delete_mode", "1"));
                    } else {
                        map = C89041ag.m154421a(C89387v.m154943a("room_id", this.f129086d), C89387v.m154943a("product_ids", this.f129087e), C89387v.m154943a("delete_mode", "0"));
                    }
                    return new C56632a(this.f129084b.f129082a.deleteProducts(map).execute().f52262b, this.f129087e, 4);
                } catch (Exception e) {
                    return new C56632a((BaseResponse<String>) null, this.f129087e, e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
