package com.p2082ss.optimizer.live.sdk.p4400a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.ss.optimizer.live.sdk.a.a */
public final class C86123a {

    /* renamed from: a */
    public final String f192031a;

    /* renamed from: b */
    public final AbstractC86125b f192032b;

    /* renamed from: c */
    public final List<Pair<String, String>> f192033c;

    static {
        Covode.recordClassIndex(101264);
    }

    C86123a(C86126c cVar) {
        this.f192031a = cVar.f192042b;
        this.f192032b = cVar.f192043c;
        this.f192033c = cVar.f192044d;
    }

    /* renamed from: a */
    private static String m147919a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m147920a(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) >= 0) {
            sb.append("&");
        } else if (list.size() > 0) {
            sb.append("?");
        }
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("&");
            }
            Pair<String, String> pair = list.get(i);
            sb.append((String) pair.first).append('=').append(m147919a((String) pair.second, "UTF-8"));
        }
        return sb.toString();
    }
}
