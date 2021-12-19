package com.bytedance.android.live.liveinteract.multiguest.p316a.p319c;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.C4455y;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5588a;
import com.bytedance.android.live.liveinteract.multilive.p360c.C5594g;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5741z;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.api.C7294d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7664c;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7666e;
import com.bytedance.android.livesdk.chatroom.p488c.C7393k;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.C9617aq;
import com.bytedance.android.livesdk.model.message.C9618ar;
import com.bytedance.android.livesdk.model.message.C9619as;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p580d.p585e.C9763a;
import com.bytedance.android.livesdk.model.message.p580d.p587g.C9769a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d */
public final class C5153d implements OnMessageListener {

    /* renamed from: a */
    public boolean f13346a;

    /* renamed from: b */
    public final List<C7666e> f13347b = new ArrayList();

    /* renamed from: c */
    public final List<C7666e> f13348c = new ArrayList();

    /* renamed from: d */
    public C5271a f13349d;

    /* renamed from: e */
    public final DataChannel f13350e;

    /* renamed from: f */
    private AbstractC88412b f13351f;

    /* renamed from: g */
    private boolean f13352g;

    /* renamed from: h */
    private final List<AbstractC5154a> f13353h = new ArrayList();

    /* renamed from: i */
    private int f13354i;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$a */
    public static abstract class AbstractC5154a {
        static {
            Covode.recordClassIndex(5746);
        }

        /* renamed from: a */
        public void mo10915a() {
        }

        /* renamed from: a */
        public void mo10916a(long j, long j2) {
        }

        /* renamed from: a */
        public void mo10917a(long j, String str) {
            C89219l.m154721d(str, "");
        }

