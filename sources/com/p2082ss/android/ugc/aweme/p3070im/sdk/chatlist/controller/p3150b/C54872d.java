package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.C56241d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56240c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.EnumC56242e;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.b.d */
public final class C54872d {
    static {
        Covode.recordClassIndex(64591);
    }

    /* renamed from: a */
    public static final C56241d m100475a(int i) {
        if (i == 0) {
            return new C56241d(EnumC56242e.RIGHT_DOT, EnumC56240c.RED, false, 4);
        }
        if (i != 2) {
            return new C56241d(EnumC56242e.RIGHT_DOT, EnumC56240c.GREY, false, 4);
        }
        return new C56241d(EnumC56242e.LEFT_DOT, EnumC56240c.GREY, false, 4);
    }

    /* renamed from: b */
    public static final C56241d m100477b(boolean z, int i) {
        C56241d a = m100476a(z, i);
        if (i != 4) {
            return a;
        }
        return C56241d.m102181a(a, EnumC56242e.RIGHT_DOT);
    }

    /* renamed from: a */
    public static final C56241d m100476a(boolean z, int i) {
        if (i != 0) {
            if (i == 1) {
                return new C56241d(EnumC56242e.RIGHT_DOT, null, false, 6);
            }
            if (i == 2) {
                return new C56241d(EnumC56242e.LEFT_DOT, null, true, 2);
            }
            if (i == 3) {
                return new C56241d(EnumC56242e.RIGHT_DOT, null, true, 2);
            }
            if (i != 4) {
                return new C56241d(null, null, false, 7);
            }
            if (z) {
                return new C56241d(EnumC56242e.RIGHT_DOT, EnumC56240c.BLUE, true);
            }
            return new C56241d(EnumC56242e.RIGHT_NUMBER, EnumC56240c.BLUE, true);
        } else if (z) {
            return new C56241d(EnumC56242e.RIGHT_DOT, null, false, 6);
        } else {
            return new C56241d(EnumC56242e.RIGHT_NUMBER, null, false, 6);
        }
    }
}
