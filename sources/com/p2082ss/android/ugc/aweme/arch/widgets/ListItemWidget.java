package com.p2082ss.android.ugc.aweme.arch.widgets;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.C33937a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.ListItemWidget */
public abstract class ListItemWidget<P extends C33937a> extends Widget implements AbstractC33974au {

    /* renamed from: a */
    public C33937a f80253a;

    static {
        Covode.recordClassIndex(40858);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public void mo60183a(C33937a aVar) {
        this.f80253a = aVar;
    }
}
