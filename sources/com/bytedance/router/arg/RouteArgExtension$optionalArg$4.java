package com.bytedance.router.arg;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

final class RouteArgExtension$optionalArg$4 extends AbstractC89220m implements AbstractC89171a<Bundle> {
    final /* synthetic */ Fragment $this_optionalArg;

    static {
        Covode.recordClassIndex(25864);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$optionalArg$4(Fragment fragment) {
        super(0);
        this.$this_optionalArg = fragment;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Bundle invoke() {
        return this.$this_optionalArg.getArguments();
    }
}
