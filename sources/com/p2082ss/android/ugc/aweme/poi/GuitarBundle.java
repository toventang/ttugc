package com.p2082ss.android.ugc.aweme.poi;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.poi.GuitarBundle */
public final class GuitarBundle {
    @AbstractC27891c(mo46611a = "latitude")
    private double latitude;
    @AbstractC27891c(mo46611a = "longitude")
    private double longitude;

    static {
        Covode.recordClassIndex(73973);
    }

    public GuitarBundle() {
        this(0.0d, 0.0d, 3, null);
    }

    public static /* synthetic */ GuitarBundle copy$default(GuitarBundle guitarBundle, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = guitarBundle.latitude;
        }
        if ((i & 2) != 0) {
            d2 = guitarBundle.longitude;
        }
        return guitarBundle.copy(d, d2);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final GuitarBundle copy(double d, double d2) {
        return new GuitarBundle(d, d2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuitarBundle)) {
            return false;
        }
        GuitarBundle guitarBundle = (GuitarBundle) obj;
        return Double.compare(this.latitude, guitarBundle.latitude) == 0 && Double.compare(this.longitude, guitarBundle.longitude) == 0;
    }

    public final int hashCode() {
        return (m114085x74c8b030(this.latitude) * 31) + m114085x74c8b030(this.longitude);
    }

    public final String toString() {
        return "GuitarBundle(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    /* renamed from: com_ss_android_ugc_aweme_poi_GuitarBundle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m114085x74c8b030(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public GuitarBundle(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GuitarBundle(double d, double d2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }
}
