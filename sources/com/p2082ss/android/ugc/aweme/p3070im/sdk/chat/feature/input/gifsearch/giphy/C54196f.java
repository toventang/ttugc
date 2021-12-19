package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54187c;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.f */
public final class C54196f implements AbstractC54184a {

    /* renamed from: a */
    private final GiphyGifApi f124165a;

    static {
        Covode.recordClassIndex(63880);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.AbstractC54184a
    /* renamed from: a */
    public final AbstractC88403ab<C54187c> mo91276a(int i) {
        return this.f124165a.getTrendingGiphy(i);
    }

    public C54196f(GiphyGifApi giphyGifApi) {
        C89219l.m154721d(giphyGifApi, "");
        this.f124165a = giphyGifApi;
    }
}
