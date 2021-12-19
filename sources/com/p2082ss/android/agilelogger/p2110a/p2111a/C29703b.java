package com.p2082ss.android.agilelogger.p2110a.p2111a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.agilelogger.a.a.b */
public final class C29703b implements AbstractC29702a {
    static {
        Covode.recordClassIndex(36100);
    }

    /* renamed from: a */
    private static String m59876a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split("\n");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append("\n");
            }
            sb.append((char) 9553).append(split[i]);
        }
        return sb.toString();
    }

    @Override // com.p2082ss.android.agilelogger.p2110a.AbstractC29704b
    /* renamed from: a */
    public final /* synthetic */ String mo51950a(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = str;
                i++;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════\n");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(m59876a(strArr2[i2]));
            if (i2 != i - 1) {
                sb.append("\n╟───────────────────────────────────────────────────────────────────────────────────────────────────\n");
            } else {
                sb.append("\n╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}
