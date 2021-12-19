package com.p2082ss.android.ugc.aweme.video.local;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.video.local.d */
public final /* synthetic */ class C80769d implements AbstractC1729g {

    /* renamed from: a */
    private final LocalVideoPlayerManager.AbstractC80753a f180593a;

    /* renamed from: b */
    private final String f180594b;

    static {
        Covode.recordClassIndex(94060);
    }

    C80769d(LocalVideoPlayerManager.AbstractC80753a aVar, String str) {
        this.f180593a = aVar;
        this.f180594b = str;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        LocalVideoPlayerManager.AbstractC80753a aVar = this.f180593a;
        String str = this.f180594b;
        if (iVar.mo5544c()) {
            aVar.mo96628a();
            return null;
        }
        aVar.mo96629a(str);
        return null;
    }
}
