package com.bytedance.android.live.broadcast.preview.widget;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

public final class PreviewLoadEndWidget extends Widget implements AbstractC33974au {

    /* renamed from: a */
    public AbstractC89171a<C89391z> f9969a;

    static {
        Covode.recordClassIndex(4107);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bcj;
    }

    @Override // com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        AbstractC89171a<C89391z> aVar = this.f9969a;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
