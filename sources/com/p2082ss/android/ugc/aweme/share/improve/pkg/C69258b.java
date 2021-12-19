package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.b */
public final class C69258b extends C69257a {

    /* renamed from: a */
    public final C11666c f154806a;

    static {
        Covode.recordClassIndex(81588);
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.pkg.C69257a, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        return R.raw.icon_2pt_broken_heart;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.b$a */
    public static final class C69259a implements AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ C69258b f154807a;

        static {
            Covode.recordClassIndex(81589);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c
        /* renamed from: a */
        public final void mo58887a() {
            AbstractC11846d a = C11755f.m20713a();
            if (a != null) {
                a.mo13017b(this.f154807a.f154806a);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69259a(C69258b bVar) {
            this.f154807a = bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69258b(C11666c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
        this.f154806a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.share.improve.pkg.C69257a, com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        AwemeRawAd awemeRawAd;
        C38231b dislikeInfo;
        IFeedAdService c;
        DialogInterface$OnCancelListenerC0944d a;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        Aweme b = AwemeService.m70060b().mo60684b(this.f154806a.f27806M);
        if (b == null || !b.isAd() || (awemeRawAd = b.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
            C11666c.AbstractC11668b bVar = this.f154806a.f27810Q;
            if (bVar != null) {
                bVar.mo14244a();
                return;
            }
            AbstractC11846d a2 = C11755f.m20713a();
            if (a2 != null) {
                a2.mo12998a(this.f154806a);
            }
        } else if ((C69124b.m122223a(context) instanceof ActivityC0945e) && (c = FeedAdServiceImpl.m67808c()) != null && (a = c.mo58876a(b.getAwemeRawAd(), b.getAid(), new C69259a(this), this.f154806a.f27813c)) != null) {
            a.setCancelable(true);
            Activity a3 = C69124b.m122223a(context);
            Objects.requireNonNull(a3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            a.show(((ActivityC0945e) a3).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
        }
    }
}
