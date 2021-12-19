package com.p2082ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C69831ai;
import java.util.concurrent.CountDownLatch;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.video.e */
public final /* synthetic */ class C78570e implements AbstractC1729g {

    /* renamed from: a */
    private final C78567b f176565a;

    /* renamed from: b */
    private final C69831ai f176566b;

    /* renamed from: c */
    private final Object f176567c;

    /* renamed from: d */
    private final Context f176568d;

    /* renamed from: e */
    private final CountDownLatch f176569e;

    static {
        Covode.recordClassIndex(91704);
    }

    public C78570e(C78567b bVar, C69831ai aiVar, Object obj, Context context, CountDownLatch countDownLatch) {
        this.f176565a = bVar;
        this.f176566b = aiVar;
        this.f176567c = obj;
        this.f176568d = context;
        this.f176569e = countDownLatch;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        return C78567b.m137182a(this.f176566b, this.f176567c, this.f176568d, this.f176569e, iVar);
    }
}
