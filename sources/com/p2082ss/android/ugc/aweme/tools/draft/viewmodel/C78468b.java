package com.p2082ss.android.ugc.aweme.tools.draft.viewmodel;

import com.bytedance.covode.number.Covode;
import java.util.Calendar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.viewmodel.b */
public final class C78468b {
    static {
        Covode.recordClassIndex(91597);
    }

    /* renamed from: a */
    public static final boolean m137002a(long j) {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        if (instance.getTimeInMillis() < j) {
            return true;
        }
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        instance2.setTimeInMillis(j);
        if (instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m137003b(long j) {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        instance2.setTimeInMillis(j);
        int i = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i <= 0 || i >= 7) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m137004c(long j) {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        instance2.setTimeInMillis(j);
        int i = instance.get(6) - instance2.get(6);
        if (instance.get(1) != instance2.get(1) || i < 7 || i >= 30) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m137005d(long j) {
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        instance2.setTimeInMillis(j);
        int i = instance.get(6) - instance2.get(6);
        if ((instance.get(1) != instance2.get(1) || i < 30) && instance2.get(1) >= instance.get(1)) {
            return false;
        }
        return true;
    }
}
