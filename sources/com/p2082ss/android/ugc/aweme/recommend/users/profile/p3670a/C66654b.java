package com.p2082ss.android.ugc.aweme.recommend.users.profile.p3670a;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.a.b */
public final class C66654b implements AbstractC12644a<AbstractC66653a> {

    /* renamed from: a */
    public final AbstractC66653a f149827a = new C66655a(this);

    static {
        Covode.recordClassIndex(78220);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC66653a mo20458a() {
        return this.f149827a;
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.users.profile.a.b$a */
    public static final class C66655a implements AbstractC66653a {

        /* renamed from: a */
        final /* synthetic */ C66654b f149828a;

        static {
            Covode.recordClassIndex(78221);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66655a(C66654b bVar) {
            this.f149828a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.recommend.users.profile.p3670a.AbstractC66653a
        /* renamed from: a */
        public final Object mo105670a(int i, int i2, String str, int i3, String str2) {
            int i4;
            RecommendUserApiService recommendUserApiService = RecommendUserApiService.f167940a;
            Integer a = C89108b.m154610a(i);
            Integer a2 = C89108b.m154610a(i2);
            C61504e eVar = C61504e.C61505a.f139616a;
            C89219l.m154716b(eVar, "");
            String a3 = eVar.mo99159a();
            if (i3 == 4) {
                i4 = 1;
            } else if (i3 == 13) {
                i4 = 2;
            } else if (i3 != 21) {
                i4 = 0;
            } else {
                i4 = 3;
            }
            return IRecommendUserApi.C74714a.m131169a(recommendUserApiService, a, a2, a3, str, C89108b.m154610a(i4), str2, 64);
        }
    }
}
