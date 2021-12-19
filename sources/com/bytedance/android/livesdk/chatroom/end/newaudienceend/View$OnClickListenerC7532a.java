package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.widget.C4128c;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.api.C7292b;
import com.bytedance.android.livesdk.chatroom.api.C7293c;
import com.bytedance.android.livesdk.chatroom.api.EndPageRecommendRetrofitApi;
import com.bytedance.android.livesdk.chatroom.end.C7523g;
import com.bytedance.android.livesdk.chatroom.end.C7526h;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewRecommendView;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFinishPagePushTipsDaysSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFinishPagePushTipsEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFinishPagePushTipsMaxSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNewAudienceFinishPageSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11210ad;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.C17846f;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a */
public final class View$OnClickListenerC7532a extends C7526h implements View.OnClickListener, LiveNewRecommendView.AbstractC7531a, C7545l.AbstractC7549a, AbstractC11623a {

    /* renamed from: A */
    private View f18713A;

    /* renamed from: B */
    private LiveTextView f18714B;

    /* renamed from: C */
    private View f18715C;

    /* renamed from: D */
    private ImageView f18716D;

    /* renamed from: E */
    private boolean f18717E;

    /* renamed from: F */
    private final int f18718F = 1;

    /* renamed from: G */
    private final int f18719G = 2;

    /* renamed from: H */
    private final int f18720H = 3;

    /* renamed from: I */
    private Runnable f18721I = new RunnableC7536c(this);

    /* renamed from: a */
    DataChannel f18722a;

    /* renamed from: b */
    Handler f18723b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    Room f18724c;

    /* renamed from: i */
    public Room f18725i;

    /* renamed from: j */
    public AbstractC11623a f18726j;

    /* renamed from: k */
    public long f18727k = 0;

    /* renamed from: l */
    LiveTextView f18728l;

    /* renamed from: m */
    int f18729m = 0;

    /* renamed from: n */
    public volatile boolean f18730n;

    /* renamed from: o */
    Runnable f18731o = new RunnableC7535b(this);

    /* renamed from: p */
    private C7545l f18732p;

    /* renamed from: q */
    private LiveTextView f18733q;

    /* renamed from: r */
    private ImageView f18734r;

    /* renamed from: s */
    private HSImageView f18735s;

    /* renamed from: t */
    private LiveNewRecommendView f18736t;

    /* renamed from: u */
    private LiveTextView f18737u;

    /* renamed from: v */
    private ImageView f18738v;

    /* renamed from: w */
    private View f18739w;

    /* renamed from: x */
    private LottieAnimationView f18740x;

    /* renamed from: y */
    private HSAnimImageView f18741y;

    /* renamed from: z */
    private View f18742z;

    static {
        Covode.recordClassIndex(8305);
    }

