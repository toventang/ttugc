package com.p2082ss.android.ugc.aweme.shortvideo.editcut.p3830a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.a.a */
public final class C71557a {

    /* renamed from: a */
    public final int f160354a;

    /* renamed from: b */
    public final boolean f160355b;

    /* renamed from: c */
    public final VideoPublishEditModel f160356c;

    /* renamed from: d */
    public final MultiEditVideoStatusRecordData f160357d;

    /* renamed from: e */
    public final Cut2EditTransferModel f160358e;

    static {
        Covode.recordClassIndex(84102);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71557a)) {
            return false;
        }
        C71557a aVar = (C71557a) obj;
        return this.f160354a == aVar.f160354a && this.f160355b == aVar.f160355b && C89219l.m154714a(this.f160356c, aVar.f160356c) && C89219l.m154714a(this.f160357d, aVar.f160357d) && C89219l.m154714a(this.f160358e, aVar.f160358e);
    }

    public final int hashCode() {
        int i = this.f160354a * 31;
        boolean z = this.f160355b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        VideoPublishEditModel videoPublishEditModel = this.f160356c;
        int i6 = 0;
        int hashCode = (i5 + (videoPublishEditModel != null ? videoPublishEditModel.hashCode() : 0)) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f160357d;
        int hashCode2 = (hashCode + (multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.hashCode() : 0)) * 31;
        Cut2EditTransferModel cut2EditTransferModel = this.f160358e;
        if (cut2EditTransferModel != null) {
            i6 = cut2EditTransferModel.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "EditAdjustClipsModel(origin=" + this.f160354a + ", isMultiEdit=" + this.f160355b + ", editModel=" + this.f160356c + ", multiEditVideoStatusRecordData=" + this.f160357d + ", cut2EditTransferModel=" + this.f160358e + ")";
    }

    public C71557a(int i, boolean z, VideoPublishEditModel videoPublishEditModel, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, Cut2EditTransferModel cut2EditTransferModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(multiEditVideoStatusRecordData, "");
        this.f160354a = i;
        this.f160355b = z;
        this.f160356c = videoPublishEditModel;
        this.f160357d = multiEditVideoStatusRecordData;
        this.f160358e = cut2EditTransferModel;
    }
}
