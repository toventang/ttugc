package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70625d;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74171f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.creationflow.a */
public final class C73586a {

    /* renamed from: a */
    public final Activity f165392a;

    /* renamed from: b */
    public final C74171f f165393b;

    /* renamed from: c */
    public final long f165394c;

    /* renamed from: d */
    public final ShortVideoContext f165395d;

    /* renamed from: e */
    public final int f165396e;

    /* renamed from: f */
    public final C70625d f165397f;

    /* renamed from: g */
    public final MultiEditVideoStatusRecordData f165398g;

    /* renamed from: h */
    public final String f165399h;

    /* renamed from: i */
    public final String f165400i;

    static {
        Covode.recordClassIndex(86324);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73586a)) {
            return false;
        }
        C73586a aVar = (C73586a) obj;
        return C89219l.m154714a(this.f165392a, aVar.f165392a) && C89219l.m154714a(this.f165393b, aVar.f165393b) && this.f165394c == aVar.f165394c && C89219l.m154714a(this.f165395d, aVar.f165395d) && this.f165396e == aVar.f165396e && C89219l.m154714a(this.f165397f, aVar.f165397f) && C89219l.m154714a(this.f165398g, aVar.f165398g) && C89219l.m154714a(this.f165399h, aVar.f165399h) && C89219l.m154714a(this.f165400i, aVar.f165400i);
    }

    public final String toString() {
        return "EditActionArgument(activity=" + this.f165392a + ", recordComponentModel=" + this.f165393b + ", videoConcatTime=" + this.f165394c + ", shortVideoContext=" + this.f165395d + ", cameraPosition=" + this.f165396e + ", bean=" + this.f165397f + ", recordData=" + this.f165398g + ", videoPath=" + this.f165399h + ", audioPath=" + this.f165400i + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Activity activity = this.f165392a;
        int i7 = 0;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        C74171f fVar = this.f165393b;
        if (fVar != null) {
            i2 = fVar.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f165394c;
        int i9 = (((i8 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        ShortVideoContext shortVideoContext = this.f165395d;
        if (shortVideoContext != null) {
            i3 = shortVideoContext.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (((i9 + i3) * 31) + this.f165396e) * 31;
        C70625d dVar = this.f165397f;
        if (dVar != null) {
            i4 = dVar.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f165398g;
        if (multiEditVideoStatusRecordData != null) {
            i5 = multiEditVideoStatusRecordData.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        String str = this.f165399h;
        if (str != null) {
            i6 = str.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        String str2 = this.f165400i;
        if (str2 != null) {
            i7 = str2.hashCode();
        }
        return i13 + i7;
    }

    public C73586a(Activity activity, C74171f fVar, long j, ShortVideoContext shortVideoContext, int i, C70625d dVar, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f165392a = activity;
        this.f165393b = fVar;
        this.f165394c = j;
        this.f165395d = shortVideoContext;
        this.f165396e = i;
        this.f165397f = dVar;
        this.f165398g = multiEditVideoStatusRecordData;
        this.f165399h = str;
        this.f165400i = str2;
    }
}
