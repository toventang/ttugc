package com.p2082ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import dmt.p4542av.video.SingleImageCoverBitmapData;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.photo.f */
public final class C62869f {

    /* renamed from: a */
    public final C62887u f142572a;

    /* renamed from: b */
    public final String f142573b;

    /* renamed from: c */
    public final boolean f142574c = false;

    /* renamed from: d */
    public final MediaModel f142575d;

    /* renamed from: e */
    public final SingleImageCoverBitmapData f142576e;

    /* renamed from: f */
    public final CanvasVideoData f142577f;

    /* renamed from: g */
    public final boolean f142578g;

    /* renamed from: h */
    public final AbstractC89172b<Boolean, C89391z> f142579h;

    static {
        Covode.recordClassIndex(73700);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62869f)) {
            return false;
        }
        C62869f fVar = (C62869f) obj;
        return C89219l.m154714a(this.f142572a, fVar.f142572a) && C89219l.m154714a(this.f142573b, fVar.f142573b) && this.f142574c == fVar.f142574c && C89219l.m154714a(this.f142575d, fVar.f142575d) && C89219l.m154714a(this.f142576e, fVar.f142576e) && C89219l.m154714a(this.f142577f, fVar.f142577f) && this.f142578g == fVar.f142578g && C89219l.m154714a(this.f142579h, fVar.f142579h);
    }

    public final int hashCode() {
        C62887u uVar = this.f142572a;
        int i = 0;
        int hashCode = (uVar != null ? uVar.hashCode() : 0) * 31;
        String str = this.f142573b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f142574c;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        MediaModel mediaModel = this.f142575d;
        int hashCode3 = (i6 + (mediaModel != null ? mediaModel.hashCode() : 0)) * 31;
        SingleImageCoverBitmapData singleImageCoverBitmapData = this.f142576e;
        int hashCode4 = (hashCode3 + (singleImageCoverBitmapData != null ? singleImageCoverBitmapData.hashCode() : 0)) * 31;
        CanvasVideoData canvasVideoData = this.f142577f;
        int hashCode5 = (hashCode4 + (canvasVideoData != null ? canvasVideoData.hashCode() : 0)) * 31;
        if (!this.f142578g) {
            i2 = 0;
        }
        int i7 = (hashCode5 + i2) * 31;
        AbstractC89172b<Boolean, C89391z> bVar = this.f142579h;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        return "PhotoCanvasEnterEditParam(coreParam=" + this.f142572a + ", filePath=" + this.f142573b + ", needWaitMusic=" + this.f142574c + ", mediaModel=" + this.f142575d + ", singleImageCoverBitmapData=" + this.f142576e + ", canvasVideoData=" + this.f142577f + ", isFromUpload=" + this.f142578g + ", finishListener=" + this.f142579h + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C62869f(C62887u uVar, String str, MediaModel mediaModel, SingleImageCoverBitmapData singleImageCoverBitmapData, CanvasVideoData canvasVideoData, boolean z, AbstractC89172b<? super Boolean, C89391z> bVar) {
        C89219l.m154721d(uVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(canvasVideoData, "");
        this.f142572a = uVar;
        this.f142573b = str;
        this.f142575d = mediaModel;
        this.f142576e = singleImageCoverBitmapData;
        this.f142577f = canvasVideoData;
        this.f142578g = z;
        this.f142579h = bVar;
    }
}
