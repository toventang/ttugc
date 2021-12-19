package com.p2082ss.android.ugc.asve.context;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.context.PreviewSize */
public final class PreviewSize {
    private final int height;
    private final int width;

    static {
        Covode.recordClassIndex(37661);
    }

    public static /* synthetic */ PreviewSize copy$default(PreviewSize previewSize, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = previewSize.width;
        }
        if ((i3 & 2) != 0) {
            i2 = previewSize.height;
        }
        return previewSize.copy(i, i2);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final PreviewSize copy(int i, int i2) {
        return new PreviewSize(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSize)) {
            return false;
        }
        PreviewSize previewSize = (PreviewSize) obj;
        return this.width == previewSize.width && this.height == previewSize.height;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final String toString() {
        return "PreviewSize(width=" + this.width + ", height=" + this.height + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public PreviewSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
