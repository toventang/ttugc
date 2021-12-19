package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.ci */
public final /* synthetic */ class C50175ci implements MentionTextView.AbstractC81407d {

    /* renamed from: a */
    private final C50166cc f115850a;

    static {
        Covode.recordClassIndex(59301);
    }

    C50175ci(C50166cc ccVar) {
        this.f115850a = ccVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.views.MentionTextView.AbstractC81407d
    /* renamed from: a */
    public final boolean mo59077a(TextExtraStruct textExtraStruct) {
        return this.f115850a.f115829w == 0 && textExtraStruct.getType() == 5;
    }
}
