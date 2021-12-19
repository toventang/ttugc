package com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.e */
public final class C76021e implements AbstractC72263v {

    /* renamed from: a */
    private final Activity f170801a;

    static {
        Covode.recordClassIndex(88965);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    public C76021e(Activity activity) {
        this.f170801a = activity;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        C89219l.m154721d(intent, "");
        Activity activity = this.f170801a;
        if (activity != null) {
            activity.setResult(-1, intent);
            this.f170801a.finish();
            this.f170801a.overridePendingTransition(0, R.anim.x);
        }
    }
}
