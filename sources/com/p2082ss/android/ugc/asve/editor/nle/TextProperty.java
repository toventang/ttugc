package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.nle.TextProperty */
public final class TextProperty {
    private final FloatArrayValue backgroundColor;
    private FloatArrayValue boundingBoxWithoutRotate;
    private final FloatArrayValue outlineColor;
    private final DoubleValue outlineWidth;
    private final FloatArrayValue position;
    private final DoubleValue rotation;
    private final FloatArrayValue scale;
    private final FloatArrayValue shadowColor;
    private final FloatArrayValue shadowOffset;
    private final DoubleValue shadowSmoothing;
    private final FloatArrayValue textColor;

    static {
        Covode.recordClassIndex(37720);
    }

    public TextProperty() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public static /* synthetic */ TextProperty copy$default(TextProperty textProperty, FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, FloatArrayValue floatArrayValue4, FloatArrayValue floatArrayValue5, DoubleValue doubleValue2, FloatArrayValue floatArrayValue6, DoubleValue doubleValue3, FloatArrayValue floatArrayValue7, FloatArrayValue floatArrayValue8, int i, Object obj) {
        if ((i & 1) != 0) {
            floatArrayValue = textProperty.position;
        }
        if ((i & 2) != 0) {
            floatArrayValue2 = textProperty.scale;
        }
        if ((i & 4) != 0) {
            doubleValue = textProperty.rotation;
        }
        if ((i & 8) != 0) {
            floatArrayValue3 = textProperty.textColor;
        }
        if ((i & 16) != 0) {
            floatArrayValue4 = textProperty.backgroundColor;
        }
        if ((i & 32) != 0) {
            floatArrayValue5 = textProperty.shadowColor;
        }
        if ((i & 64) != 0) {
            doubleValue2 = textProperty.shadowSmoothing;
        }
        if ((i & 128) != 0) {
            floatArrayValue6 = textProperty.shadowOffset;
        }
        if ((i & 256) != 0) {
            doubleValue3 = textProperty.outlineWidth;
        }
        if ((i & 512) != 0) {
            floatArrayValue7 = textProperty.outlineColor;
        }
        if ((i & 1024) != 0) {
            floatArrayValue8 = textProperty.boundingBoxWithoutRotate;
        }
        return textProperty.copy(floatArrayValue, floatArrayValue2, doubleValue, floatArrayValue3, floatArrayValue4, floatArrayValue5, doubleValue2, floatArrayValue6, doubleValue3, floatArrayValue7, floatArrayValue8);
    }

    public final FloatArrayValue component1() {
        return this.position;
    }

    public final FloatArrayValue component10() {
        return this.outlineColor;
    }

    public final FloatArrayValue component11() {
        return this.boundingBoxWithoutRotate;
    }

    public final FloatArrayValue component2() {
        return this.scale;
    }

    public final DoubleValue component3() {
        return this.rotation;
    }

    public final FloatArrayValue component4() {
        return this.textColor;
    }

    public final FloatArrayValue component5() {
        return this.backgroundColor;
    }

    public final FloatArrayValue component6() {
        return this.shadowColor;
    }

    public final DoubleValue component7() {
        return this.shadowSmoothing;
    }

    public final FloatArrayValue component8() {
        return this.shadowOffset;
    }

    public final DoubleValue component9() {
        return this.outlineWidth;
    }

