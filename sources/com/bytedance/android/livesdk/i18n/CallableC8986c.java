package com.bytedance.android.livesdk.i18n;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.i18n.c */
public final /* synthetic */ class CallableC8986c implements Callable {

    /* renamed from: a */
    private final I18nDbManager f22113a;

    static {
        Covode.recordClassIndex(9881);
    }

    CallableC8986c(I18nDbManager i18nDbManager) {
        this.f22113a = i18nDbManager;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f22113a.lambda$queryTranslations$0$I18nDbManager();
    }
}
