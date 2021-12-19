package com.p2082ss.android.ugc.aweme.publish.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.api.b */
public final class C65509b {
    @AbstractC27891c(mo46611a = "status_code")

    /* renamed from: a */
    public final int f147732a = 408;
    @AbstractC27891c(mo46611a = "video_info")

    /* renamed from: b */
    public final C65510c f147733b = null;
    @AbstractC27891c(mo46611a = "valid_info")

    /* renamed from: c */
    public final C65508a f147734c = null;

    static {
        Covode.recordClassIndex(76997);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65509b)) {
            return false;
        }
        C65509b bVar = (C65509b) obj;
        return this.f147732a == bVar.f147732a && C89219l.m154714a(this.f147733b, bVar.f147733b) && C89219l.m154714a(this.f147734c, bVar.f147734c);
    }

    public final int hashCode() {
        int i = this.f147732a * 31;
        C65510c cVar = this.f147733b;
        int i2 = 0;
        int hashCode = (i + (cVar != null ? cVar.hashCode() : 0)) * 31;
        C65508a aVar = this.f147734c;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VideoInfoFromURLResponse(statusCode=" + this.f147732a + ", videoInfo=" + this.f147733b + ", validInfo=" + this.f147734c + ")";
    }
}
