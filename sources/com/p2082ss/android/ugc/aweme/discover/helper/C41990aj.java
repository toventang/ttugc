package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.aj */
public final class C41990aj {

    /* renamed from: a */
    public final String f97925a = null;

    /* renamed from: b */
    public final MusicModel f97926b = null;

    static {
        Covode.recordClassIndex(49920);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41990aj)) {
            return false;
        }
        C41990aj ajVar = (C41990aj) obj;
        return C89219l.m154714a(this.f97925a, ajVar.f97925a) && C89219l.m154714a(this.f97926b, ajVar.f97926b);
    }

    public final int hashCode() {
        String str = this.f97925a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MusicModel musicModel = this.f97926b;
        if (musicModel != null) {
            i = musicModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ToVideoProgress(musicFilePath=" + this.f97925a + ", musicModel=" + this.f97926b + ")";
    }

    private C41990aj() {
    }
}
