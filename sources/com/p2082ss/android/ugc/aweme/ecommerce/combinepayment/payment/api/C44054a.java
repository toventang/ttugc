package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.api;

import com.bytedance.android.ecommerce.C2732a;
import com.bytedance.android.ecommerce.p159e.AbstractC2780d;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44627b;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44628c;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.a */
public final class C44054a {

    /* renamed from: a */
    public static C44627b f102697a;

    /* renamed from: b */
    public static final C44054a f102698b = new C44054a();

    private C44054a() {
    }

    static {
        Covode.recordClassIndex(52360);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.a$a */
    public static final class C44055a implements AbstractC88986z<C43612a<C44628c>> {
        static {
            Covode.recordClassIndex(52361);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C43612a<C44628c> aVar) {
            C28022o oVar;
            String str;
            C43612a<C44628c> aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            T t = aVar2.data;
            if (t != null && (oVar = t.f104119a) != null) {
                C44054a.f102697a = (C44627b) new C27910f().mo46667a((AbstractC28019l) oVar, C44627b.class);
                AbstractC2780d dVar = C2732a.f8145a;
                C44627b bVar = C44054a.f102697a;
                String str2 = null;
                if (bVar != null) {
                    str = bVar.f104108c;
                } else {
                    str = null;
                }
                dVar.mo7366d(str);
                C44627b bVar2 = C44054a.f102697a;
                if (bVar2 != null) {
                    str2 = bVar2.f104110e;
                }
                dVar.mo7365c(str2);
            }
        }
    }
}
