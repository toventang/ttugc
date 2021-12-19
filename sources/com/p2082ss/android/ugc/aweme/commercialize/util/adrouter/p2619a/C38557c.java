package com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.C38554a;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59308d;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.c */
public final class C38557c extends AbstractC38555a {

    /* renamed from: a */
    public static final C38558a f91086a = new C38558a((byte) 0);

    static {
        Covode.recordClassIndex(46089);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.adrouter.a.c$a */
    public static final class C38558a {
        static {
            Covode.recordClassIndex(46090);
        }

        private C38558a() {
        }

        public /* synthetic */ C38558a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private final String m78195e() {
        return mo67076d().f91095c.f91126a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: a */
    public final boolean mo65690a() {
        String str;
        if (TextUtils.isEmpty(m78195e()) || C59308d.m109008c(m78195e())) {
            return false;
        }
        Uri parse = Uri.parse(m78195e());
        C89219l.m154716b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            C89219l.m154716b(str, "");
        } else {
            str = null;
        }
        if (m78194a(str) || C89219l.m154714a((Object) str, (Object) "aweme")) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: b */
    public final boolean mo65691b() {
        String str;
        C38554a.f91082a.mo65603a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "begin", String.valueOf(mo67076d().f91093a.f91102c));
        Uri parse = Uri.parse(m78195e());
        C89219l.m154716b(parse, "");
        String scheme = parse.getScheme();
        if (scheme != null) {
            Objects.requireNonNull(scheme, "null cannot be cast to non-null type java.lang.String");
            str = scheme.toLowerCase();
            C89219l.m154716b(str, "");
        } else {
            str = null;
        }
        if (m78194a(str)) {
            C38554a.f91082a.mo65602a(m78195e());
            C38554a.f91082a.mo65603a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "startAdsAppActivity", String.valueOf(mo67076d().f91093a.f91102c));
            return C38554a.f91082a.mo65605a(mo67075c(), m78195e(), null);
        } else if (C89219l.m154714a((Object) str, (Object) "aweme")) {
            C38554a.f91082a.mo65603a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "open", String.valueOf(mo67076d().f91093a.f91102c));
            return C38554a.f91082a.mo65607b(m78195e());
        } else {
            C38554a.f91082a.mo65603a("ad_lynx_download_LocalOpenUrlHandler_doHandle", (JSONObject) null, "fail", String.valueOf(mo67076d().f91093a.f91102c));
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m78194a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (TextUtils.equals("sslocal", str) || TextUtils.equals("localsdk", str)) {
            return true;
        }
        return false;
    }
}
