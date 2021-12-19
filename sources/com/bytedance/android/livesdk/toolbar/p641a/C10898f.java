package com.bytedance.android.livesdk.toolbar.p641a;

import android.view.View;
import com.bytedance.android.live.design.view.AbstractC4084b;
import com.bytedance.android.live.gift.C4332h;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.toolbar.C10905d;
import com.bytedance.android.livesdk.toolbar.C10908e;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.toolbar.a.f */
public final class C10898f implements AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    C10908e f26190a;

    /* renamed from: b */
    DataChannel f26191b;

    /* renamed from: c */
    final C88411a f26192c = new C88411a();

    /* renamed from: d */
    Boolean f26193d = false;

    /* renamed from: e */
    final AbstractC4084b f26194e = new C10899g(this);

    /* renamed from: f */
    final AbstractC88433f<C4332h> f26195f = new C10900h(this);

    static {
        Covode.recordClassIndex(12506);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    public C10898f(DataChannel dataChannel) {
        this.f26191b = dataChannel;
    }

    public final void onClick(View view) {
        EnumC11728i iVar;
        if (this.f26191b != null) {
            C8803g gVar = new C8803g();
            gVar.f21680b = "icon";
            this.f26191b.mo28320c(C4344t.class, gVar);
        }
        DataChannel dataChannel = this.f26191b;
        if (dataChannel != null) {
            dataChannel.mo28319c(C4343s.class);
            if (((Boolean) this.f26191b.mo28318b(C9119ed.class)).booleanValue()) {
                Room room = (Room) this.f26191b.mo28318b(C9093de.class);
                if (room != null) {
                    iVar = room.getStreamType();
                } else {
                    iVar = EnumC11728i.VIDEO;
                }
                C6501b.C6502a.m13948a("livesdk_anchor_gift_click").mo12643a(this.f26191b).mo12651a("live_type", C11729j.m20684a(iVar)).mo12655b();
            }
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f26193d = (Boolean) dataChannel.mo28318b(C9114dz.class);
        C6203g.m13469c(new RunnableC10901i(this, view, dataChannel));
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
        C10908e eVar = this.f26190a;
        if (eVar != null) {
            eVar.f26214g = "daily";
            eVar.f26215h = null;
            C10905d dVar = eVar.f26209b;
            if (dVar != null) {
                dVar.f26205b = null;
                dVar.f26206c.mo142944a();
            }
            eVar.f26211d.mo142944a();
        }
        this.f26192c.mo142944a();
    }
}
