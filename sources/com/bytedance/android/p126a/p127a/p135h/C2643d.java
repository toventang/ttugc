package com.bytedance.android.p126a.p127a.p135h;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.covode.number.Covode;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.a.a.h.d */
public final class C2643d {
    static {
        Covode.recordClassIndex(3031);
    }

    /* renamed from: a */
    public static String m7649a(String str) {
        try {
            return Uri.parse(str).getHost();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static String m7650a(String str, int i) {
        if (TextUtils.isEmpty(str) || i < 0 || i >= str.length()) {
            return str;
        }
        return str.substring(0, i) + URLEncoder.encode(String.valueOf(str.charAt(i))) + str.substring(i + 1);
    }

    /* renamed from: a */
    public static String m7651a(String str, boolean z) {
        if ((!z && Build.VERSION.SDK_INT > 23) || TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = null;
        boolean z2 = true;
        int i = 0;
        while (z2) {
            try {
                URI.create(str);
            } catch (Exception e) {
                Throwable th = e;
                while (th != null && !(th instanceof URISyntaxException)) {
                    th = th.getCause();
                }
                if (th != null) {
                    int index = ((URISyntaxException) th).getIndex();
                    if (index >= 0) {
                        str = m7650a(str, index);
                    }
                } else {
                    String message = e.getMessage();
                    if (!TextUtils.isEmpty(message)) {
                        if (pattern == null) {
                            pattern = Pattern.compile("at index (\\d+):");
                        }
                        Matcher matcher = pattern.matcher(message);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            int i2 = -1;
                            try {
                                i2 = Integer.parseInt(group);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            if (i2 >= 0) {
                                str = m7650a(str, i2);
                            }
                        }
                    }
                }
                i++;
            }
            z2 = false;
        }
        if (C2628e.m7607d().f7906c.f7919b) {
            C2640a.m7643a(C1764a.m5929a(Locale.getDefault(), "encoded[%d] url: [%s]", new Object[]{Integer.valueOf(i), str}));
        }
        return str;
    }
}
