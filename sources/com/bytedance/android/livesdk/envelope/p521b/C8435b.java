package com.bytedance.android.livesdk.envelope.p521b;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.gift.C4329e;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.envelope.api.RedEnvelopeApi;
import com.bytedance.android.livesdk.envelope.p520a.C8425a;
import com.bytedance.android.livesdk.envelope.p520a.C8426b;
import com.bytedance.android.livesdk.envelope.p520a.C8427c;
import com.bytedance.android.livesdk.envelope.p520a.C8428d;
import com.bytedance.android.livesdk.envelope.p520a.C8429e;
import com.bytedance.android.livesdk.envelope.p520a.C8430f;
import com.bytedance.android.livesdk.envelope.widget.AbstractC8445a;
import com.bytedance.android.livesdk.gift.p548d.C8802f;
import com.bytedance.android.livesdk.gift.p548d.C8805i;
import com.bytedance.android.livesdk.model.message.p577a.EnumC9596a;
import com.bytedance.android.livesdk.model.message.p592e.C9814a;
import com.bytedance.android.livesdk.model.message.p592e.C9815b;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.google.gson.C27910f;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.envelope.b.b */
public final class C8435b implements AbstractC8434a {

    /* renamed from: f */
    public static final C8436a f20864f = new C8436a((byte) 0);

    /* renamed from: a */
    final Set<C9815b> f20865a = new HashSet();

    /* renamed from: b */
    public DataChannel f20866b;

    /* renamed from: c */
    public AbstractC8445a f20867c;

    /* renamed from: d */
    String f20868d;

    /* renamed from: e */
    public boolean f20869e;

    /* renamed from: g */
    private Boolean f20870g;

    /* renamed from: h */
    private Room f20871h;

    /* renamed from: i */
    private final OnMessageListener f20872i = new C8440e(this);

    /* renamed from: j */
    private final C8437b f20873j = new C8437b(this);

