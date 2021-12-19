package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.di */
final /* synthetic */ class C50219di implements AbstractC88438k {

    /* renamed from: a */
    private final C50211dg f115971a;

    static {
        Covode.recordClassIndex(59345);
    }

    C50219di(C50211dg dgVar) {
        this.f115971a = dgVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        Aweme aweme = (Aweme) obj;
        return aweme.getExposeSharer() != null && !C50211dg.m94230a(aweme.getExposeSharer());
    }
}
