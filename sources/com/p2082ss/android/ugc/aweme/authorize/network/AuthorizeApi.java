package com.p2082ss.android.ugc.aweme.authorize.network;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62700d;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62704h;
import com.p2082ss.android.ugc.aweme.openauthorize.p3539a.C62706j;
import p4560f.p4561a.AbstractC88403ab;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89731o;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.authorize.network.AuthorizeApi */
public interface AuthorizeApi {
    static {
        Covode.recordClassIndex(40961);
    }

    @AbstractC89731o(mo144285a = "/passport/open/web/auth/")
    @AbstractC89721e
    AbstractC88403ab<C62704h> confirmBCAuthorize(@AbstractC89719c(mo144273a = "client_key") String str, @AbstractC89719c(mo144273a = "scope") String str2, @AbstractC89719c(mo144273a = "source") String str3, @AbstractC89719c(mo144273a = "redirect_uri") String str4);

    @AbstractC89731o(mo144285a = "/passport/open/confirm_qrcode/")
    @AbstractC89721e
    AbstractC88403ab<C62706j> confirmQroceAuthorize(@AbstractC89719c(mo144273a = "token") String str, @AbstractC89719c(mo144273a = "scopes") String str2);

    @AbstractC89731o(mo144285a = "/aweme/v1/openapi/authorized/page/detail/")
    @AbstractC89721e
    AbstractC88403ab<C62700d> getAuthPageInfo(@AbstractC89719c(mo144273a = "client_key") String str, @AbstractC89719c(mo144273a = "authorized_pattern") int i, @AbstractC89719c(mo144273a = "scope") String str2, @AbstractC89719c(mo144273a = "redirect_uri") String str3, @AbstractC89719c(mo144273a = "bc_params") String str4);

    @AbstractC89722f(mo144276a = "/passport/open/check_login/")
    AbstractC88403ab<Object> getLoginStatus(@AbstractC89736t(mo144292a = "client_key") String str);

    @AbstractC89722f(mo144276a = "/passport/open/scan_qrcode/")
    AbstractC88403ab<C62706j> scanQrcode(@AbstractC89736t(mo144292a = "ticket") String str, @AbstractC89736t(mo144292a = "token") String str2);
}
