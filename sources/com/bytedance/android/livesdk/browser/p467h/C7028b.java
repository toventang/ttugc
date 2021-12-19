package com.bytedance.android.livesdk.browser.p467h;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p522f.C8468c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.h.b */
public final class C7028b implements AbstractC7027a {
    static {
        Covode.recordClassIndex(7767);
    }

    @Override // com.bytedance.android.livesdk.browser.p467h.AbstractC7027a
    /* renamed from: a */
    public final boolean mo13330a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("market://details?id=") || str.startsWith("https://play.google.com")) {
            return C8468c.m16674a(str);
        }
        return false;
    }
}
