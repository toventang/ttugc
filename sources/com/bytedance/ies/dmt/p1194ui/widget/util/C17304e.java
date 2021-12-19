package com.bytedance.ies.dmt.p1194ui.widget.util;

import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.widget.util.e */
public final class C17304e {

    /* renamed from: a */
    public static final C17304e f41575a = new C17304e();

    private C17304e() {
    }

    static {
        Covode.recordClassIndex(19788);
    }

    /* renamed from: a */
    private static String m32038a(int i) {
        if (i == 1) {
            return C17303d.f41567a;
        }
        if (i == 2) {
            return C17303d.f41573g;
        }
        if (i != 3) {
            return null;
        }
        return C17303d.f41568b;
    }

    /* renamed from: b */
    private static C89378p<Float, Float> m32040b(int i) {
        Float valueOf = Float.valueOf(13.0f);
        Float valueOf2 = Float.valueOf(14.0f);
        Float valueOf3 = Float.valueOf(15.0f);
        Float valueOf4 = Float.valueOf(20.0f);
        Float valueOf5 = Float.valueOf(24.0f);
        Float valueOf6 = Float.valueOf(17.0f);
        switch (i) {
            case 1:
                return new C89378p<>(valueOf5, Float.valueOf(28.0f));
            case 2:
                return new C89378p<>(valueOf4, valueOf5);
            case 3:
                return new C89378p<>(valueOf6, valueOf4);
            case 4:
                return new C89378p<>(valueOf3, Float.valueOf(18.0f));
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return new C89378p<>(valueOf2, valueOf6);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return new C89378p<>(valueOf, valueOf6);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return new C89378p<>(Float.valueOf(12.0f), valueOf3);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                return new C89378p<>(Float.valueOf(11.0f), valueOf2);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                return new C89378p<>(Float.valueOf(10.0f), valueOf);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static void m32042c(DmtTextView dmtTextView, int i) {
        C89219l.m154721d(dmtTextView, "");
        String a = m32038a(i);
        if (a != null) {
            dmtTextView.setFontType(a);
        }
    }

    /* renamed from: b */
    public static void m32041b(DmtTextView dmtTextView, int i) {
        C89219l.m154721d(dmtTextView, "");
        if (i > 10 && i < 100) {
            m32039a(dmtTextView, i / 10);
            m32042c(dmtTextView, i % 10);
        }
    }

    /* renamed from: a */
    public static void m32039a(DmtTextView dmtTextView, int i) {
        C89219l.m154721d(dmtTextView, "");
        C89378p<Float, Float> b = m32040b(i);
        if (b != null) {
            dmtTextView.setTextSize(1, b.getFirst().floatValue());
            dmtTextView.setLineHeight((int) C13628n.m24520b(dmtTextView.getContext(), b.getSecond().floatValue()));
        }
    }
}
