package com.p2082ss.android.ugc.aweme.p2282ad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38231b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.dynamic.C33180b;
import com.p2082ss.android.ugc.aweme.p2282ad.dynamic.C33189f;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.View$OnClickListenerC33248b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.C33318f;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.C33199a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.C33266a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.sticker.C33337a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.superlike.C33344a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.C33352a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.FeedAdServiceImpl */
public final class FeedAdServiceImpl implements IFeedAdService {
    static {
        Covode.recordClassIndex(39919);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: b */
    public final AbstractC33207d mo58883b() {
        return C33180b.f78839a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.FeedAdServiceImpl$a */
    public static final class C33107a implements AbstractC33251c {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f78680a;

        static {
            Covode.recordClassIndex(39920);
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c
        /* renamed from: a */
        public final void mo58887a() {
            this.f78680a.invoke();
        }

        C33107a(AbstractC89171a aVar) {
            this.f78680a = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final AbstractC33200b mo58877a() {
        return new C33199a();
    }

    /* renamed from: c */
    public static IFeedAdService m67808c() {
        MethodCollector.m26663i(7594);
        Object a = C81908b.m141854a(IFeedAdService.class, false);
        if (a != null) {
            IFeedAdService iFeedAdService = (IFeedAdService) a;
            MethodCollector.m26664o(7594);
            return iFeedAdService;
        }
        if (C81908b.f183124G == null) {
            synchronized (IFeedAdService.class) {
                try {
                    if (C81908b.f183124G == null) {
                        C81908b.f183124G = new FeedAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7594);
                    throw th;
                }
            }
        }
        FeedAdServiceImpl feedAdServiceImpl = (FeedAdServiceImpl) C81908b.f183124G;
        MethodCollector.m26664o(7594);
        return feedAdServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: b */
    public final AbstractC33321h mo58884b(ViewStub viewStub) {
        return new C33318f(viewStub);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: c */
    public final AbstractC33252e mo58885c(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        return new C33337a(viewStub);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: d */
    public final AbstractC33252e mo58886d(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        return new C33344a(viewStub);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final AbstractC33208e mo58878a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return new C33189f(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final AbstractC33277b mo58879a(View view) {
        C89219l.m154721d(view, "");
        return new C33266a(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final AbstractC33355c mo58880a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        return new C33352a(viewStub);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final DialogInterface$OnCancelListenerC0944d mo58875a(AwemeRawAd awemeRawAd, String str, AbstractC33251c cVar) {
        C89219l.m154721d(cVar, "");
        return View$OnClickListenerC33248b.C33249a.m68174a(awemeRawAd, str, cVar, 0L);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final void mo58881a(Context context, String str, long j) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (AwemeService.m70060b().mo60684b(str) != null) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            C33113b.m67826a().mo58914a((ActivityC0945e) context, str, j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final DialogInterface$OnCancelListenerC0944d mo58876a(AwemeRawAd awemeRawAd, String str, AbstractC33251c cVar, long j) {
        C89219l.m154721d(cVar, "");
        return View$OnClickListenerC33248b.C33249a.m68174a(awemeRawAd, str, cVar, Long.valueOf(j));
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService
    /* renamed from: a */
    public final void mo58882a(Context context, String str, long j, AbstractC89171a<C89391z> aVar) {
        AwemeRawAd awemeRawAd;
        C38231b dislikeInfo;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        Aweme b = AwemeService.m70060b().mo60684b(str);
        if (b == null || !b.isAd() || (awemeRawAd = b.getAwemeRawAd()) == null || (dislikeInfo = awemeRawAd.getDislikeInfo()) == null || dislikeInfo.getEnable() != 1) {
            aVar.invoke();
        } else if (context instanceof ActivityC0945e) {
            DialogInterface$OnCancelListenerC0944d a = mo58876a(b.getAwemeRawAd(), str, new C33107a(aVar), j);
            a.setCancelable(true);
            a.show(((ActivityC0945e) context).getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
        }
    }
}
