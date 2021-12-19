package com.bytedance.android.livesdk.p656w;

import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.w.h */
public final /* synthetic */ class C11308h implements AbstractC88983w {

    /* renamed from: a */
    private final List f27041a;

    static {
        Covode.recordClassIndex(12945);
    }

    C11308h(List list) {
        this.f27041a = list;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        for (AbstractC6571a aVar : this.f27041a) {
            if (aVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("msg_id", Long.valueOf(aVar.getMessageId()));
                hashMap.put("msg_type", aVar.getClass().getSimpleName());
                hashMap.put("msg_time", Long.valueOf(aVar.f28132M));
                C6555i.m14021b().mo9215a("ttlive_msgtype", hashMap);
            }
        }
    }
}
