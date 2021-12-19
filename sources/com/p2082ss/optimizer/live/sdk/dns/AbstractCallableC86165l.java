package com.p2082ss.optimizer.live.sdk.dns;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.optimizer.live.sdk.dns.l */
public abstract class AbstractCallableC86165l implements Callable<C86164k> {

    /* renamed from: b */
    private static Pattern f192162b;

    /* renamed from: a */
    protected final String f192163a;

    static {
        Covode.recordClassIndex(101307);
    }

    AbstractCallableC86165l(String str) {
        this.f192163a = str;
    }

    /* renamed from: a */
    static boolean m147981a(String str) {
        if (f192162b == null) {
            f192162b = Pattern.compile("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$");
        }
        if (TextUtils.isEmpty(str) || str.length() < 7 || str.length() > 15 || !f192162b.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}
