package com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user;

import android.text.TextUtils;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.newfollow.p3506c.C61504e;
import com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.d */
public final class C65123d implements AbstractC12644a<AbstractC65122c> {

    /* renamed from: a */
    public final IRecommendUserApi f146996a = RecommendUserApiService.f167940a;

    /* renamed from: b */
    public final AbstractC65122c f146997b = new C65124a(this);

    static {
        Covode.recordClassIndex(76592);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC65122c mo20458a() {
        return this.f146997b;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.d$a */
    public static final class C65124a implements AbstractC65122c {

        /* renamed from: a */
        final /* synthetic */ C65123d f146998a;

        static {
            Covode.recordClassIndex(76593);
        }

        /* renamed from: a */
        private static int m116831a(int i) {
            if (i == 4) {
                return 1;
            }
            if (i != 13) {
                return i != 21 ? 0 : 3;
            }
            return 2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65124a(C65123d dVar) {
            this.f146998a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65122c
        /* renamed from: a */
        public final Object mo104329a(String str, int i, int i2, String str2, String str3, String str4) {
            int i3;
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isUidContactPermisioned()) {
                i3 = 1;
            } else {
                i3 = 2;
            }
            if (!TextUtils.isEmpty(str2)) {
                IRecommendUserApi iRecommendUserApi = this.f146998a.f146996a;
                Integer a = C89108b.m154610a(30);
                Integer a2 = C89108b.m154610a(0);
                Integer a3 = C89108b.m154610a(i2);
                Integer a4 = C89108b.m154610a(1);
                Integer a5 = C89108b.m154610a(i3);
                C61504e eVar = C61504e.C61505a.f139616a;
                C89219l.m154716b(eVar, "");
                return iRecommendUserApi.recommendList(a, a2, str, a3, a4, a5, eVar.mo99159a(), str2, str3, null);
            } else if (i2 != 1) {
                if (i2 != 4 && i2 != 13) {
                    return null;
                }
                IRecommendUserApi iRecommendUserApi2 = this.f146998a.f146996a;
                Integer a6 = C89108b.m154610a(30);
                Integer a7 = C89108b.m154610a(0);
                C61504e eVar2 = C61504e.C61505a.f139616a;
                C89219l.m154716b(eVar2, "");
                return iRecommendUserApi2.recommendListMT(a6, a7, eVar2.mo99159a(), str3, C89108b.m154610a(m116831a(i2)), false);
            } else if (str4.length() > 0) {
                IRecommendUserApi iRecommendUserApi3 = this.f146998a.f146996a;
                Integer a8 = C89108b.m154610a(30);
                Integer a9 = C89108b.m154610a(i);
                C61504e eVar3 = C61504e.C61505a.f139616a;
                C89219l.m154716b(eVar3, "");
                return iRecommendUserApi3.recommendListTask(a8, a9, eVar3.mo99159a(), str, C89108b.m154610a(m116831a(i2)), str4, false);
            } else {
                IRecommendUserApi iRecommendUserApi4 = this.f146998a.f146996a;
                Integer a10 = C89108b.m154610a(30);
                Integer a11 = C89108b.m154610a(0);
                C61504e eVar4 = C61504e.C61505a.f139616a;
                C89219l.m154716b(eVar4, "");
                return iRecommendUserApi4.recommendListMT(a10, a11, eVar4.mo99159a(), str, C89108b.m154610a(m116831a(i2)), false);
            }
        }
    }
}
