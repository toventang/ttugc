package com.p2082ss.android.ugc.gamora.editor.p4276c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.c.a */
public final class C82073a {

    /* renamed from: a */
    public final VideoPublishEditModel f183644a;

    /* renamed from: b */
    public final boolean f183645b;

    /* renamed from: c */
    public final int f183646c;

    /* renamed from: d */
    public final C69905c f183647d;

    static {
        Covode.recordClassIndex(95897);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82073a)) {
            return false;
        }
        C82073a aVar = (C82073a) obj;
        return C89219l.m154714a(this.f183644a, aVar.f183644a) && this.f183645b == aVar.f183645b && this.f183646c == aVar.f183646c && C89219l.m154714a(this.f183647d, aVar.f183647d);
    }

    public final int hashCode() {
        VideoPublishEditModel videoPublishEditModel = this.f183644a;
        int i = 0;
        int hashCode = (videoPublishEditModel != null ? videoPublishEditModel.hashCode() : 0) * 31;
        boolean z = this.f183645b;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (((hashCode + i2) * 31) + this.f183646c) * 31;
        C69905c cVar = this.f183647d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "EditActivityData(videoPublishEditModel=" + this.f183644a + ", mIsFromSysShare=" + this.f183645b + ", draftToEditFrom=" + this.f183646c + ", mOldMusicModel=" + this.f183647d + ")";
    }

    public C82073a(VideoPublishEditModel videoPublishEditModel, boolean z, int i, C69905c cVar) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f183644a = videoPublishEditModel;
        this.f183645b = z;
        this.f183646c = i;
        this.f183647d = cVar;
    }
}
