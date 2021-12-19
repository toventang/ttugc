package com.bytedance.android.livesdk.userinfowidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p379n.C5792x;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p492g.C7573e;
import com.bytedance.android.livesdk.event.C8454g;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveOnlineAudienceListSetting;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class LiveRoomGeneralInfoWidget extends RoomRecycleWidget implements AbstractC33974au {

    /* renamed from: a */
    public Room f26469a;

    /* renamed from: b */
    public HSAnimImageView f26470b;

    /* renamed from: c */
    public View f26471c;

    /* renamed from: d */
    public View f26472d;

    /* renamed from: e */
    public ValueAnimator f26473e;

    /* renamed from: f */
    public HSImageView f26474f;

    /* renamed from: g */
    private Object[] f26475g;

    /* renamed from: h */
    private boolean f26476h;

    /* renamed from: i */
    private LottieAnimationView f26477i;

    /* renamed from: j */
    private final C88411a f26478j = new C88411a();

    /* renamed from: k */
    private AbstractC6872f f26479k;

    /* renamed from: l */
    private View f26480l;

    /* renamed from: m */
    private LiveWidget f26481m;

    /* renamed from: n */
    private LiveWidget f26482n;

    /* renamed from: o */
    private final WidgetCreateTimeUtil f26483o = new WidgetCreateTimeUtil(null, 1, null);

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$h */
    public static final class C11004h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C11004h f26491a = new C11004h();

        static {
            Covode.recordClassIndex(12620);
        }

        C11004h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12612);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bbq;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo17847a() {
        if (this.f26469a != null) {
            Room room = this.f26469a;
            if (room == null) {
                C89219l.m154715b();
            }
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            UserProfileEvent userProfileEvent = new UserProfileEvent(owner.getId());
            userProfileEvent.mSource = "video_head";
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.mo28320c(C5792x.class, userProfileEvent);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f26476h = false;
        resetAnim();
        this.f26478j.mo142944a();
        this.f26483o.send();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(this.f26481m);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.unload(this.f26482n);
        }
        View findViewById = findViewById(R.id.mf);
        C89219l.m154716b(findViewById, "");
        ((FrameLayout) findViewById).setVisibility(8);
        View findViewById2 = findViewById(R.id.bg3);
        C89219l.m154716b(findViewById2, "");
        ((FrameLayout) findViewById2).setVisibility(8);
        if (this.f26469a != null) {
            AbstractC2953a a = C6193a.m13435a(AbstractC10073p.class);
            if (a == null) {
                C89219l.m154715b();
            }
            AbstractC10073p pVar = (AbstractC10073p) a;
            Room room = this.f26469a;
            if (room == null) {
                C89219l.m154715b();
            }
            AbstractC9168b likeHelper = pVar.getLikeHelper(room.getId());
            if (likeHelper != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
                likeHelper.mo15270a((View) null);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b5, code lost:
        if (r0 == null) goto L_0x01b7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m19644b() {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget.m19644b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$d */
    public static final class View$OnClickListenerC11000d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26487a;

        static {
            Covode.recordClassIndex(12616);
        }

        View$OnClickListenerC11000d(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26487a = liveRoomGeneralInfoWidget;
        }

        public final void onClick(View view) {
            this.f26487a.mo17847a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$e */
    public static final class View$OnClickListenerC11001e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26488a;

        static {
            Covode.recordClassIndex(12617);
        }

        View$OnClickListenerC11001e(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26488a = liveRoomGeneralInfoWidget;
        }

        public final void onClick(View view) {
            this.f26488a.mo17847a();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$i */
    public static final class C11005i implements AbstractC24295b {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26492a;

        static {
            Covode.recordClassIndex(12621);
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: a */
        public final void mo9283a(C24290a aVar) {
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: a */
        public final void mo9284a(C24290a aVar, int i) {
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: c */
        public final void mo9286c(C24290a aVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11005i(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26492a = liveRoomGeneralInfoWidget;
        }

        /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$i$a */
        static final class C11006a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C11005i f26493a;

            /* renamed from: b */
            final /* synthetic */ int f26494b;

            /* renamed from: c */
            final /* synthetic */ int f26495c;

            /* renamed from: d */
            final /* synthetic */ GradientDrawable f26496d;

            static {
                Covode.recordClassIndex(12622);
            }

            C11006a(C11005i iVar, int i, int i2, GradientDrawable gradientDrawable) {
                this.f26493a = iVar;
                this.f26494b = i;
                this.f26495c = i2;
                this.f26496d = gradientDrawable;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154721d(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f26493a.f26492a.f26471c;
                if (view == null) {
                    C89219l.m154715b();
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C89219l.m154716b(layoutParams, "");
                layoutParams.width = (int) (floatValue * ((float) this.f26494b));
                int i = layoutParams.width;
                int i2 = this.f26495c;
                if (i <= i2) {
                    layoutParams.height = layoutParams.width;
                    GradientDrawable gradientDrawable = this.f26496d;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius((float) (layoutParams.height >> 1));
                    }
                } else {
                    layoutParams.height = i2;
                }
                View view2 = this.f26493a.f26492a.f26471c;
                if (view2 == null) {
                    C89219l.m154715b();
                }
                view2.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$i$b */
        public static final class C11007b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C11005i f26497a;

            /* renamed from: b */
            final /* synthetic */ GradientDrawable f26498b;

            static {
                Covode.recordClassIndex(12623);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                super.onAnimationEnd(animator);
                View view = this.f26497a.f26492a.f26471c;
                if (view == null) {
                    C89219l.m154715b();
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                C89219l.m154716b(layoutParams, "");
                layoutParams.width = -2;
                layoutParams.height = -2;
                View view2 = this.f26497a.f26492a.f26471c;
                if (view2 == null) {
                    C89219l.m154715b();
                }
                view2.setLayoutParams(layoutParams);
                GradientDrawable gradientDrawable = this.f26498b;
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius((float) C3966y.m9653a(12.5f));
                }
                View view3 = this.f26497a.f26492a.f26471c;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                C13628n.m24510a(view3, 8);
            }

            C11007b(C11005i iVar, GradientDrawable gradientDrawable) {
                this.f26497a = iVar;
                this.f26498b = gradientDrawable;
            }
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: b */
        public final void mo9285b(C24290a aVar) {
            if (this.f26492a.f26471c instanceof View) {
                View view = this.f26492a.f26471c;
                if (view == null) {
                    C89219l.m154715b();
                }
                Drawable background = view.getBackground();
                if (!(background instanceof GradientDrawable)) {
                    background = null;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                View view2 = this.f26492a.f26471c;
                if (view2 == null) {
                    C89219l.m154715b();
                }
                int measuredWidth = view2.getMeasuredWidth();
                View view3 = this.f26492a.f26471c;
                if (view3 == null) {
                    C89219l.m154715b();
                }
                int measuredHeight = view3.getMeasuredHeight();
                this.f26492a.f26473e = ValueAnimator.ofFloat(1.0f, 0.0f);
                ValueAnimator valueAnimator = this.f26492a.f26473e;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new C11006a(this, measuredWidth, measuredHeight, gradientDrawable));
                }
                ValueAnimator valueAnimator2 = this.f26492a.f26473e;
                if (valueAnimator2 != null) {
                    valueAnimator2.addListener(new C11007b(this, gradientDrawable));
                }
                ValueAnimator valueAnimator3 = this.f26492a.f26473e;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(200L);
                }
                ValueAnimator valueAnimator4 = this.f26492a.f26473e;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ HSImageView m19642a(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
        HSImageView hSImageView = liveRoomGeneralInfoWidget.f26474f;
        if (hSImageView == null) {
            C89219l.m154710a("border");
        }
        return hSImageView;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        this.f26469a = room;
        m19644b();
    }

    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$c */
    static final class C10999c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26486a;

        static {
            Covode.recordClassIndex(12615);
        }

        C10999c(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26486a = liveRoomGeneralInfoWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gnn);
            View view = this.f26486a.f26471c;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f26486a.f26472d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$g */
    public static final class C11003g extends AbstractC89220m implements AbstractC89172b<C9591j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26490a;

        static {
            Covode.recordClassIndex(12619);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11003g(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            super(1);
            this.f26490a = liveRoomGeneralInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C9591j jVar) {
            C9591j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            C3941k.m9601a(LiveRoomGeneralInfoWidget.m19642a(this.f26490a), jVar2.f23265a);
            LiveRoomGeneralInfoWidget.m19642a(this.f26490a).setVisibility(0);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.iq);
        C89219l.m154716b(findViewById, "");
        this.f26474f = (HSImageView) findViewById;
        this.f26475g = objArr;
    }

    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$b */
    static final class C10998b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26485a;

        static {
            Covode.recordClassIndex(12614);
        }

        C10998b(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26485a = liveRoomGeneralInfoWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C11688a aVar = (C11688a) obj;
            C89219l.m154716b(aVar, "");
            if (!aVar.mo18452b()) {
                C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gnn);
                View view = this.f26485a.f26471c;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.f26485a.f26472d;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5 != null) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m19643a(com.bytedance.android.livesdkapi.depend.model.live.Room r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L_0x0018
            com.bytedance.android.livesdk.model.ap r0 = r5.officialChannelInfo
            if (r0 == 0) goto L_0x001a
            com.bytedance.android.live.base.model.user.User r0 = r0.f23136a
            if (r0 == 0) goto L_0x001a
            long r1 = r0.getId()
        L_0x0010:
            long r3 = r5.getOwnerUserId()
        L_0x0014:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
        L_0x0018:
            r0 = 1
            return r0
        L_0x001a:
            r1 = 0
            if (r5 == 0) goto L_0x0014
            goto L_0x0010
        L_0x001f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget.m19643a(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$a */
    static final class C10997a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26484a;

        static {
            Covode.recordClassIndex(12613);
        }

        C10997a(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26484a = liveRoomGeneralInfoWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C8454g gVar = (C8454g) obj;
            if (this.f26484a.isVisibilityToUser() && gVar != null && gVar.f20901a != null && this.f26484a.getView() != null && this.f26484a.isViewValid()) {
                SparseBooleanArray sparseBooleanArray = gVar.f20901a;
                boolean z = false;
                boolean z2 = sparseBooleanArray.get(0);
                boolean z3 = sparseBooleanArray.get(2);
                Context context = this.f26484a.context;
                View view = this.f26484a.getView();
                if (!z2 && !z3) {
                    z = true;
                }
                C7573e.m15564a(context, view, z, gVar.f20903c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$f */
    public static final class C11002f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26489a;

        static {
            Covode.recordClassIndex(12618);
        }

        C11002f(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26489a = liveRoomGeneralInfoWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            HSAnimImageView hSAnimImageView;
            Room room;
            C11688a aVar = (C11688a) obj;
            LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget = this.f26489a;
            C89219l.m154716b(aVar, "");
            DataChannel dataChannel = liveRoomGeneralInfoWidget.dataChannel;
            if (!(dataChannel == null || (room = (Room) dataChannel.mo28318b(C9093de.class)) == null)) {
                room.getOwner().setFollowStatus(aVar.mo18451a());
                DataChannel dataChannel2 = liveRoomGeneralInfoWidget.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.mo28315b(C9093de.class, room);
                }
            }
            if (aVar.mo18451a() == 1 || aVar.mo18451a() == 2) {
                HSAnimImageView hSAnimImageView2 = liveRoomGeneralInfoWidget.f26470b;
                if (hSAnimImageView2 != null && !hSAnimImageView2.mo9392c() && (hSAnimImageView = liveRoomGeneralInfoWidget.f26470b) != null) {
                    hSAnimImageView.mo9390a();
                    return;
                }
                return;
            }
            View view = liveRoomGeneralInfoWidget.f26471c;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = liveRoomGeneralInfoWidget.f26472d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget$j */
    public static final class View$OnClickListenerC11008j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveRoomGeneralInfoWidget f26499a;

        static {
            Covode.recordClassIndex(12624);
        }

        View$OnClickListenerC11008j(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f26499a = liveRoomGeneralInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            FollowInfo followInfo;
            HSAnimImageView hSAnimImageView = this.f26499a.f26470b;
            if (hSAnimImageView != null) {
                hSAnimImageView.mo9390a();
            }
            View view2 = this.f26499a.f26472d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            Room room = this.f26499a.f26469a;
            if (room != null) {
                LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget = this.f26499a;
                C6544e.m13987a();
                AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
                if (aVar == null || aVar.isMicAudience()) {
                    str = "carousel_audience_c_anchor";
                } else {
                    str = "loyal_audience_c_anchor";
                }
                User owner = room.getOwner();
                C89219l.m154716b(owner, "");
                long j = 0;
                C11115u.m19743a().mo17915b().mo13150a(((C6865d.AbstractC6866a) new C6865d.C6867b().mo13134a(owner.getId())).mo13136a(room.getRequestId()).mo13139b("live_detail").mo13140c("live_over").mo13138b(0).mo13142d(room.getLabels()).mo13141c()).mo143254a(new C10998b(liveRoomGeneralInfoWidget), new C10999c(liveRoomGeneralInfoWidget));
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("growth_deepevent", "1");
                    C7411d a = C7411d.m15284a();
                    C89219l.m154716b(a, "");
                    if (!C13627m.m24498a(a.mo13614e())) {
                        C7411d a2 = C7411d.m15284a();
                        C89219l.m154716b(a2, "");
                        String e = a2.mo13614e();
                        C89219l.m154716b(e, "");
                        hashMap.put("enter_live_method", e);
                    }
                    String g = C6544e.m13993g();
                    if (TextUtils.isEmpty(g) || !C89219l.m154714a((Object) "click_push_live_cd_user", (Object) g)) {
                        hashMap.put("is_subscribe", "0");
                    } else {
                        hashMap.put("is_subscribe", "1");
                    }
                    if (!C89361p.m154929e((CharSequence) str, (CharSequence) "carousel_audience_c") && !C89361p.m154929e((CharSequence) str, (CharSequence) "loyal_audience_c")) {
                        str = "live_over";
                    }
                    if (C3966y.m9670f()) {
                        str2 = "portrait";
                    } else {
                        str2 = "landscape";
                    }
                    hashMap.put("room_orientation", str2);
                    User owner2 = room.getOwner();
                    if (!(owner2 == null || (followInfo = owner2.getFollowInfo()) == null)) {
                        j = followInfo.getFollowStatus();
                    }
                    if (j == 1 || j == 3) {
                        hashMap.put("follow_type", "mutual");
                    } else {
                        hashMap.put("follow_type", "single");
                    }
                    C6501b a3 = C6501b.C6502a.m13948a("follow").mo12643a(liveRoomGeneralInfoWidget.dataChannel).mo12652a((Map<String, String>) hashMap);
                    User owner3 = room.getOwner();
                    C89219l.m154716b(owner3, "");
                    a3.mo12640a(new C6526e(str, owner3.getId())).mo12654b("live_interact").mo12656c("core").mo12655b();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Boolean bool;
        Boolean bool2;
        this.f26483o.clear();
        enableSubWidgetManager(this.f26483o, C6203g.f15476a);
        this.subWidgetManager.load(R.id.cxw, LiveRoomUserInfoWidget.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f26469a = room;
        this.f26479k = C11115u.m19743a().mo17915b();
        this.f26480l = findViewById(R.id.cjy);
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        DataChannel dataChannel2 = this.dataChannel;
        if (!(dataChannel2 == null || (bool2 = (Boolean) dataChannel2.mo28318b(C9076co.class)) == null || bool2.booleanValue())) {
            this.f26478j.mo142945a(((AbstractC11181z) C6779a.m14563a().mo13052a(C8454g.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(this))).mo17949a(new C10997a(this)));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue() && (LiveOnlineAudienceListSetting.INSTANCE.getValue() || (aVar != null && aVar.isMicRoomForCurrentRoom()))) {
            AbstractC2953a a = C6193a.m13435a(AbstractC10339d.class);
            if (a == null) {
                C89219l.m154715b();
            }
            this.f26481m = ((AbstractC10339d) a).getRankWidget();
            this.subWidgetManager.load(R.id.mf, this.f26481m);
            View findViewById = findViewById(R.id.mf);
            C89219l.m154716b(findViewById, "");
            ((FrameLayout) findViewById).setVisibility(0);
        }
        if (C11279p.m20019b(valueOf) && !aVar.isMicRoomForCurrentRoom()) {
            C11279p.m20017b(findViewById(R.id.bg3));
            this.f26482n = this.subWidgetManager.load(R.id.bg3, (Class) ((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).getRankWidgetClass(4), false);
        }
        m19644b();
    }
}
