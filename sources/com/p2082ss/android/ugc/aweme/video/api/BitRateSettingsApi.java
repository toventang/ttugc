package com.p2082ss.android.ugc.aweme.video.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.video.api.BitRateSettingsApi */
public final class BitRateSettingsApi {

    /* renamed from: a */
    private static final AbstractC18099f f180353a = C18097a.m33697a(C29736b.f70924e);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.video.api.BitRateSettingsApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(93946);
        }

        @AbstractC89722f(mo144276a = "/aweme/v1/rate/settings/")
        AbstractFutureC27655q<RateSettingsResponse> fetchRateSettings();
    }

    static {
        Covode.recordClassIndex(93945);
    }

    /* renamed from: a */
    public static RateSettingsResponse m139899a() {
        int errorCode;
        try {
            return ((RealApi) f180353a.mo28858a(RealApi.class)).fetchRateSettings().get();
        } catch (ExecutionException e) {
            if ((e.getCause() instanceof C34485a) && ((errorCode = ((C34480a) e.getCause()).getErrorCode()) == 9 || errorCode == 14)) {
                return null;
            }
            throw AbstractC34479a.getCompatibleException(e);
        } catch (IncompatibleClassChangeError e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
