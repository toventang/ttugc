package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.widget.ListView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49647n;
import com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49650q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.i */
public final class C50307i extends ListView implements AbstractC49647n {

    /* renamed from: a */
    private AbstractC49650q f116163a;

    static {
        Covode.recordClassIndex(59434);
    }

    public final AbstractC49650q getOptionClickListener() {
        return this.f116163a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.helper.AbstractC49647n
    public final void setOptionListener(AbstractC49650q qVar) {
        C89219l.m154721d(qVar, "");
        this.f116163a = qVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C50307i(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4221);
        MethodCollector.m26664o(4221);
    }
}
