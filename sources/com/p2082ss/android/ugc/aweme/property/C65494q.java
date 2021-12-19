package com.p2082ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.property.q */
public final class C65494q {
    @AbstractC27891c(mo46611a = "canvas_default_duration_without_music")

    /* renamed from: a */
    public final int f147709a = 10000;
    @AbstractC27891c(mo46611a = "canvas_min_duration_with_music")

    /* renamed from: b */
    public final int f147710b;
    @AbstractC27891c(mo46611a = "canvas_max_duration_with_music")

    /* renamed from: c */
    public final int f147711c;

    static {
        Covode.recordClassIndex(76981);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65494q)) {
            return false;
        }
        C65494q qVar = (C65494q) obj;
        return this.f147709a == qVar.f147709a && this.f147710b == qVar.f147710b && this.f147711c == qVar.f147711c;
    }

    public final int hashCode() {
        return (((this.f147709a * 31) + this.f147710b) * 31) + this.f147711c;
    }

    public final String toString() {
        return "CanvasDurationConfig(defaultDuration=" + this.f147709a + ", minDuration=" + this.f147710b + ", maxDuration=" + this.f147711c + ")";
    }

    public C65494q(int i, int i2) {
        this.f147710b = i;
        this.f147711c = i2;
    }
}
