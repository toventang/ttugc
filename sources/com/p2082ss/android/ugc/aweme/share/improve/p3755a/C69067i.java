package com.p2082ss.android.ugc.aweme.share.improve.p3755a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.helper.C49648o;
import com.p2082ss.android.ugc.aweme.feed.helper.C49653t;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49677e;
import com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49960ad;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.metrics.C59246k;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.p3749g.p3750a.C68928a;
import com.p2082ss.android.ugc.aweme.share.p3749g.p3750a.C68930b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.i */
public final class C69067i implements AbstractC49960ad, AbstractC69693h {

    /* renamed from: c */
    public static final C69068a f154477c = new C69068a((byte) 0);

    /* renamed from: a */
    public final Aweme f154478a;

    /* renamed from: b */
    public final String f154479b;

    /* renamed from: d */
    private final String f154480d;

    static {
        Covode.recordClassIndex(81381);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        return R.string.dg1;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "dislike";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_broken_heart;
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

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return R.raw.icon_heart_broken;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.i$a */
    public static final class C69068a {
        static {
            Covode.recordClassIndex(81382);
        }

        private C69068a() {
        }

        public /* synthetic */ C69068a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.i$b */
    public static final class C69069b implements AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ C69067i f154481a;

        static {
            Covode.recordClassIndex(81383);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c
        /* renamed from: a */
        public final void mo58887a() {
            AbstractC81915c.m141874a(new C49677e(this.f154481a.f154478a, this.f154481a.f154479b));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69069b(C69067i iVar) {
            this.f154481a = iVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2969u.AbstractC49960ad
    /* renamed from: h */
    public final void mo85000h() {
        Context a;
        if (C17873f.m33102j() != null) {
            a = C17873f.m33102j();
        } else {
            a = C17867d.m33078a();
        }
        if (!m122020a(this.f154478a)) {
            SharePrefCache inst = SharePrefCache.inst();
            C89219l.m154716b(inst, "");
            C33594aj<Boolean> hasLongPressDislike = inst.getHasLongPressDislike();
            C89219l.m154716b(hasLongPressDislike, "");
            Boolean c = hasLongPressDislike.mo59941c();
            C89219l.m154716b(c, "");
            if (c.booleanValue() || C89219l.m154714a((Object) this.f154479b, (Object) "long_video_detail_page") || C89219l.m154714a((Object) this.f154479b, (Object) "homepage_long_video")) {
                new C79459a(a).mo123050a(R.string.b8s).mo123053a();
            } else {
                new C79459a(a).mo123050a(R.string.czj).mo123053a();
            }
        }
        if ((!C89219l.m154714a((Object) this.f154479b, (Object) "long_video_detail_page")) && (!C89219l.m154714a((Object) this.f154479b, (Object) "homepage_long_video")) && !m122020a(this.f154478a)) {
            AbstractC81915c.m141874a(new C49677e(this.f154478a, this.f154479b, C49677e.f114337e));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    private static boolean m122020a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        C38231b dislikeInfo;
        if (!aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
            return false;
        }
        return true;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C69067i(Aweme aweme, String str) {
        this(aweme, str, "click_share_button");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        int i;
        IFeedAdService c;
        DialogInterface$OnCancelListenerC0944d a;
        ITalentAdRevenueShareService e;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        int a2 = C33721c.m69041a(this.f154479b);
        if (this.f154478a.getAuthor() != null) {
            User author = this.f154478a.getAuthor();
            C89219l.m154716b(author, "");
            i = author.getFollowStatus();
        } else {
            i = -1;
        }
        C59246k a3 = new C59246k().mo96814a(this.f154479b);
        a3.f135235a = C59208ac.m108771e(this.f154478a);
        a3.f135236b = C59208ac.m108758a(this.f154478a);
        a3.f135237c = this.f154480d;
        a3.f135239e = C59208ac.m108773g(this.f154478a);
        a3.f135238d = C59208ac.m108763b(this.f154478a);
        a3.f135240p = "detail";
        a3.f135241q = this.f154478a.isForwardAweme() ? 1 : 0;
        a3.f135242r = C59208ac.m108771e(this.f154478a.getForwardItem());
        a3.f135243s = C59208ac.m108758a(this.f154478a.getForwardItem());
        AbstractC59233c a4 = C79900c.m138667a(C80409eu.m139391a(a3, this.f154478a.getAuthor()), this.f154478a, this.f154479b);
        Aweme aweme = this.f154478a;
        C89219l.m154721d(a4, "");
        if (aweme != null && C76706a.m134281g(aweme)) {
            a4.mo96786a("story_type", "story");
            a4.mo96786a("story_collection_id", C76706a.m134276b(aweme));
        }
        C59246k kVar = (C59246k) a4;
        kVar.f135222V = i;
        kVar.mo96792f();
        AwemeRawAd awemeRawAd = this.f154478a.getAwemeRawAd();
        if (!(awemeRawAd == null || (e = TalentAdRevenueShareServiceImpl.m77931e()) == null)) {
            C89219l.m154716b(awemeRawAd, "");
            e.mo67024a(awemeRawAd);
        }
        if (!TextUtils.isEmpty(this.f154479b) && !TextUtils.isEmpty(this.f154478a.getAid())) {
            String aid = this.f154478a.getAid();
            C89219l.m154716b(aid, "");
            C49653t.m93096a(new C49648o(aid, 2, System.currentTimeMillis(), this.f154479b));
            String aid2 = this.f154478a.getAid();
            C89219l.m154716b(aid2, "");
            C49653t.m93096a(new C49648o(aid2, 3, System.currentTimeMillis(), this.f154479b));
        }
        C68930b bVar = new C68930b();
        bVar.mo67838a(new C68928a());
        bVar.mo67839a_(this);
        bVar.mo57616a(this.f154478a, Integer.valueOf(a2));
        if (m122020a(this.f154478a) && (context instanceof ActivityC0945e) && (c = FeedAdServiceImpl.m67808c()) != null && (a = c.mo58875a(this.f154478a.getAwemeRawAd(), this.f154478a.getAid(), new C69069b(this))) != null) {
            a.setCancelable(true);
            a.show(((ActivityC0945e) context).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
        }
    }

    public C69067i(Aweme aweme, String str, String str2) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f154478a = aweme;
        this.f154479b = str;
        this.f154480d = str2;
    }
}
