package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3902ab;
import com.bytedance.android.live.core.p218f.C3910b;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.api.C7289a;
import com.bytedance.android.livesdk.chatroom.end.C7523g;
import com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.live.p564a.C9286a;
import com.bytedance.android.livesdk.live.p566c.C9294a;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableEnterRoomOptFromLiveAudienceEndSetting;
import com.bytedance.android.livesdk.model.RoomStats;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.C6558k;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p450an.C6782a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p561j.C9056bv;
import com.bytedance.android.livesdk.p561j.C9059by;
import com.bytedance.android.livesdk.p561j.C9060bz;
import com.bytedance.android.livesdk.p561j.C9062ca;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.android.livesdk.utils.p654b.C11232c;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88773m;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.b */
public final class C7512b extends C7526h implements C7523g.AbstractC7525a, AbstractC11623a, WeakHandler.IHandler {

    /* renamed from: a */
    public View f18656a;

    /* renamed from: b */
    public List<Room> f18657b;

    /* renamed from: c */
    public DataChannel f18658c;

    /* renamed from: i */
    private AbstractC11623a f18659i;

    /* renamed from: j */
    private Activity f18660j;

    /* renamed from: k */
    private WeakHandler f18661k = new WeakHandler(this);

    /* renamed from: l */
    private VHeadView f18662l;

    /* renamed from: m */
    private TextView f18663m;

    /* renamed from: n */
    private HSImageView f18664n;

    /* renamed from: o */
    private TopFansLayout f18665o;

    /* renamed from: p */
    private View f18666p;

    /* renamed from: q */
    private View f18667q;

    /* renamed from: r */
    private LinearLayout f18668r;

    /* renamed from: s */
    private View f18669s;

    /* renamed from: t */
    private List<LiveRecommendBar> f18670t = new ArrayList();

    /* renamed from: u */
    private C7523g f18671u;

