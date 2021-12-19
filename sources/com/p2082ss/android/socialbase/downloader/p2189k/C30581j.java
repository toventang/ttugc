package com.p2082ss.android.socialbase.downloader.p2189k;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.k.j */
public final class C30581j {
    static {
        Covode.recordClassIndex(37109);
    }

    /* renamed from: a */
    public static StringBuilder m62697a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < i - 1) {
                sb.append("?,");
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    /* renamed from: b */
    public static StringBuilder m62700b(StringBuilder sb, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            sb.append('\"').append(strArr[i]).append('\"');
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m62699a(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append('\"').append(strArr[i]).append('\"');
            if (i < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    /* renamed from: a */
    public static StringBuilder m62698a(StringBuilder sb, String str, String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            sb.append(str).append(".\"").append(strArr[i]).append('\"');
            sb.append("=?");
            if (i < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }
}
