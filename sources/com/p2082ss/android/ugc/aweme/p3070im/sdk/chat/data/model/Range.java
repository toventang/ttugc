package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Range */
public final class Range {
    private int from;

    /* renamed from: to */
    private int f123451to;

    static {
        Covode.recordClassIndex(63453);
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.f123451to;
    }

    public final int hashCode() {
        return (this.from * 31) + this.f123451to;
    }

    public final void setFrom(int i) {
        this.from = i;
    }

    public final void setTo(int i) {
        this.f123451to = i;
    }

    public final int getAnchorPosition(int i) {
        int i2 = this.from;
        int i3 = this.f123451to;
        if ((i - i2) - (i3 - i) >= 0) {
            return i3;
        }
        return i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.from == range.from && this.f123451to == range.f123451to) {
            return true;
        }
        return false;
    }

    public Range(int i, int i2) {
        this.from = i;
        this.f123451to = i2;
    }

    public final boolean contains(int i, int i2) {
        if (this.from > i || this.f123451to < i2) {
            return false;
        }
        return true;
    }

    public final boolean isEqual(int i, int i2) {
        int i3 = this.from;
        if (i3 == i && this.f123451to == i2) {
            return true;
        }
        if (i3 == i2 && this.f123451to == i) {
            return true;
        }
        return false;
    }

    public final boolean isWrappedBy(int i, int i2) {
        int i3 = this.from;
        int i4 = i3 + 1;
        int i5 = this.f123451to;
        if ((i4 > i || i5 <= i) && (i3 + 1 > i2 || i5 <= i2)) {
            return false;
        }
        return true;
    }
}
