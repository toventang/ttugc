package com.p2082ss.android.ugc.aweme.choosemusic.p2467g;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.g.b */
public final class C35840b {
    @AbstractC27891c(mo46611a = "commercial_music_schema")

    /* renamed from: a */
    public final String f84607a;

    static {
        Covode.recordClassIndex(43079);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C35840b) && C89219l.m154714a(this.f84607a, ((C35840b) obj).f84607a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f84607a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CommercialMusicPageInfo(commercialMusicSchema=" + this.f84607a + ")";
    }

    private C35840b() {
        this.f84607a = null;
    }

    public /* synthetic */ C35840b(byte b) {
        this();
    }
}
