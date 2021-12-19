package com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2577a.p2579b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.google.gson.C27910f;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2577a.p2578a.C38059a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38101b;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.C38102c;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.C38098a;
import com.p2082ss.android.ugc.aweme.commercialize.live.business.links.p2592f.p2593a.EnumC38099b;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2576b.C38058b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.a.b.a */
public final class C38061a extends AbstractC6166b<IIconSlot, IIconSlot.SlotViewModel, IIconSlot.EnumC6149b> {

    /* renamed from: c */
    Room f89931c;

    /* renamed from: d */
    public AbstractC6157ab.AbstractC6158a f89932d;

    /* renamed from: e */
    String f89933e;

    /* renamed from: f */
    String f89934f;

    /* renamed from: g */
    public final List<C38101b> f89935g = new ArrayList();

    /* renamed from: h */
    private IIconSlot.SlotViewModel f89936h;

    /* renamed from: i */
    private C38102c f89937i;

    /* renamed from: j */
    private C38098a f89938j;

    /* renamed from: k */
    private long f89939k;

    static {
        Covode.recordClassIndex(45527);
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: g */
    public final String mo12080g() {
        return "business_links";
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Enum mo12078e() {
        return IIconSlot.EnumC6149b.SLOT_LIVE_WATCHER_TOOLBAR;
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: f */
    public final /* synthetic */ Object mo12079f() {
        return new C38059a(new C38062a(this));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final List<Integer> mo12069a() {
        return C89070n.m154524c(Integer.valueOf(C38098a.f90004a));
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final void mo12072a(IMessage iMessage) {
        IIconSlot.SlotViewModel slotViewModel;
        C1213t<Boolean> tVar;
        C1213t<Boolean> tVar2;
        IIconSlot.SlotViewModel slotViewModel2;
        C1213t<Boolean> tVar3;
        C1213t<Boolean> tVar4;
        if (iMessage instanceof C38098a) {
            C38098a aVar = (C38098a) iMessage;
            this.f89938j = aVar;
            if (aVar != null && aVar.f90011l >= this.f89939k) {
                this.f89939k = aVar.f90011l;
                int i = aVar.f90005f;
                Boolean bool = null;
                if (i == EnumC38099b.ADD.getValue()) {
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
                    this.f89935g.add(0, new C38101b(j, str, str2, str3, str4, aVar.f90012m, aVar.f90013n, false));
                    IIconSlot.SlotViewModel slotViewModel3 = this.f89936h;
                    if (!(slotViewModel3 == null || (tVar4 = slotViewModel3.f15351b) == null)) {
                        bool = tVar4.getValue();
                    }
                    if ((!C89219l.m154714a((Object) bool, (Object) true)) && (slotViewModel2 = this.f89936h) != null && (tVar3 = slotViewModel2.f15351b) != null) {
                        tVar3.setValue(true);
                    }
                } else if (i == EnumC38099b.REMOVE.getValue()) {
                    Iterator<T> it = this.f89935g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (aVar.f90006g == next.getId()) {
                            if (next != null) {
                                this.f89935g.remove(next);
                            }
                        }
                    }
                    IIconSlot.SlotViewModel slotViewModel4 = this.f89936h;
                    if (!(slotViewModel4 == null || (tVar2 = slotViewModel4.f15351b) == null)) {
                        bool = tVar2.getValue();
                    }
                    if (C89219l.m154714a((Object) bool, (Object) true) && (slotViewModel = this.f89936h) != null && (tVar = slotViewModel.f15351b) != null) {
                        tVar.setValue(false);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.lifecycle.ac, com.bytedance.android.live.slot.ab$a] */
    @Override // com.bytedance.android.live.slot.AbstractC6157ab, com.bytedance.android.live.slot.AbstractC6166b
    /* renamed from: a */
    public final /* synthetic */ void mo12071a(IIconSlot.SlotViewModel slotViewModel, AbstractC6157ab.AbstractC6158a aVar) {
        List<C38101b> cardList;
        IIconSlot.SlotViewModel slotViewModel2 = slotViewModel;
        C89219l.m154721d(slotViewModel2, "");
        C89219l.m154721d(aVar, "");
        super.mo12071a(slotViewModel2, aVar);
        this.f89932d = aVar;
        this.f89936h = slotViewModel2;
        C38102c cVar = this.f89937i;
        boolean z = false;
        if (!(cVar == null || (cardList = cVar.getCardList()) == null || cardList.isEmpty())) {
            z = true;
        }
        C1213t<Boolean> tVar = slotViewModel2.f15351b;
        C89219l.m154716b(tVar, "");
        tVar.setValue(Boolean.valueOf(z));
        C1213t<Drawable> tVar2 = slotViewModel2.f15354e;
        C89219l.m154716b(tVar2, "");
        tVar2.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abt));
        C1213t<Drawable> tVar3 = slotViewModel2.f15355f;
        C89219l.m154716b(tVar3, "");
        tVar3.setValue(C0643b.m2369a(aVar.mo12042a(), (int) R.drawable.abu));
        C1213t<String> tVar4 = slotViewModel2.f15358i;
        C89219l.m154716b(tVar4, "");
        tVar4.setValue(aVar.mo12042a().getString(R.string.bp));
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.live.business.links.a.b.a$a */
    static final class C38062a implements AbstractC6162ae {

        /* renamed from: a */
        final /* synthetic */ C38061a f89940a;

        static {
            Covode.recordClassIndex(45528);
        }

        C38062a(C38061a aVar) {
            this.f89940a = aVar;
        }

        @Override // com.bytedance.android.live.slot.AbstractC6162ae
        /* renamed from: a */
        public final void mo12082a(View view, String str) {
            Long l;
            Context a;
            Long l2;
            String str2;
            String valueOf;
            if (this.f89940a.f89935g.size() != 0) {
                C38101b bVar = this.f89940a.f89935g.get(0);
                AbstractC6157ab.AbstractC6158a aVar = this.f89940a.f89932d;
                String str3 = null;
                if (!(aVar == null || (a = aVar.mo12042a()) == null)) {
                    if (bVar.getCardType() != 2 || bVar.getGameUrl() == null) {
                        double a2 = (double) C34723i.m70924a(a);
                        Double.isNaN(a2);
                        Uri.Builder appendQueryParameter = Uri.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", bVar.getUrl()).appendQueryParameter(StringSet.type, "popup").appendQueryParameter("title", bVar.getTitle()).appendQueryParameter("height", String.valueOf(C34728n.m70948b(a2 * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                        C38061a aVar2 = this.f89940a;
                        Uri.Builder buildUpon = Uri.parse(C38058b.m77136a()).buildUpon();
                        Room room = aVar2.f89931c;
                        if (room != null) {
                            l2 = Long.valueOf(room.getOwnerUserId());
                        } else {
                            l2 = null;
                        }
                        Uri.Builder appendQueryParameter2 = buildUpon.appendQueryParameter("anchor_id", String.valueOf(l2));
                        Room room2 = aVar2.f89931c;
                        if (room2 != null) {
                            str2 = String.valueOf(room2.getId());
                        } else {
                            str2 = null;
                        }
                        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str2);
                        if (aVar2.f89935g.size() == 0) {
                            valueOf = "";
                        } else {
                            valueOf = String.valueOf(aVar2.f89935g.get(0).getId());
                        }
                        String builder = appendQueryParameter3.appendQueryParameter("link_id", valueOf).appendQueryParameter("enter_from_merge", aVar2.f89933e).appendQueryParameter("enter_method", aVar2.f89934f).toString();
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
                C38061a aVar3 = this.f89940a;
                C33744d dVar = new C33744d();
                Room room3 = aVar3.f89931c;
                if (room3 != null) {
                    l = Long.valueOf(room3.getOwnerUserId());
                } else {
                    l = null;
                }
                C33744d a3 = dVar.mo59983a("anchor_id", String.valueOf(l));
                Room room4 = aVar3.f89931c;
                if (room4 != null) {
                    str3 = String.valueOf(room4.getId());
                }
                C39162r.m79460a("livesdk_links_click", a3.mo59983a("room_id", str3).mo59983a("link_id", "").mo59983a("enter_from_merge", aVar3.f89933e).mo59983a("enter_method", aVar3.f89934f).f79943a);
            }
        }
    }

    @Override // com.bytedance.android.live.slot.AbstractC6157ab
    /* renamed from: a */
    public final void mo12074a(Map<String, Object> map, AbstractC6157ab.AbstractC6159b bVar) {
        BALinkStruct bALinkStruct;
        List<C38101b> cardList;
        C38101b bVar2;
        BALinkStruct bALinkStruct2;
        String str;
        C89219l.m154721d(map, "");
        C89219l.m154721d(bVar, "");
        Object obj = map.get("param_room");
        C38102c cVar = null;
        if (!(obj instanceof Room)) {
            obj = null;
        }
        this.f89931c = (Room) obj;
        Object obj2 = map.get("param_live_enter_from_merge");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        this.f89933e = (String) obj2;
        Object obj3 = map.get("param_live_enter_method_merge");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        this.f89934f = (String) obj3;
        Room room = this.f89931c;
        if (!(room == null || (bALinkStruct2 = room.getBALinkStruct()) == null || (str = bALinkStruct2.baLinkData) == null)) {
            try {
                cVar = (C38102c) new C27910f().mo46670a(str, C38102c.class);
            } catch (Exception unused) {
            }
        }
        this.f89937i = cVar;
        boolean z = false;
        if (!(cVar == null || (cardList = cVar.getCardList()) == null || (bVar2 = cardList.get(0)) == null)) {
            this.f89935g.add(bVar2);
        }
        Room room2 = this.f89931c;
        if (!(room2 == null || (bALinkStruct = room2.getBALinkStruct()) == null || bALinkStruct.baLinkPermission != 1)) {
            z = true;
        }
        bVar.mo12045a(z);
    }
}
