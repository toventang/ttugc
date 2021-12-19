package com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.e */
public final class C65125e implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<RecommendList> f146999a;

    /* renamed from: b */
    public final RecommendList f147000b;

    /* renamed from: c */
    public final long f147001c;

    /* renamed from: d */
    public final List<String> f147002d;

    /* renamed from: e */
    public final boolean f147003e;

    /* renamed from: f */
    public final int f147004f;

    /* renamed from: g */
    public final int f147005g;

    static {
        Covode.recordClassIndex(76594);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65125e)) {
            return false;
        }
        C65125e eVar = (C65125e) obj;
        return C89219l.m154714a(this.f146999a, eVar.f146999a) && C89219l.m154714a(this.f147000b, eVar.f147000b) && this.f147001c == eVar.f147001c && C89219l.m154714a(this.f147002d, eVar.f147002d) && this.f147003e == eVar.f147003e && this.f147004f == eVar.f147004f && this.f147005g == eVar.f147005g;
    }

    public final String toString() {
        return "RecommendUserState(request=" + this.f146999a + ", data=" + this.f147000b + ", lastClickTime=" + this.f147001c + ", mobUsers=" + this.f147002d + ", isShowRecommendCardByFollowAction=" + this.f147003e + ", recommendUserCardUIState=" + this.f147004f + ", clickWhenRecommendFriendEmptyCount=" + this.f147005g + ")";
    }

    public /* synthetic */ C65125e() {
        this(C12797s.f31127a, null, 0, new ArrayList(), false, -1, 0);
    }

    public final int hashCode() {
        int i;
        int i2;
        AbstractC12783f<RecommendList> fVar = this.f146999a;
        int i3 = 0;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        RecommendList recommendList = this.f147000b;
        if (recommendList != null) {
            i2 = recommendList.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f147001c;
        int i5 = (((i4 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        List<String> list = this.f147002d;
        if (list != null) {
            i3 = list.hashCode();
        }
        int i6 = (i5 + i3) * 31;
        boolean z = this.f147003e;
        if (z) {
            z = true;
        }
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        return ((((i6 + i7) * 31) + this.f147004f) * 31) + this.f147005g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.friends.model.RecommendList> */
    /* JADX WARN: Multi-variable type inference failed */
    private C65125e(AbstractC12783f<? extends RecommendList> fVar, RecommendList recommendList, long j, List<String> list, boolean z, int i, int i2) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
        this.f146999a = fVar;
        this.f147000b = recommendList;
        this.f147001c = j;
        this.f147002d = list;
        this.f147003e = z;
        this.f147004f = i;
        this.f147005g = i2;
    }

    /* renamed from: a */
    public static /* synthetic */ C65125e m116833a(C65125e eVar, AbstractC12783f fVar, RecommendList recommendList, long j, List list, boolean z, int i, int i2, int i3) {
        boolean z2 = z;
        int i4 = i;
        AbstractC12783f fVar2 = fVar;
        int i5 = i2;
        RecommendList recommendList2 = recommendList;
        List list2 = list;
        long j2 = j;
        if ((i3 & 1) != 0) {
            fVar2 = eVar.f146999a;
        }
        if ((i3 & 2) != 0) {
            recommendList2 = eVar.f147000b;
        }
        if ((i3 & 4) != 0) {
            j2 = eVar.f147001c;
        }
        if ((i3 & 8) != 0) {
            list2 = eVar.f147002d;
        }
        if ((i3 & 16) != 0) {
            z2 = eVar.f147003e;
        }
        if ((i3 & 32) != 0) {
            i4 = eVar.f147004f;
        }
        if ((i3 & 64) != 0) {
            i5 = eVar.f147005g;
        }
        C89219l.m154721d(fVar2, "");
        C89219l.m154721d(list2, "");
        return new C65125e(fVar2, recommendList2, j2, list2, z2, i4, i5);
    }
}
