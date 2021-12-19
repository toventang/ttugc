package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.b */
public final class C54192b {

    /* renamed from: a */
    static final GiphyGifApi f124161a;

    /* renamed from: b */
    public static final C54192b f124162b = new C54192b();

    private C54192b() {
    }

    static {
        Covode.recordClassIndex(63876);
        Object a = RetrofitFactory.m33635a().mo28817b(C55074a.f126040b).mo28832d().mo28858a(GiphyGifApi.class);
        C89219l.m154716b(a, "");
        f124161a = (GiphyGifApi) a;
    }

    /* renamed from: a */
    public static AbstractC54184a m99455a(C54196f fVar) {
        C89219l.m154721d(fVar, "");
        return new C54197g(fVar);
    }

    /* renamed from: a */
    public static C54196f m99456a(GiphyGifApi giphyGifApi) {
        C89219l.m154721d(giphyGifApi, "");
        return new C54196f(giphyGifApi);
    }
}
