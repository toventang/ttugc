package com.bytedance.router.arg;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* access modifiers changed from: package-private */
public final class RouteArgExtension$requiredArg$4 extends AbstractC89220m implements AbstractC89171a<Bundle> {
    final /* synthetic */ Fragment $this_requiredArg;

    static {
        Covode.recordClassIndex(25872);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteArgExtension$requiredArg$4(Fragment fragment) {
        super(0);
        this.$this_requiredArg = fragment;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Bundle invoke() {
        return this.$this_requiredArg.getArguments();
    }
}
