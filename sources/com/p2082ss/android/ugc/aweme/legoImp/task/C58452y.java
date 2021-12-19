package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80261bq;
import java.util.Objects;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.y */
public final class C58452y {

    /* renamed from: a */
    public static final C58452y f133072a = new C58452y();

    /* renamed from: b */
    private static Keva f133073b;

    private C58452y() {
    }

    static {
        Covode.recordClassIndex(68716);
    }

    /* renamed from: a */
    public static final String m107035a() {
        String str;
        String str2;
        if (f133073b == null) {
            f133073b = Keva.getRepo("PosterSR");
        }
        Keva keva = f133073b;
        String str3 = null;
        if (keva != null) {
            str = keva.getString("cpu_model", null);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String c = C80261bq.m139126c();
        if (c != null) {
            Objects.requireNonNull(c, "null cannot be cast to non-null type kotlin.CharSequence");
            str2 = C89361p.m154910b((CharSequence) c).toString();
        } else {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = Build.HARDWARE;
        }
        if (str2 != null) {
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
            str3 = C89361p.m154910b((CharSequence) str2).toString();
        }
        C51423a.m95791b(4, "cacheCpuModel", "not use cacheCpuModel:".concat(String.valueOf(str3)));
        Keva keva2 = f133073b;
        if (keva2 != null) {
            keva2.storeString("cpu_model", str3);
        }
        return str3;
    }
}
