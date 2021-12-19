package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel;

import androidx.p046f.p047a.AbstractC0924b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.AbstractC54184a;
import javax.p4631a.AbstractC89405a;
import p4560f.p4561a.AbstractC88398aa;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.f */
public final class C54178f implements AbstractC0924b<GiphyViewModel> {

    /* renamed from: a */
    private final AbstractC89405a<AbstractC54184a> f124130a;

    /* renamed from: b */
    private final AbstractC89405a<GiphyAnalytics> f124131b;

    /* renamed from: c */
    private final AbstractC89405a<GiphyViewModel.AbstractC54147a> f124132c;

    /* renamed from: d */
    private final AbstractC89405a<AbstractC88398aa> f124133d;

    static {
        Covode.recordClassIndex(63860);
    }

    /* Return type fixed from 'androidx.lifecycle.ac' to match base method */
    @Override // androidx.p046f.p047a.AbstractC0924b
    /* renamed from: a */
    public final /* synthetic */ GiphyViewModel mo3262a() {
        return new GiphyViewModel(this.f124130a.get(), this.f124131b.get(), this.f124132c.get(), this.f124133d.get());
    }

    C54178f(AbstractC89405a<AbstractC54184a> aVar, AbstractC89405a<GiphyAnalytics> aVar2, AbstractC89405a<GiphyViewModel.AbstractC54147a> aVar3, AbstractC89405a<AbstractC88398aa> aVar4) {
        this.f124130a = aVar;
        this.f124131b = aVar2;
        this.f124132c = aVar3;
        this.f124133d = aVar4;
    }
}
