package com.p2082ss.android.ugc.aweme.dmt_integration;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.C85041d;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.d */
final /* synthetic */ class C43081d implements C85052j.AbstractC85054b {

    /* renamed from: a */
    static final C85052j.AbstractC85054b f100422a = new C43081d();

    static {
        Covode.recordClassIndex(51234);
    }

    private C43081d() {
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.C85052j.AbstractC85054b
    /* renamed from: a */
    public final void mo73299a(Context context, String str, int i, int i2) {
        if (i2 == 1) {
            new C85041d(context, str, i, 1, C85041d.m146219a()).mo129984b();
        } else if (i2 != 2) {
            if (i2 != 3) {
                return;
            }
            C85041d.m146227b(context, str, i).mo129984b();
        }
        C85041d.m146223a(context, str, i).mo129984b();
        C85041d.m146227b(context, str, i).mo129984b();
    }
}
