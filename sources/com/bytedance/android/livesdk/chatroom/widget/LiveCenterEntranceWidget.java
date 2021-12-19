package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p379n.C5785q;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftBoostAnchorCenterSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p476c.C7251b;
import com.bytedance.android.livesdk.p561j.C9048bn;
import com.bytedance.android.livesdk.p561j.C9049bo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveCenterEntranceWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    final int f20174a = 1;

    /* renamed from: b */
    final int f20175b = 2;

    /* renamed from: c */
    final int f20176c = 3;

    /* renamed from: d */
    public LiveTextView f20177d;

    /* renamed from: e */
    public long f20178e;

    /* renamed from: f */
    View f20179f;

    /* renamed from: g */
    ImageView f20180g;

    /* renamed from: h */
    public ImageView f20181h;

    /* renamed from: i */
    public LiveTextView f20182i;

    /* renamed from: j */
    View f20183j;

    /* renamed from: k */
    int f20184k;

    /* renamed from: l */
    public LiveTextView f20185l;

    /* renamed from: m */
    public C7251b f20186m;

    /* renamed from: n */
    private final C88411a f20187n = new C88411a();

    static {
        Covode.recordClassIndex(8950);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b4r;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.f20187n.mo142944a();
    }

    public LiveCenterEntranceWidget() {
        int i = 1;
        this.f20184k = C3966y.m9672g() ? -1 : i;
        this.f20186m = new C7251b();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$e */
    public static final class C8142e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LiveCenterEntranceWidget f20192a;

        static {
            Covode.recordClassIndex(8955);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$e$a */
        static final class RunnableC8143a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C8142e f20193a;

            static {
                Covode.recordClassIndex(8956);
            }

            RunnableC8143a(C8142e eVar) {
                this.f20193a = eVar;
            }

            public final void run() {
                LiveCenterEntranceWidget liveCenterEntranceWidget = this.f20193a.f20192a;
                AnimatorSet animatorSet = new AnimatorSet();
                ImageView imageView = liveCenterEntranceWidget.f20180g;
                if (imageView == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "Alpha", 0.0f, 1.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(120L);
                ofFloat.setInterpolator(liveCenterEntranceWidget.f20186m);
                View view = liveCenterEntranceWidget.f20179f;
                if (view == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "Alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.setDuration(120L);
                ofFloat2.setInterpolator(liveCenterEntranceWidget.f20186m);
                LiveTextView liveTextView = liveCenterEntranceWidget.f20177d;
                if (liveTextView == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(liveTextView, "Alpha", 0.0f, 1.0f);
                C89219l.m154716b(ofFloat3, "");
                ofFloat3.setDuration(120L);
                ofFloat3.setInterpolator(liveCenterEntranceWidget.f20186m);
                LiveTextView liveTextView2 = liveCenterEntranceWidget.f20182i;
                if (liveTextView2 == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(liveTextView2, "Alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat4, "");
                ofFloat4.setDuration(120L);
                ofFloat4.setInterpolator(liveCenterEntranceWidget.f20186m);
                LiveTextView liveTextView3 = liveCenterEntranceWidget.f20185l;
                if (liveTextView3 == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveTextView3, "Alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat5, "");
                ofFloat5.setDuration(120L);
                ofFloat5.setInterpolator(liveCenterEntranceWidget.f20186m);
                ImageView imageView2 = liveCenterEntranceWidget.f20181h;
                if (imageView2 == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView2, "Alpha", 1.0f, 0.0f);
                C89219l.m154716b(ofFloat6, "");
                ofFloat6.setDuration(120L);
                ofFloat6.setInterpolator(liveCenterEntranceWidget.f20186m);
                View view2 = liveCenterEntranceWidget.f20183j;
                if (view2 == null) {
                    C89219l.m154715b();
                }
                ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view2, "Alpha", 0.0f, 1.0f);
                C89219l.m154716b(ofFloat7, "");
                ofFloat7.setDuration(480L);
                animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat6, ofFloat7, ofFloat5);
                animatorSet.addListener(new C8138a(liveCenterEntranceWidget));
                animatorSet.start();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8142e(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f20192a = liveCenterEntranceWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            LiveTextView liveTextView = this.f20192a.f20182i;
            if (liveTextView == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(liveTextView, "Alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(120L);
            ofFloat.setInterpolator(this.f20192a.f20186m);
            ofFloat.start();
            LiveTextView liveTextView2 = this.f20192a.f20185l;
            if (liveTextView2 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(liveTextView2, "Alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat2, "");
            ofFloat2.setDuration(120L);
            ofFloat2.setInterpolator(this.f20192a.f20186m);
            ofFloat2.start();
            ImageView imageView = this.f20192a.f20181h;
            if (imageView == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView, "ScaleY", 1.6f, 1.0f);
            C89219l.m154716b(ofFloat3, "");
            ofFloat3.setDuration(120L);
            ofFloat3.setInterpolator(this.f20192a.f20186m);
            ofFloat3.start();
            ImageView imageView2 = this.f20192a.f20181h;
            if (imageView2 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "ScaleX", 1.6f, 1.0f);
            C89219l.m154716b(ofFloat4, "");
            ofFloat4.setDuration(120L);
            ofFloat4.setInterpolator(this.f20192a.f20186m);
            ofFloat4.start();
            View view = this.f20192a.getView();
            if (view != null) {
                view.postDelayed(new RunnableC8143a(this), 2120);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.dataChannel.mo28319c(C9048bn.class);
        C6501b.C6502a.m13948a("livesdk_live_center_icon").mo12639a().mo12661f("show").mo12655b();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC8139b(this));
        }
        this.f20183j = findViewById(R.id.px);
        this.f20178e = System.currentTimeMillis();
        this.f20177d = (LiveTextView) findViewById(R.id.w1);
        this.f20180g = (ImageView) findViewById(R.id.e7d);
        this.f20179f = findViewById(R.id.a81);
        this.f20181h = (ImageView) findViewById(R.id.tp);
        this.f20182i = (LiveTextView) findViewById(R.id.tr);
        this.f20185l = (LiveTextView) findViewById(R.id.ts);
        if (LiveGiftBoostAnchorCenterSetting.INSTANCE.getValue()) {
            this.f20187n.mo142945a(AbstractC88979t.m154284a(1, TimeUnit.SECONDS).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8144f(this)));
        } else {
            LiveTextView liveTextView = this.f20177d;
            if (liveTextView != null) {
                Context context = this.context;
                C89219l.m154716b(context, "");
                liveTextView.setBackground(context.getResources().getDrawable(2131234640));
                ViewGroup.LayoutParams layoutParams = liveTextView.getLayoutParams();
                layoutParams.height = C3966y.m9653a(16.0f);
                layoutParams.width = C3966y.m9653a(16.0f);
                liveTextView.setLayoutParams(layoutParams);
            }
        }
        if (C6229a.m13521a(this.context)) {
            View findViewById = findViewById(R.id.px);
            C89219l.m154716b(findViewById, "");
            findViewById.setBackground(C3966y.m9665c(R.drawable.c10));
            View findViewById2 = findViewById(R.id.a81);
            C89219l.m154716b(findViewById2, "");
            findViewById2.setBackground(C3966y.m9665c(R.drawable.boz));
        }
        this.f20187n.mo142945a(C6779a.m14563a().mo13052a(C8184l.class).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8140c(this)));
        this.f20187n.mo142945a(C6779a.m14563a().mo13052a(C5785q.class).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C8141d(this)));
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$a */
    public static final class C8138a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ LiveCenterEntranceWidget f20188a;

        static {
            Covode.recordClassIndex(8951);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C8138a(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f20188a = liveCenterEntranceWidget;
        }

        public final void onAnimationStart(Animator animator) {
            ImageView imageView = this.f20188a.f20181h;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            LiveTextView liveTextView = this.f20188a.f20182i;
            if (liveTextView != null) {
                liveTextView.setVisibility(8);
            }
            LiveTextView liveTextView2 = this.f20188a.f20185l;
            if (liveTextView2 != null) {
                liveTextView2.setVisibility(8);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$b */
    static final class View$OnClickListenerC8139b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveCenterEntranceWidget f20189a;

        static {
            Covode.recordClassIndex(8952);
        }

        View$OnClickListenerC8139b(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f20189a = liveCenterEntranceWidget;
        }

        public final void onClick(View view) {
            this.f20189a.dataChannel.mo28319c(C9049bo.class);
            C6501b.C6502a.m13948a("livesdk_live_center_icon").mo12639a().mo12661f("click").mo12655b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$c */
    static final class C8140c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveCenterEntranceWidget f20190a;

        static {
            Covode.recordClassIndex(8953);
        }

        C8140c(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f20190a = liveCenterEntranceWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ImageView imageView;
            LiveCenterEntranceWidget liveCenterEntranceWidget = this.f20190a;
            int i = ((C8184l) obj).f20309a;
            if (i == liveCenterEntranceWidget.f20174a) {
                ImageView imageView2 = liveCenterEntranceWidget.f20180g;
                if (imageView2 != null) {
                    imageView2.setImageResource(2131234582);
                }
            } else if (i == liveCenterEntranceWidget.f20175b) {
                ImageView imageView3 = liveCenterEntranceWidget.f20180g;
                if (imageView3 != null) {
                    imageView3.setImageResource(2131234581);
                }
            } else if (i == liveCenterEntranceWidget.f20176c && (imageView = liveCenterEntranceWidget.f20180g) != null) {
                imageView.setImageResource(2131234583);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$f */
    static final class C8144f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveCenterEntranceWidget f20194a;

        static {
            Covode.recordClassIndex(8957);
        }

        C8144f(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f20194a = liveCenterEntranceWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            long currentTimeMillis = (System.currentTimeMillis() - this.f20194a.f20178e) / 1000;
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            } else if (currentTimeMillis > 6000) {
                currentTimeMillis = 6000;
            }
            long j = currentTimeMillis / 60;
            long j2 = currentTimeMillis % 60;
            StringBuffer stringBuffer = new StringBuffer();
            if (String.valueOf(j).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j);
            stringBuffer.append(":");
            if (String.valueOf(j2).length() < 2) {
                stringBuffer.append("0");
            }
            stringBuffer.append(j2);
            LiveTextView liveTextView = this.f20194a.f20177d;
            if (liveTextView != null) {
                liveTextView.setText(stringBuffer.toString());
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.LiveCenterEntranceWidget$d */
    static final class C8141d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ LiveCenterEntranceWidget f20191a;

        static {
            Covode.recordClassIndex(8954);
        }

        C8141d(LiveCenterEntranceWidget liveCenterEntranceWidget) {
            this.f20191a = liveCenterEntranceWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String string;
            String concat;
            C5785q qVar = (C5785q) obj;
            LiveTextView liveTextView = this.f20191a.f20185l;
            if (liveTextView != null) {
                liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41568b), 2);
            }
            if (!C3966y.m9672g()) {
                Context context = this.f20191a.context;
                C89219l.m154716b(context, "");
                string = context.getResources().getString(R.string.edy, String.valueOf(qVar.f14637a));
            } else {
                Context context2 = this.f20191a.context;
                C89219l.m154716b(context2, "");
                string = context2.getResources().getString(R.string.edz, String.valueOf(qVar.f14637a));
            }
            C89219l.m154716b(string, "");
            LiveTextView liveTextView2 = this.f20191a.f20185l;
            if (liveTextView2 != null) {
                if (!C3966y.m9672g()) {
                    concat = string + ' ';
                } else {
                    concat = " ".concat(String.valueOf(string));
                }
                liveTextView2.setText(concat);
            }
            LiveCenterEntranceWidget liveCenterEntranceWidget = this.f20191a;
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet animatorSet2 = new AnimatorSet();
            ImageView imageView = liveCenterEntranceWidget.f20181h;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            LiveTextView liveTextView3 = liveCenterEntranceWidget.f20182i;
            if (liveTextView3 != null) {
                liveTextView3.setVisibility(0);
            }
            LiveTextView liveTextView4 = liveCenterEntranceWidget.f20185l;
            if (liveTextView4 != null) {
                liveTextView4.setVisibility(0);
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            ImageView imageView2 = liveCenterEntranceWidget.f20180g;
            if (imageView2 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, "Alpha", 1.0f, 0.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(280L);
            ofFloat.setInterpolator(liveCenterEntranceWidget.f20186m);
            View view = liveCenterEntranceWidget.f20183j;
            if (view == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "Alpha", 1.0f, 0.0f);
            C89219l.m154716b(ofFloat2, "");
            ofFloat2.setDuration(280L);
            ofFloat2.setInterpolator(liveCenterEntranceWidget.f20186m);
            View view2 = liveCenterEntranceWidget.f20179f;
            if (view2 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "Alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat3, "");
            ofFloat3.setDuration(280L);
            ofFloat3.setInterpolator(liveCenterEntranceWidget.f20186m);
            View view3 = liveCenterEntranceWidget.f20179f;
            if (view3 == null) {
                C89219l.m154715b();
            }
            float measuredWidth = (float) view3.getMeasuredWidth();
            View view4 = liveCenterEntranceWidget.f20179f;
            if (view4 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view4, "TranslationX", ((float) liveCenterEntranceWidget.f20184k) * measuredWidth, 0.0f);
            C89219l.m154716b(ofFloat4, "");
            ofFloat4.setDuration(280L);
            ofFloat4.setInterpolator(liveCenterEntranceWidget.f20186m);
            LiveTextView liveTextView5 = liveCenterEntranceWidget.f20177d;
            if (liveTextView5 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(liveTextView5, "Alpha", 1.0f, 0.0f);
            C89219l.m154716b(ofFloat5, "");
            ofFloat5.setDuration(280L);
            ofFloat5.setInterpolator(liveCenterEntranceWidget.f20186m);
            animatorSet3.playTogether(ofFloat, ofFloat3, ofFloat4, ofFloat5, ofFloat2);
            ImageView imageView3 = liveCenterEntranceWidget.f20181h;
            if (imageView3 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView3, "Alpha", 0.0f, 1.0f);
            C89219l.m154716b(ofFloat6, "");
            ofFloat6.setDuration(120L);
            ofFloat6.setInterpolator(liveCenterEntranceWidget.f20186m);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
            C89219l.m154716b(ofInt, "");
            ofInt.setDuration(160L);
            ofInt.setInterpolator(liveCenterEntranceWidget.f20186m);
            animatorSet2.playSequentially(ofInt, ofFloat6);
            animatorSet2.start();
            AnimatorSet animatorSet4 = new AnimatorSet();
            ImageView imageView4 = liveCenterEntranceWidget.f20181h;
            if (imageView4 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(imageView4, "ScaleX", 1.0f, 1.5f);
            C89219l.m154716b(ofFloat7, "");
            ofFloat7.setDuration(120L);
            ofFloat7.setInterpolator(liveCenterEntranceWidget.f20186m);
            ImageView imageView5 = liveCenterEntranceWidget.f20181h;
            if (imageView5 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(imageView5, "ScaleY", 1.0f, 1.5f);
            C89219l.m154716b(ofFloat8, "");
            ofFloat8.setDuration(120L);
            ofFloat8.setInterpolator(liveCenterEntranceWidget.f20186m);
            animatorSet4.playTogether(ofFloat7, ofFloat8);
            AnimatorSet animatorSet5 = new AnimatorSet();
            ImageView imageView6 = liveCenterEntranceWidget.f20181h;
            if (imageView6 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(imageView6, "ScaleX", 1.5f, 1.6f);
            C89219l.m154716b(ofFloat9, "");
            ofFloat9.setDuration(120L);
            ofFloat9.setInterpolator(liveCenterEntranceWidget.f20186m);
            ImageView imageView7 = liveCenterEntranceWidget.f20181h;
            if (imageView7 == null) {
                C89219l.m154715b();
            }
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(imageView7, "ScaleY", 1.6f, 1.5f);
            C89219l.m154716b(ofFloat10, "");
            ofFloat10.setDuration(120L);
            ofFloat10.setInterpolator(liveCenterEntranceWidget.f20186m);
            animatorSet5.playTogether(ofFloat9, ofFloat10);
            animatorSet5.addListener(new C8142e(liveCenterEntranceWidget));
            animatorSet.playSequentially(animatorSet3, animatorSet4, animatorSet5);
            animatorSet.start();
        }
    }
}
