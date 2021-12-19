package com.bytedance.android.p126a.p127a;

import android.view.View;
import com.bytedance.android.p126a.p127a.p131d.AbstractC2625a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2637a;
import com.bytedance.android.p126a.p127a.p134g.AbstractC2639c;
import com.bytedance.android.p126a.p127a.p135h.C2640a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.a.a.a */
public final class C2610a implements AbstractC2639c {

    /* renamed from: a */
    public Map<String, AbstractC2637a> f7855a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(2998);
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2639c
    /* renamed from: a */
    public final void mo7114a() {
        for (AbstractC2637a aVar : this.f7855a.values()) {
            if (aVar != null) {
                aVar.mo7114a();
            }
        }
    }

    @Override // com.bytedance.android.p126a.p127a.p134g.AbstractC2639c
    /* renamed from: a */
    public final void mo7115a(View view, AbstractC2625a aVar) {
        C2640a.m7643a("track_call_start:" + aVar.toString());
        String str = aVar.f7880b;
        AbstractC2637a aVar2 = this.f7855a.get(str);
        if (aVar2 == null) {
            C2640a.m7643a("track_tracker_invalid:no tracker available for ".concat(String.valueOf(str)));
        } else {
            aVar2.mo7115a(view, aVar);
        }
    }
}
