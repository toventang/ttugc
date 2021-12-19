package com.p2082ss.android.ugc.aweme.profile.widgets.userId;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.userId.a */
public final class C65197a implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f147111a;

    static {
        Covode.recordClassIndex(76670);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65197a) && this.f147111a == ((C65197a) obj).f147111a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f147111a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "MyProfileUserIdState(cuBubbleShowing=" + this.f147111a + ")";
    }

    public /* synthetic */ C65197a() {
        this(false);
    }

    public C65197a(boolean z) {
        this.f147111a = z;
    }
}
