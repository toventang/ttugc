package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.nle.editor_jni.NLEMatrix;
import com.bytedance.ies.nle.editor_jni.NLESegmentMask;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.nle.MaskProperty */
public final class MaskProperty {
    private final DoubleValue centerX;
    private final DoubleValue centerY;
    private final DoubleValue feather;
    private final DoubleValue height;
    private final DoubleValue rotation;
    private final DoubleValue roundCorner;
    private final DoubleValue width;

    static {
        Covode.recordClassIndex(37718);
    }

    public MaskProperty() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ MaskProperty copy$default(MaskProperty maskProperty, DoubleValue doubleValue, DoubleValue doubleValue2, DoubleValue doubleValue3, DoubleValue doubleValue4, DoubleValue doubleValue5, DoubleValue doubleValue6, DoubleValue doubleValue7, int i, Object obj) {
        if ((i & 1) != 0) {
            doubleValue = maskProperty.width;
        }
        if ((i & 2) != 0) {
            doubleValue2 = maskProperty.height;
        }
        if ((i & 4) != 0) {
            doubleValue3 = maskProperty.centerX;
        }
        if ((i & 8) != 0) {
            doubleValue4 = maskProperty.centerY;
        }
        if ((i & 16) != 0) {
            doubleValue5 = maskProperty.rotation;
        }
        if ((i & 32) != 0) {
            doubleValue6 = maskProperty.feather;
        }
        if ((i & 64) != 0) {
            doubleValue7 = maskProperty.roundCorner;
        }
        return maskProperty.copy(doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, doubleValue6, doubleValue7);
    }

    public final DoubleValue component1() {
        return this.width;
    }

    public final DoubleValue component2() {
        return this.height;
    }

    public final DoubleValue component3() {
        return this.centerX;
    }

    public final DoubleValue component4() {
        return this.centerY;
    }

    public final DoubleValue component5() {
        return this.rotation;
    }

    public final DoubleValue component6() {
        return this.feather;
    }

    public final DoubleValue component7() {
        return this.roundCorner;
    }

    public final MaskProperty copy(DoubleValue doubleValue, DoubleValue doubleValue2, DoubleValue doubleValue3, DoubleValue doubleValue4, DoubleValue doubleValue5, DoubleValue doubleValue6, DoubleValue doubleValue7) {
        C89219l.m154721d(doubleValue, "");
        C89219l.m154721d(doubleValue2, "");
        C89219l.m154721d(doubleValue3, "");
        C89219l.m154721d(doubleValue4, "");
        C89219l.m154721d(doubleValue5, "");
        C89219l.m154721d(doubleValue6, "");
        C89219l.m154721d(doubleValue7, "");
        return new MaskProperty(doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, doubleValue6, doubleValue7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskProperty)) {
            return false;
        }
        MaskProperty maskProperty = (MaskProperty) obj;
        return C89219l.m154714a(this.width, maskProperty.width) && C89219l.m154714a(this.height, maskProperty.height) && C89219l.m154714a(this.centerX, maskProperty.centerX) && C89219l.m154714a(this.centerY, maskProperty.centerY) && C89219l.m154714a(this.rotation, maskProperty.rotation) && C89219l.m154714a(this.feather, maskProperty.feather) && C89219l.m154714a(this.roundCorner, maskProperty.roundCorner);
    }

    public final int hashCode() {
        DoubleValue doubleValue = this.width;
        int i = 0;
        int hashCode = (doubleValue != null ? doubleValue.hashCode() : 0) * 31;
        DoubleValue doubleValue2 = this.height;
        int hashCode2 = (hashCode + (doubleValue2 != null ? doubleValue2.hashCode() : 0)) * 31;
        DoubleValue doubleValue3 = this.centerX;
        int hashCode3 = (hashCode2 + (doubleValue3 != null ? doubleValue3.hashCode() : 0)) * 31;
        DoubleValue doubleValue4 = this.centerY;
        int hashCode4 = (hashCode3 + (doubleValue4 != null ? doubleValue4.hashCode() : 0)) * 31;
        DoubleValue doubleValue5 = this.rotation;
        int hashCode5 = (hashCode4 + (doubleValue5 != null ? doubleValue5.hashCode() : 0)) * 31;
        DoubleValue doubleValue6 = this.feather;
        int hashCode6 = (hashCode5 + (doubleValue6 != null ? doubleValue6.hashCode() : 0)) * 31;
        DoubleValue doubleValue7 = this.roundCorner;
        if (doubleValue7 != null) {
            i = doubleValue7.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "MaskProperty(width=" + this.width + ", height=" + this.height + ", centerX=" + this.centerX + ", centerY=" + this.centerY + ", rotation=" + this.rotation + ", feather=" + this.feather + ", roundCorner=" + this.roundCorner + ")";
    }

    public final DoubleValue getCenterX() {
        return this.centerX;
    }

    public final DoubleValue getCenterY() {
        return this.centerY;
    }

    public final DoubleValue getFeather() {
        return this.feather;
    }

    public final DoubleValue getHeight() {
        return this.height;
    }

    public final DoubleValue getRotation() {
        return this.rotation;
    }

    public final DoubleValue getRoundCorner() {
        return this.roundCorner;
    }

    public final DoubleValue getWidth() {
        return this.width;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MaskProperty(NLESegmentMask nLESegmentMask, NLETrackSlot nLETrackSlot, NLEMatrix nLEMatrix) {
        this(new DoubleValue((double) nLESegmentMask.getWidth()), new DoubleValue((double) nLESegmentMask.getHeight()), new DoubleValue((double) nLESegmentMask.getCenterX()), new DoubleValue((double) nLESegmentMask.getCenterY()), new DoubleValue((double) nLESegmentMask.getRotation()), new DoubleValue((double) nLESegmentMask.getFeather()), new DoubleValue((double) nLESegmentMask.getRoundCorner()));
        C89219l.m154721d(nLESegmentMask, "");
        C89219l.m154721d(nLETrackSlot, "");
    }

    public MaskProperty(DoubleValue doubleValue, DoubleValue doubleValue2, DoubleValue doubleValue3, DoubleValue doubleValue4, DoubleValue doubleValue5, DoubleValue doubleValue6, DoubleValue doubleValue7) {
        C89219l.m154721d(doubleValue, "");
        C89219l.m154721d(doubleValue2, "");
        C89219l.m154721d(doubleValue3, "");
        C89219l.m154721d(doubleValue4, "");
        C89219l.m154721d(doubleValue5, "");
        C89219l.m154721d(doubleValue6, "");
        C89219l.m154721d(doubleValue7, "");
        this.width = doubleValue;
        this.height = doubleValue2;
        this.centerX = doubleValue3;
        this.centerY = doubleValue4;
        this.rotation = doubleValue5;
        this.feather = doubleValue6;
        this.roundCorner = doubleValue7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MaskProperty(DoubleValue doubleValue, DoubleValue doubleValue2, DoubleValue doubleValue3, DoubleValue doubleValue4, DoubleValue doubleValue5, DoubleValue doubleValue6, DoubleValue doubleValue7, int i, C89214g gVar) {
        this((i & 1) != 0 ? C31084a.f74471a : doubleValue, (i & 2) != 0 ? C31084a.f74471a : doubleValue2, (i & 4) != 0 ? C31084a.f74471a : doubleValue3, (i & 8) != 0 ? C31084a.f74471a : doubleValue4, (i & 16) != 0 ? C31084a.f74471a : doubleValue5, (i & 32) != 0 ? C31084a.f74471a : doubleValue6, (i & 64) != 0 ? C31084a.f74471a : doubleValue7);
    }
}
