package com.bytedance.nita.api;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.p1555c.HandlerC21534a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import p4600h.p4611f.p4613b.C89219l;

public abstract class NitaActivityDynamicView extends AbstractC21527d implements AbstractC33974au {

    /* renamed from: a */
    private Activity f51101a;

    /* renamed from: b */
    private int f51102b = 1;

    /* renamed from: c */
    private AbstractC1204m f51103c;

    static {
        Covode.recordClassIndex(25163);
    }

    @Override // com.bytedance.nita.api.AbstractC21527d, com.bytedance.nita.api.AbstractC21525c
    /* renamed from: a */
    public final void mo35188a(View view, Activity activity) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(activity, "");
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: e */
    public final int mo35189e() {
        return 0;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.bytedance.nita.api.AbstractC21525c
    /* renamed from: c */
    public EnumC21528e mo35180c() {
        return EnumC21528e.AT_ONCE;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    private final void onDestroy() {
        String a = mo35178a();
        Activity activity = this.f51101a;
        if (activity == null) {
            C89219l.m154707a();
        }
        C89219l.m154719c(a, "");
        HandlerC21534a.m40473a(a, activity);
        this.f51101a = null;
        this.f51103c = null;
    }
}
