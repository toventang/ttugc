package com.p2082ss.android.ugc.asve.recorder.reaction.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.model.c */
public final class C31231c extends AbstractC31232d {
    static {
        Covode.recordClassIndex(37878);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.model.AbstractC31229a
    public final int convertDpToWidth(int i) {
        return (int) ((((float) (i + 4)) / 375.0f) * ((float) this.outputVideoWidth));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.model.AbstractC31229a
    public final int convertWidthToDp(int i) {
        return (int) (((((float) i) / ((float) this.outputVideoWidth)) * 375.0f) - 4.0f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.model.AbstractC31229a
    public final int convertDpToHeight(int i) {
        double d = (double) ((((float) i) / 375.0f) * ((float) this.outputVideoWidth));
        double d2 = (double) this.outputVideoWidth;
        Double.isNaN(d2);
        Double.isNaN(d);
        return (int) (d + (d2 * 0.010666666666666666d));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.reaction.model.AbstractC31229a
    public final int convertHeightToDp(int i) {
        double d = (double) i;
        double d2 = (double) this.outputVideoWidth;
        Double.isNaN(d2);
        Double.isNaN(d);
        double d3 = (double) this.outputVideoWidth;
        Double.isNaN(d3);
        return (int) (((d - (d2 * 0.010666666666666666d)) / d3) * 375.0d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31231c(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        super(str, false, i, i2, i3, i4, i5, i6);
        C89219l.m154721d(str, "");
    }
}
