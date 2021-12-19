package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.i */
public final class C55071i {

    /* renamed from: a */
    public static final String[] f126030a = new String[0];

    /* renamed from: b */
    public static final C55071i f126031b = new C55071i();

    /* renamed from: c */
    private static final Pattern f126032c;

    private C55071i() {
    }

    static {
        Covode.recordClassIndex(64799);
        Pattern compile = Pattern.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42);
        C89219l.m154716b(compile, "");
        f126032c = compile;
    }

    /* renamed from: a */
    private static String[] m100718a() {
        SettingsManager a = SettingsManager.m29616a();
        String[] strArr = f126030a;
        String[] strArr2 = (String[]) a.mo25397a("tt_dm_sec_domain", String[].class, strArr);
        return strArr2 == null ? strArr : strArr2;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m100715a(SystemContent systemContent) {
        String[] a = m100718a();
        C89219l.m154721d(a, "");
        if (!(systemContent == null || a.length == 0)) {
            if (m100719b(systemContent.getNewTips(), a) || m100719b(systemContent.getTips(), a)) {
                return true;
            }
            SystemContent.Key[] template = systemContent.getTemplate();
            if (template != null) {
                for (SystemContent.Key key : template) {
                    C89219l.m154716b(key, "");
                    if (m100717a(key.getLink(), a)) {
                        return true;
                    }
                }
            }
            SystemContent.Key[] newTemplate = systemContent.getNewTemplate();
            if (newTemplate != null) {
                for (SystemContent.Key key2 : newTemplate) {
                    C89219l.m154716b(key2, "");
                    if (m100717a(key2.getLink(), a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m100714a(UrlModel urlModel, String[] strArr) {
        List<String> urlList;
        C89219l.m154721d(strArr, "");
        if (!(strArr.length == 0 || urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
            Iterator<T> it = urlList.iterator();
            while (it.hasNext()) {
                if (m100717a((String) it.next(), strArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m100719b(String str, String[] strArr) {
        C89219l.m154721d(strArr, "");
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        Iterator a = C89350l.findAll$default(new C89350l(f126032c), str, 0, 2, null).mo2926a();
        while (a.hasNext()) {
            if (m100717a(((AbstractC89345j) a.next()).mo143720b(), strArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m100717a(String str, String[] strArr) {
        String str2;
        C89219l.m154721d(strArr, "");
        boolean z = true;
        if (strArr.length == 0 || str == null || str.length() == 0) {
            return false;
        }
        try {
            String host = new URL(str).getHost();
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                str2 = strArr[i];
                if (C89361p.m154872a(host, str2, true)) {
                    break;
                }
                C89219l.m154716b(host, "");
                if (C89361p.m154876c(host, ".".concat(String.valueOf(str2)), true)) {
                    break;
                }
                i++;
            }
            if (str2 != null) {
                z = false;
            }
            return z;
        } catch (MalformedURLException e) {
            C56244a.m102186a("MessagingSecureDomainSetting", "url is malformed ".concat(String.valueOf(str)), e);
            return false;
        }
    }
}
