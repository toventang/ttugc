package com.p2082ss.android.ugc.aweme.feed.share;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.adapter.C48201bd;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49670ae;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56259l;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56261n;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: com.ss.android.ugc.aweme.feed.share.a */
public final class C49914a {

    /* renamed from: a */
    public static ValueAnimator f115060a;

    /* renamed from: b */
    static WeakReference<Object> f115061b;

    /* renamed from: c */
    public static final C49914a f115062c = new C49914a();

    private C49914a() {
    }

    /* renamed from: a */
    public final void mo84962a(C56259l lVar, C48201bd bdVar) {
        C89219l.m154721d(lVar, "");
        if (bdVar != null) {
            m93728e(bdVar);
            ValueAnimator valueAnimator = f115060a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            View view = bdVar.f111674b;
            if (view != null) {
                view.setOnClickListener(null);
            }
            m93722a(lVar, bdVar, (AbstractC49928b) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$c */
    public static final class C49917c implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f115066a;

        static {
            Covode.recordClassIndex(59028);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.feed.share.C49914a.C49917c.C499181 */

                /* renamed from: a */
                public int f115067a;

                /* renamed from: b */
                final /* synthetic */ C49917c f115068b;

                static {
                    Covode.recordClassIndex(59029);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f115067a < this.f115068b.f115066a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f115068b.f115066a;
                    int i = this.f115067a;
                    this.f115067a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f115068b = r1;
                }
            };
        }

        public C49917c(ViewGroup viewGroup) {
            this.f115066a = viewGroup;
        }
    }

    static {
        Covode.recordClassIndex(59025);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$d */
    public static final class C49919d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C48201bd f115069a;

        static {
            Covode.recordClassIndex(59030);
        }

        C49919d(C48201bd bdVar) {
            this.f115069a = bdVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C49914a.m93727d(this.f115069a);
        }
    }

    /* renamed from: a */
    public static void m93717a(C48201bd bdVar) {
        if (bdVar != null) {
            m93718a(bdVar, (AnimatorListenerAdapter) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$e */
    public static final class C49920e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C56257j f115070a;

        /* renamed from: b */
        final /* synthetic */ C48201bd f115071b;

        /* renamed from: c */
        final /* synthetic */ AbstractC49928b f115072c = null;

        static {
            Covode.recordClassIndex(59031);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C49914a.f115062c.mo84961a(this.f115070a, this.f115071b, this.f115072c);
        }

        C49920e(C56257j jVar, C48201bd bdVar) {
            this.f115070a = jVar;
            this.f115071b = bdVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$h */
    public static final class C49923h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C56261n f115077a;

        /* renamed from: b */
        final /* synthetic */ C48201bd f115078b;

        static {
            Covode.recordClassIndex(59034);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C49914a.m93722a(this.f115077a, this.f115078b, (AbstractC49928b) null);
        }

        C49923h(C56261n nVar, C48201bd bdVar) {
            this.f115077a = nVar;
            this.f115078b = bdVar;
        }
    }

    /* renamed from: b */
    public static void m93724b(C48201bd bdVar) {
        if (bdVar != null) {
            m93718a(bdVar, (AnimatorListenerAdapter) null);
            m93727d(bdVar);
        }
    }

    /* renamed from: b */
    public static boolean m93725b(Aweme aweme) {
        boolean z;
        IMainServiceHelper createIMainServiceHelperbyMonsterPlugin = MainServiceHelperImpl.createIMainServiceHelperbyMonsterPlugin(false);
        if (createIMainServiceHelperbyMonsterPlugin != null) {
            z = createIMainServiceHelperbyMonsterPlugin.isChatFunOfflineUnder16();
        } else {
            z = true;
        }
        if (aweme == null || m93723a(aweme) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m93726c(C48201bd bdVar) {
        if (bdVar != null) {
            View view = bdVar.f111674b;
            if (view != null) {
                view.setOnClickListener(null);
            }
            m93718a(bdVar, new C49919d(bdVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$a */
    public static final class C49915a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C48201bd f115063a;

        static {
            Covode.recordClassIndex(59026);
        }

        public C49915a(C48201bd bdVar) {
            this.f115063a = bdVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f115063a.f111674b.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            this.f115063a.f111674b.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$f */
    public static final class C49921f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C48201bd f115073a;

        static {
            Covode.recordClassIndex(59032);
        }

        C49921f(C48201bd bdVar) {
            this.f115073a = bdVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f115073a.f111674b.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            this.f115073a.f111674b.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$g */
    public static final class C49922g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f115074a;

        /* renamed from: b */
        final /* synthetic */ float f115075b;

        /* renamed from: c */
        final /* synthetic */ AbstractC49928b f115076c;

        static {
            Covode.recordClassIndex(59033);
        }

        C49922g(View view, float f, AbstractC49928b bVar) {
            this.f115074a = view;
            this.f115075b = f;
            this.f115076c = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            View view = this.f115074a;
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            View view2 = this.f115074a;
            if (view2 != null) {
                view2.requestLayout();
            }
            if (this.f115076c != null) {
                int i = this.f115074a.getLayoutParams().height;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$i */
    public static final class C49924i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f115079a;

        static {
            Covode.recordClassIndex(59035);
        }

        public C49924i(View view) {
            this.f115079a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.f115079a.getLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            layoutParams.height = (int) ((Float) animatedValue).floatValue();
            this.f115079a.requestLayout();
        }
    }

    /* renamed from: a */
    private static String m93716a(IMContact iMContact) {
        if (!(iMContact instanceof IMUser)) {
            String displayName = iMContact.getDisplayName();
            C89219l.m154716b(displayName, "");
            return displayName;
        } else if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).shouldChangeToHandle("Message")) {
            String displayId = ((IMUser) iMContact).getDisplayId();
            C89219l.m154716b(displayId, "");
            return displayId;
        } else {
            String displayName2 = iMContact.getDisplayName();
            C89219l.m154716b(displayName2, "");
            return displayName2;
        }
    }

    /* renamed from: e */
    private static void m93728e(C48201bd bdVar) {
        if (!(bdVar == null || bdVar.f111678f == null)) {
            int childCount = bdVar.f111678f.getChildCount();
            SparseArray<Integer> sparseArray = new SparseArray<>();
            for (int i = 0; i < childCount; i++) {
                View childAt = bdVar.f111678f.getChildAt(i);
                C89219l.m154716b(childAt, "");
                sparseArray.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
                childAt.setVisibility(8);
            }
            bdVar.mo80343a(sparseArray);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.share.a$b */
    public static final class View$OnClickListenerC49916b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56257j f115064a;

        /* renamed from: b */
        final /* synthetic */ C48201bd f115065b;

        static {
            Covode.recordClassIndex(59027);
        }

        View$OnClickListenerC49916b(C56257j jVar, C48201bd bdVar) {
            this.f115064a = jVar;
            this.f115065b = bdVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                String str = "long_press";
                if (!C89219l.m154714a((Object) str, (Object) this.f115064a.f128323f)) {
                    str = "share_toast";
                }
                if (this.f115064a.f128320c) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", this.f115064a.f128322e);
                    bundle.putString("enter_method", "share_toast");
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    createIIMServicebyMonsterPlugin.openSessionListActivity(context, bundle);
                } else {
                    C89219l.m154716b(view, "");
                    createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102213a(view.getContext(), this.f115064a.f128318a).mo93274c(this.f115064a.f128322e).mo93271b(str).mo93262a(6).f128281a);
                }
            }
            C49914a.m93727d(this.f115065b);
        }
    }

    /* renamed from: d */
    public static void m93727d(C48201bd bdVar) {
        if (bdVar != null) {
            SparseArray<Integer> sparseArray = bdVar.f111679g;
            FrameLayout frameLayout = bdVar.f111678f;
            if (frameLayout != null) {
                for (View view : new C49917c(frameLayout)) {
                    if (sparseArray.get(view.getId()) != null) {
                        Integer num = sparseArray.get(view.getId());
                        C89219l.m154716b(num, "");
                        view.setVisibility(num.intValue());
                    } else {
                        C51423a.m95791b(4, "FeedShareHelper", "shareCompleteClick, status is null for id " + view.getId());
                    }
                }
            }
            AbstractC81915c.m141874a(new C49670ae());
        }
    }

    /* renamed from: a */
    public static boolean m93723a(Aweme aweme) {
        boolean z;
        C89219l.m154721d(aweme, "");
        C31575b.m65865g().isMe(aweme.getAuthorUid());
        boolean d = C80636z.m139819d(aweme);
        if (aweme.isProhibited() || aweme.isDelete() || (aweme.isSelfSee() && aweme.isReviewed())) {
            z = true;
        } else {
            z = false;
        }
        boolean a = C58956a.m108315a(aweme);
        boolean z2 = !aweme.getAwemeControl().canShare();
        boolean U = C37699a.m76218U(aweme);
        if (d || z || a || z2 || U) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m93718a(C48201bd bdVar, AnimatorListenerAdapter animatorListenerAdapter) {
        ValueAnimator valueAnimator;
        if (bdVar != null && bdVar.f111674b != null && bdVar.f111674b.getVisibility() != 8) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) bdVar.f111674b.getHeight(), 0.0f);
            f115060a = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new C49921f(bdVar));
            }
            if (!(animatorListenerAdapter == null || (valueAnimator = f115060a) == null)) {
                valueAnimator.addListener(animatorListenerAdapter);
            }
            ValueAnimator valueAnimator2 = f115060a;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration(300L);
            }
            ValueAnimator valueAnimator3 = f115060a;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
    }

    /* renamed from: a */
    public static void m93719a(C56257j jVar, C48201bd bdVar) {
        String str;
        ValueAnimator valueAnimator;
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals("aweme", jVar.f128321d)) {
            IMService.createIIMServicebyMonsterPlugin(false).cacheRecentShareContact(jVar.f128318a);
        }
        String str2 = jVar.f128326i;
        if (str2 == null || str2.length() == 0) {
            m93728e(bdVar);
        }
        ValueAnimator valueAnimator2 = f115060a;
        if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (str = jVar.f128326i) == null || str.length() == 0 || (valueAnimator = f115060a) == null)) {
            valueAnimator.addListener(new C49920e(jVar, bdVar));
            if (C89391z.f203057a != null) {
                return;
            }
        }
        f115062c.mo84961a(jVar, bdVar, (AbstractC49928b) null);
    }

    /* renamed from: a */
    public static void m93720a(C56261n nVar, C48201bd bdVar) {
        ValueAnimator valueAnimator;
        C89219l.m154721d(nVar, "");
        if (bdVar != null) {
            View view = bdVar.f111674b;
            if (view != null) {
                view.setOnClickListener(null);
            }
            ValueAnimator valueAnimator2 = f115060a;
            if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = f115060a) == null)) {
                valueAnimator.addListener(new C49923h(nVar, bdVar));
                if (C89391z.f203057a != null) {
                    return;
                }
            }
            m93722a(nVar, bdVar, (AbstractC49928b) null);
        }
    }

    /* renamed from: a */
    private static void m93721a(Object obj, C48201bd bdVar) {
        IMContact iMContact;
        String string;
        String string2;
        Resources resources = C17867d.m33078a().getResources();
        int i = 8;
        if (obj instanceof C56259l) {
            TuxIconView tuxIconView = bdVar.f111676d;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            TextView textView = bdVar.f111677e;
            if (textView != null) {
                if (((C56259l) obj).f128332d instanceof IMUser) {
                    i = 0;
                }
                textView.setVisibility(i);
            }
            TuxTextView tuxTextView = bdVar.f111673a;
            if (tuxTextView != null) {
                C56259l lVar = (C56259l) obj;
                if (lVar.f128333e) {
                    string2 = resources.getString(R.string.fir, lVar.f128332d.getDisplayName());
                } else {
                    string2 = resources.getString(R.string.fiq, lVar.f128332d.getDisplayName());
                }
                tuxTextView.setText(string2);
            }
            TuxIconView tuxIconView2 = bdVar.f111675c;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_paperplane_fill);
            }
        } else if (obj instanceof C56257j) {
            C56257j jVar = (C56257j) obj;
            List<IMContact> list = jVar.f128319b;
            if (list == null || (iMContact = (IMContact) C89070n.m154583g((List) list)) == null) {
                iMContact = jVar.f128318a;
            }
            TuxTextView tuxTextView2 = bdVar.f111673a;
            if (tuxTextView2 != null) {
                if (jVar.f128320c) {
                    C89219l.m154716b(iMContact, "");
                    string = resources.getString(R.string.c_6, m93716a(iMContact));
                } else if (!(jVar.f128318a instanceof IMConversation) || !jVar.f128325h) {
                    C89219l.m154716b(iMContact, "");
                    string = resources.getString(R.string.c_5, m93716a(iMContact));
                } else {
                    string = resources.getString(R.string.c6b);
                }
                tuxTextView2.setText(string);
            }
            TuxIconView tuxIconView3 = bdVar.f111676d;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(0);
            }
            TextView textView2 = bdVar.f111677e;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            TuxIconView tuxIconView4 = bdVar.f111675c;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconRes(R.raw.icon_tick_cirlce_fill);
            }
        } else if (obj instanceof C56261n) {
            TuxIconView tuxIconView5 = bdVar.f111676d;
            if (tuxIconView5 != null) {
                tuxIconView5.setVisibility(8);
            }
            TextView textView3 = bdVar.f111677e;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            TuxTextView tuxTextView3 = bdVar.f111673a;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(C17867d.m33078a().getResources().getString(R.string.bqo));
            }
            TuxIconView tuxIconView6 = bdVar.f111675c;
            if (tuxIconView6 != null) {
                tuxIconView6.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            }
        }
    }

    /* renamed from: a */
    public final void mo84961a(C56257j jVar, C48201bd bdVar, AbstractC49928b bVar) {
        if (bdVar != null) {
            View view = bdVar.f111674b;
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC49916b(jVar, bdVar));
            }
            m93722a((Object) jVar, bdVar, bVar);
        }
    }

    /* renamed from: a */
    static void m93722a(Object obj, C48201bd bdVar, AbstractC49928b bVar) {
        m93721a(obj, bdVar);
        float b = C13628n.m24520b(C17867d.m33078a(), 32.0f);
        View view = bdVar.f111674b;
        if (view != null) {
            view.getLayoutParams().height = 0;
            view.requestLayout();
            view.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b);
            ofFloat.addUpdateListener(new C49922g(view, b, bVar));
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
    }
}
