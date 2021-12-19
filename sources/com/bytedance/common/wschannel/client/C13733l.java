package com.bytedance.common.wschannel.client;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.C13758l;
import com.bytedance.common.wschannel.client.AbstractC13726j;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.C13786f;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.wschannel.client.l */
public final class C13733l implements AbstractC13726j {
    static {
        Covode.recordClassIndex(15768);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22084a(Context context, boolean z) {
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22080a(Context context) {
        m24757b(context, 1);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: b */
    public final void mo22085b(Context context) {
        m24757b(context, 2);
    }

    /* renamed from: a */
    private static void m24756a(Context context, AbstractC13726j.C13727a aVar) {
        Message obtain = Message.obtain();
        obtain.what = aVar.f33359c;
        obtain.getData().putParcelable(aVar.f33357a, aVar.f33358b);
        C13786f.m24873a(context).handleMsg(obtain);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: b */
    public final void mo22086b(Context context, SsWsApp ssWsApp) {
        if (C13758l.m24811a(context).mo22109a()) {
            AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
            aVar.f33357a = "ws_app";
            aVar.f33358b = ssWsApp;
            aVar.f33359c = 4;
            m24756a(context, aVar);
        }
    }

    /* renamed from: b */
    private static void m24757b(Context context, int i) {
        if (context != null && i > 0 && i <= 3) {
            Logger.debug();
            if (C13758l.m24811a(context).mo22109a()) {
                Message message = new Message();
                message.what = 2;
                message.arg1 = i;
                C13786f.m24873a(context).handleMsg(message);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22081a(Context context, int i) {
        AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
        aVar.f33357a = "ws_app";
        aVar.f33358b = new IntegerParcelable(i);
        aVar.f33359c = 1;
        m24756a(context, aVar);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22082a(Context context, SsWsApp ssWsApp) {
        AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
        aVar.f33357a = "ws_app";
        aVar.f33358b = ssWsApp;
        aVar.f33359c = 0;
        m24756a(context, aVar);
    }

    @Override // com.bytedance.common.wschannel.client.AbstractC13726j
    /* renamed from: a */
    public final void mo22083a(Context context, WsChannelMsg wsChannelMsg) {
        AbstractC13726j.C13727a aVar = new AbstractC13726j.C13727a();
        aVar.f33357a = "payload";
        aVar.f33358b = wsChannelMsg;
        aVar.f33359c = 5;
        m24756a(context, aVar);
    }
}
