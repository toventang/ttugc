package com.p2082ss.android.ugc.aweme.discover.p2797ui;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.discover.ui.d */
public final /* synthetic */ class RunnableC42834d implements Runnable {

    /* renamed from: a */
    private final AbstractC42715b f99901a;

    static {
        Covode.recordClassIndex(50938);
    }

    RunnableC42834d(AbstractC42715b bVar) {
        this.f99901a = bVar;
    }

    public final void run() {
        AbstractC42715b bVar = this.f99901a;
        ActivityC0945e activity = bVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            bVar.mo72979t();
            bVar.f99631b.setText("");
            bVar.f99631b.requestFocus();
            bVar.f99631b.setSelection(0);
        }
    }
}
