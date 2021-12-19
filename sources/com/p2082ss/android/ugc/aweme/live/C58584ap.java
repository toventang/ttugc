package com.p2082ss.android.ugc.aweme.live;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.slot.AbstractC6190x;
import com.bytedance.android.live.slot.AbstractC6191y;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.ap */
public final class C58584ap implements AbstractC58726o {
    static {
        Covode.recordClassIndex(68879);
    }

    /* renamed from: com.ss.android.ugc.aweme.live.ap$a */
    static class C58585a {

        /* renamed from: a */
        static C58584ap f133446a = new C58584ap();

        static {
            Covode.recordClassIndex(68880);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58726o
    /* renamed from: a */
    public final void mo96043a(AbstractC6190x xVar) {
        ISlotService iSlotService = (ISlotService) C6193a.m13435a(ISlotService.class);
        if (iSlotService != null) {
            iSlotService.registerAggregateSlot(xVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.live.AbstractC58726o
    /* renamed from: a */
    public final void mo96044a(AbstractC6191y yVar) {
        ISlotService iSlotService = (ISlotService) C6193a.m13435a(ISlotService.class);
        if (iSlotService != null) {
            if (!iSlotService.isBizTypeRegistered(yVar.mo12101c())) {
                iSlotService.registerSlot(yVar);
                return;
            }
            throw new IllegalStateException("The bizType can not register to LiveSlot twice!");
        }
    }
}
