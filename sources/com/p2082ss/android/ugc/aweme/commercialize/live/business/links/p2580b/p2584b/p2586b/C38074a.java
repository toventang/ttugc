package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2584b.p2586b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6162ae;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2584b.p2585a.C38072a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.AbstractC38089a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2590d.EnumC38092d;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2591e.C38094a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38101b;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38102c;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38104e;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38106g;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.EnumC38097a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.EnumC38109j;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.C38098a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a */
public final class C38074a extends AbstractC6166b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static final C38075a f89959i = new C38075a((byte) 0);

    /* renamed from: c */
    public Room f89960c;

    /* renamed from: d */
    public AbstractC38089a f89961d;

    /* renamed from: e */
    public AbstractC6157ab.AbstractC6158a f89962e;

    /* renamed from: f */
    public String f89963f;

    /* renamed from: g */
    public String f89964g;

    /* renamed from: h */
    C33744d f89965h;

    /* renamed from: j */
    private final Keva f89966j = Keva.getRepo("commercialize_live_business_links_keva_name");

    /* renamed from: k */
    private C38102c f89967k;

    /* renamed from: l */
    private IIconSlot.SlotViewModel f89968l;

    /* renamed from: m */
    private final C88411a f89969m = new C88411a();

    /* renamed from: n */
    private boolean f89970n;

    /* renamed from: o */
    private boolean f89971o;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a$d */
    public static final class C38079d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C38079d f89976a = new C38079d();

        static {
            Covode.recordClassIndex(45546);
        }

        C38079d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(45541);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "business_links";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(176, new RunnableC90250g(C38074a.class, "listenToLinksLiveEvent", C38104e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a$a */
    public static final class C38075a {
        static {
            Covode.recordClassIndex(45542);
        }

        private C38075a() {
        }

        public /* synthetic */ C38075a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_LIVE_ANCHOR_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* synthetic */ Object mo12079f() {
        return new C38072a(new C38076b(this));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return C89070n.m154524c(Integer.valueOf(C38098a.f90004a));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public final void mo12077d() {
        AbstractC38089a aVar;
        super.mo12077d();
        AbstractC6157ab.AbstractC6158a aVar2 = this.f89962e;
        if (!(aVar2 == null || (aVar = this.f89961d) == null)) {
            Context a = aVar2.mo12042a();
            C89219l.m154716b(a, "");
            aVar.mo66355b(a);
        }
        this.f89969m.dispose();
        C80298cg.m139205b(this);
    }

    /* renamed from: h */
    private final void m77163h() {
        this.f89971o = true;
        IIconSlot.SlotViewModel slotViewModel = this.f89968l;
        if (slotViewModel != null) {
            AbstractC88412b a = AbstractC88979t.m154307b(1000, TimeUnit.MILLISECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C38078c(slotViewModel, this), C38079d.f89976a);
            C89219l.m154716b(a, "");
            C88934a.m154195a(a, this.f89969m);
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12070a(Bundle bundle) {
        super.mo12070a(bundle);
        C80298cg.m139204a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a$c */
    public static final class C38078c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IIconSlot.SlotViewModel f89974a;

        /* renamed from: b */
        final /* synthetic */ C38074a f89975b;

        static {
            Covode.recordClassIndex(45545);
        }

        C38078c(IIconSlot.SlotViewModel slotViewModel, C38074a aVar) {
            this.f89974a = slotViewModel;
            this.f89975b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            Context a;
            Resources resources;
            this.f89974a.f15362m = 10000;
            C1213t<String> tVar = this.f89974a.f15360k;
            C89219l.m154716b(tVar, "");
            AbstractC6157ab.AbstractC6158a aVar = this.f89975b.f89962e;
            if (aVar == null || (a = aVar.mo12042a()) == null || (resources = a.getResources()) == null) {
                str = null;
            } else {
                str = resources.getString(R.string.h);
            }
            tVar.setValue(str);
        }
    }

    @AbstractC90264r
    public final void listenToLinksLiveEvent(C38104e eVar) {
        C89219l.m154721d(eVar, "");
        C38106g gVar = eVar.f90028a;
        if (gVar != null && C89219l.m154714a((Object) gVar.f90033b, (Object) EnumC38109j.DURING_LIVE.getValue())) {
            String str = gVar.f90032a;
            if (C89219l.m154714a((Object) str, (Object) EnumC38097a.CLOSE.getValue())) {
                AbstractC6157ab.AbstractC6158a aVar = this.f89962e;
                if (aVar != null) {
                    AbstractC38089a aVar2 = this.f89961d;
                    if (aVar2 != null) {
                        Context a = aVar.mo12042a();
                        C89219l.m154716b(a, "");
                        aVar2.mo66355b(a);
                    }
                    if (this.f89970n) {
                        m77163h();
                        return;
                    }
                    return;
                }
                return;
            }
            boolean z = true;
            if (C89219l.m154714a((Object) str, (Object) EnumC38097a.COUNT.getValue())) {
                boolean z2 = this.f89966j.getBoolean("business_links_during_live_tips_has_displayed", false);
                if (gVar.f90034c <= 0 || z2 || this.f89971o) {
                    z = false;
                }
                this.f89970n = z;
            } else if (C89219l.m154714a((Object) str, (Object) EnumC38097a.PIN.getValue())) {
                this.f89966j.storeBoolean("business_links_during_live_tips_has_displayed", true);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12073a(String str) {
        Long l;
        String str2;
        C33744d a;
        C33744d a2;
        super.mo12073a(str);
        if (str != null) {
            C33744d dVar = new C33744d();
            Room room = this.f89960c;
            Map<String, String> map = null;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            C33744d a3 = dVar.mo59983a("anchor_id", String.valueOf(l));
            Room room2 = this.f89960c;
            if (room2 != null) {
                str2 = String.valueOf(room2.getId());
            } else {
                str2 = null;
            }
            C33744d a4 = a3.mo59983a("room_id", str2).mo59983a("live_status", "during_live").mo59983a("enter_from_merge", this.f89963f).mo59983a("enter_method", this.f89964g);
            C89219l.m154716b(a4, "");
            this.f89965h = a4;
            int hashCode = str.hashCode();
            if (hashCode != -1884023019) {
                if (hashCode == -522623958 && str.equals("during_live")) {
                    C33744d dVar2 = this.f89965h;
                    if (!(dVar2 == null || (a2 = dVar2.mo59983a(StringSet.type, "toolbar")) == null)) {
                        map = a2.f79943a;
                    }
                    C39162r.m79460a("livesdk_add_links_show", map);
                }
            } else if (str.equals("during_live_dialog_item")) {
                C33744d dVar3 = this.f89965h;
                if (!(dVar3 == null || (a = dVar3.mo59983a(StringSet.type, "subpage")) == null)) {
                    map = a.f79943a;
                }
                C39162r.m79460a("livesdk_add_links_show", map);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.b.b.b.a$b */
    static final class C38076b implements AbstractC6162ae {

        /* renamed from: a */
        final /* synthetic */ C38074a f89972a;

        static {
            Covode.recordClassIndex(45543);
        }

        C38076b(C38074a aVar) {
            this.f89972a = aVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6162ae
        /* renamed from: a */
        public final void mo12082a(View view, String str) {
            C33744d a;
            C33744d a2;
            if (this.f89972a.f89961d == null) {
                this.f89972a.f89961d = C38094a.m77209a(EnumC38092d.DuringLive, new AbstractC89172b<Bundle, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2580b.p2584b.p2586b.C38074a.C38076b.C380771 */

                    /* renamed from: a */
                    final /* synthetic */ C38076b f89973a;

                    static {
                        Covode.recordClassIndex(45544);
                    }

                    {
                        this.f89973a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Bundle bundle) {
                        String str;
                        Bundle bundle2 = bundle;
                        C89219l.m154721d(bundle2, "");
                        Room room = this.f89973a.f89972a.f89960c;
                        Long l = null;
                        if (room != null) {
                            str = String.valueOf(room.getId());
                        } else {
                            str = null;
                        }
                        bundle2.putString("room_id", str);
                        Room room2 = this.f89973a.f89972a.f89960c;
                        if (room2 != null) {
                            l = Long.valueOf(room2.getOwnerUserId());
                        }
                        bundle2.putString("anchor_id", String.valueOf(l));
                        bundle2.putString("enter_from_merge", this.f89973a.f89972a.f89963f);
                        bundle2.putString("enter_method", this.f89973a.f89972a.f89964g);
                        return C89391z.f203057a;
                    }
                });
            }
            AbstractC6157ab.AbstractC6158a aVar = this.f89972a.f89962e;
            if (aVar != null) {
                AbstractC38089a aVar2 = this.f89972a.f89961d;
                if (aVar2 != null) {
                    Context a3 = aVar.mo12042a();
                    C89219l.m154716b(a3, "");
                    aVar2.mo66354a(a3);
                }
                int hashCode = str.hashCode();
                Map<String, String> map = null;
                if (hashCode != -1884023019) {
                    if (hashCode == -522623958 && str.equals("during_live")) {
                        C33744d dVar = this.f89972a.f89965h;
                        if (!(dVar == null || (a2 = dVar.mo59983a(StringSet.type, "toolbar")) == null)) {
                            map = a2.f79943a;
                        }
                        C39162r.m79460a("livesdk_add_links_click", map);
                    }
                } else if (str.equals("during_live_dialog_item")) {
                    C33744d dVar2 = this.f89972a.f89965h;
                    if (!(dVar2 == null || (a = dVar2.mo59983a(StringSet.type, "subpage")) == null)) {
                        map = a.f79943a;
                    }
                    C39162r.m79460a("livesdk_add_links_click", map);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        BALinkStruct bALinkStruct;
        BALinkStruct bALinkStruct2;
        String str;
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        Object obj = map.get("param_room");
        C38102c cVar = null;
        if (!(obj instanceof Room)) {
            obj = null;
        }
        this.f89960c = (Room) obj;
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f89963f = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        this.f89964g = (String) obj3;
        Room room = this.f89960c;
        if (!(room == null || (bALinkStruct2 = room.getBALinkStruct()) == null || (str = bALinkStruct2.baLinkData) == null)) {
            try {
                cVar = (C38102c) new C27910f().mo46670a(str, C38102c.class);
            } catch (Exception unused) {
            }
        }
        this.f89967k = cVar;
        Room room2 = this.f89960c;
        boolean z = true;
        if (room2 == null || (bALinkStruct = room2.getBALinkStruct()) == null || bALinkStruct.baLinkPermission != 1) {
            z = false;
        }
        bVar.mo12045a(z);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(IIconSlot.SlotViewModel slotViewModel, AbstractC6157ab.AbstractC6158a aVar) {
        Integer num;
        List<C38101b> cardList;
        List<C38101b> cardList2;
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        C89219l.m154721d(slotViewModel2, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel2, aVar);
        this.f89962e = aVar;
        this.f89968l = slotViewModel2;
        C1213t<Boolean> tVar = slotViewModel2.f15351b;
        C89219l.m154716b(tVar, "");
        boolean z = true;
        tVar.setValue(true);
        C1213t<Drawable> tVar2 = slotViewModel2.f15354e;
        C89219l.m154716b(tVar2, "");
        tVar2.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abw));
        C1213t<Drawable> tVar3 = slotViewModel2.f15355f;
        C89219l.m154716b(tVar3, "");
        tVar3.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abx));
        C1213t<String> tVar4 = slotViewModel2.f15358i;
        C89219l.m154716b(tVar4, "");
        tVar4.setValue(aVar.mo12042a().getString(R.string.bp));
        C1213t<Drawable> tVar5 = slotViewModel2.f15356g;
        C89219l.m154716b(tVar5, "");
        tVar5.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abs));
        C1213t<String> tVar6 = slotViewModel2.f15359j;
        C89219l.m154716b(tVar6, "");
        tVar6.setValue(aVar.mo12042a().getString(R.string.d));
        C38102c cVar = this.f89967k;
        if (cVar == null || (cardList2 = cVar.getCardList()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(cardList2.size());
        }
        slotViewModel2.f15365p = num;
        boolean z2 = this.f89966j.getBoolean("business_links_during_live_tips_has_displayed", false);
        C38102c cVar2 = this.f89967k;
        if (cVar2 == null || (cardList = cVar2.getCardList()) == null || cardList.isEmpty()) {
            z = false;
        }
        if (!z2 && z && !this.f89971o) {
            m77163h();
        }
    }
}
