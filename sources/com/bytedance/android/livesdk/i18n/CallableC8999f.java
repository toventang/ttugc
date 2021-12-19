package com.bytedance.android.livesdk.i18n;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.i18n.f */
public final /* synthetic */ class CallableC8999f implements Callable {

    /* renamed from: a */
    private final I18nDbManager f22131a;

    /* renamed from: b */
    private final Map f22132b;

    /* renamed from: c */
    private final long f22133c;

    static {
        Covode.recordClassIndex(9896);
    }

    CallableC8999f(I18nDbManager i18nDbManager, Map map, long j) {
        this.f22131a = i18nDbManager;
        this.f22132b = map;
        this.f22133c = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f22131a.lambda$updateTranslations$3$I18nDbManager(this.f22132b, this.f22133c);
    }
}
