package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.api.IRecommendUserApi;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import com.p2082ss.android.ugc.aweme.user.repository.C80099b;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.h */
public final class C51624h extends AbstractC20179a<C51626i, List<? extends C80099b>, C51626i, RecommendList> {

    /* renamed from: a */
    public static final C51625a f118938a = new C51625a((byte) 0);

    static {
        Covode.recordClassIndex(60967);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.h$a */
    public static final class C51625a {
        static {
            Covode.recordClassIndex(60968);
        }

        private C51625a() {
        }

        public /* synthetic */ C51625a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C89219l.m154721d(obj, "");
        return obj;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<RecommendList> mo33481a(C51626i iVar) {
        int i;
        C51626i iVar2 = iVar;
        C89219l.m154721d(iVar2, "");
        RecommendUserApiService recommendUserApiService = RecommendUserApiService.f167940a;
        Integer num = iVar2.f118939a;
        Integer num2 = iVar2.f118940b;
        String str = iVar2.f118945g;
        String str2 = iVar2.f118948j;
        Integer valueOf = Integer.valueOf(iVar2.f118942d);
        if (valueOf != null) {
            if (valueOf.intValue() == 4) {
                i = 1;
            } else if (valueOf.intValue() == 21) {
                i = 3;
            } else if (valueOf.intValue() == 13) {
                i = 2;
            }
            return IRecommendUserApi.C74714a.m131169a(recommendUserApiService, num, num2, str, str2, Integer.valueOf(i), null, 96);
        }
        i = 0;
        return IRecommendUserApi.C74714a.m131169a(recommendUserApiService, num, num2, str, str2, Integer.valueOf(i), null, 96);
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        List<User> userList;
        RecommendList recommendList = (RecommendList) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(recommendList, "");
        ArrayList arrayList = null;
        if (recommendList.status_code == 0 && (userList = recommendList.getUserList()) != null) {
            arrayList = new ArrayList();
            for (T t : userList) {
                C89219l.m154716b(t, "");
                t.setRequestId(recommendList.getRid());
                String rid = recommendList.getRid();
                C89219l.m154716b(rid, "");
                arrayList.add(new C80099b(t, rid, (byte) 0));
            }
        }
        return arrayList;
    }
}
