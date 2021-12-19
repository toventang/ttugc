package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.AbstractC54313b;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.d */
public final /* synthetic */ class C54393d implements AbstractC54313b {

    /* renamed from: a */
    private final AbstractC54386c f124607a;

    static {
        Covode.recordClassIndex(64096);
    }

    C54393d(AbstractC54386c cVar) {
        this.f124607a = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.AbstractC54313b
    /* renamed from: a */
    public final void mo91398a(boolean z, int i) {
        Object obj;
        AbstractC54386c cVar = this.f124607a;
        if (cVar.f124585o != null && i < cVar.f124543b.size() && i >= 0 && (obj = cVar.f124543b.get(i)) != null) {
            List<C19538ai> value = cVar.f124585o.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            boolean contains = value.contains(obj);
            if (z) {
                if (!contains) {
                    value.add(obj);
                    cVar.f124585o.setValue(value);
                }
            } else if (contains) {
                value.remove(obj);
                cVar.f124585o.setValue(value);
            }
        }
    }
}
