package com.p2082ss.android.ugc.aweme.main.page;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.main.page.a */
public final /* synthetic */ class C59112a implements AbstractC1214u {

    /* renamed from: a */
    private final AwemeChangeCallBack.AbstractC59111a f134516a;

    static {
        Covode.recordClassIndex(69464);
    }

    C59112a(AwemeChangeCallBack.AbstractC59111a aVar) {
        this.f134516a = aVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        AwemeChangeCallBack.AbstractC59111a aVar = this.f134516a;
        Aweme aweme = (Aweme) obj;
        if (aVar != null) {
            aVar.mo37101a(aweme);
        }
    }
}
