package com.p2082ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.s */
public final class C62281s {

    /* renamed from: a */
    public static final C62281s f141349a = new C62281s();

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.s$a */
    public static final class C62282a implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f141350a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f141351b;

        static {
            Covode.recordClassIndex(73056);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        public C62282a(Context context, RecordConfig.Builder builder) {
            this.f141350a = context;
            this.f141351b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f141350a, this.f141351b.build());
        }
    }

    private C62281s() {
    }

    static {
        Covode.recordClassIndex(73055);
    }
}
