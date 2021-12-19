package com.p2082ss.android.ugc.aweme.music.p3481ui.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.widget.d */
public final class C61238d implements AbstractC17641a {

    /* renamed from: a */
    public final ExternalMusicInfo f139044a;

    /* renamed from: b */
    public final boolean f139045b;

    static {
        Covode.recordClassIndex(71849);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61238d)) {
            return false;
        }
        C61238d dVar = (C61238d) obj;
        return C89219l.m154714a(this.f139044a, dVar.f139044a) && this.f139045b == dVar.f139045b;
    }

    public final int hashCode() {
        ExternalMusicInfo externalMusicInfo = this.f139044a;
        int hashCode = (externalMusicInfo != null ? externalMusicInfo.hashCode() : 0) * 31;
        boolean z = this.f139045b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public final String toString() {
        return "ThirdMusicItem(musicInfo=" + this.f139044a + ", isLastItem=" + this.f139045b + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C61238d(ExternalMusicInfo externalMusicInfo, boolean z) {
        C89219l.m154721d(externalMusicInfo, "");
        this.f139044a = externalMusicInfo;
        this.f139045b = z;
    }
}
