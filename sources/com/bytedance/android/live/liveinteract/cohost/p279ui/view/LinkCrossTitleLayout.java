package com.bytedance.android.live.liveinteract.cohost.p279ui.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout */
public final class LinkCrossTitleLayout extends FrameLayout {

    /* renamed from: b */
    public static final C4777a f12549b = new C4777a((byte) 0);

    /* renamed from: a */
    public AnimatorSet f12550a;

    /* renamed from: c */
    private HashMap f12551c;

    static {
        Covode.recordClassIndex(5354);
    }

    public LinkCrossTitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo10494a(int i) {
        if (this.f12551c == null) {
            this.f12551c = new HashMap();
        }
        View view = (View) this.f12551c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f12551c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$a */
    public static final class C4777a {
        static {
            Covode.recordClassIndex(5355);
        }

        private C4777a() {
        }

        public /* synthetic */ C4777a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$b */
    public static final class C4778b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkCrossTitleLayout f12552a;

        static {
            Covode.recordClassIndex(5356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4778b(LinkCrossTitleLayout linkCrossTitleLayout) {
            super(0);
            this.f12552a = linkCrossTitleLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo10496a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10496a() {
            AnimatorSet animatorSet = this.f12552a.f12550a;
            if (animatorSet != null && animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.f12552a.f12550a;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                }
                AnimatorSet animatorSet3 = this.f12552a.f12550a;
                if (animatorSet3 != null) {
                    animatorSet3.end();
                }
                this.f12552a.f12550a = null;
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$i */
    public static final class C4785i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkCrossTitleLayout f12559a;

        /* renamed from: b */
        final /* synthetic */ C4778b f12560b;

        /* renamed from: c */
        final /* synthetic */ C4781e f12561c;

        /* renamed from: d */
        final /* synthetic */ C4783g f12562d;

        static {
            Covode.recordClassIndex(5363);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4785i(LinkCrossTitleLayout linkCrossTitleLayout, C4778b bVar, C4781e eVar, C4783g gVar) {
            super(0);
            this.f12559a = linkCrossTitleLayout;
            this.f12560b = bVar;
            this.f12561c = eVar;
            this.f12562d = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo10504a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10504a() {
            this.f12560b.mo10496a();
            this.f12559a.f12550a = new AnimatorSet();
            AnimatorSet a = this.f12561c.invoke();
            AnimatorSet a2 = this.f12562d.invoke();
            AnimatorSet animatorSet = this.f12559a.f12550a;
            if (animatorSet != null) {
                animatorSet.playTogether(a, a2);
            }
            AnimatorSet animatorSet2 = this.f12559a.f12550a;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$j */
    public static final class C4786j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ LinkCrossTitleLayout f12563a;

        /* renamed from: b */
        final /* synthetic */ C4778b f12564b;

        /* renamed from: c */
        final /* synthetic */ C4782f f12565c;

        /* renamed from: d */
        final /* synthetic */ C4784h f12566d;

        static {
            Covode.recordClassIndex(5364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4786j(LinkCrossTitleLayout linkCrossTitleLayout, C4778b bVar, C4782f fVar, C4784h hVar) {
            super(0);
            this.f12563a = linkCrossTitleLayout;
            this.f12564b = bVar;
            this.f12565c = fVar;
            this.f12566d = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            mo10505a();
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo10505a() {
            this.f12564b.mo10496a();
            this.f12563a.f12550a = new AnimatorSet();
            AnimatorSet a = this.f12565c.invoke();
            AnimatorSet a2 = this.f12566d.invoke();
            AnimatorSet animatorSet = this.f12563a.f12550a;
            if (animatorSet != null) {
                animatorSet.playTogether(a, a2);
            }
            AnimatorSet animatorSet2 = this.f12563a.f12550a;
            if (animatorSet2 != null) {
                animatorSet2.start();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$f */
    public static final class C4782f extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C4779c f12556a;

        static {
            Covode.recordClassIndex(5360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4782f(C4779c cVar) {
            super(0);
            this.f12556a = cVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.f12556a.mo10497a(0.0f, 1.25f, 240), this.f12556a.mo10497a(1.25f, 0.9f, 200), this.f12556a.mo10497a(0.9f, 1.0f, 120));
            return animatorSet;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$g */
    public static final class C4783g extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C4780d f12557a;

        static {
            Covode.recordClassIndex(5361);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4783g(C4780d dVar) {
            super(0);
            this.f12557a = dVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.f12557a.mo10499a(0.0f, 1.0f, 120), this.f12557a.mo10499a(1.0f, 1.0f, 1320), this.f12557a.mo10499a(1.0f, 0.0f, 880));
            return animatorSet;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$h */
    public static final class C4784h extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C4780d f12558a;

        static {
            Covode.recordClassIndex(5362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4784h(C4780d dVar) {
            super(0);
            this.f12558a = dVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.f12558a.mo10499a(0.0f, 1.0f, 120), this.f12558a.mo10499a(1.0f, 1.0f, 680), this.f12558a.mo10499a(1.0f, 1.0f, 200));
            return animatorSet;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$e */
    public static final class C4781e extends AbstractC89220m implements AbstractC89171a<AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ C4779c f12555a;

        static {
            Covode.recordClassIndex(5359);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4781e(C4779c cVar) {
            super(0);
            this.f12555a = cVar;
        }

        /* renamed from: a */
        public final AnimatorSet invoke() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(this.f12555a.mo10497a(0.0f, 0.9f, 120), this.f12555a.mo10497a(0.9f, 1.25f, 520), this.f12555a.mo10497a(1.25f, 0.6f, 160), this.f12555a.mo10497a(0.6f, 1.1f, 120), this.f12555a.mo10497a(1.1f, 0.9f, 120), this.f12555a.mo10497a(0.9f, 1.0f, 80));
            return animatorSet;
        }
    }

    /* renamed from: a */
    public final void mo10495a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) mo10494a(R.id.c3_);
        C89219l.m154716b(constraintLayout, "");
        constraintLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo10494a(R.id.c3a);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        HSImageView hSImageView = (HSImageView) mo10494a(R.id.bws);
        C89219l.m154716b(hSImageView, "");
        hSImageView.setVisibility(0);
        C3941k.m9607a((HSImageView) mo10494a(R.id.bws), "tiktok_live_interaction_resource", "ttlive_icon_in_likmic.webp");
    }

    /* renamed from: a */
    public static Object m10904a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6127);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6127);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ LinkCrossTitleLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$c */
    public static final class C4779c extends AbstractC89220m implements AbstractC89187q<Float, Float, Long, AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ View f12553a;

        static {
            Covode.recordClassIndex(5357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4779c(View view) {
            super(3);
            this.f12553a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AnimatorSet invoke(Float f, Float f2, Long l) {
            return mo10497a(f.floatValue(), f2.floatValue(), l.longValue());
        }

        /* renamed from: a */
        public final AnimatorSet mo10497a(float f, float f2, long j) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f12553a, "scaleX", f, f2), ObjectAnimator.ofFloat(this.f12553a, "scaleY", f, f2));
            animatorSet.setDuration(j);
            return animatorSet;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout$d */
    public static final class C4780d extends AbstractC89220m implements AbstractC89187q<Float, Float, Long, AnimatorSet> {

        /* renamed from: a */
        final /* synthetic */ View f12554a;

        static {
            Covode.recordClassIndex(5358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4780d(View view) {
            super(3);
            this.f12554a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ AnimatorSet invoke(Float f, Float f2, Long l) {
            return mo10499a(f.floatValue(), f2.floatValue(), l.longValue());
        }

        /* renamed from: a */
        public final AnimatorSet mo10499a(float f, float f2, long j) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.f12554a, "alpha", f, f2));
            animatorSet.setDuration(j);
            return animatorSet;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private LinkCrossTitleLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6135);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.bb3, this, true);
        MethodCollector.m26664o(6135);
    }
}
