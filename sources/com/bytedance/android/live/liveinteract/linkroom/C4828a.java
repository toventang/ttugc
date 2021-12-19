package com.bytedance.android.live.liveinteract.linkroom;

import android.view.SurfaceView;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.AbstractC4433d;
import com.bytedance.android.live.liveinteract.api.AbstractC4434e;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.EnumC4408av;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.linkroom.p290b.C4866a;
import com.bytedance.android.live.liveinteract.linkroom.widget.C4911ae;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5146c;
import com.bytedance.android.live.liveinteract.p256a.p257a.C4378b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5737w;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5741z;
import com.bytedance.android.live.liveinteract.platform.common.p377h.C5744c;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.livesdk.chatroom.model.p498d.C7683a;
import com.bytedance.android.livesdk.p458b.p459a.AbstractC6897f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11640d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a */
public class C4828a implements AbstractC4409b {
    private boolean mHasAddInteractObserve;
    private final AbstractC6897f<Integer> mInteractObserver = new C4830b(this);
    public final List<AbstractC11640d> mListeners = new ArrayList();

    static {
        Covode.recordClassIndex(5410);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a$a */
    public static final class C4829a implements AbstractC4433d {
        static {
            Covode.recordClassIndex(5411);
        }

        C4829a() {
        }

        @Override // com.bytedance.android.live.liveinteract.api.AbstractC4433d
        /* renamed from: a */
        public final int mo10207a() {
            return LinkCrossRoomWidget.f12634b;
        }

        @Override // com.bytedance.android.live.liveinteract.api.AbstractC4433d
        /* renamed from: b */
        public final int mo10208b() {
            return LinkCrossRoomWidget.f12635c;
        }

        @Override // com.bytedance.android.live.liveinteract.api.AbstractC4433d
        /* renamed from: c */
        public final int mo10209c() {
            return LinkCrossRoomWidget.f12633a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getHasInvitedUidSet() {
        return C5146c.f13337e;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getLinkStatus4H5() {
        return C4866a.f12723a;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialLocalInviteUIDs() {
        return C4378b.f11894a;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public long getBattleId() {
        return C4947a.f12909a.mo10677b();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public SurfaceView getLinkInAnchorSurface() {
        return C6894d.m14753a().f17271r;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public AbstractC4434e getLinkWidgetFactory() {
        return new C4911ae();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public int getLinkedGuestNum() {
        return C6894d.m14753a().f17273t;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public long getRivalAnchorUidWhenAnchorLinkMic() {
        return C4384b.C4385a.m10496a().f11958f;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isBattleStarter() {
        return C4947a.f12909a.f12914c;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInCoHost() {
        return C4384b.C4385a.m10496a().f11937a;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInRandomLinkMic() {
        return C4502a.m10583a();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public AbstractC4433d linkCrossRoomWidget() {
        return new C4829a();
    }

    private final void addInteractObserve() {
        C4386c.m10499a().mo13182a((AbstractC6897f) this.mInteractObserver);
        this.mHasAddInteractObserve = true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getCurrentInviteeList() {
        return C5737w.m12598a(C4384b.C4385a.m10496a().f11968p);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public int getCurrentLinkMode() {
        return C4384b.C4385a.m10496a().mo10147a();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getUninvitedUidSet() {
        Set<Long> set = C6894d.m14753a().f17272s;
        C89219l.m154716b(set, "");
        return set;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void handleLiveRoomStopped() {
        if (C6894d.m14753a().f17273t > 0) {
            C5741z.m12610d("live_over");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isAudienceApplied() {
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        return a.f17258c;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isBattling() {
        if (EnumC4949c.START == C4947a.f12909a.mo10672a()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInMultiGuest() {
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        return a.f17258c;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void preloadWidgetView() {
        C2690b.m7787a((int) R.layout.bef);
        C2690b.m7787a((int) R.layout.bee);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getCurrentPkState() {
        if (C4947a.f12909a.mo10672a() == EnumC4949c.START) {
            return "in_pk";
        }
        if (C4947a.f12909a.mo10672a() == EnumC4949c.PUNISH) {
            return "pk_punish";
        }
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getInviteeList() {
        if (!isInCoHost()) {
            return "";
        }
        return C5737w.m12598a(C4384b.C4385a.m10496a().f11968p);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isAnchorVideoEnable() {
        Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
        if (a == null) {
            return true;
        }
        if (!(a instanceof C5271a) || !((C5271a) a).f13633d) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInteracting() {
        C4386c a = C4386c.m10499a();
        C89219l.m154716b(a, "");
        T t = a.f17248n;
        C89219l.m154716b(t, "");
        int intValue = t.intValue();
        if (intValue == 2 || intValue == 1) {
            return true;
        }
        return false;
    }

    public boolean isLinkingMic() {
        C6894d a = C6894d.m14753a();
        C89219l.m154716b(a, "");
        if (a.f17258c || C4384b.C4385a.m10496a().f11937a) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isMultiLiveFloatLayout() {
        Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
        if (!(a instanceof C5271a)) {
            return false;
        }
        C5271a aVar = (C5271a) a;
        if (aVar.f13646q == EnumC4422k.FLOATING_FIX || aVar.f13646q == EnumC4422k.FLOATING) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isMultiLiveGridLayout() {
        Object a = C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
        if (!(a instanceof C5271a)) {
            return false;
        }
        C5271a aVar = (C5271a) a;
        if (aVar.f13646q == EnumC4422k.GRID_FIX || aVar.f13646q == EnumC4422k.GRID) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isRoomInBattle() {
        EnumC4949c a = C4947a.f12909a.mo10672a();
        if (a.compareTo((Enum) EnumC4949c.START) < 0 || a.compareTo((Enum) EnumC4949c.END) >= 0) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
        ((AbstractC5880e) C6193a.m13435a(AbstractC5880e.class)).addOnRegistryReadyListener(new C4865b());
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public long getChannelId() {
        Room room;
        if (C4394ah.m10505a(getCurrentLinkMode(), 4)) {
            return C4384b.C4385a.m10496a().f11957e;
        }
        if (!C4394ah.m10505a(getCurrentLinkMode(), 2) || (room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class)) == null) {
            return 0;
        }
        return room.getId();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getRoomScene() {
        C5744c.EnumC5745a aVar;
        if (((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
            aVar = C5744c.EnumC5745a.LINE_UP;
        } else {
            AbstractC2953a a = C6193a.m13435a(AbstractC4409b.class);
            Objects.requireNonNull(a, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.IInteractService");
            AbstractC4409b bVar = (AbstractC4409b) a;
            if (bVar.isBattling()) {
                aVar = C5744c.EnumC5745a.LINK_MIC_PK;
            } else if (bVar.getLinkedGuestNum() > 0) {
                aVar = C5744c.EnumC5745a.LINK_MIC_GUEST;
            } else if (bVar.isInCoHost()) {
                aVar = C5744c.EnumC5745a.LINK_MIC_ANCHOR;
            } else {
                aVar = C5744c.EnumC5745a.NORMAL_VIDEO;
            }
        }
        return aVar.getDesc();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialOnlineUserIds() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = C4378b.f11895b.f11890a.iterator();
        while (it.hasNext()) {
            User user = it.next().f19027a;
            C89219l.m154716b(user, "");
            linkedHashSet.add(Long.valueOf(user.getId()));
        }
        return linkedHashSet;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialInvitingUserId() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<C7683a> list = C4378b.f11895b.f11892c;
        ArrayList<C7683a> arrayList = new ArrayList();
        for (T t : list) {
            if (t.f19030d == 3) {
                arrayList.add(t);
            }
        }
        for (C7683a aVar : arrayList) {
            User user = aVar.f19027a;
            C89219l.m154716b(user, "");
            linkedHashSet.add(Long.valueOf(user.getId()));
        }
        return linkedHashSet;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialOnlineAndWaitingUserId() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = C4378b.f11895b.f11890a.iterator();
        while (it.hasNext()) {
            User user = it.next().f19027a;
            C89219l.m154716b(user, "");
            linkedHashSet.add(Long.valueOf(user.getId()));
        }
        Iterator<T> it2 = C4378b.f11895b.f11891b.iterator();
        while (it2.hasNext()) {
            User user2 = it2.next().f19027a;
            C89219l.m154716b(user2, "");
            linkedHashSet.add(Long.valueOf(user2.getId()));
        }
        return linkedHashSet;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void removeInteractStateChangeListener(AbstractC11640d dVar) {
        List<AbstractC11640d> list = this.mListeners;
        Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        C89206ad.m154680b(list).remove(dVar);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.a$b */
    static final class C4830b<T> implements AbstractC6897f {

        /* renamed from: a */
        final /* synthetic */ C4828a f12679a;

        static {
            Covode.recordClassIndex(5412);
        }

        C4830b(C4828a aVar) {
            this.f12679a = aVar;
        }

        @Override // com.bytedance.android.livesdk.p458b.p459a.AbstractC6897f
        /* renamed from: a */
        public final /* synthetic */ void mo10559a(Object obj) {
            this.f12679a.isInteracting();
            for (AbstractC11640d dVar : this.f12679a.mListeners) {
                dVar.mo12738a();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void registerInteractStateChangeListener(AbstractC11640d dVar) {
        if (!this.mHasAddInteractObserve) {
            addInteractObserve();
        }
        if (dVar != null && !this.mListeners.contains(dVar)) {
            this.mListeners.add(dVar);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public EnumC4408av getUserRole(long j) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return EnumC4408av.NORMAL_AUDIENCE;
        }
        if (j == room.getOwnerUserId()) {
            return EnumC4408av.CURRENT_ANCHOR;
        }
        if (j == C4384b.C4385a.m10496a().f11958f) {
            return EnumC4408av.GUEST_ANCHOR;
        }
        if (C6898g.C6899a.f17285a.f17282a.containsKey(Long.valueOf(j))) {
            return EnumC4408av.GUEST_AUDIENCE;
        }
        return EnumC4408av.NORMAL_AUDIENCE;
    }
}
