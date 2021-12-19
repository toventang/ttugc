package com.bytedance.android.livesdk.chatroom.p490e;

import android.util.SparseBooleanArray;
import com.bytedance.android.live.banner.InRoomBannerManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.p488c.C7406v;
import com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC8094bq;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.model.message.C9603ag;
import com.bytedance.android.livesdk.model.message.C9695c;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.utils.C9913b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.a */
public final class C7468a extends AbstractC7501r<AbstractC7469a> implements OnMessageListener {

    /* renamed from: a */
    private AbstractC88412b f18565a;

    /* renamed from: b */
    private AbstractC88412b f18566b;

    /* renamed from: c */
    private Room f18567c;

    /* renamed from: d */
    private boolean f18568d;

    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$a */
    public interface AbstractC7469a extends AbstractC8094bq {
        static {
            Covode.recordClassIndex(8239);
        }

        /* renamed from: a */
        void mo13705a(int i);

        /* renamed from: a */
        void mo13706a(SparseBooleanArray sparseBooleanArray, boolean z);

        /* renamed from: a */
        void mo13707a(C9603ag agVar);

        /* renamed from: a */
        void mo13708a(C9695c cVar);
    }

    static {
        Covode.recordClassIndex(8238);
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b, com.bytedance.android.livesdk.chatroom.p490e.AbstractC7501r
    /* renamed from: b */
    public final void mo8577b() {
        super.mo8577b();
        DataChannel dataChannel = this.f18624w;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
        AbstractC88412b bVar = this.f18565a;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f18566b;
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$b */
    public static final class C7470b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7468a f18569a;

        static {
            Covode.recordClassIndex(8240);
        }

        C7470b(C7468a aVar) {
            this.f18569a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((AbstractC7469a) this.f18569a.f38654y).mo13708a(((InRoomBannerManager.C2944a) obj).f8691b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$c */
    public static final class C7471c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7468a f18570a;

        static {
            Covode.recordClassIndex(8241);
        }

        C7471c(C7468a aVar) {
            this.f18570a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154721d(th, "");
            this.f18570a.mo13747a(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$d */
    public static final class C7472d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C7468a f18571a;

        static {
            Covode.recordClassIndex(8242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7472d(C7468a aVar) {
            super(1);
            this.f18571a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            AbstractC7469a aVar = (AbstractC7469a) this.f18571a.f38654y;
            if (aVar != null) {
                if (booleanValue) {
                    i = 4;
                } else {
                    i = 0;
                }
                aVar.mo13705a(i);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$e */
    public static final class C7473e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7468a f18572a;

        static {
            Covode.recordClassIndex(8243);
        }

        C7473e(C7468a aVar) {
            this.f18572a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8454g gVar = (C8454g) obj;
            AbstractC7469a aVar = (AbstractC7469a) this.f18572a.f38654y;
            if (aVar != null) {
                C89219l.m154716b(gVar, "");
                SparseBooleanArray sparseBooleanArray = gVar.f20901a;
                C89219l.m154716b(sparseBooleanArray, "");
                aVar.mo13706a(sparseBooleanArray, gVar.f20903c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.e.a$f */
    public static final class C7474f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7468a f18573a;

        static {
            Covode.recordClassIndex(8244);
        }

        C7474f(C7468a aVar) {
            this.f18573a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            C7406v vVar = (C7406v) obj;
            AbstractC7469a aVar = (AbstractC7469a) this.f18573a.f38654y;
            if (aVar != null) {
                Boolean bool = vVar.f18359a;
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    i = 8;
                } else {
                    i = 0;
                }
                aVar.mo13705a(i);
            }
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C9603ag) {
            C9603ag agVar = (C9603ag) iMessage;
            if (agVar.f23311f == 5) {
                ((AbstractC7469a) this.f38654y).mo13707a(agVar);
            }
        }
    }

    /* renamed from: a */
    public final String mo13703a(String str) {
        String str2;
        User owner;
        C89219l.m154721d(str, "");
        String c = C6544e.m13989c();
        long h = C6544e.m13994h();
        String j = C6544e.m13996j();
        String k = C6544e.m13997k();
        String e = C6544e.m13991e();
        C9913b bVar = new C9913b(str);
        Room room = this.f18567c;
        if (room != null) {
            bVar.mo16613a("room_id", room.getId());
        }
        bVar.mo16614a("mode", "live_room");
        Room room2 = this.f18567c;
        if (!(room2 == null || (owner = room2.getOwner()) == null)) {
            bVar.mo16613a("anchor_id", owner.getId());
        }
        bVar.mo16613a("back_up_room_id", C6560m.f16378a);
        bVar.mo16613a("back_up_anchor_id", C6560m.f16379b);
        bVar.mo16614a("is_anchor", String.valueOf(this.f18568d));
        bVar.mo16614a("enter_from", "");
        bVar.mo16614a("source_v3", c);
        bVar.mo16613a("anchor_id", h);
        bVar.mo16614a("log_pb", j);
        bVar.mo16614a("request_id", k);
        if (this.f18568d) {
            str2 = "live_take_detail";
        } else {
            str2 = "live_detail";
        }
        bVar.mo16614a("event_page", str2);
        bVar.mo16614a("event_belong", "live_interact");
        bVar.mo16614a("action_type", e);
        String a = bVar.mo16611a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public final void mo10297a(AbstractC7469a aVar) {
        boolean z;
        Long l;
        C89219l.m154721d(aVar, "");
        super.mo10297a((AbstractC8094bq) aVar);
        this.f18567c = (Room) this.f18624w.mo28318b(C9093de.class);
        Boolean bool = (Boolean) this.f18624w.mo28318b(C9119ed.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f18568d = z;
        IMessageManager iMessageManager = this.f18625x;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.IN_ROOM_BANNER_MESSAGE.getIntType(), this);
        }
        Room room = this.f18567c;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        AbstractC11181z zVar = (AbstractC11181z) InRoomBannerManager.m8277a(l).mo143274a(mo13748u());
        if (zVar != null) {
            zVar.mo17950a(new C7470b(this), new C7471c(this));
        }
        this.f18624w.mo28312a(this, C9034ba.class, new C7472d(this));
        if (C89219l.m154714a(this.f18624w.mo28318b(C9076co.class), (Object) false)) {
            this.f18565a = ((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143274a(mo13748u())).mo17949a(new C7473e(this));
        }
        this.f18566b = ((AbstractC11181z) C6779a.m14563a().mo13052a(C7406v.class).mo143274a(mo13748u())).mo17949a(new C7474f(this));
    }
}
