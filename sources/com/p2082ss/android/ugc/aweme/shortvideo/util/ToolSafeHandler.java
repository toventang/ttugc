package com.p2082ss.android.ugc.aweme.shortvideo.util;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler */
public class ToolSafeHandler extends SafeHandler {

    /* renamed from: b */
    private boolean f165992b;

    static {
        Covode.recordClassIndex(86678);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler$1 */
    static /* synthetic */ class C739301 {

        /* renamed from: a */
        static final /* synthetic */ int[] f165993a;

        static {
            Covode.recordClassIndex(86679);
            int[] iArr = new int[AbstractC1196i.EnumC1198a.values().length];
            f165993a = iArr;
            try {
                iArr[AbstractC1196i.EnumC1198a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ToolSafeHandler(AbstractC1204m mVar) {
        super(mVar);
    }

    /* renamed from: a */
    public final void mo116380a(Runnable runnable) {
        if (!this.f165992b) {
            post(runnable);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (C739301.f165993a[aVar.ordinal()] == 1) {
            mo109999a();
            this.f165992b = true;
        }
    }
}
