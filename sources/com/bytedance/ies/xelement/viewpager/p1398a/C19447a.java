package com.bytedance.ies.xelement.viewpager.p1398a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.viewpager.a.a */
public final class C19447a {

    /* renamed from: a */
    public static final C19447a f46077a = new C19447a();

    private C19447a() {
    }

    static {
        Covode.recordClassIndex(22279);
    }

    /* renamed from: a */
    public static int m36281a(Context context) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        return resources.getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static int m36283a(String str) {
        C89219l.m154719c(str, "");
        if (str.length() <= 7) {
            return Color.parseColor(str);
        }
        int parseColor = Color.parseColor(str);
        return (parseColor << 24) | (parseColor >>> 8);
    }

    /* renamed from: b */
    public static int m36284b(Context context, float f) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        return (int) ((f * ((float) resources.getDisplayMetrics().widthPixels)) / 750.0f);
    }

    /* renamed from: a */
    public static int m36282a(Context context, float f) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }
}
