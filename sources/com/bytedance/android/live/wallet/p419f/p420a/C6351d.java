package com.bytedance.android.live.wallet.p419f.p420a;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.wallet.AbstractC6360g;
import com.bytedance.android.live.wallet.C6336e;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.p416c.C6318b;
import com.bytedance.android.live.wallet.p416c.C6331c;
import com.bytedance.android.live.wallet.p419f.p421b.AbstractC6358b;
import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.C11315d;
import com.bytedance.android.livesdk.wallet.C11316e;
import com.bytedance.android.livesdk.wallet.C11318g;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.f.a.d */
public final class C6351d extends AbstractC6349b<AbstractC6358b> {

    /* renamed from: a */
    public DiamondPackageExtra f15868a;

    /* renamed from: b */
    public C11314c f15869b;

    /* renamed from: c */
    public List<C11314c> f15870c;

    /* renamed from: d */
    public AbstractC88412b f15871d;

    /* renamed from: e */
    public AbstractC11635b f15872e;

    /* renamed from: f */
    public final AbstractC6360g f15873f = new C6352a(this);

    /* renamed from: g */
    public final C6318b f15874g;

    /* renamed from: h */
    public long f15875h;

    /* renamed from: i */
    public long f15876i;

    /* renamed from: j */
    private final AbstractC89244h f15877j = C11831d.m20835a(C6353b.f15881a);

    /* renamed from: k */
    private final AbstractC89244h f15878k = C89250i.m154773a((AbstractC89171a) C6356e.f15884a);

    /* renamed from: l */
    private final Activity f15879l;

    static {
        Covode.recordClassIndex(7073);
    }

