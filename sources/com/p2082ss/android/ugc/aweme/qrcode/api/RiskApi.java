package com.p2082ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66393c;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.RiskApi */
public final class RiskApi {

    /* renamed from: a */
    static final AbstractC18099f f149269a = C18097a.m33697a(Api.f79771d);

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.RiskApi$RealApi */
    public interface RealApi {
        static {
            Covode.recordClassIndex(77902);
        }

        @AbstractC22000h(mo35789a = "/aweme/v2/risk/url/")
        AbstractFutureC27655q<C66393c> getRiskUrlModel(@AbstractC22018z(mo35807a = "request_url") String str);
    }

    static {
        Covode.recordClassIndex(77901);
    }

    /* renamed from: a */
    public static C66393c m118059a(String str) {
        try {
            return ((RealApi) f149269a.mo28858a(RealApi.class)).getRiskUrlModel(str).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
