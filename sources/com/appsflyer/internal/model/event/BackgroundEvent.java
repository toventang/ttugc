package com.appsflyer.internal.model.event;

import com.appsflyer.AFEvent;
import com.appsflyer.AFHelper;
import com.bytedance.covode.number.Covode;

public abstract class BackgroundEvent extends AFEvent {

    /* renamed from: ɪ */
    private final boolean f7081;

    /* renamed from: ɾ */
    private final boolean f7082;

    /* renamed from: ӏ */
    private boolean f7083;

    static {
        Covode.recordClassIndex(2580);
    }

    public boolean proxyMode() {
        return this.f7082;
    }

    public boolean readResponse() {
        return this.f7081;
    }

    public boolean trackingStopped() {
        return this.f7083;
    }

    BackgroundEvent() {
        this(null, null, null, null, null);
    }

    public String body() {
        return AFHelper.convertToJsonObject(params()).toString();
    }

    public BackgroundEvent trackingStopped(boolean z) {
        this.f7083 = z;
        return this;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BackgroundEvent(java.lang.String r3, java.lang.Boolean r4, java.lang.Boolean r5, java.lang.Boolean r6, android.content.Context r7) {
        /*
            r2 = this;
            if (r6 == 0) goto L_0x0021
            boolean r0 = r6.booleanValue()
        L_0x0006:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r3, r0, r7)
            r1 = 1
            if (r4 == 0) goto L_0x001f
            boolean r0 = r4.booleanValue()
        L_0x0014:
            r2.f7081 = r0
            if (r5 == 0) goto L_0x001c
            boolean r1 = r5.booleanValue()
        L_0x001c:
            r2.f7082 = r1
            return
        L_0x001f:
            r0 = 1
            goto L_0x0014
        L_0x0021:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.model.event.BackgroundEvent.<init>(java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, android.content.Context):void");
    }
}
