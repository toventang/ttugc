package com.p2082ss.android.ugc.aweme.profile.widgets.redpoint;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.BlockStruct;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.redpoint.a */
public final class C65165a implements AbstractC12853j {

    /* renamed from: a */
    public final BlockStruct f147061a;

    /* renamed from: b */
    public final Exception f147062b;

    static {
        Covode.recordClassIndex(76635);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65165a)) {
            return false;
        }
        C65165a aVar = (C65165a) obj;
        return C89219l.m154714a(this.f147061a, aVar.f147061a) && C89219l.m154714a(this.f147062b, aVar.f147062b);
    }

    public final int hashCode() {
        BlockStruct blockStruct = this.f147061a;
        int i = 0;
        int hashCode = (blockStruct != null ? blockStruct.hashCode() : 0) * 31;
        Exception exc = this.f147062b;
        if (exc != null) {
            i = exc.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileBlockState(blockStruct=" + this.f147061a + ", exception=" + this.f147062b + ")";
    }

    public /* synthetic */ C65165a() {
        this(null, null);
    }

    private C65165a(BlockStruct blockStruct, Exception exc) {
        this.f147061a = blockStruct;
        this.f147062b = exc;
    }

    /* renamed from: a */
    public static /* synthetic */ C65165a m116853a(C65165a aVar, BlockStruct blockStruct, Exception exc, int i) {
        if ((i & 1) != 0) {
            blockStruct = aVar.f147061a;
        }
        if ((i & 2) != 0) {
            exc = aVar.f147062b;
        }
        return new C65165a(blockStruct, exc);
    }
}
