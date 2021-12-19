package com.p2082ss.android.ugc.aweme.userservice.jedi.p4198a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.p2082ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.services.RetrofitService;
import com.p2082ss.android.ugc.aweme.userservice.api.C80103a;
import com.p2082ss.android.ugc.aweme.userservice.jedi.model.JediFollowApi;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.userservice.jedi.a.a */
public final class C80105a extends AbstractC20179a<String, Integer, C80103a, FollowStatus> {

    /* renamed from: a */
    public final JediFollowApi f179500a;

    static {
        Covode.recordClassIndex(93345);
    }

    public C80105a() {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(createIMainServicebyMonsterPlugin.getApiUrlPrefix()).create(JediFollowApi.class);
        C89219l.m154716b(create, "");
        this.f179500a = (JediFollowApi) create;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: b */
    public final /* synthetic */ Object mo33483b(Object obj) {
        C80103a aVar = (C80103a) obj;
        C89219l.m154721d(aVar, "");
        return aVar.f179486a;
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20179a
    /* renamed from: a */
    public final /* synthetic */ AbstractC88979t<FollowStatus> mo33481a(C80103a aVar) {
        C80103a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        if (aVar2.f179490e == -1) {
            AbstractC88979t<FollowStatus> b = this.f179500a.follow(aVar2.f179486a, aVar2.f179487b, aVar2.f179488c, aVar2.f179489d, null, aVar2.f179491f, null, aVar2.f179493h, aVar2.f179494i, aVar2.f179495j).mo143278b(C88925a.m154180b(C88946a.f201991c));
            C89219l.m154716b(b, "");
            return b;
        }
        AbstractC88979t<FollowStatus> b2 = this.f179500a.follow(aVar2.f179486a, aVar2.f179487b, aVar2.f179488c, aVar2.f179489d, Integer.valueOf(aVar2.f179490e), aVar2.f179491f, Integer.valueOf(aVar2.f179492g), aVar2.f179493h, aVar2.f179494i, aVar2.f179495j).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b2, "");
        return b2;
    }

    @Override // com.bytedance.jedi.p1445a.p1453f.AbstractC20181b
    /* renamed from: a */
    public final /* synthetic */ Object mo33482a(Object obj, Object obj2) {
        FollowStatus followStatus = (FollowStatus) obj2;
        C89219l.m154721d(obj, "");
        C89219l.m154721d(followStatus, "");
        if (followStatus.status_code == 0) {
            return Integer.valueOf(followStatus.followStatus);
        }
        return null;
    }
}
