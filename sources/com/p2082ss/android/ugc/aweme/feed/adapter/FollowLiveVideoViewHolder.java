package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g;
import com.bytedance.android.livesdkapi.service.AbstractC11843a;
import com.bytedance.android.livesdkapi.service.AbstractC11844b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget;
import com.p2082ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80507go;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashSet;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90253j;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder */
public class FollowLiveVideoViewHolder extends FullFeedVideoViewHolder implements AbstractC90253j {

    /* renamed from: a */
    public RoomStruct f111273a;

    /* renamed from: aK */
    private int f111274aK = -1;

    /* renamed from: aL */
    private FeedLiveWindowWidget f111275aL;

    /* renamed from: aM */
    private Animator f111276aM;

    /* renamed from: aN */
    private boolean f111277aN;

    /* renamed from: aO */
    private boolean f111278aO;

    /* renamed from: aP */
    private boolean f111279aP;

    /* renamed from: aQ */
    private boolean f111280aQ;

    /* renamed from: aR */
    private Handler f111281aR = new Handler(Looper.getMainLooper()) {
        /* class com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.HandlerC480341 */

        static {
            Covode.recordClassIndex(56765);
        }

        public final void handleMessage(Message message) {
            if (FollowLiveVideoViewHolder.this.f111283c && message.what == 100 && FollowLiveVideoViewHolder.this.f111282b && FollowLiveVideoViewHolder.this.mo80074o()) {
                FollowLiveVideoViewHolder.this.mo80075I();
            }
        }
    };

    /* renamed from: b */
    public boolean f111282b;

    /* renamed from: c */
    public boolean f111283c;

    /* renamed from: d */
    View f111284d;

    /* renamed from: e */
    public View f111285e;

    /* renamed from: f */
    public boolean f111286f;

    /* renamed from: g */
    public Room f111287g;

