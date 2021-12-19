package com.p2082ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.upvote.event.C79898a;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.p2082ss.android.ugc.aweme.upvote.p4187a.AbstractC79704a;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.upvote.publish.AbstractC79925a;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.service.a */
public final class C80034a implements IUpvoteService {

    /* renamed from: a */
    public static final C80034a f179347a = new C80034a();

    /* renamed from: b */
    private final /* synthetic */ IUpvoteService f179348b;

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final int mo123474a() {
        return this.f179348b.mo123474a();
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final AssemViewModel<C80022g> mo123475a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        return this.f179348b.mo123475a(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final AbstractC79704a mo123476a(FrameLayout frameLayout, AbstractC1204m mVar) {
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(mVar, "");
        return this.f179348b.mo123476a(frameLayout, mVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final List<C79714h> mo123477a(String str) {
        C89219l.m154721d(str, "");
        return this.f179348b.mo123477a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123478a(AbstractC12846h hVar, AbstractC79925a aVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(aVar, "");
        this.f179348b.mo123478a(hVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123479a(String str, int i) {
        C89219l.m154721d(str, "");
        this.f179348b.mo123479a(str, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123480a(String str, UpvotePublishMobParam upvotePublishMobParam) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(upvotePublishMobParam, "");
        this.f179348b.mo123480a(str, upvotePublishMobParam);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123481a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(upvotePublishMobParam, "");
        this.f179348b.mo123481a(str, z, upvotePublishMobParam, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: a */
    public final void mo123482a(List<? extends Aweme> list) {
        C89219l.m154721d(list, "");
        this.f179348b.mo123482a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: b */
    public final Integer mo123483b(String str) {
        C89219l.m154721d(str, "");
        return this.f179348b.mo123483b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: b */
    public final void mo123484b() {
        this.f179348b.mo123484b();
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: c */
    public final C79898a mo123485c(String str) {
        C89219l.m154721d(str, "");
        return this.f179348b.mo123485c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.upvote.service.IUpvoteService
    /* renamed from: c */
    public final void mo123486c() {
        this.f179348b.mo123486c();
    }

    static {
        Covode.recordClassIndex(93264);
    }

    private C80034a() {
        IUpvoteService d = UpvoteServiceImpl.m138748d();
        C89219l.m154716b(d, "");
        this.f179348b = d;
    }
}