    public final TextProperty copy(FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, FloatArrayValue floatArrayValue4, FloatArrayValue floatArrayValue5, DoubleValue doubleValue2, FloatArrayValue floatArrayValue6, DoubleValue doubleValue3, FloatArrayValue floatArrayValue7, FloatArrayValue floatArrayValue8) {
        C89219l.m154721d(floatArrayValue, "");
        C89219l.m154721d(floatArrayValue2, "");
        C89219l.m154721d(doubleValue, "");
        C89219l.m154721d(floatArrayValue3, "");
        C89219l.m154721d(floatArrayValue4, "");
        C89219l.m154721d(floatArrayValue5, "");
        C89219l.m154721d(doubleValue2, "");
        C89219l.m154721d(floatArrayValue6, "");
        C89219l.m154721d(doubleValue3, "");
        C89219l.m154721d(floatArrayValue7, "");
        C89219l.m154721d(floatArrayValue8, "");
        return new TextProperty(floatArrayValue, floatArrayValue2, doubleValue, floatArrayValue3, floatArrayValue4, floatArrayValue5, doubleValue2, floatArrayValue6, doubleValue3, floatArrayValue7, floatArrayValue8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextProperty)) {
            return false;
        }
        TextProperty textProperty = (TextProperty) obj;
        return C89219l.m154714a(this.position, textProperty.position) && C89219l.m154714a(this.scale, textProperty.scale) && C89219l.m154714a(this.rotation, textProperty.rotation) && C89219l.m154714a(this.textColor, textProperty.textColor) && C89219l.m154714a(this.backgroundColor, textProperty.backgroundColor) && C89219l.m154714a(this.shadowColor, textProperty.shadowColor) && C89219l.m154714a(this.shadowSmoothing, textProperty.shadowSmoothing) && C89219l.m154714a(this.shadowOffset, textProperty.shadowOffset) && C89219l.m154714a(this.outlineWidth, textProperty.outlineWidth) && C89219l.m154714a(this.outlineColor, textProperty.outlineColor) && C89219l.m154714a(this.boundingBoxWithoutRotate, textProperty.boundingBoxWithoutRotate);
    }

    public final int hashCode() {
        FloatArrayValue floatArrayValue = this.position;
        int i = 0;
        int hashCode = (floatArrayValue != null ? floatArrayValue.hashCode() : 0) * 31;
        FloatArrayValue floatArrayValue2 = this.scale;
        int hashCode2 = (hashCode + (floatArrayValue2 != null ? floatArrayValue2.hashCode() : 0)) * 31;
        DoubleValue doubleValue = this.rotation;
        int hashCode3 = (hashCode2 + (doubleValue != null ? doubleValue.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue3 = this.textColor;
        int hashCode4 = (hashCode3 + (floatArrayValue3 != null ? floatArrayValue3.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue4 = this.backgroundColor;
        int hashCode5 = (hashCode4 + (floatArrayValue4 != null ? floatArrayValue4.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue5 = this.shadowColor;
        int hashCode6 = (hashCode5 + (floatArrayValue5 != null ? floatArrayValue5.hashCode() : 0)) * 31;
        DoubleValue doubleValue2 = this.shadowSmoothing;
        int hashCode7 = (hashCode6 + (doubleValue2 != null ? doubleValue2.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue6 = this.shadowOffset;
        int hashCode8 = (hashCode7 + (floatArrayValue6 != null ? floatArrayValue6.hashCode() : 0)) * 31;
        DoubleValue doubleValue3 = this.outlineWidth;
        int hashCode9 = (hashCode8 + (doubleValue3 != null ? doubleValue3.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue7 = this.outlineColor;
        int hashCode10 = (hashCode9 + (floatArrayValue7 != null ? floatArrayValue7.hashCode() : 0)) * 31;
        FloatArrayValue floatArrayValue8 = this.boundingBoxWithoutRotate;
        if (floatArrayValue8 != null) {
            i = floatArrayValue8.hashCode();
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "TextProperty(position=" + this.position + ", scale=" + this.scale + ", rotation=" + this.rotation + ", textColor=" + this.textColor + ", backgroundColor=" + this.backgroundColor + ", shadowColor=" + this.shadowColor + ", shadowSmoothing=" + this.shadowSmoothing + ", shadowOffset=" + this.shadowOffset + ", outlineWidth=" + this.outlineWidth + ", outlineColor=" + this.outlineColor + ", boundingBoxWithoutRotate=" + this.boundingBoxWithoutRotate + ")";
    }

    public final FloatArrayValue getBackgroundColor() {
        return this.backgroundColor;
    }

    public final FloatArrayValue getBoundingBoxWithoutRotate() {
        return this.boundingBoxWithoutRotate;
    }

    public final FloatArrayValue getOutlineColor() {
        return this.outlineColor;
    }

    public final DoubleValue getOutlineWidth() {
        return this.outlineWidth;
    }

    public final FloatArrayValue getPosition() {
        return this.position;
    }

    public final DoubleValue getRotation() {
        return this.rotation;
    }

    public final FloatArrayValue getScale() {
        return this.scale;
    }

    public final FloatArrayValue getShadowColor() {
        return this.shadowColor;
    }

    public final FloatArrayValue getShadowOffset() {
        return this.shadowOffset;
    }

    public final DoubleValue getShadowSmoothing() {
        return this.shadowSmoothing;
    }

    public final FloatArrayValue getTextColor() {
        return this.textColor;
    }

    public final void setBoundingBoxWithoutRotate(FloatArrayValue floatArrayValue) {
        C89219l.m154721d(floatArrayValue, "");
        this.boundingBoxWithoutRotate = floatArrayValue;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextProperty(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker r23, com.bytedance.ies.nle.editor_jni.NLETrackSlot r24, com.bytedance.ies.nle.editor_jni.NLEMatrix r25) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.editor.nle.TextProperty.<init>(com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker, com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEMatrix):void");
    }

    public TextProperty(FloatArrayValue floatArrayValue, FloatArrayValue floatArrayValue2, DoubleValue doubleValue, FloatArrayValue floatArrayValue3, FloatArrayValue floatArrayValue4, FloatArrayValue floatArrayValue5, DoubleValue doubleValue2, FloatArrayValue floatArrayValue6, DoubleValue doubleValue3, FloatArrayValue floatArrayValue7, FloatArrayValue floatArrayValue8) {
        C89219l.m154721d(floatArrayValue, "");
        C89219l.m154721d(floatArrayValue2, "");
        C89219l.m154721d(doubleValue, "");
        C89219l.m154721d(floatArrayValue3, "");
        C89219l.m154721d(floatArrayValue4, "");
        C89219l.m154721d(floatArrayValue5, "");
        C89219l.m154721d(doubleValue2, "");
        C89219l.m154721d(floatArrayValue6, "");
        C89219l.m154721d(doubleValue3, "");
        C89219l.m154721d(floatArrayValue7, "");
        C89219l.m154721d(floatArrayValue8, "");
        this.position = floatArrayValue;
        this.scale = floatArrayValue2;
        this.rotation = doubleValue;
        this.textColor = floatArrayValue3;
        this.backgroundColor = floatArrayValue4;
        this.shadowColor = floatArrayValue5;
        this.shadowSmoothing = doubleValue2;
        this.shadowOffset = floatArrayValue6;
        this.outlineWidth = doubleValue3;
        this.outlineColor = floatArrayValue7;
        this.boundingBoxWithoutRotate = floatArrayValue8;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextProperty(com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r26, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r27, com.p2082ss.android.ugc.asve.editor.nle.DoubleValue r28, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r29, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r30, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r31, com.p2082ss.android.ugc.asve.editor.nle.DoubleValue r32, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r33, com.p2082ss.android.ugc.asve.editor.nle.DoubleValue r34, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r35, com.p2082ss.android.ugc.asve.editor.nle.FloatArrayValue r36, int r37, p4600h.p4611f.p4613b.C89214g r38) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.editor.nle.TextProperty.<init>(com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.DoubleValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, com.ss.android.ugc.asve.editor.nle.FloatArrayValue, int, h.f.b.g):void");
    }
}
