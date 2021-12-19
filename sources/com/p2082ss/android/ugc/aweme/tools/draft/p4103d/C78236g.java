package com.p2082ss.android.ugc.aweme.tools.draft.p4103d;

import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.p2690cr.p2697d.p2698a.C40340a;
import com.p2082ss.android.ugc.aweme.tools.draft.C78212bg;
import java.util.Calendar;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.g */
public final class C78236g {
    static {
        Covode.recordClassIndex(91351);
    }

    /* renamed from: b */
    private static C43223c m136719b(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C40340a aVar = new C40340a();
        aVar.mo69486a(cVar);
        cVar.f100880C = aVar.mo69485a();
        return cVar;
    }

    /* renamed from: a */
    public static final String m136718a(C78237h hVar) {
        long j;
        C89219l.m154721d(hVar, "");
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        if (C78212bg.m136694a()) {
            j = hVar.f175729b.f175727g;
        } else {
            j = hVar.f175729b.f175726f;
        }
        instance2.setTimeInMillis(j);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return "today";
        }
        long timeInMillis = instance2.getTimeInMillis();
        BDDateFormat bDDateFormat = new BDDateFormat("L");
        Locale locale = Locale.getDefault();
        C89219l.m154716b(locale, "");
        return bDDateFormat.mo21223a(timeInMillis, locale);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78237h m136717a(com.p2082ss.android.ugc.aweme.draft.model.C43223c r16) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.draft.p4103d.C78236g.m136717a(com.ss.android.ugc.aweme.draft.model.c):com.ss.android.ugc.aweme.tools.draft.d.h");
    }
}
