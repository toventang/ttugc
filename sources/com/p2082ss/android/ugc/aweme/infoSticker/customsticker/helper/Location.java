package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Location */
public final class Location {
    @AbstractC27891c(mo46611a = "h")
    private final int height;
    @AbstractC27891c(mo46611a = "x")
    private final int left;
    @AbstractC27891c(mo46611a = "y")
    private final int top;
    @AbstractC27891c(mo46611a = "w")
    private final int width;

    static {
        Covode.recordClassIndex(66571);
    }

    /* renamed from: com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Location_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m102715xd5333e24(int i) {
        return i;
    }

    public static /* synthetic */ Location copy$default(Location location, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = location.left;
        }
        if ((i5 & 2) != 0) {
            i2 = location.top;
        }
        if ((i5 & 4) != 0) {
            i3 = location.width;
        }
        if ((i5 & 8) != 0) {
            i4 = location.height;
        }
        return location.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final Location copy(int i, int i2, int i3, int i4) {
        return new Location(i, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return this.left == location.left && this.top == location.top && this.width == location.width && this.height == location.height;
    }

    public final int hashCode() {
        return (((((m102715xd5333e24(this.left) * 31) + m102715xd5333e24(this.top)) * 31) + m102715xd5333e24(this.width)) * 31) + m102715xd5333e24(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.width;
    }

    public final String toString() {
        return "[" + this.left + ", " + this.top + "], width: " + this.width + ", height: " + this.height;
    }

    public Location(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.width = i3;
        this.height = i4;
    }
}
