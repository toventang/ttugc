package com.p2082ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.p2123b.C29736b;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.profile.api.RelationCheckApi */
public interface RelationCheckApi {

    /* renamed from: a */
    public static final C63426a f144006a = C63426a.f144007a;

    static {
        Covode.recordClassIndex(74730);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/im/spotlight/multi_relation/")
    AbstractC88979t<C63436j> checkRelation(@AbstractC89736t(mo144292a = "sec_to_user_id") String str);

    /* renamed from: com.ss.android.ugc.aweme.profile.api.RelationCheckApi$a */
    public static final class C63426a {

        /* renamed from: a */
        static final /* synthetic */ C63426a f144007a = new C63426a();

        private C63426a() {
        }

        static {
            Covode.recordClassIndex(74731);
        }

        /* renamed from: a */
        public static RelationCheckApi m115013a() {
            Object a = RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28832d().mo28858a(RelationCheckApi.class);
            C89219l.m154716b(a, "");
            return (RelationCheckApi) a;
        }
    }
}
