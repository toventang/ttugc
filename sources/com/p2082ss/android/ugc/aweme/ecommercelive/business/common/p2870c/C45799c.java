package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c;

import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2874c.C45810a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.c.c */
public final class C45799c {
    static {
        Covode.recordClassIndex(54317);
    }

    /* renamed from: b */
    private static boolean m88412b() {
        Looper mainLooper = Looper.getMainLooper();
        C89219l.m154716b(mainLooper, "");
        if (mainLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m88410a() {
        return C45810a.m88427a().mo93516a();
    }

    /* renamed from: a */
    public static final void m88408a(IFrameSlot.SlotViewModel slotViewModel, boolean z) {
        C89219l.m154721d(slotViewModel, "");
        C1213t<Pair<Boolean, String>> tVar = slotViewModel.f15346a;
        C89219l.m154716b(tVar, "");
        m88411b(tVar, z);
    }

    /* renamed from: a */
    public static final void m88409a(IIconSlot.SlotViewModel slotViewModel, boolean z) {
        C89219l.m154721d(slotViewModel, "");
        C1213t<Boolean> tVar = slotViewModel.f15351b;
        C89219l.m154716b(tVar, "");
        m88407a(tVar, z);
    }

    /* renamed from: a */
    private static final void m88407a(C1213t<Boolean> tVar, boolean z) {
        boolean z2;
        if (!z || !m88410a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (m88412b()) {
            tVar.setValue(Boolean.valueOf(z2));
        } else {
            tVar.postValue(Boolean.valueOf(z2));
        }
    }

    /* renamed from: b */
    private static final void m88411b(C1213t<Pair<Boolean, String>> tVar, boolean z) {
        boolean z2;
        if (!z || !m88410a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (m88412b()) {
            tVar.setValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        } else {
            tVar.postValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        }
    }
}
