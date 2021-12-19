package com.p2082ss.android.ugc.aweme.qrcode.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.aweme.base.api.AbstractC34479a;
import com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66390a;
import java.util.concurrent.ExecutionException;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.qrcode.api.QRCodeApi */
public final class QRCodeApi {

    /* renamed from: a */
    static final AbstractC18099f f149268a = C18097a.m33697a(C29736b.f70924e);

    /* renamed from: com.ss.android.ugc.aweme.qrcode.api.QRCodeApi$RealApi */
    interface RealApi {
        static {
            Covode.recordClassIndex(77900);
        }

        @AbstractC89731o(mo144285a = "/aweme/v1/qrcode/info/")
        @AbstractC89721e
        AbstractFutureC27655q<C66390a> getQRCodeInfo(@AbstractC89719c(mo144273a = "schema_type") int i, @AbstractC89719c(mo144273a = "object_id") String str, @AbstractC89719c(mo144273a = "edition_uid") String str2);

        @AbstractC89731o(mo144285a = "/aweme/v1/fancy/qrcode/info/")
        @AbstractC89721e
        AbstractFutureC27655q<C66390a> getQRCodeInfoV2(@AbstractC89719c(mo144273a = "schema_type") int i, @AbstractC89719c(mo144273a = "object_id") String str, @AbstractC89719c(mo144273a = "meta_params") String str2);
    }

    static {
        Covode.recordClassIndex(77899);
    }

    /* renamed from: a */
    public static C66390a m118058a(int i, String str, String str2) {
        try {
            return ((RealApi) f149268a.mo28858a(RealApi.class)).getQRCodeInfoV2(i, str, str2).get();
        } catch (ExecutionException e) {
            throw AbstractC34479a.getCompatibleException(e);
        }
    }
}