    /* renamed from: h */
    public AbstractC58608c f111288h = LiveOuterService.m107269s().mo95826a(new RunnableC48298t(this), new AbstractC58607b() {
        /* class com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480352 */

        static {
            Covode.recordClassIndex(56766);
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void firstFrame() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onVideoSizeChange(TextureView textureView, int i, int i2) {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playComplete(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playPrepared(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playerMediaError(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void playing() {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void seiUpdate(String str) {
        }

        @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b
        public final void onPlayerMessage(AbstractC11643g.EnumC11645b bVar, Object obj) {
            int i = C480407.f111297a[bVar.ordinal()];
            if (i == 1 || i == 2) {
                FollowLiveVideoViewHolder.this.mo80076J();
            }
        }
    });

    static {
        Covode.recordClassIndex(56764);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: K */
    public final boolean mo80077K() {
        return false;
    }

    /* renamed from: aP */
    private void m91054aP() {
        this.f111281aR.removeMessages(100);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void bp_() {
        super.bp_();
        mo80068G();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: aS */
    private void m91057aS() {
        if (mo80074o()) {
            mo80076J();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: aU */
    private void m91059aU() {
        Animator animator = this.f111276aM;
        if (animator != null) {
            animator.cancel();
            this.f111276aM = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: j */
    public final void mo70620j() {
        super.mo70620j();
        this.f111288h.destroy();
        m91054aP();
        m91059aU();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: m */
    public final void mo80083m() {
        super.mo80083m();
        this.f111288h.pause();
        this.f111277aN = false;
    }

    /* renamed from: o */
    public final boolean mo80074o() {
        RoomStruct roomStruct = this.f111273a;
        if (roomStruct == null || !roomStruct.isPullUrlValid()) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public final void mo80076J() {
        AbstractC58593c d = LiveOuterService.m107269s().mo95830d();
        if (d != null) {
            d.mo12986a(this.f111273a.f114485id, new AbstractC11843a() {
                /* class com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480374 */

                static {
                    Covode.recordClassIndex(56768);
                }

                @Override // com.bytedance.android.livesdkapi.service.AbstractC11843a
                /* renamed from: a */
                public final void mo18942a(boolean z) {
                    boolean z2 = true;
                    if (z != FollowLiveVideoViewHolder.this.f111282b) {
                        FollowLiveVideoViewHolder.this.f111282b = z;
                        FollowLiveVideoViewHolder.this.mo80202aw().mo60191a("live_has_end", Boolean.valueOf(!FollowLiveVideoViewHolder.this.f111282b));
                        if (FollowLiveVideoViewHolder.this.f111283c) {
                            FollowLiveVideoViewHolder.this.mo80068G();
                        }
                    }
                    if (!z) {
                        FollowLiveVideoViewHolder.this.f111288h.stop();
                        FollowLiveVideoViewHolder followLiveVideoViewHolder = FollowLiveVideoViewHolder.this;
                        if (!followLiveVideoViewHolder.f111283c || !FollowLiveVideoViewHolder.this.f111286f) {
                            z2 = false;
                        }
                        followLiveVideoViewHolder.mo80081f(z2);
                    }
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: g */
    public final void mo80072g() {
        super.mo80072g();
        this.f111283c = false;
        this.f111288h.stop();
        mo80081f(false);
        this.f111277aN = false;
        this.f111279aP = false;
        m91054aP();
        m91059aU();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: l */
    public final void mo80082l() {
        super.mo80082l();
        m91057aS();
        if (this.f111286f) {
            mo80075I();
        } else if (this.f111279aP) {
            m91056aR();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder$7 */
    static /* synthetic */ class C480407 {

        /* renamed from: a */
        static final /* synthetic */ int[] f111297a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 56771(0xddc3, float:7.9553E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480407.f111297a = r2
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480407.f111297a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.p680d.AbstractC11643g.EnumC11645b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480407.<clinit>():void");
        }
    }

    /* renamed from: aR */
    private void m91056aR() {
        long liveWindowShowTime = this.f111308j.getLiveWindowShowTime() * 1000;
        if (liveWindowShowTime > 0) {
            if (liveWindowShowTime < InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                liveWindowShowTime = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            }
            Handler handler = this.f111281aR;
            handler.sendMessageDelayed(handler.obtainMessage(100), liveWindowShowTime);
        }
    }

    /* renamed from: aT */
    private void m91058aT() {
        if (!this.f111286f) {
            if (this.f111285e.getVisibility() == 8) {
                this.f111285e.setVisibility(0);
                this.f111285e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.ViewTreeObserver$OnGlobalLayoutListenerC480363 */

                    static {
                        Covode.recordClassIndex(56767);
                    }

                    public final void onGlobalLayout() {
                        FollowLiveVideoViewHolder.this.f111285e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        FollowLiveVideoViewHolder.this.f111285e.setTranslationX(FollowLiveVideoViewHolder.m91061b(FollowLiveVideoViewHolder.this.f111285e));
                    }
                });
                return;
            }
            this.f111285e.setVisibility(0);
            View view = this.f111285e;
            view.setTranslationX(m91061b(view));
        }
    }

    /* renamed from: aV */
    private boolean m91060aV() {
        Object b;
        User author = this.f111308j.getAuthor();
        if (author != null) {
            long j = author.roomId;
            if (j > 0 && (b = mo80202aw().mo60195b("key_open_live_aweme_list", (Object) null)) != null && (b instanceof Set)) {
                return ((Set) b).contains(Long.valueOf(j));
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: G */
    public final void mo80068G() {
        this.f111273a = null;
        m91055aQ();
        if (this.f111285e.getVisibility() == 0) {
            this.f111285e.setVisibility(4);
        }
        if (this.f111282b) {
            this.f111278aO = m91060aV();
        }
        m91057aS();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: I */
    public final void mo80075I() {
        if (this.f111282b && this.f111283c && !this.f111278aO && this.f111275aL.mo81272e() != null && mo80074o() && !this.f111277aN) {
            this.f111277aN = true;
            m91058aT();
            this.f111288h.play(true, this.f111273a, this.f111275aL.mo81272e());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.p2082ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    /* renamed from: c */
    public final void mo80080c() {
        super.mo80080c();
        this.f111282b = false;
        this.f111287g = null;
        this.f111280aQ = false;
        this.f111286f = false;
        m91059aU();
        if (this.f111285e.getVisibility() == 0) {
            this.f111285e.setVisibility(4);
            this.f111285e.setTranslationX(0.0f);
        }
        if (this.f111284d.getVisibility() != 0) {
            this.f111284d.setVisibility(0);
            this.f111284d.setTranslationX(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: n */
    public final void mo80073n() {
        super.mo80073n();
        mo80202aw().mo60189a("dismiss_live_window", (AbstractC1214u<C33942b>) this).mo60189a("live_window_clicked", (AbstractC1214u<C33942b>) this);
        this.f111275aL = new FeedLiveWindowWidget();
        this.f111397aA.mo60221b(R.id.c4s, this.f111275aL);
        this.f111285e = this.f111275aL.f113935a;
    }

    /* renamed from: aQ */
    private void m91055aQ() {
        boolean z;
        Room room = this.f111287g;
        if (room != null) {
            this.f111273a = C80507go.m139523a(room);
        }
        if (this.f111308j != null && this.f111308j.getAuthor() != null) {
            String str = this.f111308j.getAuthor().roomData;
            if (str != null) {
                SlimRoom slimRoom = (SlimRoom) C80342dg.m139301a(str, SlimRoom.class);
                RoomStruct roomStruct = null;
                if (slimRoom != null) {
                    RoomStruct roomStruct2 = new RoomStruct();
                    roomStruct2.f114485id = slimRoom.getId();
                    roomStruct2.ownerUserId = slimRoom.getOwnerUserId();
                    StreamUrlStruct a = C80507go.m139522a(slimRoom.getStreamUrl(), slimRoom.getMultiStreamDefaultQualitySdkKey());
                    if (a != null) {
                        roomStruct2.stream_url = a;
                        roomStruct2.isThirdParty = slimRoom.isThirdParty;
                        roomStruct2.isScreenshot = slimRoom.isScreenshot;
                        if (slimRoom.getStreamType() == EnumC11728i.AUDIO) {
                            z = true;
                        } else {
                            z = false;
                        }
                        roomStruct2.liveTypeAudio = z;
                        roomStruct = roomStruct2;
                    }
                }
                this.f111273a = roomStruct;
            }
            if (this.f111273a == null) {
                long j = this.f111308j.getAuthor().roomId;
                if (!this.f111280aQ && j > 0) {
                    this.f111280aQ = true;
                    LiveOuterService.m107269s().mo95830d().mo12987a(j, new AbstractC11844b() {
                        /* class com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480385 */

                        static {
                            Covode.recordClassIndex(56769);
                        }

                        @Override // com.bytedance.android.livesdkapi.service.AbstractC11844b
                        /* renamed from: a */
                        public final void mo11776a() {
                        }

                        @Override // com.bytedance.android.livesdkapi.service.AbstractC11844b
                        /* renamed from: a */
                        public final void mo11777a(Room room) {
                            FollowLiveVideoViewHolder.this.f111287g = room;
                            FollowLiveVideoViewHolder.this.f111273a = C80507go.m139523a(room);
                            if (FollowLiveVideoViewHolder.this.f111283c) {
                                FollowLiveVideoViewHolder.this.mo80068G();
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    /* renamed from: c */
    private static ObjectAnimator m91062c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", m91061b(view), 0.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    /* renamed from: d */
    private static ObjectAnimator m91063d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, m91061b(view));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70614a(int i) {
        super.mo70614a(i);
        this.f111274aK = i;
        this.f111283c = true;
        m91057aS();
        if (!mo80074o() || this.f111278aO) {
            mo80081f(false);
        } else {
            m91056aR();
        }
    }

    /* renamed from: f */
    public final void mo80081f(boolean z) {
        this.f111286f = false;
        if (z) {
            mo80078a(this.f111285e, this.f111284d);
            return;
        }
        this.f111285e.setVisibility(8);
        this.f111284d.setVisibility(0);
        this.f111284d.setTranslationX(0.0f);
    }

    public FollowLiveVideoViewHolder(C48238ce ceVar) {
        super(ceVar);
        this.f111284d = ceVar.f111744a.findViewById(R.id.p7);
    }

    /* renamed from: b */
    public static float m91061b(View view) {
        if (view.getContext() != null && C80471gb.m139483a(view.getContext())) {
            return (float) view.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        float f = (float) (-view.getWidth());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return f;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return (f - ((float) marginLayoutParams.leftMargin)) - ((float) marginLayoutParams.rightMargin);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80070a(C33942b bVar) {
        String aid;
        C49672ag agVar;
        super.onChanged(bVar);
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -906007925:
                    if (str.equals("live_window_clicked")) {
                        this.f111288h.stop();
                        if (this.f111285e.getVisibility() == 0) {
                            mo80081f(true);
                        }
                        if (this.f111308j != null && (aid = this.f111308j.getAid()) != null) {
                            this.f111278aO = true;
                            Object b = mo80202aw().mo60195b("key_open_live_aweme_list", (Object) null);
                            if (b == null) {
                                HashSet hashSet = new HashSet();
                                hashSet.add(aid);
                                mo80202aw().mo60191a("key_open_live_aweme_list", hashSet);
                                return;
                            } else if (b instanceof Set) {
                                ((Set) b).add(aid);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case -162745511:
                    if (str.equals("feed_internal_event") && (agVar = (C49672ag) bVar.mo60212a()) != null && agVar.f114315a == 19) {
                        this.f111288h.stop();
                        mo80081f(false);
                        this.f111279aP = true;
                        return;
                    }
                    return;
                case 1471092846:
                    if (str.equals("dismiss_live_window")) {
                        mo80081f(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo80078a(final View view, final View view2) {
        m91059aU();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f111276aM = animatorSet;
        animatorSet.playTogether(m91062c(view2), m91063d(view));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.p2082ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.C480396 */

            static {
                Covode.recordClassIndex(56770);
            }

            public final void onAnimationCancel(Animator animator) {
                view.setVisibility(4);
            }

            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(4);
            }

            public final void onAnimationStart(Animator animator) {
                view2.setVisibility(0);
            }
        });
        animatorSet.start();
    }
}
