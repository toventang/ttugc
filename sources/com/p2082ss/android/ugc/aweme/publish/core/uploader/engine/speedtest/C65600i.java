package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine.speedtest;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.i */
public final class C65600i {

    /* renamed from: a */
    public final long f147839a;

    /* renamed from: b */
    public final String f147840b;

    /* renamed from: c */
    public final boolean f147841c;

    /* renamed from: d */
    public final long f147842d;

    /* renamed from: e */
    public final long f147843e;

    static {
        Covode.recordClassIndex(77091);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65600i)) {
            return false;
        }
        C65600i iVar = (C65600i) obj;
        return this.f147839a == iVar.f147839a && C89219l.m154714a(this.f147840b, iVar.f147840b) && this.f147841c == iVar.f147841c && this.f147842d == iVar.f147842d && this.f147843e == iVar.f147843e;
    }

    public final String toString() {
        return "Result(probeSpeed=" + this.f147839a + ", uploadContext=" + this.f147840b + ", isComplete=" + this.f147841c + ", probeStartTime=" + this.f147842d + ", probeEndTime=" + this.f147843e + ")";
    }

    public final int hashCode() {
        int i;
        long j = this.f147839a;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f147840b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.f147841c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        long j2 = this.f147842d;
        long j3 = this.f147843e;
        return ((((i3 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public C65600i(long j, String str, boolean z, long j2, long j3) {
        C89219l.m154721d(str, "");
        this.f147839a = j;
        this.f147840b = str;
        this.f147841c = z;
        this.f147842d = j2;
        this.f147843e = j3;
    }
}
