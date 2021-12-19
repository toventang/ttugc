package com.bytedance.android.livesdk.p442ai;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.livesdk.p442ai.C6718d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1206f.C17309b;

/* renamed from: com.bytedance.android.livesdk.ai.e */
final /* synthetic */ class RunnableC6722e implements Runnable {

    /* renamed from: a */
    private final C6718d.C67191 f16664a;

    /* renamed from: b */
    private final String f16665b;

    /* renamed from: c */
    private final Activity f16666c;

    /* renamed from: d */
    private final GLSurfaceView f16667d;

    static {
        Covode.recordClassIndex(7460);
    }

    RunnableC6722e(C6718d.C67191 r1, String str, Activity activity, GLSurfaceView gLSurfaceView) {
        this.f16664a = r1;
        this.f16665b = str;
        this.f16666c = activity;
        this.f16667d = gLSurfaceView;
    }

    public final void run() {
        ViewGroup viewGroup;
        MethodCollector.m26663i(11121);
        C6718d.C67191 r4 = this.f16664a;
        String str = this.f16665b;
        Activity activity = this.f16666c;
        GLSurfaceView gLSurfaceView = this.f16667d;
        AbstractC4354b.AbstractC4355a aVar = null;
        if (str != null) {
            C6718d.f16658a = str;
            C17309b.m32048a(activity, C17309b.f41588b).mo27619a("hardware_info_gpu_name", (Object) str).mo27621a();
            if (C6718d.this.f16661d != null) {
                aVar = C6718d.this.f16661d.get();
            }
            C6718d.m14265a(aVar, C6718d.f16658a);
        }
        if (!(C6718d.this.f16660c == null || (viewGroup = C6718d.this.f16660c.get()) == null)) {
            viewGroup.removeView(gLSurfaceView);
        }
        MethodCollector.m26664o(11121);
    }
}
