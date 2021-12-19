package com.p2082ss.android.ugc.aweme.feed.assem.sharer;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39143l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.assem.C48707g;
import com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.ExposeSharer;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51754w;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63847n;
import com.p2082ss.android.ugc.aweme.utils.C80316cv;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM */
public final class VideoExposeSharerInformationVM extends FeedBaseViewModel<C49109j> implements AbstractC63854r {

    /* renamed from: k */
    static final /* synthetic */ AbstractC89286i[] f113007k = {new C89225r(VideoExposeSharerInformationVM.class, "context", "getContext()Landroid/content/Context;", 0)};

    /* renamed from: l */
    AbstractC51754w f113008l;

    /* renamed from: m */
    private final C48707g f113009m = new C48707g(C49069b.f113012a);

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$b */
    static final class C49069b extends AbstractC89220m implements AbstractC89171a<Context> {

        /* renamed from: a */
        public static final C49069b f113012a = new C49069b();

        static {
            Covode.recordClassIndex(57861);
        }

        C49069b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ Context invoke() {
            return null;
        }
    }

    static {
        Covode.recordClassIndex(57859);
    }

    /* renamed from: a */
    public final void mo80809a(Context context) {
        this.f113009m.mo80661a(f113007k[0], context);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: c */
    public final void mo71321c(FollowStatus followStatus) {
    }

    /* renamed from: h */
    public final Context mo23343h() {
        return (Context) this.f113009m.mo80660a(f113007k[0]);
    }

    /* renamed from: k */
    private final void m92203k() {
        mo20662a(C49072e.f113015a);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ AbstractC12853j mo20674f() {
        return new C49109j();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$a */
    static final class C49068a implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ Aweme f113010a;

        /* renamed from: b */
        final /* synthetic */ VideoExposeSharerInformationVM f113011b;

        static {
            Covode.recordClassIndex(57860);
        }

        C49068a(Aweme aweme, VideoExposeSharerInformationVM videoExposeSharerInformationVM) {
            this.f113010a = aweme;
            this.f113011b = videoExposeSharerInformationVM;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            VideoExposeSharerInformationVM videoExposeSharerInformationVM = this.f113011b;
            Aweme aweme = this.f113010a;
            String str = videoExposeSharerInformationVM.f112231p;
            if (str == null) {
                str = "";
            }
            videoExposeSharerInformationVM.mo80810a(aweme, str, false);
        }
    }

    /* renamed from: j */
    public final void mo80813j() {
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null) {
            mo20662a(new C49074g(videoItemParams, this));
        }
    }

    /* renamed from: i */
    public final int mo80812i() {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (exposeSharer = aweme.getExposeSharer()) == null) {
            return R.string.d6v;
        }
        int followStatus = exposeSharer.getFollowStatus();
        int followerStatus = exposeSharer.getFollowerStatus();
        if (followStatus != 0) {
            if (followStatus == 1) {
                return R.string.bz9;
            }
            if (followStatus == 2) {
                return R.string.baw;
            }
            if (followStatus != 4) {
                return R.string.d6v;
            }
            return R.string.byz;
        } else if (followerStatus == 1) {
            return R.string.bxw;
        } else {
            return R.string.bxs;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$g */
    public static final class C49074g extends AbstractC89220m implements AbstractC89172b<C49109j, C49109j> {

        /* renamed from: a */
        final /* synthetic */ VideoItemParams f113017a;

        /* renamed from: b */
        final /* synthetic */ VideoExposeSharerInformationVM f113018b;

        static {
            Covode.recordClassIndex(57866);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49074g(VideoItemParams videoItemParams, VideoExposeSharerInformationVM videoExposeSharerInformationVM) {
            super(1);
            this.f113017a = videoItemParams;
            this.f113018b = videoExposeSharerInformationVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49109j invoke(C49109j jVar) {
            C49109j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            return this.f113018b.mo23372a((AbstractC12853j) jVar2, this.f113017a);
        }
    }

    /* renamed from: b */
    private final void m92202b(boolean z) {
        if (z) {
            mo20662a(C49070c.f113013a);
        } else {
            mo20662a(C49071d.f113014a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$c */
    public static final class C49070c extends AbstractC89220m implements AbstractC89172b<C49109j, C49109j> {

        /* renamed from: a */
        public static final C49070c f113013a = new C49070c();

        static {
            Covode.recordClassIndex(57862);
        }

        C49070c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49109j invoke(C49109j jVar) {
            C49109j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            return C49109j.m92228a(jVar2, null, null, null, new C12776a(true), null, 0, 55);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$d */
    public static final class C49071d extends AbstractC89220m implements AbstractC89172b<C49109j, C49109j> {

        /* renamed from: a */
        public static final C49071d f113014a = new C49071d();

        static {
            Covode.recordClassIndex(57863);
        }

        C49071d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49109j invoke(C49109j jVar) {
            C49109j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            return C49109j.m92228a(jVar2, null, null, null, new C12776a(false), null, 0, 55);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$e */
    public static final class C49072e extends AbstractC89220m implements AbstractC89172b<C49109j, C49109j> {

        /* renamed from: a */
        public static final C49072e f113015a = new C49072e();

        static {
            Covode.recordClassIndex(57864);
        }

        C49072e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49109j invoke(C49109j jVar) {
            C49109j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            return C49109j.m92228a(jVar2, null, null, null, null, new C12776a(true), 0, 47);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM$f */
    public static final class C49073f extends AbstractC89220m implements AbstractC89172b<C49109j, C49109j> {

        /* renamed from: a */
        final /* synthetic */ VideoExposeSharerInformationVM f113016a;

        static {
            Covode.recordClassIndex(57865);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C49073f(VideoExposeSharerInformationVM videoExposeSharerInformationVM) {
            super(1);
            this.f113016a = videoExposeSharerInformationVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C49109j invoke(C49109j jVar) {
            C49109j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            return C49109j.m92228a(jVar2, null, null, null, null, null, this.f113016a.mo80812i(), 31);
        }
    }

    /* renamed from: a */
    public final void mo80811a(boolean z) {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (exposeSharer = aweme.getExposeSharer()) == null)) {
            if (exposeSharer.getFollowStatus() == 0) {
                m92203k();
            } else {
                m92202b(z);
            }
        }
        mo20662a(new C49073f(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: b */
    public final void mo71320b(FollowStatus followStatus) {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && (exposeSharer = aweme.getExposeSharer()) != null && exposeSharer.getUid() != null) {
            String uid = exposeSharer.getUid();
            if (followStatus == null) {
                C89219l.m154715b();
            }
            if (C89219l.m154714a((Object) uid, (Object) followStatus.userId)) {
                exposeSharer.setFollowStatus(followStatus.followStatus);
                mo80811a(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63854r
    /* renamed from: d_ */
    public final void mo71322d_(Exception exc) {
        Aweme aweme;
        ExposeSharer exposeSharer;
        VideoItemParams videoItemParams = (VideoItemParams) mo23342g();
        if (videoItemParams != null && (aweme = videoItemParams.mAweme) != null && (exposeSharer = aweme.getExposeSharer()) != null && exposeSharer.getUid() != null) {
            Activity a = C34729o.m70950a(mo23343h());
            C89219l.m154716b(a, "");
            C39143l.m79438a(a, exc);
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

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* renamed from: a */
    public final /* synthetic */ C49109j mo80488a(C49109j jVar, VideoItemParams videoItemParams) {
        String str;
        String str2;
        ExposeSharer exposeSharer;
        ExposeSharer exposeSharer2;
        C49109j jVar2 = jVar;
        C89219l.m154721d(jVar2, "");
        C89219l.m154721d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        UrlModel urlModel = null;
        if (aweme == null || (exposeSharer2 = aweme.getExposeSharer()) == null) {
            str = null;
        } else {
            str = exposeSharer2.getNickname();
        }
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        Aweme aweme2 = videoItemParams.mAweme;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        String sb2 = sb.append(str2).toString();
        if (sb2 == null) {
            sb2 = "no_aid";
        }
        Aweme aweme3 = videoItemParams.mAweme;
        if (!(aweme3 == null || (exposeSharer = aweme3.getExposeSharer()) == null)) {
            urlModel = exposeSharer.getAvatar();
        }
        return C49109j.m92228a(jVar2, str, sb2, urlModel, null, null, mo80812i(), 24);
    }

    /* renamed from: a */
    public final void mo80810a(Aweme aweme, String str, boolean z) {
        boolean z2;
        String str2;
        int a;
        AbstractC51754w wVar = this.f113008l;
        if (wVar != null && wVar.mo87471i() && aweme.getExposeSharer() != null) {
            C63847n.C63848a b = new C63847n.C63848a().mo103320a(aweme.getExposeSharer().getUid()).mo103325b(aweme.getExposeSharer().getSecUid());
            int i = 0;
            if (aweme.getExposeSharer().isPrivateAccount() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            C63847n.C63848a d = b.mo103322a(z2).mo103318a(1).mo103327c(str).mo103324b(C80316cv.C80317a.m139240a(str, null)).mo103328d(aweme.getExposeSharer().getFollowerStatus());
            String str3 = "homepage_hot";
            if (z) {
                if (TextUtils.equals(str, str3)) {
                    a = -1;
                } else {
                    a = C80316cv.C80317a.m139239a(str);
                }
                d.mo103326c(a);
            } else {
                d.mo103326c(C80316cv.C80317a.m139239a(str));
            }
            AbstractC51754w wVar2 = this.f113008l;
            if (wVar2 == null) {
                C89219l.m154715b();
            }
            wVar2.mo87469a(d.mo103323a());
            C33744d a2 = new C33744d().mo59983a("enter_from", "share_user_info_card");
            if (((FeedBaseViewModel) this).f112230o != 0) {
                str3 = "server_push";
            }
            C33744d a3 = a2.mo59983a("previous_page", str3).mo59983a("group_id", aweme.getAid()).mo59983a("author_id", aweme.getAuthorUid()).mo59983a("to_user_id", aweme.getExposeSharer().getUid());
            if (aweme.getExposeSharer().getFollowerStatus() == 1) {
                str2 = "mutual";
            } else {
                str2 = "single";
            }
            C33744d a4 = a3.mo59983a("follow_type", str2);
            if (aweme.getExposeSharer().isPrivateAccount() == 1) {
                i = 1;
            }
            C39162r.m79460a("follow", a4.mo59980a("is_private", i).f79943a);
        }
    }
}
