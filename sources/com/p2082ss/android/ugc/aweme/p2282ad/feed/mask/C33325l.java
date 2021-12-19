package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38217ae;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.l */
public final class C33325l extends AbstractView$OnClickListenerC33314d {
    static {
        Covode.recordClassIndex(40158);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: c */
    public final void mo59312c() {
        C38217ae nativeCardInfo;
        AwemeRawAd awemeRawAd = this.f79149b.getAwemeRawAd();
        if (awemeRawAd != null && (nativeCardInfo = awemeRawAd.getNativeCardInfo()) != null) {
            View findViewById = mo59308a(this.f79152e, R.layout.afb).findViewById(R.id.gc);
            C89219l.m154716b(findViewById, "");
            RemoteImageView remoteImageView = (RemoteImageView) findViewById;
            remoteImageView.setVisibility(0);
            C34577e.m70592a(remoteImageView, nativeCardInfo.image);
            remoteImageView.setOnClickListener(this);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: a */
    public final void mo59310a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null && valueOf.intValue() == R.id.gc) {
            this.f79150c.mo59294a(19);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33325l(LinearLayout linearLayout, C33313c cVar) {
        super(linearLayout, cVar);
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(cVar, "");
    }
}
