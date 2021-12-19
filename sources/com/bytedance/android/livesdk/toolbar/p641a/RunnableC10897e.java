package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p603q.C10136a;
import com.bytedance.android.livesdk.toolbar.C10892a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.e */
final /* synthetic */ class RunnableC10897e implements Runnable {

    /* renamed from: a */
    private final C10896d f26187a;

    /* renamed from: b */
    private final DataChannel f26188b;

    /* renamed from: c */
    private final View f26189c;

    static {
        Covode.recordClassIndex(12505);
    }

    RunnableC10897e(C10896d dVar, DataChannel dataChannel, View view) {
        this.f26187a = dVar;
        this.f26188b = dataChannel;
        this.f26189c = view;
    }

    public final void run() {
        MethodCollector.m26663i(6273);
        C10896d dVar = this.f26187a;
        DataChannel dataChannel = this.f26188b;
        View view = this.f26189c;
        Boolean bool = (Boolean) dataChannel.mo28318b(C9114dz.class);
        if (bool != null && bool.booleanValue()) {
            C10892a.m19505a(dVar.f26184a);
        }
        FrameLayout frameLayout = (FrameLayout) view;
        frameLayout.addView(new C10136a(dVar.f26185b, dataChannel));
        frameLayout.setClipChildren(false);
        MethodCollector.m26664o(6273);
    }
}
