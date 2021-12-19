package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1463m.C20336e;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78230a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78232c;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.aw */
public final class C78176aw {

    /* renamed from: a */
    static long f175576a;

    /* renamed from: b */
    public static int f175577b;

    /* renamed from: c */
    static boolean f175578c = true;

    /* renamed from: d */
    private static long f175579d;

    static {
        Covode.recordClassIndex(91291);
    }

    /* renamed from: a */
    public static final double m136660a(long j) {
        double currentTimeMillis = (double) (System.currentTimeMillis() - j);
        Double.isNaN(currentTimeMillis);
        double d = currentTimeMillis / 8.64E7d;
        C84911q.m145921a("DraftEditHelper -> sinceFirstSaveTime: saveTime = " + j + "; time = " + d + '}');
        return d;
    }

    /* renamed from: b */
    static final int m136663b(List<? extends C78230a> list) {
        int i = 0;
        for (C78230a aVar : list) {
            if (aVar.mo122123a() == 101 || aVar.mo122123a() == 106) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    private static long m136664c(List<?> list) {
        long[] a;
        C89219l.m154721d(list, "");
        Iterator it = new ArrayList(list).iterator();
        long j = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                a = new long[]{0, 0};
            } else {
                a = new C20336e(C20336e.C20341c.f48210a).mo33666a(next);
            }
            j += a[0] + a[1];
        }
        return j;
    }

    /* renamed from: a */
    public static final void m136662a(List<? extends C78230a> list) {
        C89219l.m154721d(list, "");
        long j = 0;
        for (C78230a aVar : list) {
            if (aVar.mo122123a() == 101 || aVar.mo122123a() == 106) {
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.draft.entity.DraftCommonDetails");
                j += ((C78232c) aVar).f175709f;
            }
        }
        C80322d.m139251a("tool_performance_draft_info", new C84425b().mo129403a("count", m136663b(list)).mo129404a("storage_size", j).f188764a);
    }

    /* renamed from: a */
    public static final void m136661a(int i, List<?> list) {
        C89219l.m154721d(list, "");
        if (f175578c && i == f175577b) {
            f175578c = false;
            f175579d = System.currentTimeMillis();
            C39162r.m79460a("load_drafts", new C84425b().mo129404a("duration", f175579d - f175576a).mo129404a("memorySize", m136664c(list)).f188764a);
            m136664c(list);
        }
    }
}
