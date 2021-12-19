package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BoxData */
public final class BoxData implements Serializable {
    @AbstractC27891c(mo46611a = "box")
    private final Coordinate box;
    @AbstractC27891c(mo46611a = "timestamp_MS")
    private final int timestampMS;

    static {
        Covode.recordClassIndex(58659);
    }

    public BoxData() {
        this(null, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_BoxData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93170x743e11cd(int i) {
        return i;
    }

    public static /* synthetic */ BoxData copy$default(BoxData boxData, Coordinate coordinate, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coordinate = boxData.box;
        }
        if ((i2 & 2) != 0) {
            i = boxData.timestampMS;
        }
        return boxData.copy(coordinate, i);
    }

    public final Coordinate component1() {
        return this.box;
    }

    public final int component2() {
        return this.timestampMS;
    }

    public final BoxData copy(Coordinate coordinate, int i) {
        return new BoxData(coordinate, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxData)) {
            return false;
        }
        BoxData boxData = (BoxData) obj;
        return C89219l.m154714a(this.box, boxData.box) && this.timestampMS == boxData.timestampMS;
    }

    public final int hashCode() {
        Coordinate coordinate = this.box;
        return ((coordinate != null ? coordinate.hashCode() : 0) * 31) + m93170x743e11cd(this.timestampMS);
    }

    public final String toString() {
        return "BoxData(box=" + this.box + ", timestampMS=" + this.timestampMS + ")";
    }

    public final Coordinate getBox() {
        return this.box;
    }

    public final int getTimestampMS() {
        return this.timestampMS;
    }

    public BoxData(Coordinate coordinate, int i) {
        this.box = coordinate;
        this.timestampMS = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoxData(Coordinate coordinate, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : coordinate, (i2 & 2) != 0 ? 0 : i);
    }
}
