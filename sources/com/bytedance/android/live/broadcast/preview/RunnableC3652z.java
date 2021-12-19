package com.bytedance.android.live.broadcast.preview;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.z */
final /* synthetic */ class RunnableC3652z implements Runnable {

    /* renamed from: a */
    private final C3561v f10074a;

    static {
        Covode.recordClassIndex(4164);
    }

    RunnableC3652z(C3561v vVar) {
        this.f10074a = vVar;
    }

    public final void run() {
        MethodCollector.m26663i(5908);
        C3561v vVar = this.f10074a;
        ViewGroup viewGroup = (ViewGroup) vVar.f9873c.findViewById(R.id.dqa);
        viewGroup.addView(vVar.f9876f.f9880c);
        viewGroup.addView(vVar.f9877g.f9880c);
        vVar.f9875e.mo8776a();
        MethodCollector.m26664o(5908);
    }
}
