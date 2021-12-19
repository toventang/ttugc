package com.bytedance.android.livesdk.wishlist.p666d;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.C8860x;
import com.bytedance.android.livesdk.gift.model.C8865y;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.service.network.GiftRetrofitApi;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.wishlist.C11512a;
import com.bytedance.android.livesdk.wishlist.C11542d;
import com.bytedance.android.livesdk.wishlist.p663a.C11513a;
import com.bytedance.android.livesdk.wishlist.p665c.C11541b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.google.gson.C27910f;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.wishlist.d.a */
public final class C11543a implements C11513a.AbstractC11514a, OnMessageListener {

    /* renamed from: h */
    public static final C11544a f27636h = new C11544a((byte) 0);

    /* renamed from: a */
    public C11513a.AbstractC11515b f27637a;

    /* renamed from: b */
    public List<? extends C8860x.C8861a> f27638b = new ArrayList();

    /* renamed from: c */
    public List<? extends C8860x.C8863b> f27639c = new ArrayList();

    /* renamed from: d */
    public String f27640d = "";

    /* renamed from: e */
    public int f27641e;

    /* renamed from: f */
    final C88411a f27642f = new C88411a();

    /* renamed from: g */
    public boolean f27643g;

    /* renamed from: i */
    private EnumC11545b f27644i = EnumC11545b.WISH_STATE_NOT_SET;

    /* renamed from: j */
    private DataChannel f27645j;

    /* renamed from: k */
    private boolean f27646k;

    /* renamed from: l */
    private final C11551h f27647l = new C11551h(this);

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$b */
    public enum EnumC11545b {
        WISH_STATE_NOT_SET,
        WISH_STATE_ON_GOING,
        WISH_STATE_FINISHED;

        static {
            Covode.recordClassIndex(13204);
        }
    }

