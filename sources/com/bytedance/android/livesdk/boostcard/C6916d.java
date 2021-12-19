package com.bytedance.android.livesdk.boostcard;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p379n.C5785q;
import com.bytedance.android.livesdk.gift.p548d.C8797a;
import com.bytedance.android.livesdk.gift.p548d.C8798b;
import com.bytedance.android.livesdk.gift.p548d.C8799c;
import com.bytedance.android.livesdk.model.message.C9844f;
import com.bytedance.android.livesdk.model.message.C9891u;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.rank.api.p606a.C10332a;
import com.bytedance.android.livesdk.rank.api.p606a.C10333b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.boostcard.d */
public final class C6916d implements AbstractC18511d, OnMessageListener {

    /* renamed from: m */
    public static final C6917a f17310m = new C6917a((byte) 0);

    /* renamed from: a */
    public DataChannel f17311a;

    /* renamed from: b */
    public long f17312b;

    /* renamed from: c */
    public C88411a f17313c = new C88411a();

    /* renamed from: d */
    public long f17314d;

    /* renamed from: e */
    public long f17315e;

    /* renamed from: f */
    public boolean f17316f;

    /* renamed from: g */
    public boolean f17317g;

    /* renamed from: h */
    public boolean f17318h;

    /* renamed from: i */
    public boolean f17319i;

    /* renamed from: j */
    public int f17320j;

    /* renamed from: k */
    public String f17321k = "";

    /* renamed from: l */
    public final ArrayList<Long> f17322l = new ArrayList<>();

    /* renamed from: n */
    private C9891u f17323n;

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$e */
    public static final class C6921e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6921e f17326a = new C6921e();

        static {
            Covode.recordClassIndex(7660);
        }

        C6921e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$g */
    static final class C6923g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6923g f17328a = new C6923g();

        static {
            Covode.recordClassIndex(7662);
        }

        C6923g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(7655);
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$a */
    public static final class C6917a {
        static {
            Covode.recordClassIndex(7656);
        }

        private C6917a() {
        }

        public /* synthetic */ C6917a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$b */
    public static final class C6918b implements AbstractC88986z<C5832d<C6915c>> {
        static {
            Covode.recordClassIndex(7657);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C6918b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C5832d<C6915c> dVar) {
            C89219l.m154721d(dVar, "");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo13214a() {
        List<C9844f> list;
        int i;
        List<C9844f> list2;
        String str;
        C9891u uVar = this.f17323n;
        if (uVar == null || (list = uVar.f23920a) == null) {
            list = new ArrayList();
        }
        for (C9844f fVar : list) {
            String valueOf = String.valueOf(fVar.f23844c);
            String valueOf2 = String.valueOf(fVar.f23842a);
            String valueOf3 = String.valueOf(fVar.f23843b);
            C6501b a = C6501b.C6502a.m13948a("receive_boost_card").mo12639a();
            Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
            if (map == null || (str = (String) map.get("anchor_id")) == null) {
                str = "0";
            }
            C6501b a2 = a.mo12651a("anchor_id", str).mo12651a("task_id", valueOf).mo12651a("card_id", valueOf2);
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b, "");
            a2.mo12646a("user_id", b.mo13161c()).mo12651a("task_source", valueOf3).mo12655b();
        }
        C6779a a3 = C6779a.m14563a();
        C9891u uVar2 = this.f17323n;
        if (uVar2 == null || (list2 = uVar2.f23920a) == null) {
            i = 1;
        } else {
            i = list2.size();
        }
        a3.mo13053a(new C5785q(i));
        ((LiveBoostcardApi) C5805e.m12718a().mo11572a(LiveBoostcardApi.class)).boostCardAck(this.f17312b, 1).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C6918b());
        this.f17317g = false;
    }

