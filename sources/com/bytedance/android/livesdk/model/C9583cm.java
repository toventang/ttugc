package com.bytedance.android.livesdk.model;

import com.bytedance.android.livesdk.model.message.p579c.C9716r;
import com.bytedance.android.p150e.p151a.p152a.AbstractC2724b;
import com.bytedance.android.p150e.p151a.p152a.C2730f;
import com.bytedance.android.p150e.p151a.p152a.C2731g;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.cm */
public final class C9583cm implements AbstractC2724b<WarningTag> {
    static {
        Covode.recordClassIndex(11122);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.android.p150e.p151a.p152a.AbstractC2724b
    /* renamed from: a */
    public final /* synthetic */ WarningTag mo7304a(C2730f fVar) {
        return m17917b(fVar);
    }

    /* renamed from: b */
    public static WarningTag m17917b(C2730f fVar) {
        WarningTag warningTag = new WarningTag();
        long a = fVar.mo7307a();
        while (true) {
            int b = fVar.mo7310b();
            if (b == -1) {
                fVar.mo7309a(a);
                return warningTag;
            } else if (b == 1) {
                warningTag.text = C9716r.m18010b(fVar);
            } else if (b == 2) {
                warningTag.duration = Long.valueOf(fVar.mo7314f());
            } else if (b != 3) {
                C2731g.m7903c(fVar);
            } else {
                warningTag.tagSource = fVar.mo7313e();
            }
        }
    }
}
