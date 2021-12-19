package com.bytedance.android.livesdk.container.util;

import android.graphics.Typeface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.text.C28573r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.container.util.e */
public final class C8306e {

    /* renamed from: a */
    public static final C8306e f20577a = new C8306e();

    private C8306e() {
    }

    static {
        Covode.recordClassIndex(9143);
    }

    /* renamed from: com.bytedance.android.livesdk.container.util.e$a */
    public static final class C8307a implements C28573r.AbstractC28574a {

        /* renamed from: a */
        public static final C8307a f20578a = new C8307a();

        static {
            Covode.recordClassIndex(9144);
        }

        C8307a() {
        }

        @Override // com.lynx.tasm.behavior.shadow.text.C28573r.AbstractC28574a
        /* renamed from: a */
        public final Typeface mo14647a(String str, int i) {
            if (C89219l.m154714a((Object) str, (Object) "live_font")) {
                return ((IHostApp) C6193a.m13435a(IHostApp.class)).getHostTypeface(i);
            }
            return null;
        }
    }
}
