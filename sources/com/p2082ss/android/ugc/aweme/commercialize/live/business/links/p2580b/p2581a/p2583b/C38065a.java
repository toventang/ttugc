package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2581a.p2583b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.android.live.slot.AbstractC6188v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.api.BusinessLinksLiveApi;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2581a.p2582a.C38063a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.EnumC38092d;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2591e.C38094a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38103d;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38104e;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38106g;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.EnumC38097a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.EnumC38109j;
import com.p2082ss.android.ugc.aweme.commercialize.util.p2620b.C38582a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4572d.C88483g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a */
public final class C38065a extends AbstractC6166b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> implements AbstractC6188v, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C38066a f89942i = new C38066a((byte) 0);

    /* renamed from: c */
    public AbstractC6157ab.AbstractC6158a f89943c;

    /* renamed from: d */
    public IIconSlot.SlotViewModel f89944d;

    /* renamed from: e */
    public AbstractC38089a f89945e;

    /* renamed from: f */
    public String f89946f;

    /* renamed from: g */
    public String f89947g;

    /* renamed from: h */
    C33744d f89948h;

    /* renamed from: j */
    private final Keva f89949j = Keva.getRepo("commercialize_live_business_links_keva_name");

    /* renamed from: k */
    private final C88411a f89950k = new C88411a();

    /* renamed from: l */
    private final Handler f89951l = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a$e */
    public static final class C38071e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C38071e f89957a = new C38071e();

        static {
            Covode.recordClassIndex(45538);
        }

        C38071e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45532);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "business_links";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(176, new RunnableC90250g(C38065a.class, "listenToLinksLiveEvent", C38104e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a$a */
    public static final class C38066a {
        static {
            Covode.recordClassIndex(45533);
        }

        private C38066a() {
        }

        public /* synthetic */ C38066a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_BROADCAST_PREVIEW_TOOLBAR;
    }

    /* renamed from: h */
    public static String m77150h() {
        String currentUserID;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* synthetic */ Object mo12079f() {
        return new C38063a(new C38067b(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a$c */
    static final class RunnableC38069c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C38065a f89954a;

        static {
            Covode.recordClassIndex(45536);
        }

        RunnableC38069c(C38065a aVar) {
            this.f89954a = aVar;
        }

        public final void run() {
            C1213t<String> tVar;
            IIconSlot.SlotViewModel slotViewModel = this.f89954a.f89944d;
            if (slotViewModel != null && (tVar = slotViewModel.f15352c) != null) {
                tVar.setValue(new String());
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public final void mo12077d() {
        AbstractC38089a aVar;
        super.mo12077d();
        AbstractC6157ab.AbstractC6158a aVar2 = this.f89943c;
        if (!(aVar2 == null || (aVar = this.f89945e) == null)) {
            Context a = aVar2.mo12042a();
            C89219l.m154716b(a, "");
            aVar.mo66355b(a);
        }
        this.f89950k.dispose();
        C80298cg.m139205b(this);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12070a(Bundle bundle) {
        super.mo12070a(bundle);
        C80298cg.m139204a(this);
    }

    /* renamed from: a */
    private final void m77149a(boolean z) {
        AbstractC88412b a = ((BusinessLinksLiveApi) C38582a.m78286a(BusinessLinksLiveApi.class)).getActiveLinksCount().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C38070d(this, z), C38071e.f89957a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f89950k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a$d */
    public static final class C38070d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C38065a f89955a;

        /* renamed from: b */
        final /* synthetic */ boolean f89956b;

        static {
            Covode.recordClassIndex(45537);
        }

        C38070d(C38065a aVar, boolean z) {
            this.f89955a = aVar;
            this.f89956b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C1213t<Boolean> tVar;
            C1213t<String> tVar2;
            C1213t<Boolean> tVar3;
            C38103d dVar = (C38103d) obj;
            if (dVar.getTotal() > 0) {
                IIconSlot.SlotViewModel slotViewModel = this.f89955a.f89944d;
                if (!(slotViewModel == null || (tVar3 = slotViewModel.f15353d) == null)) {
                    tVar3.setValue(false);
                }
                IIconSlot.SlotViewModel slotViewModel2 = this.f89955a.f89944d;
                if (slotViewModel2 != null && (tVar2 = slotViewModel2.f15352c) != null) {
                    tVar2.setValue(String.valueOf(dVar.getTotal()));
                    return;
                }
                return;
            }
            IIconSlot.SlotViewModel slotViewModel3 = this.f89955a.f89944d;
            if (slotViewModel3 != null && (tVar = slotViewModel3.f15353d) != null) {
                tVar.setValue(Boolean.valueOf(!this.f89956b));
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6188v
    /* renamed from: a */
    public final Object mo12093a(AbstractC89124d<? super Boolean> dVar) {
        try {
            AbstractC88403ab<BaseResponse> clearBusinessLinksCards = ((BusinessLinksLiveApi) C38582a.m78286a(BusinessLinksLiveApi.class)).clearBusinessLinksCards();
            C88483g gVar = new C88483g();
            clearBusinessLinksCards.mo116431a_(gVar);
            if (((BaseResponse) gVar.mo142989a()).status_code != 0) {
                return false;
            }
            this.f89951l.post(new RunnableC38069c(this));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @AbstractC90264r
    public final void listenToLinksLiveEvent(C38104e eVar) {
        IIconSlot.SlotViewModel slotViewModel;
        C1213t<String> tVar;
        String str;
        AbstractC38089a aVar;
        C89219l.m154721d(eVar, "");
        C38106g gVar = eVar.f90028a;
        if (gVar != null && C89219l.m154714a((Object) gVar.f90033b, (Object) EnumC38109j.BEFORE_LIVE.getValue())) {
            String str2 = gVar.f90032a;
            if (C89219l.m154714a((Object) str2, (Object) EnumC38097a.CLOSE.getValue())) {
                AbstractC6157ab.AbstractC6158a aVar2 = this.f89943c;
                if (aVar2 != null && (aVar = this.f89945e) != null) {
                    Context a = aVar2.mo12042a();
                    C89219l.m154716b(a, "");
                    aVar.mo66355b(a);
                }
            } else if (C89219l.m154714a((Object) str2, (Object) EnumC38097a.COUNT.getValue()) && (slotViewModel = this.f89944d) != null && (tVar = slotViewModel.f15352c) != null) {
                if (gVar.f90034c > 0) {
                    str = String.valueOf(gVar.f90034c);
                } else {
                    str = new String();
                }
                tVar.setValue(str);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12073a(String str) {
        C33744d a;
        C33744d a2;
        super.mo12073a(str);
        if (str != null) {
            C33744d a3 = new C33744d().mo59983a("anchor_id", m77150h()).mo59983a("room_id", "").mo59983a("live_status", "before_live").mo59983a("enter_from_merge", this.f89946f).mo59983a("enter_method", this.f89947g);
            C89219l.m154716b(a3, "");
            this.f89948h = a3;
            int hashCode = str.hashCode();
            Map<String, String> map = null;
            if (hashCode != -1095106132) {
                if (hashCode == 387613079 && str.equals("before_live_dialog_item")) {
                    C33744d dVar = this.f89948h;
                    if (!(dVar == null || (a2 = dVar.mo59983a(StringSet.type, "subpage")) == null)) {
                        map = a2.f79943a;
                    }
                    C39162r.m79460a("livesdk_add_links_show", map);
                }
            } else if (str.equals("before_live")) {
                C33744d dVar2 = this.f89948h;
                if (!(dVar2 == null || (a = dVar2.mo59983a(StringSet.type, "toolbar")) == null)) {
                    map = a.f79943a;
                }
                C39162r.m79460a("livesdk_add_links_show", map);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.a.b.a$b */
    static final class C38067b implements AbstractC6162ae {

        /* renamed from: a */
        final /* synthetic */ C38065a f89952a;

        static {
            Covode.recordClassIndex(45534);
        }

        C38067b(C38065a aVar) {
            this.f89952a = aVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6162ae
        /* renamed from: a */
        public final void mo12082a(View view, String str) {
            C33744d a;
            C33744d a2;
            if (this.f89952a.f89945e == null) {
                this.f89952a.f89945e = C38094a.m77209a(EnumC38092d.BeforeLive, new AbstractC89172b<Bundle, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2581a.p2583b.C38065a.C38067b.C380681 */

                    /* renamed from: a */
                    final /* synthetic */ C38067b f89953a;

                    static {
                        Covode.recordClassIndex(45535);
                    }

                    {
                        this.f89953a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Bundle bundle) {
                        Bundle bundle2 = bundle;
                        C89219l.m154721d(bundle2, "");
                        bundle2.putString("room_id", "0");
                        bundle2.putString("anchor_id", C38065a.m77150h());
                        bundle2.putString("enter_from_merge", this.f89953a.f89952a.f89946f);
                        bundle2.putString("enter_method", this.f89953a.f89952a.f89947g);
                        return C89391z.f203057a;
                    }
                });
            }
            AbstractC6157ab.AbstractC6158a aVar = this.f89952a.f89943c;
            if (aVar != null) {
                AbstractC38089a aVar2 = this.f89952a.f89945e;
                if (aVar2 != null) {
                    Context a3 = aVar.mo12042a();
                    C89219l.m154716b(a3, "");
                    aVar2.mo66354a(a3);
                }
                int hashCode = str.hashCode();
                Map<String, String> map = null;
                if (hashCode != -1095106132) {
                    if (hashCode == 387613079 && str.equals("before_live_dialog_item")) {
                        C33744d dVar = this.f89952a.f89948h;
                        if (!(dVar == null || (a2 = dVar.mo59983a(StringSet.type, "subpage")) == null)) {
                            map = a2.f79943a;
                        }
                        C39162r.m79460a("livesdk_add_links_click", map);
                    }
                } else if (str.equals("before_live")) {
                    C33744d dVar2 = this.f89952a.f89948h;
                    if (!(dVar2 == null || (a = dVar2.mo59983a(StringSet.type, "toolbar")) == null)) {
                        map = a.f79943a;
                    }
                    C39162r.m79460a("livesdk_add_links_click", map);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(IIconSlot.SlotViewModel slotViewModel, AbstractC6157ab.AbstractC6158a aVar) {
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        C89219l.m154721d(slotViewModel2, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel2, aVar);
        this.f89943c = aVar;
        this.f89944d = slotViewModel2;
        C1213t<Boolean> tVar = slotViewModel2.f15351b;
        C89219l.m154716b(tVar, "");
        tVar.setValue(true);
        C1213t<Drawable> tVar2 = slotViewModel2.f15354e;
        C89219l.m154716b(tVar2, "");
        tVar2.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abv));
        C1213t<String> tVar3 = slotViewModel2.f15358i;
        C89219l.m154716b(tVar3, "");
        tVar3.setValue(aVar.mo12042a().getString(R.string.bp));
        C1213t<Drawable> tVar4 = slotViewModel2.f15356g;
        C89219l.m154716b(tVar4, "");
        tVar4.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abs));
        C1213t<String> tVar5 = slotViewModel2.f15359j;
        C89219l.m154716b(tVar5, "");
        tVar5.setValue(aVar.mo12042a().getString(R.string.d));
        int i = this.f89949j.getInt("business_links_before_live_icon_display_times", 0);
        if (i > 5) {
            m77149a(true);
        } else {
            m77149a(false);
        }
        this.f89949j.storeInt("business_links_before_live_icon_display_times", i + 1);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        Object obj = map.get("param_live_ba_link");
        String str = null;
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f89946f = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (obj3 instanceof String) {
            str = obj3;
        }
        this.f89947g = str;
        bVar.mo12045a(C89219l.m154714a(obj, (Object) true));
    }
}
