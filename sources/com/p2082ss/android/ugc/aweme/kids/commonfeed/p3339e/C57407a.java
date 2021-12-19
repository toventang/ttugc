package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3339e;

import android.os.Build;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a.C57384a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3333a.RunnableC57387b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57390a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3340f.C57417a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3343g.C57442a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57449b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.FeedSwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LikeLayout;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.LoadMoreFrameLayout;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService;
import com.p2082ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a */
public final class C57407a extends AbstractC49887w implements WeakHandler.IHandler {

    /* renamed from: a */
    public VerticalViewPager f130861a;

    /* renamed from: b */
    LikeLayout f130862b;

    /* renamed from: c */
    public ImageView f130863c;

    /* renamed from: d */
    public View f130864d;

    /* renamed from: e */
    public C57390a f130865e;

    /* renamed from: f */
    public C57417a f130866f;

    /* renamed from: g */
    public boolean f130867g;

    /* renamed from: h */
    public boolean f130868h;

    /* renamed from: i */
    public boolean f130869i;

    /* renamed from: j */
    public int f130870j;

    /* renamed from: k */
    public AbstractC89171a<Boolean> f130871k;

    /* renamed from: l */
    public List<Aweme> f130872l;

    /* renamed from: m */
    public String f130873m;

    /* renamed from: n */
    public String f130874n;

    /* renamed from: o */
    private FeedSwipeRefreshLayout f130875o;

    /* renamed from: p */
    private LoadMoreFrameLayout f130876p;

    /* renamed from: q */
    private View f130877q;

    /* renamed from: r */
    private WeakHandler f130878r;

    /* renamed from: s */
    private final AbstractC89244h f130879s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$a */
    public static final class C57408a implements C57384a.AbstractC57386b {

        /* renamed from: a */
        public static final C57408a f130880a = new C57408a();

        static {
            Covode.recordClassIndex(67330);
        }

        C57408a() {
        }
    }

