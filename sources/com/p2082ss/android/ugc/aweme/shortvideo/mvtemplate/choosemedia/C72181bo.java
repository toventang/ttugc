package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.bo */
public final class C72181bo implements AbstractC72263v {

    /* renamed from: a */
    private final ActivityC0945e f161800a;

    static {
        Covode.recordClassIndex(84846);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114427a() {
    }

    public C72181bo(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        this.f161800a = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AbstractC72263v
    /* renamed from: a */
    public final void mo114428a(int i, Intent intent) {
        C89219l.m154721d(intent, "");
        C63244g.m114602a().mo73286n().mo120439a(this.f161800a, intent.getParcelableArrayListExtra("key_choose_media_data"), intent);
    }
}
