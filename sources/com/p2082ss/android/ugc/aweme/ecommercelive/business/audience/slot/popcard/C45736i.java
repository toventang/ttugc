package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceProductListApi;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45687a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.p2866a.C45684b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.PopupCardVO;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45781b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45782c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2870c.C45799c;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.C45818a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45805b;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45808b;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a.C45813b;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i */
public final class C45736i extends AbstractC6166b<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> {

    /* renamed from: r */
    public static final C45737a f106510r = new C45737a((byte) 0);

    /* renamed from: c */
    public final AbstractC45748n f106511c;

    /* renamed from: d */
    public IFrameSlot.SlotViewModel f106512d;

    /* renamed from: e */
    public AbstractC6157ab.AbstractC6158a f106513e;

    /* renamed from: f */
    public final C45806a f106514f;

    /* renamed from: g */
    public Room f106515g;

    /* renamed from: h */
    public Boolean f106516h;

    /* renamed from: i */
    public Map<String, String> f106517i;

    /* renamed from: j */
    public Map<String, String> f106518j;

    /* renamed from: k */
    long f106519k;

    /* renamed from: l */
    long f106520l;

    /* renamed from: m */
    long f106521m;

    /* renamed from: n */
    long f106522n;

    /* renamed from: o */
    public C45782c f106523o;

    /* renamed from: p */
    AbstractC45717b f106524p;

    /* renamed from: q */
    public final Handler f106525q;

    /* renamed from: s */
    private String f106526s;

    /* renamed from: t */
    private String f106527t;

    /* renamed from: u */
    private String f106528u;

    /* renamed from: v */
    private String f106529v;

    /* renamed from: w */
    private String f106530w;

    /* renamed from: x */
    private String f106531x;

    /* renamed from: y */
    private String f106532y;

    /* renamed from: z */
    private final Context f106533z;

