package com.p2082ss.android.ugc.aweme.discover.p2766b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.aweme.video.simplayer.ISimPlayerService$$CC;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.b.c */
public final class C41859c {

    /* renamed from: a */
    public int f97659a;

    /* renamed from: b */
    public List<AbstractC80747i> f97660b;

    /* renamed from: c */
    public AbstractC80747i f97661c;

    static {
        Covode.recordClassIndex(49785);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.b.c$a */
    public static class C41860a {

        /* renamed from: a */
        public static C41859c f97662a = new C41859c();

        static {
            Covode.recordClassIndex(49786);
        }
    }

    public C41859c() {
        int i;
        if (C41890j.m83914b()) {
            i = 4;
        } else if (C41890j.m83915c()) {
            i = 2;
        } else {
            i = 1;
        }
        this.f97659a = i;
        this.f97660b = new LinkedList();
        this.f97661c = new C81079v(ISimPlayerService$$CC.get$$STATIC$$().mo124396a());
    }

    /* renamed from: a */
    public final void mo71026a(AbstractC80747i iVar) {
        if (iVar != null) {
            iVar.mo123914H();
            try {
                iVar.mo123909C();
                this.f97660b.remove(iVar);
                this.f97660b.size();
            } catch (Exception unused) {
            }
        }
    }
}
