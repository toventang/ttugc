package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2587c.p2589b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.C1213t;
import com.bytedance.android.live.slot.AbstractC6157ab;
import com.bytedance.android.live.slot.AbstractC6166b;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.BALinkStruct;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2587c.p2588a.C38082a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38101b;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38102c;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38104e;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38105f;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38106g;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.EnumC38097a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.C38098a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.EnumC38099b;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2576b.C38054a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2576b.C38058b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.b.a */
public final class C38085a extends AbstractC6166b<IFrameSlot, IFrameSlot.SlotViewModel, IFrameSlot.EnumC6146b> implements AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C38086a f89984e = new C38086a((byte) 0);

    /* renamed from: c */
    public Room f89985c;

    /* renamed from: d */
    public IFrameSlot.SlotViewModel f89986d;

    /* renamed from: f */
    private AbstractC6157ab.AbstractC6158a f89987f;

    /* renamed from: g */
    private C38102c f89988g;

    /* renamed from: h */
    private final C38082a f89989h = new C38082a();

    /* renamed from: i */
    private C38101b f89990i;

    /* renamed from: j */
    private final AbstractC89244h f89991j = C89250i.m154773a((AbstractC89171a) new C38088c(this));

    /* renamed from: k */
    private long f89992k;

    /* renamed from: l */
    private String f89993l;

    /* renamed from: m */
    private String f89994m;

    /* renamed from: n */
    private final Handler f89995n = new Handler(new C38087b(this));

    static {
        Covode.recordClassIndex(45552);
    }

    /* renamed from: h */
    private final boolean m77190h() {
        return ((Boolean) this.f89991j.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "business_links";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(176, new RunnableC90250g(C38085a.class, "listenToLinksLiveEvent", C38104e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.b.a$a */
    public static final class C38086a {
        static {
            Covode.recordClassIndex(45553);
        }

        private C38086a() {
        }

        public /* synthetic */ C38086a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IFrameSlot.EnumC6146b.SLOT_LIVE_BOTTOM_POP;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo12079f() {
        return this.f89989h;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: d */
    public final void mo12077d() {
        super.mo12077d();
        m77191i();
        C80298cg.m139205b(this);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return C89070n.m154524c(Integer.valueOf(C38098a.f90004a));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.b.a$c */
    static final class C38088c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C38085a f89997a;

        static {
            Covode.recordClassIndex(45555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38088c(C38085a aVar) {
            super(0);
            this.f89997a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            String str;
            Long l;
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            if (createIUserServicebyMonsterPlugin == null || (str = createIUserServicebyMonsterPlugin.getCurrentUserID()) == null) {
                str = "";
            }
            Room room = this.f89997a.f89985c;
            if (room != null) {
                l = Long.valueOf(room.getOwnerUserId());
            } else {
                l = null;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) str, (Object) String.valueOf(l)));
        }
    }

    /* renamed from: i */
    private final void m77191i() {
        Object obj;
        IFrameSlot.SlotViewModel slotViewModel;
        C1213t<Pair<Boolean, String>> tVar;
        C1213t<Pair<Boolean, String>> tVar2;
        Pair<Boolean, String> value;
        IFrameSlot.SlotViewModel slotViewModel2 = this.f89986d;
        if (slotViewModel2 == null || (tVar2 = slotViewModel2.f15346a) == null || (value = tVar2.getValue()) == null) {
            obj = null;
        } else {
            obj = value.first;
        }
        if (!(!C89219l.m154714a(obj, (Object) true) || (slotViewModel = this.f89986d) == null || (tVar = slotViewModel.f15346a) == null)) {
            tVar.setValue(new Pair<>(false, "business_links"));
        }
        this.f89995n.removeMessages(0);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12070a(Bundle bundle) {
        super.mo12070a(bundle);
        C80298cg.m139204a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.c.b.a$b */
    static final class C38087b implements Handler.Callback {

        /* renamed from: a */
        final /* synthetic */ C38085a f89996a;

        static {
            Covode.recordClassIndex(45554);
        }

        C38087b(C38085a aVar) {
            this.f89996a = aVar;
        }

        public final boolean handleMessage(Message message) {
            Object obj;
            IFrameSlot.SlotViewModel slotViewModel;
            C1213t<Pair<Boolean, String>> tVar;
            C1213t<Pair<Boolean, String>> tVar2;
            Pair<Boolean, String> value;
            C89219l.m154721d(message, "");
            IFrameSlot.SlotViewModel slotViewModel2 = this.f89996a.f89986d;
            if (slotViewModel2 == null || (tVar2 = slotViewModel2.f15346a) == null || (value = tVar2.getValue()) == null) {
                obj = null;
            } else {
                obj = value.first;
            }
            if (!(!C89219l.m154714a(obj, (Object) true) || (slotViewModel = this.f89996a.f89986d) == null || (tVar = slotViewModel.f15346a) == null)) {
                tVar.setValue(new Pair<>(false, "business_links"));
            }
            return true;
        }
    }

    /* renamed from: a */
    private final void m77189a(C38101b bVar) {
        Long l;
        Long l2;
        String str;
        C1213t<Pair<Boolean, String>> tVar;
        Context a;
        Context a2;
        this.f89989h.mo66351a(C38054a.m77134a().f89924c.mo66342a());
        C38082a aVar = this.f89989h;
        Bundle bundle = new Bundle();
        Room room = this.f89985c;
        String str2 = null;
        if (room != null) {
            l = Long.valueOf(room.getId());
        } else {
            l = null;
        }
        bundle.putString("room_id", String.valueOf(l));
        Room room2 = this.f89985c;
        if (room2 != null) {
            l2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            l2 = null;
        }
        bundle.putString("anchor_id", String.valueOf(l2));
        bundle.putString("enter_from_merge", this.f89993l);
        bundle.putString("enter_method", this.f89994m);
        bundle.putString("title", bVar.getTitle());
        bundle.putString("subtitle", bVar.getSubtitle());
        bundle.putString("pic_url", bVar.getPic());
        AbstractC6157ab.AbstractC6158a aVar2 = this.f89987f;
        if (aVar2 == null || (a2 = aVar2.mo12042a()) == null) {
            str = null;
        } else {
            str = a2.getString(R.string.c2);
        }
        bundle.putString("pin_text", str);
        AbstractC6157ab.AbstractC6158a aVar3 = this.f89987f;
        if (!(aVar3 == null || (a = aVar3.mo12042a()) == null)) {
            str2 = a.getString(R.string.bo);
        }
        bundle.putString("more_text", str2);
        bundle.putString("link_id", String.valueOf(bVar.getId()));
        aVar.f89980b = bundle;
        IFrameSlot.SlotViewModel slotViewModel = this.f89986d;
        if (!(slotViewModel == null || (tVar = slotViewModel.f15346a) == null)) {
            tVar.setValue(new Pair<>(true, "business_links"));
        }
        this.f89995n.sendEmptyMessageDelayed(0, 10000);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
        if ((iMessage instanceof C38098a) && !m77190h()) {
            C38098a aVar = (C38098a) iMessage;
            if (aVar.f90011l >= this.f89992k) {
                this.f89992k = aVar.f90011l;
                int i = aVar.f90005f;
                if (i == EnumC38099b.PIN.getValue()) {
                    long j = aVar.f90006g;
                    String str = aVar.f90007h;
                    C89219l.m154716b(str, "");
                    String str2 = aVar.f90008i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = aVar.f90009j;
                    C89219l.m154716b(str3, "");
                    String str4 = aVar.f90010k;
                    C89219l.m154716b(str4, "");
                    C38101b bVar = new C38101b(j, str, str2, str3, str4, aVar.f90012m, aVar.f90013n, true);
                    this.f89990i = bVar;
                    m77189a(bVar);
                } else if (i == EnumC38099b.UNPIN.getValue()) {
                    this.f89990i = null;
                    m77191i();
                }
            }
        }
    }

    @AbstractC90264r
    public final void listenToLinksLiveEvent(C38104e eVar) {
        C38106g gVar;
        AbstractC6157ab.AbstractC6158a aVar;
        Context a;
        Long l;
        String str;
        String str2;
        Long l2;
        String str3;
        String str4;
        C89219l.m154721d(eVar, "");
        C38105f fVar = eVar.f90029b;
        if (fVar != null) {
            String str5 = fVar.f90030a;
            if (C89219l.m154714a((Object) str5, (Object) EnumC38097a.CLOSE.getValue())) {
                m77191i();
            } else if (!(!C89219l.m154714a((Object) str5, (Object) EnumC38097a.LEARN_MORE.getValue()) || this.f89990i == null || (aVar = this.f89987f) == null || (a = aVar.mo12042a()) == null)) {
                C38101b bVar = this.f89990i;
                if (bVar != null) {
                    if (bVar.getCardType() != 2 || bVar.getGameUrl() == null) {
                        double a2 = (double) C34723i.m70924a(a);
                        Double.isNaN(a2);
                        Uri.Builder appendQueryParameter = Uri.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", bVar.getUrl()).appendQueryParameter(StringSet.type, "popup").appendQueryParameter("title", bVar.getTitle()).appendQueryParameter("height", String.valueOf(C34728n.m70948b(a2 * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                        Uri.Builder buildUpon = Uri.parse(C38058b.m77136a()).buildUpon();
                        Room room = this.f89985c;
                        if (room != null) {
                            l2 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l2 = null;
                        }
                        Uri.Builder appendQueryParameter2 = buildUpon.appendQueryParameter("anchor_id", String.valueOf(l2));
                        Room room2 = this.f89985c;
                        if (room2 != null) {
                            str3 = String.valueOf(room2.getId());
                        } else {
                            str3 = null;
                        }
                        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str3);
                        C38101b bVar2 = this.f89990i;
                        if (bVar2 != null) {
                            str4 = String.valueOf(bVar2.getId());
                        } else {
                            str4 = null;
                        }
                        String builder = appendQueryParameter3.appendQueryParameter("link_id", str4).appendQueryParameter("enter_from_merge", this.f89993l).appendQueryParameter("enter_method", this.f89994m).toString();
                        C89219l.m154716b(builder, "");
                        String builder2 = Uri.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", builder).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_bdx", "1").appendQueryParameter("trans_status_bar", "0").appendQueryParameter("hybrid_sdk_version", "bullet").appendQueryParameter("webview_clear_color", "1").toString();
                        C89219l.m154716b(builder2, "");
                        Uri build = appendQueryParameter.appendQueryParameter("report_schema", builder2).appendQueryParameter("gravity", "bottom").build();
                        ILiveOuterService s = LiveOuterService.m107269s();
                        C89219l.m154716b(s, "");
                        s.mo95830d().mo13004a(a, build);
                    } else {
                        String gameUrl = bVar.getGameUrl();
                        if (gameUrl != null) {
                            BulletService.m71938f().mo61852a(a, gameUrl);
                        }
                    }
                }
                if (!m77190h()) {
                    C33744d dVar = new C33744d();
                    Room room3 = this.f89985c;
                    if (room3 != null) {
                        l = Long.valueOf(room3.getOwnerUserId());
                    } else {
                        l = null;
                    }
                    C33744d a3 = dVar.mo59983a("anchor_id", String.valueOf(l));
                    Room room4 = this.f89985c;
                    if (room4 != null) {
                        str = String.valueOf(room4.getId());
                    } else {
                        str = null;
                    }
                    C33744d a4 = a3.mo59983a("room_id", str);
                    C38101b bVar3 = this.f89990i;
                    if (bVar3 != null) {
                        str2 = String.valueOf(bVar3.getId());
                    } else {
                        str2 = null;
                    }
                    C39162r.m79460a("livesdk_links_click", a4.mo59983a("link_id", str2).mo59983a("enter_from_merge", this.f89993l).mo59983a("enter_method", this.f89994m).f79943a);
                }
            }
        }
        if (m77190h() && (gVar = eVar.f90028a) != null) {
            String str6 = gVar.f90032a;
            if (C89219l.m154714a((Object) str6, (Object) EnumC38097a.PIN.getValue())) {
                C38101b bVar4 = new C38101b(gVar.f90035d.f90039d, gVar.f90035d.f90036a, gVar.f90035d.f90037b, gVar.f90035d.f90040e, gVar.f90035d.f90038c, gVar.f90035d.f90041f, gVar.f90035d.f90042g, true);
                this.f89990i = bVar4;
                m77189a(bVar4);
            } else if (C89219l.m154714a((Object) str6, (Object) EnumC38097a.UNPIN.getValue()) || C89219l.m154714a((Object) str6, (Object) EnumC38097a.REMOVE_CARD.getValue())) {
                this.f89990i = null;
                m77191i();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(IFrameSlot.SlotViewModel slotViewModel, AbstractC6157ab.AbstractC6158a aVar) {
        List<C38101b> cardList;
        IFrameSlot.SlotViewModel slotViewModel2 = slotViewModel;
        C89219l.m154721d(slotViewModel2, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel2, aVar);
        this.f89986d = slotViewModel2;
        this.f89987f = aVar;
        if (!m77190h()) {
            C38102c cVar = this.f89988g;
            C38101b bVar = null;
            if (!(cVar == null || (cardList = cVar.getCardList()) == null)) {
                Iterator<T> it = cardList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.isPinned()) {
                        bVar = next;
                        break;
                    }
                }
                bVar = bVar;
            }
            this.f89990i = bVar;
            if (bVar != null) {
                m77189a(bVar);
            } else {
                m77191i();
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
        this.f89985c = (Room) obj;
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f89993l = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        this.f89994m = (String) obj3;
        Room room = this.f89985c;
        if (!(room == null || (bALinkStruct2 = room.getBALinkStruct()) == null || (str = bALinkStruct2.baLinkData) == null)) {
            try {
                cVar = (C38102c) new C27910f().mo46670a(str, C38102c.class);
            } catch (Exception unused) {
            }
        }
        this.f89988g = cVar;
        Room room2 = this.f89985c;
        boolean z = true;
        if (room2 == null || (bALinkStruct = room2.getBALinkStruct()) == null || bALinkStruct.baLinkPermission != 1) {
            z = false;
        }
        bVar.mo12045a(z);
    }
}
