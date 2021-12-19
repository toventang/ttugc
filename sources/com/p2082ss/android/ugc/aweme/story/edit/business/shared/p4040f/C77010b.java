package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4040f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.publish.C65504a;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.story.IStoryPublishAnimateListener;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.animationInterpolatorC74267a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b */
public final class C77010b {

    /* renamed from: e */
    public static final C77011a f172777e = new C77011a((byte) 0);

    /* renamed from: a */
    public volatile Bitmap f172778a;

    /* renamed from: b */
    public final AbstractC31071f f172779b;

    /* renamed from: c */
    public final AbstractC72510a f172780c;

    /* renamed from: d */
    public final C65504a f172781d;

    /* renamed from: f */
    private final AbstractC89244h f172782f = C89250i.m154773a((AbstractC89171a) new C77017g(this));

    /* renamed from: g */
    private final Activity f172783g;

    static {
        Covode.recordClassIndex(90009);
    }

    /* renamed from: b */
    private final boolean m134634b() {
        return ((Boolean) this.f172782f.getValue()).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$a */
    public static final class C77011a {
        static {
            Covode.recordClassIndex(90010);
        }

        private C77011a() {
        }

        public /* synthetic */ C77011a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$d */
    public static final class C77014d implements TypeEvaluator<Float> {
        static {
            Covode.recordClassIndex(90013);
        }

        C77014d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
            float floatValue = f2.floatValue();
            float floatValue2 = f3.floatValue();
            if (f >= 0.5f) {
                floatValue += (floatValue2 - floatValue) * ((f * 2.0f) - 1.0f);
            }
            return Float.valueOf(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$j */
    public static final class C77020j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C77020j f172802a = new C77020j();

        static {
            Covode.recordClassIndex(90019);
        }

        C77020j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$g */
    static final class C77017g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C77010b f172797a;

        static {
            Covode.recordClassIndex(90016);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77017g(C77010b bVar) {
            super(0);
            this.f172797a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (Build.VERSION.SDK_INT < 21 || !this.f172797a.f172781d.f147725a) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$e */
    public static final class C77015e implements TypeEvaluator<Float> {

        /* renamed from: a */
        private final animationInterpolatorC74267a f172793a = new animationInterpolatorC74267a(0.36d, 0.12d, 0.92d, 0.87d);

        /* renamed from: b */
        private final FloatEvaluator f172794b = new FloatEvaluator();

        static {
            Covode.recordClassIndex(90014);
        }

        C77015e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
            Float evaluate = this.f172794b.evaluate(this.f172793a.getInterpolation(f), (Number) f2, (Number) f3);
            C89219l.m154716b(evaluate, "");
            return evaluate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$f */
    public static final class C77016f implements TypeEvaluator<Float> {

        /* renamed from: a */
        private final animationInterpolatorC74267a f172795a = new animationInterpolatorC74267a(0.36d, 0.34d, 0.82d, 0.95d);

        /* renamed from: b */
        private final FloatEvaluator f172796b = new FloatEvaluator();

        static {
            Covode.recordClassIndex(90015);
        }

        C77016f() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ Float evaluate(float f, Float f2, Float f3) {
            Float evaluate = this.f172796b.evaluate(this.f172795a.getInterpolation(f), (Number) f2, (Number) f3);
            C89219l.m154716b(evaluate, "");
            return evaluate;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$k */
    public static final class RunnableC77021k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f172803a;

        static {
            Covode.recordClassIndex(90020);
        }

        RunnableC77021k(C89233z.C89238e eVar) {
            this.f172803a = eVar;
        }

        public final void run() {
            for (IStoryPublishAnimateListener iStoryPublishAnimateListener : new ArrayList(C77023d.f172808a)) {
                C89219l.m154716b(iStoryPublishAnimateListener, "");
                iStoryPublishAnimateListener.onAnimateStart();
            }
            this.f172803a.element.start();
        }
    }

    /* renamed from: a */
    public final C1731i<C89391z> mo120550a() {
        if (!m134634b()) {
            C1731i<C89391z> a = C1731i.m5633a(C89391z.f203057a);
            C89219l.m154716b(a, "");
            return a;
        }
        C1731i<C89391z> b = C1731i.m5640b(new CallableC77018h(this, this.f172783g.findViewById(16908290)), C1731i.f5562a);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$c */
    public static final class C77013c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C77010b f172788a;

        /* renamed from: b */
        final /* synthetic */ C77022c f172789b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f172790c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f172791d;

        /* renamed from: e */
        private final AtomicBoolean f172792e = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(90012);
        }

        /* renamed from: a */
        private final void m134636a() {
            if (this.f172792e.compareAndSet(false, true)) {
                this.f172790c.getOverlay().remove(this.f172789b);
                this.f172789b.setAlpha(0.0f);
                this.f172789b.setImageDrawable(new ColorDrawable(0));
                this.f172788a.f172778a = null;
                for (IStoryPublishAnimateListener iStoryPublishAnimateListener : new ArrayList(C77023d.f172808a)) {
                    C89219l.m154716b(iStoryPublishAnimateListener, "");
                    iStoryPublishAnimateListener.onAnimateFinish();
                }
                this.f172791d.invoke();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            m134636a();
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            m134636a();
        }

        C77013c(C77010b bVar, C77022c cVar, ViewGroup viewGroup, AbstractC89171a aVar) {
            this.f172788a = bVar;
            this.f172789b = cVar;
            this.f172790c = viewGroup;
            this.f172791d = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$h */
    public static final class CallableC77018h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C77010b f172798a;

        /* renamed from: b */
        final /* synthetic */ View f172799b;

        static {
            Covode.recordClassIndex(90017);
        }

        CallableC77018h(C77010b bVar, View view) {
            this.f172798a = bVar;
            this.f172799b = view;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Bitmap c;
            Bitmap bitmap;
            MethodCollector.m26663i(6704);
            C77010b bVar = this.f172798a;
            AbstractC31071f fVar = bVar.f172779b;
            Bitmap bitmap2 = null;
            if (!(fVar == null || (c = fVar.mo56340c()) == null)) {
                View view = this.f172799b;
                C89219l.m154716b(view, "");
                C89219l.m154721d(view, "");
                if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                    bitmap = null;
                } else {
                    bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmap);
                    if (view.getBackground() != null) {
                        view.getBackground().draw(canvas);
                    }
                    view.draw(canvas);
                }
                int b = this.f172798a.f172780c.mo114807b();
                int c2 = this.f172798a.f172780c.mo114810c();
                float f = (float) this.f172798a.f172780c.mo114795a().leftMargin;
                float f2 = (float) this.f172798a.f172780c.mo114795a().topMargin;
                if (bitmap == null) {
                    bitmap2 = c;
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(Math.max(c.getWidth(), bitmap.getWidth()), Math.max(c.getHeight(), bitmap.getHeight()), c.getConfig());
                    Canvas canvas2 = new Canvas(createBitmap);
                    Matrix matrix = new Matrix();
                    matrix.postScale((((float) b) * 1.0f) / ((float) c.getWidth()), (((float) c2) * 1.0f) / ((float) c.getHeight()));
                    matrix.postTranslate(f, f2);
                    canvas2.drawBitmap(c, matrix, null);
                    canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    c.recycle();
                    bitmap.recycle();
                    C89219l.m154716b(createBitmap, "");
                    bitmap2 = createBitmap;
                }
            }
            bVar.f172778a = bitmap2;
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(6704);
            return zVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$i */
    public static final class C77019i<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C77010b f172800a;

        /* renamed from: b */
        final /* synthetic */ Intent f172801b;

        static {
            Covode.recordClassIndex(90018);
        }

        public C77019i(C77010b bVar, Intent intent) {
            this.f172800a = bVar;
            this.f172801b = intent;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C77010b.m134633a(this.f172800a, this.f172801b, null, 2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.f.b$b */
    public static final class C77012b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C77010b f172784a;

        /* renamed from: b */
        final /* synthetic */ C77022c f172785b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f172786c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89171a f172787d;

        static {
            Covode.recordClassIndex(90011);
        }

        C77012b(C77010b bVar, C77022c cVar, ViewGroup viewGroup, AbstractC89171a aVar) {
            this.f172784a = bVar;
            this.f172785b = cVar;
            this.f172786c = viewGroup;
            this.f172787d = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float height = (((float) (this.f172785b.getHeight() - this.f172785b.getWidth())) / 2.0f) * animatedFraction;
            this.f172785b.setRenderRadius((((float) this.f172785b.getWidth()) / 2.0f) * animatedFraction);
            C77022c cVar = this.f172785b;
            cVar.f172804a[0] = 0.0f;
            cVar.f172804a[1] = height;
            cVar.f172804a[2] = 0.0f;
            cVar.f172804a[3] = height;
            this.f172785b.invalidate();
            for (IStoryPublishAnimateListener iStoryPublishAnimateListener : new ArrayList(C77023d.f172808a)) {
                C89219l.m154716b(iStoryPublishAnimateListener, "");
                iStoryPublishAnimateListener.onAnimateUpdate(animatedFraction);
            }
        }
    }

    public C77010b(Activity activity, AbstractC31071f fVar, AbstractC72510a aVar, C65504a aVar2) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f172783g = activity;
        this.f172779b = fVar;
        this.f172780c = aVar;
        this.f172781d = aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ void m134633a(C77010b bVar, Intent intent, AbstractC89171a aVar, int i) {
        boolean z;
        Window window;
        View decorView;
        AbstractC89171a aVar2 = aVar;
        if ((i & 1) != 0) {
            intent = null;
        }
        if ((i & 2) != 0) {
            aVar2 = C77020j.f172802a;
        }
        C89219l.m154721d(aVar2, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
        C89219l.m154716b(applicationService, "");
        Class<? extends ActivityC0945e> e = applicationService.mo93776e();
        C89219l.m154716b(e, "");
        Activity findActivityInstance = C63244g.m114602a().mo73284l().findActivityInstance(e);
        if (!bVar.m134634b() || bVar.f172778a == null || findActivityInstance == null) {
            z = false;
        } else {
            z = true;
            ViewGroup viewGroup = (ViewGroup) findActivityInstance.findViewById(16908290);
            C89219l.m154716b(viewGroup, "");
            int width = viewGroup.getWidth();
            int height = viewGroup.getHeight();
            C77022c cVar = new C77022c(findActivityInstance);
            cVar.setImageBitmap(bVar.f172778a);
            cVar.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            cVar.layout(0, 0, width, height);
            viewGroup.getOverlay().add(cVar);
            C77016f fVar = new C77016f();
            C77015e eVar2 = new C77015e();
            C77014d dVar = new C77014d();
            float[] invoke = bVar.f172781d.f147726b.invoke();
            cVar.setPivotX(0.0f);
            cVar.setPivotY(((float) cVar.getHeight()) / 2.0f);
            PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.1f);
            PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.1f);
            PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("translationX", 0.0f, invoke[0] - ((((float) cVar.getWidth()) * 0.1f) / 2.0f));
            ofFloat3.setEvaluator(eVar2);
            PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("translationY", 0.0f, invoke[1] - ((float) (cVar.getHeight() / 2)));
            ofFloat4.setEvaluator(fVar);
            PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat("alpha", 1.0f, 0.3f);
            ofFloat5.setEvaluator(dVar);
            T t = (T) ObjectAnimator.ofPropertyValuesHolder(cVar, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5);
            t.setDuration(500);
            t.setInterpolator(new animationInterpolatorC74267a(0.39d, 0.05d, 0.61d, 0.94d));
            t.addUpdateListener(new C77012b(bVar, cVar, viewGroup, aVar2));
            t.addListener(new C77013c(bVar, cVar, viewGroup, aVar2));
            C89219l.m154716b(t, "");
            eVar.element = t;
        }
        Intent intent2 = new Intent(bVar.f172783g, e);
        intent2.addFlags(603979776);
        if (z) {
            intent2.addFlags(65536);
        }
        Activity activity = bVar.f172783g;
        if (intent != null) {
            intent2 = intent;
        }
        C84349a.m145093a(intent2, activity);
        activity.startActivity(intent2);
        if (!z || eVar.element == null) {
            aVar2.invoke();
            return;
        }
        bVar.f172783g.overridePendingTransition(0, R.anim.e5);
        if (findActivityInstance != null && (window = findActivityInstance.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new RunnableC77021k(eVar));
        }
    }
}
