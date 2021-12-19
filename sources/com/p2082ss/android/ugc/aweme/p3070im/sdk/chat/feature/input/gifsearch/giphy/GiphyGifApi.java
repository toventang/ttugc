package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.p3114a.C54187c;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.GiphyGifApi */
public interface GiphyGifApi {
    static {
        Covode.recordClassIndex(63867);
    }

    @AbstractC89722f(mo144276a = "im/resources/gifs/search/")
    AbstractC88403ab<C54187c> getSearchingGiphy(@AbstractC89736t(mo144292a = "q") String str, @AbstractC89736t(mo144292a = "offset") int i);

    @AbstractC89722f(mo144276a = "im/resources/gifs/trending/")
    AbstractC88403ab<C54187c> getTrendingGiphy(@AbstractC89736t(mo144292a = "offset") int i);
}
