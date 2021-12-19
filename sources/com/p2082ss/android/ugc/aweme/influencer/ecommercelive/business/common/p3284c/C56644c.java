package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3284c;

import android.os.Looper;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.C56658e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c.c */
public final class C56644c {
    static {
        Covode.recordClassIndex(66489);
    }

    /* renamed from: b */
    private static boolean m102644b() {
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (mainLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m102643a() {
        return C89219l.m154714a((Object) C56658e.m102660a().f129127a, (Object) true);
    }

    /* renamed from: a */
    public static final void m102642a(IIconSlot.SlotViewModel slotViewModel) {
        C89219l.m154721d(slotViewModel, "");
        C1213t<Boolean> tVar = slotViewModel.f15351b;
        C89219l.m154716b(tVar, "");
        m102641a(tVar);
    }

    /* renamed from: a */
    private static final void m102641a(C1213t<Boolean> tVar) {
        boolean a = m102643a();
        if (m102644b()) {
            tVar.setValue(Boolean.valueOf(a));
        } else {
            tVar.postValue(Boolean.valueOf(a));
        }
    }
}
