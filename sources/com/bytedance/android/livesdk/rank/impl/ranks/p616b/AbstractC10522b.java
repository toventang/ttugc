package com.bytedance.android.livesdk.rank.impl.ranks.p616b;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1391ab;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.C4344t;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.model.EnumC9541ay;
import com.bytedance.android.livesdk.model.RoomAuthOffReasons;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.performance.C10085b;
import com.bytedance.android.livesdk.performance.C10088c;
import com.bytedance.android.livesdk.performance.C10095g;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdk.rank.impl.C10383c;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10367d;
import com.bytedance.android.livesdk.rank.impl.api.model.OwnerRank;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.api.model.RankResponse;
import com.bytedance.android.livesdk.rank.impl.api.model.WeeklyRankRegionInfo;
import com.bytedance.android.livesdk.rank.impl.p610c.C10384a;
import com.bytedance.android.livesdk.rank.impl.p611d.C10387b;
import com.bytedance.android.livesdk.rank.impl.p613f.CountDownTimerC10428m;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10489c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b */
public abstract class AbstractC10522b extends C10935a {

    /* renamed from: h */
    public static final C10523a f25319h = new C10523a((byte) 0);

    /* renamed from: a */
    public AbstractC89171a<C89391z> f25320a;

    /* renamed from: b */
    public C10489c.AbstractC10490a f25321b;

    /* renamed from: c */
    public AbstractC10498a f25322c;

    /* renamed from: d */
    public DataChannel f25323d;

    /* renamed from: e */
    public boolean f25324e;

    /* renamed from: f */
    public RankPage f25325f;

    /* renamed from: g */
    public CountDownTimerC10428m f25326g;

    /* renamed from: i */
    private final AbstractC89244h f25327i = C89250i.m154773a((AbstractC89171a) new C10529g(this));

    /* renamed from: j */
    private final AbstractC89244h f25328j = C89250i.m154773a((AbstractC89171a) new C10528f(this));

    /* renamed from: k */
    private HashMap f25329k;

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$b */
    static final class C10524b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10524b f25330a = new C10524b();

        static {
            Covode.recordClassIndex(12099);
        }

        C10524b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$c */
    static final class C10525c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C10525c f25331a = new C10525c();

        static {
            Covode.recordClassIndex(12100);
        }