    /* renamed from: b */
    public final void mo13215b() {
        String str;
        long a = this.f17314d - C11200a.m19851a();
        if (a <= 0) {
            this.f17316f = false;
            C6914b.f17303c = false;
            return;
        }
        this.f17316f = true;
        C6914b.f17303c = true;
        C6914b.f17304d = this.f17314d;
        String str2 = C6914b.f17305e;
        String str3 = C6914b.f17307g;
        String str4 = C6914b.f17306f;
        C6501b a2 = C6501b.C6502a.m13948a("boost_card_start_show").mo12639a();
        Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
        if (map == null || (str = (String) map.get("anchor_id")) == null) {
            str = "0";
        }
        C6501b a3 = a2.mo12651a("anchor_id", str).mo12651a("task_id", str2).mo12651a("card_id", str3);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a3.mo12646a("user_id", b.mo13161c()).mo12651a("task_source", str4).mo12655b();
        C10332a aVar = new C10332a();
        aVar.f24988b = 1;
        String str5 = this.f17321k;
        C89219l.m154721d(str5, "");
        aVar.f24987a = str5;
        C6914b.m14787a(aVar.f24987a);
        C6779a.m14563a().mo13053a(aVar);
        this.f17313c.mo142945a(AbstractC88979t.m154284a(1, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C6928l(this)));
        this.f17313c.mo142945a(AbstractC88979t.m154307b(a, TimeUnit.MILLISECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C6927k(this)));
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$c */
    public static final class C6919c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17324a;

        static {
            Covode.recordClassIndex(7658);
        }

        public C6919c(C6916d dVar) {
            this.f17324a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f17324a.mo13215b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$h */
    public static final class C6924h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17329a;

        static {
            Covode.recordClassIndex(7663);
        }

        public C6924h(C6916d dVar) {
            this.f17329a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f17329a.f17317g = true;
            C6916d dVar = this.f17329a;
            if (dVar.f17318h) {
                dVar.mo13214a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$j */
    public static final class C6926j<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17331a;

        static {
            Covode.recordClassIndex(7665);
        }

        public C6926j(C6916d dVar) {
            this.f17331a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C6916d dVar = this.f17331a;
            dVar.f17314d = C11200a.m19851a() + 60000;
            dVar.mo13215b();
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof C9891u) {
            this.f17323n = (C9891u) iMessage;
            if (this.f17317g) {
                mo13214a();
            } else {
                this.f17318h = true;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$d */
    public static final class C6920d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17325a;

        static {
            Covode.recordClassIndex(7659);
        }

        public C6920d(C6916d dVar) {
            this.f17325a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long j;
            C6931e eVar;
            C5832d dVar = (C5832d) obj;
            C6916d dVar2 = this.f17325a;
            if (dVar == null || (eVar = (C6931e) dVar.data) == null) {
                j = 0;
            } else {
                j = eVar.f17337b;
            }
            dVar2.f17315e = j;
            C6914b.f17302b = this.f17325a.f17315e;
            C6779a.m14563a().mo13053a(new C8799c(this.f17325a.f17315e));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.boostcard.d$k */
    public static final class C6927k<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17332a;

        static {
            Covode.recordClassIndex(7666);
        }

        C6927k(C6916d dVar) {
            this.f17332a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f17332a.f17316f = false;
            C6914b.f17303c = false;
            C6914b.f17308h = true;
            C6779a.m14563a().mo13053a(new C10333b());
            C6916d dVar = this.f17332a;
            C10332a aVar = new C10332a();
            aVar.f24988b = 3;
            C6779a.m14563a().mo13053a(aVar);
            dVar.f17313c.mo142944a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.boostcard.d$l */
    public static final class C6928l<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17333a;

        static {
            Covode.recordClassIndex(7667);
        }

        C6928l(C6916d dVar) {
            this.f17333a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f17333a.f17313c.mo142945a(((LiveBoostcardApi) C5805e.m12718a().mo11572a(LiveBoostcardApi.class)).queryUserStatus(this.f17333a.f17312b, false).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AbstractC88433f(this) {
                /* class com.bytedance.android.livesdk.boostcard.C6916d.C6928l.C69291 */

                /* renamed from: a */
                final /* synthetic */ C6928l f17334a;

                static {
                    Covode.recordClassIndex(7668);
                }

                {
                    this.f17334a = r1;
                }

                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(Object obj) {
                    long j;
                    C6931e eVar;
                    C5832d dVar = (C5832d) obj;
                    C6916d dVar2 = this.f17334a.f17333a;
                    if (dVar == null || (eVar = (C6931e) dVar.data) == null) {
                        j = 0;
                    } else {
                        j = eVar.f17337b;
                    }
                    dVar2.f17315e = j;
                    C6914b.f17302b = this.f17334a.f17333a.f17315e;
                    C6916d dVar3 = this.f17334a.f17333a;
                    C10332a aVar = new C10332a();
                    aVar.f24988b = 2;
                    aVar.f24989c = dVar3.f17315e;
                    C6779a.m14563a().mo13053a(aVar);
                    if (this.f17334a.f17333a.f17319i) {
                        this.f17334a.f17333a.f17320j++;
                        if (this.f17334a.f17333a.f17320j >= 10) {
                            this.f17334a.f17333a.f17320j = 0;
                            this.f17334a.f17333a.f17322l.add(Long.valueOf(this.f17334a.f17333a.f17315e));
                            C6779a.m14563a().mo13053a(new C8797a(this.f17334a.f17333a.f17322l));
                        }
                    }
                }
            }, C69302.f17335a));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$f */
    static final class C6922f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17327a;

        static {
            Covode.recordClassIndex(7661);
        }

        C6922f(C6916d dVar) {
            this.f17327a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C6931e eVar;
            List<C6913a> list;
            C5832d dVar = (C5832d) obj;
            this.f17327a.f17322l.clear();
            if (!(dVar == null || (eVar = (C6931e) dVar.data) == null || (list = eVar.f17336a) == null)) {
                for (C6913a aVar : list) {
                    this.f17327a.f17322l.add(Long.valueOf(aVar.f17300b));
                }
            }
            C6779a.m14563a().mo13053a(new C8797a(this.f17327a.f17322l));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.boostcard.d$i */
    public static final class C6925i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6916d f17330a;

        static {
            Covode.recordClassIndex(7664);
        }

        public C6925i(C6916d dVar) {
            this.f17330a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (((C8798b) obj).f21675a) {
                this.f17330a.f17319i = true;
                C6916d dVar = this.f17330a;
                dVar.f17319i = true;
                dVar.f17313c.mo142945a(((LiveBoostcardApi) C5805e.m12718a().mo11572a(LiveBoostcardApi.class)).queryUserStatus(dVar.f17312b, true).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C6922f(dVar), C6923g.f17328a));
                return;
            }
            this.f17330a.f17319i = false;
        }
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        int i;
        String str;
        String str2;
        String e;
        String str3 = "";
        C89219l.m154721d(cVar, str3);
        if (C89219l.m154714a((Object) "live_boost_use_card", (Object) cVar.f44153a)) {
            AbstractC18754n nVar = cVar.f44154b;
            int i2 = 0;
            if (nVar != null) {
                i = nVar.mo29766i("boost_end_time").mo29710d();
            } else {
                i = 0;
            }
            this.f17314d = ((long) i) * 1000;
            AbstractC18754n nVar2 = cVar.f44154b;
            if (nVar2 == null || (str = nVar2.mo29766i("card_id").mo29711e()) == null) {
                str = str3;
            }
            C6914b.m14790d(str);
            AbstractC18754n nVar3 = cVar.f44154b;
            if (nVar3 == null || (str2 = nVar3.mo29766i("task_id").mo29711e()) == null) {
                str2 = str3;
            }
            C6914b.m14788b(str2);
            AbstractC18754n nVar4 = cVar.f44154b;
            if (!(nVar4 == null || (e = nVar4.mo29766i("image_path").mo29711e()) == null)) {
                str3 = e;
            }
            this.f17321k = str3;
            AbstractC18754n nVar5 = cVar.f44154b;
            if (nVar5 != null) {
                i2 = nVar5.mo29766i("task_source").mo29710d();
            }
            C6914b.m14789c(String.valueOf(i2));
            mo13215b();
        }
    }
}
