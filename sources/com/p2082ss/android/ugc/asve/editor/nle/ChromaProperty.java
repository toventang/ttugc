package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.nle.ChromaProperty */
public final class ChromaProperty {
    private final DoubleValue intensity;
    private final DoubleValue shadow;

    static {
        Covode.recordClassIndex(37714);
    }

    public ChromaProperty() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ChromaProperty copy$default(ChromaProperty chromaProperty, DoubleValue doubleValue, DoubleValue doubleValue2, int i, Object obj) {
        if ((i & 1) != 0) {
            doubleValue = chromaProperty.intensity;
        }
        if ((i & 2) != 0) {
            doubleValue2 = chromaProperty.shadow;
        }
        return chromaProperty.copy(doubleValue, doubleValue2);
    }

    public final DoubleValue component1() {
        return this.intensity;
    }

    public final DoubleValue component2() {
        return this.shadow;
    }

    public final ChromaProperty copy(DoubleValue doubleValue, DoubleValue doubleValue2) {
        C89219l.m154721d(doubleValue, "");
        C89219l.m154721d(doubleValue2, "");
        return new ChromaProperty(doubleValue, doubleValue2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChromaProperty)) {
            return false;
        }
        ChromaProperty chromaProperty = (ChromaProperty) obj;
        return C89219l.m154714a(this.intensity, chromaProperty.intensity) && C89219l.m154714a(this.shadow, chromaProperty.shadow);
    }

    public final int hashCode() {
        DoubleValue doubleValue = this.intensity;
        int i = 0;
        int hashCode = (doubleValue != null ? doubleValue.hashCode() : 0) * 31;
        DoubleValue doubleValue2 = this.shadow;
        if (doubleValue2 != null) {
            i = doubleValue2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ChromaProperty(intensity=" + this.intensity + ", shadow=" + this.shadow + ")";
    }

    public final DoubleValue getIntensity() {
        return this.intensity;
    }

    public final DoubleValue getShadow() {
        return this.shadow;
    }

    public ChromaProperty(DoubleValue doubleValue, DoubleValue doubleValue2) {
        C89219l.m154721d(doubleValue, "");
        C89219l.m154721d(doubleValue2, "");
        this.intensity = doubleValue;
        this.shadow = doubleValue2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ChromaProperty(NLESegmentChromaChannel nLESegmentChromaChannel, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new DoubleValue((double) nLESegmentChromaChannel.getIntensity()), new DoubleValue((double) nLESegmentChromaChannel.getShadow()));
        C89219l.m154721d(nLESegmentChromaChannel, "");
        C89219l.m154721d(nLETrackSlot, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChromaProperty(DoubleValue doubleValue, DoubleValue doubleValue2, int i, C89214g gVar) {
        this((i & 1) != 0 ? C31084a.f74471a : doubleValue, (i & 2) != 0 ? C31084a.f74471a : doubleValue2);
    }
}
