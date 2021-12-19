package com.p2082ss.android.ugc.asve.editor.nle;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.editor.nle.DoubleValue */
public final class DoubleValue {
    private final double value;

    static {
        Covode.recordClassIndex(37715);
    }

    public static /* synthetic */ DoubleValue copy$default(DoubleValue doubleValue, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = doubleValue.value;
        }
        return doubleValue.copy(d);
    }

    public final double component1() {
        return this.value;
    }

    public final DoubleValue copy(double d) {
        return new DoubleValue(d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DoubleValue) && Double.compare(this.value, ((DoubleValue) obj).value) == 0;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        return "DoubleValue(value=" + this.value + ")";
    }

    public final double getValue() {
        return this.value;
    }

    public DoubleValue(double d) {
        this.value = d;
    }
}
