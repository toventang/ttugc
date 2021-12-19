package com.p2082ss.android.ugc.aweme.publish.core.upload;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.publish.core.upload.d */
public final class C65524d {

    /* renamed from: a */
    public final int f147758a;

    static {
        Covode.recordClassIndex(77014);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C65524d) && this.f147758a == ((C65524d) obj).f147758a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f147758a;
    }

    public final String toString() {
        return "SmartSliceSetting(sliceSize=" + this.f147758a + ")";
    }

    /* renamed from: a */
    public final int mo104656a() {
        return this.f147758a * 1024;
    }

    public C65524d(int i) {
        this.f147758a = i;
    }
}
