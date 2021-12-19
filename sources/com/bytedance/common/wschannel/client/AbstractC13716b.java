package com.bytedance.common.wschannel.client;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.client.C13717c;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.client.b */
public abstract class AbstractC13716b implements AbstractC13719d {

    /* renamed from: a */
    protected final C13717c.AbstractC13718a f33354a;

    static {
        Covode.recordClassIndex(15751);
    }

    public AbstractC13716b(C13717c.AbstractC13718a aVar) {
        this.f33354a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final EnumC13655c mo22078a(int i, int i2) {
        EnumC13655c cVar = EnumC13655c.CONNECTION_UNKNOWN;
        if (i2 == 0) {
            cVar = EnumC13655c.CONNECTION_UNKNOWN;
        } else if (i2 == 1) {
            cVar = EnumC13655c.CONNECTING;
        } else if (i2 == 2) {
            cVar = EnumC13655c.CONNECT_FAILED;
        } else if (i2 == 3) {
            cVar = EnumC13655c.CONNECT_CLOSED;
        } else if (i2 == 4) {
            cVar = EnumC13655c.CONNECTED;
        }
        Logger.debug();
        this.f33354a.mo22067a(i, cVar);
        return cVar;
    }
}
