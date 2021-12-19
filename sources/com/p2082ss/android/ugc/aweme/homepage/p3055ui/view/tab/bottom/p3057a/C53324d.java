package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d */
public final class C53324d {

    /* renamed from: i */
    public static final C53326a f122409i = new C53326a((byte) 0);

    /* renamed from: a */
    public RemoteImageView f122410a;

    /* renamed from: b */
    public int f122411b;

    /* renamed from: c */
    public int f122412c;

    /* renamed from: d */
    ObjectAnimator f122413d;

    /* renamed from: e */
    public final Context f122414e;

    /* renamed from: f */
    public final ViewGroup f122415f;

    /* renamed from: g */
    public final ImageView f122416g;

    /* renamed from: h */
    public final ImageView f122417h;

    /* renamed from: j */
    private final String f122418j;

    /* renamed from: k */
    private final String f122419k;

    /* renamed from: l */
    private final String f122420l;

    /* renamed from: m */
    private AnimatorSet f122421m;

    /* renamed from: n */
    private boolean f122422n;

    static {
        Covode.recordClassIndex(62885);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d$a */
    public static final class C53326a {
        static {
            Covode.recordClassIndex(62887);
        }

        private C53326a() {
        }

        public /* synthetic */ C53326a(byte b) {
            this();
        }
    }

    /* renamed from: c */
    public final boolean mo89788c() {
        if (this.f122411b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo89789d() {
        if (this.f122411b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d$c */
    public static final class C53328c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C53324d f122425a;

        /* renamed from: b */
        final /* synthetic */ boolean f122426b;

        /* renamed from: c */
        final /* synthetic */ boolean f122427c;

        static {
            Covode.recordClassIndex(62889);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d$c$a */
        static final class RunnableC53329a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53328c f122428a;

            static {
                Covode.recordClassIndex(62890);
            }

            RunnableC53329a(C53328c cVar) {
                this.f122428a = cVar;
            }

            public final void run() {
                this.f122428a.f122425a.mo89783a();
                this.f122428a.f122425a.mo89784a(true);
                this.f122428a.f122425a.f122411b = 0;
            }
        }

        public final void onAnimationEnd(Animator animator) {
            RemoteImageView remoteImageView;
            C53324d dVar;
            RemoteImageView remoteImageView2;
            C89219l.m154721d(animator, "");
            super.onAnimationEnd(animator);
            if (this.f122426b && (remoteImageView2 = (dVar = this.f122425a).f122410a) != null) {
                dVar.mo89783a();
                dVar.f122413d = ObjectAnimator.ofPropertyValuesHolder(remoteImageView2, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.9f, 1.0f));
                ObjectAnimator objectAnimator = dVar.f122413d;
                if (objectAnimator != null) {
                    objectAnimator.setInterpolator(new C34791a());
                }
                ObjectAnimator objectAnimator2 = dVar.f122413d;
                if (objectAnimator2 != null) {
                    objectAnimator2.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                }
                ObjectAnimator objectAnimator3 = dVar.f122413d;
                if (objectAnimator3 != null) {
                    objectAnimator3.setRepeatCount(2);
                }
                ObjectAnimator objectAnimator4 = dVar.f122413d;
                if (objectAnimator4 != null) {
                    objectAnimator4.setRepeatMode(1);
                }
                ObjectAnimator objectAnimator5 = dVar.f122413d;
                if (objectAnimator5 != null) {
                    objectAnimator5.start();
                }
            }
            if (this.f122427c && (remoteImageView = this.f122425a.f122410a) != null) {
                remoteImageView.postDelayed(new RunnableC53329a(this), 5000);
            }
        }

        C53328c(C53324d dVar, boolean z, boolean z2) {
            this.f122425a = dVar;
            this.f122426b = z;
            this.f122427c = z2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.a.d$b */
    public static final class RunnableC53327b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53324d f122424a;

        static {
            Covode.recordClassIndex(62888);
        }

        RunnableC53327b(C53324d dVar) {
            this.f122424a = dVar;
        }

        public final void run() {
            this.f122424a.f122416g.setScaleX(1.0f);
            this.f122424a.f122416g.setScaleY(1.0f);
            this.f122424a.f122417h.setScaleX(1.0f);
            this.f122424a.f122417h.setScaleY(1.0f);
            RemoteImageView remoteImageView = this.f122424a.f122410a;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo89785b() {
        AnimatorSet animatorSet = this.f122421m;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.f122421m;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.f122421m = null;
    }

    /* renamed from: a */
    public final void mo89783a() {
        ObjectAnimator objectAnimator = this.f122413d;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.f122413d;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        ObjectAnimator objectAnimator3 = this.f122413d;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        this.f122413d = null;
    }

    /* renamed from: a */
    public static void m98356a(View view) {
        if (view != null) {
            view.setPivotX(((float) view.getMeasuredWidth()) / 2.0f);
            view.setPivotY(((float) view.getMeasuredHeight()) / 2.0f);
        }
    }

    /* renamed from: c */
    public final void mo89787c(boolean z) {
        int i = 0;
        if (!z) {
            this.f122411b = 0;
            return;
        }
        int i2 = this.f122412c;
        if (i2 == 1) {
            i = 1;
        } else if (i2 == 3) {
            i = 2;
        }
        this.f122411b = i;
    }

    /* renamed from: b */
    private static ObjectAnimator m98359b(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        C89219l.m154716b(ofPropertyValuesHolder, "");
        ofPropertyValuesHolder.setInterpolator(new C34791a());
        ofPropertyValuesHolder.setDuration(400L);
        return ofPropertyValuesHolder;
    }

    /* renamed from: c */
    private static ObjectAnimator m98362c(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        C89219l.m154716b(ofPropertyValuesHolder, "");
        ofPropertyValuesHolder.setInterpolator(new C34791a());
        ofPropertyValuesHolder.setDuration(400L);
        return ofPropertyValuesHolder;
    }

    /* renamed from: b */
    public final void mo89786b(boolean z) {
        int i = this.f122411b;
        if (i != 1 && i != 2) {
            this.f122422n = false;
            this.f122412c = 3;
            RemoteImageView remoteImageView = this.f122410a;
            if (remoteImageView != null) {
                remoteImageView.setImageURI(Uri.fromFile(new File(this.f122420l)));
            }
            RemoteImageView remoteImageView2 = this.f122410a;
            if (remoteImageView2 != null) {
                remoteImageView2.setVisibility(0);
            }
            m98358a(false, z);
        }
    }

    /* renamed from: a */
    public final void mo89784a(boolean z) {
        if (this.f122411b != 0) {
            this.f122422n = true;
            mo89785b();
            mo89783a();
            if (z) {
                m98357a(this.f122416g, this.f122417h, this.f122410a);
                AnimatorSet d = m98363d(this.f122416g, this.f122417h, this.f122410a);
                if (d != null) {
                    d.start();
                    return;
                }
                return;
            }
            this.f122416g.post(new RunnableC53327b(this));
        }
    }

    /* renamed from: a */
    private final void m98358a(boolean z, boolean z2) {
        m98360b(this.f122410a, this.f122416g, this.f122417h);
        RemoteImageView remoteImageView = this.f122410a;
        if (remoteImageView != null) {
            remoteImageView.setVisibility(0);
        }
        AnimatorSet c = m98361c(this.f122410a, this.f122416g, this.f122417h);
        this.f122421m = c;
        if (c != null) {
            c.addListener(new C53328c(this, z2, false));
        }
        AnimatorSet animatorSet = this.f122421m;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    /* renamed from: b */
    private static void m98360b(View view, View view2, View view3) {
        if (view != null) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        if (view2 != null) {
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
        }
        if (view3 != null) {
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
        }
    }

    /* renamed from: a */
    private static void m98357a(View view, View view2, View view3) {
        if (view != null) {
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        }
        if (view2 != null) {
            view2.setScaleX(0.0f);
            view2.setScaleY(0.0f);
        }
        if (view3 != null) {
            view3.setScaleX(1.0f);
            view3.setScaleY(1.0f);
        }
    }

    /* renamed from: c */
    private static AnimatorSet m98361c(View view, View view2, View view3) {
        if (view == null || view2 == null || view3 == null) {
            return null;
        }
        ObjectAnimator b = m98359b(view);
        ObjectAnimator c = m98362c(view2);
        ObjectAnimator c2 = m98362c(view3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(b).with(c).with(c2);
        return animatorSet;
    }

    /* renamed from: d */
    private static AnimatorSet m98363d(View view, View view2, View view3) {
        if (view == null || view2 == null || view3 == null) {
            return null;
        }
        ObjectAnimator b = m98359b(view);
        ObjectAnimator b2 = m98359b(view2);
        ObjectAnimator c = m98362c(view3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(b).with(b2).with(c);
        return animatorSet;
    }

    public C53324d(Context context, ViewGroup viewGroup, ImageView imageView, ImageView imageView2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView2, "");
        MethodCollector.m26663i(3020);
        this.f122414e = context;
        this.f122415f = viewGroup;
        this.f122416g = imageView;
        this.f122417h = imageView2;
        StringBuilder sb = new StringBuilder();
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        C89219l.m154716b(applicationContext, "");
        if (C58016d.f132222c == null || !C58016d.f132224e) {
            C58016d.f132222c = applicationContext.getFilesDir();
        }
        String sb2 = sb.append(C58016d.f132222c.toString()).append(File.separator).append("superentrance").toString();
        this.f122418j = sb2;
        this.f122419k = sb2 + File.separator + "plusicon.png";
        this.f122420l = sb2 + File.separator + "special_plus_icon.png";
        RemoteImageView remoteImageView = new RemoteImageView(viewGroup.getContext());
        this.f122410a = remoteImageView;
        remoteImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        RemoteImageView remoteImageView2 = this.f122410a;
        if (remoteImageView2 != null) {
            remoteImageView2.setVisibility(8);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C34728n.m70946a(45.0d), C34728n.m70946a(45.0d));
        layoutParams.gravity = 17;
        RemoteImageView remoteImageView3 = this.f122410a;
        if (remoteImageView3 != null) {
            remoteImageView3.setLayoutParams(layoutParams);
        }
        RemoteImageView remoteImageView4 = this.f122410a;
        if (remoteImageView4 != null) {
            viewGroup.addView(remoteImageView4);
        }
        imageView.post(new Runnable(this) {
            /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.bottom.p3057a.C53324d.RunnableC533251 */

            /* renamed from: a */
            final /* synthetic */ C53324d f122423a;

            static {
                Covode.recordClassIndex(62886);
            }

            {
                this.f122423a = r1;
            }

            public final void run() {
                C53324d.m98356a(this.f122423a.f122416g);
                C53324d.m98356a(this.f122423a.f122417h);
            }
        });
        MethodCollector.m26664o(3020);
    }
}
