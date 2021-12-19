package com.bytedance.router.arg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

final class RouteArgExtension$navArg$1 extends AbstractC89220m implements AbstractC89171a<Bundle> {
    final /* synthetic */ Activity $this_navArg;

    static {
        Covode.recordClassIndex(25857);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$navArg$1(Activity activity) {
        super(0);
        this.$this_navArg = activity;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Bundle invoke() {
        Intent intent = this.$this_navArg.getIntent();
        if (intent != null) {
            return m41558xd1d297de(intent);
        }
        return null;
    }

    /* renamed from: com_bytedance_router_arg_RouteArgExtension$navArg$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m41558xd1d297de(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
