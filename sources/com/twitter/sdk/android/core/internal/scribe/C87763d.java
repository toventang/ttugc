package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ScheduledExecutorService;

/* access modifiers changed from: package-private */
/* renamed from: com.twitter.sdk.android.core.internal.scribe.d */
public final class C87763d extends AbstractC87762c<C87787v> {

    /* renamed from: f */
    private final AbstractC87778q f199341f;

    static {
        Covode.recordClassIndex(103761);
    }

    @Override // com.twitter.sdk.android.core.internal.scribe.AbstractC87776o
    /* renamed from: d */
    public final AbstractC87778q mo142214d() {
        return this.f199341f;
    }

    C87763d(Context context, ScheduledExecutorService scheduledExecutorService, C87790x xVar, C87786u uVar, ScribeFilesSender scribeFilesSender) {
        super(context, scheduledExecutorService, xVar);
        this.f199341f = scribeFilesSender;
        mo142215a(uVar.f199409h);
    }
}
