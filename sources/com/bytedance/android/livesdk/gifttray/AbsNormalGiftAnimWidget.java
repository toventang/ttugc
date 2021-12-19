package com.bytedance.android.livesdk.gifttray;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.model.message.C9623av;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class AbsNormalGiftAnimWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    public boolean f21818a;

    static {
        Covode.recordClassIndex(9748);
    }

    /* renamed from: a */
    public abstract void mo15101a();

    /* renamed from: a */
    public abstract void mo15102a(C9623av avVar);

    /* renamed from: a */
    public abstract void mo15103a(C9895y yVar);

    /* renamed from: b */
    public abstract void mo15104b();

    /* renamed from: b */
    public abstract void mo15105b(C9895y yVar);

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}
