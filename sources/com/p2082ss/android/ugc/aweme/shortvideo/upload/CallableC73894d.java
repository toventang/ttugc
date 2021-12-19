package com.p2082ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73852c;
import dmt.p4542av.video.C88257f;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d */
public final /* synthetic */ class CallableC73894d implements Callable {

    /* renamed from: a */
    private final C73852c.C738531 f165903a;

    /* renamed from: b */
    private final VideoPublishEditModel f165904b;

    static {
        Covode.recordClassIndex(86640);
    }

    CallableC73894d(C73852c.C738531 r1, VideoPublishEditModel videoPublishEditModel) {
        this.f165903a = r1;
        this.f165904b = videoPublishEditModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C88257f.m153366a(this.f165904b, C73852c.this);
    }
}
