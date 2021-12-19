package com.p2082ss.android.ugc.asve.recorder.camera.p2222a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a.a */
public final class C31162a {

    /* renamed from: a */
    public static final String[] f74701a = {"Cepheus", "MI 9 Transparent Edition", "MI 9 ROY", "MI 9"};

    /* renamed from: b */
    public static final String[] f74702b = {"PCCM00", "PCAM00"};

    /* renamed from: c */
    public static final String[] f74703c = new String[0];

    static {
        Covode.recordClassIndex(37807);
    }

    /* renamed from: a */
    public static int m64574a(String str) {
        for (String str2 : f74702b) {
            if (str2.equals(str)) {
                return 2;
            }
        }
        for (String str3 : f74701a) {
            if (str3.equals(str)) {
                return 1;
            }
        }
        return 0;
    }
}
