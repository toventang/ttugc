package com.p2082ss.android.ugc.aweme.p2282ad.feed;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.dialog.AbstractC33251c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a.AbstractC33200b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33207d;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2299g.AbstractC33277b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.IFeedAdService */
public interface IFeedAdService {
    static {
        Covode.recordClassIndex(40019);
    }

    /* renamed from: a */
    DialogInterface$OnCancelListenerC0944d mo58875a(AwemeRawAd awemeRawAd, String str, AbstractC33251c cVar);

    /* renamed from: a */
    DialogInterface$OnCancelListenerC0944d mo58876a(AwemeRawAd awemeRawAd, String str, AbstractC33251c cVar, long j);

    /* renamed from: a */
    AbstractC33200b mo58877a();

    /* renamed from: a */
    AbstractC33208e mo58878a(ViewGroup viewGroup);

    /* renamed from: a */
    AbstractC33277b mo58879a(View view);

    /* renamed from: a */
    AbstractC33355c mo58880a(ViewStub viewStub);

    /* renamed from: a */
    void mo58881a(Context context, String str, long j);

    /* renamed from: a */
    void mo58882a(Context context, String str, long j, AbstractC89171a<C89391z> aVar);

    /* renamed from: b */
    AbstractC33207d mo58883b();

    /* renamed from: b */
    AbstractC33321h mo58884b(ViewStub viewStub);

    /* renamed from: c */
    AbstractC33252e mo58885c(ViewStub viewStub);

    /* renamed from: d */
    AbstractC33252e mo58886d(ViewStub viewStub);
}
