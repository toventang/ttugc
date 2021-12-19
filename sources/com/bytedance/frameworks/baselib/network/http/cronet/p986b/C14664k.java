package com.bytedance.frameworks.baselib.network.http.cronet.p986b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.frameworks.baselib.network.http.cronet.b.k */
public class C14664k {

    /* renamed from: e */
    public static final String f35593e = C14664k.class.getSimpleName();

    /* renamed from: a */
    public String f35594a;

    /* renamed from: b */
    public String f35595b;

    /* renamed from: c */
    public String f35596c = "0";

    /* renamed from: d */
    public String f35597d = "0";

    static {
        Covode.recordClassIndex(16759);
    }

    public C14664k(String str, String str2, String str3, String str4) {
        this.f35594a = str;
        this.f35595b = str2;
        if (!TextUtils.isEmpty(str3)) {
            this.f35596c = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            this.f35597d = str4;
        }
    }
}
