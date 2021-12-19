package com.p2082ss.android.ugc.aweme.photo.p3546a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.photo.a.b */
public final class C62856b {
    static {
        Covode.recordClassIndex(73687);
    }

    /* renamed from: a */
    public static String m113271a(int i) {
        return i != 1 ? i != 2 ? "public" : "friend" : "private";
    }

    /* renamed from: b */
    public static String m113273b(int i) {
        if (i == 0) {
            return "video";
        }
        return null;
    }

    /* renamed from: a */
    public static String m113272a(int i, Object obj) {
        if (i != 0) {
            return null;
        }
        if (AVServiceImpl.m113116a().convertToExposureData(obj).getOrigin() == 1) {
            return "shoot";
        }
        return "upload";
    }
}
