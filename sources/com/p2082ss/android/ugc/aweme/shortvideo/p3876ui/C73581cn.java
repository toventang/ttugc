package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cn */
public final /* synthetic */ class C73581cn implements IAVPublishExtension.Callback {

    /* renamed from: a */
    private final C73560cj f165385a;

    static {
        Covode.recordClassIndex(86318);
    }

    C73581cn(C73560cj cjVar) {
        this.f165385a = cjVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback
    public final void onContentModified() {
        this.f165385a.f165269L = true;
    }
}
