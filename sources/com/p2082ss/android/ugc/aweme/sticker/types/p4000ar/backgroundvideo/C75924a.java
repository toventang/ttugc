package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.backgroundvideo;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.a */
public final class C75924a {

    /* renamed from: a */
    public final String f170536a;

    /* renamed from: b */
    public final String f170537b;

    /* renamed from: c */
    public final String f170538c;

    static {
        Covode.recordClassIndex(88865);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75924a)) {
            return false;
        }
        C75924a aVar = (C75924a) obj;
        return C89219l.m154714a(this.f170536a, aVar.f170536a) && C89219l.m154714a(this.f170537b, aVar.f170537b) && C89219l.m154714a(this.f170538c, aVar.f170538c);
    }

    public final int hashCode() {
        String str = this.f170536a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f170537b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f170538c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BackgroundMediaData(videoPath=" + this.f170536a + ", audioPath=" + this.f170537b + ", videoOriginPath=" + this.f170538c + ")";
    }

    public C75924a(String str, String str2, String str3) {
        this.f170536a = str;
        this.f170537b = str2;
        this.f170538c = str3;
    }
}
