package com.p2082ss.android.ugc.aweme.p2929fe.method;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.utils.C80396el;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.fe.method.l */
public final class C47962l {

    /* renamed from: a */
    public static final C47962l f111080a = new C47962l();

    /* renamed from: b */
    private static final List<String> f111081b = C89070n.m154522b("status_bar_height", StringSet.type, "gravity", "status_bar_color", "radius", "height", "width", "hide_nav_bar", "hide_status", "close_button", "use_page_back", "disable_background", "show_title_bar", "title", "show_title_close", "show_title_share", "show_dim", "mask_alpha", "soft_input_mode", "use_new_container", "disable_back_press", "show_closeall");

    private C47962l() {
    }

    static {
        Covode.recordClassIndex(56672);
    }

    /* renamed from: a */
    public static final boolean m90953a(String str) {
        return m90956c(str);
    }

    /* renamed from: a */
    private static boolean m90952a(Uri uri) {
        if (TextUtils.equals("webcast_webview", uri.getHost()) || m90954b(uri)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m90954b(Uri uri) {
        if (uri == null) {
            return false;
        }
        return TextUtils.equals(uri.getQueryParameter("__live_platform__"), "webcast");
    }

    /* renamed from: b */
    public static final boolean m90955b(String str) {
        if (str == null) {
            return false;
        }
        try {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            if (s.mo95838l().mo95864b()) {
                ILiveOuterService s2 = LiveOuterService.m107269s();
                C89219l.m154716b(s2, "");
                if (s2.mo95830d().mo13004a(C17867d.m33078a(), Uri.parse(str))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            C13468b.m24210a(th);
        }
        if (!C80396el.m139368a(str)) {
            return false;
        }
        ILiveOuterService s3 = LiveOuterService.m107269s();
        C89219l.m154716b(s3, "");
        s3.mo95830d().mo95861f(str);
        return true;
    }

    /* renamed from: c */
    public static final boolean m90956c(String str) {
        if (str == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        if (!m90952a(parse)) {
            return m90955b(str);
        }
        Uri parse2 = Uri.parse(str);
        String decode = URLDecoder.decode(parse2.getQueryParameter("url"));
        StringBuilder sb = new StringBuilder();
        Uri parse3 = Uri.parse(decode);
        Iterator<T> it = f111081b.iterator();
        while (it.hasNext()) {
            m90951a(it.next(), sb, parse3, parse2);
        }
        C47960k.m90947a(decode, sb.toString());
        return true;
    }

    /* renamed from: a */
    private static void m90951a(String str, StringBuilder sb, Uri uri, Uri uri2) {
        String queryParameter;
        String queryParameter2;
        if (uri != null && (queryParameter2 = uri.getQueryParameter(str)) != null) {
            sb.append("&" + str + '=' + queryParameter2);
        } else if (uri2 != null && (queryParameter = uri2.getQueryParameter(str)) != null) {
            sb.append("&" + str + '=' + queryParameter);
        }
    }
}
