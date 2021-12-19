package com.bytedance.bdturing.p866f;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.bdturing.C13270e;
import com.bytedance.bdturing.C13285g;
import com.bytedance.common.utility.C13624l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.bdturing.f.b */
public final class C13284b {
    static {
        Covode.recordClassIndex(15246);
    }

    /* renamed from: a */
    public static final int m23893a(Activity activity) {
        if (activity == null) {
            return 0;
        }
        WindowManager windowManager = activity.getWindowManager();
        C89219l.m154709a((Object) windowManager, "");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        C89219l.m154709a((Object) defaultDisplay, "");
        int rotation = defaultDisplay.getRotation();
        C13285g.m23901a("rotation current ".concat(String.valueOf(rotation)));
        int i = 2;
        if (rotation != 0) {
            if (rotation != 1) {
                if (rotation != 2) {
                    if (rotation != 3) {
                        return 0;
                    }
                }
            }
            i = 1;
        }
        C13270e.m23847a(i);
        return i;
    }

    /* renamed from: b */
    public static final String m23898b(Activity activity) {
        if (activity == null) {
            return null;
        }
        Resources resources = activity.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        return new StringBuilder().append(i).append('*').append(displayMetrics.heightPixels).toString();
    }

    /* renamed from: a */
    public static final float m23892a(Context context) {
        C89219l.m154719c(context, "");
        try {
            Method declaredMethod = DisplayMetrics.class.getDeclaredMethod("getDeviceDensity", null);
            C89219l.m154709a((Object) declaredMethod, "");
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke != null) {
                return ((float) ((Integer) invoke).intValue()) / 160.0f;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception unused) {
            Context applicationContext = context.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154709a((Object) applicationContext, "");
            Resources resources = applicationContext.getResources();
            C89219l.m154709a((Object) resources, "");
            return resources.getDisplayMetrics().density;
        }
    }

    /* renamed from: a */
    public static final StringBuilder m23897a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str = null;
            try {
                str = jSONObject.getString(next);
            } catch (Exception e) {
                e.printStackTrace();
            }
            arrayList.add(new Pair(next, str));
        }
        sb.append(C13624l.m24483a(arrayList, "UTF-8"));
        return sb;
    }

    /* renamed from: a */
    public static final StringBuilder m23894a(String str, JSONObject jSONObject) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(jSONObject, "");
        StringBuilder sb = new StringBuilder(str);
        if (C89361p.m154882a((CharSequence) str, '?', 0, false, 6) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            try {
                str2 = jSONObject.getString(next);
            } catch (Exception e) {
                e.printStackTrace();
            }
            arrayList.add(new Pair(next, str2));
        }
        sb.append(C13624l.m24483a(arrayList, "UTF-8"));
        return sb;
    }

    /* renamed from: a */
    public static final StringBuilder m23895a(StringBuilder sb, String str, int i) {
        C89219l.m154719c(sb, "");
        C89219l.m154719c(str, "");
        return m23896a(sb, str, String.valueOf(i));
    }

    /* renamed from: b */
    public static final StringBuilder m23899b(StringBuilder sb, String str, String str2) {
        C89219l.m154719c(sb, "");
        C89219l.m154719c(str, "");
        if (str2 == null) {
            return sb;
        }
        try {
            sb.append(str).append("=").append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            C13285g.m23900a(e);
        }
        return sb;
    }

    /* renamed from: a */
    public static final StringBuilder m23896a(StringBuilder sb, String str, String str2) {
        C89219l.m154719c(sb, "");
        C89219l.m154719c(str, "");
        if (str2 == null) {
            return sb;
        }
        try {
            sb.append("&").append(str).append("=").append(URLEncoder.encode(str2, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            C13285g.m23900a(e);
        }
        return sb;
    }
}