    static {
        Covode.recordClassIndex(9281);
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$a */
    public static final class C8436a {
        static {
            Covode.recordClassIndex(9282);
        }

        private C8436a() {
        }

        public /* synthetic */ C8436a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: d */
    public final Room mo14754d() {
        return this.f20871h;
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: e */
    public final String mo14755e() {
        return this.f20868d;
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: c */
    public final boolean mo14753c() {
        return mo14758f();
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: b */
    public final boolean mo14752b() {
        Boolean bool = this.f20870g;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo14758f() {
        String str = this.f20868d;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: a */
    public final void mo14749a() {
        IMessageManager iMessageManager;
        this.f20867c = null;
        DataChannel dataChannel = this.f20866b;
        if (!(dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.mo28318b(C9068cg.class)) == null)) {
            iMessageManager.removeMessageListener(this.f20872i);
        }
        C18494b.m34422b("liveGoldenEnvelopeCreate", this.f20873j);
        C18494b.m34422b("liveGoldenEnvelopCloseAll", this.f20873j);
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$b */
    public static final class C8437b implements AbstractC18511d {

        /* renamed from: a */
        final /* synthetic */ C8435b f20874a;

        static {
            Covode.recordClassIndex(9283);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8437b(C8435b bVar) {
            this.f20874a = bVar;
        }

        @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
        /* renamed from: a */
        public final void mo8791a(C18502c cVar) {
            boolean z;
            Map<String, Object> b;
            C89219l.m154721d(cVar, "");
            C8435b bVar = this.f20874a;
            String str = cVar.f44153a;
            int hashCode = str.hashCode();
            if (hashCode != -1091071735) {
                if (hashCode == -126454431 && str.equals("liveGoldenEnvelopeCreate")) {
                    C3854a.m9453a(3, "RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopeCreate");
                    AbstractC18754n nVar = cVar.f44154b;
                    if (nVar != null && (b = nVar.mo29758b()) != null) {
                        C27910f fVar = C4139e.C4140a.f11575b;
                        C9815b bVar2 = (C9815b) fVar.mo46670a(fVar.mo46674b(b), C9815b.class);
                        C89219l.m154716b(bVar2, "");
                        String a = bVar.mo14756a(bVar2);
                        if (a != null) {
                            bVar.mo14757b(a);
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else if (str.equals("liveGoldenEnvelopCloseAll")) {
                C3854a.m9453a(3, "RedEnvelopePresenter", "handleEvent: liveGoldenEnvelopCloseAll");
                bVar.f20868d = null;
                String str2 = bVar.f20868d;
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.f20869e = !z;
                return;
            }
            C3854a.m9453a(6, "RedEnvelopePresenter", "handleEvent: unknown event->" + cVar.f44153a);
        }
    }

    /* renamed from: b */
    public final void mo14757b(String str) {
        AbstractC8445a aVar = this.f20867c;
        if (aVar != null) {
            aVar.mo14761a(str);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$d */
    static final class C8439d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C8439d f20876a = new C8439d();

        static {
            Covode.recordClassIndex(9285);
        }

        C8439d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3854a.m9453a(6, "RedEnvelopePresenter", "err stack: ".concat(String.valueOf(obj)));
        }
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: a */
    public final void mo14751a(String str) {
        boolean z;
        C89219l.m154721d(str, "");
        this.f20868d = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f20869e = !z;
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$f */
    static final class C8441f extends AbstractC89220m implements AbstractC89172b<C8805i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C8435b f20878a;

        static {
            Covode.recordClassIndex(9287);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8441f(C8435b bVar) {
            super(1);
            this.f20878a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C8805i iVar) {
            C8805i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            AbstractC8445a aVar = this.f20878a.f20867c;
            if (aVar != null) {
                aVar.mo14760a(iVar2);
            }
            DataChannel dataChannel = this.f20878a.f20866b;
            if (dataChannel != null) {
                dataChannel.mo28320c(C4329e.class, true);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo14756a(C9815b bVar) {
        boolean z;
        if (bVar == null) {
            z = true;
        } else {
            z = false;
        }
        C8426b bVar2 = null;
        if (z || bVar.f23839a == null) {
            return null;
        }
        C8428d dVar = new C8428d();
        if (mo14758f()) {
            C8430f[] fVarArr = new C8430f[1];
            C8430f fVar = new C8430f();
            C9814a aVar = bVar.f23839a;
            if (aVar != null) {
                bVar2 = C8427c.m16639a(aVar);
            }
            fVar.f20860a = bVar2;
            fVar.f20861b = bVar.f23840f;
            fVarArr[0] = fVar;
            dVar.f20857a = C89070n.m154525d(fVarArr);
        } else if (bVar.f23840f == 1) {
            C8430f[] fVarArr2 = new C8430f[1];
            C8430f fVar2 = new C8430f();
            C9814a aVar2 = bVar.f23839a;
            if (aVar2 != null) {
                bVar2 = C8427c.m16639a(aVar2);
            }
            fVar2.f20860a = bVar2;
            fVar2.f20861b = bVar.f23840f;
            fVarArr2[0] = fVar2;
            dVar.f20857a = C89070n.m154525d(fVarArr2);
        } else {
            C3854a.m9453a(6, "RedEnvelopePresenter", "wait interface");
        }
        dVar.f20858b = C11225an.f26870a;
        return C4139e.C4140a.f11575b.mo46674b(dVar);
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$c */
    static final class C8438c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C8435b f20875a;

        static {
            Covode.recordClassIndex(9284);
        }

        C8438c(C8435b bVar) {
            this.f20875a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            List<C8425a> list;
            C8426b bVar;
            String str;
            List<String> urls;
            C5832d dVar = (C5832d) obj;
            C8429e eVar = (C8429e) dVar.data;
            if (eVar == null || (list = eVar.f20859a) == null) {
                C3854a.m9453a(6, "RedEnvelopePresenter", "err info: empty list");
            } else if (list.size() > 0) {
                C8435b bVar2 = this.f20875a;
                Object obj2 = dVar.data;
                C89219l.m154716b(obj2, "");
                C8428d dVar2 = new C8428d();
                List<C8425a> list2 = ((C8429e) obj2).f20859a;
                if (list2 != null) {
                    for (T t : list2) {
                        List<C8430f> list3 = dVar2.f20857a;
                        C8430f fVar = new C8430f();
                        C89219l.m154721d(t, "");
                        C8426b bVar3 = new C8426b();
                        bVar3.f20849b = t.f20840b;
                        bVar3.f20852e = t.f20843e;
                        bVar3.f20848a = t.f20839a;
                        bVar3.f20850c = t.f20841c;
                        bVar3.f20853f = t.f20844f;
                        bVar3.f20855h = t.f20846h;
                        bVar3.f20854g = t.f20845g;
                        bVar3.f20851d = t.f20842d;
                        ImageModel imageModel = t.f20847i;
                        if (imageModel == null || (urls = imageModel.getUrls()) == null || (str = urls.get(0)) == null) {
                            str = "";
                        }
                        bVar3.f20856i = str;
                        fVar.f20860a = bVar3;
                        fVar.f20861b = 1;
                        list3.add(fVar);
                    }
                }
                for (T t2 : bVar2.f20865a) {
                    List<C8430f> list4 = dVar2.f20857a;
                    C8430f fVar2 = new C8430f();
                    C9814a aVar = t2.f23839a;
                    if (aVar != null) {
                        bVar = C8427c.m16639a(aVar);
                    } else {
                        bVar = null;
                    }
                    fVar2.f20860a = bVar;
                    fVar2.f20861b = t2.f23840f;
                    list4.add(fVar2);
                }
                bVar2.f20865a.clear();
                dVar2.f20858b = C11225an.f26870a;
                String b = C4139e.C4140a.f11575b.mo46674b(dVar2);
                C89219l.m154716b(b, "");
                bVar2.mo14757b(b);
                this.f20875a.f20869e = true;
            } else {
                C3854a.m9453a(6, "RedEnvelopePresenter", "err info: list size = 0");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.envelope.b.b$e */
    static final class C8440e implements OnMessageListener {

        /* renamed from: a */
        final /* synthetic */ C8435b f20877a;

        static {
            Covode.recordClassIndex(9286);
        }

        C8440e(C8435b bVar) {
            this.f20877a = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01cd  */
        @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onMessage(com.p2082ss.ugc.live.sdk.message.data.IMessage r11) {
            /*
            // Method dump skipped, instructions count: 470
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.envelope.p521b.C8435b.C8440e.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
        }
    }

    @Override // com.bytedance.android.livesdk.envelope.p521b.AbstractC8434a
    /* renamed from: a */
    public final void mo14750a(DataChannel dataChannel, AbstractC8445a aVar) {
        IMessageManager iMessageManager;
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(aVar, "");
        C3854a.m9453a(3, "RedEnvelopePresenter", "attachView(" + dataChannel + ')');
        this.f20867c = aVar;
        this.f20866b = dataChannel;
        this.f20870g = (Boolean) dataChannel.mo28318b(C9119ed.class);
        Room room = (Room) dataChannel.mo28318b(C9093de.class);
        this.f20871h = room;
        if (room == null) {
            C3854a.m9453a(3, "RedEnvelopePresenter", "getRedEnvelops: room info null");
        } else {
            RedEnvelopeApi redEnvelopeApi = (RedEnvelopeApi) C5805e.m12718a().mo11572a(RedEnvelopeApi.class);
            Room room2 = this.f20871h;
            if (room2 == null) {
                C89219l.m154715b();
            }
            String idStr = room2.getIdStr();
            C89219l.m154716b(idStr, "");
            redEnvelopeApi.getRedEnvelopList(idStr).mo142910a(new C11191f()).mo142915a(new C8438c(this), C8439d.f20876a);
        }
        DataChannel dataChannel2 = this.f20866b;
        if (dataChannel2 != null) {
            dataChannel2.mo28310a(C8802f.class, (AbstractC89172b) new C8441f(this));
        }
        C18494b.m34417a("liveGoldenEnvelopeCreate", this.f20873j);
        C18494b.m34417a("liveGoldenEnvelopCloseAll", this.f20873j);
        DataChannel dataChannel3 = this.f20866b;
        if (dataChannel3 != null && (iMessageManager = (IMessageManager) dataChannel3.mo28318b(C9068cg.class)) != null) {
            iMessageManager.addMessageListener(EnumC9596a.RED_ENVELOPE_MESSAGE.getIntType(), this.f20872i);
        }
    }
}