    static {
        Covode.recordClassIndex(54254);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "ec_shop";
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i$a */
    public static final class C45737a {
        static {
            Covode.recordClassIndex(54255);
        }

        private C45737a() {
        }

        public /* synthetic */ C45737a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i$e */
    public static final class C45741e extends C27895a<Map<String, ? extends String>> {
        static {
            Covode.recordClassIndex(54259);
        }

        C45741e() {
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f106511c;
    }

    /* renamed from: h */
    public static String m88296h() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return C89070n.m154524c(Integer.valueOf(C45781b.f106656h));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public final void mo12077d() {
        super.mo12077d();
        this.f106525q.removeCallbacksAndMessages(null);
        this.f106511c.f106553f = null;
        this.f106524p.mo77056a();
        this.f106511c.mo77071f();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: b */
    public final void mo12075b() {
        Object obj;
        C1213t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.f106512d;
        if (slotViewModel == null || (tVar = slotViewModel.f15346a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            this.f106514f.mo77116a("start_time", System.currentTimeMillis());
            this.f106511c.mo77069d();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: c */
    public final void mo12076c() {
        Object obj;
        C1213t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel = this.f106512d;
        if (slotViewModel == null || (tVar = slotViewModel.f15346a) == null || (value = tVar.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            mo77077c("other");
            this.f106511c.mo77070e();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* synthetic */ Enum mo12078e() {
        String a = C45684b.m88193a();
        int hashCode = a.hashCode();
        if (hashCode != -1033381948) {
            if (hashCode == 46430734 && a.equals("style_right")) {
                return IFrameSlot.EnumC6146b.SLOT_LIVE_WATCHER_L3_POP;
            }
        } else if (a.equals("style_transparent")) {
            return IFrameSlot.EnumC6146b.SLOT_LIVE_WATCHER_L2_POP;
        }
        return IFrameSlot.EnumC6146b.SLOT_LIVE_BOTTOM_POP;
    }

    /* renamed from: d */
    private final void m88295d(String str) {
        this.f106511c.mo77065a(str);
        this.f106524p.mo77059a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i$b */
    static final class C45738b implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ C45736i f106534a;

        static {
            Covode.recordClassIndex(54256);
        }

        C45738b(C45736i iVar) {
            this.f106534a = iVar;
        }

        public final boolean handleMessage(Message message) {
            Object obj;
            C1213t<Pair<Boolean, String>> tVar;
            Pair<Boolean, String> value;
            C89219l.m154721d(message, "");
            IFrameSlot.SlotViewModel slotViewModel = this.f106534a.f106512d;
            if (slotViewModel == null || (tVar = slotViewModel.f15346a) == null || (value = tVar.getValue()) == null) {
                obj = null;
            } else {
                obj = value.first;
            }
            if (C89219l.m154714a(obj, (Object) true)) {
                IFrameSlot.SlotViewModel slotViewModel2 = this.f106534a.f106512d;
                if (slotViewModel2 != null) {
                    C45799c.m88408a(slotViewModel2, false);
                }
                if (!ActivityStack.isAppBackGround()) {
                    this.f106534a.mo77077c("time_out");
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i$d */
    static final class C45740d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ IFrameSlot.SlotViewModel f106538a;

        /* renamed from: b */
        final /* synthetic */ C45736i f106539b;

        static {
            Covode.recordClassIndex(54258);
        }

        C45740d(IFrameSlot.SlotViewModel slotViewModel, C45736i iVar) {
            this.f106538a = slotViewModel;
            this.f106539b = iVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            Pair pair = (Pair) obj;
            if (C89219l.m154714a(pair.first, (Object) false) && (str = (String) pair.second) != null && str.hashCode() == -1210684352 && str.equals("visibility_reason_conflict")) {
                this.f106539b.mo77077c("conflict");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i$f */
    public static final class C45742f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106540a;

        /* renamed from: b */
        final /* synthetic */ C45736i f106541b;

        /* renamed from: c */
        final /* synthetic */ long f106542c;

        static {
            Covode.recordClassIndex(54260);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45742f(C45736i iVar, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106541b = iVar;
            this.f106542c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45742f(this.f106541b, this.f106542c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45742f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.f106540a == 0) {
                C89382r.m154942a(obj);
                AudienceProductListApi audienceProductListApi = (AudienceProductListApi) C45818a.m88431a(AudienceProductListApi.class, "https://oec-api.tiktokv.com");
                Room room = this.f106541b.f106515g;
                if (room == null || (str = String.valueOf(room.getId())) == null) {
                    str = "";
                }
                audienceProductListApi.getIntroduceProduct(str, C89108b.m154610a(1)).enqueue(new AbstractC22030d<BaseResponse<C45805b>>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45736i.C45742f.C457431 */

                    /* renamed from: a */
                    final /* synthetic */ C45742f f106543a;

                    static {
                        Covode.recordClassIndex(54261);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f106543a = r1;
                    }

                    @Override // com.bytedance.retrofit2.AbstractC22030d
                    /* renamed from: a */
                    public final void mo6818a(AbstractC21983b<BaseResponse<C45805b>> bVar, Throwable th) {
                        String str;
                        long currentTimeMillis = System.currentTimeMillis() - this.f106543a.f106542c;
                        String h = C45736i.m88296h();
                        Room room = this.f106543a.f106541b.f106515g;
                        String str2 = null;
                        if (room != null) {
                            str = String.valueOf(room.getId());
                        } else {
                            str = null;
                        }
                        if (th != null) {
                            str2 = th.getMessage();
                        }
                        C45792d.m88401a(h, str, false, currentTimeMillis, -7, str2);
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
                        if (r12 != null) goto L_0x0070;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008d, code lost:
                        if (r12 != null) goto L_0x007a;
                     */
                    @Override // com.bytedance.retrofit2.AbstractC22030d
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void mo6817a(com.bytedance.retrofit2.AbstractC21983b<com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse<com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45805b>> r11, com.bytedance.retrofit2.C22099u<com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse<com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2871a.p2872a.C45805b>> r12) {
                        /*
                        // Method dump skipped, instructions count: 146
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45736i.C45742f.C457431.mo6817a(com.bytedance.retrofit2.b, com.bytedance.retrofit2.u):void");
                    }
                });
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.i$c */
    static final class C45739c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106535a;

        /* renamed from: b */
        final /* synthetic */ C45736i f106536b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89234a f106537c;

        static {
            Covode.recordClassIndex(54257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45739c(C45736i iVar, C89233z.C89234a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106536b = iVar;
            this.f106537c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45739c(this.f106536b, this.f106537c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45739c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f106535a;
            if (i == 0) {
                C89382r.m154942a(obj);
                if (this.f106537c.element) {
                    this.f106535a = 1;
                    if (C89536ay.m155464a(400, this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C45813b.f106732a), null, null, new C45742f(this.f106536b, System.currentTimeMillis(), null), 3);
            return C89391z.f203057a;
        }
    }

    public C45736i(Context context) {
        AbstractC45748n fVar;
        C89219l.m154721d(context, "");
        this.f106533z = context;
        String a = C45684b.m88193a();
        int hashCode = a.hashCode();
        if (hashCode != -1033381948) {
            if (hashCode == 46430734 && a.equals("style_right")) {
                fVar = new C45744j();
                this.f106511c = fVar;
                String name = C45736i.class.getName();
                C89219l.m154716b(name, "");
                this.f106514f = new C45806a(name);
                this.f106516h = false;
                this.f106517i = new HashMap();
                this.f106524p = new C45728h(this);
                this.f106525q = new Handler(new C45738b(this));
            }
        } else if (a.equals("style_transparent")) {
            fVar = new C45724f();
            this.f106511c = fVar;
            String name2 = C45736i.class.getName();
            C89219l.m154716b(name2, "");
            this.f106514f = new C45806a(name2);
            this.f106516h = false;
            this.f106517i = new HashMap();
            this.f106524p = new C45728h(this);
            this.f106525q = new Handler(new C45738b(this));
        }
        fVar = new C45718c();
        this.f106511c = fVar;
        String name22 = C45736i.class.getName();
        C89219l.m154716b(name22, "");
        this.f106514f = new C45806a(name22);
        this.f106516h = false;
        this.f106517i = new HashMap();
        this.f106524p = new C45728h(this);
        this.f106525q = new Handler(new C45738b(this));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
        Object obj;
        C1213t<Pair<Boolean, String>> tVar;
        Pair<Boolean, String> value;
        if (iMessage instanceof C45781b) {
            int i = ((C45781b) iMessage).f106657i;
            if (i == C45781b.f106655g) {
                m88295d("unpin");
            } else if (i == C45781b.f106654f) {
                this.f106514f.mo77116a("client_received_time", System.currentTimeMillis());
                C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = false;
                IFrameSlot.SlotViewModel slotViewModel = this.f106512d;
                if (slotViewModel == null || (tVar = slotViewModel.f15346a) == null || (value = tVar.getValue()) == null) {
                    obj = null;
                } else {
                    obj = value.first;
                }
                if (C89219l.m154714a(obj, (Object) true)) {
                    aVar.element = true;
                }
                m88295d("repin");
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C45813b.f106733b), null, null, new C45739c(this, aVar, null), 3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo77076b(String str) {
        if (str == null || str.length() == 0 || !(this.f106511c instanceof C45718c)) {
            if (!(this.f106524p instanceof C45728h)) {
                this.f106524p = new C45728h(this);
            }
            AbstractC45748n.m88321a(this.f106511c, this.f106533z);
            return;
        }
        if (!(this.f106524p instanceof C45725g)) {
            this.f106524p = new C45725g(this);
        }
        this.f106511c.mo77061a(this.f106533z, true, str, this.f106517i);
    }

    /* renamed from: c */
    public final void mo77077c(String str) {
        C89219l.m154721d(str, "");
        this.f106514f.mo77117a("quit_type", str, false);
        this.f106514f.mo77116a("stay_time", System.currentTimeMillis() - this.f106514f.mo77119c("start_time"));
        this.f106524p.mo77060b(str);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(IFrameSlot.SlotViewModel slotViewModel, AbstractC6157ab.AbstractC6158a aVar) {
        String str;
        Long l;
        Long l2;
        String str2;
        String str3;
        C45687a aVar2;
        User owner;
        FollowInfo followInfo;
        IFrameSlot.SlotViewModel slotViewModel2 = slotViewModel;
        C89219l.m154721d(slotViewModel2, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel2, aVar);
        Context context = this.f106533z;
        String str4 = null;
        if (!(context instanceof ActivityC0945e)) {
            context = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) context;
        if (eVar != null) {
            slotViewModel2.f15346a.observe(eVar, new C45740d(slotViewModel2, this));
        }
        this.f106512d = slotViewModel2;
        this.f106513e = aVar;
        Room room = this.f106515g;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null || (str = String.valueOf(followInfo.getFollowStatus())) == null) {
            str = "-1";
        }
        C45806a aVar3 = this.f106514f;
        Room room2 = this.f106515g;
        if (room2 != null) {
            l = Long.valueOf(room2.getOwnerUserId());
        } else {
            l = null;
        }
        aVar3.mo77117a("author_id", String.valueOf(l), false);
        aVar3.mo77117a("EVENT_ORIGIN_FEATURE", "TEMAI", false);
        Room room3 = this.f106515g;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getId());
        } else {
            l2 = null;
        }
        aVar3.mo77117a("room_id", String.valueOf(l2), false);
        String str5 = this.f106526s;
        if (str5 == null) {
            str5 = "";
        }
        aVar3.mo77117a("enter_from_merge", str5, false);
        String str6 = this.f106527t;
        if (str6 == null) {
            str6 = "";
        }
        aVar3.mo77117a("enter_method", str6, false);
        String str7 = this.f106528u;
        if (str7 == null) {
            str7 = "";
        }
        aVar3.mo77117a("action_type", str7, false);
        aVar3.mo77117a("carrier_type", "live_popup_card", false);
        aVar3.mo77117a("page_type", "live", false);
        aVar3.mo77117a("anchor_show_type", "live_popup_card", false);
        aVar3.mo77115a("item_order", 1);
        aVar3.mo77117a("follow_status", str, false);
        aVar3.mo77117a("entrance_form", "live_popup_card", false);
        aVar3.mo77117a("page_name", "live", false);
        if (C89219l.m154714a((Object) this.f106516h, (Object) true)) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        aVar3.mo77117a("is_ad", str2, false);
        Map<String, String> map = this.f106517i;
        C89219l.m154721d("effect_ad_extra", "");
        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.Any");
        C45808b bVar = C45808b.f106721a;
        C45808b.C45809a aVar4 = aVar3.f106720a;
        if (aVar4 == null) {
            C89219l.m154715b();
        }
        Map<String, Object> a = bVar.mo77121a(aVar4);
        if (map == null) {
            a.remove("effect_ad_extra");
        } else {
            a.put("effect_ad_extra", map);
        }
        aVar3.mo77117a("rec_content_id", this.f106529v, false);
        aVar3.mo77117a("rec_content_type", this.f106532y, false);
        Room room4 = this.f106515g;
        if (room4 != null) {
            str3 = room4.getRequestId();
        } else {
            str3 = null;
        }
        aVar3.mo77117a("request_id", str3, true);
        aVar3.mo77117a("traffic_source", "live", false);
        aVar3.mo77117a("search_id", this.f106530w, false);
        aVar3.mo77117a("search_result_id", this.f106531x, false);
        C45782c cVar = this.f106523o;
        if (!(cVar == null || (aVar2 = cVar.f106662b) == null)) {
            PopupCardVO a2 = PopupCardVO.C45715a.m88223a(aVar2);
            a2.setPromotionSkin(cVar.f106664d);
            this.f106511c.mo77084a(a2);
        }
        this.f106511c.mo77062a(this.f106514f);
        C45782c cVar2 = this.f106523o;
        if (cVar2 != null) {
            str4 = cVar2.f106665e;
        }
        mo77076b(str4);
        this.f106524p.mo77057a(this.f106523o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0168 A[Catch:{ Exception -> 0x01a8 }] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12074a(java.util.Map<java.lang.String, ? extends java.lang.Object> r10, com.bytedance.android.live.slot.AbstractC6157ab.AbstractC6159b r11) {
        /*
        // Method dump skipped, instructions count: 433
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45736i.mo12074a(java.util.Map, com.bytedance.android.live.slot.ab$b):void");
    }
}
