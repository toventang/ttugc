package com.bytedance.tux.extension.player.view;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.Window$CallbackC0286i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.extension.player.AbstractC23075a;
import com.bytedance.tux.extension.player.AbstractC23095b;
import com.bytedance.tux.extension.player.AbstractC23099f;
import com.bytedance.tux.extension.player.C23098e;
import com.bytedance.tux.extension.player.C23100g;
import com.bytedance.tux.extension.player.EnumC23096c;
import com.bytedance.tux.extension.player.EnumC23097d;
import com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a;
import com.bytedance.tux.extension.player.p1718a.C23079b;
import com.bytedance.tux.extension.player.p1718a.C23088d;
import com.bytedance.tux.extension.player.p1718a.C23094e;
import com.bytedance.tux.extension.player.p1718a.KeyEvent$CallbackC23080c;
import com.bytedance.tux.extension.player.view.PlayerMaskView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.input.slider.TuxSlider;
import com.bytedance.tux.p1717e.C23073a;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public class TuxPlayerView extends FrameLayout implements KeyEvent$CallbackC23080c.AbstractC23081a, AbstractC23099f {

    /* renamed from: e */
    public static final C23112a f54700e = new C23112a((byte) 0);

    /* renamed from: a */
    public boolean f54701a;

    /* renamed from: b */
    public Runnable f54702b;

    /* renamed from: c */
    public boolean f54703c;

    /* renamed from: d */
    public AbstractC23075a f54704d;

    /* renamed from: f */
    private C23119a f54705f;

    /* renamed from: g */
    private AbstractC23095b f54706g;

    /* renamed from: h */
    private ViewGroup f54707h;

    /* renamed from: i */
    private Window f54708i;

    /* renamed from: j */
    private C23100g f54709j;

    /* renamed from: k */
    private int f54710k;

    /* renamed from: l */
    private Bitmap f54711l;

    /* renamed from: m */
    private final AbstractC89244h f54712m;

    /* renamed from: n */
    private HashMap f54713n;

    static {
        Covode.recordClassIndex(27040);
    }

    /* renamed from: c */
    public final View mo37581c(int i) {
        if (this.f54713n == null) {
            this.f54713n = new HashMap();
        }
        View view = (View) this.f54713n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f54713n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Handler getMainHandler() {
        return (Handler) this.f54712m.getValue();
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$a */
    public static final class C23112a {
        static {
            Covode.recordClassIndex(27041);
        }

        private C23112a() {
        }

        public /* synthetic */ C23112a(byte b) {
            this();
        }
    }

    public final Bitmap getCoverImage$player_release() {
        return this.f54711l;
    }

    public final ViewGroup getFullScreenContainerView$player_release() {
        return this.f54707h;
    }

    public final C23119a getParams() {
        return this.f54705f;
    }

    public final AbstractC23075a getPlayer$player_release() {
        return this.f54704d;
    }

    public final AbstractC23095b getPlayerLogListener$player_release() {
        return this.f54706g;
    }

    public final int getVideoLength$player_release() {
        return this.f54710k;
    }

    public final C23100g getVideoSize$player_release() {
        return this.f54709j;
    }

    public final Window getWindow$player_release() {
        return this.f54708i;
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$e */
    static final class C23116e extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C23116e f54719a = new C23116e();

        static {
            Covode.recordClassIndex(27045);
        }

        C23116e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: e */
    public final void mo37584e() {
        AbstractC23075a aVar = this.f54704d;
        if (aVar != null) {
            aVar.mo37509b();
            m43568g();
        }
    }

    /* renamed from: f */
    public final void mo37585f() {
        AbstractC23075a aVar = this.f54704d;
        if (aVar != null) {
            this.f54703c = true;
            aVar.mo37509b();
            m43568g();
        }
    }

    public final ImageView getCoverView() {
        ImageView imageView = (ImageView) mo37581c(R.id.afn);
        C89219l.m154709a((Object) imageView, "");
        return imageView;
    }

    public final TextureView getVideoView() {
        TextureView textureView = (TextureView) mo37581c(R.id.fdp);
        C89219l.m154709a((Object) textureView, "");
        return textureView;
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$d */
    public static final class C23115d implements PlayerMaskView.AbstractC23102b {

        /* renamed from: a */
        final /* synthetic */ TuxPlayerView f54718a;

        static {
            Covode.recordClassIndex(27044);
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: b */
        public final void mo37563b() {
            if (C23098e.f54671a == EnumC23097d.PLAYER_START) {
                this.f54718a.mo37585f();
                return;
            }
            AbstractC23095b playerLogListener$player_release = this.f54718a.getPlayerLogListener$player_release();
            if (playerLogListener$player_release != null) {
                playerLogListener$player_release.mo37539a();
            }
            this.f54718a.mo37580b(0);
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: a */
        public final void mo37561a() {
            Group group = (Group) ((PlayerMaskView) this.f54718a.mo37581c(R.id.d3c)).mo37547a(R.id.fdg);
            C89219l.m154709a((Object) group, "");
            group.setVisibility(8);
            TuxPlayerView tuxPlayerView = this.f54718a;
            AbstractC23075a aVar = tuxPlayerView.f54704d;
            if (aVar != null) {
                tuxPlayerView.f54703c = false;
                aVar.mo37514g();
                tuxPlayerView.mo37582c();
            }
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: d */
        public final void mo37566d() {
            AbstractC23075a player$player_release = this.f54718a.getPlayer$player_release();
            if (player$player_release == null) {
                return;
            }
            if (player$player_release.mo37513f()) {
                player$player_release.mo37512e();
                ((TuxPlayerStateView) this.f54718a.mo37581c(R.id.e4q)).mo37577a();
                return;
            }
            player$player_release.mo37511d();
            ((TuxPlayerStateView) this.f54718a.mo37581c(R.id.e4q)).mo37578b();
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: e */
        public final void mo37567e() {
            PlayerMaskView playerMaskView = (PlayerMaskView) this.f54718a.mo37581c(R.id.d3c);
            TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) playerMaskView.mo37547a(R.id.ei1);
            C89219l.m154709a((Object) tuxPlayerTimeView, "");
            tuxPlayerTimeView.setVisibility(0);
            Group group = (Group) playerMaskView.mo37547a(R.id.d2v);
            C89219l.m154709a((Object) group, "");
            group.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) playerMaskView.mo37547a(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(8);
            this.f54718a.f54701a = true;
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: c */
        public final void mo37565c() {
            boolean z;
            int i;
            Context context;
            MethodCollector.m26663i(8925);
            C23100g videoSize$player_release = this.f54718a.getVideoSize$player_release();
            if (videoSize$player_release != null) {
                if (videoSize$player_release.f54674a < videoSize$player_release.f54675b) {
                    z = true;
                } else {
                    z = false;
                }
                ViewGroup fullScreenContainerView$player_release = this.f54718a.getFullScreenContainerView$player_release();
                TuxPlayerView tuxPlayerView = this.f54718a;
                if (!(fullScreenContainerView$player_release == null || tuxPlayerView == null)) {
                    KeyEvent$CallbackC23080c.f54644j = fullScreenContainerView$player_release;
                    KeyEvent$CallbackC23080c.f54640f = tuxPlayerView;
                    ViewParent parent = tuxPlayerView.getParent();
                    if (!(parent instanceof ViewGroup)) {
                        parent = null;
                    }
                    KeyEvent$CallbackC23080c.f54642h = (ViewGroup) parent;
                    ViewGroup.LayoutParams layoutParams = tuxPlayerView.getLayoutParams();
                    C89219l.m154709a((Object) layoutParams, "");
                    C89219l.m154719c(layoutParams, "");
                    Class<?> cls = layoutParams.getClass();
                    Object newInstance = Class.forName(cls.getName()).getConstructor(ViewGroup.LayoutParams.class).newInstance(layoutParams);
                    if (newInstance != null) {
                        ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) newInstance;
                        Field[] declaredFields = cls.getDeclaredFields();
                        for (Field field : declaredFields) {
                            C89219l.m154709a((Object) field, "");
                            if (!TextUtils.equals(field.getName(), "widget")) {
                                field.setAccessible(true);
                                field.set(layoutParams2, field.get(layoutParams));
                            }
                        }
                        KeyEvent$CallbackC23080c.f54643i = layoutParams2;
                        KeyEvent$CallbackC23080c.f54641g = tuxPlayerView;
                        Context context2 = tuxPlayerView.getContext();
                        Window window$player_release = tuxPlayerView.getWindow$player_release();
                        if (window$player_release != null) {
                            C89233z.C89238e eVar = new C89233z.C89238e();
                            eVar.element = (T) window$player_release.getCallback();
                            if (KeyEvent$CallbackC23080c.f54638d == null) {
                                KeyEvent$CallbackC23080c.f54639e = eVar.element;
                                KeyEvent$CallbackC23080c.f54638d = new KeyEvent$CallbackC23080c.C23087f(eVar, eVar.element);
                            }
                            Window$CallbackC0286i iVar = KeyEvent$CallbackC23080c.f54638d;
                            if (iVar != null) {
                                window$player_release.setCallback(iVar);
                            }
                        }
                        if (z) {
                            Window window$player_release2 = tuxPlayerView.getWindow$player_release();
                            if (window$player_release2 != null) {
                                View c = tuxPlayerView.mo37581c(R.id.e7_);
                                C89219l.m154709a((Object) c, "");
                                ViewGroup.LayoutParams layoutParams3 = c.getLayoutParams();
                                C89219l.m154709a((Object) context2, "");
                                C89219l.m154719c(context2, "");
                                layoutParams3.height = context2.getResources().getDimensionPixelSize(context2.getResources().getIdentifier("status_bar_height", "dimen", "android"));
                                View c2 = tuxPlayerView.mo37581c(R.id.e7_);
                                C89219l.m154709a((Object) c2, "");
                                c2.setVisibility(0);
                                C23073a.C23074a.m43510a((ActivityC0945e) context2, window$player_release2).mo37499b(false).mo37498b(0).mo37496a(false, false).f54627a.mo33415d();
                            }
                            TextureVideoView textureVideoView = (TextureVideoView) tuxPlayerView.mo37581c(R.id.fe8);
                            C89219l.m154709a((Object) textureVideoView, "");
                            Rect a = C23088d.m43533a(textureVideoView);
                            Rect a2 = C23088d.m43533a(fullScreenContainerView$player_release);
                            KeyEvent$CallbackC23080c.f54635a[0] = a.left - a2.left;
                            KeyEvent$CallbackC23080c.f54635a[1] = a.top - a2.top;
                            TextureVideoView textureVideoView2 = (TextureVideoView) tuxPlayerView.mo37581c(R.id.fe8);
                            C89219l.m154709a((Object) textureVideoView2, "");
                            KeyEvent$CallbackC23080c.f54637c = textureVideoView2.getWidth();
                            TextureVideoView textureVideoView3 = (TextureVideoView) tuxPlayerView.mo37581c(R.id.fe8);
                            C89219l.m154709a((Object) textureVideoView3, "");
                            KeyEvent$CallbackC23080c.f54636b = textureVideoView3.getHeight();
                            ImageView imageView = new ImageView(context2);
                            KeyEvent$CallbackC23080c.f54645k = imageView;
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            KeyEvent$CallbackC23080c.m43528a(KeyEvent$CallbackC23080c.f54645k);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(KeyEvent$CallbackC23080c.f54637c, KeyEvent$CallbackC23080c.f54636b);
                            marginLayoutParams.topMargin = KeyEvent$CallbackC23080c.f54635a[1];
                            marginLayoutParams.leftMargin = KeyEvent$CallbackC23080c.f54635a[0];
                            ImageView imageView2 = KeyEvent$CallbackC23080c.f54645k;
                            if (imageView2 != null) {
                                imageView2.setLayoutParams(marginLayoutParams);
                            }
                            KeyEvent$CallbackC23080c.m43526a(fullScreenContainerView$player_release, KeyEvent$CallbackC23080c.f54645k, null);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new KeyEvent$CallbackC23080c.C23082b(a2));
                            ofFloat.addListener(new KeyEvent$CallbackC23080c.C23083c(tuxPlayerView, fullScreenContainerView$player_release));
                            C89219l.m154709a((Object) ofFloat, "");
                            ofFloat.setDuration(200L);
                            ofFloat.setInterpolator(new AccelerateInterpolator());
                            ofFloat.start();
                        } else {
                            if (!(context2 instanceof Activity)) {
                                context = null;
                            } else {
                                context = context2;
                            }
                            KeyEvent$CallbackC23080c.m43524a((Activity) context, 0);
                            KeyEvent$CallbackC23080c.f54650p = EnumC23096c.HORIZONTAL;
                            KeyEvent$CallbackC23080c.m43525a(tuxPlayerView);
                            ViewGroup.LayoutParams layoutParams4 = tuxPlayerView.getLayoutParams();
                            if (layoutParams4 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams4;
                                marginLayoutParams2.width = -1;
                                marginLayoutParams2.height = -1;
                                marginLayoutParams2.topMargin = 0;
                                KeyEvent$CallbackC23080c.m43526a(fullScreenContainerView$player_release, tuxPlayerView, null);
                                Window window$player_release3 = tuxPlayerView.getWindow$player_release();
                                if (window$player_release3 != null) {
                                    if (context2 != null) {
                                        C23073a.C23074a.m43510a((ActivityC0945e) context2, window$player_release3).mo37496a(true, true).f54627a.mo33415d();
                                    } else {
                                        C89388w wVar = new C89388w("null cannot be cast to non-null type");
                                        MethodCollector.m26664o(8925);
                                        throw wVar;
                                    }
                                }
                                i = 8925;
                                KeyEvent$CallbackC23080c.AbstractC23081a aVar = KeyEvent$CallbackC23080c.f54641g;
                                if (aVar != null) {
                                    aVar.mo37523a(KeyEvent$CallbackC23080c.f54650p);
                                }
                                this.f54718a.getPlayer$player_release();
                                MethodCollector.m26664o(i);
                                return;
                            }
                            C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                            MethodCollector.m26664o(8925);
                            throw wVar2;
                        }
                    } else {
                        C89388w wVar3 = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(8925);
                        throw wVar3;
                    }
                }
                i = 8925;
                this.f54718a.getPlayer$player_release();
                MethodCollector.m26664o(i);
                return;
            }
            MethodCollector.m26664o(8925);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C23115d(TuxPlayerView tuxPlayerView) {
            this.f54718a = tuxPlayerView;
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: a */
        public final void mo37562a(int i) {
            TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) this.f54718a.mo37581c(R.id.ei1);
            C89219l.m154709a((Object) tuxPlayerTimeView, "");
            if (tuxPlayerTimeView.f54699g == null) {
                tuxPlayerTimeView.f54699g = new HashMap();
            }
            View view = (View) tuxPlayerTimeView.f54699g.get(Integer.valueOf((int) R.id.ago));
            if (view == null) {
                view = tuxPlayerTimeView.findViewById(R.id.ago);
                tuxPlayerTimeView.f54699g.put(Integer.valueOf((int) R.id.ago), view);
            }
            TuxTextView tuxTextView = (TuxTextView) view;
            C89219l.m154709a((Object) tuxTextView, "");
            tuxTextView.setText(C23079b.m43523a(i, this.f54718a.getVideoLength$player_release()));
        }

        @Override // com.bytedance.tux.extension.player.view.PlayerMaskView.AbstractC23102b
        /* renamed from: b */
        public final void mo37564b(int i) {
            PlayerMaskView playerMaskView = (PlayerMaskView) this.f54718a.mo37581c(R.id.d3c);
            TuxPlayerTimeView tuxPlayerTimeView = (TuxPlayerTimeView) playerMaskView.mo37547a(R.id.ei1);
            C89219l.m154709a((Object) tuxPlayerTimeView, "");
            tuxPlayerTimeView.setVisibility(8);
            if (playerMaskView.f54679c) {
                Group group = (Group) playerMaskView.mo37547a(R.id.d2v);
                C89219l.m154709a((Object) group, "");
                group.setVisibility(0);
                TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) playerMaskView.mo37547a(R.id.d2m);
                C89219l.m154709a((Object) tuxPlayerStateView, "");
                tuxPlayerStateView.setVisibility(8);
            } else if (C23098e.f54672b != EnumC23096c.PREVIEW) {
                TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) playerMaskView.mo37547a(R.id.d2m);
                C89219l.m154709a((Object) tuxPlayerStateView2, "");
                tuxPlayerStateView2.setVisibility(0);
                Group group2 = (Group) playerMaskView.mo37547a(R.id.d2v);
                C89219l.m154709a((Object) group2, "");
                group2.setVisibility(8);
            }
            this.f54718a.mo37580b(i);
            this.f54718a.f54701a = false;
        }
    }

    /* renamed from: h */
    private final void m43569h() {
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37551c();
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: a */
    public final void mo37540a() {
        ImageView imageView = (ImageView) mo37581c(R.id.afn);
        C89219l.m154709a((Object) imageView, "");
        imageView.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo37583d() {
        AbstractC23075a aVar;
        if (!this.f54703c && C23098e.f54671a == EnumC23097d.PLAYER_PAUSE && (aVar = this.f54704d) != null) {
            this.f54703c = false;
            aVar.mo37506a();
            mo37582c();
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$f */
    static final class RunnableC23117f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23100g f54720a;

        /* renamed from: b */
        final /* synthetic */ TuxPlayerView f54721b;

        /* renamed from: c */
        final /* synthetic */ C23100g f54722c;

        static {
            Covode.recordClassIndex(27046);
        }

        RunnableC23117f(C23100g gVar, TuxPlayerView tuxPlayerView, C23100g gVar2) {
            this.f54720a = gVar;
            this.f54721b = tuxPlayerView;
            this.f54722c = gVar2;
        }

        public final void run() {
            View c = this.f54721b.mo37581c(R.id.fe8);
            C23100g gVar = this.f54720a;
            C23100g gVar2 = this.f54722c;
            C89219l.m154719c(gVar, "");
            C89219l.m154719c(gVar2, "");
            if (c != null) {
                int i = gVar.f54674a;
                int i2 = gVar.f54675b;
                int i3 = gVar2.f54674a;
                int i4 = gVar2.f54675b;
                C89219l.m154719c(c, "");
                C23100g a = C23094e.m43536a(i, i2, i3, i4);
                int i5 = a.f54674a;
                int i6 = a.f54675b;
                ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams.width == i5 && marginLayoutParams.height == i6) {
                        int i7 = Build.VERSION.SDK_INT;
                        return;
                    }
                    marginLayoutParams.width = i5;
                    marginLayoutParams.height = i6;
                    c.setLayoutParams(marginLayoutParams);
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$g */
    static final class RunnableC23118g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TuxPlayerView f54723a;

        static {
            Covode.recordClassIndex(27047);
        }

        RunnableC23118g(TuxPlayerView tuxPlayerView) {
            this.f54723a = tuxPlayerView;
        }

        public final void run() {
            PlayerMaskView playerMaskView = (PlayerMaskView) this.f54723a.mo37581c(R.id.d3c);
            playerMaskView.f54679c = true;
            int i = 0;
            if (!playerMaskView.f54678b) {
                Group group = (Group) playerMaskView.mo37547a(R.id.d2v);
                C89219l.m154709a((Object) group, "");
                group.setVisibility(0);
            }
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) playerMaskView.mo37547a(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(8);
            AbstractC23075a player$player_release = this.f54723a.getPlayer$player_release();
            if (player$player_release != null) {
                i = player$player_release.mo37515h();
            }
            ((PlayerMaskView) this.f54723a.mo37581c(R.id.d3c)).setNetSpeed(i);
            Runnable runnable = this.f54723a.f54702b;
            if (runnable != null) {
                this.f54723a.getMainHandler().postDelayed(runnable, 1000);
            }
        }
    }

    /* renamed from: g */
    private final void m43568g() {
        if (C23098e.f54671a != EnumC23097d.PLAYER_IDLE) {
            C23098e.m43539a(EnumC23097d.PLAYER_PAUSE);
            ((PlayerMaskView) mo37581c(R.id.d3c)).mo37553e();
        } else {
            View a = ((PlayerMaskView) mo37581c(R.id.d3c)).mo37547a(R.id.bx);
            C89219l.m154709a((Object) a, "");
            a.setVisibility(8);
        }
        ((TuxPlayerStateView) mo37581c(R.id.d2w)).mo37577a();
        ((TuxPlayerStateView) mo37581c(R.id.d2m)).mo37577a();
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37548a();
        m43569h();
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: b */
    public final void mo37545b() {
        C23098e.m43539a(EnumC23097d.PLAYER_IDLE);
        AbstractC23075a aVar = this.f54704d;
        if (aVar != null) {
            aVar.mo37507a(0.0f);
        }
        mo37585f();
        TuxTextView tuxTextView = (TuxTextView) mo37581c(R.id.d30);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(C23079b.m43522a(0));
        TuxSlider tuxSlider = (TuxSlider) mo37581c(R.id.e2x);
        C89219l.m154709a((Object) tuxSlider, "");
        tuxSlider.setProgress(0);
        ImageView imageView = (ImageView) mo37581c(R.id.afn);
        C89219l.m154709a((Object) imageView, "");
        imageView.setVisibility(0);
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37552d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo37582c() {
        C23098e.m43539a(EnumC23097d.PLAYER_START);
        ((TuxPlayerStateView) mo37581c(R.id.d2w)).mo37578b();
        ((TuxPlayerStateView) mo37581c(R.id.d2m)).mo37578b();
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37553e();
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37549a(3000L);
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37552d();
    }

    /* renamed from: i */
    private final void m43570i() {
        int i = C23120b.f54731a[C23098e.f54672b.ordinal()];
        if (i == 1) {
            ImageView imageView = (ImageView) mo37581c(R.id.axl);
            C89219l.m154709a((Object) imageView, "");
            imageView.setVisibility(8);
            ImageView imageView2 = (ImageView) mo37581c(R.id.b9g);
            C89219l.m154709a((Object) imageView2, "");
            imageView2.setVisibility(0);
            TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) mo37581c(R.id.d2w);
            C89219l.m154709a((Object) tuxPlayerStateView, "");
            tuxPlayerStateView.setVisibility(0);
            TuxPlayerStateView tuxPlayerStateView2 = (TuxPlayerStateView) mo37581c(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView2, "");
            tuxPlayerStateView2.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a0f);
            TuxPlayerStateView tuxPlayerStateView3 = (TuxPlayerStateView) mo37581c(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView3, "");
            tuxPlayerStateView3.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a0f);
            TuxSpinner tuxSpinner = (TuxSpinner) mo37581c(R.id.d2x);
            C89219l.m154709a((Object) tuxSpinner, "");
            tuxSpinner.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a0i);
            TuxSpinner tuxSpinner2 = (TuxSpinner) mo37581c(R.id.d2x);
            C89219l.m154709a((Object) tuxSpinner2, "");
            tuxSpinner2.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a0i);
            TuxSpinner tuxSpinner3 = (TuxSpinner) mo37581c(R.id.d2x);
            C89219l.m154709a((Object) tuxSpinner3, "");
            ViewGroup.LayoutParams layoutParams = tuxSpinner3.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) getResources().getDimension(R.dimen.a0h);
                TuxTextView tuxTextView = (TuxTextView) mo37581c(R.id.d30);
                C89219l.m154709a((Object) tuxTextView, "");
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = (int) getResources().getDimension(R.dimen.a0e);
                    TuxTextView tuxTextView2 = (TuxTextView) mo37581c(R.id.fcf);
                    C89219l.m154709a((Object) tuxTextView2, "");
                    ViewGroup.LayoutParams layoutParams3 = tuxTextView2.getLayoutParams();
                    if (layoutParams3 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = (int) getResources().getDimension(R.dimen.a0e);
                        ((TuxSlider) mo37581c(R.id.e2x)).setPadding((int) getResources().getDimension(R.dimen.a0k), 0, (int) getResources().getDimension(R.dimen.a0k), 0);
                        ((TuxTextView) mo37581c(R.id.ago)).setTextSize(0, getResources().getDimension(R.dimen.a0j));
                        ((TuxTextView) mo37581c(R.id.emh)).setTextSize(0, getResources().getDimension(R.dimen.a0j));
                        ((TuxTextView) mo37581c(R.id.aj_)).setTextSize(0, getResources().getDimension(R.dimen.a0g));
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        } else if (i == 2) {
            ImageView imageView3 = (ImageView) mo37581c(R.id.axl);
            C89219l.m154709a((Object) imageView3, "");
            imageView3.setVisibility(0);
            ImageView imageView4 = (ImageView) mo37581c(R.id.b9g);
            C89219l.m154709a((Object) imageView4, "");
            imageView4.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView4 = (TuxPlayerStateView) mo37581c(R.id.d2w);
            C89219l.m154709a((Object) tuxPlayerStateView4, "");
            tuxPlayerStateView4.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView5 = (TuxPlayerStateView) mo37581c(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView5, "");
            tuxPlayerStateView5.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a03);
            TuxPlayerStateView tuxPlayerStateView6 = (TuxPlayerStateView) mo37581c(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView6, "");
            tuxPlayerStateView6.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a03);
            TuxTextView tuxTextView3 = (TuxTextView) mo37581c(R.id.d30);
            C89219l.m154709a((Object) tuxTextView3, "");
            ViewGroup.LayoutParams layoutParams4 = tuxTextView3.getLayoutParams();
            if (layoutParams4 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = (int) getResources().getDimension(R.dimen.a0c);
                TuxTextView tuxTextView4 = (TuxTextView) mo37581c(R.id.fcf);
                C89219l.m154709a((Object) tuxTextView4, "");
                ViewGroup.LayoutParams layoutParams5 = tuxTextView4.getLayoutParams();
                if (layoutParams5 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = (int) getResources().getDimension(R.dimen.a0c);
                    TuxSpinner tuxSpinner4 = (TuxSpinner) mo37581c(R.id.d2x);
                    C89219l.m154709a((Object) tuxSpinner4, "");
                    tuxSpinner4.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner5 = (TuxSpinner) mo37581c(R.id.d2x);
                    C89219l.m154709a((Object) tuxSpinner5, "");
                    tuxSpinner5.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner6 = (TuxSpinner) mo37581c(R.id.d2x);
                    C89219l.m154709a((Object) tuxSpinner6, "");
                    ViewGroup.LayoutParams layoutParams6 = tuxSpinner6.getLayoutParams();
                    if (layoutParams6 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = (int) getResources().getDimension(R.dimen.a01);
                        ((TuxSlider) mo37581c(R.id.e2x)).setPadding((int) getResources().getDimension(R.dimen.a0d), 0, (int) getResources().getDimension(R.dimen.a0d), 0);
                        ((TuxTextView) mo37581c(R.id.ago)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) mo37581c(R.id.emh)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) mo37581c(R.id.aj_)).setTextSize(0, getResources().getDimension(R.dimen.a04));
                        ImageView imageView5 = (ImageView) mo37581c(R.id.axl);
                        C89219l.m154709a((Object) imageView5, "");
                        ViewGroup.LayoutParams layoutParams7 = imageView5.getLayoutParams();
                        if (layoutParams7 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams7;
                            marginLayoutParams.leftMargin = (int) getResources().getDimension(R.dimen.a0a);
                            marginLayoutParams.topMargin = (int) getResources().getDimension(R.dimen.a0b);
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        } else if (i == 3) {
            ImageView imageView6 = (ImageView) mo37581c(R.id.axl);
            C89219l.m154709a((Object) imageView6, "");
            imageView6.setVisibility(0);
            ImageView imageView7 = (ImageView) mo37581c(R.id.b9g);
            C89219l.m154709a((Object) imageView7, "");
            imageView7.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView7 = (TuxPlayerStateView) mo37581c(R.id.d2w);
            C89219l.m154709a((Object) tuxPlayerStateView7, "");
            tuxPlayerStateView7.setVisibility(8);
            TuxPlayerStateView tuxPlayerStateView8 = (TuxPlayerStateView) mo37581c(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView8, "");
            tuxPlayerStateView8.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a03);
            TuxPlayerStateView tuxPlayerStateView9 = (TuxPlayerStateView) mo37581c(R.id.d2m);
            C89219l.m154709a((Object) tuxPlayerStateView9, "");
            tuxPlayerStateView9.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a03);
            TuxTextView tuxTextView5 = (TuxTextView) mo37581c(R.id.d30);
            C89219l.m154709a((Object) tuxTextView5, "");
            ViewGroup.LayoutParams layoutParams8 = tuxTextView5.getLayoutParams();
            if (layoutParams8 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams8).leftMargin = (int) getResources().getDimension(R.dimen.a08);
                TuxTextView tuxTextView6 = (TuxTextView) mo37581c(R.id.fcf);
                C89219l.m154709a((Object) tuxTextView6, "");
                ViewGroup.LayoutParams layoutParams9 = tuxTextView6.getLayoutParams();
                if (layoutParams9 != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams9).rightMargin = (int) getResources().getDimension(R.dimen.a08);
                    TuxSpinner tuxSpinner7 = (TuxSpinner) mo37581c(R.id.d2x);
                    C89219l.m154709a((Object) tuxSpinner7, "");
                    tuxSpinner7.getLayoutParams().width = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner8 = (TuxSpinner) mo37581c(R.id.d2x);
                    C89219l.m154709a((Object) tuxSpinner8, "");
                    tuxSpinner8.getLayoutParams().height = (int) getResources().getDimension(R.dimen.a02);
                    TuxSpinner tuxSpinner9 = (TuxSpinner) mo37581c(R.id.d2x);
                    C89219l.m154709a((Object) tuxSpinner9, "");
                    ViewGroup.LayoutParams layoutParams10 = tuxSpinner9.getLayoutParams();
                    if (layoutParams10 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams10).topMargin = (int) getResources().getDimension(R.dimen.a01);
                        ((TuxSlider) mo37581c(R.id.e2x)).setPadding((int) getResources().getDimension(R.dimen.a09), 0, (int) getResources().getDimension(R.dimen.a09), 0);
                        ((TuxTextView) mo37581c(R.id.ago)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) mo37581c(R.id.emh)).setTextSize(0, getResources().getDimension(R.dimen.a05));
                        ((TuxTextView) mo37581c(R.id.aj_)).setTextSize(0, getResources().getDimension(R.dimen.a04));
                        ImageView imageView8 = (ImageView) mo37581c(R.id.axl);
                        C89219l.m154709a((Object) imageView8, "");
                        ViewGroup.LayoutParams layoutParams11 = imageView8.getLayoutParams();
                        if (layoutParams11 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams11;
                            marginLayoutParams2.leftMargin = (int) getResources().getDimension(R.dimen.a06);
                            marginLayoutParams2.topMargin = (int) getResources().getDimension(R.dimen.a07);
                            return;
                        }
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    public final void setFullScreenContainerView$player_release(ViewGroup viewGroup) {
        this.f54707h = viewGroup;
    }

    public final void setPlayer$player_release(AbstractC23075a aVar) {
        this.f54704d = aVar;
    }

    public final void setPlayerLogListener$player_release(AbstractC23095b bVar) {
        this.f54706g = bVar;
    }

    public final void setVideoSize$player_release(C23100g gVar) {
        this.f54709j = gVar;
    }

    public final void setWindow$player_release(Window window) {
        this.f54708i = window;
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$b */
    public static final class C23113b extends AbstractView$OnClickListenerC23076a {

        /* renamed from: c */
        final /* synthetic */ long f54714c = 300;

        /* renamed from: d */
        final /* synthetic */ TuxPlayerView f54715d;

        static {
            Covode.recordClassIndex(27042);
        }

        public C23113b(TuxPlayerView tuxPlayerView) {
            this.f54715d = tuxPlayerView;
        }

        @Override // com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a
        /* renamed from: a */
        public final void mo37516a(View view) {
            if (view != null && this.f54715d.getVideoSize$player_release() != null) {
                KeyEvent$CallbackC23080c.m43531c();
            }
        }
    }

    /* renamed from: com.bytedance.tux.extension.player.view.TuxPlayerView$c */
    public static final class C23114c extends AbstractView$OnClickListenerC23076a {

        /* renamed from: c */
        final /* synthetic */ long f54716c = 300;

        /* renamed from: d */
        final /* synthetic */ TuxPlayerView f54717d;

        static {
            Covode.recordClassIndex(27043);
        }

        public C23114c(TuxPlayerView tuxPlayerView) {
            this.f54717d = tuxPlayerView;
        }

        @Override // com.bytedance.tux.extension.player.p1718a.AbstractView$OnClickListenerC23076a
        /* renamed from: a */
        public final void mo37516a(View view) {
            if (view == null) {
                return;
            }
            if (C23098e.f54671a == EnumC23097d.PLAYER_START) {
                this.f54717d.mo37585f();
                return;
            }
            AbstractC23095b playerLogListener$player_release = this.f54717d.getPlayerLogListener$player_release();
            if (playerLogListener$player_release != null) {
                playerLogListener$player_release.mo37539a();
            }
            this.f54717d.mo37580b(0);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerView(Context context) {
        this(context, null);
        C89219l.m154719c(context, "");
    }

    public final void setCoverImage$player_release(Bitmap bitmap) {
        this.f54711l = bitmap;
        ((TextureVideoView) mo37581c(R.id.fe8)).setCoverImage(bitmap);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: b */
    public final void mo37546b(String str) {
        C89219l.m154719c(str, "");
        Group group = (Group) ((PlayerMaskView) mo37581c(R.id.d3c)).mo37547a(R.id.fdg);
        C89219l.m154709a((Object) group, "");
        group.setVisibility(0);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: a */
    public final void mo37541a(float f) {
        TuxTextView tuxTextView = (TuxTextView) mo37581c(R.id.d30);
        C89219l.m154709a((Object) tuxTextView, "");
        int i = (int) f;
        tuxTextView.setText(C23079b.m43523a(i, this.f54710k));
        if (!this.f54701a) {
            TuxSlider tuxSlider = (TuxSlider) mo37581c(R.id.e2x);
            C89219l.m154709a((Object) tuxSlider, "");
            tuxSlider.setProgress(i);
        }
    }

    /* renamed from: b */
    public final void mo37580b(int i) {
        AbstractC23075a aVar = this.f54704d;
        if (aVar != null) {
            this.f54703c = false;
            float f = (float) i;
            int i2 = (int) ((((float) this.f54710k) / 100.0f) * f);
            if (C23098e.f54671a == EnumC23097d.PLAYER_IDLE) {
                aVar.mo37508a(i2);
            } else if (C23098e.f54671a == EnumC23097d.PLAYER_PAUSE) {
                if (i > 0) {
                    aVar.mo37507a(f);
                }
                aVar.mo37506a();
            } else {
                aVar.mo37507a(f);
            }
            mo37582c();
        }
    }

    public final void setVideoLength$player_release(int i) {
        this.f54710k = i;
        String a = C23079b.m43522a(i);
        TuxTextView tuxTextView = (TuxTextView) mo37581c(R.id.fcf);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(a);
        TuxTextView tuxTextView2 = (TuxTextView) mo37581c(R.id.emh);
        C89219l.m154709a((Object) tuxTextView2, "");
        tuxTextView2.setText(a);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: a */
    public final void mo37542a(int i) {
        TuxSlider tuxSlider = (TuxSlider) mo37581c(R.id.e2x);
        C89219l.m154709a((Object) tuxSlider, "");
        tuxSlider.setSecondaryProgress(i);
    }

    public final void setParams(C23119a aVar) {
        int i;
        AbstractC23075a aVar2;
        ViewGroup viewGroup;
        Window window;
        C23100g gVar;
        Bitmap bitmap;
        Integer num;
        this.f54705f = aVar;
        if (aVar == null || (num = aVar.f54728e) == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        setVideoLength$player_release(i);
        C23119a aVar3 = this.f54705f;
        AbstractC23095b bVar = null;
        if (aVar3 != null) {
            aVar2 = aVar3.f54724a;
        } else {
            aVar2 = null;
        }
        this.f54704d = aVar2;
        C23119a aVar4 = this.f54705f;
        if (aVar4 != null) {
            viewGroup = aVar4.f54725b;
        } else {
            viewGroup = null;
        }
        this.f54707h = viewGroup;
        C23119a aVar5 = this.f54705f;
        if (aVar5 != null) {
            window = aVar5.f54726c;
        } else {
            window = null;
        }
        this.f54708i = window;
        C23119a aVar6 = this.f54705f;
        if (aVar6 != null) {
            gVar = aVar6.f54727d;
        } else {
            gVar = null;
        }
        this.f54709j = gVar;
        C23119a aVar7 = this.f54705f;
        if (aVar7 != null) {
            bitmap = aVar7.f54729f;
        } else {
            bitmap = null;
        }
        setCoverImage$player_release(bitmap);
        C23119a aVar8 = this.f54705f;
        if (aVar8 != null) {
            bVar = aVar8.f54730g;
        }
        this.f54706g = bVar;
    }

    @Override // com.bytedance.tux.extension.player.p1718a.KeyEvent$CallbackC23080c.AbstractC23081a
    /* renamed from: a */
    public final void mo37523a(EnumC23096c cVar) {
        C89219l.m154719c(cVar, "");
        C23098e.m43538a(cVar);
        if (C23098e.f54672b != EnumC23096c.PREVIEW) {
            if (this.f54704d != null && C23098e.f54671a == EnumC23097d.PLAYER_START) {
                PlayerMaskView playerMaskView = (PlayerMaskView) mo37581c(R.id.d3c);
                playerMaskView.f54680d = false;
                ConstraintLayout constraintLayout = (ConstraintLayout) playerMaskView.mo37547a(R.id.acf);
                C89219l.m154709a((Object) constraintLayout, "");
                constraintLayout.setAlpha(0.0f);
            }
        } else if (this.f54704d != null) {
            if (C23098e.f54671a == EnumC23097d.PLAYER_START) {
                ((PlayerMaskView) mo37581c(R.id.d3c)).mo37550b();
            } else {
                ((PlayerMaskView) mo37581c(R.id.d3c)).mo37548a();
            }
        }
        ((PlayerMaskView) mo37581c(R.id.d3c)).mo37552d();
        m43570i();
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: a */
    public final void mo37543a(String str) {
        C89219l.m154719c(str, "");
        Group group = (Group) ((PlayerMaskView) mo37581c(R.id.d3c)).mo37547a(R.id.fch);
        C89219l.m154709a((Object) group, "");
        group.setVisibility(0);
    }

    @Override // com.bytedance.tux.extension.player.AbstractC23099f
    /* renamed from: a */
    public final void mo37544a(boolean z) {
        if (z) {
            ((PlayerMaskView) mo37581c(R.id.d3c)).mo37550b();
            getMainHandler().removeCallbacksAndMessages(null);
            RunnableC23118g gVar = new RunnableC23118g(this);
            this.f54702b = gVar;
            getMainHandler().postDelayed(gVar, 1000);
            return;
        }
        m43569h();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TuxPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154719c(context, "");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(9365);
        super.onMeasure(i, i2);
        C23100g gVar = new C23100g(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        C23100g gVar2 = this.f54709j;
        if (gVar2 != null) {
            post(new RunnableC23117f(gVar2, this, gVar));
            MethodCollector.m26664o(9365);
            return;
        }
        MethodCollector.m26664o(9365);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxPlayerView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, R.attr.c0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9378);
        this.f54703c = true;
        this.f54712m = C89250i.m154773a((AbstractC89171a) C23116e.f54719a);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bis, this, true);
        m43570i();
        ImageView imageView = (ImageView) mo37581c(R.id.axl);
        C89219l.m154709a((Object) imageView, "");
        imageView.setOnClickListener(new C23113b(this));
        TuxPlayerStateView tuxPlayerStateView = (TuxPlayerStateView) mo37581c(R.id.d2m);
        C89219l.m154709a((Object) tuxPlayerStateView, "");
        tuxPlayerStateView.setOnClickListener(new C23114c(this));
        ((PlayerMaskView) mo37581c(R.id.d3c)).setOnPlayerActionBarListener(new C23115d(this));
        MethodCollector.m26664o(9378);
    }
}
