package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateViewModel$$Lambda$1 */
public final /* synthetic */ class SearchStateViewModel$$Lambda$1 implements Runnable {
    private final SearchStateViewModel arg$1;
    private final boolean arg$2;

    static {
        Covode.recordClassIndex(50518);
    }

    SearchStateViewModel$$Lambda$1(SearchStateViewModel searchStateViewModel, boolean z) {
        this.arg$1 = searchStateViewModel;
        this.arg$2 = z;
    }

    public final void run() {
        this.arg$1.lambda$setIsLeavingSearch$1$SearchStateViewModel(this.arg$2);
    }
}