        C10525c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12097);
    }

    /* renamed from: a */
    public View mo17352a(int i) {
        if (this.f25329k == null) {
            this.f25329k = new HashMap();
        }
        View view = (View) this.f25329k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f25329k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public abstract void mo17353a(Rank rank, List<Rank> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17361a() {
        return ((Boolean) this.f25328j.getValue()).booleanValue();
    }

    /* renamed from: d */
    public abstract AbstractC10498a mo17354d();

    /* renamed from: e */
    public abstract String mo17355e();

    /* renamed from: g */
    public void mo17356g() {
        HashMap hashMap = this.f25329k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo17356g();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$a */
    public static final class C10523a {
        static {
            Covode.recordClassIndex(12098);
        }

        private C10523a() {
        }

        public /* synthetic */ C10523a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final AbstractC89171a<C89391z> mo17362b() {
        AbstractC89171a<C89391z> aVar = this.f25320a;
        if (aVar == null) {
            C89219l.m154710a("mDismissDialog");
        }
        return aVar;
    }

    /* renamed from: c */
    public final C10489c.AbstractC10490a mo17363c() {
        C10489c.AbstractC10490a aVar = this.f25321b;
        if (aVar == null) {
            C89219l.m154710a("mRankFragmentPresenter");
        }
        return aVar;
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$f */
    static final class C10528f extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10522b f25336a;

        static {
            Covode.recordClassIndex(12103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10528f(AbstractC10522b bVar) {
            super(0);
            this.f25336a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle arguments = this.f25336a.getArguments();
            if (arguments != null) {
                z = arguments.getBoolean("is_anchor");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$g */
    static final class C10529g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC10522b f25337a;

        static {
            Covode.recordClassIndex(12104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10529g(AbstractC10522b bVar) {
            super(0);
            this.f25337a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            Bundle arguments = this.f25337a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("page_position");
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC10498a aVar = this.f25322c;
        if (aVar != null && getUserVisibleHint()) {
            m19053b(aVar.f25275b);
        }
        super.onDestroy();
    }

    /* renamed from: h */
    private final void m19054h() {
        EnumC9541ay ayVar;
        String str;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RoomAuthOffReasons roomAuthOffReasons;
        LiveButton liveButton = (LiveButton) mo17352a(R.id.yu);
        if (liveButton != null) {
            IGiftService iGiftService = (IGiftService) C6193a.m13435a(IGiftService.class);
            boolean isEnabled = liveButton.isEnabled();
            DataChannel dataChannel = this.f25323d;
            if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (roomAuthOffReasons = roomAuthStatus.getRoomAuthOffReasons()) == null || (ayVar = roomAuthOffReasons.getUnAvailableClickReason()) == null) {
                ayVar = EnumC9541ay.UNKNOWN;
            }
            if (mo17361a()) {
                str = "anchor";
            } else {
                str = "user";
            }
            iGiftService.monitorGiftIconShow(isEnabled, ayVar, str, mo17355e());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo17364f() {
        OwnerRank ownerRank;
        int i;
        String obj;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RankPage rankPage = this.f25325f;
        if (rankPage != null && (ownerRank = rankPage.getOwnerRank()) != null) {
            LiveTextView liveTextView = (LiveTextView) mo17352a(R.id.de8);
            liveTextView.setText(ownerRank.getRankStr());
            int rank = ownerRank.getRank();
            boolean z = true;
            if (rank == 1) {
                i = R.color.xg;
            } else if (rank == 2) {
                i = R.color.xh;
            } else if (rank != 3) {
                i = R.color.wx;
            } else {
                i = R.color.xi;
            }
            liveTextView.setTextColor(C3966y.m9663b(i));
            LiveTextView liveTextView2 = (LiveTextView) mo17352a(R.id.ewk);
            C89219l.m154716b(liveTextView2, "");
            if (!C89219l.m154714a((Object) mo17355e(), (Object) EnumC10345i.HOURLY_RANK.getRankName()) || ownerRank.getUser().getSecret() == 1) {
                obj = C7557c.m15538a(ownerRank.getGapDescription(), "").toString();
            } else {
                C10384a.m18891a(ownerRank.getRank());
                obj = C10387b.m18895a().mo17277a(ownerRank.getUser().getId(), ownerRank.getGapScore(), ownerRank.getRank(), ownerRank.getGapDescription());
            }
            liveTextView2.setText(obj);
            LiveButton liveButton = (LiveButton) mo17352a(R.id.yu);
            liveButton.setVisibility(0);
            DataChannel dataChannel = this.f25323d;
            if (dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableGift()) {
                z = false;
            }
            liveButton.setEnabled(z);
            liveButton.setOnClickListener(new View$OnClickListenerC10526d(ownerRank, this));
            if (getUserVisibleHint()) {
                m19054h();
            }
            ImageModel avatarThumb = ownerRank.getUser().getAvatarThumb();
            ImageView imageView = (ImageView) mo17352a(R.id.f__);
            C89219l.m154716b(imageView, "");
            int width = imageView.getWidth();
            ImageView imageView2 = (ImageView) mo17352a(R.id.f__);
            C89219l.m154716b(imageView2, "");
            C7577g.m15571a((ImageView) mo17352a(R.id.f__), avatarThumb, width, imageView2.getHeight(), 2131234637);
            C9591j a = C8313a.m16463a(ownerRank.getUser());
            if (a != null) {
                C3941k.m9601a((HSImageView) mo17352a(R.id.bss), a.f23265a);
            }
            LiveTextView liveTextView3 = (LiveTextView) mo17352a(R.id.cpj);
            C89219l.m154716b(liveTextView3, "");
            liveTextView3.setText(ownerRank.getUser().displayId);
        }
    }

    /* renamed from: a */
    public final void mo17359a(C10489c.AbstractC10490a aVar) {
        C89219l.m154721d(aVar, "");
        this.f25321b = aVar;
    }

    /* renamed from: a */
    public final void mo17360a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f25320a = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$d */
    public static final class View$OnClickListenerC10526d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OwnerRank f25332a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10522b f25333b;

        static {
            Covode.recordClassIndex(12101);
        }

        View$OnClickListenerC10526d(OwnerRank ownerRank, AbstractC10522b bVar) {
            this.f25332a = ownerRank;
            this.f25333b = bVar;
        }

        public final void onClick(View view) {
            this.f25333b.mo17362b().invoke();
            DataChannel dataChannel = this.f25333b.f25323d;
            if (dataChannel != null) {
                C8803g gVar = new C8803g();
                gVar.f21679a = this.f25332a.getUser();
                gVar.f21680b = this.f25333b.mo17355e();
                dataChannel.mo28320c(C4344t.class, gVar);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            mo17357a(C6501b.C6502a.m13948a("livesdk_hourly_live_rank_show")).mo12655b();
            C10489c.AbstractC10490a aVar = this.f25321b;
            if (aVar == null) {
                C89219l.m154710a("mRankFragmentPresenter");
            }
            aVar.mo17330d();
            m19054h();
            return;
        }
        AbstractC10498a aVar2 = this.f25322c;
        if (aVar2 != null) {
            m19053b(aVar2.f25275b);
        }
    }

    /* renamed from: a */
    public final C6501b mo17357a(C6501b bVar) {
        String str;
        String str2;
        C89219l.m154721d(bVar, "");
        C6501b a = bVar.mo12639a();
        if (mo17361a()) {
            str = "anchor";
        } else {
            str = "user";
        }
        C6501b a2 = a.mo12651a("user_type", str).mo12651a("rank_type", mo17355e());
        C10489c.AbstractC10490a aVar = this.f25321b;
        if (aVar == null) {
            C89219l.m154710a("mRankFragmentPresenter");
        }
        if (aVar.mo17331e()) {
            str2 = "click";
        } else {
            str2 = "swipe";
        }
        a2.mo12651a("enter_from", str2);
        if (TextUtils.equals(mo17355e(), EnumC10345i.WEEKLY_RANK.getRankName())) {
            C10489c.AbstractC10490a aVar2 = this.f25321b;
            if (aVar2 == null) {
                C89219l.m154710a("mRankFragmentPresenter");
            }
            WeeklyRankRegionInfo g = aVar2.mo17333g();
            if (g != null) {
                String str3 = "user_live_area";
                bVar.mo12651a(str3, g.getViewerRegion());
                bVar.mo12651a("anchor_live_area", g.getRoomRegion());
                if (g.getCurrentType() != EnumC10367d.VIEWER.getValue()) {
                    str3 = "anchor_live_area";
                }
                bVar.mo12651a("rank_area", str3);
            }
        }
        return bVar;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Boolean bool;
        RankPage rankPage;
        RankResponse rankResponse;
        List<RankPage> pages;
        super.onCreate(bundle);
        DataChannel a = C17846f.m33055a(this);
        this.f25323d = a;
        Integer num = null;
        if (a != null) {
            bool = (Boolean) a.mo28318b(C9076co.class);
        } else {
            bool = null;
        }
        this.f25324e = C11279p.m20027d(bool);
        DataChannel dataChannel = this.f25323d;
        if (dataChannel == null || (rankResponse = (RankResponse) dataChannel.mo28318b(C10383c.class)) == null || (pages = rankResponse.getPages()) == null) {
            rankPage = null;
        } else {
            rankPage = pages.get(((Number) this.f25327i.getValue()).intValue());
        }
        this.f25325f = rankPage;
        C10489c.AbstractC10490a aVar = this.f25321b;
        if (aVar == null) {
            C89219l.m154710a("mRankFragmentPresenter");
        }
        Map<Integer, CountDownTimerC10428m> c = aVar.mo17329c();
        RankPage rankPage2 = this.f25325f;
        if (rankPage2 != null) {
            num = Integer.valueOf(rankPage2.getRankType());
        }
        this.f25326g = c.get(num);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$e */
    static final class C10527e extends AbstractC89220m implements AbstractC89172b<Rank, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RankPage f25334a;

        /* renamed from: b */
        final /* synthetic */ AbstractC10522b f25335b;

        static {
            Covode.recordClassIndex(12102);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10527e(RankPage rankPage, AbstractC10522b bVar) {
            super(1);
            this.f25334a = rankPage;
            this.f25335b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Rank rank) {
            Rank rank2 = rank;
            C89219l.m154721d(rank2, "");
            if (rank2.getUser().getId() == this.f25334a.getOwnerRank().getUser().getId() || rank2.getRoomId() <= 0) {
                AbstractC10522b bVar = this.f25335b;
                UserProfileEvent userProfileEvent = new UserProfileEvent(rank2.getUser());
                userProfileEvent.mSource = bVar.mo17355e();
                C6779a.m14563a().mo13053a(userProfileEvent);
            } else if (this.f25335b.mo17361a()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6r);
                this.f25335b.mo17362b().invoke();
            } else {
                if (rank2.getUser().getSecret() == 1) {
                    FollowInfo followInfo = rank2.getUser().getFollowInfo();
                    C89219l.m154716b(followInfo, "");
                    long followStatus = followInfo.getFollowStatus();
                    if (1 > followStatus || 2 < followStatus) {
                        AbstractC10522b bVar2 = this.f25335b;
                        C6501b.C6502a.m13948a("livesdk_follow_private_host_popup").mo12646a("anchor_id", rank2.getUser().getId()).mo12646a("room_id", rank2.getRoomId()).mo12655b();
                        C11279p.m19997a(new DialogC9148b.C9149a(bVar2.getContext()).mo15243a(R.string.ds5).mo15248b(R.string.ds4).mo15244a(R.string.e1l, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC10530h(bVar2, rank2), false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC10531i.f25340a, false).mo15247a());
                    }
                }
                this.f25335b.mo17358a(rank2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m19053b(int i) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        hashMap.put("last_user_rank", String.valueOf(i));
        if (mo17361a()) {
            str = "anchor";
        } else {
            str = "user";
        }
        hashMap.put("user_type", str);
        if (TextUtils.equals(mo17355e(), EnumC10345i.WEEKLY_RANK.getRankName())) {
            C10489c.AbstractC10490a aVar = this.f25321b;
            if (aVar == null) {
                C89219l.m154710a("mRankFragmentPresenter");
            }
            WeeklyRankRegionInfo g = aVar.mo17333g();
            if (g != null) {
                String str3 = "user_live_area";
                hashMap.put(str3, g.getViewerRegion());
                hashMap.put("anchor_live_area", g.getRoomRegion());
                if (g.getCurrentType() != EnumC10367d.VIEWER.getValue()) {
                    str3 = "anchor_live_area";
                }
                hashMap.put("rank_area", str3);
            }
        }
        C6501b a = C6501b.C6502a.m13948a("livesdk_hourly_user_rank_swipe_to_end").mo12643a(this.f25323d);
        if (this.f25324e) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        a.mo12651a("room_orientation", str2).mo12651a("rank_type", mo17355e()).mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* renamed from: a */
    public final void mo17358a(Rank rank) {
        List<Rank> list;
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "live_detail");
        hashMap.put("enter_method", mo17355e());
        hashMap.put("anchor_id", String.valueOf(rank.getUser().getId()));
        hashMap.put("room_id", String.valueOf(rank.getRoomId()));
        hashMap.put("action_type", "click");
        hashMap.put("is_return", "0");
        C10489c.AbstractC10490a aVar = this.f25321b;
        if (aVar == null) {
            C89219l.m154710a("mRankFragmentPresenter");
        }
        WeeklyRankRegionInfo g = aVar.mo17333g();
        String str2 = "user_live_area";
        if (g != null) {
            if (g.getCurrentType() == EnumC10367d.VIEWER.getValue()) {
                str = str2;
            } else {
                str = "anchor_live_area";
            }
            hashMap.put("rank_area", str);
        }
        C6501b a = C6501b.C6502a.m13948a("livesdk_live_show").mo12643a(this.f25323d).mo12652a((Map<String, String>) hashMap);
        C89219l.m154721d(a, "");
        if (TextUtils.equals(mo17355e(), EnumC10345i.WEEKLY_RANK.getRankName())) {
            C10489c.AbstractC10490a aVar2 = this.f25321b;
            if (aVar2 == null) {
                C89219l.m154710a("mRankFragmentPresenter");
            }
            WeeklyRankRegionInfo g2 = aVar2.mo17333g();
            if (g2 != null) {
                if (g2.getCurrentType() != EnumC10367d.VIEWER.getValue()) {
                    str2 = "anchor_live_area";
                }
                a.mo12651a("rank_area", str2);
            }
        }
        a.mo12655b();
        mo17357a(C6501b.C6502a.m13948a("livesdk_live_rank_click").mo12643a(this.f25323d)).mo12645a("rank", rank.getRank()).mo12655b();
        RankPage rankPage = this.f25325f;
        if (rankPage == null || (list = rankPage.getRanks()) == null) {
            list = Collections.emptyList();
            C89219l.m154716b(list, "");
        }
        mo17353a(rank, list);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$i */
    static final class DialogInterface$OnClickListenerC10531i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC10531i f25340a = new DialogInterface$OnClickListenerC10531i();

        static {
            Covode.recordClassIndex(12106);
        }

        DialogInterface$OnClickListenerC10531i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.b.b$h */
    static final class DialogInterface$OnClickListenerC10530h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC10522b f25338a;

        /* renamed from: b */
        final /* synthetic */ Rank f25339b;

        static {
            Covode.recordClassIndex(12105);
        }

        DialogInterface$OnClickListenerC10530h(AbstractC10522b bVar, Rank rank) {
            this.f25338a = bVar;
            this.f25339b = rank;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            AbstractC10522b bVar = this.f25338a;
            Rank rank = this.f25339b;
            C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(rank.getUser().getId())).mo13138b(rank.getRoomId()).mo13141c()).mo143254a(C10524b.f25330a, C10525c.f25331a);
            C6501b.C6502a.m13948a("livesdk_follow").mo12643a(bVar.f25323d).mo12651a("request_page", "live_audience_c_anchor").mo12651a("click_user_position", "private_host_follow").mo12646a("to_user_id", rank.getUser().getId()).mo12655b();
            dialogInterface.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RankPage rankPage = this.f25325f;
        if (rankPage != null) {
            AbstractC10498a d = mo17354d();
            C10527e eVar = new C10527e(rankPage, this);
            C89219l.m154721d(eVar, "");
            d.f25276c = eVar;
            this.f25322c = d;
            RecyclerView recyclerView = (RecyclerView) mo17352a(R.id.dgw);
            recyclerView.setAdapter(this.f25322c);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            RecyclerView.AbstractC1356f itemAnimator = recyclerView.getItemAnimator();
            C10085b bVar = null;
            if (!(itemAnimator instanceof AbstractC1391ab)) {
                itemAnimator = null;
            }
            AbstractC1391ab abVar = (AbstractC1391ab) itemAnimator;
            if (abVar != null) {
                abVar.f4621m = false;
            }
            RecyclerView recyclerView2 = (RecyclerView) mo17352a(R.id.dgw);
            C89219l.m154716b(recyclerView2, "");
            C89219l.m154721d(recyclerView2, "");
            AbstractC89244h<C10085b> hVar = C10095g.f24528b.get("panel_hourly_rank_slide");
            if (hVar != null) {
                bVar = hVar.getValue();
            }
            recyclerView2.mo4405a(new C10088c(bVar));
            mo17364f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C89219l.m154721d(layoutInflater, "");
        if (this.f25324e) {
            i = R.layout.baq;
        } else {
            i = R.layout.bar;
        }
        return C1764a.m5927a(layoutInflater, i, viewGroup, false);
    }
}
