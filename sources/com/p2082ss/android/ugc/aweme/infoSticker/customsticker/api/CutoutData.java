package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData */
public final class CutoutData {
    private List<? extends List<Coordinate>> contours;
    private File image;
    private Location location;

    static {
        Covode.recordClassIndex(66566);
    }

    public CutoutData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutoutData copy$default(CutoutData cutoutData, File file, List list, Location location2, int i, Object obj) {
        if ((i & 1) != 0) {
            file = cutoutData.image;
        }
        if ((i & 2) != 0) {
            list = cutoutData.contours;
        }
        if ((i & 4) != 0) {
            location2 = cutoutData.location;
        }
        return cutoutData.copy(file, list, location2);
    }

    public final File component1() {
        return this.image;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>>, java.util.List<java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>> */
    public final List<List<Coordinate>> component2() {
        return this.contours;
    }

    public final Location component3() {
        return this.location;
    }

    public final CutoutData copy(File file, List<? extends List<Coordinate>> list, Location location2) {
        C89219l.m154721d(list, "");
        return new CutoutData(file, list, location2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutData)) {
            return false;
        }
        CutoutData cutoutData = (CutoutData) obj;
        return C89219l.m154714a(this.image, cutoutData.image) && C89219l.m154714a(this.contours, cutoutData.contours) && C89219l.m154714a(this.location, cutoutData.location);
    }

    public final int hashCode() {
        File file = this.image;
        int i = 0;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        List<? extends List<Coordinate>> list = this.contours;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Location location2 = this.location;
        if (location2 != null) {
            i = location2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CutoutData(image=" + this.image + ", contours=" + this.contours + ", location=" + this.location + ")";
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>>, java.util.List<java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>> */
    public final List<List<Coordinate>> getContours() {
        return this.contours;
    }

    public final File getImage() {
        return this.image;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final boolean checkData() {
        if (this.location == null || !(!this.contours.isEmpty()) || this.image == null) {
            return false;
        }
        return true;
    }

    public final void setImage(File file) {
        this.image = file;
    }

    public final void setLocation(Location location2) {
        this.location = location2;
    }

    public final void setContours(List<? extends List<Coordinate>> list) {
        C89219l.m154721d(list, "");
        this.contours = list;
    }

    public CutoutData(File file, List<? extends List<Coordinate>> list, Location location2) {
        C89219l.m154721d(list, "");
        this.image = file;
        this.contours = list;
        this.location = location2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutoutData(File file, List list, Location location2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : file, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : location2);
    }
}
