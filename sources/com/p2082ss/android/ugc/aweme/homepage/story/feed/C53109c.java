package com.p2082ss.android.ugc.aweme.homepage.story.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.feed.c */
public final class C53109c {

    /* renamed from: a */
    public final List<Long> f122124a;

    /* renamed from: b */
    public final List<Aweme> f122125b;

    /* renamed from: c */
    public final String f122126c;

    static {
        Covode.recordClassIndex(62655);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53109c)) {
            return false;
        }
        C53109c cVar = (C53109c) obj;
        return C89219l.m154714a(this.f122124a, cVar.f122124a) && C89219l.m154714a(this.f122125b, cVar.f122125b) && C89219l.m154714a(this.f122126c, cVar.f122126c);
    }

    public final int hashCode() {
        List<Long> list = this.f122124a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Aweme> list2 = this.f122125b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f122126c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SidebarPreloadData(uidList=" + this.f122124a + ", preloadUserStories=" + this.f122125b + ", reqId=" + this.f122126c + ")";
    }

    public /* synthetic */ C53109c() {
        this(C89086z.INSTANCE, C89086z.INSTANCE, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    private C53109c(List<Long> list, List<? extends Aweme> list2, String str) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(str, "");
        this.f122124a = list;
        this.f122125b = list2;
        this.f122126c = str;
    }

    /* renamed from: a */
    public static /* synthetic */ C53109c m98145a(C53109c cVar, List list, List list2, String str, int i) {
        if ((i & 1) != 0) {
            list = cVar.f122124a;
        }
        if ((i & 2) != 0) {
            list2 = cVar.f122125b;
        }
        if ((i & 4) != 0) {
            str = cVar.f122126c;
        }
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(str, "");
        return new C53109c(list, list2, str);
    }
}
