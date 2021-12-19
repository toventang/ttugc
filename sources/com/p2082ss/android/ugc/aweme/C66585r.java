package com.p2082ss.android.ugc.aweme;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.account.C31373a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.r */
public final /* synthetic */ class C66585r implements AbstractC33032b {

    /* renamed from: a */
    private final Bundle f149704a;

    static {
        Covode.recordClassIndex(78135);
    }

    C66585r(Bundle bundle) {
        this.f149704a = bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.util.AbstractC33032b
    /* renamed from: a */
    public final void mo58835a(Bundle bundle) {
        Bundle bundle2 = this.f149704a;
        if (bundle == null) {
            bundle = bundle2;
        }
        Activity j = C17873f.m33102j();
        if (!C31575b.m65862d().mo57197a().mo57200a(j, new C62689o(bundle))) {
            if (C80580in.m139687c()) {
                bundle.putBoolean("kids_mode_restart", true);
                ((AbstractC34817bf) C31291a.m65463a(AbstractC34817bf.class)).mo60099a(j);
            }
            C31373a.C31374a.m65591a(bundle);
        }
    }
}
