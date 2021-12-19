package com.p2082ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.y */
final /* synthetic */ class C78472y implements AbstractC63264v.AbstractC63265a {

    /* renamed from: a */
    private final DraftBoxActivity f176350a;

    static {
        Covode.recordClassIndex(91601);
    }

    C78472y(DraftBoxActivity draftBoxActivity) {
        this.f176350a = draftBoxActivity;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63264v.AbstractC63265a
    /* renamed from: a */
    public final void mo87657a(String[] strArr, int[] iArr) {
        DraftBoxActivity draftBoxActivity = this.f176350a;
        if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
            new C79459a(draftBoxActivity).mo123050a(R.string.bby).mo123053a();
            draftBoxActivity.finish();
        } else if (iArr[0] == 0) {
            draftBoxActivity.mo122030g();
        } else {
            new C79459a(draftBoxActivity).mo123050a(R.string.bby).mo123053a();
            draftBoxActivity.finish();
        }
    }
}
