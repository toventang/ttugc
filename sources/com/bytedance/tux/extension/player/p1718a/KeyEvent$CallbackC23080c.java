package com.bytedance.tux.extension.player.p1718a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.view.Window$CallbackC0286i;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.C23100g;
import com.bytedance.tux.extension.player.EnumC23096c;
import com.bytedance.tux.extension.player.view.TextureVideoView;
import com.bytedance.tux.extension.player.view.TuxPlayerView;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.bytedance.tux.extension.player.a.c */
public final class KeyEvent$CallbackC23080c implements KeyEvent.Callback {

    /* renamed from: a */
    public static final int[] f54635a = new int[2];

    /* renamed from: b */
    public static int f54636b;

    /* renamed from: c */
    public static int f54637c;

    /* renamed from: d */
    public static Window$CallbackC0286i f54638d;

    /* renamed from: e */
    public static Window.Callback f54639e;

    /* renamed from: f */
    public static TuxPlayerView f54640f;

    /* renamed from: g */
    public static AbstractC23081a f54641g;

    /* renamed from: h */
    public static ViewGroup f54642h;

    /* renamed from: i */
    public static ViewGroup.LayoutParams f54643i;

    /* renamed from: j */
    public static ViewGroup f54644j;

    /* renamed from: k */
    public static ImageView f54645k;

    /* renamed from: l */
    static float f54646l;

    /* renamed from: m */
    static float f54647m;

    /* renamed from: n */
    static float f54648n;

    /* renamed from: o */
    static float f54649o;

    /* renamed from: p */
    public static EnumC23096c f54650p = EnumC23096c.PREVIEW;

    /* renamed from: q */
    public static final KeyEvent$CallbackC23080c f54651q = new KeyEvent$CallbackC23080c();

    /* renamed from: com.bytedance.tux.extension.player.a.c$a */
    public interface AbstractC23081a {
        static {
            Covode.recordClassIndex(27005);
        }

        /* renamed from: a */
        void mo37523a(EnumC23096c cVar);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C89219l.m154719c(keyEvent, "");
        return i == 4;
    }

    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: com.bytedance.tux.extension.player.a.c$e */
    public static final class C23086e extends AnimatorListenerAdapter {
        static {
            Covode.recordClassIndex(27010);
        }

        C23086e() {
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154719c(animator, "");
            KeyEvent$CallbackC23080c.m43525a((View) KeyEvent$CallbackC23080c.f54645k);
            KeyEvent$CallbackC23080c.m43530b();
        }
    }

    private KeyEvent$CallbackC23080c() {
    }

    /* renamed from: com.bytedance.tux.extension.player.a.c$c */
    public static final class C23083c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ TuxPlayerView f54653a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f54654b;

        static {
            Covode.recordClassIndex(27007);
        }

        /* renamed from: com.bytedance.tux.extension.player.a.c$c$a */
        static final class RunnableC23084a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ImageView f54655a;

            static {
                Covode.recordClassIndex(27008);
            }

            RunnableC23084a(ImageView imageView) {
                this.f54655a = imageView;
            }

            public final void run() {
                KeyEvent$CallbackC23080c.m43525a((View) this.f54655a);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154719c(animator, "");
            KeyEvent$CallbackC23080c.f54650p = EnumC23096c.PORTRAIT;
            KeyEvent$CallbackC23080c.m43525a(this.f54653a);
            ViewGroup.LayoutParams layoutParams = this.f54653a.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            this.f54653a.setLayoutParams(layoutParams);
            ViewGroup viewGroup = this.f54654b;
            KeyEvent$CallbackC23080c.m43526a(viewGroup, this.f54653a, Integer.valueOf(viewGroup.getChildCount() - 1));
            AbstractC23081a aVar = KeyEvent$CallbackC23080c.f54641g;
            if (aVar != null) {
                aVar.mo37523a(KeyEvent$CallbackC23080c.f54650p);
            }
            ImageView imageView = KeyEvent$CallbackC23080c.f54645k;
            if (imageView != null) {
                imageView.post(new RunnableC23084a(imageView));
            }
        }

