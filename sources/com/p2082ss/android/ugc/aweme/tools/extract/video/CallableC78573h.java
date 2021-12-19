package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a;
import java.util.concurrent.Callable;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.h */
public final /* synthetic */ class CallableC78573h implements Callable {

    /* renamed from: a */
    private final AbstractC78487a f176576a;

    /* renamed from: b */
    private final Object f176577b;

    /* renamed from: c */
    private final C1743j f176578c;

    static {
        Covode.recordClassIndex(91707);
    }

    public CallableC78573h(AbstractC78487a aVar, Object obj, C1743j jVar) {
        this.f176576a = aVar;
        this.f176577b = obj;
        this.f176578c = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        AbstractC78487a aVar = this.f176576a;
        aVar.mo122409a(new C78574i(this.f176577b, aVar, this.f176578c));
        return null;
    }
}
