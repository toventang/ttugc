package com.p2082ss.android.ugc.awemepushlib.interaction;

import com.bytedance.covode.number.Covode;
import com.bytedance.push.p1590c.AbstractC21771b;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.p2203ug.bus.C30981c;
import com.p2082ss.android.p2203ug.bus.p2204a.AbstractC30974a;
import com.p2082ss.android.p2203ug.bus.p2204a.p2205a.C30976a;
import com.p2082ss.android.p2203ug.bus.p2204a.p2205a.C30977b;
import com.p2082ss.android.p2203ug.bus.p2204a.p2205a.C30978c;
import com.p2082ss.android.p2203ug.bus.p2204a.p2206b.C30979a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.h */
final class C81865h implements AbstractC21771b {
    static {
        Covode.recordClassIndex(95279);
    }

    C81865h() {
    }

    @Override // com.bytedance.push.p1590c.AbstractC21771b
    /* renamed from: a */
    public final String mo35412a() {
        C31575b.m65859a();
        return C31575b.f75524a.mo57069e().getCurSecUserId();
    }

    @Override // com.bytedance.push.p1590c.AbstractC21771b
    /* renamed from: b */
    public final List<String> mo35414b() {
        AbstractC30974a aVar = (AbstractC30974a) C30980b.m63694a(AbstractC30974a.class);
        if (aVar == null) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList arrayList = new ArrayList();
        aVar.mo51305a(new AbstractC30974a.AbstractC30975a() {
            /* class com.p2082ss.android.ugc.awemepushlib.interaction.C81865h.C818661 */

            static {
                Covode.recordClassIndex(95280);
            }

            @Override // com.p2082ss.android.p2203ug.bus.p2204a.AbstractC30974a.AbstractC30975a
            /* renamed from: a */
            public final void mo35523a() {
                countDownLatch.countDown();
            }

            @Override // com.p2082ss.android.p2203ug.bus.p2204a.AbstractC30974a.AbstractC30975a
            /* renamed from: a */
            public final void mo35524a(List<C30979a> list) {
                for (C30979a aVar : list) {
                    arrayList.add(aVar.f74258b);
                }
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.bytedance.push.p1590c.AbstractC21771b
    /* renamed from: a */
    public final void mo35413a(C30981c.AbstractC30984a<C30976a> aVar) {
        C30981c.m63696a(null, aVar);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21771b
    /* renamed from: b */
    public final void mo35415b(C30981c.AbstractC30984a<C30977b> aVar) {
        C30981c.m63696a(null, aVar);
    }

    @Override // com.bytedance.push.p1590c.AbstractC21771b
    /* renamed from: c */
    public final void mo35416c(C30981c.AbstractC30984a<C30978c> aVar) {
        C30981c.m63696a(null, aVar);
    }
}
