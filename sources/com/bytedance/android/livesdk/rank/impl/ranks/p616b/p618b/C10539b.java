package com.bytedance.android.livesdk.rank.impl.ranks.p616b.p618b;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.event.C8452e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.C10411f;
import com.bytedance.android.livesdk.rank.impl.C10430g;
import com.bytedance.android.livesdk.rank.impl.C10471h;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10366c;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10367d;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
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
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.b */
public final class C10539b extends AbstractC10522b {

    /* renamed from: i */
    public static final C10540a f25349i = new C10540a((byte) 0);

    /* renamed from: j */
    private HashMap f25350j;

    static {
        Covode.recordClassIndex(12114);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: a */
    public final View mo17352a(int i) {
        if (this.f25350j == null) {
            this.f25350j = new HashMap();
        }
        View view = (View) this.f25350j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25350j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: g */
    public final void mo17356g() {
        HashMap hashMap = this.f25350j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo17356g();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.b$a */
    public static final class C10540a {
        static {
            Covode.recordClassIndex(12115);
        }

        private C10540a() {
        }

        public /* synthetic */ C10540a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: e */
    public final String mo17355e() {
        return EnumC10345i.WEEKLY_RANK.getRankName();
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
        return new C10532a(dataChannel, z, rankPage.getRanks(), this.f25326g, this);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.b$c */
    static final /* synthetic */ class C10542c extends C89217j implements AbstractC89172b<RankPage, C89391z> {
        static {
            Covode.recordClassIndex(12117);
        }

        C10542c(C10539b bVar) {
            super(1, bVar, C10539b.class, "updateData", "updateData(Lcom/bytedance/android/livesdk/rank/impl/api/model/RankPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RankPage rankPage) {
            RankPage rankPage2 = rankPage;
            C89219l.m154721d(rankPage2, "");
            ((C10539b) this.receiver).mo17370a(rankPage2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b.b$b */
    static final class View$OnClickListenerC10541b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10539b f25351a;

        static {
            Covode.recordClassIndex(12116);
        }

        View$OnClickListenerC10541b(C10539b bVar) {
            this.f25351a = bVar;
        }

        public final void onClick(View view) {
            if (this.f25351a.mo17363c().mo17332f() == EnumC10367d.ANCHOR.getValue()) {
                DataChannel dataChannel = this.f25351a.f25323d;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C10471h.class, Integer.valueOf(EnumC10367d.VIEWER.getValue()));
                }
            } else {
                DataChannel dataChannel2 = this.f25351a.f25323d;
                if (dataChannel2 != null) {
                    dataChannel2.mo28315b(C10471h.class, Integer.valueOf(EnumC10367d.ANCHOR.getValue()));
                }
            }
            this.f25351a.mo17357a(C6501b.C6502a.m13948a("livesdk_switch_rank_area_click").mo12643a(this.f25351a.f25323d)).mo12655b();
        }
    }

    /* renamed from: a */
    public final void mo17370a(RankPage rankPage) {
        this.f25325f = rankPage;
        CountDownTimerC10428m mVar = new CountDownTimerC10428m(((long) rankPage.getCountdown()) * 1000);
        mVar.start();
        CountDownTimerC10428m mVar2 = this.f25326g;
        if (mVar2 != null) {
            mVar2.cancel();
        }
        this.f25326g = mVar;
        mo17363c().mo17329c().put(Integer.valueOf(rankPage.getRankType()), mVar);
        AbstractC10498a aVar = this.f25322c;
        if (!(aVar instanceof C10532a)) {
            aVar = null;
        }
        C10532a aVar2 = (C10532a) aVar;
        if (aVar2 != null) {
            aVar2.mo17368a(rankPage.getRanks(), mVar);
        }
        mo17364f();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment, com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    public final void onViewCreated(View view, Bundle bundle) {
        WeeklyRankRegionInfo weeklyRankRegionInfo;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo17352a(R.id.c74);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setVisibility(8);
        ((ConstraintLayout) mo17352a(R.id.c74)).setOnClickListener(new View$OnClickListenerC10541b(this));
        DataChannel dataChannel = this.f25323d;
        Object obj = null;
        if (dataChannel != null && (weeklyRankRegionInfo = (WeeklyRankRegionInfo) dataChannel.mo28318b(C10430g.class)) != null && weeklyRankRegionInfo.getRegionStatus() == EnumC10366c.VIEWER1_ANCHOR2.getValue()) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) mo17352a(R.id.c74);
            C89219l.m154716b(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            if (weeklyRankRegionInfo.getCurrentType() == EnumC10367d.VIEWER.getValue()) {
                LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) mo17352a(R.id.c08);
                C89219l.m154716b(liveAutoRtlImageView, "");
                liveAutoRtlImageView.setVisibility(8);
                LiveAutoRtlImageView liveAutoRtlImageView2 = (LiveAutoRtlImageView) mo17352a(R.id.c09);
                C89219l.m154716b(liveAutoRtlImageView2, "");
                liveAutoRtlImageView2.setVisibility(0);
                ((LiveTextView) mo17352a(R.id.f58)).setText(R.string.e5k);
                DataChannel dataChannel2 = this.f25323d;
                if (dataChannel2 != null) {
                    obj = dataChannel2.mo28318b(C10411f.class);
                }
                if (C89219l.m154714a(obj, (Object) false)) {
                    mo17357a(C6501b.C6502a.m13948a("livesdk_switch_rank_area_show").mo12643a(this.f25323d)).mo12655b();
                    return;
                }
                return;
            }
            LiveAutoRtlImageView liveAutoRtlImageView3 = (LiveAutoRtlImageView) mo17352a(R.id.c08);
            C89219l.m154716b(liveAutoRtlImageView3, "");
            liveAutoRtlImageView3.setVisibility(0);
            LiveAutoRtlImageView liveAutoRtlImageView4 = (LiveAutoRtlImageView) mo17352a(R.id.c09);
            C89219l.m154716b(liveAutoRtlImageView4, "");
            liveAutoRtlImageView4.setVisibility(8);
            ((LiveTextView) mo17352a(R.id.f58)).setText(R.string.e5j);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.ranks.p616b.AbstractC10522b
    /* renamed from: a */
    public final void mo17353a(Rank rank, List<Rank> list) {
        String str;
        C89219l.m154721d(rank, "");
        C89219l.m154721d(list, "");
        mo17362b().invoke();
        C11870f fVar = C11870f.C11871a.f28404a;
        C89219l.m154716b(fVar, "");
        fVar.mo19010a().mo18994a(new Event("weekly_rank_jump_other_room", 37888, EnumC11866b.BussinessApiCall));
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28295L = EnumC10345i.WEEKLY_RANK.getRankName();
        enterRoomConfig.f28233c.f28293J = "live_detail";
        enterRoomConfig.f28233c.f28321ab = "click";
        WeeklyRankRegionInfo g = mo17363c().mo17333g();
        if (g != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
            if (g.getCurrentType() == EnumC10367d.VIEWER.getValue()) {
                str = "user_live_area";
            } else {
                str = "anchor_live_area";
            }
            roomsData.f28317aG = str;
        }
        enterRoomConfig.f28232b.f28258b = String.valueOf(rank.getUser().getId());
        if (!list.isEmpty()) {
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.getRoomId() > 0) {
                    arrayList.add(t);
                }
            }
            ArrayList<Rank> arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
            for (Rank rank2 : arrayList2) {
                arrayList3.add(Long.valueOf(rank2.getRoomId()));
            }
            roomsData2.f28291H = C89070n.m154582f((Collection<Long>) arrayList3);
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f28233c;
            C11870f fVar2 = C11870f.C11871a.f28404a;
            C89219l.m154716b(fVar2, "");
            EnterRoomLinkSession a = fVar2.mo19010a();
            C89219l.m154716b(a, "");
            roomsData3.f28284A = C7589k.m15602b(a.f28391b);
        }
        EnterRoomLinkSession.m20943a(enterRoomConfig).mo18994a(new Event("weekly_rank_jump_to_live", 5120, EnumC11866b.BussinessApiCall));
        C6779a.m14563a().mo13053a(new C8452e(rank.getRoomId(), enterRoomConfig));
    }
}
