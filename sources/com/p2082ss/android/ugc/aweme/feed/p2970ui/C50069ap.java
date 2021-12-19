package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.api.C48337k;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49982q;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ap */
public final class C50069ap {

    /* renamed from: f */
    public static final C50070a f115593f = new C50070a((byte) 0);

    /* renamed from: a */
    C49982q f115594a;

    /* renamed from: b */
    C50074aq f115595b;

    /* renamed from: c */
    List<C48337k> f115596c = new ArrayList();

    /* renamed from: d */
    public WeakReference<ActivityC0945e> f115597d;

    /* renamed from: e */
    public final AnimatorSet f115598e = new AnimatorSet();

    static {
        Covode.recordClassIndex(59195);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ap$a */
    public static final class C50070a {
        static {
            Covode.recordClassIndex(59196);
        }

        private C50070a() {
        }

        public /* synthetic */ C50070a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public static int m94001b() {
        return C34728n.m70946a(173.0d) + C34723i.m70927b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo85201a() {
        C50074aq aqVar = this.f115595b;
        if (aqVar == null) {
            C89219l.m154710a("mListView");
        }
        aqVar.setData(this.f115596c);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ap$b */
    public static final class C50071b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f115599a;

        static {
            Covode.recordClassIndex(59197);
        }

        C50071b(View view) {
            this.f115599a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f115599a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ap$c */
    public static final class C50072c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f115600a;

        static {
            Covode.recordClassIndex(59198);
        }

        C50072c(View view) {
            this.f115600a = view;
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f115600a.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo85204a(String str) {
        C89219l.m154721d(str, "");
        if (C16048b.m29633a().mo25412a(true, "i18n_following_live_skylight_type", 0) != 0) {
            C49982q qVar = this.f115594a;
            if (qVar == null) {
                C89219l.m154710a("mPresenter");
            }
            qVar.mo85028a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ap$d */
    public static final class C50073d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C50069ap f115601a;

        /* renamed from: b */
        final /* synthetic */ float f115602b;

        /* renamed from: c */
        final /* synthetic */ float f115603c;

        /* renamed from: d */
        final /* synthetic */ View f115604d;

        static {
            Covode.recordClassIndex(59199);
        }

        public final void onAnimationEnd(Animator animator) {
            WeakReference<ActivityC0945e> weakReference;
            ActivityC0945e eVar;
            Window window;
            super.onAnimationEnd(animator);
            if (this.f115602b > this.f115603c && C16048b.m29633a().mo25421a(true, "is_release_window_background", true) && (weakReference = this.f115601a.f115597d) != null && (eVar = weakReference.get()) != null && (window = eVar.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this.f115604d.getContext(), R.color.a2)));
            }
        }

        C50073d(C50069ap apVar, float f, float f2, View view) {
            this.f115601a = apVar;
            this.f115602b = f;
            this.f115603c = f2;
            this.f115604d = view;
        }
    }

    /* renamed from: a */
    public final void mo85205a(List<C48337k> list) {
        C89219l.m154721d(list, "");
        this.f115596c = list;
        mo85201a();
    }

    /* renamed from: b */
    public final int mo85206b(String str) {
        C89219l.m154721d(str, "");
        int size = this.f115596c.size();
        List<C48337k> list = this.f115596c;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            String uid = t.getUser().getUid();
            if (uid == null || !TextUtils.equals(uid, str)) {
                arrayList.add(t);
            }
        }
        List<C48337k> g = C89070n.m154585g((Collection) arrayList);
        this.f115596c = g;
        if (g.size() != size) {
            mo85201a();
        }
        return this.f115596c.size();
    }

    /* renamed from: a */
    public final void mo85203a(View view, boolean z) {
        C89219l.m154721d(view, "");
        this.f115598e.cancel();
        this.f115598e.removeAllListeners();
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
            this.f115598e.setDuration(300L);
            this.f115598e.setInterpolator(new DecelerateInterpolator());
            this.f115598e.addListener(new C50072c(view));
            this.f115598e.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f115598e.start();
            return;
        }
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    /* renamed from: b */
    public final void mo85207b(View view, boolean z) {
        C89219l.m154721d(view, "");
        this.f115598e.cancel();
        this.f115598e.removeAllListeners();
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
            this.f115598e.setDuration(300L);
            this.f115598e.setInterpolator(new DecelerateInterpolator());
            this.f115598e.addListener(new C50071b(view));
            this.f115598e.playTogether(ofFloat, ofFloat2, ofFloat3);
            this.f115598e.start();
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo85202a(View view, float f, float f2, boolean z) {
        C89219l.m154721d(view, "");
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f, f2);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(300L);
            ofFloat.addListener(new C50073d(this, f, f2, view));
            ofFloat.start();
            return;
        }
        view.setTranslationY(f2);
    }
}
