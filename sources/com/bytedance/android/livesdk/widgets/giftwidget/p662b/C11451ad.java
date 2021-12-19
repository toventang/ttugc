package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.livesdk.model.message.C9623av;
import com.bytedance.android.livesdk.model.message.C9892v;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p690f.C11756a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ad */
public final class C11451ad implements OnMessageListener {

    /* renamed from: a */
    public C88411a f27470a = new C88411a();

    /* renamed from: b */
    public Room f27471b;

    /* renamed from: c */
    public boolean f27472c;

    /* renamed from: d */
    public boolean f27473d;

    /* renamed from: e */
    public AbstractC11452a f27474e;

    /* renamed from: f */
    public DataChannel f27475f;

    /* renamed from: g */
    private boolean f27476g;

    /* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ad$a */
    public interface AbstractC11452a {
        static {
            Covode.recordClassIndex(13111);
        }

        /* renamed from: a */
        void mo18281a(C9623av avVar);

        /* renamed from: a */
        void mo18282a(C9892v vVar);

        /* renamed from: a */
        void mo18283a(C9895y yVar);

        /* renamed from: a */
        void mo18284a(C9895y yVar, boolean z);
    }

    static {
        Covode.recordClassIndex(13110);
    }

    public final void onEvent(C11756a aVar) {
        if (aVar.f28121b == 3) {
            this.f27476g = true;
        } else if (aVar.f28121b == 4) {
            this.f27476g = false;
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z;
        AbstractC11452a aVar = this.f27474e;
        if (aVar != null) {
            if (iMessage instanceof C9895y) {
                C9895y yVar = (C9895y) iMessage;
                if (!(yVar.f23946u == null || yVar.f23946u.mDynamicImg == null)) {
                    C3941k.m9598a(yVar.f23946u.mDynamicImg);
                }
                AbstractC11452a aVar2 = this.f27474e;
                if (this.f27472c || !this.f27476g) {
                    z = false;
                } else {
                    z = true;
                }
                aVar2.mo18284a(yVar, z);
            } else if (iMessage instanceof C9623av) {
                aVar.mo18281a((C9623av) iMessage);
            } else if (iMessage instanceof C9892v) {
                aVar.mo18282a((C9892v) iMessage);
            }
        }
    }
}
