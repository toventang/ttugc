package com.bytedance.common.wschannel.p912b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.b.b */
public final class C13654b {

    /* renamed from: a */
    public final EnumC13653a f33172a;

    /* renamed from: b */
    public final EnumC13655c f33173b;

    /* renamed from: c */
    public final int f33174c;

    static {
        Covode.recordClassIndex(15686);
    }

    public final String toString() {
        return "ConnectEvent{mType=" + this.f33172a + ", connectionState=" + this.f33173b + ", mChannelId=" + this.f33174c + '}';
    }

    public C13654b(EnumC13655c cVar, EnumC13653a aVar, int i) {
        this.f33173b = cVar;
        this.f33172a = aVar;
        this.f33174c = i;
    }
}
