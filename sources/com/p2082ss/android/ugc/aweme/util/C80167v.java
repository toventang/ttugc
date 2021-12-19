package com.p2082ss.android.ugc.aweme.util;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.util.C80163u;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.v */
public class C80167v implements C80163u.AbstractC80165b {

    /* renamed from: a */
    private ProgressDialogC66468a f179607a;

    /* renamed from: b */
    private final Activity f179608b;

    static {
        Covode.recordClassIndex(93411);
    }

    @Override // com.p2082ss.android.ugc.aweme.util.C80163u.AbstractC80165b
    /* renamed from: b */
    public final void mo123611b() {
        new C79459a(this.f179608b).mo123050a(R.string.fdl).mo123053a();
        ProgressDialogC66468a aVar = this.f179607a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.util.C80163u.AbstractC80165b
    /* renamed from: a */
    public final void mo123610a() {
        if (this.f179607a == null) {
            Activity activity = this.f179608b;
            ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(activity, activity.getResources().getString(R.string.fbq));
            this.f179607a = a;
            if (a != null) {
                a.setIndeterminate(false);
            }
        }
        ProgressDialogC66468a aVar = this.f179607a;
        if (aVar != null && !aVar.isShowing()) {
            aVar.show();
            aVar.mo105414a();
        }
    }

    public C80167v(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f179608b = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.util.C80163u.AbstractC80165b
    /* renamed from: a */
    public void mo109546a(Uri uri) {
        ProgressDialogC66468a aVar = this.f179607a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }
}
