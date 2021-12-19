package com.p2082ss.android.ugc.aweme.p2479ck;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.ck.v */
public final class C36132v {
    static {
        Covode.recordClassIndex(43385);
    }

    /* renamed from: a */
    public static List<String> m73606a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Uri.parse(str).getPathSegments();
    }

    /* renamed from: b */
    public static String m73608b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Uri.parse(str).getQueryParameter(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73607a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 170
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36132v.m73607a(java.lang.String, java.lang.String):boolean");
    }
}
