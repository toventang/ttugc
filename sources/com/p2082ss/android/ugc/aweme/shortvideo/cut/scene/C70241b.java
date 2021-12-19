package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3790ac.C69790a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.b */
public final class C70241b {

    /* renamed from: a */
    public final List<VideoSegment> f157038a;

    /* renamed from: b */
    public final long f157039b;

    /* renamed from: c */
    public final boolean f157040c;

    /* renamed from: d */
    public final boolean f157041d;

    /* renamed from: e */
    public final boolean f157042e;

    /* renamed from: f */
    public final C69905c f157043f;

    /* renamed from: g */
    public final C69790a f157044g;

    static {
        Covode.recordClassIndex(82684);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70241b)) {
            return false;
        }
        C70241b bVar = (C70241b) obj;
        return C89219l.m154714a(this.f157038a, bVar.f157038a) && this.f157039b == bVar.f157039b && this.f157040c == bVar.f157040c && this.f157041d == bVar.f157041d && this.f157042e == bVar.f157042e && C89219l.m154714a(this.f157043f, bVar.f157043f) && C89219l.m154714a(this.f157044g, bVar.f157044g);
    }

    public final String toString() {
        return "CutStatusModel(videoSegments=" + this.f157038a + ", videoLength=" + this.f157039b + ", isMusicStickPointMode=" + this.f157040c + ", isMultiEditMode=" + this.f157041d + ", hadChangeSpeed=" + this.f157042e + ", stickPointMusic=" + this.f157043f + ", stickPointData=" + this.f157044g + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        List<VideoSegment> list = this.f157038a;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        long j = this.f157039b;
        int i4 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f157040c;
        int i5 = 1;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = (i4 + i6) * 31;
        boolean z2 = this.f157041d;
        if (z2) {
            z2 = true;
        }
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = z2 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        if (!this.f157042e) {
            i5 = 0;
        }
        int i14 = (i13 + i5) * 31;
        C69905c cVar = this.f157043f;
        if (cVar != null) {
            i2 = cVar.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        C69790a aVar = this.f157044g;
        if (aVar != null) {
            i3 = aVar.hashCode();
        }
        return i15 + i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment> */
    /* JADX WARN: Multi-variable type inference failed */
    public C70241b(List<? extends VideoSegment> list, long j, boolean z, boolean z2, boolean z3, C69905c cVar, C69790a aVar) {
        C89219l.m154721d(list, "");
        this.f157038a = list;
        this.f157039b = j;
        this.f157040c = z;
        this.f157041d = z2;
        this.f157042e = z3;
        this.f157043f = cVar;
        this.f157044g = aVar;
    }
}
