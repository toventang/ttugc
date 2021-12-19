package com.facebook.p1814a.p1816b.p1817a;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;

/* renamed from: com.facebook.a.b.a.d */
public class C23886d {
    static {
        Covode.recordClassIndex(28007);
    }

    /* renamed from: a */
    private static boolean m45148a(TextView textView) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }

    /* renamed from: c */
    private static boolean m45150c(TextView textView) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 96) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m45151d(TextView textView) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 112) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }

    /* renamed from: e */
    private static boolean m45152e(TextView textView) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 3) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m45147a(View view) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            TextView textView = (TextView) view;
            if (m45148a(textView) || m45153f(textView) || m45150c(textView) || m45151d(textView) || m45152e(textView)) {
                return true;
            }
            if (m45149b(textView)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m45149b(TextView textView) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String e = C23888f.m45163e(textView);
            if (e != null) {
                if (e.length() != 0) {
                    return Patterns.EMAIL_ADDRESS.matcher(e).matches();
                }
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m45153f(TextView textView) {
        if (C24677a.m47209a(C23886d.class)) {
            return false;
        }
        try {
            String replaceAll = C23888f.m45163e(textView).replaceAll("\\s", "");
            int length = replaceAll.length();
            if (length >= 12 && length <= 19) {
                int i = 0;
                boolean z = false;
                for (int i2 = length - 1; i2 >= 0; i2--) {
                    char charAt = replaceAll.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        return false;
                    }
                    int i3 = charAt - '0';
                    if (z && (i3 = i3 * 2) > 9) {
                        i3 = (i3 % 10) + 1;
                    }
                    i += i3;
                    z = !z;
                }
                if (i % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23886d.class);
            return false;
        }
    }
}
