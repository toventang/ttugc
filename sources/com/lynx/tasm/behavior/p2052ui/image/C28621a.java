package com.lynx.tasm.behavior.p2052ui.image;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28510f;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.utils.C28914a;

/* renamed from: com.lynx.tasm.behavior.ui.image.a */
public class C28621a {
    static {
        Covode.recordClassIndex(34671);
    }

    /* renamed from: a */
    public static String m57207a(Context context, String str) {
        String a;
        if ((context instanceof AbstractC28520j) && !TextUtils.isEmpty(str)) {
            AbstractC28520j a2 = C28914a.m57914a(context);
            if (a2 == null) {
                LLog.m56856a(6, "ImageUrlRedirectUtils", "redirecting url failed due to no context available");
                return str;
            }
            AbstractC28510f fVar = a2.f67061b;
            if (!(fVar == null || (a = m57208a(fVar, str, a2.f67071l)) == null)) {
                return m57210b(a2, a);
            }
        }
        return str;
    }

    /* renamed from: b */
    private static String m57210b(Context context, String str) {
        if (str.startsWith("res:///")) {
            for (int i = 7; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt < '0' || charAt > '9') {
                    int indexOf = str.indexOf(46);
                    if (indexOf < 0) {
                        indexOf = str.length();
                    }
                    return "res:///".concat(String.valueOf(context.getResources().getIdentifier(str.substring(7, indexOf), "drawable", context.getPackageName())));
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    private static String m57208a(AbstractC28510f fVar, String str, String str2) {
        int lastIndexOf;
        TraceEvent.m56864a(0, "Interceptor.shouldRedirectImageUrl");
        String d = fVar.mo14474d(str);
        TraceEvent.m56869b(0, "Interceptor.shouldRedirectImageUrl");
        if (d != null) {
            return d;
        }
        if (TextUtils.isEmpty(str) || !str.startsWith("./") || TextUtils.isEmpty(str2) || (lastIndexOf = str2.lastIndexOf("/")) <= 0) {
            return null;
        }
        String str3 = str2.substring(0, lastIndexOf) + str.substring(1);
        LLog.m56859a("ImageUrlRedirectUtils", "shouldRedirectImageUrl use local image url:".concat(String.valueOf(str3)));
        if (str3.startsWith("http") || str3.startsWith("file://") || str3.startsWith("content://") || str3.startsWith("res://") || str3.startsWith("data:")) {
            return str3;
        }
        if (str3.startsWith("assets:///")) {
            return str3.replace("assets:///", "asset:///");
        }
        if (str3.startsWith("assets://")) {
            return str3.replace("assets://", "asset:///");
        }
        if (str3.startsWith("asset:///")) {
            return str3;
        }
        return "file://".concat(String.valueOf(str3));
    }

    /* renamed from: a */
    public static void m57209a(Context context, String str, float f, float f2, AbstractC28510f.AbstractC28511a aVar) {
        AbstractC28520j a = C28914a.m57914a(context);
        if (a == null) {
            LLog.m56856a(6, "ImageUrlRedirectUtils", "load image failed due to no context available");
            return;
        }
        AbstractC28510f fVar = a.f67061b;
        if (fVar != null) {
            fVar.mo26065a(a, null, str, f, f2, null, aVar);
        } else {
            aVar.mo49016a(null, null);
        }
    }
}
