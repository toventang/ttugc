package com.bytedance.android.livesdk.microom;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p253j.C4369b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.microom.p576a.C9508a;
import com.bytedance.android.livesdk.model.C9532ap;
import com.bytedance.android.livesdk.model.message.C9666bd;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.C10341e;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class MicRoomAudienceExitWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    public final C88411a f23051a = new C88411a();

    /* renamed from: b */
    public C9532ap f23052b;

    /* renamed from: c */
    public Room f23053c;

    /* renamed from: d */
    public long f23054d;

    /* renamed from: e */
    private final int f23055e = 30;

    /* renamed from: f */
    private AbstractC4367a f23056f;

    /* renamed from: g */
    private long f23057g;

    /* renamed from: h */
    private final OnMessageListener f23058h = new C9502c(this);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$b */
    public static final class C9501b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C9501b f23060a = new C9501b();

        static {
            Covode.recordClassIndex(11014);
        }

        C9501b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$e */
    public static final class C9504e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C9504e f23063a = new C9504e();

        static {
            Covode.recordClassIndex(11017);
        }

        C9504e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$g */
    public static final class C9506g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C9506g f23065a = new C9506g();

        static {
            Covode.recordClassIndex(11019);
        }

        C9506g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11012);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f23051a.mo142944a();
    }

    /* renamed from: d */
    public final void mo16312d() {
        long j = this.f23054d;
        if (j == 0) {
            C6779a.m14563a().mo13053a(new C4369b());
            return;
        }
        AbstractC4367a aVar = this.f23056f;
        if (aVar != null) {
            aVar.jumpRoom(j, true);
        }
    }

    /* renamed from: a */
    public final void mo16308a() {
        C9532ap apVar = this.f23052b;
        if (apVar != null) {
            long a = apVar.f23139d - (C11200a.m19851a() / 1000);
            long nextInt = (long) AbstractC89255c.Default.nextInt(this.f23055e, (int) (((long) this.f23055e) + Math.max(1L, apVar.f23141f)));
            if (a <= nextInt) {
                mo16310b();
                return;
            }
            this.f23051a.mo142945a(AbstractC88979t.m154307b(a - nextInt, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9500a(this), C9501b.f23060a));
        }
    }

    /* renamed from: b */
    public final void mo16310b() {
        Long l;
        long j;
        User user;
        long j2;
        C9532ap apVar;
        Room room = this.f23053c;
        Long l2 = null;
        if (room == null || (apVar = room.officialChannelInfo) == null) {
            l = null;
        } else {
            l = Long.valueOf(apVar.f23143h);
        }
        Room room2 = this.f23053c;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getId());
        }
        boolean a = C89219l.m154714a(l, l2);
        AbstractC4367a aVar = this.f23056f;
        long j3 = 0;
        if (aVar == null || aVar.isMicAudience() || a) {
            MicRoomApi micRoomApi = (MicRoomApi) C5805e.m12718a().mo11572a(MicRoomApi.class);
            C9532ap apVar2 = this.f23052b;
            if (apVar2 == null || (user = apVar2.f23136a) == null) {
                j = 0;
            } else {
                j = user.getId();
            }
            Room room3 = this.f23053c;
            if (room3 != null) {
                j3 = room3.getOwnerUserId();
            }
            this.f23051a.mo142945a(micRoomApi.getNextRoomData(j, j3).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9503d(this), C9504e.f23063a));
            return;
        }
        Room room4 = this.f23053c;
        if (room4 != null) {
            j2 = room4.getId();
        } else {
            j2 = 0;
        }
        this.f23054d = j2;
        C9532ap apVar3 = this.f23052b;
        if (apVar3 != null) {
            j3 = apVar3.f23139d;
        }
        mo16309a((j3 - (C11200a.m19851a() / 1000)) + mo16311c());
    }

    /* renamed from: c */
    public final long mo16311c() {
        int i;
        Object obj;
        Integer num;
        C9532ap apVar = this.f23052b;
        if (!(apVar == null || apVar.f23142g == null)) {
            C9532ap apVar2 = this.f23052b;
            if (apVar2 == null) {
                C89219l.m154715b();
            }
            if (!apVar2.f23142g.isEmpty()) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel == null || (num = (Integer) dataChannel.mo28318b(C10341e.class)) == null) {
                    i = 0;
                } else {
                    i = num.intValue();
                }
                C9532ap apVar3 = this.f23052b;
                if (apVar3 == null) {
                    C89219l.m154715b();
                }
                Iterator it = C89070n.m154587h((Iterable) C89070n.m154590j(apVar3.f23142g.keySet())).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Long l = (Long) obj;
                    C89219l.m154716b(l, "");
                    if (((long) i) <= l.longValue()) {
                        break;
                    }
                }
                Long l2 = (Long) obj;
                if (l2 != null) {
                    long longValue = l2.longValue();
                    C9532ap apVar4 = this.f23052b;
                    if (apVar4 == null) {
                        C89219l.m154715b();
                    }
                    Long l3 = apVar4.f23142g.get(Long.valueOf(longValue));
                    if (l3 != null) {
                        return l3.longValue();
                    }
                }
            }
        }
        return 30;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$a */
    public static final class C9500a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MicRoomAudienceExitWidget f23059a;

        static {
            Covode.recordClassIndex(11013);
        }

        C9500a(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f23059a = micRoomAudienceExitWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f23059a.mo16310b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$f */
    public static final class C9505f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MicRoomAudienceExitWidget f23064a;

        static {
            Covode.recordClassIndex(11018);
        }

        C9505f(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f23064a = micRoomAudienceExitWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f23064a.mo16312d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$c */
    static final class C9502c implements OnMessageListener {

        /* renamed from: a */
        final /* synthetic */ MicRoomAudienceExitWidget f23061a;

        static {
            Covode.recordClassIndex(11015);
        }

        C9502c(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f23061a = micRoomAudienceExitWidget;
        }

        @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            C9532ap apVar;
            if ((iMessage instanceof C9666bd) && iMessage != null) {
                Room room = this.f23061a.f23053c;
                if (!(room == null || (apVar = room.officialChannelInfo) == null)) {
                    apVar.f23139d = ((C9666bd) iMessage).f23522a;
                }
                this.f23061a.f23051a.mo142944a();
                this.f23061a.mo16308a();
            }
        }
    }

    /* renamed from: a */
    public final void mo16309a(long j) {
        if (j <= 0) {
            mo16312d();
            return;
        }
        this.f23051a.mo142945a(AbstractC88979t.m154307b(j, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C9505f(this), C9506g.f23065a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget$d */
    public static final class C9503d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MicRoomAudienceExitWidget f23062a;

        static {
            Covode.recordClassIndex(11016);
        }

        C9503d(MicRoomAudienceExitWidget micRoomAudienceExitWidget) {
            this.f23062a = micRoomAudienceExitWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            C9508a aVar;
            C9508a aVar2;
            C9508a aVar3;
            C5832d dVar = (C5832d) obj;
            MicRoomAudienceExitWidget micRoomAudienceExitWidget = this.f23062a;
            long j2 = 0;
            if (dVar == null || (aVar3 = (C9508a) dVar.data) == null) {
                j = 0;
            } else {
                j = aVar3.f23066a;
            }
            micRoomAudienceExitWidget.f23054d = j;
            if (dVar == null || (aVar = (C9508a) dVar.data) == null || Long.valueOf(aVar.f23067b) == null || ((aVar2 = (C9508a) dVar.data) != null && aVar2.f23067b == 0)) {
                C9532ap apVar = this.f23062a.f23052b;
                if (apVar != null) {
                    j2 = apVar.f23139d;
                }
            } else {
                j2 = ((C9508a) dVar.data).f23067b;
            }
            this.f23062a.mo16309a((j2 - (C11200a.m19851a() / 1000)) + this.f23062a.mo16311c());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        IMessageManager iMessageManager;
        DataChannel dataChannel = this.dataChannel;
        C9532ap apVar = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f23053c = room;
        if (room != null) {
            apVar = room.officialChannelInfo;
        }
        this.f23052b = apVar;
        this.f23056f = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        this.f23057g = b.mo13161c();
        mo16308a();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManager = (IMessageManager) dataChannel2.mo28318b(C9068cg.class)) != null) {
            iMessageManager.addMessageListener(EnumC9596a.OFFICIAL_CHANNEL_MODIFY_MESSAGE.getIntType(), this.f23058h);
        }
    }
}
