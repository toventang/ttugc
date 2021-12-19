package com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3279b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.AbstractC6188v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.ProductApi;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.AbstractC56636b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.C56635a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.C56637c;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.C56638d;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.EnumC56640f;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3284c.C56644c;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3278a.C56614a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.C56653a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3285a.C56645a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3286b.p3287a.C56649a;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.p3286b.p3288b.C56651b;
import com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.C56654a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b */
public final class C56618b extends AbstractC56636b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> implements AbstractC6188v, AbstractC18511d {

    /* renamed from: f */
    public static final C56619a f129050f = new C56619a((byte) 0);

    /* renamed from: c */
    public final C56645a f129051c;

    /* renamed from: d */
    public IIconSlot.SlotViewModel f129052d;

    /* renamed from: e */
    public final Context f129053e;

    /* renamed from: g */
    private final C56615a f129054g = new C56615a(new C56621c(this));

    /* renamed from: h */
    private AbstractC6157ab.AbstractC6158a f129055h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b$b */
    public static final class C56620b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f129056a;

        /* renamed from: b */
        int f129057b;

        /* renamed from: c */
        final /* synthetic */ C56618b f129058c;

        /* renamed from: d */
        Object f129059d;

        static {
            Covode.recordClassIndex(66464);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56620b(C56618b bVar, AbstractC89124d dVar) {
            super(dVar);
            this.f129058c = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f129056a = obj;
            this.f129057b |= Integer.MIN_VALUE;
            return this.f129058c.mo12093a(this);
        }
    }