    /* renamed from: g */
    private final IapApi m13708g() {
        return (IapApi) this.f15878k.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo12406a() {
        return (String) this.f15877j.getValue();
    }

    /* renamed from: com.bytedance.android.live.wallet.f.a.d$b */
    static final class C6353b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C6353b f15881a = new C6353b();

        static {
            Covode.recordClassIndex(7075);
        }

        C6353b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
        }
    }

    /* renamed from: e */
    public final void mo12411e() {
        this.f15874g.mo12351a(this.f15873f);
    }

    /* renamed from: f */
    public final void mo12412f() {
        this.f15874g.mo12355b(this.f15873f);
    }

    /* renamed from: com.bytedance.android.live.wallet.f.a.d$e */
    static final class C6356e extends AbstractC89220m implements AbstractC89171a<IapApi> {

        /* renamed from: a */
        public static final C6356e f15884a = new C6356e();

        static {
            Covode.recordClassIndex(7078);
        }

        C6356e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IapApi invoke() {
            return C5805e.m12718a().mo11572a(IapApi.class);
        }
    }

    @Override // com.bytedance.ies.p1114a.AbstractC16043b
    /* renamed from: b */
    public final void mo8577b() {
        AbstractC88412b bVar;
        super.mo8577b();
        AbstractC88412b bVar2 = this.f15871d;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f15871d) == null)) {
            bVar.dispose();
        }
        this.f15872e = null;
    }

    /* renamed from: c */
    public final void mo12409c() {
        AbstractC88412b bVar;
        AbstractC6358b bVar2 = (AbstractC6358b) this.f38654y;
        if (bVar2 != null) {
            bVar2.mo12290l();
        }
        AbstractC88412b bVar3 = this.f15871d;
        if (!(bVar3 == null || bVar3.isDisposed() || (bVar = this.f15871d) == null)) {
            bVar.dispose();
        }
        if (C6336e.f15839g.f15841a.length() != 0 || C6336e.C6337a.m13682a()) {
            mo12410d();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo12406a());
        this.f15874g.mo12354a(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12410d() {
        long j;
        if (C6336e.C6337a.m13682a()) {
            j = 8;
        } else {
            j = 0;
        }
        this.f15871d = m13708g().fetchDiamondPackage(C6336e.f15839g.f15841a, this.f15875h, this.f15876i, j).mo143271a(new C11191f()).mo143254a(new C6354c(this), new C6355d(this));
    }

    /* renamed from: com.bytedance.android.live.wallet.f.a.d$a */
    public static final class C6352a implements AbstractC6360g {

        /* renamed from: a */
        final /* synthetic */ C6351d f15880a;

        static {
            Covode.recordClassIndex(7074);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C6352a(C6351d dVar) {
            this.f15880a = dVar;
        }

        @Override // com.bytedance.android.live.wallet.AbstractC6360g
        /* renamed from: a */
        public final void mo12414a(int i, Object obj) {
            ArrayList arrayList;
            List<C11314c> list;
            ArrayList arrayList2 = null;
            Integer num = null;
            if (i == 1) {
                C6351d dVar = this.f15880a;
                if (obj != null) {
                    List<C11314c> list2 = (List) obj;
                    if (list2.size() != 1 || !C13627m.m24499a(((C11314c) list2.get(0)).f27056b, dVar.mo12406a())) {
                        for (C11314c cVar : list2) {
                            List<C11314c> list3 = dVar.f15870c;
                            if (list3 != null) {
                                for (T t : list3) {
                                    if (C13627m.m24499a(t.f27056b, cVar.f27056b)) {
                                        t.f27057c = cVar.f27057c;
                                        t.f27062h = cVar.f27062h;
                                        t.f27061g = cVar.f27061g;
                                        t.f27064j = cVar.f27064j;
                                    }
                                }
                            }
                        }
                        List<C11314c> list4 = dVar.f15870c;
                        if (list4 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (T t2 : list4) {
                                if (!C13627m.m24498a(t2.f27061g)) {
                                    arrayList3.add(t2);
                                }
                            }
                            arrayList = arrayList3;
                        } else {
                            arrayList = null;
                        }
                        if (C89206ad.m154681c(arrayList)) {
                            arrayList2 = arrayList;
                        }
                        dVar.f15870c = arrayList2;
                        if (C6336e.f15839g.mo12388a().isEmpty() && (list = dVar.f15870c) != null) {
                            C6336e.f15839g.mo12390a(list);
                        }
                        AbstractC6358b bVar = (AbstractC6358b) dVar.f38654y;
                        if (bVar != null) {
                            bVar.mo12291m();
                        }
                        AbstractC6358b bVar2 = (AbstractC6358b) dVar.f38654y;
                        if (bVar2 != null) {
                            DiamondPackageExtra diamondPackageExtra = dVar.f15868a;
                            List<C11314c> list5 = dVar.f15870c;
                            if (list5 == null) {
                                list5 = new ArrayList<>();
                            }
                            bVar2.mo12281a(diamondPackageExtra, list5);
                        }
                        AbstractC11635b bVar3 = dVar.f15872e;
                        if (bVar3 != null) {
                            bVar3.mo18418a(1, 0, "ok");
                            return;
                        }
                        return;
                    }
                    C6336e eVar = C6336e.f15839g;
                    String str = ((C11314c) list2.get(0)).f27061g;
                    C89219l.m154716b(str, "");
                    eVar.mo12389a(str);
                    dVar.mo12410d();
                    return;
                }
                AbstractC6358b bVar4 = (AbstractC6358b) dVar.f38654y;
                if (bVar4 != null) {
                    bVar4.mo12291m();
                }
                AbstractC6358b bVar5 = (AbstractC6358b) dVar.f38654y;
                if (bVar5 != null) {
                    bVar5.mo12282a(new Exception("result is null"), 0);
                }
            } else if (i == 2) {
                this.f15880a.mo12408a(obj);
            } else if (i == 3) {
                AbstractC6358b bVar6 = (AbstractC6358b) this.f15880a.f38654y;
                if (bVar6 != null) {
                    bVar6.mo12262c();
                }
                C11314c cVar2 = this.f15880a.f15869b;
                if (cVar2 != null) {
                    long j = (long) cVar2.f27055a;
                    AbstractC11635b bVar7 = this.f15880a.f15872e;
                    if (bVar7 != null) {
                        bVar7.mo18419a(j);
                    }
                }
                DiamondPackageExtra diamondPackageExtra2 = C6336e.f15839g.f15845e;
                if (diamondPackageExtra2 != null) {
                    C11314c cVar3 = this.f15880a.f15869b;
                    if (cVar3 != null) {
                        num = Integer.valueOf(cVar3.f27055a);
                    }
                    diamondPackageExtra2.recentlyPurchasedPacketId = num.intValue();
                }
                C11314c cVar4 = this.f15880a.f15869b;
                if (cVar4 != null) {
                    C6779a.m14563a().mo13053a(new C11315d(true, cVar4.f27058d));
                    AbstractC6358b bVar8 = (AbstractC6358b) this.f15880a.f38654y;
                    if (bVar8 != null) {
                        bVar8.mo12261b(cVar4.f27058d);
                    }
                }
            }
        }

        @Override // com.bytedance.android.live.wallet.AbstractC6360g
        /* renamed from: a */
        public final void mo12413a(int i, int i2, int i3, Exception exc, C11318g gVar) {
            C89219l.m154721d(exc, "");
            C89219l.m154721d(gVar, "");
            if (i == 1) {
                AbstractC11635b bVar = this.f15880a.f15872e;
                if (bVar != null) {
                    bVar.mo18418a(0, i2, exc.getMessage());
                }
                AbstractC6358b bVar2 = (AbstractC6358b) this.f15880a.f38654y;
                if (bVar2 != null) {
                    bVar2.mo12282a(exc, i2);
                }
            } else if (i == 2) {
                C6351d dVar = this.f15880a;
                C89219l.m154721d(exc, "");
                AbstractC6358b bVar3 = (AbstractC6358b) dVar.f38654y;
                if (bVar3 != null) {
                    bVar3.mo12262c();
                }
                if (!(exc instanceof Exception)) {
                    exc = null;
                }
                Exception exc2 = exc;
                if (exc2 == null) {
                    exc2 = new Exception();
                }
                AbstractC11635b bVar4 = dVar.f15872e;
                if (bVar4 != null) {
                    bVar4.mo18420a(exc2, "fail_google_create_order_fail");
                }
                AbstractC6358b bVar5 = (AbstractC6358b) dVar.f38654y;
                if (bVar5 != null) {
                    bVar5.mo12257a(i, i2, i3, exc2);
                }
            } else if (i == 3) {
                AbstractC6358b bVar6 = (AbstractC6358b) this.f15880a.f38654y;
                if (bVar6 != null) {
                    bVar6.mo12262c();
                }
                AbstractC6358b bVar7 = (AbstractC6358b) this.f15880a.f38654y;
                if (bVar7 != null) {
                    bVar7.mo12257a(i, i2, i3, exc);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12407a(C11314c cVar) {
        C89219l.m154721d(cVar, "");
        this.f15869b = cVar;
        AbstractC6358b bVar = (AbstractC6358b) this.f38654y;
        if (bVar != null) {
            bVar.mo12256a(R.string.gjg);
        }
        this.f15874g.mo12361a(cVar, this.f15879l);
    }

    /* renamed from: a */
    public final C11314c mo12405a(String str) {
        List<C11314c> list;
        C89219l.m154721d(str, "");
        if (C13603b.m24435a((Collection) this.f15870c) || (list = this.f15870c) == null) {
            return null;
        }
        for (T t : list) {
            if (C13627m.m24499a(t.f27056b, str)) {
                return t;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.f.a.d$d */
    public static final class C6355d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6351d f15883a;

        static {
            Covode.recordClassIndex(7077);
        }

        C6355d(C6351d dVar) {
            this.f15883a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            AbstractC6358b bVar;
            String message;
            Throwable th = (Throwable) obj;
            if (th instanceof C2908a) {
                i = ((C2908a) th).getErrorCode();
            } else {
                i = -1;
            }
            String str2 = "api exception";
            if (th == null || (str = th.getMessage()) == null) {
                str = str2;
            }
            C6331c.m13650a("ttlive_query_wallet_purchase", i, -1, str);
            AbstractC11635b bVar2 = this.f15883a.f15872e;
            if (bVar2 != null) {
                if (!(th == null || (message = th.getMessage()) == null)) {
                    str2 = message;
                }
                bVar2.mo18418a(0, i, str2);
            }
            AbstractC6358b bVar3 = (AbstractC6358b) this.f15883a.f38654y;
            if (bVar3 != null) {
                bVar3.mo12291m();
            }
            if ((th instanceof Exception) && (bVar = (AbstractC6358b) this.f15883a.f38654y) != null) {
                bVar.mo12282a((Exception) th, 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo12408a(Object obj) {
        C11316e eVar;
        String str;
        String str2;
        AbstractC6358b bVar = (AbstractC6358b) this.f38654y;
        if (bVar != null) {
            bVar.mo12262c();
        }
        AbstractC6358b bVar2 = (AbstractC6358b) this.f38654y;
        if (bVar2 != null) {
            bVar2.mo12256a(0);
        }
        if ((obj instanceof C11316e) && (str = (eVar = (C11316e) obj).f27068b) != null && (str2 = eVar.f27067a) != null) {
            C6318b bVar3 = this.f15874g;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            bVar3.f15810b.mo142945a(((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).checkOrderResult(str).mo143271a(new C11191f()).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) C6318b.C6326h.f15822a, false).mo143302g(C11195i.m19837a(1000)).mo143254a(new C6318b.C6327i(bVar3, str, SystemClock.uptimeMillis(), str2), new C6318b.C6328j(bVar3, str2, str)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.f.a.d$c */
    public static final class C6354c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6351d f15882a;

        static {
            Covode.recordClassIndex(7076);
        }

        C6354c(C6351d dVar) {
            this.f15882a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5827a aVar = (C5827a) obj;
            List<T> list = aVar.f14684b;
            C89219l.m154716b(list, "");
            if (C13603b.m24435a((Collection) list)) {
                C6331c.m13650a("ttlive_query_wallet_purchase", 12, -1, "query wallet purchase empty");
                AbstractC6358b bVar = (AbstractC6358b) this.f15882a.f38654y;
                if (bVar != null) {
                    bVar.mo12282a(new Exception("server diamonds is null"), 0);
                    return;
                }
                return;
            }
            AbstractC11635b bVar2 = this.f15882a.f15872e;
            if (bVar2 != null) {
                bVar2.mo18418a(2, 0, "api success");
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                String str = t.f27056b;
                C89219l.m154716b(str, "");
                arrayList.add(str);
            }
            this.f15882a.f15870c = list;
            this.f15882a.f15868a = (DiamondPackageExtra) aVar.f14685c;
            C6336e.f15839g.f15845e = this.f15882a.f15868a;
            HashMap hashMap = new HashMap();
            hashMap.put("iapKey", Integer.valueOf(list.size()));
            C6331c.m13652a("ttlive_query_wallet_purchase", hashMap);
            this.f15882a.f15874g.mo12354a(arrayList);
        }
    }

    public C6351d(Activity activity, C6318b bVar, long j, long j2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(bVar, "");
        this.f15879l = activity;
        this.f15874g = bVar;
        this.f15875h = j;
        this.f15876i = j2;
    }
}
