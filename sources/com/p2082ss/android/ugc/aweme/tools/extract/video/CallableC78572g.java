package com.p2082ss.android.ugc.aweme.tools.extract.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.extract.C78529e;
import java.util.concurrent.Callable;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.g */
final /* synthetic */ class CallableC78572g implements Callable {

    /* renamed from: a */
    private final Object f176574a;

    /* renamed from: b */
    private final C1743j f176575b;

    static {
        Covode.recordClassIndex(91706);
    }

    CallableC78572g(Object obj, C1743j jVar) {
        this.f176574a = obj;
        this.f176575b = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = this.f176574a;
        C1743j jVar = this.f176575b;
        if (obj instanceof VideoPublishEditModel) {
            new C78529e((VideoPublishEditModel) obj).mo122409a(new C78575j(jVar));
        } else {
            jVar.mo5557b((Object) null);
        }
        return null;
    }
}
