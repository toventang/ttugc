package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.o */
public final /* synthetic */ class RunnableC63819o implements Runnable {

    /* renamed from: a */
    private final C63810k f144675a;

    /* renamed from: b */
    private final Aweme f144676b;

    /* renamed from: c */
    private final int f144677c;

    static {
        Covode.recordClassIndex(75241);
    }

    RunnableC63819o(C63810k kVar, Aweme aweme, int i) {
        this.f144675a = kVar;
        this.f144676b = aweme;
        this.f144677c = i;
    }

    public final void run() {
        C63810k kVar = this.f144675a;
        kVar.f144634a.mo103751a(this.f144676b.getAuthor());
        kVar.f144643n = true;
    }
}
