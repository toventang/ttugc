package com.p2082ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.d */
public final class C37515d implements Serializable {
    @AbstractC27891c(mo46611a = "recall_reason")

    /* renamed from: a */
    private String f88547a = "";
    @AbstractC27891c(mo46611a = "card_predict_duration")

    /* renamed from: b */
    private int f88548b;
    @AbstractC27891c(mo46611a = "order_share_recommend")

    /* renamed from: c */
    private boolean f88549c;

    static {
        Covode.recordClassIndex(44903);
    }

    public final int getCardPredictDuration() {
        return this.f88548b;
    }

    public final String getRecallReason() {
        return this.f88547a;
    }

    public final boolean isOrderShareRecommend() {
        return this.f88549c;
    }

    public final void setCardPredictDuration(int i) {
        this.f88548b = i;
    }

    public final void setOrderShareRecommend(boolean z) {
        this.f88549c = z;
    }

    public final void setRecallReason(String str) {
        this.f88547a = str;
    }
}
