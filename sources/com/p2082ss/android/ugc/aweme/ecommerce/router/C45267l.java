package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.PopupWindow;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.l */
public final class C45267l extends PopupWindow {

    /* renamed from: a */
    public boolean f105502a;

    /* renamed from: b */
    public final Context f105503b;

    /* renamed from: c */
    public final View f105504c;

    /* renamed from: d */
    private final View f105505d;

    static {
        Covode.recordClassIndex(53719);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.l$a */
    public static final class RunnableC45268a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45267l f105506a;

        static {
            Covode.recordClassIndex(53720);
        }

        RunnableC45268a(C45267l lVar) {
            this.f105506a = lVar;
        }

        public final void run() {
            this.f105506a.mo76353b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.l$b */
    public static final class C45269b implements NoticeView.AbstractC42575a {

        /* renamed from: a */
        final /* synthetic */ C45267l f105507a;

        static {
            Covode.recordClassIndex(53721);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: a */
        public final void mo72753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView.AbstractC42575a
        /* renamed from: b */
        public final void mo72754b() {
            this.f105507a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45269b(C45267l lVar) {
            this.f105507a = lVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.l$c */
    public static final class RunnableC45270c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45267l f105508a;

        static {
            Covode.recordClassIndex(53722);
        }

        RunnableC45270c(C45267l lVar) {
            this.f105508a = lVar;
        }

        public final void run() {
            this.f105508a.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo76353b() {
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void dismiss() {
        if (!this.f105502a) {
            this.f105502a = true;
            m87847a(false);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC45268a(this), 500);
        }
    }

    /* renamed from: a */
    public final boolean mo76352a() {
        try {
            this.f105505d.measure(0, 0);
            View view = this.f105504c;
            View view2 = this.f105505d;
            C89219l.m154716b(view2, "");
            showAtLocation(view, 80, 0, view2.getMeasuredHeight());
            m87847a(true);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC45270c(this), 5000);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private final void m87847a(boolean z) {
        float translationY;
        float measuredHeight;
        AnimatorSet animatorSet = new AnimatorSet();
        Interpolator a = C22971a.m43305a();
        Interpolator a2 = C22971a.m43305a();
        View view = this.f105505d;
        C89219l.m154716b(view, "");
        NoticeView noticeView = (NoticeView) view.findViewById(R.id.alo);
        float f = 1.0f;
        float f2 = 0.0f;
        if (z) {
            View view2 = this.f105505d;
            C89219l.m154716b(view2, "");
            translationY = ((float) view2.getMeasuredHeight()) * 1.0f;
            measuredHeight = 0.0f;
        } else {
            C89219l.m154716b(noticeView, "");
            f2 = noticeView.getAlpha();
            translationY = noticeView.getTranslationY();
            float translationY2 = noticeView.getTranslationY();
            View view3 = this.f105505d;
            C89219l.m154716b(view3, "");
            measuredHeight = translationY2 + ((float) view3.getMeasuredHeight());
            f = 0.0f;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(noticeView, "alpha", f2, f).setDuration(300L);
        if (!z) {
            a = a2;
        }
        duration.setInterpolator(a);
        C89219l.m154716b(duration, "");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(noticeView, "translationY", translationY, measuredHeight).setDuration(500L);
        duration2.setInterpolator(a2);
        C89219l.m154716b(duration2, "");
        animatorSet.play(duration).with(duration2);
        animatorSet.start();
    }

    public C45267l(Context context, View view) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        MethodCollector.m26663i(7968);
        this.f105503b = context;
        this.f105504c = view;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ra, (ViewGroup) null);
        this.f105505d = inflate;
        setContentView(inflate);
        setWidth(-1);
        setHeight(-2);
        C89219l.m154716b(inflate, "");
        ((NoticeView) inflate.findViewById(R.id.alo)).setTitleText(context.getResources().getString(R.string.biq));
        C89219l.m154716b(inflate, "");
        ((NoticeView) inflate.findViewById(R.id.alo)).setOnInternalClickListener(new C45269b(this));
        C89219l.m154716b(inflate, "");
        ((NoticeView) inflate.findViewById(R.id.alo)).setNoticeBackgroundColor(0);
        MethodCollector.m26664o(7968);
    }
}
