package com.p2082ss.android.ugc.aweme.initializer;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

/* renamed from: com.ss.android.ugc.aweme.initializer.e */
final /* synthetic */ class C56775e implements ISuperEntrancePrivacyService {

    /* renamed from: a */
    static final ISuperEntrancePrivacyService f129334a = new C56775e();

    static {
        Covode.recordClassIndex(66640);
    }

    private C56775e() {
    }

    @Override // com.p2082ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService
    public final boolean hasPrivacyPermission(Context context) {
        return AVServiceProxyImpl.lambda$superEntrancePrivacyService$2$AVServiceProxyImpl(context);
    }
}
