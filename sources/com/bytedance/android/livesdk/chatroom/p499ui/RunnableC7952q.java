package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.q */
final /* synthetic */ class RunnableC7952q implements Runnable {

    /* renamed from: a */
    private final AbstractC7703a f19772a;

    static {
        Covode.recordClassIndex(8747);
    }

    RunnableC7952q(AbstractC7703a aVar) {
        this.f19772a = aVar;
    }

    public final void run() {
        AbstractC7703a aVar = this.f19772a;
        ActivityC0945e activity = aVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(aVar.getActivity());
            aVar2.f22244a = C3966y.m9657a((int) R.string.efb);
            aVar2.f22245b = C3966y.m9657a((int) R.string.ef_);
            DialogC9148b a = aVar2.mo15245a((CharSequence) C3966y.m9657a((int) R.string.efc), (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7955t(activity), false).mo15250b((CharSequence) C3966y.m9657a((int) R.string.efa), DialogInterface$OnClickListenerC7956u.f19776a, false).mo15247a();
            a.setOnCancelListener(DialogInterface$OnCancelListenerC7957v.f19777a);
            a.show();
            C6806c.m14603a((C6800c) AbstractC6804a.f17044cr, (Object) true);
        }
    }
}
