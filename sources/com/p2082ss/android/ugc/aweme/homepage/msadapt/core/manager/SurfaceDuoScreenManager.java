package com.p2082ss.android.ugc.aweme.homepage.msadapt.core.manager;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.C52981a;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.core.EnumC52983b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.core.manager.SurfaceDuoScreenManager */
public final class SurfaceDuoScreenManager extends AbstractC52986a {

    /* renamed from: b */
    public static final C52985a f121835b = new C52985a((byte) 0);

    /* renamed from: a */
    public EnumC52983b f121836a;

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.core.manager.SurfaceDuoScreenManager$ScreenModeListenerWrapper */
    public final class ScreenModeListenerWrapper implements AbstractC52987b {
        static {
            Covode.recordClassIndex(62521);
        }
    }

    static {
        Covode.recordClassIndex(62520);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.core.manager.SurfaceDuoScreenManager$a */
    public static final class C52985a {
        static {
            Covode.recordClassIndex(62522);
        }

        private C52985a() {
        }

        public /* synthetic */ C52985a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.homepage.msadapt.core.manager.AbstractC52986a
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        if (C52981a.C52982a.m97914d(activity)) {
            if (this.f121836a != EnumC52983b.DUAL_SCREEN) {
                this.f121836a = EnumC52983b.DUAL_SCREEN;
            }
        } else if (this.f121836a != EnumC52983b.SINGLE_SCREEN) {
            this.f121836a = EnumC52983b.SINGLE_SCREEN;
        }
    }
}
