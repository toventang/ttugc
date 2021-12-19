package com.p2082ss.android.ugc.aweme.shortvideo.publish.p3852a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65616g;
import com.p2082ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73938ac;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.a.f */
final /* synthetic */ class CallableC72584f implements Callable {

    /* renamed from: a */
    private final VideoPublishEditModel f162732a;

    /* renamed from: b */
    private final C65616g f162733b;

    /* renamed from: c */
    private final SynthetiseResult f162734c;

    static {
        Covode.recordClassIndex(85267);
    }

    CallableC72584f(VideoPublishEditModel videoPublishEditModel, C65616g gVar, SynthetiseResult synthetiseResult) {
        this.f162732a = videoPublishEditModel;
        this.f162733b = gVar;
        this.f162734c = synthetiseResult;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new C73938ac(this.f162732a, this.f162733b, this.f162734c).mo116385a();
    }
}
