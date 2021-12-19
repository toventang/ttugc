package com.bytedance.android.livesdk.rank.impl.p612e;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p247f.AbstractC4318a;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceAreaListSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveOnlineAudienceListSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.C9693by;
import com.bytedance.android.livesdk.model.message.C9694bz;
import com.bytedance.android.livesdk.model.message.C9882m;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.C10341e;
import com.bytedance.android.livesdk.rank.api.model.C10347a;
import com.bytedance.android.livesdk.rank.api.model.C10353g;
import com.bytedance.android.livesdk.rank.api.model.C10354h;
import com.bytedance.android.livesdk.rank.api.p606a.C10332a;
import com.bytedance.android.livesdk.rank.impl.api.RankApi;
import com.bytedance.android.livesdk.rank.impl.api.model.C10368e;
import com.bytedance.android.livesdk.rank.impl.api.model.C10369f;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10370g;
import com.bytedance.android.livesdk.rank.impl.p609b.C10376a;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.p613f.C10424l;
import com.bytedance.android.livesdk.rank.impl.widget.EnumC10608a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.e.b */
public final class C10392b implements AbstractC4318a.AbstractC4319a, C10376a.AbstractC10377a, OnMessageListener {

    /* renamed from: g */
    public static final C10393a f25085g = new C10393a((byte) 0);

    /* renamed from: a */
    public EnumC10608a f25086a;

    /* renamed from: b */
    public int f25087b;

    /* renamed from: c */
    public final List<C10347a> f25088c;

    /* renamed from: d */
    public boolean f25089d;

    /* renamed from: e */
    boolean f25090e;

    /* renamed from: f */
    public final DataChannel f25091f;

    /* renamed from: h */
    private boolean f25092h;

    /* renamed from: i */
    private boolean f25093i;

    /* renamed from: j */
    private C10376a.AbstractC10378b f25094j;

    /* renamed from: k */
    private AbstractC88412b f25095k;

    /* renamed from: l */
    private AbstractC88412b f25096l;

    /* renamed from: m */
    private final AbstractC89244h f25097m;

    /* renamed from: n */
    private final AbstractC89244h f25098n;

    /* renamed from: o */
    private final AbstractC89244h f25099o;

    /* renamed from: p */
    private boolean f25100p;

    /* renamed from: q */
    private Room f25101q;

    /* renamed from: r */
    private final C88411a f25102r;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$g */
    static final class C10399g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10399g f25108a = new C10399g();

        static {
            Covode.recordClassIndex(11973);
        }

