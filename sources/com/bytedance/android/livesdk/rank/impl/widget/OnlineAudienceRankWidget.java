package com.bytedance.android.livesdk.rank.impl.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceAreaListSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p476c.C7251b;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.rank.api.model.C10347a;
import com.bytedance.android.livesdk.rank.api.p606a.C10332a;
import com.bytedance.android.livesdk.rank.impl.C10357a;
import com.bytedance.android.livesdk.rank.impl.p609b.C10376a;
import com.bytedance.android.livesdk.rank.impl.p610c.C10384a;
import com.bytedance.android.livesdk.rank.impl.p612e.C10392b;
import com.bytedance.android.livesdk.rank.impl.p614g.C10435c;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.utils.C11227ap;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

public final class OnlineAudienceRankWidget extends RoomRecycleWidget implements C10376a.AbstractC10378b, AbstractC33974au {

    /* renamed from: a */
    public C10376a.AbstractC10377a f25570a;

    /* renamed from: b */
    public RecyclerView f25571b;

    /* renamed from: c */
    public TextView f25572c;

    /* renamed from: d */
    View f25573d;

    /* renamed from: e */
    public TextView f25574e;

    /* renamed from: f */
    public LottieAnimationView f25575f;

    /* renamed from: g */
    public View f25576g;

    /* renamed from: h */
    public HSImageView f25577h;

    /* renamed from: i */
    int f25578i;

    /* renamed from: j */
    public C7251b f25579j;

    /* renamed from: k */
    C10357a f25580k;

    /* renamed from: l */
    private final AbstractC89244h f25581l = C89250i.m154773a((AbstractC89171a) new C10602h(this));

    /* renamed from: m */
    private final AbstractC89244h f25582m = C89250i.m154773a((AbstractC89171a) new C10601g(this));

    /* renamed from: n */
    private final AbstractC89244h f25583n = C89250i.m154773a((AbstractC89171a) new C10603i(this));

    /* renamed from: o */
    private boolean f25584o;

    /* renamed from: p */
    private boolean f25585p;

    /* renamed from: q */
    private C88411a f25586q;

    static {
        Covode.recordClassIndex(12181);
    }

    /* renamed from: e */
    private final LinearLayout m19168e() {
        return (LinearLayout) this.f25581l.getValue();
    }

