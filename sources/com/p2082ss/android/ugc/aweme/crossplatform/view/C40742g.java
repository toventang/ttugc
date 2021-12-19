package com.p2082ss.android.ugc.aweme.crossplatform.view;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.g */
public final class C40742g {

    /* renamed from: a */
    final List<AbstractC40741f> f95398a = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.view.g$a */
    public enum EnumC40743a {
        LOAD_START,
        LOAD_FINISH;

        static {
            Covode.recordClassIndex(48595);
        }
    }

    static {
        Covode.recordClassIndex(48594);
    }

    /* renamed from: a */
    public final void mo69982a(AbstractC40741f fVar) {
        C89219l.m154721d(fVar, "");
        this.f95398a.add(fVar);
    }

    /* renamed from: a */
    public final void mo69983a(EnumC40743a aVar) {
        C89219l.m154721d(aVar, "");
        int i = C40744h.f95400a[aVar.ordinal()];
        if (i == 1) {
            Iterator<T> it = this.f95398a.iterator();
            while (it.hasNext()) {
                it.next().mo69632q();
            }
        } else if (i == 2) {
            Iterator<T> it2 = this.f95398a.iterator();
            while (it2.hasNext()) {
                it2.next().mo69654z();
            }
        }
    }
}
