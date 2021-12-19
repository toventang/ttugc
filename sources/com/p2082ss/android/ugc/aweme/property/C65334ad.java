package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.property.ad */
public final class C65334ad {
    @AbstractC27891c(mo46611a = "every_day_count")

    /* renamed from: a */
    public final int f147461a;
    @AbstractC27891c(mo46611a = "total_count")

    /* renamed from: b */
    public final int f147462b;

    static {
        Covode.recordClassIndex(76821);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65334ad)) {
            return false;
        }
        C65334ad adVar = (C65334ad) obj;
        return this.f147461a == adVar.f147461a && this.f147462b == adVar.f147462b;
    }

    public final int hashCode() {
        return (this.f147461a * 31) + this.f147462b;
    }

    public final String toString() {
        return "EditPageLongPressTipsData(everydayCount=" + this.f147461a + ", totalCount=" + this.f147462b + ")";
    }

    private C65334ad() {
        this.f147461a = 1;
        this.f147462b = 5;
    }

    public /* synthetic */ C65334ad(byte b) {
        this();
    }
}
