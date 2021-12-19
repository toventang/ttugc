package com.bytedance.android.livesdk.feed.p533i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC0945e;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.dislike.C8528b;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p530f.AbstractC8567a;
import com.bytedance.android.livesdk.feed.tab.p541b.C8701g;
import com.bytedance.android.livesdk.feed.viewmodel.TabFeedViewModel;
import com.bytedance.android.livesdk.live.model.LiveFeedDraw;
import com.bytedance.android.livesdk.live.p564a.C9286a;
import com.bytedance.android.livesdk.live.p566c.C9294a;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.FeedRoomLabel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.C11661o;
import com.bytedance.android.livesdkapi.depend.p680d.EnumC11628a;
import com.bytedance.android.livesdkapi.host.AbstractC11815j;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.feed.i.a */
public abstract class AbstractC8597a extends AbstractC10937b<FeedItem> {

    /* renamed from: a */
    private final C88960c<FeedItem> f21245a;

    /* renamed from: b */
    protected final C8527a f21246b;

    /* renamed from: c */
    protected final AbstractC8593h f21247c;

    /* renamed from: d */
    protected final FeedDataKey f21248d;

    /* renamed from: e */
    protected final boolean f21249e;

    /* renamed from: f */
    protected final AbstractC11767g f21250f;

    /* renamed from: g */
    protected C9520ag f21251g;

    /* renamed from: h */
    protected boolean f21252h;

    /* renamed from: i */
    public Room f21253i;

    /* renamed from: j */
    protected int f21254j = -1;

    /* renamed from: k */
    private final C88960c<Boolean> f21255k;

    /* renamed from: l */
    private final C88960c<Object> f21256l;

    /* renamed from: m */
    private final C88960c<Object> f21257m;

    /* renamed from: n */
    private AbstractC8643m f21258n;

    /* renamed from: o */
    private FeedItem f21259o;

    /* renamed from: p */
    private String f21260p = "";

    /* renamed from: q */
    private String f21261q = "";

