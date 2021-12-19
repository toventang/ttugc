package com.p2082ss.android.ugc.aweme.recommend.users;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63871f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.a */
public final class C66649a implements IRecommendUsersDependentService {

    /* renamed from: a */
    public static final C66649a f149816a = new C66649a();

    /* renamed from: b */
    private final /* synthetic */ IRecommendUsersDependentService f149817b;

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    /* renamed from: a */
    public final AbstractC63871f mo105650a() {
        return this.f149817b.mo105650a();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    /* renamed from: a */
    public final boolean mo105651a(boolean z) {
        return this.f149817b.mo105651a(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService
    /* renamed from: b */
    public final boolean mo105652b() {
        return this.f149817b.mo105652b();
    }

    static {
        Covode.recordClassIndex(78215);
    }

    private C66649a() {
        IRecommendUsersDependentService iRecommendUsersDependentServiceImpl;
        Object a = C81908b.m141854a(IRecommendUsersDependentService.class, false);
        if (a != null) {
            iRecommendUsersDependentServiceImpl = (IRecommendUsersDependentService) a;
        } else {
            iRecommendUsersDependentServiceImpl = new IRecommendUsersDependentServiceImpl();
        }
        C89219l.m154716b(iRecommendUsersDependentServiceImpl, "");
        this.f149817b = iRecommendUsersDependentServiceImpl;
    }
}
