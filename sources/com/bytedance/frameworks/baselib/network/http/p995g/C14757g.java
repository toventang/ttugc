package com.bytedance.frameworks.baselib.network.http.p995g;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.g.g */
public final class C14757g {
    static {
        Covode.recordClassIndex(16854);
    }

    /* renamed from: a */
    public static URI m27060a(String str) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m27061b(str);
            }
        }
    }

    /* renamed from: b */
    public static URI m27061b(String str) {
        if (C13627m.m24498a(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
