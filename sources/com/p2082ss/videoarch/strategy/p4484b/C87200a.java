package com.p2082ss.videoarch.strategy.p4484b;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.strategy.b.a */
public final class C87200a {

    /* renamed from: a */
    private final String f197444a;

    /* renamed from: b */
    private final AbstractC87202b f197445b;

    /* renamed from: c */
    private final List<Pair<String, String>> f197446c;

    static {
        Covode.recordClassIndex(103003);
    }

    C87200a(C87204d dVar) {
        this.f197444a = dVar.f197463a;
        this.f197445b = dVar.f197464b;
        this.f197446c = dVar.f197465c;
    }

    /* renamed from: a */
    private static String m151226a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final JSONObject mo141066a(String str, Object obj) {
        return new JSONObject(this.f197445b.mo16648a(m151227a(this.f197444a + str, this.f197446c), obj.toString().getBytes("UTF-8"), "application/json; charset=utf-8"));
    }

    /* renamed from: a */
    private static String m151227a(String str, List<Pair<String, String>> list) {
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
            sb.append((String) pair.first).append('=').append(m151226a((String) pair.second, "UTF-8"));
        }
        return sb.toString();
    }
}
