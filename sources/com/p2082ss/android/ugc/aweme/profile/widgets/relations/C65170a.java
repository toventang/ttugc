package com.p2082ss.android.ugc.aweme.profile.widgets.relations;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.relations.a */
public final class C65170a implements AbstractC12853j {

    /* renamed from: a */
    public final int f147067a;

    /* renamed from: b */
    public final int f147068b;

    /* renamed from: c */
    public final long f147069c;

    static {
        Covode.recordClassIndex(76641);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65170a)) {
            return false;
        }
        C65170a aVar = (C65170a) obj;
        return this.f147067a == aVar.f147067a && this.f147068b == aVar.f147068b && this.f147069c == aVar.f147069c;
    }

    public final int hashCode() {
        long j = this.f147069c;
        return (((this.f147067a * 31) + this.f147068b) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ProfileRelationState(followerCount=" + this.f147067a + ", followingCount=" + this.f147068b + ", digCount=" + this.f147069c + ")";
    }

    public /* synthetic */ C65170a() {
        this(0, 0, 0);
    }

    public C65170a(int i, int i2, long j) {
        this.f147067a = i;
        this.f147068b = i2;
        this.f147069c = j;
    }
}
