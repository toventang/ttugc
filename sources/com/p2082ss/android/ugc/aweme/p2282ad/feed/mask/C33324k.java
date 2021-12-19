package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.C34606a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38217ae;
import com.p2082ss.android.ugc.aweme.commercialize.uikit.AdRatingView;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.k */
public final class C33324k extends AbstractView$OnClickListenerC33314d {
    static {
        Covode.recordClassIndex(40157);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: c */
    public final void mo59312c() {
        C38217ae nativeCardInfo;
        AwemeRawAd awemeRawAd = this.f79149b.getAwemeRawAd();
        if (awemeRawAd != null && (nativeCardInfo = awemeRawAd.getNativeCardInfo()) != null) {
            View a = mo59308a(this.f79152e, R.layout.afa);
            View findViewById = a.findViewById(R.id.eh);
            C89219l.m154716b(findViewById, "");
            RemoteImageView remoteImageView = (RemoteImageView) findViewById;
            if (TextUtils.isEmpty(nativeCardInfo.imageUrl)) {
                ((C24246a) remoteImageView.getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57456f);
                C34577e.m70598a(remoteImageView, C34606a.m70656a(2131232421));
            } else {
                ((C24246a) remoteImageView.getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57452b);
                C34577e.m70608b(remoteImageView, nativeCardInfo.imageUrl, -1, -1);
            }
            remoteImageView.setOnClickListener(this);
            View findViewById2 = a.findViewById(R.id.g5);
            C89219l.m154716b(findViewById2, "");
            TextView textView = (TextView) findViewById2;
            if (TextUtils.isEmpty(nativeCardInfo.title)) {
                textView.setVisibility(8);
            } else {
                textView.setText(nativeCardInfo.title);
            }
            View findViewById3 = a.findViewById(R.id.en);
            C89219l.m154716b(findViewById3, "");
            TextView textView2 = (TextView) findViewById3;
            if (TextUtils.isEmpty(nativeCardInfo.featureLabel)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(nativeCardInfo.featureLabel);
            }
            ((LinearLayout) a.findViewById(R.id.g6)).setOnClickListener(this);
            View findViewById4 = a.findViewById(R.id.es);
            C89219l.m154716b(findViewById4, "");
            LinearLayout linearLayout = (LinearLayout) findViewById4;
            View findViewById5 = a.findViewById(R.id.fm);
            C89219l.m154716b(findViewById5, "");
            AdRatingView adRatingView = (AdRatingView) findViewById5;
            View findViewById6 = a.findViewById(R.id.d5);
            C89219l.m154716b(findViewById6, "");
            TextView textView3 = (TextView) findViewById6;
            if (nativeCardInfo.feedbackRate < 80) {
                linearLayout.setVisibility(8);
            } else if (nativeCardInfo.feedbackRate < 90) {
                adRatingView.setRatingProgress(4.0f);
                textView3.setText(String.valueOf(nativeCardInfo.feedbackRate) + this.f79148a.getString(R.string.c4m));
            } else if (nativeCardInfo.feedbackRate <= 100) {
                adRatingView.setRatingProgress(5.0f);
                textView3.setText(String.valueOf(nativeCardInfo.feedbackRate) + this.f79148a.getString(R.string.c4m));
            } else {
                adRatingView.setRatingProgress(5.0f);
                textView3.setText("100" + this.f79148a.getString(R.string.c4m));
            }
            linearLayout.setOnClickListener(this);
            View findViewById7 = a.findViewById(R.id.fh);
            C89219l.m154716b(findViewById7, "");
            View findViewById8 = a.findViewById(R.id.fp);
            C89219l.m154716b(findViewById8, "");
            ((TextView) findViewById7).setText(nativeCardInfo.originPrice);
            ((TextView) findViewById8).setText(nativeCardInfo.service);
            ((LinearLayout) a.findViewById(R.id.fi)).setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: a */
    public final void mo59310a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.eh) {
                this.f79150c.mo59294a(19);
            } else if (valueOf.intValue() == R.id.g6) {
                this.f79150c.mo59294a(20);
            } else if (valueOf.intValue() == R.id.es) {
                this.f79150c.mo59294a(13);
            } else if (valueOf.intValue() == R.id.fi) {
                this.f79150c.mo59294a(21);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33324k(LinearLayout linearLayout, C33313c cVar) {
        super(linearLayout, cVar);
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(cVar, "");
    }
}
