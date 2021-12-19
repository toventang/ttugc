package com.bytedance.android.livesdk.microom;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.message.C9667be;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class MicRoomAudienceEnterWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    final C88411a f23042a = new C88411a();

    /* renamed from: b */
    private IMessageManager f23043b;

    /* renamed from: c */
    private long f23044c;

    /* renamed from: d */
    private final AbstractC89172b<IMessage, C89391z> f23045d = new C9496a(this);

    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b */
    final /* synthetic */ class C9497b implements OnMessageListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f23047a;

        static {
            Covode.recordClassIndex(11009);
        }

        C9497b(AbstractC89172b bVar) {
            this.f23047a = bVar;
        }

        @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final /* synthetic */ void onMessage(IMessage iMessage) {
            C89219l.m154716b(this.f23047a.invoke(iMessage), "");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$d */
    static final class C9499d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C9499d f23050a = new C9499d();

        static {
            Covode.recordClassIndex(11011);
        }

        C9499d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11007);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo16307a() {
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        if (aVar != null) {
            aVar.jumpRoom(this.f23044c, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUnload() {
        /*
            r4 = this;
            f.a.b.a r0 = r4.f23042a
            r0.mo142944a()
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r3 = r4.f23043b
            if (r3 == 0) goto L_0x001e
            com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.p577a.EnumC9596a.OFFICIAL_CHANNEL_USER_MESSAGE
            int r2 = r0.getIntType()
            h.f.a.b<com.ss.ugc.live.sdk.message.data.IMessage, h.z> r1 = r4.f23045d
            if (r1 == 0) goto L_0x0019
            com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b r0 = new com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b
            r0.<init>(r1)
            r1 = r0
        L_0x0019:
            com.ss.ugc.live.sdk.message.interfaces.OnMessageListener r1 = (com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener) r1
            r3.removeMessageListener(r2, r1)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget.onUnload():void");
    }

    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$c */
    static final class C9498c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MicRoomAudienceEnterWidget f23048a;

        /* renamed from: b */
        final /* synthetic */ IMessage f23049b;

        static {
            Covode.recordClassIndex(11010);
        }

        C9498c(MicRoomAudienceEnterWidget micRoomAudienceEnterWidget, IMessage iMessage) {
            this.f23048a = micRoomAudienceEnterWidget;
            this.f23049b = iMessage;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f23048a.mo16307a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLoad(java.lang.Object[] r5) {
        /*
            r4 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L_0x003c
            java.lang.Class<com.bytedance.android.livesdk.j.cg> r0 = com.bytedance.android.livesdk.p561j.C9068cg.class
            java.lang.Object r0 = r1.mo28318b(r0)
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r0 = (com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager) r0
        L_0x000c:
            r4.f23043b = r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L_0x0022
            java.lang.Class<com.bytedance.android.livesdk.j.de> r0 = com.bytedance.android.livesdk.p561j.C9093de.class
            java.lang.Object r0 = r1.mo28318b(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            if (r0 == 0) goto L_0x0022
            long r0 = r0.getId()
            r4.f23044c = r0
        L_0x0022:
            com.ss.ugc.live.sdk.message.interfaces.IMessageManager r3 = r4.f23043b
            if (r3 == 0) goto L_0x003b
            com.bytedance.android.livesdk.model.message.a.a r0 = com.bytedance.android.livesdk.model.message.p577a.EnumC9596a.OFFICIAL_CHANNEL_USER_MESSAGE
            int r2 = r0.getIntType()
            h.f.a.b<com.ss.ugc.live.sdk.message.data.IMessage, h.z> r1 = r4.f23045d
            if (r1 == 0) goto L_0x0036
            com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b r0 = new com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$b
            r0.<init>(r1)
            r1 = r0
        L_0x0036:
            com.ss.ugc.live.sdk.message.interfaces.OnMessageListener r1 = (com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener) r1
            r3.addMessageListener(r2, r1)
        L_0x003b:
            return
        L_0x003c:
            r0 = 0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget.onLoad(java.lang.Object[]):void");
    }

    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceEnterWidget$a */
    static final class C9496a extends AbstractC89220m implements AbstractC89172b<IMessage, C89391z> {

        /* renamed from: a */
        final /* synthetic */ MicRoomAudienceEnterWidget f23046a;

        static {
            Covode.recordClassIndex(11008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9496a(MicRoomAudienceEnterWidget micRoomAudienceEnterWidget) {
            super(1);
            this.f23046a = micRoomAudienceEnterWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(IMessage iMessage) {
            IMessage iMessage2 = iMessage;
            MicRoomAudienceEnterWidget micRoomAudienceEnterWidget = this.f23046a;
            if ((iMessage2 instanceof C9667be) && iMessage2 != null) {
                micRoomAudienceEnterWidget.f23042a.mo142944a();
                C9667be beVar = (C9667be) iMessage2;
                long a = (beVar.f23524a - (C11200a.m19851a() / 1000)) + ((long) AbstractC89255c.Default.nextInt(2, (int) beVar.f23525f));
                if (a <= 0) {
                    micRoomAudienceEnterWidget.mo16307a();
                } else {
                    micRoomAudienceEnterWidget.f23042a.mo142945a(AbstractC88979t.m154307b(a, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9498c(micRoomAudienceEnterWidget, iMessage2), C9499d.f23050a));
                }
            }
            return C89391z.f203057a;
        }
    }
}
