package com.p2082ss.android.ugc.aweme.detail.transition;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.app.C0569a;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34717d;
import com.p2082ss.android.ugc.aweme.detail.transition.C41337d;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.transition.a */
public final class C41327a {

    /* renamed from: a */
    public static final C41327a f96452a = new C41327a();

    private C41327a() {
    }

    static {
        Covode.recordClassIndex(49216);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.a$b */
    public static final class ViewTreeObserver$OnPreDrawListenerC41329b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ View f96455a;

        /* renamed from: b */
        final /* synthetic */ Activity f96456b;

        static {
            Covode.recordClassIndex(49218);
        }

        public final boolean onPreDraw() {
            this.f96455a.getViewTreeObserver().removeOnPreDrawListener(this);
            try {
                C0569a.m2185c(this.f96456b);
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC41329b(View view, Activity activity) {
            this.f96455a = view;
            this.f96456b = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.a$c */
    public static final class ViewTreeObserver$OnPreDrawListenerC41330c implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ View f96457a;

        /* renamed from: b */
        final /* synthetic */ Activity f96458b;

        static {
            Covode.recordClassIndex(49219);
        }

        public final boolean onPreDraw() {
            this.f96457a.getViewTreeObserver().removeOnPreDrawListener(this);
            try {
                C0569a.m2185c(this.f96458b);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        ViewTreeObserver$OnPreDrawListenerC41330c(View view, Activity activity) {
            this.f96457a = view;
            this.f96458b = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.a$e */
    public static final class C41332e implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ DataCenter f96463a;

        static {
            Covode.recordClassIndex(49221);
        }

        public final void onTransitionPause(Transition transition) {
        }

        public final void onTransitionResume(Transition transition) {
        }

        C41332e(DataCenter dataCenter) {
            this.f96463a = dataCenter;
        }

        public final void onTransitionCancel(Transition transition) {
            C41337d.C41338a.m83197a().mo70604a();
        }

        public final void onTransitionStart(Transition transition) {
            C41337d.C41338a.m83197a().mo70604a();
        }

        public final void onTransitionEnd(Transition transition) {
            this.f96463a.mo60191a("feed_enter_transition_end", (Object) null);
        }
    }

    /* renamed from: a */
    public static final void m83189a(Activity activity) {
        C89219l.m154721d(activity, "");
        Window window = activity.getWindow();
        C89219l.m154716b(window, "");
        View decorView = window.getDecorView();
        C89219l.m154716b(decorView, "");
        decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC41330c(decorView, activity));
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.a$a */
    public static final class SharedElementCallbackC41328a extends SharedElementCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f96453a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41336c f96454b;

        static {
            Covode.recordClassIndex(49217);
        }

        public SharedElementCallbackC41328a(Activity activity, AbstractC41336c cVar) {
            this.f96453a = activity;
            this.f96454b = cVar;
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            C41327a.m83191a(this.f96453a, this.f96454b, list, map);
            super.onMapSharedElements(list, map);
        }

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Parcelable onCaptureSharedElementSnapshot;
            MethodCollector.m26663i(6669);
            if (view != null) {
                view.setAlpha(1.0f);
                if (!view.isAttachedToWindow()) {
                    Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    C89219l.m154716b(createBitmap, "");
                    view.draw(new Canvas(createBitmap));
                    MethodCollector.m26664o(6669);
                    return createBitmap;
                }
            }
            FeedShareElementInfo a = FeedShareElementInfo.m83187a(view);
            if (a == null || (onCaptureSharedElementSnapshot = super.onCaptureSharedElementSnapshot(view, matrix, rectF)) == null) {
                Parcelable onCaptureSharedElementSnapshot2 = super.onCaptureSharedElementSnapshot(view, matrix, rectF);
                C89219l.m154716b(onCaptureSharedElementSnapshot2, "");
                MethodCollector.m26664o(6669);
                return onCaptureSharedElementSnapshot2;
            }
            a.f96450b = onCaptureSharedElementSnapshot;
            MethodCollector.m26664o(6669);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.a$d */
    public static final class SharedElementCallbackC41331d extends SharedElementCallback {

        /* renamed from: a */
        final /* synthetic */ Activity f96459a;

        /* renamed from: b */
        final /* synthetic */ AbstractC41336c f96460b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean f96461c;

        /* renamed from: d */
        final /* synthetic */ DataCenter f96462d;

        static {
            Covode.recordClassIndex(49220);
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
            C41327a.m83191a(this.f96459a, this.f96460b, list, map);
            super.onMapSharedElements(list, map);
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            if (parcelable instanceof FeedShareElementInfo) {
                FeedShareElementInfo feedShareElementInfo = (FeedShareElementInfo) parcelable;
                View onCreateSnapshotView = super.onCreateSnapshotView(context, feedShareElementInfo.f96450b);
                FeedShareElementInfo.m83188a(onCreateSnapshotView, feedShareElementInfo);
                C89219l.m154716b(onCreateSnapshotView, "");
                return onCreateSnapshotView;
            }
            View onCreateSnapshotView2 = super.onCreateSnapshotView(context, parcelable);
            C89219l.m154716b(onCreateSnapshotView2, "");
            return onCreateSnapshotView2;
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<? extends View> list2, List<? extends View> list3) {
            C89219l.m154721d(list, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(list3, "");
            super.onSharedElementEnd(list, list2, list3);
            this.f96461c.set(false);
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<? extends View> list2, List<? extends View> list3) {
            FeedShareElementInfo a;
            super.onSharedElementStart(list, list2, list3);
            if (list2 != null) {
                int size = list2.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) list2.get(i);
                    if (this.f96461c.get()) {
                        View view2 = null;
                        if (list3 != null && !C34717d.m70908a(list3) && i < list3.size()) {
                            view2 = (View) list3.get(i);
                        }
                        a = FeedShareElementInfo.m83187a(view2);
                    } else {
                        a = FeedShareElementInfo.m83187a(view);
                    }
                    if (a != null) {
                        a.f96451c = this.f96461c.get();
                        FeedShareElementInfo.m83188a(view, a);
                    }
                }
            }
            Activity activity = this.f96459a;
            DataCenter dataCenter = this.f96462d;
            C89219l.m154716b(dataCenter, "");
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition(new ChangeClipBounds());
            transitionSet.addTransition(new ChangeTransform());
            transitionSet.addTransition(new ChangeBounds());
            transitionSet.addTransition(new ChangeImageTransform());
            transitionSet.setDuration(300L);
            transitionSet.setInterpolator((TimeInterpolator) new AccelerateDecelerateInterpolator());
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            window.setSharedElementEnterTransition(transitionSet);
            Fade fade = new Fade();
            fade.setDuration(300);
            fade.setInterpolator(new AccelerateDecelerateInterpolator());
            Window window2 = activity.getWindow();
            C89219l.m154716b(window2, "");
            window2.setEnterTransition(fade);
            Fade fade2 = new Fade();
            fade2.setDuration(300);
            fade2.setInterpolator(new AccelerateDecelerateInterpolator());
            Window window3 = activity.getWindow();
            C89219l.m154716b(window3, "");
            window3.setExitTransition(fade2);
            Window window4 = activity.getWindow();
            C89219l.m154716b(window4, "");
            Transition enterTransition = window4.getEnterTransition();
            Window window5 = activity.getWindow();
            C89219l.m154716b(window5, "");
            Transition exitTransition = window5.getExitTransition();
            if (enterTransition != null) {
                enterTransition.excludeTarget("android:status:background", true);
                enterTransition.excludeTarget("android:navigation:background", true);
            }
            if (exitTransition != null) {
                exitTransition.excludeTarget("android:status:background", true);
                exitTransition.excludeTarget("android:navigation:background", true);
            }
            transitionSet.addListener((Transition.TransitionListener) new C41332e(dataCenter));
            if (this.f96461c.get()) {
                this.f96462d.mo60191a("feed_transition_state", (Object) true);
            }
        }

        public SharedElementCallbackC41331d(Activity activity, AbstractC41336c cVar, AtomicBoolean atomicBoolean, DataCenter dataCenter) {
            this.f96459a = activity;
            this.f96460b = cVar;
            this.f96461c = atomicBoolean;
            this.f96462d = dataCenter;
        }
    }

    /* renamed from: a */
    public static final void m83190a(Activity activity, int i) {
        C89219l.m154721d(activity, "");
        if (i == -1) {
            C0569a.m2184b(activity);
            Window window = activity.getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            decorView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC41329b(decorView, activity));
        }
    }

    /* renamed from: a */
    public static void m83191a(Activity activity, AbstractC41336c cVar, List<String> list, Map<String, View> map) {
        FeedShareElementInfo<?>[] a = cVar.mo70603a();
        if (list != null) {
            list.clear();
        }
        if (map != null) {
            map.clear();
        }
        for (FeedShareElementInfo<?> feedShareElementInfo : a) {
            View view = feedShareElementInfo.f96449a;
            if (view != null) {
                Window window = activity.getWindow();
                C89219l.m154716b(window, "");
                View decorView = window.getDecorView();
                C89219l.m154716b(decorView, "");
                Rect rect = new Rect();
                decorView.getHitRect(rect);
                if (view.getLocalVisibleRect(rect)) {
                    if (list != null) {
                        list.add(String.valueOf(C0792v.m2778l(view)));
                    }
                    if (map != null) {
                        map.put(String.valueOf(C0792v.m2778l(view)), view);
                    }
                }
            }
        }
    }
}
