package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38554a;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.b */
public final class C38556b extends AbstractC38555a {
    static {
        Covode.recordClassIndex(46088);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: a */
    public final boolean mo65690a() {
        if (TextUtils.isEmpty(mo67076d().f91095c.f91126a)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: b */
    public final boolean mo65691b() {
        String str;
        C38554a.f91082a.mo65603a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "begin", String.valueOf(mo67076d().f91093a.f91102c));
        String str2 = mo67076d().f91095c.f91126a;
        if (TextUtils.isEmpty(str2)) {
            C38554a.f91082a.mo65603a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "empty_url", String.valueOf(mo67076d().f91093a.f91102c));
            return false;
        }
        Uri parse = Uri.parse(str2);
        C89219l.m154716b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Locale locale = Locale.getDefault();
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase(locale);
            C89219l.m154716b(str, "");
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C38554a.f91082a.mo65603a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "empty_schema", String.valueOf(mo67076d().f91093a.f91102c));
            return false;
        } else if (C89219l.m154714a((Object) "market", (Object) str)) {
            C38554a.f91082a.mo65603a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "jumpMarket", String.valueOf(mo67076d().f91093a.f91102c));
            return C38554a.f91082a.mo65604a(mo67075c(), str2, parse, mo67076d());
        } else {
            C38554a.f91082a.mo65603a("ad_lynx_download_JumpMarketHandler_doHandle", (JSONObject) null, "fail", String.valueOf(mo67076d().f91093a.f91102c));
            return false;
        }
    }
}
