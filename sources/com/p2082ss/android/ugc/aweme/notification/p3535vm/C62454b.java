package com.p2082ss.android.ugc.aweme.notification.p3535vm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.vm.b */
public final class C62454b {

    /* renamed from: a */
    public final List<MusNotice> f141687a;

    /* renamed from: b */
    public final List<MusNotice> f141688b;

    /* renamed from: c */
    public final boolean f141689c;

    static {
        Covode.recordClassIndex(73244);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62454b)) {
            return false;
        }
        C62454b bVar = (C62454b) obj;
        return C89219l.m154714a(this.f141687a, bVar.f141687a) && C89219l.m154714a(this.f141688b, bVar.f141688b) && this.f141689c == bVar.f141689c;
    }

    public final int hashCode() {
        List<MusNotice> list = this.f141687a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<MusNotice> list2 = this.f141688b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f141689c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "InboxCombineAdapterData(data=" + this.f141687a + ", bottomData=" + this.f141688b + ", bottomHasMore=" + this.f141689c + ")";
    }

    public C62454b(List<MusNotice> list, List<MusNotice> list2, boolean z) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        this.f141687a = list;
        this.f141688b = list2;
        this.f141689c = z;
    }
}
