package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.livesdk.C6912bl;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.c */
public final /* synthetic */ class C10543c implements AbstractC89172b {

    /* renamed from: a */
    private final RankEntranceWidget f25352a;

    static {
        Covode.recordClassIndex(12118);
    }

    C10543c(RankEntranceWidget rankEntranceWidget) {
        this.f25352a = rankEntranceWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        RankEntranceWidget rankEntranceWidget = this.f25352a;
        if (rankEntranceWidget.isViewValid() && rankEntranceWidget.f25213e != null) {
            rankEntranceWidget.f25213e.dismiss();
            if (C6912bl.f17297a) {
                rankEntranceWidget.f25213e = null;
            }
        }
        return C89391z.f203057a;
    }
}
