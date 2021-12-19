package com.bytedance.android.livesdk.chatroom.p481b;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.utils.EnumC11229b;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.b.w */
public final /* synthetic */ class RunnableC7326w implements Runnable {

    /* renamed from: a */
    private final C7307f f18185a;

    static {
        Covode.recordClassIndex(8089);
    }

    RunnableC7326w(C7307f fVar) {
        this.f18185a = fVar;
    }

    public final void run() {
        LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), EnumC11229b.CMAF);
        LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), EnumC11229b.QUIC);
        LiveAppBundleUtils.ensurePluginAvailable(((IHostContext) C6193a.m13435a(IHostContext.class)).context(), EnumC11229b.RTS);
    }
}
