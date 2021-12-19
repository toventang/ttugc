package com.p2082ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.api.c */
public final class C65510c {
    @AbstractC27891c(mo46611a = "video_id")

    /* renamed from: a */
    public final long f147735a;
    @AbstractC27891c(mo46611a = "author_id")

    /* renamed from: b */
    public final long f147736b;
    @AbstractC27891c(mo46611a = "author_nickname")

    /* renamed from: c */
    public final String f147737c;
    @AbstractC27891c(mo46611a = "sec_author_uid")

    /* renamed from: d */
    public final String f147738d;
    @AbstractC27891c(mo46611a = "video_status")

    /* renamed from: e */
    public final int f147739e;
    @AbstractC27891c(mo46611a = "is_author_private_account")

    /* renamed from: f */
    public final int f147740f;
    @AbstractC27891c(mo46611a = "author_unique_id")

    /* renamed from: g */
    public final String f147741g;

    static {
        Covode.recordClassIndex(76998);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65510c)) {
            return false;
        }
        C65510c cVar = (C65510c) obj;
        return this.f147735a == cVar.f147735a && this.f147736b == cVar.f147736b && C89219l.m154714a(this.f147737c, cVar.f147737c) && C89219l.m154714a(this.f147738d, cVar.f147738d) && this.f147739e == cVar.f147739e && this.f147740f == cVar.f147740f && C89219l.m154714a(this.f147741g, cVar.f147741g);
    }

    public final String toString() {
        return "VideoRelatedInfo(awemeId=" + this.f147735a + ", authorId=" + this.f147736b + ", authorNickName=" + this.f147737c + ", authorSecUid=" + this.f147738d + ", videoStatus=" + this.f147739e + ", isPrivateAccount=" + this.f147740f + ", uniqueId=" + this.f147741g + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        long j = this.f147735a;
        long j2 = this.f147736b;
        int i3 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f147737c;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f147738d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (((((i5 + i2) * 31) + this.f147739e) * 31) + this.f147740f) * 31;
        String str3 = this.f147741g;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return i6 + i4;
    }
}
