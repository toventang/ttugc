package com.p084a.p088b.p090b;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.p084a.p088b.C1878g;
import com.p084a.p088b.p089a.C1863a;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.a.b.b.a */
public final class C1869a {
    static {
        Covode.recordClassIndex(2039);
    }

    /* renamed from: a */
    private static void m6039a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(toast);
        }
        toast.show();
    }

    /* renamed from: a */
    public static final String m6038a(String str) {
        C89219l.m154719c(str, "");
        int a = C89361p.m154885a((CharSequence) str, ":");
        if (a == -1) {
            return str;
        }
        String substring = str.substring(a + 1);
        C89219l.m154709a((Object) substring, "");
        return substring;
    }

    /* renamed from: a */
    public static final boolean m6041a(C1863a aVar) {
        C89219l.m154719c(aVar, "");
        if (aVar instanceof C1863a.C1866c) {
            String str = aVar.f5673a;
            C89219l.m154709a((Object) str, "");
            return Boolean.parseBoolean(str);
        }
        throw new IllegalArgumentException("getBoolean:Drawable unsupported ParamsType type: " + aVar.f5673a);
    }

    /* renamed from: b */
    public static final int m6042b(Context context, C1863a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        if (aVar instanceof C1863a.C1865b) {
            C1863a.C1865b bVar = (C1863a.C1865b) aVar;
            if (C89219l.m154714a((Object) bVar.f5674b, (Object) "drawable") || C89219l.m154714a((Object) bVar.f5674b, (Object) C19386b.f45894a)) {
                String str = aVar.f5673a;
                C89219l.m154709a((Object) str, "");
                return Integer.parseInt(str);
            }
        }
        throw new IllegalArgumentException("getDrawableId:Int unsupported ParamsType type: " + aVar.f5673a);
    }

    /* renamed from: c */
    public static final Drawable m6043c(Context context, C1863a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        if (aVar instanceof C1863a.C1865b) {
            C1863a.C1865b bVar = (C1863a.C1865b) aVar;
            if (C89219l.m154714a((Object) bVar.f5674b, (Object) "drawable") || C89219l.m154714a((Object) bVar.f5674b, (Object) C19386b.f45894a)) {
                Resources resources = context.getResources();
                String str = aVar.f5673a;
                C89219l.m154709a((Object) str, "");
                Drawable drawable = resources.getDrawable(Integer.parseInt(str));
                C89219l.m154709a((Object) drawable, "");
                return drawable;
            }
        }
        throw new IllegalArgumentException("getDrawable:Drawable unsupported ParamsType type: " + aVar.f5673a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        if (r2.equals("dip") != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r2.equals("dp") != false) goto L_0x0057;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float m6037a(android.content.Context r5, com.p084a.p088b.p089a.C1863a r6) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p084a.p088b.p090b.C1869a.m6037a(android.content.Context, com.a.b.a.a):float");
    }

    /* renamed from: d */
    public static final int m6044d(Context context, C1863a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        if (aVar instanceof C1863a.C1866c) {
            String str = aVar.f5673a;
            C89219l.m154709a((Object) str, "");
            if (C89361p.m154874b(str, "#", false)) {
                if (aVar.f5673a.length() >= 7) {
                    return Color.parseColor(aVar.f5673a);
                }
                throw new IllegalArgumentException("color format must be like #FF0000 current is " + aVar.f5673a);
            }
        }
        if (aVar instanceof C1863a.C1865b) {
            C1863a.C1865b bVar = (C1863a.C1865b) aVar;
            if (bVar.f5674b.equals(C19386b.f45894a)) {
                Resources resources = context.getResources();
                String str2 = aVar.f5673a;
                C89219l.m154709a((Object) str2, "");
                return resources.getColor(Integer.parseInt(str2));
            }
            String str3 = bVar.f5674b;
            C89219l.m154709a((Object) str3, "");
            if (C89361p.m154874b(str3, "attr", false)) {
                String str4 = aVar.f5673a;
                C89219l.m154709a((Object) str4, "");
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{Integer.parseInt(str4)});
                int color = obtainStyledAttributes.getColor(0, 0);
                obtainStyledAttributes.recycle();
                return color;
            }
        }
        throw new IllegalArgumentException("getColor:Drawable unsupported ParamsType type: " + aVar.f5673a);
    }

    /* renamed from: a */
    public static final boolean m6040a(Context context, String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        String str3 = str + " unsupported attr: " + str2;
        if (C1878g.f5699a) {
            m6039a(Toast.makeText(context, str3, 1));
        }
        throw new IllegalArgumentException(str3);
    }
}
