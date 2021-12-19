package com.bytedance.router.arg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

final class RouteArgExtension$optionalArg$2 extends AbstractC89220m implements AbstractC89171a<Bundle> {
    final /* synthetic */ Activity $this_optionalArg;

    static {
        Covode.recordClassIndex(25862);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$optionalArg$2(Activity activity) {
        super(0);
        this.$this_optionalArg = activity;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Bundle invoke() {
        Intent intent = this.$this_optionalArg.getIntent();
        if (intent != null) {
            return m41560x534f85d8(intent);
        }
        return null;
    }

    /* renamed from: com_bytedance_router_arg_RouteArgExtension$optionalArg$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m41560x534f85d8(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
