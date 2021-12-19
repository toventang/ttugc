package com.bytedance.android.livesdk.rank.impl.ranks.p616b.p617a;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10498a;
import com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.b */
public final class C10520b extends AbstractC10522b {

    /* renamed from: i */
    public static final C10521a f25317i = new C10521a((byte) 0);

    /* renamed from: j */
    private HashMap f25318j;

    static {
        Covode.recordClassIndex(12095);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: a */
    public final View mo17352a(int i) {
        if (this.f25318j == null) {
            this.f25318j = new HashMap();
        }
        View view = (View) this.f25318j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25318j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: g */
    public final void mo17356g() {
        HashMap hashMap = this.f25318j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo17356g();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.a.b$a */
    public static final class C10521a {
        static {
            Covode.recordClassIndex(12096);
        }

        private C10521a() {
        }

        public /* synthetic */ C10521a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: e */
    public final String mo17355e() {
        return EnumC10345i.HOURLY_RANK.getRankName();
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: d */
    public final AbstractC10498a mo17354d() {
        DataChannel dataChannel = this.f25323d;
        boolean z = this.f25324e;
        RankPage rankPage = this.f25325f;
        if (rankPage == null) {
            C89219l.m154715b();
        }
        List<Rank> ranks = rankPage.getRanks();
        CountDownTimerC10428m mVar = this.f25326g;
        RankPage rankPage2 = this.f25325f;
        if (rankPage2 == null) {
            C89219l.m154715b();
        }
        List<RankPage> subPages = rankPage2.getSubPages();
        List<Rank> list = null;
        if (subPages != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : subPages) {
                if (t.getRankType() == EnumC10345i.HOURLY_STAR_HOST_RANK.getType()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                AbstractC89255c.C89256a aVar = AbstractC89255c.Default;
                C89219l.m154721d(arrayList2, "");
                C89219l.m154721d(aVar, "");
                if (!arrayList2.isEmpty()) {
                    list = ((RankPage) C89070n.m154560b((Iterable) arrayList2, aVar.nextInt(arrayList2.size()))).getRanks();
                } else {
                    throw new NoSuchElementException("Collection is empty.");
                }
            }
        }
        return new C10507a(dataChannel, z, ranks, mVar, list);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: a */
    public final void mo17353a(Rank rank, List<Rank> list) {
        C89219l.m154721d(rank, "");
        C89219l.m154721d(list, "");
        mo17362b().invoke();
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        fVar.mo19010a().mo18994a(new Event("hourly_rank_jump_other_room", 36608, EnumC11866b.BussinessApiCall));
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (rank.getRoomId() == it.next().getRoomId()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        boolean z2 = !z;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28295L = EnumC10345i.HOURLY_RANK.getRankName();
        enterRoomConfig.f28233c.f28293J = "live_detail";
        enterRoomConfig.f28233c.f28321ab = "click";
        enterRoomConfig.f28233c.f28294K = z2;
        enterRoomConfig.f28232b.f28258b = String.valueOf(rank.getUser().getId());
        if (z2) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(rank.getRoomId()));
            roomsData.f28291H = C89070n.m154582f((Collection<Long>) arrayList);
        } else if (!list.isEmpty()) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().getRoomId()));
            }
            roomsData2.f28291H = C89070n.m154582f((Collection<Long>) arrayList2);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f28233c;
            C11870f fVar2 = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar2, "");
            EnterRoomLinkSession a = fVar2.mo19010a();
            C89219l.m154716b(a, "");
            roomsData3.f28284A = C7589k.m15602b(a.f28391b);
        }
        EnterRoomLinkSession.m20943a(enterRoomConfig).mo18994a(new Event("hourly_rank_jump_to_live", 3840, EnumC11866b.BussinessApiCall));
        C6779a.m14563a().mo13053a(new C8452e(rank.getRoomId(), enterRoomConfig));
    }
}
