package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d;
import com.p2082ss.android.ugc.aweme.favorites.p2924f.C47426a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50560y;
import com.p2082ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.preload.p3564b.C63332a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.ShareFlavorService;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.f */
public final class C69046f implements AbstractC69693h {

    /* renamed from: e */
    public static final C69047a f154436e = new C69047a((byte) 0);

    /* renamed from: a */
    public C47426a f154437a;

    /* renamed from: b */
    public final Activity f154438b;

    /* renamed from: c */
    public final Aweme f154439c;

    /* renamed from: d */
    public final String f154440d;

    /* renamed from: f */
    private final String f154441f;

    /* renamed from: g */
    private final String f154442g;

    /* renamed from: h */
    private final String f154443h;

    static {
        Covode.recordClassIndex(81360);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "favorite";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.f$a */
    public static final class C69047a {
        static {
            Covode.recordClassIndex(81361);
        }

        private C69047a() {
        }

        public /* synthetic */ C69047a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.f$b */
    static final class C69048b implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ C69046f f154444a;

        static {
            Covode.recordClassIndex(81362);
        }

        C69048b(C69046f fVar) {
            this.f154444a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f154444a.mo109528h();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        if (this.f154439c.isCollected()) {
            return R.raw.icon_2pt_bookmark_fill;
        }
        return R.raw.icon_2pt_bookmark;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        if (this.f154439c.isCollected()) {
            return R.raw.icon_bookmark_fill;
        }
        return R.raw.icon_bookmark;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        if (this.f154439c.isCollected()) {
            ShareFlavorService.C68825a.m121371a();
            return R.string.t9;
        }
        ShareFlavorService.C68825a.m121371a();
        return R.string.t8;
    }

    /* renamed from: h */
    public final void mo109528h() {
        if (this.f154437a == null) {
            C47426a aVar = new C47426a();
            this.f154437a = aVar;
            aVar.f110158c = this.f154440d;
        }
        C47426a aVar2 = this.f154437a;
        if (aVar2 == null) {
            C89219l.m154710a("collectActionPresenter");
        }
        aVar2.mo67839a_(new C69049c(this));
        C47426a aVar3 = this.f154437a;
        if (aVar3 == null) {
            C89219l.m154710a("collectActionPresenter");
        }
        aVar3.mo57616a(2, this.f154439c.getAid(), Integer.valueOf(!this.f154439c.isCollected()));
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.f$c */
    public static final class C69049c implements AbstractC47430d {

        /* renamed from: a */
        final /* synthetic */ C69046f f154445a;

        static {
            Covode.recordClassIndex(81363);
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
        /* renamed from: e_ */
        public final void mo62592e_(Exception exc) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69049c(C69046f fVar) {
            this.f154445a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
        /* renamed from: a */
        public final void mo62589a(String str) {
            if (str != null) {
                new C23144b(this.f154445a.f154438b).mo37635a(str).mo37637b();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.favorites.p2924f.AbstractC47430d
        /* renamed from: a */
        public final void mo62587a(BaseResponse baseResponse) {
            if (!this.f154445a.f154439c.isCollected()) {
                this.f154445a.f154439c.setCollectStatus(1);
                AwemeService.m70060b().mo60689c(this.f154445a.f154439c.getAid(), 1);
                ReportFeedAdAction.m78334a(this.f154445a.f154440d);
                AbstractC81915c.m141874a(new C49672ag(54, this.f154445a.f154439c));
                if (C89219l.m154714a((Object) "homepage_hot", (Object) this.f154445a.f154440d)) {
                    C63332a.C63333a.m114832a().mo101921a(6);
                    return;
                }
                return;
            }
            this.f154445a.f154439c.setCollectStatus(0);
            AwemeService.m70060b().mo60689c(this.f154445a.f154439c.getAid(), 0);
            AbstractC81915c.m141874a(new C49672ag(54, this.f154445a.f154439c));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String region;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        if (!this.f154439c.isCollected()) {
            C33744d dVar = new C33744d();
            C33744d a = dVar.mo59983a("enter_from", this.f154440d).mo59983a("group_id", this.f154439c.getAid()).mo59983a("author_id", this.f154439c.getAuthorUid()).mo59983a("enter_method", "click_share_button").mo59983a("tag_id", this.f154441f).mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f154439c, "detail")).mo59982a("is_highlighted", Boolean.valueOf(this.f154439c.isHighlighted())).mo59980a("rank_index", this.f154439c.getOriginalPos());
            C89219l.m154716b(a, "");
            C79900c.m138665a(a, this.f154439c, this.f154440d);
            if (C89219l.m154714a((Object) "homepage_country", (Object) this.f154440d) && this.f154439c.getAuthor() != null) {
                if (this.f154439c.getAuthor() == null) {
                    region = "";
                } else {
                    User author = this.f154439c.getAuthor();
                    C89219l.m154716b(author, "");
                    region = author.getRegion();
                }
                dVar.mo59983a("country_name", region);
            }
            if (this.f154442g.length() > 0) {
                dVar.mo59983a("parent_tag_id", this.f154442g);
            }
            if (this.f154443h.length() > 0) {
                dVar.mo59983a("category_name", this.f154443h);
            }
            dVar.mo59986a(C50560y.m94792b(FeedParamProvider.C49809a.m93270a(context).getPreviousPage(), FeedParamProvider.C49809a.m93270a(context).getFromGroupId()));
            C89219l.m154716b(dVar, "");
            C76598h.m134177a(dVar, this.f154439c);
            if (C59208ac.m108762a(this.f154440d)) {
                dVar.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f154439c)));
                C39162r.m79461a("favourite_video", C59208ac.m108761a(dVar.f79943a));
            } else {
                C39162r.m79460a("favourite_video", dVar.f79943a);
            }
            C49907s.m93686a(EnumC48310af.SHARE);
        } else {
            C39162r.m79460a("cancel_favourite_video", new C33744d().mo59983a("enter_from", this.f154440d).mo59983a("group_id", this.f154439c.getAid()).mo59983a("author_id", this.f154439c.getAuthorUid()).mo59983a("enter_method", "click_share_button").mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108763b(this.f154439c))).mo59985a((HashMap<? extends String, ? extends String>) ForwardStatisticsServiceImpl.m95759b().mo86843a(this.f154439c, "detail")).f79943a);
        }
        if (C37699a.m76218U(this.f154439c)) {
            new C79459a(context).mo123050a(R.string.o7).mo123053a();
            return;
        }
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin()) {
            String aid = this.f154439c.getAid();
            C58957c.m108320a(C69124b.m122223a(context), this.f154440d, "click_favorite_video", new C80222ap().mo123649a("group_id", aid).mo123649a("log_pb", C59208ac.m108768c(aid)).f179700a, new C69048b(this));
            return;
        }
        mo109528h();
    }

    public C69046f(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        this.f154438b = activity;
        this.f154439c = aweme;
        this.f154440d = str;
        this.f154441f = str2;
        this.f154442g = str3;
        this.f154443h = str4;
    }
}
