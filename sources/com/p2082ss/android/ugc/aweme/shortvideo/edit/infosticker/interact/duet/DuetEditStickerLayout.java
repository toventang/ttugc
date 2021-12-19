package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout */
public final class DuetEditStickerLayout extends FrameLayout {

    /* renamed from: a */
    FrameLayout f159254a;

    /* renamed from: b */
    AbstractC89172b<? super DuetEditStickerView, C89391z> f159255b;

    /* renamed from: c */
    C71117a f159256c = new C71117a((byte) 0);

    /* renamed from: d */
    C71117a f159257d = new C71117a((byte) 0);

    /* renamed from: e */
    DuetEditStickerView f159258e;

    /* renamed from: f */
    boolean f159259f;

    /* renamed from: g */
    boolean f159260g;

    /* renamed from: h */
    PointF f159261h = new PointF(0.0f, 0.0f);

    /* renamed from: i */
    public Animator f159262i;

    /* renamed from: j */
    public int f159263j = C71127b.f159326a;

    /* renamed from: k */
    final float f159264k;

    /* renamed from: l */
    private AbstractC89172b<? super DuetEditStickerView, C89391z> f159265l;

    /* renamed from: m */
    private VideoPublishEditModel f159266m;

    static {
        Covode.recordClassIndex(83612);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z> */
    public final AbstractC89172b<DuetEditStickerView, C89391z> getBeforeChangeListener() {
        return this.f159265l;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.f159266m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z>, h.f.a.b<com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerView, h.z> */
    public final AbstractC89172b<DuetEditStickerView, C89391z> getOnCompleteListener() {
        return this.f159255b;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout$b */
    static final class C71111b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DuetEditStickerLayout f159268a;

        static {
            Covode.recordClassIndex(83614);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71111b(DuetEditStickerLayout duetEditStickerLayout) {
            super(0);
            this.f159268a = duetEditStickerLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            float f;
            DuetEditStickerLayout duetEditStickerLayout = this.f159268a;
            duetEditStickerLayout.f159263j = C71127b.f159326a;
            duetEditStickerLayout.f159259f = false;
            if (!duetEditStickerLayout.f159260g) {
                DuetEditStickerView duetEditStickerView = duetEditStickerLayout.f159258e;
                if (duetEditStickerView != null) {
                    C71110a aVar = new C71110a(duetEditStickerLayout);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(duetEditStickerView, "scaleX", duetEditStickerLayout.f159257d.f159285a, duetEditStickerLayout.f159256c.f159285a);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(duetEditStickerView, "scaleY", duetEditStickerLayout.f159257d.f159286b, duetEditStickerLayout.f159256c.f159286b);
                    float[] fArr = new float[2];
                    if (duetEditStickerLayout.f159256c.f159287c > 180.0f) {
                        f = 360.0f;
                    } else {
                        f = duetEditStickerLayout.f159257d.f159287c;
                    }
                    fArr[0] = f;
                    fArr[1] = duetEditStickerLayout.f159256c.f159287c;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(duetEditStickerView, "rotation", fArr);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(duetEditStickerView, "x", duetEditStickerLayout.f159257d.f159288d, duetEditStickerLayout.f159256c.f159288d);
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(duetEditStickerView, "y", duetEditStickerLayout.f159257d.f159289e, duetEditStickerLayout.f159256c.f159289e);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(300L);
                    animatorSet.addListener(aVar);
                    animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                    animatorSet.start();
                    duetEditStickerLayout.f159262i = animatorSet;
                }
                duetEditStickerLayout.f159260g = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout$c */
    static final class RunnableC71112c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DuetEditStickerLayout f159269a;

        static {
            Covode.recordClassIndex(83615);
        }

        RunnableC71112c(DuetEditStickerLayout duetEditStickerLayout) {
            this.f159269a = duetEditStickerLayout;
        }

        public final void run() {
            float f;
            DuetEditStickerLayout duetEditStickerLayout = this.f159269a;
            DuetEditStickerView duetEditStickerView = duetEditStickerLayout.f159258e;
            if (duetEditStickerView != null) {
                duetEditStickerLayout.f159257d.f159288d = (float) ((duetEditStickerLayout.getWidth() - duetEditStickerView.getWidth()) / 2);
                duetEditStickerLayout.f159257d.f159289e = ((((float) duetEditStickerLayout.getHeight()) - duetEditStickerLayout.f159264k) - ((float) duetEditStickerView.getHeight())) / 2.0f;
            }
            int i = this.f159269a.f159263j;
            if (i == C71127b.f159328c) {
                DuetEditStickerLayout duetEditStickerLayout2 = this.f159269a;
                duetEditStickerLayout2.f159263j = C71127b.f159326a;
                duetEditStickerLayout2.f159260g = false;
                if (!duetEditStickerLayout2.f159259f) {
                    DuetEditStickerView duetEditStickerView2 = duetEditStickerLayout2.f159258e;
                    if (duetEditStickerView2 != null) {
                        duetEditStickerView2.setVisibility(0);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(duetEditStickerView2, "scaleX", duetEditStickerLayout2.f159256c.f159285a, duetEditStickerLayout2.f159257d.f159285a);
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(duetEditStickerView2, "scaleY", duetEditStickerLayout2.f159256c.f159286b, duetEditStickerLayout2.f159257d.f159286b);
                        float[] fArr = new float[2];
                        fArr[0] = duetEditStickerLayout2.f159256c.f159287c;
                        if (duetEditStickerLayout2.f159256c.f159287c > 180.0f) {
                            f = 360.0f;
                        } else {
                            f = duetEditStickerLayout2.f159257d.f159287c;
                        }
                        fArr[1] = f;
                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(duetEditStickerView2, "rotation", fArr);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(duetEditStickerView2, "x", duetEditStickerLayout2.f159256c.f159288d, duetEditStickerLayout2.f159257d.f159288d);
                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(duetEditStickerView2, "y", duetEditStickerLayout2.f159256c.f159289e, duetEditStickerLayout2.f159257d.f159289e);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3).with(ofFloat4).with(ofFloat5);
                        animatorSet.addListener(new C71114e(duetEditStickerView2));
                        animatorSet.start();
                    }
                    duetEditStickerLayout2.f159259f = true;
                }
            } else if (i == C71127b.f159327b) {
                DuetEditStickerLayout duetEditStickerLayout3 = this.f159269a;
                duetEditStickerLayout3.f159263j = C71127b.f159326a;
                duetEditStickerLayout3.f159260g = false;
                if (!duetEditStickerLayout3.f159259f) {
                    DuetEditStickerView duetEditStickerView3 = duetEditStickerLayout3.f159258e;
                    if (duetEditStickerView3 != null) {
                        duetEditStickerLayout3.f159256c.f159288d = (float) ((duetEditStickerLayout3.getWidth() - duetEditStickerView3.getWidth()) / 2);
                        duetEditStickerLayout3.f159256c.f159289e = ((duetEditStickerLayout3.f159261h.x - ((float) duetEditStickerView3.getHeight())) / 2.0f) + duetEditStickerLayout3.f159261h.y;
                        duetEditStickerView3.setX(duetEditStickerLayout3.f159257d.f159288d);
                        duetEditStickerView3.setY(duetEditStickerLayout3.f159257d.f159289e);
                        duetEditStickerView3.setVisibility(0);
                        duetEditStickerLayout3.requestLayout();
                        DuetEditStickerView duetEditStickerView4 = duetEditStickerLayout3.f159258e;
                        if (duetEditStickerView4 != null) {
                            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(duetEditStickerView4, "scaleX", 0.0f, 1.0f);
                            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(duetEditStickerView4, "scaleY", 0.0f, 1.0f);
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            animatorSet2.setDuration(300L);
                            animatorSet2.play(ofFloat6).with(ofFloat7);
                            animatorSet2.addListener(new C71113d(duetEditStickerView4));
                            animatorSet2.start();
                        }
                    }
                    duetEditStickerLayout3.f159259f = true;
                }
            }
        }
    }

    public final void setBeforeChangeListener(AbstractC89172b<? super DuetEditStickerView, C89391z> bVar) {
        this.f159265l = bVar;
    }

    public final void setEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f159266m = videoPublishEditModel;
    }

    public final void setOnCompleteListener(AbstractC89172b<? super DuetEditStickerView, C89391z> bVar) {
        this.f159255b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout$a */
    public static final class C71110a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ DuetEditStickerLayout f159267a;

        static {
            Covode.recordClassIndex(83613);
        }

        C71110a(DuetEditStickerLayout duetEditStickerLayout) {
            this.f159267a = duetEditStickerLayout;
        }

        public final void onAnimationEnd(Animator animator) {
            MethodCollector.m26663i(9957);
            super.onAnimationEnd(animator);
            this.f159267a.f159262i = null;
            DuetEditStickerLayout duetEditStickerLayout = this.f159267a;
            DuetEditStickerView duetEditStickerView = duetEditStickerLayout.f159258e;
            if (duetEditStickerView != null) {
                FrameLayout frameLayout = duetEditStickerLayout.f159254a;
                if (frameLayout == null) {
                    C89219l.m154710a("container");
                }
                frameLayout.removeView(duetEditStickerView);
                DuetEditStickerView duetEditStickerView2 = duetEditStickerLayout.f159258e;
                if (duetEditStickerView2 != null) {
                    duetEditStickerView2.setScaleX(1.0f);
                    duetEditStickerView2.setScaleY(1.0f);
                    duetEditStickerView2.setRotation(0.0f);
                    duetEditStickerView2.setTranslationX(0.0f);
                    duetEditStickerView2.setTranslationY(0.0f);
                    duetEditStickerLayout.f159256c = new C71117a((byte) 0);
                }
                AbstractC89172b<? super DuetEditStickerView, C89391z> bVar = duetEditStickerLayout.f159255b;
                if (bVar != null) {
                    bVar.invoke(duetEditStickerLayout.f159258e);
                }
                duetEditStickerLayout.f159258e = null;
            }
            this.f159267a.setVisibility(4);
            MethodCollector.m26664o(9957);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout$d */
    public static final class C71113d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ DuetEditStickerView f159270a;

        static {
            Covode.recordClassIndex(83616);
        }

        C71113d(DuetEditStickerView duetEditStickerView) {
            this.f159270a = duetEditStickerView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f159270a.mo112396a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.duet.DuetEditStickerLayout$e */
    public static final class C71114e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ DuetEditStickerView f159271a;

        static {
            Covode.recordClassIndex(83617);
        }

        C71114e(DuetEditStickerView duetEditStickerView) {
            this.f159271a = duetEditStickerView;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f159271a.mo112396a();
        }
    }

    /* renamed from: a */
    public final void mo112384a(float f, float f2) {
        this.f159261h.x = f;
        this.f159261h.y = f2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuetEditStickerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(13583);
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        this.f159264k = C84912r.m145930a(context2, 380.0f);
        View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.aeu, this, false);
        if (a != null) {
            FrameLayout frameLayout = (FrameLayout) a;
            this.f159254a = frameLayout;
            if (frameLayout == null) {
                C89219l.m154710a("container");
            }
            addView(frameLayout);
            setVisibility(4);
            MethodCollector.m26664o(13583);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        MethodCollector.m26664o(13583);
        throw nullPointerException;
    }

    /* renamed from: a */
    public final void mo112385a(DuetEditStickerView duetEditStickerView, C71117a aVar) {
        MethodCollector.m26663i(13415);
        C89219l.m154721d(aVar, "");
        setVisibility(0);
        if (duetEditStickerView != null) {
            this.f159263j = C71127b.f159328c;
            this.f159256c = aVar;
            float f = aVar.f159287c % 360.0f;
            if (f < 0.0f) {
                f += 360.0f;
            }
            aVar.f159287c = f;
            this.f159258e = duetEditStickerView;
            ViewParent parent = duetEditStickerView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f159258e);
            }
            FrameLayout frameLayout = this.f159254a;
            if (frameLayout == null) {
                C89219l.m154710a("container");
            }
            frameLayout.addView(duetEditStickerView);
            setVisibility(0);
            DuetEditStickerView duetEditStickerView2 = this.f159258e;
            if (duetEditStickerView2 != null) {
                duetEditStickerView2.setVisibility(4);
            }
        } else {
            this.f159263j = C71127b.f159327b;
            Context context = getContext();
            C89219l.m154716b(context, "");
            DuetEditStickerView duetEditStickerView3 = new DuetEditStickerView(context, this.f159266m);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            duetEditStickerView3.setVisibility(4);
            FrameLayout frameLayout2 = this.f159254a;
            if (frameLayout2 == null) {
                C89219l.m154710a("container");
            }
            frameLayout2.addView(duetEditStickerView3, layoutParams);
            this.f159258e = duetEditStickerView3;
        }
        DuetEditStickerView duetEditStickerView4 = this.f159258e;
        if (duetEditStickerView4 != null) {
            duetEditStickerView4.setSheetDismissListener(new C71111b(this));
        }
        DuetEditStickerView duetEditStickerView5 = this.f159258e;
        if (duetEditStickerView5 != null) {
            duetEditStickerView5.post(new RunnableC71112c(this));
            MethodCollector.m26664o(13415);
            return;
        }
        MethodCollector.m26664o(13415);
    }
}
