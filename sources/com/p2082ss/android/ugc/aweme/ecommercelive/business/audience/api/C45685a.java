package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.C45818a;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a */
public final class C45685a {

    /* renamed from: a */
    public final AudienceProductListApi f106369a = ((AudienceProductListApi) C45818a.m88431a(AudienceProductListApi.class, "https://oec-api.tiktokv.com"));

    static {
        Covode.recordClassIndex(54200);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.api.a$a */
    public static final class C45686a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C45698b>, Object> {

        /* renamed from: a */
        int f106370a;

        /* renamed from: b */
        final /* synthetic */ C45685a f106371b;

        /* renamed from: c */
        final /* synthetic */ List f106372c;

        /* renamed from: d */
        final /* synthetic */ String f106373d;

        static {
            Covode.recordClassIndex(54201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45686a(C45685a aVar, List list, String str, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106371b = aVar;
            this.f106372c = list;
            this.f106373d = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45686a(this.f106371b, this.f106372c, this.f106373d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C45698b> dVar) {
            return ((C45686a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            boolean z;
            if (this.f106370a == 0) {
                C89382r.m154942a(obj);
                List list = this.f106372c;
                if (list == null || list.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    new C45698b(null, new RuntimeException("productIds cannot be null!!"));
                }
                StringBuilder sb = new StringBuilder();
                for (String str : this.f106372c) {
                    sb.append(str);
                    sb.append(',');
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                try {
                    AudienceProductListApi audienceProductListApi = this.f106371b.f106369a;
                    String str2 = this.f106373d;
                    String sb2 = sb.toString();
                    C89219l.m154716b(sb2, "");
                    return new C45698b(audienceProductListApi.getProductList(str2, sb2).execute().f52262b, null);
                } catch (Exception e) {
                    return new C45698b(null, e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
