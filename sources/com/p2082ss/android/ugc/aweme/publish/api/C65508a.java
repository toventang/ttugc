package com.p2082ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.api.a */
public final class C65508a {
    @AbstractC27891c(mo46611a = "attachable")

    /* renamed from: a */
    public final boolean f147729a;
    @AbstractC27891c(mo46611a = "toast_content")

    /* renamed from: b */
    public final String f147730b;
    @AbstractC27891c(mo46611a = "is_long_url")

    /* renamed from: c */
    public final boolean f147731c;

    static {
        Covode.recordClassIndex(76996);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65508a)) {
            return false;
        }
        C65508a aVar = (C65508a) obj;
        return this.f147729a == aVar.f147729a && C89219l.m154714a(this.f147730b, aVar.f147730b) && this.f147731c == aVar.f147731c;
    }

    public final int hashCode() {
        boolean z = this.f147729a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f147730b;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        if (!this.f147731c) {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ValidInfo(attachable=" + this.f147729a + ", toastContent=" + this.f147730b + ", isLongUrl=" + this.f147731c + ")";
    }
}
