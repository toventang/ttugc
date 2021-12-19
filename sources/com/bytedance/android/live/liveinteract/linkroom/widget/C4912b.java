package com.bytedance.android.live.liveinteract.linkroom.widget;

import com.bytedance.android.livesdk.chatroom.p488c.C7398o;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.widget.b */
final /* synthetic */ class C4912b implements AbstractC89172b {

    /* renamed from: a */
    private final LinkControlWidget f12871a;

    static {
        Covode.recordClassIndex(5495);
    }

    C4912b(LinkControlWidget linkControlWidget) {
        this.f12871a = linkControlWidget;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        LinkControlWidget linkControlWidget = this.f12871a;
        if (((C7398o) obj).f18328a == 4) {
            linkControlWidget.mo10635a(PrivacyCert.Builder.with("bpea-502").usage("").tag("link mic start to push stream").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        return C89391z.f203057a;
    }
}
