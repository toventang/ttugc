package com.bytedance.android.livesdk.toolbar;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.toolbar.h */
public final class C10919h {
    static {
        Covode.recordClassIndex(12527);
    }

    /* renamed from: a */
    public static final Integer m19529a(EnumC5847l lVar) {
        int i;
        C89219l.m154721d(lVar, "");
        switch (C10920i.f26232a[lVar.ordinal()]) {
            case 1:
                if (C3966y.m9672g()) {
                    i = 2131234557;
                } else {
                    i = 2131234558;
                }
                return Integer.valueOf(i);
            case 2:
                return 2131234579;
            case 3:
                return 2131234526;
            case 4:
                return 2131234612;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return 2131234446;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return 2131234670;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static final CharSequence m19530b(EnumC5847l lVar) {
        C89219l.m154721d(lVar, "");
        switch (C10920i.f26233b[lVar.ordinal()]) {
            case 1:
                return C3966y.m9657a((int) R.string.ebm);
            case 2:
                return C3966y.m9657a((int) R.string.ebo);
            case 3:
                return C3966y.m9657a((int) R.string.ebk);
            case 4:
                return C3966y.m9657a((int) R.string.ebf);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return C3966y.m9657a((int) R.string.ebh);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return C3966y.m9657a((int) R.string.ebg);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                return C3966y.m9657a((int) R.string.ebl);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static final Integer m19531c(EnumC5847l lVar) {
        C89219l.m154721d(lVar, "");
        switch (C10920i.f26234c[lVar.ordinal()]) {
            case 1:
                return Integer.valueOf((int) R.layout.bf_);
            case 2:
                return Integer.valueOf((int) R.layout.bf9);
            case 3:
                return Integer.valueOf((int) R.layout.bf5);
            case 4:
                return Integer.valueOf((int) R.layout.bfb);
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                return Integer.valueOf((int) R.layout.bf3);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                return Integer.valueOf((int) R.layout.bf1);
            default:
                return null;
        }
    }
}
