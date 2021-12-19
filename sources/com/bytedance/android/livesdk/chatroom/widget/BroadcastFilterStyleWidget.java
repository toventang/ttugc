package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.p048g.p049a.p050a.C0996c;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class BroadcastFilterStyleWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: g */
    public static final C8124a f20143g = new C8124a((byte) 0);

    /* renamed from: a */
    public View f20144a;

    /* renamed from: b */
    public View f20145b;

    /* renamed from: c */
    public View f20146c;

    /* renamed from: d */
    public LiveTextView f20147d;

    /* renamed from: e */
    public final AbstractC89244h f20148e = C11831d.m20835a(new C8127d(this));

    /* renamed from: f */
    public final AbstractC89244h f20149f = C11831d.m20835a(new C8128e(this));

    /* renamed from: h */
    private int f20150h;

    static {
        Covode.recordClassIndex(8933);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b4q;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget$a */
    public static final class C8124a {
        static {
            Covode.recordClassIndex(8934);
        }

        private C8124a() {
        }

        public /* synthetic */ C8124a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget$d */
    static final class C8127d extends AbstractC89220m implements AbstractC89171a<AnimationSet> {

        /* renamed from: a */
        final /* synthetic */ BroadcastFilterStyleWidget f20159a;

        static {
            Covode.recordClassIndex(8937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8127d(BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
            super(0);
            this.f20159a = broadcastFilterStyleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimationSet invoke() {
            return this.f20159a.mo14350a(true);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget$e */
    static final class C8128e extends AbstractC89220m implements AbstractC89171a<AnimationSet> {

        /* renamed from: a */
        final /* synthetic */ BroadcastFilterStyleWidget f20160a;

        static {
            Covode.recordClassIndex(8938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8128e(BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
            super(0);
            this.f20160a = broadcastFilterStyleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimationSet invoke() {
            return this.f20160a.mo14350a(false);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        View view = this.f20146c;
        if (view == null) {
            C89219l.m154710a("filterStyle");
        }
        view.clearAnimation();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        View findViewById = findViewById(R.id.ff9);
        C89219l.m154716b(findViewById, "");
        this.f20144a = findViewById;
        View findViewById2 = findViewById(R.id.ff_);
        C89219l.m154716b(findViewById2, "");
        this.f20145b = findViewById2;
        View view = getView();
        if (view != null) {
            this.f20146c = view;
            View findViewById3 = findViewById(R.id.b27);
            C89219l.m154716b(findViewById3, "");
            this.f20147d = (LiveTextView) findViewById3;
            this.f20150h = C3966y.m9664c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget$b  reason: invalid class name */
    public static final class animationAnimation$AnimationListenerC8125b implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ BroadcastFilterStyleWidget f20151a;

        /* renamed from: b */
        final /* synthetic */ AlphaAnimation f20152b;

        /* renamed from: c */
        final /* synthetic */ TranslateAnimation f20153c;

        /* renamed from: d */
        final /* synthetic */ TranslateAnimation f20154d;

        /* renamed from: e */
        final /* synthetic */ AlphaAnimation f20155e;

        /* renamed from: f */
        final /* synthetic */ TranslateAnimation f20156f;

        static {
            Covode.recordClassIndex(8935);
        }

        public final void onAnimationRepeat(Animation animation) {
            C89219l.m154721d(animation, "");
        }

        public final void onAnimationEnd(Animation animation) {
            C89219l.m154721d(animation, "");
            BroadcastFilterStyleWidget.m16258a(this.f20151a).setVisibility(4);
        }

        public final void onAnimationStart(Animation animation) {
            C89219l.m154721d(animation, "");
            BroadcastFilterStyleWidget.m16258a(this.f20151a).setVisibility(0);
        }

        animationAnimation$AnimationListenerC8125b(BroadcastFilterStyleWidget broadcastFilterStyleWidget, AlphaAnimation alphaAnimation, TranslateAnimation translateAnimation, TranslateAnimation translateAnimation2, AlphaAnimation alphaAnimation2, TranslateAnimation translateAnimation3) {
            this.f20151a = broadcastFilterStyleWidget;
            this.f20152b = alphaAnimation;
            this.f20153c = translateAnimation;
            this.f20154d = translateAnimation2;
            this.f20155e = alphaAnimation2;
            this.f20156f = translateAnimation3;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m16258a(BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
        View view = broadcastFilterStyleWidget.f20146c;
        if (view == null) {
            C89219l.m154710a("filterStyle");
        }
        return view;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.BroadcastFilterStyleWidget$c */
    public static final class View$OnClickListenerC8126c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f20157a;

        /* renamed from: b */
        final /* synthetic */ BroadcastFilterStyleWidget f20158b;

        static {
            Covode.recordClassIndex(8936);
        }

        public View$OnClickListenerC8126c(View view, BroadcastFilterStyleWidget broadcastFilterStyleWidget) {
            this.f20157a = view;
            this.f20158b = broadcastFilterStyleWidget;
        }

        public final void onClick(View view) {
            this.f20157a.setVisibility(8);
            this.f20157a.setClickable(false);
            View view2 = this.f20158b.f20144a;
            if (view2 == null) {
                C89219l.m154710a("filterArrow1");
            }
            view2.setVisibility(8);
            View view3 = this.f20158b.f20145b;
            if (view3 == null) {
                C89219l.m154710a("filterArrow2");
            }
            view3.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final AnimationSet mo14350a(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        LiveTextView liveTextView = this.f20147d;
        if (liveTextView == null) {
            C89219l.m154710a("filterStyleText");
        }
        int width = (this.f20150h - liveTextView.getWidth()) / 2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C0996c());
        alphaAnimation.setDuration(300);
        if (z) {
            f = (float) (-width);
        } else {
            f = (float) width;
        }
        float f6 = -50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C0996c());
        translateAnimation.setDuration(300);
        if (z) {
            f3 = -50.0f;
            f4 = 50.0f;
        } else {
            f3 = 50.0f;
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new C0995b());
        alphaAnimation2.setDuration(300);
        if (z) {
            f6 = 50.0f;
            f5 = (float) width;
        } else {
            f5 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new C0995b());
        translateAnimation3.setDuration(300);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new animationAnimation$AnimationListenerC8125b(this, alphaAnimation, translateAnimation, translateAnimation2, alphaAnimation2, translateAnimation3));
        return animationSet;
    }
}
