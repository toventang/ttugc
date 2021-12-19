package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.EnumC34857g;
import com.p2082ss.android.ugc.playerkit.model.C84199c;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.t */
public final class C74669t {
    static {
        Covode.recordClassIndex(87492);
    }

    /* renamed from: a */
    static EnumC34857g m131130a() {
        if (C84199c.f187979a.getBitrateModelThreshold() == -1.0d) {
            return EnumC34857g.SHIFT;
        }
        return EnumC34857g.INTELLIGENT;
    }
}
