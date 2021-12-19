package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.b */
final /* synthetic */ class C54947b implements AbstractC1214u {

    /* renamed from: a */
    private final C54946a f125777a;

    static {
        Covode.recordClassIndex(64671);
    }

    C54947b(C54946a aVar) {
        this.f125777a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        C54946a aVar = this.f125777a;
        String str = (String) obj;
        C56244a.m102191c("DmHelper", "BaseStrangerListAdapter rev:".concat(String.valueOf(str)));
        C54948c cVar = new C54948c(aVar);
        if (aVar.f92236l != null) {
            for (int i = 0; i < aVar.f92236l.size(); i++) {
                try {
                    if (TextUtils.equals(((AbstractC56237a) aVar.f92236l.get(i)).bL_(), str)) {
                        cVar.accept(Integer.valueOf(i));
                        return;
                    }
                } catch (Exception e) {
                    C56244a.m102187a("BaseStrangerListAdapter", e);
                    return;
                }
            }
        }
    }
}
