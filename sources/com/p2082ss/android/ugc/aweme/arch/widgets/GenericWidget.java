package com.p2082ss.android.ugc.aweme.arch.widgets;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.GenericWidget */
public class GenericWidget extends Widget implements AbstractC1192f, AbstractC1214u<C33942b> {
    static {
        Covode.recordClassIndex(40857);
    }

    /* renamed from: a */
    public void onChanged(C33942b bVar) {
    }

    /* renamed from: b */
    public final void mo60182b() {
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final boolean ai_() {
        return super.ai_();
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onStart();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }
}
