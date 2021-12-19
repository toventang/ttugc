package com.p2082ss.android.ugc.aweme.recommend.users;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.p2082ss.android.ugc.aweme.friends.p3017g.AbstractC51500a;
import com.p2082ss.android.ugc.aweme.profile.service.AbstractC63871f;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.recommend.users.b */
public final class C66652b implements IRecommendUsersService {

    /* renamed from: a */
    public static final C66652b f149825a = new C66652b();

    /* renamed from: b */
    private final /* synthetic */ IRecommendUsersService f149826b;

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: a */
    public final AbstractC51500a mo105653a() {
        return this.f149826b.mo105653a();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: a */
    public final void mo105654a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f149826b.mo105654a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: a */
    public final void mo105655a(String str, String str2) {
        C89219l.m154721d(str, "");
        this.f149826b.mo105655a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: b */
    public final boolean mo105656b() {
        return this.f149826b.mo105656b();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: c */
    public final boolean mo105657c() {
        return this.f149826b.mo105657c();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: d */
    public final boolean mo105658d() {
        return this.f149826b.mo105658d();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: e */
    public final boolean mo105659e() {
        return this.f149826b.mo105659e();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: f */
    public final boolean mo105660f() {
        return this.f149826b.mo105660f();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: g */
    public final boolean mo105661g() {
        return this.f149826b.mo105661g();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: h */
    public final AbstractC88979t<RecommendUserInDMBean> mo105662h() {
        return this.f149826b.mo105662h();
    }

    @Override // com.p2082ss.android.ugc.aweme.recommend.users.IRecommendUsersService
    /* renamed from: i */
    public final AbstractC63871f mo105663i() {
        return this.f149826b.mo105663i();
    }

    static {
        Covode.recordClassIndex(78218);
    }

    private C66652b() {
        IRecommendUsersService j = IRecommendUsersServiceImpl.m118438j();
        C89219l.m154716b(j, "");
        this.f149826b = j;
    }
}