    /* renamed from: k */
    private static boolean m15506k() {
        return ((IHostApp) C6193a.m13435a(IHostApp.class)).getPushLiveState();
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewRecommendView.AbstractC7531a
    /* renamed from: e */
    public final void mo13785e() {
        Handler handler = this.f18723b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p677a.AbstractC11623a
    /* renamed from: i_ */
    public final boolean mo13772i_() {
        AbstractC11623a aVar = this.f18726j;
        if (aVar == null || !aVar.mo13772i_()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private boolean m15505j() {
        return ((IHostApp) C6193a.m13435a(IHostApp.class)).isNotificationEnabled(getContext());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo13791f() {
        this.f18728l.setText(C3966y.m9657a((int) R.string.e06));
        this.f18723b.removeCallbacksAndMessages(null);
        mo13779a(this.f18725i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo13793h() {
        C6501b.C6502a.m13948a("livesdk_exit_liveroom_click").mo12643a(this.f18722a).mo12655b();
        m15496d();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f18723b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        C7545l lVar = this.f18732p;
        if (lVar.f18756a != null) {
            lVar.f18756a.removeCallbacks(RunnableC7551m.f18764a);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Handler handler = this.f18723b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f18728l.setText(C3966y.m9657a((int) R.string.e06));
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, com.bytedance.android.livesdk.chatroom.end.C7526h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f18730n) {
            Handler handler = this.f18723b;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        this.f18732p.mo13804a(this.f18727k);
        m15504i();
    }

    /* renamed from: i */
    private void m15504i() {
        C7545l lVar = this.f18732p;
        if (lVar != null) {
            long j = this.f18727k;
            if (lVar.f18756a != null) {
                WeakHandler weakHandler = lVar.f18756a;
                ((EndPageRecommendRetrofitApi) C5805e.m12718a().mo11572a(EndPageRecommendRetrofitApi.class)).getLive(j).mo143271a(new C11191f()).mo143254a(new C7292b(weakHandler), new C7293c(weakHandler));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l.AbstractC7549a
    /* renamed from: b */
    public final void mo13787b() {
        LottieAnimationView lottieAnimationView;
        if (this.f18738v != null && (lottieAnimationView = this.f18740x) != null && this.f18741y != null) {
            lottieAnimationView.setVisibility(8);
            this.f18741y.setVisibility(8);
            this.f18738v.setVisibility(0);
            this.f18738v.setBackgroundResource(2131234675);
            m15503a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo13792g() {
        if (this.f18725i != null) {
            this.f18738v.setVisibility(8);
            this.f18741y.setVisibility(0);
            AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
            if (aVar == null || !aVar.isMicRoomForRoom(this.f18725i) || !aVar.isMicAudience()) {
                C7545l lVar = this.f18732p;
                Room room = this.f18725i;
                String str = this.f18700g;
                if (room != null) {
                    lVar.f18759d.mo13777a(room.getOwner().getId(), room, str, new C7523g.AbstractC7525a() {
                        /* class com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l.C75483 */

                        static {
                            Covode.recordClassIndex(8321);
                        }

                        @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
                        /* renamed from: a */
                        public final void mo13760a(C11688a aVar) {
                            if (!aVar.mo18452b()) {
                                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gnn);
                                if (C7545l.this.f18757b != null) {
                                    C7545l.this.f18757b.mo13787b();
                                }
                            }
                        }

                        @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
                        /* renamed from: a */
                        public final void mo13761a(Throwable th) {
                            if (C7545l.this.f18757b != null) {
                                C7545l.this.f18757b.mo13787b();
                            }
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gnn);
                        }
                    });
                }
            } else {
                C7545l lVar2 = this.f18732p;
                Room room2 = this.f18725i;
                String str2 = this.f18700g;
                if (!(room2 == null || room2.officialChannelInfo == null || room2.officialChannelInfo.f23136a == null)) {
                    lVar2.f18759d.mo13777a(room2.officialChannelInfo.f23136a.getId(), room2, str2, new C7523g.AbstractC7525a() {
                        /* class com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l.C75461 */

                        static {
                            Covode.recordClassIndex(8319);
                        }

                        @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
                        /* renamed from: a */
                        public final void mo13760a(C11688a aVar) {
                            if (!aVar.mo18452b()) {
                                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gnn);
                                if (C7545l.this.f18757b != null) {
                                    C7545l.this.f18757b.mo13787b();
                                }
                            }
                        }

                        @Override // com.bytedance.android.livesdk.chatroom.end.C7523g.AbstractC7525a
                        /* renamed from: a */
                        public final void mo13761a(Throwable th) {
                            if (C7545l.this.f18757b != null) {
                                C7545l.this.f18757b.mo13787b();
                            }
                            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gnn);
                        }
                    });
                }
            }
            this.f18741y.mo9390a();
        }
        this.f18717E = true;
        m15503a(false);
    }

    /* renamed from: b */
    public final void mo13788b(int i) {
        int i2 = 2131234515;
        if (i == 1) {
            i2 = 2131234516;
        } else if (i != 2 && i == 3) {
            i2 = 2131234517;
        }
        ImageView imageView = this.f18716D;
        if (imageView != null) {
            imageView.setBackgroundResource(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18722a = C17846f.m33055a(this);
        C7545l lVar = new C7545l(this);
        this.f18732p = lVar;
        lVar.f18758c = this.f18726j;
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z) {
            Handler handler = this.f18723b;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            LiveTextView liveTextView = this.f18728l;
            if (liveTextView != null) {
                liveTextView.setText(C3966y.m9657a((int) R.string.e06));
            }
        } else if (!this.f18730n) {
            C7545l lVar = this.f18732p;
            if (lVar != null) {
                lVar.mo13804a(this.f18727k);
            }
            m15504i();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l.AbstractC7549a
    /* renamed from: c */
    public final void mo13790c(Room room) {
        if (room != null && this.f18738v != null && this.f18740x != null && this.f18741y != null) {
            if (room.getOwner() == null || room.getOwner().getFollowInfo().getFollowStatus() == 1 || room.getOwner().getFollowInfo().getFollowStatus() == 2) {
                this.f18738v.setVisibility(8);
            } else {
                this.f18738v.setVisibility(0);
            }
            this.f18740x.setVisibility(8);
            this.f18741y.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m15503a(boolean z) {
        int intValue;
        String str;
        this.f18713A.setVisibility(8);
        this.f18715C.setVisibility(8);
        if (LiveFinishPagePushTipsEnableSetting.INSTANCE.getValue()) {
            if (z) {
                this.f18715C.setVisibility(0);
                if (!m15505j() || !m15506k()) {
                    this.f18716D.setBackgroundResource(2131234517);
                }
            }
            if (!this.f18717E) {
                if (System.currentTimeMillis() - AbstractC6804a.f17005cA.mo13066a().longValue() < ((long) (LiveFinishPagePushTipsDaysSetting.INSTANCE.getValue() * 24 * 60 * 60 * 1000)) || (intValue = AbstractC6804a.f17006cB.mo13066a().intValue()) > LiveFinishPagePushTipsMaxSetting.INSTANCE.getValue()) {
                    return;
                }
                if (!m15505j() || !m15506k()) {
                    this.f18713A.setVisibility(0);
                    C6806c.m14603a(AbstractC6804a.f17005cA, Long.valueOf(System.currentTimeMillis()));
                    C6806c.m14603a(AbstractC6804a.f17006cB, Integer.valueOf(intValue + 1));
                    Room room = this.f18725i;
                    String str2 = "-1";
                    if (room == null || room.getOwner() == null) {
                        str = str2;
                    } else {
                        str = String.valueOf(this.f18725i.getOwner().getId());
                    }
                    Room room2 = this.f18725i;
                    if (room2 != null) {
                        str2 = String.valueOf(room2.getId());
                    }
                    C6501b.C6502a.m13948a("livesdk_notification_setting_alert_show").mo12651a("enter_from_merge", "live_end").mo12651a("room_id", str2).mo12651a("anchor_id", str).mo12655b();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l.AbstractC7549a
    /* renamed from: a */
    public final void mo13786a(List<Room> list) {
        boolean z;
        Room room;
        if (this.f18733q != null && this.f18736t != null && this.f18739w != null) {
            if (C13628n.m24522c(getContext(), ((float) C13628n.m24521b(getContext())) - this.f18733q.getY()) < 549) {
                z = true;
            } else {
                z = false;
            }
            if (C13628n.m24522c(getContext(), ((float) C13628n.m24521b(getContext())) - this.f18733q.getY()) >= 349) {
                LiveNewRecommendView liveNewRecommendView = this.f18736t;
                if (list != null) {
                    if (!(list.size() == 0 || liveNewRecommendView.f18709c == null || liveNewRecommendView.f18709c.size() != 4)) {
                        if (list.size() <= 3 && list.size() >= 2) {
                            liveNewRecommendView.mo13782a(list, 2);
                        } else if (list.size() > 3) {
                            if (z) {
                                liveNewRecommendView.mo13782a(list, 2);
                            } else {
                                liveNewRecommendView.mo13782a(list, 4);
                                liveNewRecommendView.f18711e.setVisibility(0);
                            }
                        }
                    }
                    if (list.size() > 1 && this.f18723b != null) {
                        this.f18739w.setVisibility(0);
                        if (LiveNewAudienceFinishPageSetting.INSTANCE.getValue().enableCountDown == 1) {
                            int i = LiveNewAudienceFinishPageSetting.INSTANCE.getValue().timeJumpRoom;
                            this.f18729m = i;
                            this.f18729m = i + 1;
                            this.f18724c = list.get(0);
                            if ((!LiveFinishPagePushTipsEnableSetting.INSTANCE.getValue() || this.f18701h == null || !this.f18701h.toLowerCase(Locale.US).contains("push") || (room = this.f18725i) == null || room.getOwner() == null || !this.f18725i.getOwner().isFollowing()) && !this.f18730n) {
                                this.f18723b.removeCallbacksAndMessages(null);
                                this.f18723b.postDelayed(this.f18721I, (long) (LiveNewAudienceFinishPageSetting.INSTANCE.getValue().timeCountDown * 1000));
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r4 = r0.getOwner();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.View$OnClickListenerC7532a.onClick(android.view.View):void");
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.C7545l.AbstractC7549a
    /* renamed from: b */
    public final void mo13789b(Room room) {
        int i;
        View view;
        boolean z;
        User user;
        String str;
        String str2;
        String string;
        ImageModel imageModel;
        if (isAdded()) {
            this.f18725i = room;
            if (room == null || room.getStats() == null) {
                i = 0;
            } else {
                i = room.getStats().replayViewers;
            }
            String str3 = C11210ad.m19867a((long) i) + " " + C3966y.m9657a((int) R.string.gkr);
            LiveTextView liveTextView = this.f18737u;
            if (liveTextView != null) {
                liveTextView.setText(str3);
            }
            if (this.f18734r != null && this.f18735s != null && (view = this.f18742z) != null) {
                view.setVisibility(8);
                AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
                if (aVar == null || !aVar.isMicRoomForRoom(this.f18725i) || !aVar.isMicAudienceForRoom(this.f18725i)) {
                    z = false;
                } else {
                    z = true;
                }
                Room room2 = this.f18725i;
                ImageModel imageModel2 = null;
                if (room2 != null) {
                    user = room2.getOwner();
                    if (!(user == null || this.f18723b == null || this.f18728l == null)) {
                        if (z) {
                            Room room3 = this.f18725i;
                            if (room3 == null || room3.officialChannelInfo == null || this.f18725i.officialChannelInfo.f23136a == null) {
                                imageModel = null;
                            } else {
                                imageModel = this.f18725i.officialChannelInfo.f23136a.getAvatarMedium();
                            }
                            C7577g.m15570a(this.f18734r, imageModel, 2131234637);
                        } else {
                            C7577g.m15570a(this.f18734r, user.getAvatarMedium(), 2131234637);
                        }
                        this.f18734r.setOnClickListener(new View$OnClickListenerC7539f(this));
                        if (this.f18733q != null) {
                            Room room4 = this.f18725i;
                            if (room4 == null || room4.officialChannelInfo == null || this.f18725i.officialChannelInfo.f23136a == null) {
                                str2 = "";
                            } else {
                                str2 = this.f18725i.officialChannelInfo.f23136a.displayId;
                            }
                            if (z) {
                                this.f18733q.setText(str2);
                                string = getString(R.string.e1j, str2);
                            } else {
                                this.f18733q.setText(user.displayId);
                                string = getString(R.string.e1j, user.displayId);
                            }
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int length = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) (" " + getString(R.string.e1k)));
                            C4128c.m10031a(getContext(), spannableStringBuilder, 0, length, 3, 400);
                            int i2 = length + 1;
                            C4128c.m10031a(getContext(), spannableStringBuilder, i2, spannableStringBuilder.length(), 3, 600);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(C4079b.m9889a(this.f18714B, (int) R.attr.am3)), i2, spannableStringBuilder.length(), 33);
                            this.f18714B.setText(spannableStringBuilder);
                        }
                    }
                } else {
                    user = null;
                }
                float a = ((float) C13628n.m24504a(getContext())) / ((float) C13628n.m24521b(getContext()));
                if (user != null) {
                    if (z) {
                        Room room5 = this.f18725i;
                        if (!(room5 == null || room5.officialChannelInfo == null || this.f18725i.officialChannelInfo.f23136a == null)) {
                            imageModel2 = this.f18725i.officialChannelInfo.f23136a.getAvatarLarge();
                        }
                        C3941k.m9604a(this.f18735s, imageModel2, new C11291z(8, a));
                    } else {
                        C3941k.m9604a(this.f18735s, user.getAvatarLarge(), new C11291z(8, a));
                    }
                }
                Room room6 = this.f18725i;
                if (!(room6 == null || this.f18738v == null || this.f18740x == null || this.f18741y == null || room6.getOwner().getFollowInfo().getFollowStatus() == 1 || this.f18725i.getOwner().getFollowInfo().getFollowStatus() == 2)) {
                    this.f18738v.setVisibility(0);
                    this.f18740x.setVisibility(8);
                    this.f18741y.setVisibility(8);
                }
                if (LiveFinishPagePushTipsEnableSetting.INSTANCE.getValue()) {
                    if (!(user == null || user.getFollowInfo() == null)) {
                        if (user.getFollowInfo().getFollowStatus() == 1 || user.getFollowInfo().getFollowStatus() == 2) {
                            m15503a(true);
                        } else {
                            m15503a(false);
                        }
                    }
                    if (this.f18732p != null && user != null) {
                        HashMap<String, String> hashMap = new HashMap<>();
                        hashMap.put("target_uid", String.valueOf(user.getId()));
                        hashMap.put("sec_target_uid", C11115u.m19743a().mo17915b().mo13153a(user.getId()));
                        hashMap.put("packed_level", "2");
                        hashMap.put("current_room_id", String.valueOf(this.f18725i.getId()));
                        hashMap.put("request_from", "live_push_settings");
                        if (this.f18725i.getOwner() != null) {
                            str = String.valueOf(this.f18725i.getOwner().getId());
                        } else {
                            str = "0";
                        }
                        hashMap.put("anchor_id", str);
                        hashMap.put("sec_anchor_id", C11115u.m19743a().mo17915b().mo13153a(this.f18725i.getOwnerUserId()));
                        C11115u.m19743a().mo17915b().mo13148a(hashMap).mo116431a_(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0278: INVOKE  
                              (wrap: f.a.ab<com.bytedance.android.live.base.model.user.User> : 0x026f: INVOKE  (r1v15 f.a.ab<com.bytedance.android.live.base.model.user.User>) = 
                              (wrap: com.bytedance.android.livesdk.as.f : 0x026b: INVOKE  (r0v39 com.bytedance.android.livesdk.as.f) = 
                              (wrap: com.bytedance.android.livesdk.userservice.u : 0x0267: INVOKE  (r0v38 com.bytedance.android.livesdk.userservice.u) =  type: STATIC call: com.bytedance.android.livesdk.userservice.u.a():com.bytedance.android.livesdk.userservice.u)
                             type: VIRTUAL call: com.bytedance.android.livesdk.userservice.u.b():com.bytedance.android.livesdk.as.f)
                              (r4v1 'hashMap' java.util.HashMap<java.lang.String, java.lang.String>)
                             type: INTERFACE call: com.bytedance.android.livesdk.as.f.a(java.util.HashMap):f.a.ab)
                              (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$2 : 0x0275: CONSTRUCTOR  (r0v40 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$2) = 
                              (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l : 0x0260: IGET  (r3v1 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.p com.bytedance.android.livesdk.chatroom.end.newaudienceend.l)
                              (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1 : 0x0264: CONSTRUCTOR  (r2v6 com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.1.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.a):void type: CONSTRUCTOR)
                             call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.2.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$b):void type: CONSTRUCTOR)
                             type: VIRTUAL call: f.a.ab.a_(f.a.ae):void in method: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.b(com.bytedance.android.livesdkapi.depend.model.live.Room):void, file: classes6.dex
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
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0275: CONSTRUCTOR  (r0v40 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$2) = 
                              (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l : 0x0260: IGET  (r3v1 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.p com.bytedance.android.livesdk.chatroom.end.newaudienceend.l)
                              (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1 : 0x0264: CONSTRUCTOR  (r2v6 com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.1.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.a):void type: CONSTRUCTOR)
                             call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.2.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$b):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.b(com.bytedance.android.livesdkapi.depend.model.live.Room):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 42 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 48 more
                            */
                        /*
                        // Method dump skipped, instructions count: 712
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.View$OnClickListenerC7532a.mo13789b(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
                    }

                    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
                    public final void onViewCreated(View view, Bundle bundle) {
                        super.onViewCreated(view, bundle);
                        View a = mo13778a(R.id.cg3);
                        this.f18742z = a;
                        a.setVisibility(0);
                        this.f18733q = (LiveTextView) mo13778a(R.id.j7);
                        this.f18734r = (ImageView) mo13778a(R.id.it);
                        this.f18735s = (HSImageView) mo13778a(R.id.py);
                        LiveNewRecommendView liveNewRecommendView = (LiveNewRecommendView) mo13778a(R.id.dfr);
                        this.f18736t = liveNewRecommendView;
                        if (liveNewRecommendView != null) {
                            liveNewRecommendView.setDataChannel(this.f18722a);
                            this.f18736t.setIView(this);
                        }
                        this.f18737u = (LiveTextView) mo13778a(R.id.dju);
                        this.f18739w = mo13778a(R.id.ctu);
                        this.f18728l = (LiveTextView) mo13778a(R.id.ctz);
                        mo13778a(R.id.agf).setOnClickListener(new View$OnClickListenerC7537d(this));
                        this.f18738v = (ImageView) mo13778a(R.id.b6n);
                        this.f18740x = (LottieAnimationView) mo13778a(R.id.b6d);
                        HSAnimImageView hSAnimImageView = (HSAnimImageView) mo13778a(R.id.b6e);
                        this.f18741y = hSAnimImageView;
                        hSAnimImageView.mo9389a(HSAnimImageView.m9804a("tiktok_live_watch_resource", "ttlive_anim_follow_success.webp"));
                        ImageView imageView = this.f18738v;
                        if (!(imageView == null || this.f18740x == null)) {
                            imageView.setOnClickListener(new View$OnClickListenerC7538e(this));
                        }
                        this.f18715C = mo13778a(R.id.cv8);
                        this.f18716D = (ImageView) mo13778a(R.id.cv9);
                        this.f18713A = mo13778a(R.id.eay);
                        this.f18714B = (LiveTextView) mo13778a(R.id.eb1);
                        this.f18715C.setOnClickListener(this);
                        this.f18713A.setOnClickListener(this);
                        C4386c.m10499a().mo10159a((Integer) 0);
                        C6501b.C6502a.m13948a("livesdk_finish_show").mo12639a().mo12655b();
                    }

                    @Override // androidx.fragment.app.Fragment
                    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                        return C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b89, viewGroup, false);
                    }
                }
