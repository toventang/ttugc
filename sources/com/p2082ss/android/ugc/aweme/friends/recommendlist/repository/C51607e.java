package com.p2082ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.social.api.RecommendUserApiService;
import com.p2082ss.android.ugc.aweme.user.repository.C80099b;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.e */
public final class C51607e extends AbstractC20179a<C51623g, List<? extends C80099b>, C51623g, RecommendList> {
    static {
        Covode.recordClassIndex(60950);
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
    public final /* synthetic */ AbstractC88979t<RecommendList> mo33481a(C51623g gVar) {
        C51623g gVar2 = gVar;
        C89219l.m154721d(gVar2, "");
        AbstractC88979t<RecommendList> b = RecommendUserApiService.f167940a.recommendList(gVar2.f118928a, gVar2.f118929b, gVar2.f118930c, gVar2.f118931d, gVar2.f118932e, gVar2.f118933f, gVar2.f118934g, gVar2.f118935h, gVar2.f118937j).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
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
