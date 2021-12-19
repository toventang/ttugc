package com.bytedance.ies.xelement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89214g;

public final class XElementConfigLite {
    private final AbstractC89172b<Context, DeclarativeVideoPlayBoxViewDelegate> declarativeVideoPlayBoxViewProvider;

    static {
        Covode.recordClassIndex(21680);
    }

    public final AbstractC89172b<Context, DeclarativeVideoPlayBoxViewDelegate> getDeclarativeVideoPlayBoxViewProvider() {
        return this.declarativeVideoPlayBoxViewProvider;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.b<? super android.content.Context, ? extends com.bytedance.ies.xelement.DeclarativeVideoPlayBoxViewDelegate> */
    /* JADX WARN: Multi-variable type inference failed */
    private XElementConfigLite(AbstractC89172b<? super Context, ? extends DeclarativeVideoPlayBoxViewDelegate> bVar) {
        this.declarativeVideoPlayBoxViewProvider = bVar;
    }

    public /* synthetic */ XElementConfigLite(AbstractC89172b bVar, C89214g gVar) {
        this(bVar);
    }
}
