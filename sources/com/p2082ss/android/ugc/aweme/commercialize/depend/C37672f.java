package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.C34789bd;
import com.p2082ss.android.ugc.aweme.commerce.model.C37513b;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38767w;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.p2624a.C38665a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50543k;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.f */
public final class C37672f implements AbstractC33253a {
    static {
        Covode.recordClassIndex(45105);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a
    /* renamed from: a */
    public final boolean mo59212a(Context context) {
        if (C34789bd.m71023a(context) != 2) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a
    /* renamed from: a */
    public final void mo59211a(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null) {
            C38164aj.m77369a("play", awemeRawAd.getPlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C37673a(awemeRawAd));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.f$a */
    static final class C37673a extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ AwemeRawAd f89041a;

        static {
            Covode.recordClassIndex(45106);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37673a(AwemeRawAd awemeRawAd) {
            super(2);
            this.f89041a = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66498b(this.f89041a);
            } else {
                a = bVar2.mo66489a(this.f89041a);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a
    /* renamed from: a */
    public final void mo59210a(Context context, Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (context != null && aweme.getActivityPendant() != null) {
            C37513b activityPendant = aweme.getActivityPendant();
            if ((TextUtils.isEmpty(activityPendant.getJumpOpenUrl()) || !AbstractC38757n.m78643a(context, activityPendant.getJumpOpenUrl(), false)) && !TextUtils.isEmpty(activityPendant.getJumpWebUrl())) {
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                if (awemeRawAd != null) {
                    AbstractC38757n.m78642a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, C50543k.m94758a(awemeRawAd), new C38665a.C38666a(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getPackageName(), awemeRawAd.getAppName(), awemeRawAd.getType(), (byte) 0));
                    return;
                }
                AbstractC38757n.m78641a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a
    /* renamed from: b */
    public final boolean mo59214b(Context context, Aweme aweme) {
        boolean z;
        C89219l.m154721d(aweme, "");
        if (context == null || aweme == null || aweme.getSpecialSticker() == null) {
            return false;
        }
        String openUrl = aweme.getSpecialSticker().getOpenUrl();
        if (!TextUtils.isEmpty(openUrl)) {
            return C38767w.m78643a(context, openUrl, false);
        }
        String linkUrl = aweme.getSpecialSticker().getLinkUrl();
        if (C37699a.m76314s(aweme)) {
            z = C50543k.m94758a(aweme.getAwemeRawAd());
        } else {
            z = true;
        }
        return AbstractC38757n.m78641a(context, linkUrl, aweme.getSpecialSticker().getTitle(), false, null, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2296e.AbstractC33253a
    /* renamed from: a */
    public final boolean mo59213a(Context context, Aweme aweme, AbstractC38029b bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(bVar, "");
        return C38767w.m78666a(context, aweme, 9, bVar);
    }
}
