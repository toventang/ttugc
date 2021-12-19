package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33836o;
import com.p2082ss.android.ugc.aweme.commercialize.utils.AbstractC38757n;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.s */
public final /* synthetic */ class C38763s implements AbstractC1729g {

    /* renamed from: a */
    private final AbstractC38757n.AbstractC38758a f91536a;

    static {
        Covode.recordClassIndex(46304);
    }

    C38763s(AbstractC38757n.AbstractC38758a aVar) {
        this.f91536a = aVar;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        boolean z;
        AbstractC38757n.AbstractC38758a aVar = this.f91536a;
        if (C33836o.m69201a().f80094a.f121705b || System.currentTimeMillis() - C33836o.m69201a().f80094a.f121706c < 5000) {
            z = true;
        } else {
            z = false;
        }
        aVar.sendLog(z);
        return null;
    }
}
