package com.google.firebase.installations;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2016a.AbstractC27825d;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.n */
public final class C27854n {

    /* renamed from: a */
    public static final long f65427a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    static final Pattern f65428b = Pattern.compile("\\AA[\\w-]{38}\\z");

    C27854n() {
    }

    /* renamed from: a */
    public static long m55757a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    static {
        Covode.recordClassIndex(33443);
    }

    /* renamed from: a */
    public static boolean m55758a(AbstractC27825d dVar) {
        if (!TextUtils.isEmpty(dVar.mo46486c()) && dVar.mo46490f() + dVar.mo46488e() >= m55757a() + f65427a) {
            return false;
        }
        return true;
    }
}