    static {
        Covode.recordClassIndex(67329);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final IKidsWellbeingService mo94669a() {
        return (IKidsWellbeingService) this.f130879s.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$c */
    public static final class RunnableC57410c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f130882a;

        static {
            Covode.recordClassIndex(67332);
        }

        RunnableC57410c(ImageView imageView) {
            this.f130882a = imageView;
        }

        public final void run() {
            this.f130882a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$i */
    static final class C57416i extends AbstractC89220m implements AbstractC89171a<IKidsWellbeingService> {

        /* renamed from: a */
        public static final C57416i f130890a = new C57416i();

        static {
            Covode.recordClassIndex(67338);
        }

        C57416i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IKidsWellbeingService invoke() {
            return KidsWellbeingServiceImpl.m104800c();
        }
    }

    public /* synthetic */ C57407a() {
        this("");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: r */
    public final void mo70413r() {
        super.mo70413r();
        AbstractC57448a d = mo94672d();
        if (d != null) {
            d.mo94721c();
        }
    }

    /* renamed from: f */
    public final void mo94674f() {
        C57417a aVar = this.f130866f;
        if (aVar == null) {
            C89219l.m154710a("playController");
        }
        aVar.mo94685d();
        IKidsWellbeingService a = mo94669a();
        if (a != null) {
            a.mo95133b();
        }
        AbstractC57448a d = mo94672d();
        if (d != null) {
            d.mo94723e();
        }
    }

    /* renamed from: g */
    public final void mo94675g() {
        C57417a aVar = this.f130866f;
        if (aVar == null) {
            C89219l.m154710a("playController");
        }
        aVar.mo94683b();
        IKidsWellbeingService a = mo94669a();
        if (a != null) {
            a.mo95131a();
        }
    }

    /* renamed from: b */
    public final void mo94670b() {
        VerticalViewPager verticalViewPager = this.f130861a;
        if (verticalViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        View view = this.f130877q;
        if (view == null) {
            C89219l.m154710a("topSpace");
        }
        View view2 = this.f130864d;
        if (view2 == null) {
            C89219l.m154710a("bottomSpace");
        }
        C29339a.m58752a(new RunnableC57387b(this.f183419bv, verticalViewPager, view2, view, C57408a.f130880a));
    }

    /* renamed from: c */
    public final void mo94671c() {
        ImageView imageView = this.f130863c;
        if (imageView == null) {
            C89219l.m154710a("ivPlay");
        }
        imageView.setVisibility(0);
        imageView.animate().alpha(0.0f).setDuration(100).withEndAction(new RunnableC57410c(imageView));
        imageView.setSelected(false);
    }

    /* renamed from: e */
    public final void mo94673e() {
        mo94671c();
        C57417a aVar = this.f130866f;
        if (aVar == null) {
            C89219l.m154710a("playController");
        }
        aVar.mo94684c();
        IKidsWellbeingService a = mo94669a();
        if (a != null) {
            a.mo95131a();
        }
        AbstractC57448a d = mo94672d();
        if (d != null) {
            d.mo94722d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$d */
    public static final class CallableC57411d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f130883a;

        /* renamed from: b */
        final /* synthetic */ Aweme f130884b;

        /* renamed from: c */
        final /* synthetic */ Aweme f130885c;

        static {
            Covode.recordClassIndex(67333);
        }

        CallableC57411d(String str, Aweme aweme, Aweme aweme2) {
            this.f130883a = str;
            this.f130884b = aweme;
            this.f130885c = aweme2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C57355f.m103962a(this.f130883a, new C33743c().mo59976a("from_group_id", this.f130884b.getAid()).mo59976a("to_group_id", this.f130885c.getAid()).mo59976a("author_id", this.f130884b.getAuthorUid()).mo59976a("log_pb", this.f130884b.getLogPbString()).mo59977a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final AbstractC57448a mo94672d() {
        VerticalViewPager verticalViewPager = this.f130861a;
        if (verticalViewPager == null) {
            C89219l.m154710a("viewPager");
        }
        for (int childCount = verticalViewPager.getChildCount() - 1; childCount >= 0; childCount--) {
            VerticalViewPager verticalViewPager2 = this.f130861a;
            if (verticalViewPager2 == null) {
                C89219l.m154710a("viewPager");
            }
            Object tag = verticalViewPager2.getChildAt(childCount).getTag(R.id.c22);
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.kids.commonfeed.viewholder.IFeedViewHolder");
            AbstractC57448a aVar = (AbstractC57448a) tag;
            VerticalViewPager verticalViewPager3 = this.f130861a;
            if (verticalViewPager3 == null) {
                C89219l.m154710a("viewPager");
            }
            int currentItem = verticalViewPager3.getCurrentItem();
            if (aVar != null) {
                C57390a aVar2 = this.f130865e;
                if (aVar2 == null) {
                    C89219l.m154710a("feedAdapter");
                }
                if (aVar2.mo94652a(currentItem) == aVar.mo94720b()) {
                    return aVar;
                }
            }
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$e */
    public static final class C57412e implements AbstractC57449b {

        /* renamed from: a */
        final /* synthetic */ C57407a f130886a;

        static {
            Covode.recordClassIndex(67334);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57412e(C57407a aVar) {
            this.f130886a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57449b
        /* renamed from: a */
        public final void mo94679a(int i) {
            AbstractC57448a d = this.f130886a.mo94672d();
            if (d != null && this.f130886a.f130869i && i == d.mo94726h()) {
                C57417a a = C57407a.m104028a(this.f130886a);
                a.f130891a.mo123934a(d.mo94725g());
                this.f130886a.f130869i = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$f */
    public static final class C57413f implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final /* synthetic */ C57407a f130887a;

        static {
            Covode.recordClassIndex(67335);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57413f(C57407a aVar) {
            this.f130887a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
            if (r0.getCount() <= 3) goto L_0x00b4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00dd  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00f3  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x010d  */
        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageSelected(int r9) {
            /*
            // Method dump skipped, instructions count: 301
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3339e.C57407a.C57413f.onPageSelected(int):void");
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f130887a.f130868h && this.f130887a.f130867g && f == 0.0f && i2 == 0) {
                onPageSelected(i);
                this.f130887a.f130867g = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$h */
    public static final class C57415h implements C57442a.AbstractC57444a {

        /* renamed from: a */
        final /* synthetic */ C57407a f130889a;

        static {
            Covode.recordClassIndex(67337);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57415h(C57407a aVar) {
            this.f130889a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3343g.C57442a.AbstractC57444a
        /* renamed from: a */
        public final void mo94681a(MotionEvent motionEvent) {
            float f;
            float f2;
            ImageView poll;
            DataCenter f3;
            MethodCollector.m26663i(7037);
            C57407a aVar = this.f130889a;
            AbstractC57448a d = aVar.mo94672d();
            if (!(d == null || (f3 = d.mo94724f()) == null)) {
                f3.mo60191a("digg_aweme", (Object) null);
            }
            LikeLayout likeLayout = aVar.f130862b;
            if (likeLayout == null) {
                C89219l.m154710a("likeLayout");
            }
            if (motionEvent != null) {
                f = motionEvent.getRawX();
                f2 = motionEvent.getRawY();
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (likeLayout.f131173a.isEmpty()) {
                poll = new ImageView(likeLayout.f131174b);
                if (LikeLayout.f131172f == null) {
                    LikeLayout.f131172f = C0643b.m2369a(likeLayout.f131174b, 2131233013);
                }
            } else {
                poll = likeLayout.f131173a.poll();
            }
            poll.setImageDrawable(LikeLayout.f131172f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(likeLayout.f131176d, likeLayout.f131175c);
            int i = Build.VERSION.SDK_INT;
            layoutParams.topMargin = (int) (f2 - ((float) (likeLayout.f131175c / 2)));
            if (C0792v.m2768e(likeLayout) == 1) {
                f = ((float) likeLayout.f131178g) - f;
            }
            layoutParams.setMarginStart((int) (f - ((float) (likeLayout.f131176d / 2))));
            poll.setLayoutParams(layoutParams);
            if (poll.getParent() == null) {
                likeLayout.addView(poll);
            }
            float nextInt = (float) (likeLayout.f131177e.nextInt(40) - 20);
            poll.setRotation(nextInt);
            AnimationSet animationSet = new AnimationSet(false);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setFillAfter(true);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillBefore(true);
            scaleAnimation.setDuration(300);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.setDuration(500);
            animationSet2.setStartOffset(500);
            animationSet2.setFillAfter(true);
            animationSet2.setInterpolator(new DecelerateInterpolator());
            float nextInt2 = (((float) likeLayout.f131177e.nextInt(10)) + 20.0f) / 10.0f;
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            int b = (int) C13628n.m24520b(likeLayout.f131174b, 50.0f);
            float f4 = (float) (-(likeLayout.f131177e.nextInt(b) + b));
            double d2 = (double) f4;
            double d3 = (double) nextInt;
            Double.isNaN(d3);
            double tan = Math.tan((d3 * 3.141592653589793d) / 360.0d);
            Double.isNaN(d2);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d2 * tan), 0.0f, f4);
            animationSet2.addAnimation(scaleAnimation2);
            animationSet2.addAnimation(alphaAnimation);
            animationSet2.addAnimation(translateAnimation);
            animationSet.addAnimation(scaleAnimation);
            animationSet.addAnimation(animationSet2);
            poll.startAnimation(animationSet);
            animationSet.setAnimationListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0159: INVOKE  
                  (r8v0 'animationSet' android.view.animation.AnimationSet)
                  (wrap: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout$1 : 0x0156: CONSTRUCTOR  (r2v18 com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout$1) = 
                  (r0v2 'likeLayout' com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout)
                  (r1v5 'poll' android.widget.ImageView)
                 call: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout.1.<init>(com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout, android.widget.ImageView):void type: CONSTRUCTOR)
                 type: VIRTUAL call: android.view.animation.AnimationSet.setAnimationListener(android.view.animation.Animation$AnimationListener):void in method: com.ss.android.ugc.aweme.kids.commonfeed.e.a.h.a(android.view.MotionEvent):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0156: CONSTRUCTOR  (r2v18 com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout$1) = 
                  (r0v2 'likeLayout' com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout)
                  (r1v5 'poll' android.widget.ImageView)
                 call: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout.1.<init>(com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout, android.widget.ImageView):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.kids.commonfeed.e.a.h.a(android.view.MotionEvent):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 14 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.LikeLayout, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 20 more
                */
            /*
            // Method dump skipped, instructions count: 366
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3339e.C57407a.C57415h.mo94681a(android.view.MotionEvent):void");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C57417a m104028a(C57407a aVar) {
        C57417a aVar2 = aVar.f130866f;
        if (aVar2 == null) {
            C89219l.m154710a("playController");
        }
        return aVar2;
    }

    /* renamed from: b */
    public static final /* synthetic */ C57390a m104029b(C57407a aVar) {
        C57390a aVar2 = aVar.f130865e;
        if (aVar2 == null) {
            C89219l.m154710a("feedAdapter");
        }
        return aVar2;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$b */
    static final class View$OnClickListenerC57409b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C57407a f130881a;

        static {
            Covode.recordClassIndex(67331);
        }

        View$OnClickListenerC57409b(C57407a aVar) {
            this.f130881a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C57407a aVar = this.f130881a;
            C57417a aVar2 = aVar.f130866f;
            if (aVar2 == null) {
                C89219l.m154710a("playController");
            }
            if (!aVar2.mo94682a()) {
                C57417a aVar3 = aVar.f130866f;
                if (aVar3 == null) {
                    C89219l.m154710a("playController");
                }
                aVar3.mo94684c();
                IKidsWellbeingService a = aVar.mo94669a();
                if (a != null) {
                    a.mo95131a();
                }
                AbstractC57448a d = aVar.mo94672d();
                if (d != null) {
                    d.mo94722d();
                }
                aVar.mo94671c();
            }
        }
    }

    private C57407a(String str) {
        C89219l.m154721d(str, "");
        this.f130873m = str;
        this.f130874n = null;
        this.f130867g = true;
        this.f130868h = true;
        this.f130869i = true;
        this.f130872l = new ArrayList();
        this.f130879s = C89250i.m154773a((AbstractC89171a) C57416i.f130890a);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (message != null && message.what == 0) {
            C57417a aVar = this.f130866f;
            if (aVar == null) {
                C89219l.m154710a("playController");
            }
            if (aVar.mo94682a()) {
                C57417a aVar2 = this.f130866f;
                if (aVar2 == null) {
                    C89219l.m154710a("playController");
                }
                aVar2.mo94685d();
                IKidsWellbeingService a = mo94669a();
                if (a != null) {
                    a.mo95133b();
                }
                AbstractC57448a d = mo94672d();
                if (d != null) {
                    d.mo94723e();
                }
                ImageView imageView = this.f130863c;
                if (imageView == null) {
                    C89219l.m154710a("ivPlay");
                }
                imageView.setVisibility(0);
                imageView.setScaleX(2.5f);
                imageView.setScaleY(2.5f);
                imageView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                imageView.setSelected(false);
                return;
            }
            C57417a aVar3 = this.f130866f;
            if (aVar3 == null) {
                C89219l.m154710a("playController");
            }
            aVar3.mo94684c();
            IKidsWellbeingService a2 = mo94669a();
            if (a2 != null) {
                a2.mo95131a();
            }
            AbstractC57448a d2 = mo94672d();
            if (d2 != null) {
                d2.mo94722d();
            }
            mo94671c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81910b, com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49887w
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70393a(android.view.View r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 307
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3339e.C57407a.mo70393a(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.e.a$g */
    static final class View$OnLayoutChangeListenerC57414g implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ C57407a f130888a;

        static {
            Covode.recordClassIndex(67336);
        }

        View$OnLayoutChangeListenerC57414g(C57407a aVar) {
            this.f130888a = aVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i != i5 || i2 != i6 || i4 != i8 || i3 != i7) {
                this.f130888a.mo94670b();
            }
        }
    }
}
