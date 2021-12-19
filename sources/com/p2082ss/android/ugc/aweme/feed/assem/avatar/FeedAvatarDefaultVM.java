package com.p2082ss.android.ugc.aweme.feed.assem.avatar;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.assem.avatar.C48383a;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49557n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM */
public final class FeedAvatarDefaultVM extends FeedBaseViewModel<C48415h> {
    static {
        Covode.recordClassIndex(57153);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C48415h();
    }

    /* renamed from: h */
    public final void mo23343h() {
        mo20662a(new C48380a(this));
    }

    /* renamed from: i */
    public final String mo80505i() {
        Aweme aweme;
        User author;
        ProfileBadgeStruct profileBadge;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null || (profileBadge = author.getProfileBadge()) == null)) {
            C89219l.m154716b(profileBadge, "");
            if (profileBadge.getShouldShow() && profileBadge.getUrl().length() > 0) {
                return profileBadge.getUrl();
            }
        }
        return null;
    }

    /* renamed from: j */
    public final int mo80506j() {
        Aweme aweme;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || !aweme.isCanPlay() || aweme.isDelete() || C48383a.C48384a.m91839a(aweme) || C37699a.m76219V(aweme)) {
            return 8;
        }
        if (C80580in.m139680a(aweme) || C37699a.m76271aq(aweme) || !C49557n.m92870b(aweme)) {
            return 4;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM$a */
    public static final class C48380a extends AbstractC89220m implements AbstractC89172b<C48415h, C48415h> {

        /* renamed from: a */
        final /* synthetic */ FeedAvatarDefaultVM f112085a;

        static {
            Covode.recordClassIndex(57154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48380a(FeedAvatarDefaultVM feedAvatarDefaultVM) {
            super(1);
            this.f112085a = feedAvatarDefaultVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C48415h invoke(C48415h hVar) {
            C48415h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            FeedAvatarDefaultVM feedAvatarDefaultVM = this.f112085a;
            Object g = feedAvatarDefaultVM.mo23342g();
            if (g == null) {
                C89219l.m154715b();
            }
            return feedAvatarDefaultVM.mo80488a(hVar2, (VideoItemParams) g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM$b */
    static final class C48381b extends AbstractC89220m implements AbstractC89172b<C48415h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FeedAvatarDefaultVM f112086a;

        /* renamed from: b */
        final /* synthetic */ String f112087b;

        static {
            Covode.recordClassIndex(57155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48381b(FeedAvatarDefaultVM feedAvatarDefaultVM, String str) {
            super(1);
            this.f112086a = feedAvatarDefaultVM;
            this.f112087b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C48415h hVar) {
            C48415h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (!C89219l.m154714a((Object) this.f112087b, (Object) hVar2.f112136b)) {
                this.f112086a.mo20662a(new AbstractC89172b<C48415h, C48415h>(this) {
                    /* class com.p2082ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultVM.C48381b.C483821 */

                    /* renamed from: a */
                    final /* synthetic */ C48381b f112088a;

                    static {
                        Covode.recordClassIndex(57156);
                    }

                    {
                        this.f112088a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C48415h invoke(C48415h hVar) {
                        C48415h hVar2 = hVar;
                        C89219l.m154721d(hVar2, "");
                        return C48415h.m91853a(hVar2.f112135a, this.f112088a.f112087b);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.AbstractC14529j
    /* renamed from: b */
    public final /* synthetic */ VideoItemParams mo23373b(AbstractC12853j jVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(jVar, "");
        C89219l.m154721d(videoItemParams, "");
        return videoItemParams;
    }

    /* renamed from: a */
    public final C48415h mo80488a(C48415h hVar, VideoItemParams videoItemParams) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(videoItemParams, "");
        return C48415h.m91853a(mo80506j(), mo80505i());
    }
}
