package com.p2082ss.android.ugc.aweme.util;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.util.C80149o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.util.q */
public class C80158q implements C80149o.AbstractC80152a {

    /* renamed from: a */
    private Activity f179597a;

    /* renamed from: b */
    private ProgressDialogC66468a f179598b;

    static {
        Covode.recordClassIndex(93402);
    }

    @Override // com.p2082ss.android.ugc.aweme.util.C80149o.AbstractC80152a
    /* renamed from: a */
    public final void mo123600a() {
        Activity activity = this.f179597a;
        if (this.f179598b == null && activity != null) {
            ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(activity, activity.getResources().getString(R.string.fbq));
            this.f179598b = a;
            a.setIndeterminate(false);
        }
        ProgressDialogC66468a aVar = this.f179598b;
        if (aVar != null && !aVar.isShowing()) {
            this.f179598b.show();
            this.f179598b.mo105414a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.util.C80149o.AbstractC80152a
    /* renamed from: b */
    public final void mo123601b() {
        new C79459a(this.f179597a).mo123050a(R.string.fdl).mo123053a();
        ProgressDialogC66468a aVar = this.f179598b;
        if (aVar != null && aVar.isShowing()) {
            this.f179598b.dismiss();
        }
    }

    public C80158q(Activity activity) {
        this.f179597a = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.util.C80149o.AbstractC80152a
    /* renamed from: a */
    public void mo109545a(String str) {
        ProgressDialogC66468a aVar = this.f179598b;
        if (aVar != null && aVar.isShowing()) {
            this.f179598b.dismiss();
        }
    }
}