    /* renamed from: v */
    private View.OnClickListener f18672v = new View.OnClickListener() {
        /* class com.bytedance.android.livesdk.chatroom.end.C7512b.View$OnClickListenerC75131 */

        static {
            Covode.recordClassIndex(8285);
        }

        public final void onClick(View view) {
            if (view.getTag() != null && (view.getTag() instanceof Room)) {
                Room room = (Room) view.getTag();
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f28232b.f28263g = room.getLog_pb();
                enterRoomConfig.f28232b.f28257a = room.getRequestId();
                enterRoomConfig.f28233c.f28293J = "live_end";
                enterRoomConfig.f28233c.f28295L = "live_cover";
                enterRoomConfig.f28232b.f28267k = room.getUserFrom();
                enterRoomConfig.f28233c.f28362r = room.getOrientation();
                enterRoomConfig.f28233c.f28301R = room.getId();
                enterRoomConfig.f28233c.f28302S = room.getStreamType();
                if (C7512b.this.f18658c != null && ((Boolean) C7512b.this.f18658c.mo28318b(C9059by.class)).booleanValue()) {
                    enterRoomConfig.f28233c.f28298O = ((Boolean) C7512b.this.f18658c.mo28318b(C9059by.class)).booleanValue();
                    enterRoomConfig.f28233c.f28299P = (String) C7512b.this.f18658c.mo28318b(C9060bz.class);
                    enterRoomConfig.f28233c.f28300Q = (String) C7512b.this.f18658c.mo28318b(C9056bv.class);
                    enterRoomConfig.f28233c.f28306W = "full_screen";
                    enterRoomConfig.f28233c.f28284A = (String) C7512b.this.f18658c.mo28318b(C9062ca.class);
                }
                Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptFromLiveAudienceEndSetting.INSTANCE.getValue());
                if (valueOf != null && valueOf.booleanValue()) {
                    enterRoomConfig = C11760a.m20717a(room, enterRoomConfig);
                }
                ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18879a(C7512b.this.getContext(), enterRoomConfig);
                C9294a.m17572a().f22727a = new C9286a("live_end");
            }
        }
    };

    /* renamed from: w */
    private View.OnClickListener f18673w = new View.OnClickListener() {
        /* class com.bytedance.android.livesdk.chatroom.end.C7512b.View$OnClickListenerC75142 */

        static {
            Covode.recordClassIndex(8286);
        }

        public final void onClick(View view) {
            int id = view.getId();
            if (id == R.id.b6a) {
                C7512b.this.mo13771b();
            } else if (id == R.id.pr || id == R.id.c7v) {
                C7512b.m15496d();
            } else if (id == R.id.ejo) {
                C7512b.this.mo13780c();
            }
        }
    };

    /* renamed from: x */
    private LiveRecommendBar.AbstractC7504b f18674x = new LiveRecommendBar.AbstractC7504b() {
        /* class com.bytedance.android.livesdk.chatroom.end.C7512b.C75153 */

        static {
            Covode.recordClassIndex(8287);
        }

        @Override // com.bytedance.android.livesdk.chatroom.end.LiveRecommendBar.AbstractC7504b
        /* renamed from: a */
        public final void mo13758a() {
            if (C7512b.this.getUserVisibleHint() && C7512b.this.f18657b.size() >= 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(C7512b.this.f18657b.get(0));
                arrayList.add(C7512b.this.f18657b.get(1));
                C7512b.this.f18657b.removeAll(arrayList);
                C7512b.this.mo13770a(arrayList);
            }
        }
    };

    static {
        Covode.recordClassIndex(8284);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a
    /* renamed from: i_ */
    public final boolean mo13772i_() {
        AbstractC11623a aVar = this.f18659i;
        if (aVar == null || !aVar.mo13772i_()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        WeakHandler weakHandler = this.f18661k;
        if (weakHandler != null) {
            weakHandler.removeCallbacks(null);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!C13603b.m24435a((Collection) this.f18670t)) {
            for (LiveRecommendBar liveRecommendBar : this.f18670t) {
                if (liveRecommendBar != null) {
                    liveRecommendBar.mo13751a();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.end.C7526h, androidx.fragment.app.Fragment
    public final void onResume() {
        LiveRecommendBar.AbstractC7504b bVar;
        super.onResume();
        if (!C13603b.m24435a((Collection) this.f18670t)) {
            for (LiveRecommendBar liveRecommendBar : this.f18670t) {
                if (liveRecommendBar != null && getUserVisibleHint()) {
                    if (this.f18670t.indexOf(liveRecommendBar) == 0) {
                        bVar = this.f18674x;
                    } else {
                        bVar = null;
                    }
                    liveRecommendBar.mo13752a(bVar);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo13771b() {
        if (!C11115u.m19743a().mo17915b().mo13165e()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            Context context = getContext();
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C6782a.m14569a();
            a.f17233b = C6782a.m14570b();
            a.f17234c = -1;
            a.f17236e = "live_detail";
            a.f17237f = "follow";
            a.f17235d = "live";
            b.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
        } else if (this.f18697d != null) {
            User owner = this.f18697d.getOwner();
            if (owner != null) {
                this.f18671u.mo13777a(owner.getId(), this.f18697d, this.f18700g, this);
            }
            if (C11199a.m19850a(this.f18658c) && this.f18697d.author() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("refer", "card_follow_button");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("anchor_id", String.valueOf(this.f18697d.author().getId()));
                hashMap2.put("room_id", String.valueOf(this.f18697d.getId()));
                C11199a.m19849a("live_ad", "follow", hashMap, hashMap2);
            }
        }
    }

    /* renamed from: b */
    private static String m15471b(Room room) {
        User owner;
        FollowInfo followInfo;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
            return "0";
        }
        long followStatus = followInfo.getFollowStatus();
        if (followStatus == 1 || followStatus == 2) {
            return "1";
        }
        return "0";
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
    /* renamed from: a */
    public final void mo13760a(C11688a aVar) {
        if (this.f18660j != null) {
            View view = this.f18666p;
            if (view != null && view.getVisibility() == 0) {
                this.f18666p.setVisibility(8);
            }
            C11226ao.m19882a(this.f18660j, (int) R.string.gno);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18658c = C17846f.m33055a(this);
        if (this.f18697d != null) {
            C7307f.f18161a.mo13558a(this.f18661k, false, this.f18697d.getId(), 4, 12);
            this.f18671u = new C7523g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        LiveRecommendBar.AbstractC7504b bVar;
        super.setUserVisibleHint(z);
        if (!C13603b.m24435a((Collection) this.f18670t)) {
            for (LiveRecommendBar liveRecommendBar : this.f18670t) {
                if (liveRecommendBar != null) {
                    if (z) {
                        if (this.f18670t.indexOf(liveRecommendBar) == 0) {
                            bVar = this.f18674x;
                        } else {
                            bVar = null;
                        }
                        liveRecommendBar.mo13752a(bVar);
                    } else {
                        liveRecommendBar.mo13751a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m15469a(RoomStats roomStats) {
        View a = mo13778a(R.id.bp5);
        if (roomStats != null && isViewValid()) {
            C13628n.m24510a(a, 0);
            TextView textView = (TextView) mo13778a(R.id.bp9);
            if (textView != null) {
                try {
                    C13628n.m24515a(textView, C3910b.m9544b(roomStats.getTicket()));
                } catch (Exception e) {
                    C3854a.m9458a("ALogger", e);
                }
                String b = C3910b.m9544b(roomStats.getTicket());
                if (C3910b.m9545c(roomStats.getTicket())) {
                    textView.setText(C3902ab.m9532a(b, b.length() - 1, b.length()));
                } else {
                    textView.setText(b);
                }
            }
        }
    }

    /* renamed from: c */
    private void m15472c(Room room) {
        String str;
        if (room != null) {
            if (this.f18698e) {
                str = "anchor_live_ending";
            } else {
                str = "live_end";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_view");
            hashMap.put("action_type", "click");
            hashMap.put("event_page", str);
            hashMap.put("enter_from", "live_detail");
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("live_type", C11729j.m20684a(room.getStreamType()));
            hashMap.put("enter_from_merge", "live_end");
            hashMap.put("enter_method", "live_cover");
            String g = C6544e.m13993g();
            if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            hashMap.put("is_fans", m15471b(room));
            hashMap.put("is_return", "0");
            if (room.getLinkMicInfo() == null) {
                C6501b.C6502a.m13948a("live_show").mo12652a((Map<String, String>) hashMap).mo12643a(this.f18658c).mo12655b();
            } else {
                AbstractC88979t.m154310b(room.getLinkMicInfo()).mo143292d(C7517c.f18680a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143271a(new C11191f()).mo143254a(new C7518d(this, hashMap), C7519e.f18683a);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
    /* renamed from: a */
    public final void mo13761a(Throwable th) {
        if (this.f18660j != null && th != null) {
            C13628n.m24510a(this.f18666p, 0);
            if (th instanceof C2912a) {
                C11226ao.m19883a(this.f18660j, ((C2912a) th).getPrompt(), 0);
            } else {
                C11226ao.m19882a(this.f18660j, (int) R.string.gnn);
            }
        }
    }

    /* renamed from: a */
    public final void mo13770a(List<Room> list) {
        boolean z;
        if (this.f18668r.getChildCount() >= 2) {
            int i = 0;
            while (i < list.size() && i < 2) {
                Room room = list.get(i);
                if (Room.isValid(room)) {
                    View childAt = this.f18668r.getChildAt(i);
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m15470a(room, childAt, z);
                }
                i++;
            }
            if (this.f18657b.size() <= 4) {
                C7289a.m15196a(this.f18661k, this.f18697d.getId());
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        boolean z;
        Room room;
        MethodCollector.m26663i(3711);
        Activity activity = this.f18660j;
        if (activity == null) {
            MethodCollector.m26664o(3711);
        } else if (activity.isFinishing()) {
            MethodCollector.m26664o(3711);
        } else {
            int i = message.what;
            if (!(message.obj instanceof Exception)) {
                if (12 == i) {
                    if (!(!(message.obj instanceof Room) || (room = (Room) message.obj) == null || room.getStats() == null || this.f18665o == null)) {
                        User owner = this.f18697d.getOwner();
                        if (owner != null && owner.isFollowing()) {
                            this.f18699f = true;
                            C13628n.m24510a(this.f18666p, 8);
                        }
                        if (C13617h.m24465a(room.getTopFanTickets())) {
                            C13628n.m24510a(this.f18665o, 8);
                        } else {
                            this.f18665o.setFollowVisible(false);
                            this.f18665o.setDataChannel(this.f18658c);
                            TopFansLayout topFansLayout = this.f18665o;
                            Activity activity2 = this.f18660j;
                            String str = this.f18700g;
                            if (activity2 != null) {
                                topFansLayout.f18637f = room;
                                topFansLayout.f18632a = room.getTopFanTickets();
                                topFansLayout.f18635d = activity2;
                                topFansLayout.f18636e = this;
                                topFansLayout.f18640i = str;
                                AbstractC88434g gVar = C7528j.f18703a;
                                C88446a.EnumC88458l lVar = C88446a.EnumC88458l.INSTANCE;
                                C88466b.m153697a((Object) gVar, "keySelector is null");
                                C88466b.m153697a((Object) lVar, "collectionSupplier is null");
                                C88925a.m154171a(new C88773m(((C11231b) AbstractC88979t.m154309b((Iterable) topFansLayout.f18632a).mo143274a(new C11232c())).f26877a, gVar, lVar)).mo143303h().mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C7529k(topFansLayout, this), C7530l.f18706a);
                                topFansLayout.f18638g = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0108: IPUT  
                                      (wrap: com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1 : 0x0105: CONSTRUCTOR  (r0v65 com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1) = (r4v1 'topFansLayout' com.bytedance.android.livesdk.chatroom.end.TopFansLayout) call: com.bytedance.android.livesdk.chatroom.end.TopFansLayout.1.<init>(com.bytedance.android.livesdk.chatroom.end.TopFansLayout):void type: CONSTRUCTOR)
                                      (r4v1 'topFansLayout' com.bytedance.android.livesdk.chatroom.end.TopFansLayout)
                                     com.bytedance.android.livesdk.chatroom.end.TopFansLayout.g android.view.View$OnClickListener in method: com.bytedance.android.livesdk.chatroom.end.b.handleMsg(android.os.Message):void, file: classes6.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0105: CONSTRUCTOR  (r0v65 com.bytedance.android.livesdk.chatroom.end.TopFansLayout$1) = (r4v1 'topFansLayout' com.bytedance.android.livesdk.chatroom.end.TopFansLayout) call: com.bytedance.android.livesdk.chatroom.end.TopFansLayout.1.<init>(com.bytedance.android.livesdk.chatroom.end.TopFansLayout):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.end.b.handleMsg(android.os.Message):void, file: classes6.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:428)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 46 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.end.TopFansLayout, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 50 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 524
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.C7512b.handleMsg(android.os.Message):void");
                            }

                            /* renamed from: a */
                            public static void m15468a(long j, int i) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("time", Long.valueOf(j));
                                C3868c.m9491a("ttlive_image_load_recommond_live", i, hashMap);
                            }

                            @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
                            public final void onViewCreated(View view, Bundle bundle) {
                                User user;
                                View view2;
                                super.onViewCreated(view, bundle);
                                this.f18662l = (VHeadView) mo13778a(R.id.ejo);
                                this.f18663m = (TextView) mo13778a(R.id.ejp);
                                this.f18664n = (HSImageView) mo13778a(R.id.cat);
                                this.f18665o = (TopFansLayout) mo13778a(R.id.em8);
                                this.f18666p = mo13778a(R.id.b6a);
                                this.f18667q = mo13778a(R.id.dfr);
                                this.f18669s = mo13778a(R.id.title);
                                View a = mo13778a(R.id.pr);
                                this.f18656a = a;
                                a.setOnClickListener(this.f18673w);
                                this.f18662l.setOnClickListener(this.f18673w);
                                this.f18666p.setOnClickListener(this.f18673w);
                                C13628n.m24510a(mo13778a(R.id.car), 8);
                                if (this.f18697d != null) {
                                    user = this.f18697d.getOwner();
                                    if (user != null) {
                                        C7577g.m15570a(this.f18662l, user.getAvatarThumb(), 2131234441);
                                        this.f18663m.setText(C6581g.m14076b(user));
                                    }
                                } else {
                                    user = null;
                                }
                                if (this.f18697d != null) {
                                    C7289a.m15196a(this.f18661k, this.f18697d.getId());
                                    m15469a(this.f18697d.getStats());
                                }
                                if (user != null) {
                                    if (user.isFollowing()) {
                                        C13628n.m24510a(this.f18666p, 8);
                                    }
                                    if (user.getId() == C11115u.m19743a().mo17915b().mo13161c()) {
                                        C11115u.m19743a().mo17915b().mo13166f();
                                    }
                                }
                                float a2 = ((float) C13628n.m24504a(getContext())) / ((float) C13628n.m24521b(getContext()));
                                if (user != null) {
                                    C3941k.m9604a(this.f18664n, user.getAvatarLarge(), new C11291z(8, a2));
                                }
                                C13628n.m24510a(this.f18665o, 8);
                                if (!(getContext() == null || (view2 = this.f18669s) == null)) {
                                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                    marginLayoutParams.topMargin = (int) C13628n.m24520b(getContext(), 100.0f);
                                    this.f18669s.setLayoutParams(marginLayoutParams);
                                }
                                C6558k.m14024a(this.f18660j);
                                if (this.f18697d != null) {
                                    this.f18697d.getId();
                                }
                                C6501b.C6502a.m13948a("livesdk_finish_show").mo12639a().mo12655b();
                                C4386c.m10499a().mo10159a((Integer) 0);
                            }

                            @Override // androidx.fragment.app.Fragment
                            public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                return C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b88, viewGroup, false);
                            }

                            /* renamed from: a */
                            private void m15470a(Room room, View view, boolean z) {
                                ImageModel avatarMedium;
                                HSImageView hSImageView = (HSImageView) view.findViewById(R.id.afn);
                                TextView textView = (TextView) view.findViewById(R.id.avn);
                                LiveRecommendBar liveRecommendBar = (LiveRecommendBar) view.findViewById(R.id.avm);
                                if (!this.f18670t.contains(liveRecommendBar)) {
                                    this.f18670t.add(liveRecommendBar);
                                }
                                if (room.getOwner() != null && !TextUtils.isEmpty(room.getOwner().getNickName())) {
                                    C13628n.m24515a(textView, room.getOwner().getNickName());
                                }
                                LiveRecommendBar.AbstractC7504b bVar = null;
                                if (z) {
                                    bVar = this.f18674x;
                                }
                                liveRecommendBar.mo13752a(bVar);
                                if (!(room.getOwner() == null || (avatarMedium = room.getOwner().getAvatarMedium()) == null)) {
                                    C3941k.m9602a(hSImageView, avatarMedium, new C3951p.AbstractC3953a() {
                                        /* class com.bytedance.android.livesdk.chatroom.end.C7512b.C75164 */

                                        /* renamed from: a */
                                        long f18678a;

                                        static {
                                            Covode.recordClassIndex(8288);
                                        }

                                        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                                        /* renamed from: a */
                                        public final void mo9301a(ImageModel imageModel) {
                                            this.f18678a = SystemClock.elapsedRealtime();
                                        }

                                        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                                        /* renamed from: a */
                                        public final void mo9303a(ImageModel imageModel, Exception exc) {
                                            C7512b.m15468a(SystemClock.elapsedRealtime() - this.f18678a, 1);
                                        }

                                        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3953a
                                        /* renamed from: a */
                                        public final void mo9302a(ImageModel imageModel, int i, int i2) {
                                            C7512b.m15468a(SystemClock.elapsedRealtime() - this.f18678a, 0);
                                        }
                                    });
                                }
                                view.setTag(room);
                                m15472c(room);
                            }

                            /* renamed from: a */
                            public final void mo13769a(Activity activity, Room room, AbstractC11623a aVar, String str, String str2) {
                                this.f18660j = activity;
                                this.f18697d = room;
                                this.f18659i = aVar;
                                this.f18700g = str;
                                this.f18701h = str2;
                                this.f18698e = false;
                            }
                        }
