package com.p2082ss.android.ugc.aweme.profile.edit.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.api.TwitterApi */
public final class TwitterApi {

    /* renamed from: a */
    private static final AbstractC18099f f144163a = C18097a.m33697a(Api.f79771d);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.edit.api.TwitterApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(74830);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/twitter/bind/")
        @AbstractC89721e
        AbstractFutureC27655q<String> bindTwitter(@AbstractC89719c(mo144273a = "twitter_id") String str, @AbstractC89719c(mo144273a = "twitter_name") String str2, @AbstractC89719c(mo144273a = "access_token") String str3, @AbstractC89719c(mo144273a = "secret_token") String str4);

        @AbstractC89722f(mo144276a = "/aweme/v1/twitter/unbind/")
        AbstractFutureC27655q<String> unbindYouTube();
    }

    static {
        Covode.recordClassIndex(74829);
    }

    /* renamed from: a */
    public static String m115109a() {
        try {
            return ((RealApi) f144163a.mo28858a(RealApi.class)).unbindYouTube().get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static String m115110a(String str, String str2, String str3, String str4) {
        try {
            return ((RealApi) f144163a.mo28858a(RealApi.class)).bindTwitter(str, str2, str3, str4).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
