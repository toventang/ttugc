package com.p2082ss.android.ugc.aweme.profile.widgets.navbar;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.EnumC65077d;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.b */
public final class C64965b implements AbstractC12853j {

    /* renamed from: a */
    public final List<EnumC65077d> f146803a;

    static {
        Covode.recordClassIndex(76433);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C64965b) && C89219l.m154714a(this.f146803a, ((C64965b) obj).f146803a);
        }
        return true;
    }

    public final int hashCode() {
        List<EnumC65077d> list = this.f146803a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProfileNavBarState(startAreaActionList=" + this.f146803a + ")";
    }

    public /* synthetic */ C64965b() {
        this(C89086z.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> */
    /* JADX WARN: Multi-variable type inference failed */
    private C64965b(List<? extends EnumC65077d> list) {
        C89219l.m154721d(list, "");
        this.f146803a = list;
    }
}
