package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.j */
public final class C7178j extends AbstractC18334e<Object, Object> {

    /* renamed from: a */
    private AbstractC7179a f17874a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.j$a */
    public interface AbstractC7179a {
        static {
            Covode.recordClassIndex(7925);
        }

        /* renamed from: d */
        void mo13300d();
    }

    static {
        Covode.recordClassIndex(7924);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
    }

    public C7178j(AbstractC7179a aVar) {
        this.f17874a = aVar;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void invoke(Object obj, C18338g gVar) {
        AbstractC7179a aVar = this.f17874a;
        if (aVar != null) {
            aVar.mo13300d();
        }
    }
}