    static {
        Covode.recordClassIndex(66462);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "ec_shop";
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b$a */
    public static final class C56619a {
        static {
            Covode.recordClassIndex(66463);
        }

        private C56619a() {
        }

        public /* synthetic */ C56619a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f129054g;
    }

    /* renamed from: h */
    public static String m102599h() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.common.p3283b.AbstractC56636b, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public final void mo12077d() {
        super.mo12077d();
        C18494b.m34422b("talent_live_product_list_num", this);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12073a(String str) {
        C56635a.m102627a(this.f129051c);
        mo93524a(new C56638d("rd_tiktokec_before_live_icon_show", m102599h(), "0"));
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b$d */
    static final class C56622d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f129061a;

        /* renamed from: b */
        final /* synthetic */ C56618b f129062b;

        /* renamed from: c */
        final /* synthetic */ long f129063c;

        static {
            Covode.recordClassIndex(66466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56622d(C56618b bVar, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f129062b = bVar;
            this.f129063c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C56622d(this.f129062b, this.f129063c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C56622d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f129061a == 0) {
                C89382r.m154942a(obj);
                ((ProductApi) C56653a.m102653a(ProductApi.class, "https://oec-api.tiktokv.com")).getProductsCount("0", true).enqueue(new AbstractC22030d<BaseResponse<C56614a>>(this) {
                    /* class com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3279b.C56618b.C56622d.C566231 */

                    /* renamed from: a */
                    final /* synthetic */ C56622d f129064a;

                    static {
                        Covode.recordClassIndex(66467);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f129064a = r1;
                    }

                    @Override // com.bytedance.retrofit2.AbstractC22030d
                    /* renamed from: a */
                    public final void mo6818a(AbstractC21983b<BaseResponse<C56614a>> bVar, Throwable th) {
                        String str;
                        long currentTimeMillis = System.currentTimeMillis() - this.f129064a.f129063c;
                        String h = C56618b.m102599h();
                        EnumC56640f fVar = EnumC56640f.RoomOwner;
                        if (th != null) {
                            str = th.getMessage();
                        } else {
                            str = null;
                        }
                        C56637c.m102634a(h, false, currentTimeMillis, "0", fVar, -7, str);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008c, code lost:
                        if (r11 == null) goto L_0x0085;
                     */
                    @Override // com.bytedance.retrofit2.AbstractC22030d
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo6817a(com.bytedance.retrofit2.AbstractC21983b<com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3278a.C56614a>> r10, com.bytedance.retrofit2.C22099u<com.p2082ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse<com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3278a.C56614a>> r11) {
                        /*
                        // Method dump skipped, instructions count: 147
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3279b.C56618b.C56622d.C566231.mo6817a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                    }
                });
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C56618b(Context context) {
        C89219l.m154721d(context, "");
        this.f129053e = context;
        String name = C56618b.class.getName();
        C89219l.m154716b(name, "");
        this.f129051c = new C56645a(name);
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C1213t<String> tVar;
        String str = "";
        C89219l.m154721d(cVar, str);
        if (C89219l.m154714a((Object) "talent_live_product_list_num", (Object) cVar.f44153a)) {
            AbstractC18754n nVar = cVar.f44154b;
            int i = 0;
            if (nVar != null) {
                i = C18586i.m34537a(nVar, "productNum", 0);
            }
            IIconSlot.SlotViewModel slotViewModel = this.f129052d;
            if (slotViewModel != null && (tVar = slotViewModel.f15352c) != null) {
                if (i > 0) {
                    str = String.valueOf(i);
                }
                tVar.setValue(str);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // com.bytedance.android.live.slot.AbstractC6188v
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo12093a(p4600h.p4603c.AbstractC89124d<? super java.lang.Boolean> r13) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.influencer.ecommercelive.business.p3274a.p3275a.p3276a.p3277a.p3279b.C56618b.mo12093a(h.c.d):java.lang.Object");
    }

    /* renamed from: com.ss.android.ugc.aweme.influencer.ecommercelive.business.a.a.a.a.b.b$c */
    static final class C56621c implements AbstractC6162ae {

        /* renamed from: a */
        final /* synthetic */ C56618b f129060a;

        static {
            Covode.recordClassIndex(66465);
        }

        C56621c(C56618b bVar) {
            this.f129060a = bVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6162ae
        /* renamed from: a */
        public final void mo12082a(View view, String str) {
            SmartRouter.buildRoute(this.f129060a.f129053e, C89361p.m154869a(C89361p.m154869a(C89361p.m154869a(C56654a.m102658a(), "_roomId_", "0", false), "_isLiving_", "false", false), "_liveStatus_", "before_live", false)).open();
            C56635a.m102628b(this.f129060a.f129051c);
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, ? extends Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        Object obj = map.get("param_live_commercial");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        this.f129051c.mo93532a("anchor_id", m102599h());
        this.f129051c.mo93532a("EVENT_ORIGIN_FEATURE", "TEMAI");
        this.f129051c.mo93532a("room_id", "0");
        this.f129051c.mo93532a("live_status", "before_live");
        bVar.mo12045a(C89219l.m154714a(obj, (Object) true));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(AbstractC1174ac acVar, AbstractC6157ab.AbstractC6158a aVar) {
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) acVar;
        C89219l.m154721d(slotViewModel, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel, aVar);
        this.f129052d = slotViewModel;
        this.f129055h = aVar;
        if (slotViewModel != null) {
            C56644c.m102642a(slotViewModel);
            C1213t<Drawable> tVar = slotViewModel.f15354e;
            C89219l.m154716b(tVar, "");
            tVar.setValue(C0643b.m2369a(this.f129053e, (int) R.drawable.a6e));
            C1213t<String> tVar2 = slotViewModel.f15358i;
            C89219l.m154716b(tVar2, "");
            tVar2.setValue(this.f129053e.getString(R.string.f3));
            C1213t<Drawable> tVar3 = slotViewModel.f15356g;
            C89219l.m154716b(tVar3, "");
            tVar3.setValue(C0643b.m2369a(this.f129053e, (int) R.drawable.a6a));
            C1213t<String> tVar4 = slotViewModel.f15359j;
            C89219l.m154716b(tVar4, "");
            tVar4.setValue(this.f129053e.getString(R.string.ev));
            if (C56649a.m102651b("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM")) {
                C1213t<Boolean> tVar5 = slotViewModel.f15353d;
                C89219l.m154716b(tVar5, "");
                tVar5.setValue(true);
                C56649a.m102650a("need_show_ec_red_dot_IN_PREVIEW_LIVEING_ROOM");
            } else {
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C56651b.f129114a), null, null, new C56622d(this, System.currentTimeMillis(), null), 3);
            }
        }
        C18494b.m34419a("talent_live_product_list_num", this, "ECProductBeforeLiveWidget");
    }
}
