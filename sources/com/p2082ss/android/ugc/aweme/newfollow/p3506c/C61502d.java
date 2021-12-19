package com.p2082ss.android.ugc.aweme.newfollow.p3506c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.d */
public final class C61502d {

    /* renamed from: a */
    private List<AbstractC80747i> f139612a = new LinkedList();

    static {
        Covode.recordClassIndex(72159);
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.c.d$a */
    public static class C61503a {

        /* renamed from: a */
        public static C61502d f139613a = new C61502d();

        static {
            Covode.recordClassIndex(72160);
        }
    }

    /* renamed from: a */
    public final AbstractC80747i mo99158a() {
        if (this.f139612a.size() >= 8) {
            this.f139612a.size();
            List<AbstractC80747i> list = this.f139612a;
            AbstractC80747i iVar = list.get(list.size() - 1);
            iVar.mo123914H();
            iVar.mo123909C();
            List<AbstractC80747i> list2 = this.f139612a;
            list2.remove(list2.size() - 1);
        }
        C81079v vVar = new C81079v();
        this.f139612a.add(vVar);
        this.f139612a.size();
        return vVar;
    }
}
