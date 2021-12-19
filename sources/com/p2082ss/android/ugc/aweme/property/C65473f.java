package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;

/* renamed from: com.ss.android.ugc.aweme.property.f */
public final class C65473f {

    /* renamed from: a */
    public static final C65473f f147668a = new C65473f();

    private C65473f() {
    }

    static {
        Covode.recordClassIndex(76960);
    }

    /* renamed from: a */
    public static final int m117199a() {
        return C16048b.m29633a().mo25412a(true, "auto_play_sound_before_recording", 0);
    }

    /* renamed from: b */
    public static final boolean m117200b() {
        if (m117199a() > 0) {
            return true;
        }
        return false;
    }
}