    static {
        Covode.recordClassIndex(9454);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14848a(FeedItem feedItem, Room room, int i);

    /* renamed from: f */
    private static boolean m16846f() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final void mo14823a() {
        super.mo14823a();
        m16845b(this.f21253i);
        C2695a.f8059g.mo7217a(this.f21259o);
    }

    /* renamed from: d */
    public final void mo14909d() {
        if (this.f21249e) {
            C17309b a = C17309b.m32048a(this.itemView.getContext(), C17309b.f41588b);
            long a2 = a.mo27618a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", 0L);
            if (a2 >= 0) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis > a2 && currentTimeMillis - a2 <= 5500) {
                    a.mo27619a("hotsoon.pref.DISLIKE_TIPS_RECORD_TIME", (Object) -1L).mo27621a();
                    int[] iArr = new int[2];
                    this.itemView.getLocationInWindow(iArr);
                    int[] iArr2 = new int[2];
                    View view = (View) this.itemView.getParent();
                    if (view != null) {
                        view.getLocationInWindow(iArr2);
                        int max = Math.max(0, iArr2[1] - iArr[1]);
                        int height = (this.itemView.getHeight() - max) - Math.max(0, ((iArr[1] + this.itemView.getHeight()) - iArr2[1]) - view.getHeight());
                        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.vh);
                        View inflate = View.inflate(this.itemView.getContext(), R.layout.bch, null);
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(R.id.jx);
                        ((LinearLayout.LayoutParams) lottieAnimationView.getLayoutParams()).topMargin = (int) (((((float) this.itemView.getHeight()) / 2.0f) - (((float) dimensionPixelSize) / 2.0f)) - ((float) max));
                        PopupWindow popupWindow = new PopupWindow(inflate, this.itemView.getWidth(), height, true);
                        inflate.setOnClickListener(new View$OnClickListenerC8604e(popupWindow));
                        popupWindow.showAtLocation(this.itemView, 51, iArr[0], iArr[1] + max);
                        lottieAnimationView.getClass();
                        popupWindow.setOnDismissListener(new C8605f(lottieAnimationView));
                        lottieAnimationView.setAnimation("dislike_live_tips.json");
                        lottieAnimationView.mo5833b(true);
                        lottieAnimationView.mo5826a();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14906a(Room room) {
        this.f21247c.mo14831a(this.f21248d, String.valueOf(room.getId()));
        C11226ao.m19882a(this.itemView.getContext(), (int) R.string.gkm);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14908a(Boolean bool) {
        if (bool.booleanValue() && this.f26279z) {
            m16845b(this.f21253i);
            C2695a.f8059g.mo7217a(this.f21259o);
        }
    }

    /* renamed from: b */
    private void m16845b(Room room) {
        long id;
        String str;
        Intent intent;
        if (room != null) {
            if (room.getOwner() == null) {
                id = 0;
            } else {
                id = room.getOwner().getId();
            }
            HashMap hashMap = new HashMap();
            if (AbstractC8567a.f21172t != null && !TextUtils.isEmpty(AbstractC8567a.f21172t.getEvent())) {
                AbstractC8567a.f21172t.getEvent();
            }
            String str2 = "live_cover";
            String str3 = "live_merge";
            if (C7411d.m15284a() != null) {
                if (C7411d.m15284a().mo13611b() != null) {
                    str3 = C7411d.m15284a().mo13611b();
                }
                if (C7411d.m15284a().mo13612c() != null) {
                    str2 = C7411d.m15284a().mo13612c();
                }
            }
            hashMap.put("enter_from_merge", str3);
            hashMap.put("enter_method", str2);
            hashMap.put("log_pb", room.getLog_pb());
            hashMap.put("anchor_id", String.valueOf(id));
            hashMap.put("request_id", room.getRequestId());
            hashMap.put("room_id", String.valueOf(room.getId()));
            hashMap.put("show_type", "stay");
            hashMap.put("live_type", C11729j.m20684a(room.getStreamType()));
            if (room.isThirdParty) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put("streaming_type", str);
            hashMap.put("event_belong", "live_view");
            hashMap.put("event_page", "live");
            if (getAdapterPosition() != -1) {
                hashMap.put("small_picture_order", String.valueOf(getAdapterPosition() + 1));
            }
            hashMap.put("event_type", "core");
            hashMap.put("event_module", "live");
            hashMap.put("action_type", "click");
            hashMap.put("request_page", C7411d.m15284a().mo13614e());
            if (this.f21252h) {
                hashMap.put("live_window_mode", "small_picture");
            }
            if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
            }
            if (!(room.getOwner() == null || room.getOwner().getFollowInfo() == null)) {
                hashMap.put("follow_status", String.valueOf(room.getOwner().getFollowInfo().getFollowStatus()));
            }
            if (!TextUtils.isEmpty(this.f21259o.liveReason)) {
                hashMap.put("live_reason", this.f21259o.liveReason);
            }
            if ((this.itemView.getContext() instanceof Activity) && (intent = C11279p.m20001a(this.itemView.getContext()).getIntent()) != null) {
                String a = m16844a(intent, "gd_label");
                if (!TextUtils.isEmpty(a)) {
                    hashMap.put("gd_label", a);
                }
            }
            String g = C6544e.m13993g();
            if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            hashMap.put("is_return", "0");
            hashMap.put("room_position", String.valueOf(this.f21254j));
            hashMap.put("is_from_draw_req", "0");
            if (!C13627m.m24498a(this.f21260p)) {
                hashMap.put("top_left_label", this.f21260p);
            }
            if (!C13627m.m24498a(this.f21261q)) {
                hashMap.put("bottom_left_label", this.f21261q);
            }
            hashMap.put("has_banner", String.valueOf(C2695a.f8059g.mo7220c()));
            hashMap.put("explore_level", String.valueOf(C2695a.f8059g.mo7216a().size()));
            C6501b.C6502a.m13948a("live_show").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }

    /* renamed from: a */
    private static String m16844a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo14907a(Room room, PopupWindow popupWindow) {
        String str = this.f21248d.f21207b;
        C8527a aVar = this.f21246b;
        mo17797a(aVar.f21082a.dislikeRoom(room.getId(), room.getOwnerUserId(), room.getRequestId(), str, str, room.getLog_pb()).mo143292d(C8528b.f21083a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C8608i(this, room), new C8609j(this)));
        String str2 = this.f21248d.f21207b;
        if (str2.contains("live") && AbstractC8567a.f21172t != null) {
            this.f21251g = AbstractC8567a.f21172t;
            str2 = AbstractC8567a.f21172t.getEvent();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", "live_merge");
        hashMap.put("enter_method", "live_cover");
        hashMap.put("log_pb", room.getLog_pb());
        hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
        hashMap.put("request_id", room.getRequestId());
        hashMap.put("room_id", String.valueOf(room.getId()));
        hashMap.put("event_belong", "live_interact");
        hashMap.put("event_page", "live");
        hashMap.put("event_type", "core");
        hashMap.put("event_module", str2);
        C6501b.C6502a.m13948a("live_dislike").mo12652a((Map<String, String>) hashMap).mo12655b();
        popupWindow.dismiss();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
    /* renamed from: a */
    public final /* synthetic */ void mo9329a(FeedItem feedItem, int i) {
        FeedItem feedItem2 = feedItem;
        if (feedItem2 == null || !(feedItem2.item instanceof Room)) {
            this.itemView.setOnLongClickListener(null);
            this.f21253i = null;
            return;
        }
        this.f21254j = i;
        this.f21259o = feedItem2;
        this.f21253i = (Room) feedItem2.item;
        if (this.f21249e) {
            this.itemView.setOnLongClickListener(new View$OnLongClickListenerC8601b(this));
        } else {
            this.itemView.setOnLongClickListener(null);
        }
        mo14848a(feedItem2, this.f21253i, i);
        Room room = this.f21253i;
        if (!C13603b.m24435a((Collection) room.getFeedRoomLabelList())) {
            for (FeedRoomLabel feedRoomLabel : room.getFeedRoomLabelList()) {
                if (feedRoomLabel != null) {
                    if (feedRoomLabel.location == 0) {
                        this.f21260p = feedRoomLabel.logExtra;
                    } else if (feedRoomLabel.location == 3) {
                        this.f21261q = feedRoomLabel.logExtra;
                    }
                }
            }
        }
        C88960c<Boolean> cVar = this.f21255k;
        if (cVar != null) {
            mo17797a(cVar.mo143254a(new C8602c(this), C8603d.f21267a));
        }
    }

    /* renamed from: a */
    public boolean mo14844a(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        int i;
        Intent intent;
        String a;
        EnterRoomConfig b;
        if (feedItem == null || !(feedItem.item instanceof Room)) {
            return false;
        }
        Room room = (Room) feedItem.item;
        if (room.getId() == C2695a.f8059g.f8066f) {
            return true;
        }
        if (!room.isPullUrlValid() && C13627m.m24498a(room.getMultiStreamData())) {
            return false;
        }
        room.setLog_pb(feedItem.logPb);
        room.setRequestId(feedItem.resId);
        Context context = this.itemView.getContext();
        if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132253e = m16846f();
        }
        if (!C58029j.f132253e) {
            C11226ao.m19882a(context, (int) R.string.gkv);
            return false;
        }
        if (enterRoomConfig != null && !TextUtils.isEmpty(feedItem.liveReason)) {
            enterRoomConfig.f28232b.f28262f = feedItem.liveReason;
        }
        if (((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController() == null) {
            C6501b.C6502a.m13948a("livesdk_rd_plugin_init_failed").mo12655b();
            C11226ao.m19882a(context, (int) R.string.gkn);
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("base_live_viewholder_click_small_picture", 34304, EnumC11866b.SdkCallback).mo19003a(C3966y.m9657a((int) R.string.gkn)));
        } else {
            if (!((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController().mo12928l() || !TextUtils.equals(((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getLivePlayController().mo12929m(), this.f21253i.buildPullUrl())) {
                C9294a.m17572a().f22727a = new C9286a(EnumC11628a.FEED.typeName);
            } else {
                C9294a.m17572a().f22727a = new C9286a(EnumC11628a.FEED_WITH_PREVIEW.typeName);
            }
            EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
            enterRoomLinkSession.mo18994a(new Event("base_live_view_holder_click_small_picture", 1536, EnumC11866b.SdkInterfaceCall));
            C11870f.C11871a.f28404a.mo19012a(enterRoomLinkSession);
            C11661o.m20565a(this.f21253i, this.f21248d.f21207b, enterRoomConfig);
            if (C6193a.m13435a(AbstractC11815j.class) != null) {
                enterRoomConfig.f28233c.f28287D = String.valueOf(this.f21253i.getOwnerUserId());
                if (this.f21252h) {
                    enterRoomConfig.f28233c.f28298O = true;
                    enterRoomConfig.f28233c.f28299P = C7411d.m15284a().mo13614e();
                    enterRoomConfig.f28233c.f28297N = "live_square";
                    enterRoomConfig.f28233c.f28306W = "small_picture";
                    enterRoomConfig.f28233c.f28341av = "jump_source_square_drawer";
                    enterRoomConfig.f28232b.f28256M = this.f21254j;
                    if (getAdapterPosition() != -1) {
                        enterRoomConfig.f28233c.f28324ae = (long) (getAdapterPosition() + 1);
                    }
                    C7411d a2 = C7411d.m15284a();
                    String str = null;
                    if (a2.f18373a && a2.f18374b != null) {
                        C7411d.C7412a aVar = a2.f18374b;
                        if (aVar.f18380d != null) {
                            str = aVar.f18380d.f22735c;
                        }
                    }
                    if (TextUtils.isEmpty(str)) {
                        List<C9520ag> a3 = C8701g.m16993b().mo14977a();
                        if (!C13617h.m24465a(a3) && a3.get(0) != null) {
                            String url = a3.get(0).getUrl();
                            if (C7411d.m15284a() != null) {
                                if (C13627m.m24499a("referral_task", C7411d.m15284a().mo13611b())) {
                                    url = TabFeedViewModel.m17023a(url, "channel_id", LiveFeedDraw.getChannelId("referral_task", "H5"));
                                }
                                if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance() && !C13627m.m24498a(url)) {
                                    url = url.replaceAll("&" + "channel_id" + "=[^&]*", "");
                                }
                            }
                            enterRoomConfig.f28233c.f28284A = url;
                        }
                    } else {
                        enterRoomConfig.f28233c.f28284A = str;
                    }
                }
                Room room2 = this.f21253i;
                Boolean valueOf = Boolean.valueOf(EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue());
                if ((valueOf == null || valueOf.booleanValue()) && (b = C11760a.m20720b(room2, enterRoomConfig)) != null) {
                    C11760a.m20720b(room2, enterRoomConfig);
                    enterRoomConfig.f28233c.f28286C = b;
                }
                C89219l.m154721d(context, "");
                ActivityC0945e a4 = enterRoomConfig.mo18961a(context);
                if (!(a4 == null || (intent = a4.getIntent()) == null || (a = EnterRoomConfig.m20941a(intent, "gd_label")) == null)) {
                    C89219l.m154716b(a, "");
                    if (a.length() > 0) {
                        enterRoomConfig.f28232b.f28274r = a;
                    }
                }
                enterRoomConfig.f28233c.f28301R = this.f21253i.getId();
                enterRoomConfig.f28233c.f28302S = this.f21253i.getStreamType();
                enterRoomConfig.f28233c.f28331al = ((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom();
                enterRoomConfig.f28233c.f28345az = true;
                if (!C13627m.m24498a(this.f21260p)) {
                    enterRoomConfig.f28232b.f28254K = this.f21260p;
                }
                if (!C13627m.m24498a(this.f21261q)) {
                    enterRoomConfig.f28232b.f28255L = this.f21260p;
                }
                C2695a aVar2 = C2695a.f8059g;
                aVar2.mo7216a().push(Long.valueOf(this.f21253i.getId()));
                if (aVar2.mo7216a().size() > aVar2.f8061a) {
                    i = aVar2.mo7216a().size();
                } else {
                    i = aVar2.f8061a;
                }
                aVar2.f8061a = i;
                ((AbstractC11815j) C6193a.m13435a(AbstractC11815j.class)).mo18880b(context, enterRoomConfig);
            }
            this.f21245a.onNext(feedItem);
        }
        return true;
    }

    public AbstractC8597a(View view, C8527a aVar, AbstractC8593h hVar, FeedDataKey feedDataKey, AbstractC8643m mVar, AbstractC11767g gVar, C88960c<FeedItem> cVar, C88960c<Boolean> cVar2, C88960c<Object> cVar3, C88960c<Object> cVar4) {
        super(view);
        boolean z;
        this.f21246b = aVar;
        this.f21247c = hVar;
        this.f21248d = feedDataKey;
        if (feedDataKey == null || mVar == null || !mVar.mo14950b(feedDataKey.f21208c)) {
            z = false;
        } else {
            z = true;
        }
        this.f21249e = z;
        this.f21250f = gVar;
        this.f21245a = cVar;
        this.f21255k = cVar2;
        this.f21256l = cVar4;
        this.f21257m = cVar3;
        if (feedDataKey.f21207b.equals("live")) {
            this.f21251g = AbstractC8567a.f21172t;
        } else {
            this.f21251g = mVar.mo14949a(feedDataKey.f21208c);
        }
        this.f21258n = mVar;
    }
}