    /* renamed from: f */
    private final LiveTextView m19169f() {
        return (LiveTextView) this.f25582m.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$m */
    static final class C10607m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25602a;

        static {
            Covode.recordClassIndex(12196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10607m(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.f25602a = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo17533a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo17533a() {
            EnumC10608a aVar;
            C89399f fVar = new C89399f();
            C10376a.AbstractC10377a aVar2 = this.f25602a.f25570a;
            if (aVar2 == null || (aVar = aVar2.mo17255a()) == null) {
                aVar = EnumC10608a.SELF_NON_ANCHOR_REVENUE;
            }
            DataChannel dataChannel = this.f25602a.dataChannel;
            C89219l.m154716b(dataChannel, "");
            fVar.mo143771a(C10347a.class, new C10435c(aVar, dataChannel));
            RecyclerView recyclerView = this.f25602a.f25571b;
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            }
            RecyclerView recyclerView2 = this.f25602a.f25571b;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(fVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$g */
    static final class C10601g extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25596a;

        static {
            Covode.recordClassIndex(12190);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10601g(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.f25596a = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LiveTextView invoke() {
            return this.f25596a.findViewById(R.id.f0i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$h */
    static final class C10602h extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25597a;

        static {
            Covode.recordClassIndex(12191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10602h(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.f25597a = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f25597a.findViewById(R.id.cwh);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$i */
    static final class C10603i extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25598a;

        static {
            Covode.recordClassIndex(12192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10603i(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            super(0);
            this.f25598a = onlineAudienceRankWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            return this.f25598a.findViewById(R.id.fgm);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10378b
    /* renamed from: b */
    public final void mo17264b() {
        RecyclerView recyclerView = this.f25571b;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10378b
    /* renamed from: d */
    public final void mo17266d() {
        C10357a aVar = this.f25580k;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f25580k = null;
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10378b
    /* renamed from: c */
    public final void mo17265c() {
        try {
            if (this.isViewValid) {
                RecyclerView recyclerView = this.f25571b;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        Object obj;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            obj = dataChannel.mo28318b(C9076co.class);
        } else {
            obj = null;
        }
        if (C89219l.m154714a(obj, (Object) true)) {
            return R.layout.bbr;
        }
        return R.layout.bbs;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        C10376a.AbstractC10377a aVar = this.f25570a;
        if (aVar != null) {
            aVar.mo17259c();
        }
        this.f25584o = false;
        this.f25571b = null;
        C10357a aVar2 = this.f25580k;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
        this.f25580k = null;
        this.f25586q.mo142944a();
        C10384a.m18892b(-1);
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10378b
    /* renamed from: a */
    public final void mo17261a() {
        try {
            if (this.isViewValid) {
                LiveTextView f = m19169f();
                C89219l.m154716b(f, "");
                f.setText("0");
                LinearLayout e = m19168e();
                C89219l.m154716b(e, "");
                e.setVisibility(8);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    public OnlineAudienceRankWidget() {
        int i;
        if (C3966y.m9672g()) {
            i = -1;
        } else {
            i = 1;
        }
        this.f25578i = i;
        this.f25585p = C3966y.m9672g();
        this.f25579j = new C7251b();
        this.f25586q = new C88411a();
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$e */
    public static final class C10597e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25591a;

        static {
            Covode.recordClassIndex(12186);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$e$a */
        static final class RunnableC10598a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C10597e f25592a;

            static {
                Covode.recordClassIndex(12187);
            }

            RunnableC10598a(C10597e eVar) {
                this.f25592a = eVar;
            }

            public final void run() {
                Context context;
                Context context2;
                Context context3;
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.f25592a.f25591a;
                if (onlineAudienceRankWidget.f25572c != null && onlineAudienceRankWidget.f25573d != null && onlineAudienceRankWidget.f25576g != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    TextView textView = onlineAudienceRankWidget.f25572c;
                    if (textView != null) {
                        context = textView.getContext();
                    } else {
                        context = null;
                    }
                    iArr[1] = (int) C11227ap.m19885a(context, 54.0f);
                    ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(200L);
                    duration.addUpdateListener(new C10595c(onlineAudienceRankWidget));
                    C89219l.m154716b(duration, "");
                    duration.setInterpolator(onlineAudienceRankWidget.f25579j);
                    View view = onlineAudienceRankWidget.f25576g;
                    if (view == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", 0.0f, 1.0f);
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(onlineAudienceRankWidget.f25579j);
                    HSImageView hSImageView = onlineAudienceRankWidget.f25577h;
                    if (hSImageView == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hSImageView, "Alpha", 1.0f, 0.0f);
                    C89219l.m154716b(ofFloat2, "");
                    ofFloat2.setDuration(200L);
                    ofFloat2.setInterpolator(onlineAudienceRankWidget.f25579j);
                    HSImageView hSImageView2 = onlineAudienceRankWidget.f25577h;
                    if (hSImageView2 == null) {
                        C89219l.m154715b();
                    }
                    float[] fArr = new float[2];
                    float f = (float) (onlineAudienceRankWidget.f25578i * -1);
                    HSImageView hSImageView3 = onlineAudienceRankWidget.f25577h;
                    if (hSImageView3 != null) {
                        context2 = hSImageView3.getContext();
                    } else {
                        context2 = null;
                    }
                    fArr[0] = f * C11227ap.m19885a(context2, 25.0f);
                    fArr[1] = 0.0f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hSImageView2, "TranslationX", fArr);
                    C89219l.m154716b(ofFloat3, "");
                    ofFloat3.setDuration(200L);
                    ofFloat3.setInterpolator(onlineAudienceRankWidget.f25579j);
                    HSImageView hSImageView4 = onlineAudienceRankWidget.f25577h;
                    if (hSImageView4 == null) {
                        C89219l.m154715b();
                    }
                    float[] fArr2 = new float[2];
                    HSImageView hSImageView5 = onlineAudienceRankWidget.f25577h;
                    if (hSImageView5 != null) {
                        context3 = hSImageView5.getContext();
                    } else {
                        context3 = null;
                    }
                    fArr2[0] = C11227ap.m19885a(context3, 160.0f);
                    fArr2[1] = 0.0f;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hSImageView4, "TranslationY", fArr2);
                    C89219l.m154716b(ofFloat4, "");
                    ofFloat4.setDuration(200L);
                    ofFloat4.setInterpolator(onlineAudienceRankWidget.f25579j);
                    HSImageView hSImageView6 = onlineAudienceRankWidget.f25577h;
                    if (hSImageView6 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(hSImageView6, "ScaleX", 4.0f, 2.0f);
                    C89219l.m154716b(ofFloat5, "");
                    ofFloat5.setDuration(200L);
                    ofFloat5.setInterpolator(onlineAudienceRankWidget.f25579j);
                    HSImageView hSImageView7 = onlineAudienceRankWidget.f25577h;
                    if (hSImageView7 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(hSImageView7, "ScaleY", 4.0f, 2.0f);
                    C89219l.m154716b(ofFloat6, "");
                    ofFloat6.setDuration(200L);
                    ofFloat6.setInterpolator(onlineAudienceRankWidget.f25579j);
                    animatorSet.playTogether(duration, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6);
                    animatorSet.addListener(new C10596d(onlineAudienceRankWidget));
                    animatorSet.start();
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10597e(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25591a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            HSImageView hSImageView = this.f25591a.f25577h;
            if (hSImageView != null) {
                hSImageView.postDelayed(new RunnableC10598a(this), 360);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$a */
    public static final class C10593a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25587a;

        static {
            Covode.recordClassIndex(12182);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10593a(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25587a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            TextView textView = this.f25587a.f25574e;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$d */
    public static final class C10596d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25590a;

        static {
            Covode.recordClassIndex(12185);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10596d(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25590a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f25590a;
            AnimatorSet animatorSet = new AnimatorSet();
            TextView textView = onlineAudienceRankWidget.f25572c;
            if (textView == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, "Alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(160L);
            ofFloat.setInterpolator(onlineAudienceRankWidget.f25579j);
            View view = onlineAudienceRankWidget.f25573d;
            if (view == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "Alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat2, "");
            ofFloat2.setDuration(160L);
            ofFloat2.setInterpolator(onlineAudienceRankWidget.f25579j);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new C10604j(onlineAudienceRankWidget));
            View view2 = onlineAudienceRankWidget.f25573d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            animatorSet.start();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$j */
    public static final class C10604j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25599a;

        static {
            Covode.recordClassIndex(12193);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10604j(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25599a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f25599a;
            ValueAnimator duration = ValueAnimator.ofInt(0, 1240).setDuration(1240L);
            duration.addListener(new C10605k(onlineAudienceRankWidget));
            duration.start();
            HSImageView hSImageView = this.f25599a.f25577h;
            if (hSImageView != null) {
                hSImageView.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView = this.f25599a.f25575f;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
            }
            LottieAnimationView lottieAnimationView2 = this.f25599a.f25575f;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.mo5826a();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$k */
    public static final class C10605k implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25600a;

        static {
            Covode.recordClassIndex(12194);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C10605k(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25600a = onlineAudienceRankWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            LottieAnimationView lottieAnimationView = this.f25600a.f25575f;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(8);
            }
            if (this.f25600a.f25574e != null && this.f25600a.f25572c != null) {
                this.f25600a.mo17507a(0L);
                TextView textView = this.f25600a.f25574e;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                TextView textView2 = this.f25600a.f25574e;
                if (textView2 == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "Alpha", 0.0f, 1.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(80L);
                ofFloat.setInterpolator(this.f25600a.f25579j);
                TextView textView3 = this.f25600a.f25572c;
                if (textView3 == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, "Alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.setDuration(80L);
                ofFloat2.setInterpolator(this.f25600a.f25579j);
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.start();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        C10376a.AbstractC10377a aVar = this.f25570a;
        if (aVar != null) {
            aVar.mo17256a(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public final void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        C10376a.AbstractC10377a aVar = this.f25570a;
        if (aVar != null) {
            aVar.mo17257b(z);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$b */
    static final class C10594b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25588a;

        static {
            Covode.recordClassIndex(12183);
        }

        C10594b(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25588a = onlineAudienceRankWidget;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            ViewGroup.LayoutParams layoutParams3;
            TextView textView = this.f25588a.f25572c;
            if (!(textView == null || (layoutParams3 = textView.getLayoutParams()) == null)) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams3.width = ((Integer) animatedValue).intValue();
            }
            TextView textView2 = this.f25588a.f25572c;
            if (textView2 != null) {
                textView2.requestLayout();
            }
            View view = this.f25588a.f25576g;
            if (!(view == null || (layoutParams2 = view.getLayoutParams()) == null)) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue2).intValue();
            }
            View view2 = this.f25588a.f25576g;
            if (view2 != null) {
                view2.requestLayout();
            }
            TextView textView3 = this.f25588a.f25574e;
            if (!(textView3 == null || (layoutParams = textView3.getLayoutParams()) == null)) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Integer) animatedValue3).intValue();
            }
            TextView textView4 = this.f25588a.f25574e;
            if (textView4 != null) {
                textView4.requestLayout();
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$c */
    static final class C10595c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25589a;

        static {
            Covode.recordClassIndex(12184);
        }

        C10595c(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25589a = onlineAudienceRankWidget;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            TextView textView = this.f25589a.f25572c;
            if (!(textView == null || (layoutParams2 = textView.getLayoutParams()) == null)) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams2.width = ((Integer) animatedValue).intValue();
            }
            TextView textView2 = this.f25589a.f25572c;
            if (textView2 != null) {
                textView2.requestLayout();
            }
            View view = this.f25589a.f25576g;
            if (!(view == null || (layoutParams = view.getLayoutParams()) == null)) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = ((Integer) animatedValue2).intValue();
            }
            View view2 = this.f25589a.f25576g;
            if (view2 != null) {
                view2.requestLayout();
            }
        }
    }

    /* renamed from: a */
    public final void mo17507a(long j) {
        String string;
        TextView textView = this.f25574e;
        if (textView != null) {
            if (!this.f25585p) {
                Context context = getContext();
                C89219l.m154716b(context, "");
                string = context.getResources().getString(R.string.efi, ((IGiftService) C6193a.m13435a(IGiftService.class)).getAmountString(j));
            } else {
                Context context2 = getContext();
                C89219l.m154716b(context2, "");
                string = context2.getResources().getString(R.string.efj, ((IGiftService) C6193a.m13435a(IGiftService.class)).getAmountString(j));
            }
            textView.setText(string);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$l */
    static final class View$OnClickListenerC10606l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25601a;

        static {
            Covode.recordClassIndex(12195);
        }

        View$OnClickListenerC10606l(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25601a = onlineAudienceRankWidget;
        }

        public final void onClick(View view) {
            Object obj;
            EnumC10608a aVar;
            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f25601a;
            try {
                if (!onlineAudienceRankWidget.isViewValid) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (onlineAudienceRankWidget.dataChannel != null) {
                    AbstractC0952i iVar = (AbstractC0952i) onlineAudienceRankWidget.dataChannel.mo28318b(C9021ao.class);
                    if (iVar != null) {
                        C10376a.AbstractC10377a aVar2 = onlineAudienceRankWidget.f25570a;
                        int i = 0;
                        if (aVar2 == null || !aVar2.mo17258b()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        DataChannel dataChannel = onlineAudienceRankWidget.dataChannel;
                        C10357a aVar3 = null;
                        if (dataChannel != null) {
                            obj = dataChannel.mo28318b(C9119ed.class);
                        } else {
                            obj = null;
                        }
                        if (C89219l.m154714a(obj, (Object) true)) {
                            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                            if (room != null) {
                                long id = room.getId();
                                long ownerUserId = room.getOwnerUserId();
                                if (id > 0 && ownerUserId > 0) {
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("room_id", String.valueOf(id));
                                    linkedHashMap.put("anchor_id", String.valueOf(ownerUserId));
                                    C6501b.C6502a.m13948a("anchor_click_active_user_rank").mo12639a().mo12652a((Map<String, String>) linkedHashMap).mo12655b();
                                }
                            }
                            EnumC10608a aVar4 = EnumC10608a.BOTH_REVENUE;
                            C10376a.AbstractC10377a aVar5 = onlineAudienceRankWidget.f25570a;
                            if (aVar5 != null) {
                                i = aVar5.mo17260d();
                            }
                            aVar3 = C10357a.C10358a.m18851a(aVar4, i);
                        } else {
                            C10376a.AbstractC10377a aVar6 = onlineAudienceRankWidget.f25570a;
                            if (aVar6 != null) {
                                aVar = aVar6.mo17255a();
                            } else {
                                aVar = null;
                            }
                            if (aVar == EnumC10608a.BOTH_REVENUE) {
                                EnumC10608a aVar7 = EnumC10608a.BOTH_REVENUE;
                                C10376a.AbstractC10377a aVar8 = onlineAudienceRankWidget.f25570a;
                                if (aVar8 != null) {
                                    i = aVar8.mo17260d();
                                }
                                aVar3 = C10357a.C10358a.m18851a(aVar7, i);
                            }
                        }
                        onlineAudienceRankWidget.f25580k = aVar3;
                        C10357a aVar9 = onlineAudienceRankWidget.f25580k;
                        if (aVar9 != null) {
                            String name = iVar.getClass().getName();
                            C89219l.m154716b(name, "");
                            aVar9.show(iVar, name);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10378b
    /* renamed from: a */
    public final void mo17262a(int i) {
        Object obj;
        try {
            if (isViewValid()) {
                C10384a.m18892b(i);
                LinearLayout e = m19168e();
                C89219l.m154716b(e, "");
                int i2 = 0;
                e.setVisibility(0);
                LiveTextView f = m19169f();
                C89219l.m154716b(f, "");
                String a = C11207aa.m19863a((long) i);
                C89219l.m154716b(a, "");
                Locale locale = Locale.ENGLISH;
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
                String upperCase = a.toUpperCase(locale);
                C89219l.m154716b(upperCase, "");
                f.setText(upperCase);
                ImageView imageView = (ImageView) this.f25583n.getValue();
                C89219l.m154716b(imageView, "");
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    obj = dataChannel.mo28318b(C9119ed.class);
                } else {
                    obj = null;
                }
                if (C89219l.m154714a(obj, (Object) true) || (!(!C89219l.m154714a(this.dataChannel.mo28318b(C9076co.class), (Object) true)) && LiveAudienceAreaListSetting.INSTANCE.getValue())) {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        View view;
        try {
            if (this.dataChannel != null) {
                DataChannel dataChannel = this.dataChannel;
                C89219l.m154716b(dataChannel, "");
                C10392b bVar = new C10392b(dataChannel);
                this.f25570a = bVar;
                bVar.mo17256a(this);
                this.f25584o = false;
                this.f25575f = (LottieAnimationView) findViewById(R.id.tq);
                this.f25577h = (HSImageView) findViewById(R.id.d3y);
                LinearLayout e = m19168e();
                e.setVisibility(8);
                e.setOnClickListener(new View$OnClickListenerC10606l(this));
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    obj = dataChannel2.mo28318b(C9076co.class);
                } else {
                    obj = null;
                }
                if (C89219l.m154714a(obj, (Object) true)) {
                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.dol);
                    this.f25571b = recyclerView;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(8);
                        recyclerView.setClickable(false);
                    }
                }
                this.f25572c = (TextView) findViewById(R.id.d3u);
                this.f25573d = findViewById(R.id.d3x);
                this.f25574e = (TextView) findViewById(R.id.d3v);
                this.f25576g = findViewById(R.id.d3w);
                if (C3966y.m9672g() && (view = this.f25576g) != null) {
                    view.setBackground(C3966y.m9665c(2131234217));
                }
                this.f25586q.mo142945a(C6779a.m14563a().mo13052a(C10332a.class).mo143289d(new C10599f(this)));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget$f */
    static final class C10599f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ OnlineAudienceRankWidget f25593a;

        static {
            Covode.recordClassIndex(12188);
        }

        C10599f(OnlineAudienceRankWidget onlineAudienceRankWidget) {
            this.f25593a = onlineAudienceRankWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Context context;
            final C10332a aVar = (C10332a) obj;
            int i = aVar.f24988b;
            if (i == 1) {
                TextView textView = this.f25593a.f25572c;
                if (textView != null) {
                    textView.postDelayed(new Runnable(this) {
                        /* class com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget.C10599f.RunnableC106001 */

                        /* renamed from: a */
                        final /* synthetic */ C10599f f25594a;

                        static {
                            Covode.recordClassIndex(12189);
                        }

                        {
                            this.f25594a = r1;
                        }

                        public final void run() {
                            Context context;
                            Context context2;
                            Context context3;
                            Context context4;
                            OnlineAudienceRankWidget onlineAudienceRankWidget = this.f25594a.f25593a;
                            C10332a aVar = aVar;
                            C89219l.m154716b(aVar, "");
                            HSImageView hSImageView = onlineAudienceRankWidget.f25577h;
                            if (hSImageView != null) {
                                C3941k.m9607a(hSImageView, "tiktok_live_basic_resource", aVar.f24987a);
                            }
                            HSImageView hSImageView2 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView2 != null) {
                                hSImageView2.setVisibility(0);
                            }
                            AnimatorSet animatorSet = new AnimatorSet();
                            HSImageView hSImageView3 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView3 == null) {
                                C89219l.m154715b();
                            }
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hSImageView3, "Alpha", 0.0f, 1.0f);
                            C89219l.m154716b(ofFloat, "");
                            ofFloat.setDuration(200L);
                            ofFloat.setInterpolator(onlineAudienceRankWidget.f25579j);
                            HSImageView hSImageView4 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView4 == null) {
                                C89219l.m154715b();
                            }
                            float[] fArr = new float[2];
                            HSImageView hSImageView5 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView5 != null) {
                                context = hSImageView5.getContext();
                            } else {
                                context = null;
                            }
                            fArr[0] = C11227ap.m19885a(context, 160.0f);
                            HSImageView hSImageView6 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView6 != null) {
                                context2 = hSImageView6.getContext();
                            } else {
                                context2 = null;
                            }
                            fArr[1] = C11227ap.m19885a(context2, 160.0f);
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hSImageView4, "TranslationY", fArr);
                            C89219l.m154716b(ofFloat2, "");
                            ofFloat2.setDuration(200L);
                            ofFloat2.setInterpolator(onlineAudienceRankWidget.f25579j);
                            HSImageView hSImageView7 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView7 == null) {
                                C89219l.m154715b();
                            }
                            float[] fArr2 = new float[2];
                            float f = (float) onlineAudienceRankWidget.f25578i;
                            HSImageView hSImageView8 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView8 != null) {
                                context3 = hSImageView8.getContext();
                            } else {
                                context3 = null;
                            }
                            fArr2[0] = f * C11227ap.m19885a(context3, 150.0f);
                            float f2 = (float) (onlineAudienceRankWidget.f25578i * -1);
                            HSImageView hSImageView9 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView9 != null) {
                                context4 = hSImageView9.getContext();
                            } else {
                                context4 = null;
                            }
                            fArr2[1] = f2 * C11227ap.m19885a(context4, 25.0f);
                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(hSImageView7, "TranslationX", fArr2);
                            C89219l.m154716b(ofFloat3, "");
                            ofFloat3.setDuration(200L);
                            ofFloat3.setInterpolator(onlineAudienceRankWidget.f25579j);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            AnimatorSet animatorSet3 = new AnimatorSet();
                            AnimatorSet animatorSet4 = new AnimatorSet();
                            HSImageView hSImageView10 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView10 == null) {
                                C89219l.m154715b();
                            }
                            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(hSImageView10, "ScaleX", 6.0f, 6.0f);
                            C89219l.m154716b(ofFloat4, "");
                            ofFloat4.setDuration(80L);
                            ofFloat4.setInterpolator(onlineAudienceRankWidget.f25579j);
                            HSImageView hSImageView11 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView11 == null) {
                                C89219l.m154715b();
                            }
                            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(hSImageView11, "ScaleX", 6.0f, 6.0f);
                            C89219l.m154716b(ofFloat5, "");
                            ofFloat5.setDuration(80L);
                            ofFloat5.setInterpolator(onlineAudienceRankWidget.f25579j);
                            HSImageView hSImageView12 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView12 == null) {
                                C89219l.m154715b();
                            }
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(hSImageView12, "ScaleX", 6.0f, 4.0f);
                            C89219l.m154716b(ofFloat6, "");
                            ofFloat6.setDuration(120L);
                            ofFloat6.setInterpolator(onlineAudienceRankWidget.f25579j);
                            HSImageView hSImageView13 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView13 == null) {
                                C89219l.m154715b();
                            }
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(hSImageView13, "ScaleY", 6.0f, 4.0f);
                            C89219l.m154716b(ofFloat7, "");
                            ofFloat7.setDuration(120L);
                            ofFloat7.setInterpolator(onlineAudienceRankWidget.f25579j);
                            animatorSet4.playTogether(ofFloat6, ofFloat7);
                            animatorSet3.playTogether(ofFloat4, ofFloat5);
                            animatorSet2.playSequentially(animatorSet3, animatorSet4);
                            HSImageView hSImageView14 = onlineAudienceRankWidget.f25577h;
                            if (hSImageView14 != null) {
                                hSImageView14.setVisibility(0);
                            }
                            animatorSet.playTogether(ofFloat, animatorSet2, ofFloat2, ofFloat3);
                            animatorSet.addListener(new C10597e(onlineAudienceRankWidget));
                            animatorSet.start();
                        }
                    }, 1000);
                }
            } else if (i == 2) {
                this.f25593a.mo17507a(aVar.f24989c);
            } else if (i == 3) {
                OnlineAudienceRankWidget onlineAudienceRankWidget = this.f25593a;
                if (onlineAudienceRankWidget.f25576g != null && onlineAudienceRankWidget.f25574e != null && onlineAudienceRankWidget.f25573d != null) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    View view = onlineAudienceRankWidget.f25576g;
                    if (view == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "Alpha", 1.0f, 0.2f);
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(240L);
                    ofFloat.setInterpolator(onlineAudienceRankWidget.f25579j);
                    View view2 = onlineAudienceRankWidget.f25576g;
                    if (view2 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "Alpha", 0.2f, 1.0f);
                    C89219l.m154716b(ofFloat2, "");
                    ofFloat2.setDuration(80L);
                    ofFloat2.setInterpolator(onlineAudienceRankWidget.f25579j);
                    View view3 = onlineAudienceRankWidget.f25576g;
                    if (view3 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "Alpha", 1.0f, 0.2f);
                    C89219l.m154716b(ofFloat3, "");
                    ofFloat3.setDuration(240L);
                    ofFloat3.setInterpolator(onlineAudienceRankWidget.f25579j);
                    View view4 = onlineAudienceRankWidget.f25576g;
                    if (view4 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view4, "Alpha", 0.2f, 1.0f);
                    C89219l.m154716b(ofFloat4, "");
                    ofFloat4.setDuration(80L);
                    ofFloat4.setInterpolator(onlineAudienceRankWidget.f25579j);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    View view5 = onlineAudienceRankWidget.f25576g;
                    if (view5 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view5, "Alpha", 1.0f, 0.0f);
                    C89219l.m154716b(ofFloat5, "");
                    ofFloat5.setDuration(80L);
                    ofFloat5.setInterpolator(onlineAudienceRankWidget.f25579j);
                    TextView textView2 = onlineAudienceRankWidget.f25574e;
                    if (textView2 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(textView2, "Alpha", 1.0f, 0.0f);
                    C89219l.m154716b(ofFloat6, "");
                    ofFloat6.setDuration(80L);
                    ofFloat6.setInterpolator(onlineAudienceRankWidget.f25579j);
                    ofFloat6.addListener(new C10593a(onlineAudienceRankWidget));
                    View view6 = onlineAudienceRankWidget.f25573d;
                    if (view6 == null) {
                        C89219l.m154715b();
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view6, "Alpha", 1.0f, 0.0f);
                    C89219l.m154716b(ofFloat7, "");
                    ofFloat7.setDuration(80L);
                    ofFloat7.setInterpolator(onlineAudienceRankWidget.f25579j);
                    int[] iArr = new int[2];
                    TextView textView3 = onlineAudienceRankWidget.f25572c;
                    if (textView3 != null) {
                        context = textView3.getContext();
                    } else {
                        context = null;
                    }
                    iArr[0] = (int) C11227ap.m19885a(context, 54.0f);
                    iArr[1] = 0;
                    ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(80L);
                    duration.addUpdateListener(new C10594b(onlineAudienceRankWidget));
                    C89219l.m154716b(duration, "");
                    duration.setInterpolator(onlineAudienceRankWidget.f25579j);
                    animatorSet2.playTogether(ofFloat5, ofFloat6, ofFloat7, duration);
                    animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4, animatorSet2);
                    animatorSet.start();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.rank.impl.p609b.C10376a.AbstractC10378b
    /* renamed from: a */
    public final void mo17263a(List<C10347a> list) {
        RecyclerView.AbstractC1350a aVar;
        C89219l.m154721d(list, "");
        C10607m mVar = new C10607m(this);
        try {
            if (!isViewValid()) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (this.context != null) {
                if (!this.f25584o) {
                    mVar.mo17533a();
                    RecyclerView recyclerView = this.f25571b;
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        recyclerView.setClickable(true);
                    }
                    this.f25584o = true;
                }
                RecyclerView recyclerView2 = this.f25571b;
                C89399f fVar = null;
                if (recyclerView2 != null) {
                    aVar = recyclerView2.getAdapter();
                } else {
                    aVar = null;
                }
                if (aVar instanceof C89399f) {
                    fVar = aVar;
                }
                C89399f fVar2 = fVar;
                if (fVar2 != null) {
                    fVar2.mo17153a(list);
                    fVar2.notifyDataSetChanged();
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }
}
