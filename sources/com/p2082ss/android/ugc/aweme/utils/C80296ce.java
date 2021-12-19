package com.p2082ss.android.ugc.aweme.utils;

import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.C33417k;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.vesdk.VESafeAreaParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.ce */
public final class C80296ce {

    /* renamed from: a */
    public static final C80296ce f179817a = new C80296ce();

    /* renamed from: b */
    private static final float f179818b = C84912r.m145930a(C40963b.m82473a(), 28.0f);

    /* renamed from: c */
    private static final float f179819c = (C84912r.m145930a(C40963b.m82473a(), 31.5f) + ((float) C40979n.m82503a()));

    /* renamed from: d */
    private static final float f179820d = C84912r.m145930a(C40963b.m82473a(), 100.0f);

    /* renamed from: e */
    private static final float f179821e = C84912r.m145930a(C40963b.m82473a(), 40.0f);

    /* renamed from: f */
    private static final float f179822f = C84912r.m145930a(C40963b.m82473a(), 33.0f);

    private C80296ce() {
    }

    static {
        Covode.recordClassIndex(93564);
    }

    /* renamed from: a */
    public static VESafeAreaParams[] m139203a(ViewGroup.MarginLayoutParams marginLayoutParams, Window window, boolean z) {
        float f;
        C89219l.m154721d(marginLayoutParams, "");
        C89219l.m154721d(window, "");
        int a = C33417k.m68524a(C40963b.m82473a(), window);
        float max = Math.max(((((float) (marginLayoutParams.width - C40979n.m82507b(C40963b.m82473a()))) * 1.0f) / 2.0f) / ((float) marginLayoutParams.width), 0.0f);
        float max2 = ((float) Math.max(a - marginLayoutParams.topMargin, 0)) / ((float) marginLayoutParams.height);
        float max3 = Math.max(((((float) (marginLayoutParams.width + C40979n.m82507b(C40963b.m82473a()))) * 1.0f) / 2.0f) / ((float) marginLayoutParams.width), 0.0f);
        VESafeAreaParams vESafeAreaParams = new VESafeAreaParams();
        vESafeAreaParams.safeType = 0;
        vESafeAreaParams.left = max;
        vESafeAreaParams.top = max2;
        vESafeAreaParams.right = max3;
        vESafeAreaParams.bottom = 1.0f;
        float max4 = Math.max(Math.max(f179818b + f179819c, (float) a) - ((float) marginLayoutParams.topMargin), 0.0f) / ((float) marginLayoutParams.height);
        if (z) {
            f = f179821e + f179822f;
        } else {
            f = f179821e;
        }
        float min = Math.min(1.0f, (((((float) (C40979n.m82509d(C40963b.m82473a()) - C40979n.m82506b())) - f179820d) - f) - ((float) marginLayoutParams.topMargin)) / ((float) marginLayoutParams.height));
        VESafeAreaParams vESafeAreaParams2 = new VESafeAreaParams();
        vESafeAreaParams2.safeType = 1;
        vESafeAreaParams2.left = max;
        vESafeAreaParams2.top = max4;
        vESafeAreaParams2.right = max3;
        vESafeAreaParams2.bottom = min;
        return new VESafeAreaParams[]{vESafeAreaParams, vESafeAreaParams2};
    }
}
