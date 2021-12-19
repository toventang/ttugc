package com.p2082ss.android.vesdk.filterparam;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.filterparam.VEMultiComposerFilterParam */
public class VEMultiComposerFilterParam extends VEComposerFilterParam {
    static {
        Covode.recordClassIndex(99643);
    }

    @Override // com.p2082ss.android.vesdk.filterparam.VEComposerFilterParam
    public boolean isOverallComposer() {
        return false;
    }

    public VEMultiComposerFilterParam() {
        this.filterName = "multi composer filter";
    }
}
