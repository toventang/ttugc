package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.common.wschannel.client.AbstractC13726j;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p912b.EnumC13655c;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.common.wschannel.i */
final class C13751i implements AbstractC13750h {

    /* renamed from: a */
    C13642a f33388a;

    /* renamed from: b */
    final AbstractC13651e f33389b;

    /* renamed from: c */
    final AbstractC13726j f33390c;

    /* renamed from: d */
    final Context f33391d;

    /* renamed from: e */
    SsWsApp f33392e;

    /* renamed from: f */
    EnumC13655c f33393f;

    /* renamed from: g */
    AtomicBoolean f33394g = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(15786);
    }

    @Override // com.bytedance.common.wschannel.AbstractC13750h
    /* renamed from: b */
    public final boolean mo22107b() {
        if (this.f33393f == EnumC13655c.CONNECTED) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.AbstractC13750h
    /* renamed from: a */
    public final void mo22104a() {
        this.f33390c.mo22081a(this.f33391d, this.f33388a.f33148a);
        this.f33394g.set(true);
    }

    @Override // com.bytedance.common.wschannel.AbstractC13750h
    /* renamed from: a */
    public final void mo22105a(C13642a aVar) {
        if (aVar == null || aVar.f33148a != this.f33388a.f33148a) {
            throw new IllegalArgumentException("channelId isn't the same");
        } else if (!this.f33394g.get()) {
            this.f33388a = aVar;
            SsWsApp a = C13756k.m24807a(aVar);
            this.f33392e = a;
            this.f33390c.mo22086b(this.f33391d, a);
        }
    }

    @Override // com.bytedance.common.wschannel.AbstractC13750h
    /* renamed from: a */
    public final void mo22106a(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg.f33475m != this.f33388a.f33148a) {
            throw new IllegalArgumentException("channelId isn't the same");
        } else if (!this.f33394g.get()) {
            this.f33390c.mo22083a(this.f33391d, new MainProcessMsg(wsChannelMsg, null));
        }
    }

    C13751i(Context context, AbstractC13726j jVar, C13642a aVar, AbstractC13651e eVar) {
        this.f33391d = context;
        this.f33390c = jVar;
        this.f33388a = aVar;
        this.f33389b = eVar;
        this.f33392e = C13756k.m24807a(aVar);
    }
}
