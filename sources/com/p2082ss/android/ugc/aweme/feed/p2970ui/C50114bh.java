package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bh */
public final class C50114bh {

    /* renamed from: a */
    static final IQAInvitationService f115686a;

    /* renamed from: b */
    public static boolean f115687b;

    /* renamed from: c */
    public static final C50114bh f115688c = new C50114bh();

    private C50114bh() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bh$c */
    public static final class RunnableC50117c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f115691a;

        static {
            Covode.recordClassIndex(59243);
        }

        RunnableC50117c(LinearLayout linearLayout) {
            this.f115691a = linearLayout;
        }

        public final void run() {
            this.f115691a.setVisibility(0);
        }
    }

    static {
        Covode.recordClassIndex(59240);
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        f115686a = b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bh$b */
    public static final class RunnableC50116b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f115690a;

        static {
            Covode.recordClassIndex(59242);
        }

        RunnableC50116b(LinearLayout linearLayout) {
            this.f115690a = linearLayout;
        }

        public final void run() {
            this.f115690a.setVisibility(0);
            LinearLayout linearLayout = this.f115690a;
            AnimatorSet animatorSet = new AnimatorSet();
            if (linearLayout != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 36.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setDuration(250L);
                ofFloat.addUpdateListener(new C50115a(linearLayout));
                animatorSet.play(ofFloat);
                animatorSet.start();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bh$a */
    static final class C50115a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f115689a;

        static {
            Covode.recordClassIndex(59241);
        }

        C50115a(View view) {
            this.f115689a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f115689a.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
            this.f115689a.setLayoutParams(layoutParams);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.ui.bh$d */
    public static final class View$OnClickListenerC50118d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f115692a;

        /* renamed from: b */
        final /* synthetic */ String f115693b;

        /* renamed from: c */
        final /* synthetic */ QaStruct f115694c;

        static {
            Covode.recordClassIndex(59244);
        }

        View$OnClickListenerC50118d(Fragment fragment, String str, QaStruct qaStruct) {
            this.f115692a = fragment;
            this.f115693b = str;
            this.f115694c = qaStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IQAInvitationService iQAInvitationService = C50114bh.f115686a;
            ActivityC0945e requireActivity = this.f115692a.requireActivity();
            String str = "";
            C89219l.m154716b(requireActivity, str);
            String str2 = this.f115693b;
            if (str2 != null) {
                str = str2;
            }
            IQAInvitationService.C65856a.m117785a(iQAInvitationService, requireActivity, "post_qa_video", str, EnumC65848e.VIDEO, Long.valueOf(this.f115694c.getQuestionId()), Long.valueOf(this.f115694c.getUserId()), C501191.f115695a, 64);
        }
    }

    /* renamed from: a */
    public static void m94070a(Fragment fragment, Aweme aweme, LinearLayout linearLayout, String str, boolean z) {
        String str2;
        List<InteractStickerStruct> interactStickerStructs;
        QaStruct qaStruct;
        if (fragment != null && fragment.isVisible() && !fragment.isDetached() && fragment.getContext() != null && linearLayout != null) {
            linearLayout.setVisibility(8);
            if (!f115687b) {
                if (!z) {
                    f115687b = false;
                }
                T t = null;
                if (aweme != null) {
                    str2 = aweme.getAuthorUid();
                } else {
                    str2 = null;
                }
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!(!C89219l.m154714a((Object) str2, (Object) g.getCurUserId())) && aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
                    Iterator<T> it = interactStickerStructs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        T t2 = next;
                        C89219l.m154716b(t2, "");
                        if (t2.getType() == 17) {
                            t = next;
                            break;
                        }
                    }
                    T t3 = t;
                    if (t3 != null && (qaStruct = t3.getQaStruct()) != null && !(!C89219l.m154714a((Object) String.valueOf(qaStruct.getItemId()), (Object) aweme.getAid()))) {
                        if (z) {
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC50116b(linearLayout), 4500);
                        } else {
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC50117c(linearLayout), 500);
                        }
                        linearLayout.setOnClickListener(new View$OnClickListenerC50118d(fragment, str, qaStruct));
                    }
                }
            }
        }
    }
}
