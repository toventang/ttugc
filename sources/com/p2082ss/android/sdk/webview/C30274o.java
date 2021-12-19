package com.p2082ss.android.sdk.webview;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.sdk.webview.o */
public final class C30274o {

    /* renamed from: a */
    public final String f72214a;

    /* renamed from: b */
    public final String f72215b;

    /* renamed from: c */
    public String f72216c;

    /* renamed from: d */
    public long f72217d;

    /* renamed from: e */
    public final List<String> f72218e = new ArrayList();

    /* renamed from: f */
    public final List<String> f72219f = new ArrayList();

    /* renamed from: g */
    public final List<String> f72220g = new ArrayList();

    static {
        Covode.recordClassIndex(36786);
    }

    /* renamed from: a */
    public static String m61263a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        return str + "_" + str2;
    }

    public C30274o(String str, String str2, String str3) {
        this.f72214a = str2 == null ? "" : str2;
        this.f72215b = str3 == null ? "" : str3;
        this.f72216c = str == null ? "" : str;
    }
}
