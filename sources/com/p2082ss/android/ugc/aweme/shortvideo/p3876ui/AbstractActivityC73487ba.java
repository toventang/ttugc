package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ba */
public abstract class AbstractActivityC73487ba extends AbstractActivityC33414h implements AbstractC73757k {

    /* renamed from: e */
    private boolean f165113e;

    static {
        Covode.recordClassIndex(86224);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final String bz_() {
        return "video_shoot_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73757k
    public final boolean by_() {
        return this.f165113e;
    }

    public void finish() {
        this.f165113e = false;
        super.finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        this.f165113e = false;
        super.onDestroy();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f165113e = true;
    }
}
