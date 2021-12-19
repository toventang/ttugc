package com.bytedance.ies.android.base.runtime.depend;

import com.bytedance.covode.number.Covode;

public final class PointModel {

    /* renamed from: px */
    private final double f38791px;

    /* renamed from: py */
    private final double f38792py;

    static {
        Covode.recordClassIndex(18397);
    }

    public static /* synthetic */ PointModel copy$default(PointModel pointModel, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = pointModel.f38791px;
        }
        if ((i & 2) != 0) {
            d2 = pointModel.f38792py;
        }
        return pointModel.copy(d, d2);
    }

    public final double component1() {
        return this.f38791px;
    }

    public final double component2() {
        return this.f38792py;
    }

    public final PointModel copy(double d, double d2) {
        return new PointModel(d, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointModel)) {
            return false;
        }
        PointModel pointModel = (PointModel) obj;
        return Double.compare(this.f38791px, pointModel.f38791px) == 0 && Double.compare(this.f38792py, pointModel.f38792py) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f38791px);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f38792py);
        return i + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "PointModel(px=" + this.f38791px + ", py=" + this.f38792py + ")";
    }

    public final double getPx() {
        return this.f38791px;
    }

    public final double getPy() {
        return this.f38792py;
    }

    public PointModel(double d, double d2) {
        this.f38791px = d;
        this.f38792py = d2;
    }
}
