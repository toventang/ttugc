package com.p2082ss.android.ugc.aweme.shortvideo.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi */
public final class MusicChoicesApi {

    /* renamed from: a */
    static AbstractC18099f f156064a = C18097a.m33697a(Api.f79771d);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.api.MusicChoicesApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(82246);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/commerce/music/choices/")
        AbstractFutureC27655q<MusicList> getCommerceMusicList();

        @AbstractC89722f(mo144276a = "/aweme/v1/music/choices/")
        AbstractFutureC27655q<MusicList> getMusicList();
    }

    static {
        Covode.recordClassIndex(82245);
    }

    /* renamed from: a */
    public static MusicList m123400a() {
        try {
            if (CommerceMediaServiceImpl.m77578f().mo66513b()) {
                return ((RealApi) f156064a.mo28858a(RealApi.class)).getCommerceMusicList().get();
            }
            return ((RealApi) f156064a.mo28858a(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