        C10399g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11966);
    }

    /* renamed from: f */
    private final boolean m18905f() {
        return ((Boolean) this.f25097m.getValue()).booleanValue();
    }

    /* renamed from: g */
    private final boolean m18906g() {
        return ((Boolean) this.f25099o.getValue()).booleanValue();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$a */
    public static final class C10393a {
        static {
            Covode.recordClassIndex(11967);
        }

        private C10393a() {
        }

        public /* synthetic */ C10393a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10377a
    /* renamed from: d */
    public final int mo17260d() {
        return this.f25087b;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10377a
    /* renamed from: a */
    public final EnumC10608a mo17255a() {
        EnumC10608a aVar = this.f25086a;
        if (aVar == null) {
            return EnumC10608a.SELF_NON_ANCHOR_REVENUE;
        }
        return aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$i */
    static final class C10401i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C10401i f25110a = new C10401i();

        static {
            Covode.recordClassIndex(11975);
        }

        C10401i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(LiveOnlineAudienceListSetting.INSTANCE.getValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$h */
    static final class C10400h extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10392b f25109a;

        static {
            Covode.recordClassIndex(11974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10400h(C10392b bVar) {
            super(0);
            this.f25109a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool = (Boolean) this.f25109a.f25091f.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$j */
    static final class C10402j extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C10392b f25111a;

        static {
            Covode.recordClassIndex(11976);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10402j(C10392b bVar) {
            super(0);
            this.f25111a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C89219l.m154714a(this.f25111a.f25091f.mo28318b(C9076co.class), (Object) true));
        }
    }

    /* renamed from: h */
    private final boolean m18907h() {
        if (!((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).shouldShowUserCount(this.f25101q)) {
            return false;
        }
        return m18908i();
    }

    /* renamed from: i */
    private final boolean m18908i() {
        if (m18905f()) {
            return true;
        }
        boolean isMicRoom = ((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoom();
        if (m18906g() || isMicRoom) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10377a
    /* renamed from: b */
    public final boolean mo17258b() {
        boolean z;
        try {
            if (m18907h()) {
                Boolean bool = (Boolean) this.f25091f.mo28318b(C9119ed.class);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                if (!z && this.f25086a != EnumC10608a.BOTH_REVENUE) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10377a
    /* renamed from: c */
    public final void mo17259c() {
        this.f25102r.mo142944a();
        this.f25094j = null;
        IMessageManager iMessageManager = (IMessageManager) this.f25091f.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.f25087b = 0;
        this.f25088c.clear();
        AbstractC88412b bVar = this.f25095k;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f25096l;
        if (bVar2 != null) {
            bVar2.dispose();
        }
    }

    /* renamed from: j */
    private final boolean m18909j() {
        if (!this.f25100p) {
            return false;
        }
        try {
            if (this.f25086a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (!m18908i()) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!((Boolean) this.f25098n.getValue()).booleanValue() || (!m18905f() && this.f25086a != EnumC10608a.BOTH_REVENUE)) {
                return false;
            } else {
                return true;
            }
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public final void mo17280e() {
        try {
            if (this.f25094j == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (!this.f25089d) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f25090e || this.f25087b > 0) {
                if (m18907h()) {
                    C10376a.AbstractC10378b bVar = this.f25094j;
                    if (bVar != null) {
                        bVar.mo17262a(this.f25087b);
                    }
                    if (!this.f25092h && this.f25093i) {
                        this.f25092h = true;
                        C10424l.m18945a(this.f25091f, "top_right");
                    }
                } else {
                    C10376a.AbstractC10378b bVar2 = this.f25094j;
                    if (bVar2 != null) {
                        bVar2.mo17261a();
                    }
                }
                if (m18909j()) {
                    C10376a.AbstractC10378b bVar3 = this.f25094j;
                    if (bVar3 != null) {
                        bVar3.mo17264b();
                    }
                    C10376a.AbstractC10378b bVar4 = this.f25094j;
                    if (bVar4 != null) {
                        bVar4.mo17263a(this.f25088c);
                    }
                } else {
                    C10376a.AbstractC10378b bVar5 = this.f25094j;
                    if (bVar5 != null) {
                        bVar5.mo17265c();
                    }
                }
                this.f25090e = false;
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$b */
    static final class C10394b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10392b f25103a;

        static {
            Covode.recordClassIndex(11968);
        }

        C10394b(C10392b bVar) {
            this.f25103a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f25103a.mo17280e();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10377a
    /* renamed from: b */
    public final void mo17257b(boolean z) {
        this.f25093i = z;
        if (!z) {
            this.f25092h = false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$c */
    static final class C10395c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10392b f25104a;

        static {
            Covode.recordClassIndex(11969);
        }

        C10395c(C10392b bVar) {
            this.f25104a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C10332a) obj).f24988b == 1) {
                C10392b bVar = this.f25104a;
                bVar.f25090e = false;
                bVar.mo17280e();
            }
        }
    }

    @Override // com.bytedance.android.live.p247f.AbstractC4318a.AbstractC4319a
    /* renamed from: a */
    public final void mo10009a(boolean z) {
        C10376a.AbstractC10378b bVar;
        if (!z && (bVar = this.f25094j) != null) {
            bVar.mo17266d();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$e */
    static final class C10397e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10392b f25106a;

        static {
            Covode.recordClassIndex(11971);
        }

        C10397e(C10392b bVar) {
            this.f25106a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            boolean z;
            EnumC10608a aVar;
            this.f25106a.f25089d = true;
            Boolean bool = (Boolean) this.f25106a.f25091f.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            C10392b bVar = this.f25106a;
            if (!z) {
                aVar = EnumC10608a.BOTH_NON_REVENUE;
            } else if (LiveAudienceAreaListSetting.INSTANCE.getValue()) {
                aVar = EnumC10608a.BOTH_REVENUE;
            } else {
                aVar = EnumC10608a.BOTH_NON_REVENUE;
            }
            bVar.f25086a = aVar;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$f */
    static final class C10398f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10398f f25107a = new C10398f();

        static {
            Covode.recordClassIndex(11972);
        }

        C10398f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ArrayList<C10368e> arrayList;
            C10369f fVar = (C10369f) ((C5832d) obj).data;
            if (fVar != null && (arrayList = fVar.f25056a) != null && !arrayList.isEmpty()) {
                Iterator<C10368e> it = arrayList.iterator();
                while (it.hasNext()) {
                    C10368e next = it.next();
                    if (next.f25053a == EnumC10370g.ONLINE_AUDIENCE.getValue()) {
                        C10387b a = C10387b.m18895a();
                        C89219l.m154716b(a, "");
                        a.f25075e = next;
                        return;
                    }
                }
            }
        }
    }

    public C10392b(DataChannel dataChannel) {
        boolean z;
        Boolean bool;
        C89219l.m154721d(dataChannel, "");
        this.f25091f = dataChannel;
        if (dataChannel == null || (bool = (Boolean) dataChannel.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f25093i = z;
        this.f25088c = new ArrayList();
        this.f25090e = true;
        this.f25097m = C89250i.m154773a((AbstractC89171a) new C10400h(this));
        this.f25098n = C89250i.m154773a((AbstractC89171a) new C10402j(this));
        this.f25099o = C89250i.m154773a((AbstractC89171a) C10401i.f25110a);
        this.f25102r = new C88411a();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.b$d */
    static final class C10396d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C10392b f25105a;

        static {
            Covode.recordClassIndex(11970);
        }

        C10396d(C10392b bVar) {
            this.f25105a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            EnumC10608a aVar;
            C5832d dVar = (C5832d) obj;
            this.f25105a.f25089d = true;
            if (dVar != null) {
                try {
                    C10353g gVar = (C10353g) dVar.data;
                    if (!(gVar == null || gVar.f25009a == null)) {
                        C10387b.m18895a().f25074d = ((C10353g) dVar.data).f25009a;
                        C10387b a = C10387b.m18895a();
                        C10354h hVar = ((C10353g) dVar.data).f25010b;
                        if (hVar != null) {
                            j = hVar.f25016b;
                        } else {
                            j = 0;
                        }
                        a.f25076f = j;
                        boolean value = LiveAudienceAreaListSetting.INSTANCE.getValue();
                        boolean z = ((C10353g) dVar.data).f25012d;
                        C10392b bVar = this.f25105a;
                        if (value) {
                            if (z) {
                                aVar = EnumC10608a.BOTH_REVENUE;
                            } else {
                                aVar = EnumC10608a.SELF_REVENUE_ANCHOR_NON;
                            }
                        } else if (z) {
                            aVar = EnumC10608a.SELF_NON_ANCHOR_REVENUE;
                        } else {
                            aVar = EnumC10608a.BOTH_NON_REVENUE;
                        }
                        bVar.f25086a = aVar;
                        this.f25105a.f25088c.clear();
                        List<C10354h> list = ((C10353g) dVar.data).f25009a;
                        C89219l.m154716b(list, "");
                        List d = C89070n.m154571d((Iterable) C89070n.m154580f((Iterable) list), 3);
                        ArrayList<T> arrayList = new ArrayList(C89070n.m154526a((Iterable) d, 10));
                        for (T t : d) {
                            C89219l.m154721d(t, "");
                            User user = t.f25015a;
                            C89219l.m154716b(user, "");
                            arrayList.add(new C10347a(user, t.f25016b, t.f25017c));
                        }
                        for (T t2 : arrayList) {
                            this.f25105a.f25088c.add(t2);
                        }
                        C10353g gVar2 = (C10353g) dVar.data;
                        if (gVar2 != null && gVar2.f25014f > 0) {
                            this.f25105a.f25087b = ((C10353g) dVar.data).f25014f;
                            return;
                        }
                        return;
                    }
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v26, resolved type: java.util.List<com.bytedance.android.livesdk.rank.api.model.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        if (iMessage instanceof C9693by) {
            try {
                if (((C9693by) iMessage).f23622f == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (this.f25086a != null) {
                    C9693by byVar = (C9693by) iMessage;
                    this.f25091f.mo28311a(C10341e.class, Integer.valueOf((int) byVar.f23621a));
                    this.f25087b = (int) byVar.f23621a;
                    ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).updateGameMessageViewUserCount(this.f25087b);
                    this.f25088c.clear();
                    List<C9882m> list = byVar.f23622f;
                    C89219l.m154716b(list, "");
                    List<C9882m> d = C89070n.m154571d((Iterable) C89070n.m154580f((Iterable) list), 3);
                    ArrayList<Object> arrayList = new ArrayList(C89070n.m154526a((Iterable) d, 10));
                    for (C9882m mVar : d) {
                        C89219l.m154721d(mVar, "");
                        User user = mVar.f23878a;
                        C89219l.m154716b(user, "");
                        arrayList.add(new C10347a(user, mVar.f23879b, (int) mVar.f23880c));
                    }
                    for (Object obj : arrayList) {
                        this.f25088c.add(obj);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (Exception unused) {
            }
        } else if (iMessage instanceof C9694bz) {
            C9694bz bzVar = (C9694bz) iMessage;
            if (bzVar.f23626a == 34) {
                Room room = this.f25101q;
                if (!(room == null || (roomAuthStatus2 = room.getRoomAuthStatus()) == null)) {
                    roomAuthStatus2.setEnableViewers(true);
                }
                this.f25100p = true;
            } else if (bzVar.f23626a == 35) {
                Room room2 = this.f25101q;
                if (!(room2 == null || (roomAuthStatus = room2.getRoomAuthStatus()) == null)) {
                    roomAuthStatus.setEnableViewers(false);
                }
                this.f25100p = false;
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10377a
    /* renamed from: a */
    public final void mo17256a(C10376a.AbstractC10378b bVar) {
        boolean z;
        int i;
        long j;
        long j2;
        RoomAuthStatus roomAuthStatus;
        C89219l.m154721d(bVar, "");
        this.f25094j = bVar;
        Room room = (Room) this.f25091f.mo28318b(C9093de.class);
        this.f25101q = room;
        if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableViewers()) {
            z = false;
        } else {
            z = true;
        }
        this.f25100p = z;
        IMessageManager iMessageManager = (IMessageManager) this.f25091f.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.USER_SEQ.getIntType(), this);
            iMessageManager.addMessageListener(EnumC9596a.ROOM_VERIFY.getIntType(), this);
        }
        Room room2 = (Room) this.f25091f.mo28318b(C9093de.class);
        if (room2 != null) {
            i = room2.getUserCount();
        } else {
            i = 0;
        }
        this.f25087b = i;
        this.f25091f.mo28311a(C10341e.class, Integer.valueOf(i));
        long j3 = 0;
        try {
            Room room3 = (Room) this.f25091f.mo28318b(C9093de.class);
            if (room3 != null) {
                j = room3.getId();
            } else {
                j = 0;
            }
            Room room4 = (Room) this.f25091f.mo28318b(C9093de.class);
            if (room4 != null) {
                j2 = room4.getOwnerUserId();
            } else {
                j2 = 0;
            }
            if (j == 0 || j2 == 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            this.f25095k = ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).getOnlineRankList(j, j2).mo143271a(new C11191f()).mo143254a(new C10396d(this), new C10397e(this));
            AbstractC88412b bVar2 = this.f25096l;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f25096l = AbstractC88979t.m154284a(2, TimeUnit.SECONDS).mo143271a(new C11191f()).mo143289d(new C10394b(this));
            Room room5 = (Room) this.f25091f.mo28318b(C9093de.class);
            if (room5 != null) {
                j3 = room5.getId();
            }
            this.f25095k = ((RankApi) C5805e.m12718a().mo11572a(RankApi.class)).getScoreDisplayConfig(j3, String.valueOf(EnumC10370g.ONLINE_AUDIENCE.getValue())).mo143271a(new C11191f()).mo143254a(C10398f.f25107a, C10399g.f25108a);
            Room room6 = this.f25101q;
            if (room6 != null) {
                ((AbstractC4318a) C6193a.m13435a(AbstractC4318a.class)).addOnUserCountVisibilityChangeListener(room6.getId(), this);
            }
            this.f25102r.mo142945a(C6779a.m14563a().mo13052a(C10332a.class).mo143289d(new C10395c(this)));
        } catch (IllegalStateException unused) {
        }
    }
}
