package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.AbstractBinderC11605a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.bgbroadcast.b */
public abstract class AbstractC3153b {

    /* renamed from: a */
    public final String f9127a = "BgBroadcastFragment";

    /* renamed from: b */
    public final Activity f9128b;

    /* renamed from: c */
    public final Room f9129c;

    /* renamed from: d */
    public final AbstractC3182f f9130d;

    /* renamed from: e */
    public final DataChannel f9131e;

    static {
        Covode.recordClassIndex(3634);
    }

    /* renamed from: a */
    public abstract void mo8440a();

    /* renamed from: a */
    public void mo8441a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo8442a(Bundle bundle) {
        C89219l.m154721d(bundle, "");
    }

    /* renamed from: a */
    public abstract void mo8444a(AbstractBinderC11605a aVar);

    /* renamed from: b */
    public abstract int mo8446b();

    /* renamed from: c */
    public abstract void mo8447c();

    /* renamed from: d */
    public abstract void mo8448d();

    /* renamed from: e */
    public abstract void mo8449e();

    /* renamed from: f */
    public abstract void mo8450f();

    /* renamed from: g */
    public abstract void mo8451g();

    /* renamed from: h */
    public abstract void mo8452h();

    /* renamed from: i */
    public abstract void mo8453i();

    public AbstractC3153b(Room room, AbstractC3182f fVar, DataChannel dataChannel) {
        C89219l.m154721d(room, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(dataChannel, "");
        this.f9129c = room;
        this.f9130d = fVar;
        this.f9131e = dataChannel;
        Activity i = fVar.mo8510i();
        C89219l.m154716b(i, "");
        this.f9128b = i;
    }
}
