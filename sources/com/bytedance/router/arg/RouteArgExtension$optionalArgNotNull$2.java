package com.bytedance.router.arg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* access modifiers changed from: package-private */
public final class RouteArgExtension$optionalArgNotNull$2 extends AbstractC89220m implements AbstractC89171a<Bundle> {
    final /* synthetic */ Activity $this_optionalArgNotNull;

    static {
        Covode.recordClassIndex(25866);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$optionalArgNotNull$2(Activity activity) {
        super(0);
        this.$this_optionalArgNotNull = activity;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Bundle invoke() {
        Intent intent = this.$this_optionalArgNotNull.getIntent();
        if (intent != null) {
            return m41561x95d3e94c(intent);
        }
        return null;
    }

    /* renamed from: com_bytedance_router_arg_RouteArgExtension$optionalArgNotNull$2_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m41561x95d3e94c(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }
}