    static {
        Covode.recordClassIndex(13202);
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$a */
    public static final class C11544a {
        static {
            Covode.recordClassIndex(13203);
        }

        private C11544a() {
        }

        public /* synthetic */ C11544a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11514a
    /* renamed from: b */
    public final EnumC11545b mo18328b() {
        return this.f27644i;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$a>, java.util.List<com.bytedance.android.livesdk.gift.model.x$a> */
    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11514a
    /* renamed from: c */
    public final List<C8860x.C8861a> mo18329c() {
        return this.f27638b;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$b>, java.util.List<com.bytedance.android.livesdk.gift.model.x$b> */
    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11514a
    /* renamed from: d */
    public final List<C8860x.C8863b> mo18330d() {
        return this.f27639c;
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11514a
    /* renamed from: a */
    public final void mo18327a(boolean z, AbstractC89171a<C89391z> aVar) {
        Room room;
        DataChannel dataChannel = this.f27645j;
        if (dataChannel != null && (room = (Room) dataChannel.mo28318b(C9093de.class)) != null && room.getOwnerUserId() > 0 && room.getId() > 0 && !this.f27643g) {
            m20378a(z, room, aVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$e */
    static final class C11548e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11543a f27654a;

        static {
            Covode.recordClassIndex(13207);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11548e(C11543a aVar) {
            super(0);
            this.f27654a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C11543a aVar = this.f27654a;
            aVar.f27642f.mo142945a(C11231b.m19896a(3, TimeUnit.SECONDS).mo143271a(new C11191f()).mo143254a(new C11552i(aVar), new C11553j(aVar)));
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11514a
    /* renamed from: a */
    public final void mo18325a() {
        int i;
        List<? extends C8860x.C8861a> list = this.f27638b;
        C89219l.m154721d(list, "");
        for (C8860x.C8861a aVar : list) {
            C6501b a = C6501b.C6502a.m13948a("livesdk_wishlist_finished_status").mo12639a();
            if (aVar.f21804c >= aVar.f21805d) {
                i = 1;
            } else {
                i = 0;
            }
            a.mo12645a("is_finished", i).mo12645a("wish_cnts", aVar.f21805d).mo12645a("finished_cnts", aVar.f21804c).mo12645a("unfinished_cnts", Math.max(aVar.f21805d - aVar.f21804c, 0)).mo12646a("gift_id", aVar.f21802a).mo12651a("show_reason", "live_end").mo12655b();
        }
        DataChannel dataChannel = this.f27645j;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
            IMessageManager iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
        }
        this.f27644i = EnumC11545b.WISH_STATE_NOT_SET;
        this.f27641e = 0;
        this.f27642f.mo142944a();
        this.f27645j = null;
        C18494b.m34422b("live-wish-list-commit-success", this.f27647l);
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$h */
    public static final class C11551h implements AbstractC18511d {

        /* renamed from: a */
        final /* synthetic */ C11543a f27659a;

        static {
            Covode.recordClassIndex(13210);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11551h(C11543a aVar) {
            this.f27659a = aVar;
        }

        @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
        /* renamed from: a */
        public final void mo8791a(C18502c cVar) {
            AbstractC18754n nVar;
            Map<String, Object> b;
            C89219l.m154721d(cVar, "");
            C11543a aVar = this.f27659a;
            C89219l.m154721d(cVar, "");
            String str = cVar.f44153a;
            if (str.hashCode() == -1300753897 && str.equals("live-wish-list-commit-success") && (nVar = cVar.f44154b) != null && (b = nVar.mo29758b()) != null) {
                C27910f fVar = C4139e.C4140a.f11575b;
                C8860x xVar = (C8860x) fVar.mo46670a(fVar.mo46674b(b), C8860x.class);
                if (xVar != null && xVar.f21801a != null) {
                    C8860x.C8864c cVar2 = xVar.f21801a;
                    if (cVar2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(cVar2, "");
                    aVar.mo18350a(cVar2);
                    C8860x.C8864c cVar3 = xVar.f21801a;
                    if (cVar3 == null) {
                        C89219l.m154715b();
                    }
                    aVar.mo18349a(cVar3.f21812a);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$d */
    static final class C11547d extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C11543a f27653a;

        static {
            Covode.recordClassIndex(13206);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11547d(C11543a aVar) {
            super(1);
            this.f27653a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            C89219l.m154721d(zVar, "");
            this.f27653a.mo18327a(true, (AbstractC89171a<C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$i */
    static final class C11552i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C11543a f27660a;

        static {
            Covode.recordClassIndex(13211);
        }

        C11552i(C11543a aVar) {
            this.f27660a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11543a.m20377a(this.f27660a).mo18331a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$j */
    static final class C11553j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C11543a f27661a;

        static {
            Covode.recordClassIndex(13212);
        }

        C11553j(C11543a aVar) {
            this.f27661a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11543a.m20377a(this.f27661a).mo18331a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C11513a.AbstractC11515b m20377a(C11543a aVar) {
        C11513a.AbstractC11515b bVar = aVar.f27637a;
        if (bVar == null) {
            C89219l.m154710a("mView");
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$g */
    public static final class C11550g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C11543a f27658a;

        static {
            Covode.recordClassIndex(13209);
        }

        C11550g(C11543a aVar) {
            this.f27658a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(3, "wishList", ((Throwable) obj).toString());
            C11543a.m20377a(this.f27658a).mo18332a(false, null);
            this.f27658a.f27643g = false;
        }
    }

    /* renamed from: a */
    private static boolean m20380a(C8860x.C8863b bVar) {
        if (bVar == null || bVar.f21811a == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m20379a(C8860x.C8861a aVar) {
        C8860x.C8861a.C8862a aVar2;
        C8860x.C8861a.C8862a aVar3;
        if (aVar == null || aVar.f21803b != 1 || aVar.f21805d <= 0 || aVar.f21802a <= 0 || aVar.f21806e == null || (aVar2 = aVar.f21806e) == null || aVar2.f21807a == null || (aVar3 = aVar.f21806e) == null || aVar3.f21808b == null) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C8860x.C8864c cVar;
        if (iMessage instanceof C8865y) {
            C8865y yVar = (C8865y) iMessage;
            if (yVar.f21817a != null && (cVar = yVar.f21817a) != null && cVar.f21812a > 0) {
                C8860x.C8864c cVar2 = yVar.f21817a;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                mo18350a(cVar2);
                mo18349a(cVar2.f21812a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$f */
    public static final class C11549f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C11543a f27655a;

        /* renamed from: b */
        final /* synthetic */ boolean f27656b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f27657c;

        static {
            Covode.recordClassIndex(13208);
        }

        C11549f(C11543a aVar, boolean z, AbstractC89171a aVar2) {
            this.f27655a = aVar;
            this.f27656b = z;
            this.f27657c = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8860x xVar;
            C8860x.C8864c cVar;
            C5832d dVar = (C5832d) obj;
            if (dVar != null && (xVar = (C8860x) dVar.data) != null && (cVar = xVar.f21801a) != null && cVar.f21812a > 0) {
                C8860x.C8864c cVar2 = ((C8860x) dVar.data).f21801a;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                this.f27655a.mo18350a(cVar2);
                this.f27655a.mo18349a(cVar2.f21812a);
                if (this.f27656b) {
                    C11543a.m20377a(this.f27655a).mo18332a(true, new C11546c(this.f27655a.f27638b, this.f27655a.f27639c, this.f27655a.f27640d, this.f27655a.f27641e));
                }
                AbstractC89171a aVar = this.f27657c;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f27655a.f27643g = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo18349a(int i) {
        EnumC11545b bVar = this.f27644i;
        if (i != 1) {
            if (i == 2) {
                List<? extends C8860x.C8861a> list = this.f27638b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (next.f21804c < next.f21805d) {
                            this.f27644i = EnumC11545b.WISH_STATE_ON_GOING;
                            break;
                        }
                    }
                }
            } else if (i == 3) {
                List<? extends C8860x.C8861a> list2 = this.f27638b;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next2 = it2.next();
                        if (next2.f21804c < next2.f21805d) {
                            break;
                        }
                    }
                }
                this.f27644i = EnumC11545b.WISH_STATE_FINISHED;
            }
        } else if (this.f27638b.isEmpty()) {
            this.f27644i = EnumC11545b.WISH_STATE_NOT_SET;
        }
        if (bVar == EnumC11545b.WISH_STATE_NOT_SET && this.f27644i.compareTo((Enum) EnumC11545b.WISH_STATE_NOT_SET) > 0 && !this.f27646k) {
            C11541b.m20374a();
        }
        if (bVar == EnumC11545b.WISH_STATE_ON_GOING && this.f27644i == EnumC11545b.WISH_STATE_FINISHED) {
            C11541b.m20375a(this.f27641e);
        }
    }

    /* renamed from: a */
    public final void mo18350a(C8860x.C8864c cVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        List f;
        List f2;
        List<C8860x.C8861a> list = cVar.f21813b;
        if (list == null || (f2 = C89070n.m154580f((Iterable) list)) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : f2) {
                if (m20379a((C8860x.C8861a) obj)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        List<? extends C8860x.C8861a> g = C89070n.m154585g((Collection) arrayList);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
        ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) g, 10));
        Iterator<T> it = g.iterator();
        while (it.hasNext()) {
            arrayList4.add(Long.valueOf(it.next().f21802a));
        }
        dataChannelGlobal.mo28321a(C11542d.class, arrayList4);
        this.f27638b = g;
        List<C8860x.C8863b> list2 = cVar.f21814c;
        if (list2 == null || (f = C89070n.m154580f((Iterable) list2)) == null) {
            arrayList2 = new ArrayList();
        } else {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : f) {
                if (m20380a((C8860x.C8863b) obj2)) {
                    arrayList5.add(obj2);
                }
            }
            arrayList2 = arrayList5;
        }
        this.f27639c = arrayList2;
        if (cVar.f21816e != null) {
            String str = cVar.f21816e;
            if (str == null) {
                C89219l.m154715b();
            }
            this.f27640d = str;
        }
        this.f27641e = cVar.f21815d;
    }

    @Override // com.bytedance.android.livesdk.wishlist.p663a.C11513a.AbstractC11514a
    /* renamed from: a */
    public final void mo18326a(DataChannel dataChannel, C11513a.AbstractC11515b bVar) {
        boolean z;
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(bVar, "");
        this.f27645j = dataChannel;
        this.f27637a = bVar;
        if (dataChannel != null) {
            IMessageManager iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class);
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(EnumC9596a.WISH_LIST_UPDATE_MESSAGE.getIntType(), this);
            }
            dataChannel.mo28312a(this, C11512a.class, new C11547d(this));
            Boolean bool = (Boolean) dataChannel.mo28318b(C9119ed.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            this.f27646k = z;
        }
        C18494b.m34417a("live-wish-list-commit-success", this.f27647l);
        mo18327a(false, (AbstractC89171a<C89391z>) new C11548e(this));
    }

    /* renamed from: a */
    private final void m20378a(boolean z, Room room, AbstractC89171a<C89391z> aVar) {
        this.f27643g = true;
        this.f27642f.mo142945a(((GiftRetrofitApi) C5805e.m12718a().mo11572a(GiftRetrofitApi.class)).getWishList(room.getOwnerUserId(), room.getId()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C11549f(this, z, aVar), new C11550g(this)));
    }

    /* renamed from: com.bytedance.android.livesdk.wishlist.d.a$c */
    public static final class C11546c {

        /* renamed from: a */
        public final List<C8860x.C8861a> f27649a;

        /* renamed from: b */
        public final List<C8860x.C8863b> f27650b;

        /* renamed from: c */
        public final String f27651c;

        /* renamed from: d */
        public final int f27652d;

        static {
            Covode.recordClassIndex(13205);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11546c)) {
                return false;
            }
            C11546c cVar = (C11546c) obj;
            return C89219l.m154714a(this.f27649a, cVar.f27649a) && C89219l.m154714a(this.f27650b, cVar.f27650b) && C89219l.m154714a(this.f27651c, cVar.f27651c) && this.f27652d == cVar.f27652d;
        }

        public final int hashCode() {
            List<C8860x.C8861a> list = this.f27649a;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<C8860x.C8863b> list2 = this.f27650b;
            int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str = this.f27651c;
            if (str != null) {
                i = str.hashCode();
            }
            return ((hashCode2 + i) * 31) + this.f27652d;
        }

        public final String toString() {
            return "WishListValidData(wishes=" + this.f27649a + ", contributors=" + this.f27650b + ", anchorWishDescriptionString=" + this.f27651c + ", contributorsLength=" + this.f27652d + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$a> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.gift.model.x$b> */
        /* JADX WARN: Multi-variable type inference failed */
        public C11546c(List<? extends C8860x.C8861a> list, List<? extends C8860x.C8863b> list2, String str, int i) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(str, "");
            this.f27649a = list;
            this.f27650b = list2;
            this.f27651c = str;
            this.f27652d = i;
        }
    }
}
