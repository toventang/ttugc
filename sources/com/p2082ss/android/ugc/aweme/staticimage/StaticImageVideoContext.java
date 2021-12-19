package com.p2082ss.android.ugc.aweme.staticimage;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.staticimage.StaticImageVideoContext */
public final class StaticImageVideoContext implements Serializable {
    private final int duration;
    private final int imageHeight;
    private String imagePath;
    private final int imageWidth;
    private final boolean isFromAvatarChanging;
    private final boolean isFromBackgroundChanging;
    private final boolean isFromShoot;
    private String uploadFrameImagePath;

    static {
        Covode.recordClassIndex(88124);
    }

    public static /* synthetic */ StaticImageVideoContext copy$default(StaticImageVideoContext staticImageVideoContext, String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = staticImageVideoContext.imagePath;
        }
        if ((i4 & 2) != 0) {
            z = staticImageVideoContext.isFromShoot;
        }
        if ((i4 & 4) != 0) {
            i = staticImageVideoContext.duration;
        }
        if ((i4 & 8) != 0) {
            z2 = staticImageVideoContext.isFromAvatarChanging;
        }
        if ((i4 & 16) != 0) {
            z3 = staticImageVideoContext.isFromBackgroundChanging;
        }
        if ((i4 & 32) != 0) {
            i2 = staticImageVideoContext.imageWidth;
        }
        if ((i4 & 64) != 0) {
            i3 = staticImageVideoContext.imageHeight;
        }
        if ((i4 & 128) != 0) {
            str2 = staticImageVideoContext.uploadFrameImagePath;
        }
        return staticImageVideoContext.copy(str, z, i, z2, z3, i2, i3, str2);
    }

    public final String component1() {
        return this.imagePath;
    }

    public final boolean component2() {
        return this.isFromShoot;
    }

    public final int component3() {
        return this.duration;
    }

    public final boolean component4() {
        return this.isFromAvatarChanging;
    }

    public final boolean component5() {
        return this.isFromBackgroundChanging;
    }

    public final int component6() {
        return this.imageWidth;
    }

    public final int component7() {
        return this.imageHeight;
    }

    public final String component8() {
        return this.uploadFrameImagePath;
    }

    public final StaticImageVideoContext copy(String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2) {
        C89219l.m154721d(str, "");
        return new StaticImageVideoContext(str, z, i, z2, z3, i2, i3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticImageVideoContext)) {
            return false;
        }
        StaticImageVideoContext staticImageVideoContext = (StaticImageVideoContext) obj;
        return C89219l.m154714a(this.imagePath, staticImageVideoContext.imagePath) && this.isFromShoot == staticImageVideoContext.isFromShoot && this.duration == staticImageVideoContext.duration && this.isFromAvatarChanging == staticImageVideoContext.isFromAvatarChanging && this.isFromBackgroundChanging == staticImageVideoContext.isFromBackgroundChanging && this.imageWidth == staticImageVideoContext.imageWidth && this.imageHeight == staticImageVideoContext.imageHeight && C89219l.m154714a(this.uploadFrameImagePath, staticImageVideoContext.uploadFrameImagePath);
    }

    public final int hashCode() {
        String str = this.imagePath;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.isFromShoot;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (((hashCode + i3) * 31) + this.duration) * 31;
        boolean z2 = this.isFromAvatarChanging;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.isFromBackgroundChanging) {
            i2 = 0;
        }
        int i11 = (((((i10 + i2) * 31) + this.imageWidth) * 31) + this.imageHeight) * 31;
        String str2 = this.uploadFrameImagePath;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i11 + i;
    }

    public final String toString() {
        return "StaticImageVideoContext(imagePath=" + this.imagePath + ", isFromShoot=" + this.isFromShoot + ", duration=" + this.duration + ", isFromAvatarChanging=" + this.isFromAvatarChanging + ", isFromBackgroundChanging=" + this.isFromBackgroundChanging + ", imageWidth=" + this.imageWidth + ", imageHeight=" + this.imageHeight + ", uploadFrameImagePath=" + this.uploadFrameImagePath + ")";
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getImageHeight() {
        return this.imageHeight;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final int getImageWidth() {
        return this.imageWidth;
    }

    public final String getUploadFrameImagePath() {
        return this.uploadFrameImagePath;
    }

    public final boolean isFromAvatarChanging() {
        return this.isFromAvatarChanging;
    }

    public final boolean isFromBackgroundChanging() {
        return this.isFromBackgroundChanging;
    }

    public final boolean isFromShoot() {
        return this.isFromShoot;
    }

    public final void setUploadFrameImagePath(String str) {
        this.uploadFrameImagePath = str;
    }

    public final void setImagePath(String str) {
        C89219l.m154721d(str, "");
        this.imagePath = str;
    }

    public StaticImageVideoContext(String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2) {
        C89219l.m154721d(str, "");
        this.imagePath = str;
        this.isFromShoot = z;
        this.duration = i;
        this.isFromAvatarChanging = z2;
        this.isFromBackgroundChanging = z3;
        this.imageWidth = i2;
        this.imageHeight = i3;
        this.uploadFrameImagePath = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StaticImageVideoContext(String str, boolean z, int i, boolean z2, boolean z3, int i2, int i3, String str2, int i4, C89214g gVar) {
        this(str, z, (i4 & 4) != 0 ? 10000 : i, (i4 & 8) != 0 ? false : z2, (i4 & 16) != 0 ? false : z3, (i4 & 32) != 0 ? 720 : i2, (i4 & 64) != 0 ? 1080 : i3, (i4 & 128) != 0 ? null : str2);
    }
}