        /* renamed from: a */
        public void mo10918a(String str) {
            C89219l.m154721d(str, "");
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$c */
    public enum EnumC5156c {
        FOREGROUND,
        BACKGROUND;

        static {
            Covode.recordClassIndex(5748);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$j */
    public static final class C5163j<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5163j f13375a = new C5163j();

        static {
            Covode.recordClassIndex(5755);
        }

        C5163j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$k */
    public static final class C5164k<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5164k f13376a = new C5164k();

        static {
            Covode.recordClassIndex(5756);
        }

        C5164k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(5745);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$b */
    public enum EnumC5155b {
        NONE(""),
        LINKED_LIST_CHANGE("message_linked_list_change"),
        WAITING_LIST_CHANGE("message_waiting_list_change"),
        GUEST_LEAVE("message_leave"),
        ENTER_ROOM("enter_room"),
        PERMIT_FAILED("permit_failed");
        

        /* renamed from: b */
        private final String f13356b;

        public final String getContent() {
            return this.f13356b;
        }

        static {
            Covode.recordClassIndex(5747);
        }

        private EnumC5155b(String str) {
            this.f13356b = str;
        }
    }

    /* renamed from: a */
    public final void mo10898a() {
        IMessageManager iMessageManager = (IMessageManager) this.f13350e.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC9596a.LINK_MIC_SIGNAL.getIntType(), this);
            iMessageManager.addMessageListener(EnumC9596a.LINK_MIC.getIntType(), this);
            iMessageManager.addMessageListener(EnumC9596a.LINK_MESSAGE.getIntType(), this);
        }
        this.f13352g = true;
        mo10901a(true, EnumC5155b.ENTER_ROOM);
    }

    /* renamed from: a */
    public final void mo10900a(boolean z) {
        int g = mo10910g();
        int i = this.f13354i;
        if (i > 0) {
            if (g == 0) {
                C10095g.m18636d();
                C5741z.m12608b("connection_over");
                C5741z.m12610d(null);
            }
        } else if (i == 0 && g > 0) {
            C10095g.m18635c();
            if (!z) {
                C5741z.m12609c("connection_start");
            }
        }
        this.f13354i = g;
    }

    /* renamed from: a */
    public final void mo10901a(boolean z, EnumC5155b bVar) {
        Boolean bool = (Boolean) this.f13350e.mo28318b(C9119ed.class);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        try {
            if (!this.f13352g) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!this.f13346a) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (room != null) {
                    long id = room.getId();
                    long ownerUserId = room.getOwnerUserId();
                    if (id != 0) {
                        if (ownerUserId != 0) {
                            this.f13346a = true;
                            if (booleanValue) {
                                C5714i.m12526a();
                            }
                            if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                m11389b(id, ownerUserId, booleanValue, z, bVar);
                                return;
                            } else {
                                m11386a(id, ownerUserId, booleanValue, z, bVar);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo10902a(AbstractC5154a aVar) {
        C89219l.m154721d(aVar, "");
        return this.f13353h.add(aVar);
    }

    /* renamed from: a */
    public final void mo10899a(C7666e eVar) {
        C6898g gVar = C6898g.C6899a.f17285a;
        User user = eVar.f19001c;
        C89219l.m154716b(user, "");
        gVar.mo13199a(user.getId(), eVar.mo13898a());
        if (eVar.f19003e == 2 || (eVar.f19003e == 1 && eVar.f19005g == 2)) {
            Set<Long> set = C6894d.m14753a().f17272s;
            User user2 = eVar.f19001c;
            C89219l.m154716b(user2, "");
            set.add(Long.valueOf(user2.getId()));
        }
        if (eVar.f19005g == 1) {
            C6894d a = C6894d.m14753a();
            C89219l.m154716b(a, "");
            a.f17259d = eVar.f19008j;
        } else if (eVar.f19003e == 2) {
            C6894d.m14753a().f17273t++;
            C5271a aVar = this.f13349d;
            if (aVar == null) {
                C89219l.m154710a("mDataHolder");
            }
            aVar.f13641l++;
        }
    }

    /* renamed from: c */
    public final void mo10906c() {
        boolean z;
        int i = C6894d.m14753a().f17273t;
        DataChannel dataChannel = this.f13350e;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        dataChannel.mo28320c(C4455y.class, new C7393k(z, i));
    }

    /* renamed from: e */
    public final void mo10908e() {
        Iterator<T> it = this.f13353h.iterator();
        while (it.hasNext()) {
            it.next().mo10915a();
        }
    }

    /* renamed from: k */
    public final void mo10914k() {
        this.f13352g = false;
        IMessageManager iMessageManager = (IMessageManager) this.f13350e.mo28318b(C9068cg.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        AbstractC88412b bVar = this.f13351f;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$d */
    public static final class C5157d {

        /* renamed from: a */
        public final long f13358a;

        /* renamed from: b */
        public final String f13359b;

        /* renamed from: c */
        public final int f13360c;

        static {
            Covode.recordClassIndex(5749);
        }

        public final String toString() {
            return "userId=" + this.f13358a + ", linkmicId='" + this.f13359b + "', status=" + this.f13360c;
        }

        public C5157d(long j, String str, int i) {
            C89219l.m154721d(str, "");
            this.f13358a = j;
            this.f13359b = str;
            this.f13360c = i;
        }
    }

    /* renamed from: b */
    public final void mo10904b() {
        C6894d.m14753a().f17273t = 0;
        C6894d.m14753a().f17272s.clear();
        C5271a aVar = this.f13349d;
        if (aVar == null) {
            C89219l.m154710a("mDataHolder");
        }
        aVar.f13641l = 0;
    }

    /* renamed from: f */
    public final int mo10909f() {
        List<C7666e> list = this.f13347b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f19003e == 1 && t2.f19005g == 2) {
                arrayList.add(t);
            }
        }
        return arrayList.size();
    }

    /* renamed from: g */
    public final int mo10910g() {
        List<C7666e> list = this.f13347b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.f19003e == 2) {
                arrayList.add(t);
            }
        }
        return arrayList.size() - 1;
    }

    /* renamed from: h */
    public final int mo10911h() {
        List<C7666e> list = this.f13347b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f19005g != 1 && t2.f19003e == 2) {
                arrayList.add(t);
            }
        }
        return arrayList.size();
    }

    /* renamed from: i */
    public final List<C7666e> mo10912i() {
        List<C7666e> list = this.f13347b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f19003e == 1 && t2.f19005g == 2) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public final List<C7666e> mo10913j() {
        List<C7666e> list = this.f13347b;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.f19003e == 2) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final void mo10907d() {
        boolean z;
        Room room;
        try {
            Boolean bool = (Boolean) this.f13350e.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            if (!z) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                C7666e a = m11384a(this, null, b.mo13161c(), 1);
                if (a != null && (room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)) != null) {
                    long id = room.getId();
                    C6894d a2 = C6894d.m14753a();
                    C89219l.m154716b(a2, "");
                    ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).leave(id, a2.f17274u).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C5162i(a, this), C5163j.f13375a);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$f */
    public static final class C5159f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5153d f13365a;

        /* renamed from: b */
        final /* synthetic */ boolean f13366b;

        static {
            Covode.recordClassIndex(5751);
        }

        C5159f(C5153d dVar, boolean z) {
            this.f13365a = dVar;
            this.f13366b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f13365a.f13346a = false;
            if (this.f13366b) {
                C5714i.m12539a(th);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$i */
    public static final class C5162i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C7666e f13373a;

        /* renamed from: b */
        final /* synthetic */ C5153d f13374b;

        static {
            Covode.recordClassIndex(5754);
        }

        C5162i(C7666e eVar, C5153d dVar) {
            this.f13373a = eVar;
            this.f13374b = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f13374b.f13347b.remove(this.f13373a);
        }
    }

    /* renamed from: b */
    public final boolean mo10905b(AbstractC5154a aVar) {
        C89219l.m154721d(aVar, "");
        return this.f13353h.remove(aVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$h */
    public static final class C5161h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5153d f13371a;

        /* renamed from: b */
        final /* synthetic */ boolean f13372b;

        static {
            Covode.recordClassIndex(5753);
        }

        C5161h(C5153d dVar, boolean z) {
            this.f13371a = dVar;
            this.f13372b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            this.f13371a.f13346a = false;
            if (this.f13372b) {
                C5714i.m12539a(th);
            }
            this.f13371a.f13350e.mo28319c(C5588a.class);
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$l */
    public static final class C5165l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C5165l f13377a = new C5165l();

        static {
            Covode.recordClassIndex(5757);
        }

        C5165l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C89219l.m154716b(th, "");
            C3854a.m9455a(6, "LinkUserInfoCenter", th.getStackTrace());
        }
    }

    /* renamed from: b */
    public final long mo10903b(String str) {
        User user;
        C89219l.m154721d(str, "");
        C7666e a = m11384a(this, str, 0, 2);
        if (a == null || (user = a.f19001c) == null) {
            return 0;
        }
        return user.getId();
    }

    public C5153d(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f13350e = dataChannel;
        C4431e.f12034a.mo10201a(this);
    }

    /* renamed from: a */
    public static void m11387a(EnumC5156c cVar) {
        long j;
        int i;
        String str;
        C89219l.m154721d(cVar, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C9618ar arVar = new C9618ar();
        if (cVar == EnumC5156c.BACKGROUND) {
            i = 100101;
        } else {
            i = 100102;
        }
        arVar.f23415g = i;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b == null || (str = String.valueOf(b.mo13161c())) == null) {
            str = "";
        }
        arVar.f23412d = str;
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        arVar.f23413e = a.f17260e;
        arVar.f23410b = "0";
        arVar.f23411c = "0";
        ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).sendSignalV1(j, C4139e.C4140a.f11575b.mo46674b(arVar), null).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142915a(C5164k.f13376a, C5165l.f13377a);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$e */
    public static final class C5158e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5153d f13361a;

        /* renamed from: b */
        final /* synthetic */ EnumC5155b f13362b;

        /* renamed from: c */
        final /* synthetic */ boolean f13363c;

        /* renamed from: d */
        final /* synthetic */ boolean f13364d;

        static {
            Covode.recordClassIndex(5750);
        }

        C5158e(C5153d dVar, EnumC5155b bVar, boolean z, boolean z2) {
            this.f13361a = dVar;
            this.f13362b = bVar;
            this.f13363c = z;
            this.f13364d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5831c cVar = (C5831c) obj;
            this.f13361a.f13346a = false;
            if (cVar != null) {
                try {
                    if (cVar.f14684b != null) {
                        this.f13361a.mo10904b();
                        ArrayList arrayList = new ArrayList();
                        List<C7666e> list = this.f13361a.f13347b;
                        list.clear();
                        List list2 = cVar.f14684b;
                        C89219l.m154716b(list2, "");
                        list.addAll(C89070n.m154580f((Iterable) list2));
                        for (T t : list) {
                            this.f13361a.mo10899a((C7666e) t);
                            User user = t.f19001c;
                            C89219l.m154716b(user, "");
                            long id = user.getId();
                            String a = t.mo13898a();
                            C89219l.m154716b(a, "");
                            arrayList.add(new C5157d(id, a, t.f19003e));
                        }
                        if (this.f13362b == EnumC5155b.LINKED_LIST_CHANGE || this.f13362b == EnumC5155b.GUEST_LEAVE) {
                            this.f13361a.mo10906c();
                        }
                        if (this.f13363c) {
                            this.f13361a.mo10907d();
                            if (C6894d.m14753a().f17273t > 0) {
                                C5741z.m12609c("live_play");
                            }
                        }
                        this.f13361a.mo10908e();
                        C5714i.m12542a(arrayList, this.f13362b, this.f13364d);
                        this.f13361a.mo10900a(this.f13363c);
                        if (this.f13364d) {
                            List list3 = cVar.f14684b;
                            C89219l.m154716b(list3, "");
                            C5714i.m12541a(list3);
                            return;
                        }
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.c.d$g */
    public static final class C5160g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5153d f13367a;

        /* renamed from: b */
        final /* synthetic */ boolean f13368b;

        /* renamed from: c */
        final /* synthetic */ EnumC5155b f13369c;

        /* renamed from: d */
        final /* synthetic */ boolean f13370d;

        static {
            Covode.recordClassIndex(5752);
        }

        C5160g(C5153d dVar, boolean z, EnumC5155b bVar, boolean z2) {
            this.f13367a = dVar;
            this.f13368b = z;
            this.f13369c = bVar;
            this.f13370d = z2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5594g gVar;
            ArrayList<C7664c> arrayList;
            C5594g gVar2;
            ArrayList<C7664c> arrayList2;
            C5594g gVar3;
            ArrayList<C7664c> arrayList3;
            C5594g gVar4;
            C5594g gVar5;
            ArrayList<C7664c> arrayList4;
            C5832d dVar = (C5832d) obj;
            this.f13367a.f13346a = false;
            ArrayList<C7664c> arrayList5 = null;
            if (dVar != null) {
                try {
                    if (dVar.data != null) {
                        this.f13367a.mo10904b();
                        ArrayList arrayList6 = new ArrayList();
                        List<C7666e> list = this.f13367a.f13347b;
                        list.clear();
                        if (!(dVar == null || (gVar5 = (C5594g) dVar.data) == null || (arrayList4 = gVar5.f14234a) == null)) {
                            for (T t : arrayList4) {
                                C89219l.m154716b(t, "");
                                C7666e a = C5166e.m11414a((C7664c) t, 2);
                                if (this.f13367a.f13348c.contains(a)) {
                                    this.f13367a.f13348c.remove(a);
                                }
                                this.f13367a.f13347b.add(a);
                            }
                        }
                        C5271a aVar = this.f13367a.f13349d;
                        if (aVar == null) {
                            C89219l.m154710a("mDataHolder");
                        }
                        if (!(dVar == null || (gVar4 = (C5594g) dVar.data) == null)) {
                            arrayList5 = gVar4.f14234a;
                        }
                        aVar.f13643n = arrayList5;
                        if (!(dVar == null || (gVar3 = (C5594g) dVar.data) == null || (arrayList3 = gVar3.f14235b) == null)) {
                            for (T t2 : arrayList3) {
                                C89219l.m154716b(t2, "");
                                C7666e a2 = C5166e.m11414a((C7664c) t2, 1);
                                if (this.f13367a.f13348c.contains(a2)) {
                                    this.f13367a.f13348c.remove(a2);
                                }
                                this.f13367a.f13347b.add(a2);
                            }
                        }
                        if (!(!this.f13368b || dVar == null || (gVar2 = (C5594g) dVar.data) == null || (arrayList2 = gVar2.f14236c) == null)) {
                            for (T t3 : arrayList2) {
                                List<C7666e> list2 = this.f13367a.f13347b;
                                C89219l.m154716b(t3, "");
                                list2.add(C5166e.m11414a((C7664c) t3, 0));
                            }
                        }
                        for (T t4 : list) {
                            this.f13367a.mo10899a((C7666e) t4);
                            User user = t4.f19001c;
                            C89219l.m154716b(user, "");
                            long id = user.getId();
                            String a3 = t4.mo13898a();
                            C89219l.m154716b(a3, "");
                            arrayList6.add(new C5157d(id, a3, t4.f19003e));
                        }
                        this.f13367a.f13348c.clear();
                        if (!(dVar == null || (gVar = (C5594g) dVar.data) == null || (arrayList = gVar.f14236c) == null)) {
                            for (T t5 : arrayList) {
                                List<C7666e> list3 = this.f13367a.f13348c;
                                C89219l.m154716b(t5, "");
                                list3.add(C5166e.m11414a((C7664c) t5, 0));
                            }
                        }
                        if (this.f13369c == EnumC5155b.LINKED_LIST_CHANGE || this.f13369c == EnumC5155b.GUEST_LEAVE) {
                            this.f13367a.mo10906c();
                        }
                        if (this.f13370d) {
                            this.f13367a.mo10907d();
                            if (C6894d.m14753a().f17273t > 0) {
                                C5741z.m12609c("live_play");
                            }
                        }
                        this.f13367a.mo10908e();
                        C5714i.m12542a(arrayList6, this.f13369c, this.f13368b);
                        this.f13367a.mo10900a(this.f13370d);
                        if (this.f13368b) {
                            C5714i.m12541a(this.f13367a.f13347b);
                            return;
                        }
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: a */
    public final int mo10895a(String str) {
        C89219l.m154721d(str, "");
        C7666e a = m11384a(this, str, 0, 2);
        if (a != null) {
            return a.f19004f;
        }
        return 1;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        long j;
        String str;
        EnumC5155b bVar;
        String str2;
        Integer num;
        String str3;
        try {
            if (!this.f13352g) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (iMessage != null) {
                Long l = null;
                if (iMessage instanceof C9617aq) {
                    C9617aq aqVar = (C9617aq) iMessage;
                    if (aqVar.f23387a == 8) {
                        C7666e a = m11384a(this, null, aqVar.f23393k, 1);
                        if (a != null) {
                            a.f18999a = aqVar.f23394l;
                        }
                        Iterator<T> it = this.f13353h.iterator();
                        while (it.hasNext()) {
                            it.next().mo10916a(aqVar.f23393k, aqVar.f23394l);
                        }
                    }
                } else if (iMessage instanceof C9619as) {
                    C9619as asVar = (C9619as) iMessage;
                    C9618ar c = asVar.mo16572c();
                    if (c != null) {
                        str2 = c.f23413e;
                    } else {
                        str2 = null;
                    }
                    C9618ar c2 = asVar.mo16572c();
                    if (c2 != null) {
                        num = Integer.valueOf(c2.f23415g);
                    } else {
                        num = null;
                    }
                    try {
                        C9618ar c3 = ((C9619as) iMessage).mo16572c();
                        if (!(c3 == null || (str3 = c3.f23412d) == null)) {
                            l = Long.valueOf(Long.parseLong(str3));
                        }
                        if (str2 == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        } else if (num == null) {
                            throw new IllegalStateException("Required value was null.".toString());
                        } else if (l != null) {
                            Iterator<T> it2 = this.f13353h.iterator();
                            while (it2.hasNext()) {
                                l.longValue();
                                it2.next().mo10918a(str2);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } catch (Exception unused) {
                    }
                } else if (iMessage instanceof C9606aj) {
                    try {
                        if (((C9606aj) iMessage).mo16562c() == C9606aj.EnumC9607a.AUDIENCE_LINKMIC) {
                            C9606aj ajVar = (C9606aj) iMessage;
                            int i = ajVar.f23319a;
                            String str4 = "";
                            if (i == 7) {
                                C6894d a2 = C6894d.m14753a();
                                C89219l.m154716b(a2, str4);
                                a2.mo13189b(ajVar.f23335u);
                                C6894d.m14753a().f17272s.remove(Long.valueOf(ajVar.f23328n.f23768a));
                                if (!LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                    m11388a(this, EnumC5155b.GUEST_LEAVE, 1);
                                }
                                Iterator<T> it3 = this.f13353h.iterator();
                                while (it3.hasNext()) {
                                    long j2 = ajVar.f23328n.f23768a;
                                    String str5 = ajVar.f23328n.f23769b;
                                    C89219l.m154716b(str5, str4);
                                    it3.next().mo10917a(j2, str5);
                                }
                                if (C89219l.m154714a(this.f13350e.mo28318b(C9119ed.class), (Object) true)) {
                                    C89219l.m154721d(ajVar, str4);
                                    JSONObject jSONObject = new JSONObject();
                                    C9763a aVar = ajVar.f23328n;
                                    if (aVar != null) {
                                        j = aVar.f23768a;
                                    } else {
                                        j = 0;
                                    }
                                    C9763a aVar2 = ajVar.f23328n;
                                    if (!(aVar2 == null || (str = aVar2.f23769b) == null)) {
                                        str4 = str;
                                    }
                                    C3866a.m9474a(jSONObject, "guest_user_id", j);
                                    C3866a.m9475a(jSONObject, "guest_linkmic_id", str4);
                                    C5714i.m12485a(jSONObject, ajVar);
                                    C5714i.m12543a(jSONObject, Long.valueOf(j), str4);
                                    C5714i iVar = C5714i.f14494j;
                                    C5714i.m12550a((C5714i) true, (boolean) "leave_message", (String) jSONObject, (JSONObject) 0);
                                }
                            } else if (i == 10 || i == 11) {
                                int i2 = ajVar.f23319a;
                                if (i2 == 10) {
                                    bVar = EnumC5155b.WAITING_LIST_CHANGE;
                                } else if (i2 != 11) {
                                    bVar = EnumC5155b.NONE;
                                } else {
                                    bVar = EnumC5155b.LINKED_LIST_CHANGE;
                                }
                                C6894d a3 = C6894d.m14753a();
                                C89219l.m154716b(a3, str4);
                                a3.mo13189b(ajVar.f23335u);
                                if (!LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                    m11388a(this, bVar, 1);
                                }
                            } else {
                                switch (i) {
                                    case 19:
                                    case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                                    case 21:
                                        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                                            Boolean bool = (Boolean) this.f13350e.mo28318b(C9119ed.class);
                                            if (bool == null || !bool.booleanValue()) {
                                                C5271a aVar3 = this.f13349d;
                                                if (aVar3 == null) {
                                                    C89219l.m154710a("mDataHolder");
                                                }
                                                if (!aVar3.f13648s) {
                                                    if (ajVar.f23332r != null) {
                                                        int i3 = ajVar.f23319a;
                                                        C9769a aVar4 = ajVar.f23332r;
                                                        C89219l.m154716b(aVar4, str4);
                                                        m11385a(i3, aVar4);
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                            m11388a(this, null, 2);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused3) {
        }
    }

    /* renamed from: a */
    public final String mo10897a(long j) {
        String a;
        C7666e a2 = m11384a(this, null, j, 1);
        if (a2 == null || (a = a2.mo13898a()) == null) {
            return "";
        }
        return a;
    }

    /* renamed from: a */
    private final void m11385a(int i, C9769a aVar) {
        mo10904b();
        List<C7666e> list = this.f13347b;
        list.clear();
        Iterator<T> it = aVar.f23781a.iterator();
        while (it.hasNext()) {
            C7666e a = C5166e.m11414a((C7664c) it.next(), 2);
            list.add(a);
            if (this.f13348c.contains(a)) {
                this.f13348c.remove(a);
            }
        }
        Iterator<T> it2 = aVar.f23782b.iterator();
        while (it2.hasNext()) {
            C7666e a2 = C5166e.m11414a((C7664c) it2.next(), 1);
            list.add(a2);
            if (this.f13348c.contains(a2)) {
                this.f13348c.remove(a2);
            }
        }
        list.addAll(this.f13348c);
        Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            mo10899a((C7666e) it3.next());
        }
        if (i == 19 || i == 21) {
            mo10906c();
        }
        mo10908e();
        mo10900a(false);
        C6555i.m14021b();
        C6555i.m9463b("list_opti_enable", "guest and audience handleListChangeMessage");
    }

    /* renamed from: a */
    public final C7666e mo10896a(String str, long j) {
        T t;
        C89219l.m154721d(str, "");
        Iterator<T> it = this.f13347b.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (C89219l.m154714a((Object) t2.mo13898a(), (Object) str)) {
                break;
            }
            User user = t2.f19001c;
            C89219l.m154716b(user, "");
            if (user.getId() == j) {
                break;
            }
        }
        return t;
    }

    /* renamed from: a */
    public static /* synthetic */ void m11388a(C5153d dVar, EnumC5155b bVar, int i) {
        if ((i & 2) != 0) {
            bVar = EnumC5155b.NONE;
        }
        dVar.mo10901a(false, bVar);
    }

    /* renamed from: a */
    public static /* synthetic */ C7666e m11384a(C5153d dVar, String str, long j, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        return dVar.mo10896a(str, j);
    }

    /* renamed from: a */
    private final void m11386a(long j, long j2, boolean z, boolean z2, EnumC5155b bVar) {
        this.f13351f = C7294d.m15197a(j, j2).mo142910a(new C11191f()).mo142915a(new C5158e(this, bVar, z2, z), new C5159f(this, z));
    }

    /* renamed from: b */
    private final void m11389b(long j, long j2, boolean z, boolean z2, EnumC5155b bVar) {
        AbstractC88403ab<C5832d<C5594g>> listByType;
        if (z) {
            listByType = ((MultiLiveApi) C5805e.m12718a().mo11572a(MultiLiveApi.class)).getListByType(j, j2, j, 0);
        } else {
            listByType = ((MultiLiveApi) C5805e.m12718a().mo11572a(MultiLiveApi.class)).getListByType(j, j2, j, 3);
        }
        this.f13351f = listByType.mo142910a(new C11191f()).mo142915a(new C5160g(this, z, bVar, z2), new C5161h(this, z));
    }
}
