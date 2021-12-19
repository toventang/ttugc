package com.p2082ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.framework.services.SingletonProvider */
public class SingletonProvider<T> implements ServiceProvider<T> {
    volatile T service;
    ServiceProvider<T> serviceProvider;

    static {
        Covode.recordClassIndex(60678);
    }

    @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
    public synchronized T get() {
        T t;
        MethodCollector.m26663i(3489);
        if (this.service == null) {
            this.service = this.serviceProvider.get();
        }
        t = this.service;
        MethodCollector.m26664o(3489);
        return t;
    }

    SingletonProvider(ServiceProvider serviceProvider2) {
        this.serviceProvider = serviceProvider2;
    }
}
