package com.p4501vk.api.sdk.p4507f;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.vk.api.sdk.f.g */
public final class C87893g {

    /* renamed from: a */
    public static final C87893g f199628a = new C87893g();

    private C87893g() {
    }

    static {
        Covode.recordClassIndex(103903);
    }

    /* renamed from: a */
    public static DisplayMetrics m152896a() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        DisplayMetrics displayMetrics = system.getDisplayMetrics();
        C89219l.m154709a((Object) displayMetrics, "");
        return displayMetrics;
    }

    /* renamed from: a */
    public static final Map<String, String> m152897a(String str) {
        if (str == null) {
            return null;
        }
        List<String> b = C89361p.m154915b(str, new String[]{"&"});
        HashMap hashMap = new HashMap(b.size());
        for (String str2 : b) {
            List c = C89361p.m154921c(str2, new String[]{"="});
            if (c.size() > 1) {
                hashMap.put(c.get(0), c.get(1));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static final boolean m152898a(Context context, String str) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(str, "");
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
