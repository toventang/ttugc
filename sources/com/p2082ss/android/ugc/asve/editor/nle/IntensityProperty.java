package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.nle.IntensityProperty */
public final class IntensityProperty {
    private final DoubleValue intensity;

    static {
        Covode.recordClassIndex(37717);
    }

    public IntensityProperty() {
        this((DoubleValue) null, 1, (C89214g) null);
    }

    public static /* synthetic */ IntensityProperty copy$default(IntensityProperty intensityProperty, DoubleValue doubleValue, int i, Object obj) {
        if ((i & 1) != 0) {
            doubleValue = intensityProperty.intensity;
        }
        return intensityProperty.copy(doubleValue);
    }

    public final DoubleValue component1() {
        return this.intensity;
    }

    public final IntensityProperty copy(DoubleValue doubleValue) {
        C89219l.m154721d(doubleValue, "");
        return new IntensityProperty(doubleValue);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof IntensityProperty) && C89219l.m154714a(this.intensity, ((IntensityProperty) obj).intensity);
        }
        return true;
    }

    public final int hashCode() {
        DoubleValue doubleValue = this.intensity;
        if (doubleValue != null) {
            return doubleValue.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "IntensityProperty(intensity=" + this.intensity + ")";
    }

    public final DoubleValue getIntensity() {
        return this.intensity;
    }

    public IntensityProperty(DoubleValue doubleValue) {
        C89219l.m154721d(doubleValue, "");
        this.intensity = doubleValue;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IntensityProperty(NLESegmentFilter nLESegmentFilter, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new DoubleValue((double) nLESegmentFilter.getIntensity()));
        C89219l.m154721d(nLESegmentFilter, "");
        C89219l.m154721d(nLETrackSlot, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntensityProperty(DoubleValue doubleValue, int i, C89214g gVar) {
        this((i & 1) != 0 ? C31084a.f74471a : doubleValue);
    }
}
