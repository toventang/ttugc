package com.p2082ss.ttvideoengine.p4426p;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4426p.AbstractC86608b;

/* renamed from: com.ss.ttvideoengine.p.c */
public final class C86610c implements AbstractC86608b {

    /* renamed from: a */
    public final String f195145a;

    /* renamed from: b */
    public final String f195146b;

    /* renamed from: c */
    public final String f195147c;

    static {
        Covode.recordClassIndex(101838);
    }

    @Override // com.p2082ss.ttvideoengine.p4426p.AbstractC86608b
    /* renamed from: a */
    public final AbstractC86608b.EnumC86609a mo137865a() {
        return AbstractC86608b.EnumC86609a.VID_PLAY_AUTH_TOKEN_SOURCE;
    }

    @Override // com.p2082ss.ttvideoengine.p4426p.AbstractC86608b
    /* renamed from: b */
    public final String mo137866b() {
        return this.f195145a;
    }

    public final String toString() {
        return "VidPlayAuthTokenSource{vid='" + this.f195145a + '\'' + ", playAuthToken='" + this.f195146b + '\'' + ", encodeType='" + this.f195147c + '\'' + '}';
    }
}
