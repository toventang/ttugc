package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.helper.Location;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResult */
public final class CutoutResult {
    private Location bbox;
    private String content;
    @AbstractC27891c(mo46611a = "contours_point")
    private List<? extends List<Coordinate>> contoursPoint;

    static {
        Covode.recordClassIndex(66568);
    }

    public CutoutResult() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.infoSticker.customsticker.api.CutoutResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutoutResult copy$default(CutoutResult cutoutResult, String str, List list, Location location, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cutoutResult.content;
        }
        if ((i & 2) != 0) {
            list = cutoutResult.contoursPoint;
        }
        if ((i & 4) != 0) {
            location = cutoutResult.bbox;
        }
        return cutoutResult.copy(str, list, location);
    }

    public final String component1() {
        return this.content;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>>, java.util.List<java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>> */
    public final List<List<Coordinate>> component2() {
        return this.contoursPoint;
    }

    public final Location component3() {
        return this.bbox;
    }

    public final CutoutResult copy(String str, List<? extends List<Coordinate>> list, Location location) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return new CutoutResult(str, list, location);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutResult)) {
            return false;
        }
        CutoutResult cutoutResult = (CutoutResult) obj;
        return C89219l.m154714a(this.content, cutoutResult.content) && C89219l.m154714a(this.contoursPoint, cutoutResult.contoursPoint) && C89219l.m154714a(this.bbox, cutoutResult.bbox);
    }

    public final int hashCode() {
        String str = this.content;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<? extends List<Coordinate>> list = this.contoursPoint;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Location location = this.bbox;
        if (location != null) {
            i = location.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "CutoutResult(content=" + this.content + ", contoursPoint=" + this.contoursPoint + ", bbox=" + this.bbox + ")";
    }

    public final Location getBbox() {
        return this.bbox;
    }

    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>>, java.util.List<java.util.List<com.ss.android.ugc.aweme.infoSticker.customsticker.helper.Coordinate>> */
    public final List<List<Coordinate>> getContoursPoint() {
        return this.contoursPoint;
    }

    public final void setBbox(Location location) {
        this.bbox = location;
    }

    public final void setContent(String str) {
        C89219l.m154721d(str, "");
        this.content = str;
    }

    public final void setContoursPoint(List<? extends List<Coordinate>> list) {
        C89219l.m154721d(list, "");
        this.contoursPoint = list;
    }

    public CutoutResult(String str, List<? extends List<Coordinate>> list, Location location) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        this.content = str;
        this.contoursPoint = list;
        this.bbox = location;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutoutResult(String str, List list, Location location, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : location);
    }
}
