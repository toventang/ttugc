package com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.helper.C49628k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49684l;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.AbstractC50382f;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.C50345a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareExtService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.l */
public final class C50366l extends AbstractC50367m {

    /* renamed from: a */
    private final SharePackage f116295a;

    static {
        Covode.recordClassIndex(59494);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.masklayer2.p2973a.AbstractC50357e
    /* renamed from: a */
    public final void mo85530a(View view) {
        User user;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        C38231b dislikeInfo;
        User author;
        AwemeRawAd awemeRawAd2;
        ITalentAdRevenueShareService e;
        C89219l.m154721d(view, "");
        ShareExtService shareExtService = C68863ah.f154028b;
        Aweme aweme2 = this.f116296f;
        if (aweme2 == null) {
            C89219l.m154715b();
        }
        AbstractC69693h a = shareExtService.mo109357a(aweme2, this.f116297g, "long_press");
        if (a.mo61923f()) {
            Aweme aweme3 = this.f116296f;
            if (!(aweme3 == null || (awemeRawAd2 = aweme3.getAwemeRawAd()) == null || (e = TalentAdRevenueShareServiceImpl.m77931e()) == null)) {
                C89219l.m154716b(awemeRawAd2, "");
                e.mo67024a(awemeRawAd2);
            }
            C59256u a2 = new C59256u().mo96834a("homepage_hot");
            a2.f135350a = C59256u.EnumC59259c.ITEM;
            a2.f135352b = C59256u.EnumC59257a.DISLIKE;
            C59256u f = a2.mo96749g(this.f116296f);
            Aweme aweme4 = this.f116296f;
            String str = null;
            if (aweme4 != null) {
                user = aweme4.getAuthor();
            } else {
                user = null;
            }
            C59256u a3 = f.mo96832a(user);
            Aweme aweme5 = this.f116296f;
            if (!(aweme5 == null || (author = aweme5.getAuthor()) == null)) {
                str = author.getRequestId();
            }
            a3.mo96841s(str).mo96835b();
            Aweme aweme6 = this.f116296f;
            if (aweme6 == null || !aweme6.isAd() || (aweme = this.f116296f) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
                a.mo61915a(C17867d.m33078a(), this.f116295a);
            } else {
                Activity d = C34729o.m70962d(view);
                C89219l.m154716b(d, "");
                a.mo61915a(d, this.f116295a);
            }
            if (TextUtils.equals(this.f116297g, "homepage_hot") && C49628k.m93081c()) {
                AbstractC81915c.m141874a(new C49684l());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50366l(C50345a aVar, AbstractC50382f fVar) {
        super(aVar, fVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(fVar, "");
        this.f116295a = aVar.f116263a;
    }
}
