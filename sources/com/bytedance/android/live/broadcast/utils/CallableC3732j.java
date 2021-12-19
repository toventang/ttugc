package com.bytedance.android.live.broadcast.utils;

import com.bytedance.android.live.broadcast.utils.StickerImageUploader;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.broadcast.utils.j */
public final /* synthetic */ class CallableC3732j implements Callable {

    /* renamed from: a */
    private final StickerImageUploader f10329a;

    /* renamed from: b */
    private final StickerImageUploader.C3713c f10330b;

    static {
        Covode.recordClassIndex(4247);
    }

    CallableC3732j(StickerImageUploader stickerImageUploader, StickerImageUploader.C3713c cVar) {
        this.f10329a = stickerImageUploader;
        this.f10330b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return StickerImageUploader.m9215a(this.f10330b.f10288b);
    }
}
