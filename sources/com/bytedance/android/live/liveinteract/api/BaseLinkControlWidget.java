package com.bytedance.android.live.liveinteract.api;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

public abstract class BaseLinkControlWidget extends LiveWidget implements AbstractC4424c, AbstractC33974au {

    /* renamed from: com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget$a */
    public interface AbstractC4381a {
        static {
            Covode.recordClassIndex(4956);
        }

        /* renamed from: a */
        LiveWidget mo10142a(int i);

        /* renamed from: a */
        void mo10143a(LiveWidget liveWidget);
    }

    static {
        Covode.recordClassIndex(4955);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }
}
