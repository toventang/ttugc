package com.appsflyer.internal.model.event;

import com.bytedance.covode.number.Covode;

public class ProxyEvent extends BackgroundEvent {

    /* renamed from: ɾ */
    private String f7084;

    static {
        Covode.recordClassIndex(2585);
    }

    @Override // com.appsflyer.internal.model.event.BackgroundEvent
    public String body() {
        return this.f7084;
    }

    public ProxyEvent() {
        super(null, null, Boolean.FALSE, null, null);
    }

    public BackgroundEvent body(String str) {
        this.f7084 = str;
        return this;
    }
}
