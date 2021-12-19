package com.p2082ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.util.h */
public final class C45563h {

    /* renamed from: a */
    public static final int f106105a = C13628n.m24504a(C17867d.m33078a());

    /* renamed from: b */
    public static final int f106106b;

    /* renamed from: c */
    public static float f106107c;

    /* renamed from: d */
    public static float f106108d = C13628n.m24520b(C17867d.m33078a(), 8.0f);

    /* renamed from: e */
    public static int f106109e = ((int) C13628n.m24520b(C17867d.m33078a(), 16.0f));

    /* renamed from: f */
    public static int f106110f = ((int) C13628n.m24520b(C17867d.m33078a(), 8.0f));

    /* renamed from: g */
    public static int f106111g = ((int) C13628n.m24520b(C17867d.m33078a(), 44.0f));

    /* renamed from: h */
    public static final C45563h f106112h = new C45563h();

    /* renamed from: i */
    private static float f106113i;

    /* renamed from: j */
    private static float f106114j;

    private C45563h() {
    }

    /* renamed from: a */
    public static final float m88110a() {
        if (((float) f106105a) / ((float) f106106b) < 0.5f) {
            return f106107c;
        }
        return f106113i;
    }

    static {
        Covode.recordClassIndex(54056);
        int b = C13628n.m24521b(C17867d.m33078a());
        f106106b = b;
        f106107c = ((float) b) * 0.73f;
        f106113i = ((float) b) * 0.86f;
        f106114j = ((float) b) * 0.95f;
    }

    /* renamed from: a */
    public static String m88111a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!C80471gb.m139482a()) {
            return str + '/' + str2;
        }
        return str2 + '/' + str;
    }
}
