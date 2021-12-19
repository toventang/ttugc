package com.p2082ss.android.ugc.aweme.publish.p3617d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.publish.d.a */
public final class C65605a extends RuntimeException {

    /* renamed from: a */
    private final int f147846a;

    /* renamed from: b */
    private final String f147847b;

    static {
        Covode.recordClassIndex(77096);
    }

    public final String toString() {
        return "PublishDebugMockException(stage=" + this.f147846a + ", extra=" + this.f147847b + ')';
    }

    public C65605a(int i, String str) {
        this.f147846a = i;
        this.f147847b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C65605a(int i, String str, int i2, C89214g gVar) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