        public C23083c(TuxPlayerView tuxPlayerView, ViewGroup viewGroup) {
            this.f54653a = tuxPlayerView;
            this.f54654b = viewGroup;
        }
    }

    static {
        Covode.recordClassIndex(27004);
    }

    /* renamed from: b */
    public static void m43530b() {
        f54644j = null;
        f54645k = null;
        f54640f = null;
        f54642h = null;
        f54643i = null;
        f54641g = null;
        f54638d = null;
        f54639e = null;
    }

    /* renamed from: a */
    public static boolean m43529a() {
        if (f54650p == EnumC23096c.PORTRAIT || f54650p == EnumC23096c.HORIZONTAL) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static void m43531c() {
        Context context;
        Window window;
        Context context2;
        Window window$player_release;
        Window window$player_release2;
        View c;
        TuxPlayerView tuxPlayerView = f54640f;
        if (tuxPlayerView != null) {
            context = tuxPlayerView.getContext();
        } else {
            context = null;
        }
        TuxPlayerView tuxPlayerView2 = f54640f;
        if (tuxPlayerView2 != null) {
            window = tuxPlayerView2.getWindow$player_release();
        } else {
            window = null;
        }
        m43527a(window);
        if (f54650p == EnumC23096c.PORTRAIT) {
            f54650p = EnumC23096c.PREVIEW;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            m43528a(f54645k);
            m43526a(f54644j, f54645k, null);
            m43525a(f54640f);
            TuxPlayerView tuxPlayerView3 = f54640f;
            if (tuxPlayerView3 != null) {
                tuxPlayerView3.setLayoutParams(f54643i);
            }
            m43526a(f54642h, f54640f, null);
            TuxPlayerView tuxPlayerView4 = f54640f;
            if (!(tuxPlayerView4 == null || (window$player_release2 = tuxPlayerView4.getWindow$player_release()) == null)) {
                TuxPlayerView tuxPlayerView5 = f54640f;
                if (!(tuxPlayerView5 == null || (c = tuxPlayerView5.mo37581c(R.id.e7_)) == null)) {
                    c.setVisibility(8);
                }
                if (context != null) {
                    C23073a.C23074a.m43510a((ActivityC0945e) context, window$player_release2).mo37496a(false, false).mo37499b(true).mo37493a().mo37504e(-1).mo37502c(true).f54627a.mo33415d();
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            AbstractC23081a aVar = f54641g;
            if (aVar != null) {
                aVar.mo37523a(f54650p);
            }
            ofFloat.addUpdateListener(C23085d.f54656a);
            ofFloat.addListener(new C23086e());
            C89219l.m154709a((Object) ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.start();
        } else if (f54650p == EnumC23096c.HORIZONTAL) {
            f54650p = EnumC23096c.PREVIEW;
            if (!(context instanceof Activity)) {
                context2 = null;
            } else {
                context2 = context;
            }
            m43524a((Activity) context2, 1);
            m43525a(f54640f);
            TuxPlayerView tuxPlayerView6 = f54640f;
            if (tuxPlayerView6 != null) {
                tuxPlayerView6.setLayoutParams(f54643i);
            }
            m43526a(f54642h, f54640f, null);
            TuxPlayerView tuxPlayerView7 = f54640f;
            if (!(tuxPlayerView7 == null || (window$player_release = tuxPlayerView7.getWindow$player_release()) == null)) {
                if (context != null) {
                    C23073a.C23074a.m43510a((ActivityC0945e) context, window$player_release).mo37496a(false, false).mo37499b(true).mo37493a().mo37504e(-1).mo37502c(true).f54627a.mo33415d();
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
            AbstractC23081a aVar2 = f54641g;
            if (aVar2 != null) {
                aVar2.mo37523a(f54650p);
            }
            m43530b();
        }
    }

    /* renamed from: a */
    private static void m43527a(Window window) {
        Window.Callback callback = f54639e;
        if (callback != null && window != null) {
            window.setCallback(callback);
        }
    }

    /* renamed from: a */
    public static void m43528a(ImageView imageView) {
        TextureVideoView textureVideoView;
        Bitmap videoFrame;
        TuxPlayerView tuxPlayerView = f54640f;
        if (tuxPlayerView != null && (textureVideoView = (TextureVideoView) tuxPlayerView.mo37581c(R.id.fe8)) != null && (videoFrame = textureVideoView.getVideoFrame()) != null && imageView != null) {
            imageView.setImageBitmap(videoFrame);
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.a.c$f */
    public static final class C23087f extends Window$CallbackC0286i {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f54657a;

        static {
            Covode.recordClassIndex(27011);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0286i
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            C89219l.m154719c(keyEvent, "");
            if (KeyEvent$CallbackC23080c.m43529a() && keyEvent.getKeyCode() == 4) {
                KeyEvent.Callback callback = KeyEvent$CallbackC23080c.f54651q;
                if (keyEvent.dispatch(callback, new KeyEvent.DispatcherState(), callback)) {
                    return true;
                }
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23087f(C89233z.C89238e eVar, Window.Callback callback) {
            super(callback);
            this.f54657a = eVar;
        }
    }

    /* renamed from: a */
    public static void m43525a(View view) {
        MethodCollector.m26663i(9095);
        if (view == null || view.getParent() == null) {
            MethodCollector.m26664o(9095);
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup == null) {
            MethodCollector.m26664o(9095);
            return;
        }
        try {
            viewGroup.removeView(view);
            MethodCollector.m26664o(9095);
        } catch (Exception unused) {
            MethodCollector.m26664o(9095);
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.a.c$b */
    public static final class C23082b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ Rect f54652a;

        static {
            Covode.recordClassIndex(27006);
        }

        public C23082b(Rect rect) {
            this.f54652a = rect;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams;
            C89219l.m154709a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                KeyEvent$CallbackC23080c.f54646l = (float) this.f54652a.width();
                KeyEvent$CallbackC23080c.f54647m = (float) this.f54652a.height();
                C23100g a = C23094e.m43536a(KeyEvent$CallbackC23080c.f54637c, KeyEvent$CallbackC23080c.f54636b, (int) KeyEvent$CallbackC23080c.f54646l, (int) KeyEvent$CallbackC23080c.f54647m);
                KeyEvent$CallbackC23080c.f54648n = (float) a.f54674a;
                KeyEvent$CallbackC23080c.f54649o = (float) a.f54675b;
                ImageView imageView = KeyEvent$CallbackC23080c.f54645k;
                if (imageView == null || (layoutParams = imageView.getLayoutParams()) == null) {
                    throw new C89388w("null cannot be cast to non-null type");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = (int) (((float) KeyEvent$CallbackC23080c.f54635a[1]) - ((((float) KeyEvent$CallbackC23080c.f54635a[1]) - ((KeyEvent$CallbackC23080c.f54647m - KeyEvent$CallbackC23080c.f54649o) / 2.0f)) * floatValue));
                marginLayoutParams.leftMargin = (int) (((float) KeyEvent$CallbackC23080c.f54635a[0]) - ((((float) KeyEvent$CallbackC23080c.f54635a[0]) - ((KeyEvent$CallbackC23080c.f54646l - KeyEvent$CallbackC23080c.f54648n) / 2.0f)) * floatValue));
                marginLayoutParams.width = (int) (((float) KeyEvent$CallbackC23080c.f54637c) + ((KeyEvent$CallbackC23080c.f54648n - ((float) KeyEvent$CallbackC23080c.f54637c)) * floatValue));
                marginLayoutParams.height = (int) (((float) KeyEvent$CallbackC23080c.f54636b) + (floatValue * (KeyEvent$CallbackC23080c.f54649o - ((float) KeyEvent$CallbackC23080c.f54636b))));
                ImageView imageView2 = KeyEvent$CallbackC23080c.f54645k;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.extension.player.a.c$d */
    public static final class C23085d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public static final C23085d f54656a = new C23085d();

        static {
            Covode.recordClassIndex(27009);
        }

        C23085d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154709a((Object) valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ImageView imageView = KeyEvent$CallbackC23080c.f54645k;
                if (imageView == null) {
                    C89219l.m154707a();
                }
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) (((KeyEvent$CallbackC23080c.f54647m - KeyEvent$CallbackC23080c.f54649o) / 2.0f) + ((((float) KeyEvent$CallbackC23080c.f54635a[1]) - ((KeyEvent$CallbackC23080c.f54647m - KeyEvent$CallbackC23080c.f54649o) / 2.0f)) * floatValue));
                    marginLayoutParams.leftMargin = (int) (((KeyEvent$CallbackC23080c.f54646l - KeyEvent$CallbackC23080c.f54648n) / 2.0f) + ((((float) KeyEvent$CallbackC23080c.f54635a[0]) - ((KeyEvent$CallbackC23080c.f54646l - KeyEvent$CallbackC23080c.f54648n) / 2.0f)) * floatValue));
                    float f = 1.0f - floatValue;
                    marginLayoutParams.width = (int) (((float) KeyEvent$CallbackC23080c.f54637c) + ((KeyEvent$CallbackC23080c.f54648n - ((float) KeyEvent$CallbackC23080c.f54637c)) * f));
                    marginLayoutParams.height = (int) (((float) KeyEvent$CallbackC23080c.f54636b) + (f * (KeyEvent$CallbackC23080c.f54649o - ((float) KeyEvent$CallbackC23080c.f54636b))));
                    ImageView imageView2 = KeyEvent$CallbackC23080c.f54645k;
                    if (imageView2 != null) {
                        imageView2.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: a */
    public static void m43524a(Activity activity, int i) {
        if (activity != null) {
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C89219l.m154719c(keyEvent, "");
        if (!m43529a() || i != 4 || keyEvent.isCanceled()) {
            return false;
        }
        m43531c();
        return true;
    }

    /* renamed from: a */
    public static void m43526a(ViewGroup viewGroup, View view, Integer num) {
        int i;
        MethodCollector.m26663i(9233);
        if (viewGroup != null) {
            if (num != null) {
                try {
                    i = num.intValue();
                } catch (Exception unused) {
                    MethodCollector.m26664o(9233);
                    return;
                }
            } else {
                i = viewGroup.getChildCount();
            }
            viewGroup.addView(view, i);
            MethodCollector.m26664o(9233);
            return;
        }
        MethodCollector.m26664o(9233);
    }
}
