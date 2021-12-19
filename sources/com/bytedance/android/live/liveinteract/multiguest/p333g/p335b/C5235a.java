package com.bytedance.android.live.liveinteract.multiguest.p333g.p335b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Message;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p187e.AbstractC3060a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.C4441l;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b;
import com.bytedance.android.live.liveinteract.multilive.api.AbstractC5585a;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5686e;
import com.bytedance.android.live.liveinteract.platform.common.p371c.C5687f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5712g;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5714i;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.p488c.C7399p;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestCountDownTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestPushStreamTimeAndroidSetting;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a */
public class C5235a extends FrameLayout implements C5137b.AbstractC5139b, AbstractC5585a, WeakHandler.IHandler {

    /* renamed from: l */
    public static final C5237b f13522l = new C5237b((byte) 0);

    /* renamed from: A */
    private int f13523A;

    /* renamed from: B */
    private long f13524B;

    /* renamed from: C */
    private final boolean f13525C;

    /* renamed from: D */
    private boolean f13526D;

    /* renamed from: E */
    private int f13527E;

    /* renamed from: F */
    private boolean f13528F;

    /* renamed from: G */
    private C88411a f13529G;

    /* renamed from: H */
    private boolean f13530H;

    /* renamed from: I */
    private int f13531I;

    /* renamed from: J */
    private boolean f13532J;

    /* renamed from: K */
    private boolean f13533K;

    /* renamed from: L */
    private final String f13534L;

    /* renamed from: M */
    private AbstractC5236a f13535M;

    /* renamed from: N */
    private HashMap f13536N;

    /* renamed from: a */
    public HSImageView f13537a;

    /* renamed from: b */
    public ImageView f13538b;

    /* renamed from: c */
    public TextView f13539c;

    /* renamed from: d */
    public WaveEffectView f13540d;

    /* renamed from: e */
    public LiveLoadingView f13541e;

    /* renamed from: f */
    public TextView f13542f;

    /* renamed from: g */
    public TextView f13543g;

    /* renamed from: h */
    public int f13544h;

    /* renamed from: i */
    public boolean f13545i;

    /* renamed from: j */
    final C5137b.AbstractC5138a f13546j;

    /* renamed from: k */
    final DataChannel f13547k;

    /* renamed from: m */
    private TextView f13548m;

    /* renamed from: n */
    private HSImageView f13549n;

    /* renamed from: o */
    private View f13550o;

    /* renamed from: p */
    private View f13551p;

    /* renamed from: q */
    private View f13552q;

    /* renamed from: r */
    private TextView f13553r;

    /* renamed from: s */
    private View f13554s;

    /* renamed from: t */
    private ProgressBar f13555t;

    /* renamed from: u */
    private View f13556u;

    /* renamed from: v */
    private SurfaceView f13557v;

    /* renamed from: w */
    private final WeakHandler f13558w = new WeakHandler(this);

    /* renamed from: x */
    private Animator f13559x;

    /* renamed from: y */
    private final int f13560y;

    /* renamed from: z */
    private final double f13561z;

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$a */
    public interface AbstractC5236a {
        static {
            Covode.recordClassIndex(5828);
        }

        /* renamed from: a */
        void mo11052a(C5235a aVar);
    }

    static {
        Covode.recordClassIndex(5827);
    }

    /* renamed from: b */
    public View mo11018b(int i) {
        if (this.f13536N == null) {
            this.f13536N = new HashMap();
        }
        View view = (View) this.f13536N.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f13536N.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getWindowLayoutId() {
        return R.layout.be4;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$b */
    public static final class C5237b {
        static {
            Covode.recordClassIndex(5829);
        }

        private C5237b() {
        }

        public /* synthetic */ C5237b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.api.AbstractC5585a
    /* renamed from: d */
    public final boolean mo11021d() {
        return this.f13528F;
    }

    public final boolean getAdjustParent() {
        return this.f13528F;
    }

    public final boolean getHasInit() {
        return this.f13532J;
    }

    public final String getInteractId() {
        return this.f13534L;
    }

    /* access modifiers changed from: protected */
    public final boolean getMCurrentUserIsLinkedGuest() {
        return this.f13526D;
    }

    public final DataChannel getMDataChannel() {
        return this.f13547k;
    }

    public final C5137b.AbstractC5138a getMPresenter() {
        return this.f13546j;
    }

    public final boolean getMultiLiveEnable() {
        return this.f13533K;
    }

    public final int getPosInMultiLive() {
        return this.f13531I;
    }

    public final C5137b.AbstractC5138a getPresenter() {
        return this.f13546j;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    /* renamed from: a */
    public void mo10891a(User user) {
        ImageModel avatarThumb = user != null ? user.getAvatarThumb() : null;
        ImageView imageView = this.f13538b;
        if (imageView == null) {
            C89219l.m154710a("mPrepareAvatar");
        }
        ImageView imageView2 = this.f13538b;
        if (imageView2 == null) {
            C89219l.m154710a("mPrepareAvatar");
        }
        int width = imageView2.getWidth();
        ImageView imageView3 = this.f13538b;
        if (imageView3 == null) {
            C89219l.m154710a("mPrepareAvatar");
        }
        C7577g.m15571a(imageView, avatarThumb, width, imageView3.getHeight(), 2131234441);
        C11291z zVar = new C11291z(5, 0.0f);
        if (avatarThumb == null || avatarThumb.getUrls() == null || avatarThumb.getUrls().size() == 0) {
            C24639c a = C24639c.m47149a(C24134g.m45734a(2131234441));
            a.f58560k = zVar;
            C24185e b = C24182c.m45843b();
            b.f57299c = (REQUEST) a.mo40483a();
            HSImageView hSImageView = this.f13537a;
            if (hSImageView == null) {
                C89219l.m154710a("mAvatarBackground");
            }
            b.f57309m = hSImageView.getController();
            AbstractC24195a c = b.mo39827e();
            HSImageView hSImageView2 = this.f13537a;
            if (hSImageView2 == null) {
                C89219l.m154710a("mAvatarBackground");
            }
            hSImageView2.setController(c);
        } else {
            HSImageView hSImageView3 = this.f13537a;
            if (hSImageView3 == null) {
                C89219l.m154710a("mAvatarBackground");
            }
            C3941k.m9604a(hSImageView3, avatarThumb, zVar);
        }
        TextView textView = this.f13542f;
        if (textView == null) {
            C89219l.m154710a("mOnlineName");
        }
        textView.setText(C6581g.m14075a(user));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    /* renamed from: a */
    public void mo10892a(boolean z) {
        if (!z || this.f13526D) {
            View view = this.f13551p;
            if (view == null) {
                C89219l.m154710a("mOnlineCameraSwitch");
            }
            view.setVisibility(8);
            View view2 = this.f13552q;
            if (view2 == null) {
                C89219l.m154710a("mOnlineClose");
            }
            view2.setVisibility(8);
            return;
        }
        View view3 = this.f13551p;
        if (view3 == null) {
            C89219l.m154710a("mOnlineCameraSwitch");
        }
        view3.setVisibility(this.f13546j.mo10887e() ? 4 : 0);
        View view4 = this.f13552q;
        if (view4 == null) {
            C89219l.m154710a("mOnlineClose");
        }
        view4.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo11020c() {
        if (this.f13530H) {
            mo11016a(3);
        }
    }

    public final HSImageView getMAvatarBackground() {
        HSImageView hSImageView = this.f13537a;
        if (hSImageView == null) {
            C89219l.m154710a("mAvatarBackground");
        }
        return hSImageView;
    }

    public final LiveLoadingView getMLoadingView() {
        LiveLoadingView liveLoadingView = this.f13541e;
        if (liveLoadingView == null) {
            C89219l.m154710a("mLoadingView");
        }
        return liveLoadingView;
    }

    public final TextView getMOnlineName() {
        TextView textView = this.f13542f;
        if (textView == null) {
            C89219l.m154710a("mOnlineName");
        }
        return textView;
    }

    public final ImageView getMPrepareAvatar() {
        ImageView imageView = this.f13538b;
        if (imageView == null) {
            C89219l.m154710a("mPrepareAvatar");
        }
        return imageView;
    }

    public final TextView getMPrepareHint() {
        TextView textView = this.f13539c;
        if (textView == null) {
            C89219l.m154710a("mPrepareHint");
        }
        return textView;
    }

    public final WaveEffectView getMWaveEffectView() {
        WaveEffectView waveEffectView = this.f13540d;
        if (waveEffectView == null) {
            C89219l.m154710a("mWaveEffectView");
        }
        return waveEffectView;
    }

    /* renamed from: b */
    public final void mo11019b() {
        SurfaceView surfaceView = this.f13557v;
        if (surfaceView != null && (surfaceView instanceof AbstractC3060a)) {
            Objects.requireNonNull(surfaceView, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.api.widget.IInteractVideoView");
            ((AbstractC3060a) surfaceView).mo8322a(PrivacyCert.Builder.Companion.with("bpea-378").usage("").tag("guest link reverse camera").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        MethodCollector.m26663i(5940);
        super.onAttachedToWindow();
        if (!this.f13528F || !this.f13532J) {
            FrameLayout.inflate(getContext(), getWindowLayoutId(), this);
            setOnClickListener(new View$OnClickListenerC5243h(this));
            mo11015a();
            this.f13530H = true;
            this.f13546j.mo10938a(this);
            if (this.f13545i) {
                i = 0;
            } else {
                i = 2;
            }
            mo11016a(i);
            if (C6229a.m13521a(getContext())) {
                int i2 = Build.VERSION.SDK_INT;
                TextView textView = this.f13542f;
                if (textView == null) {
                    C89219l.m154710a("mOnlineName");
                }
                textView.setLayoutDirection(1);
                TextView textView2 = this.f13542f;
                if (textView2 == null) {
                    C89219l.m154710a("mOnlineName");
                }
                textView2.setTextDirection(4);
            }
            this.f13529G.mo142945a(C6779a.m14563a().mo13052a(C7400q.class).mo143289d(new C5244i(this)));
            MethodCollector.m26664o(5940);
            return;
        }
        MethodCollector.m26664o(5940);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Animator animator;
        if (this.f13528F) {
            super.onDetachedFromWindow();
            return;
        }
        this.f13530H = false;
        Animator animator2 = this.f13559x;
        if (animator2 != null && animator2.isRunning()) {
            Animator animator3 = this.f13559x;
            if (animator3 == null) {
                C89219l.m154715b();
            }
            animator3.cancel();
            Animator animator4 = this.f13559x;
            if (!(animator4 == null || !animator4.isRunning() || (animator = this.f13559x) == null)) {
                animator.cancel();
            }
            this.f13558w.removeCallbacksAndMessages(null);
            this.f13535M = null;
            super.onDetachedFromWindow();
        }
        this.f13558w.removeCallbacksAndMessages(null);
        this.f13532J = false;
        this.f13546j.mo10939g();
        this.f13529G.mo142944a();
    }

    /* renamed from: a */
    public void mo11015a() {
        View findViewById = findViewById(R.id.d5i);
        C89219l.m154716b(findViewById, "");
        this.f13537a = (HSImageView) findViewById;
        View findViewById2 = findViewById(R.id.d5h);
        C89219l.m154716b(findViewById2, "");
        this.f13538b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.d5k);
        C89219l.m154716b(findViewById3, "");
        this.f13548m = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.d5l);
        C89219l.m154716b(findViewById4, "");
        this.f13549n = (HSImageView) findViewById4;
        View findViewById5 = findViewById(R.id.d5n);
        C89219l.m154716b(findViewById5, "");
        this.f13539c = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.d5j);
        C89219l.m154716b(findViewById6, "");
        this.f13550o = findViewById6;
        View findViewById7 = findViewById(R.id.d5m);
        C89219l.m154716b(findViewById7, "");
        this.f13540d = (WaveEffectView) findViewById7;
        View findViewById8 = findViewById(R.id.cg3);
        C89219l.m154716b(findViewById8, "");
        this.f13541e = (LiveLoadingView) findViewById8;
        View findViewById9 = findViewById(R.id.cwi);
        C89219l.m154716b(findViewById9, "");
        this.f13551p = findViewById9;
        if (findViewById9 == null) {
            C89219l.m154710a("mOnlineCameraSwitch");
        }
        findViewById9.setOnClickListener(new View$OnClickListenerC5241f(this));
        View findViewById10 = findViewById(R.id.cw7);
        C89219l.m154716b(findViewById10, "");
        this.f13552q = findViewById10;
        if (findViewById10 == null) {
            C89219l.m154710a("mOnlineClose");
        }
        findViewById10.setOnClickListener(new View$OnClickListenerC5242g(this));
        View findViewById11 = findViewById(R.id.cwb);
        C89219l.m154716b(findViewById11, "");
        this.f13542f = (TextView) findViewById11;
        View findViewById12 = findViewById(R.id.cwj);
        C89219l.m154716b(findViewById12, "");
        this.f13553r = (TextView) findViewById12;
        View findViewById13 = findViewById(R.id.cwk);
        C89219l.m154716b(findViewById13, "");
        this.f13554s = findViewById13;
        View findViewById14 = findViewById(R.id.cwg);
        C89219l.m154716b(findViewById14, "");
        this.f13555t = (ProgressBar) findViewById14;
        View findViewById15 = findViewById(R.id.cw9);
        C89219l.m154716b(findViewById15, "");
        this.f13543g = (TextView) findViewById15;
        View findViewById16 = findViewById(R.id.cw8);
        C89219l.m154716b(findViewById16, "");
        this.f13556u = findViewById16;
        this.f13532J = true;
    }

    public final void setAdjustParent(boolean z) {
        this.f13528F = z;
    }

    public final void setCurrentUserIsLinkedGuest(boolean z) {
        this.f13526D = z;
    }

    public final void setHasInit(boolean z) {
        this.f13532J = z;
    }

    /* access modifiers changed from: protected */
    public final void setMCurrentUserIsLinkedGuest(boolean z) {
        this.f13526D = z;
    }

    public final void setMultiLiveEnable(boolean z) {
        this.f13533K = z;
    }

    public final void setPosInMultiLive(int i) {
        this.f13531I = i;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$c */
    public static final class C5238c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5235a f13562a;

        static {
            Covode.recordClassIndex(5830);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5238c(C5235a aVar) {
            this.f13562a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            if (this.f13562a.getMPresenter().mo10886d()) {
                this.f13562a.mo11016a(3);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
            C89219l.m154721d(animator, "");
            C5235a aVar = this.f13562a;
            aVar.f13544h--;
            C5235a.m11569a(this.f13562a).setText(String.valueOf(this.f13562a.f13544h));
        }

        public final void onAnimationStart(Animator animator) {
            C89219l.m154721d(animator, "");
            C5235a.m11569a(this.f13562a).setText(String.valueOf(this.f13562a.f13544h));
            C5235a.m11569a(this.f13562a).setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$f */
    public static final class View$OnClickListenerC5241f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5235a f13565a;

        static {
            Covode.recordClassIndex(5833);
        }

        View$OnClickListenerC5241f(C5235a aVar) {
            this.f13565a = aVar;
        }

        public final void onClick(View view) {
            this.f13565a.mo11019b();
        }
    }

    public final void setMAvatarBackground(HSImageView hSImageView) {
        C89219l.m154721d(hSImageView, "");
        this.f13537a = hSImageView;
    }

    public final void setMLoadingView(LiveLoadingView liveLoadingView) {
        C89219l.m154721d(liveLoadingView, "");
        this.f13541e = liveLoadingView;
    }

    public final void setMOnlineName(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f13542f = textView;
    }

    public final void setMPrepareAvatar(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        this.f13538b = imageView;
    }

    public final void setMPrepareHint(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f13539c = textView;
    }

    public final void setMWaveEffectView(WaveEffectView waveEffectView) {
        C89219l.m154721d(waveEffectView, "");
        this.f13540d = waveEffectView;
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m11569a(C5235a aVar) {
        TextView textView = aVar.f13543g;
        if (textView == null) {
            C89219l.m154710a("mOnlineCountDown");
        }
        return textView;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    public void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        setVisibility(i);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$i */
    static final class C5244i<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C5235a f13568a;

        static {
            Covode.recordClassIndex(5836);
        }

        C5244i(C5235a aVar) {
            this.f13568a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7400q qVar = (C7400q) obj;
            C89219l.m154716b(qVar, "");
            if (qVar.f18334a == 2) {
                this.f13568a.mo11019b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$g */
    public static final class View$OnClickListenerC5242g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5235a f13566a;

        static {
            Covode.recordClassIndex(5834);
        }

        View$OnClickListenerC5242g(C5235a aVar) {
            this.f13566a = aVar;
        }

        public final void onClick(View view) {
            C5235a aVar = this.f13566a;
            DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(aVar.getContext());
            String str = LinkApi.EnumC7286d.WINDOW.value;
            C89219l.m154716b(str, "");
            C5714i.m12535a(str);
            aVar2.mo15243a(R.string.dyp).mo15248b(R.string.efq).mo15244a(R.string.dyo, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC5239d(aVar), false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC5240e.f13564a, false).mo15247a().show();
            C5714i.m12569h();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$h */
    static final class View$OnClickListenerC5243h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5235a f13567a;

        static {
            Covode.recordClassIndex(5835);
        }

        View$OnClickListenerC5243h(C5235a aVar) {
            this.f13567a = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r13) {
            /*
            // Method dump skipped, instructions count: 208
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.p333g.p335b.C5235a.View$OnClickListenerC5243h.onClick(android.view.View):void");
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        long j;
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i == 0) {
            int i2 = this.f13523A - 1;
            this.f13523A = i2;
            if (i2 <= 0) {
                DataChannel dataChannel = this.f13547k;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C5686e.class, this.f13534L);
                }
                if (this.f13557v == null) {
                    mo11016a(1);
                } else {
                    mo11016a(2);
                }
            } else {
                TextView textView = this.f13548m;
                if (textView == null) {
                    C89219l.m154710a("mPrepareCountDown");
                }
                textView.setText(String.valueOf(this.f13523A));
                this.f13558w.sendEmptyMessageDelayed(0, 1000);
            }
        } else if (i != 1) {
            if (i == 2) {
                TextView textView2 = this.f13543g;
                if (textView2 == null) {
                    C89219l.m154710a("mOnlineCountDown");
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView2, "scaleX", 1.0f, 2.0f, 1.0f);
                C89219l.m154716b(ofFloat, "");
                ofFloat.setRepeatCount(5);
                ofFloat.setDuration(1000L);
                ofFloat.addListener(new C5238c(this));
                TextView textView3 = this.f13543g;
                if (textView3 == null) {
                    C89219l.m154710a("mOnlineCountDown");
                }
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, "scaleY", 1.0f, 2.0f, 1.0f);
                C89219l.m154716b(ofFloat2, "");
                ofFloat2.setRepeatCount(5);
                ofFloat2.setDuration(1000L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ofFloat, ofFloat2);
                animatorSet.start();
            } else if (i == 3 && this.f13525C) {
                long j2 = this.f13524B;
                if (j2 <= 0) {
                    DataChannel dataChannel2 = this.f13547k;
                    if (dataChannel2 != null) {
                        dataChannel2.mo28315b(C5687f.class, this.f13534L);
                        return;
                    }
                    return;
                }
                if (j2 < 1000) {
                    j = j2;
                } else {
                    j = 1000;
                }
                this.f13524B = j2 - 1000;
                this.f13558w.sendEmptyMessageDelayed(3, j);
            }
        } else if (this.f13546j.mo10886d()) {
            DataChannel dataChannel3 = this.f13547k;
            if (dataChannel3 != null) {
                dataChannel3.mo28320c(C4441l.class, new C7399p(5));
            }
        } else {
            AbstractC5236a aVar = this.f13535M;
            if (aVar != null) {
                aVar.mo11052a(this);
            }
        }
    }

    /* renamed from: a */
    public void mo11016a(int i) {
        this.f13527E = i;
        if (i == 0) {
            View view = this.f13550o;
            if (view == null) {
                C89219l.m154710a("mPrepareContainer");
            }
            view.setVisibility(0);
            View view2 = this.f13556u;
            if (view2 == null) {
                C89219l.m154710a("mOnlineContainer");
            }
            view2.setVisibility(8);
            TextView textView = this.f13548m;
            if (textView == null) {
                C89219l.m154710a("mPrepareCountDown");
            }
            textView.setVisibility(0);
            HSImageView hSImageView = this.f13549n;
            if (hSImageView == null) {
                C89219l.m154710a("mCountDownBackGround");
            }
            hSImageView.setVisibility(0);
            TextView textView2 = this.f13539c;
            if (textView2 == null) {
                C89219l.m154710a("mPrepareHint");
            }
            textView2.setText(R.string.dxn);
            TextView textView3 = this.f13548m;
            if (textView3 == null) {
                C89219l.m154710a("mPrepareCountDown");
            }
            textView3.setText(String.valueOf(this.f13523A));
            WaveEffectView waveEffectView = this.f13540d;
            if (waveEffectView == null) {
                C89219l.m154710a("mWaveEffectView");
            }
            waveEffectView.setVisibility(8);
            LiveLoadingView liveLoadingView = this.f13541e;
            if (liveLoadingView == null) {
                C89219l.m154710a("mLoadingView");
            }
            liveLoadingView.setVisibility(8);
            this.f13558w.sendEmptyMessageDelayed(0, 1000);
            if (this.f13525C) {
                this.f13558w.sendEmptyMessage(3);
            }
        } else if (i == 1) {
            View view3 = this.f13550o;
            if (view3 == null) {
                C89219l.m154710a("mPrepareContainer");
            }
            view3.setVisibility(0);
            View view4 = this.f13556u;
            if (view4 == null) {
                C89219l.m154710a("mOnlineContainer");
            }
            view4.setVisibility(8);
            TextView textView4 = this.f13548m;
            if (textView4 == null) {
                C89219l.m154710a("mPrepareCountDown");
            }
            textView4.setVisibility(8);
            HSImageView hSImageView2 = this.f13549n;
            if (hSImageView2 == null) {
                C89219l.m154710a("mCountDownBackGround");
            }
            hSImageView2.setVisibility(8);
            TextView textView5 = this.f13539c;
            if (textView5 == null) {
                C89219l.m154710a("mPrepareHint");
            }
            textView5.setText(R.string.dxn);
            WaveEffectView waveEffectView2 = this.f13540d;
            if (waveEffectView2 == null) {
                C89219l.m154710a("mWaveEffectView");
            }
            waveEffectView2.setVisibility(0);
            WaveEffectView waveEffectView3 = this.f13540d;
            if (waveEffectView3 == null) {
                C89219l.m154710a("mWaveEffectView");
            }
            waveEffectView3.mo11490a();
            LiveLoadingView liveLoadingView2 = this.f13541e;
            if (liveLoadingView2 == null) {
                C89219l.m154710a("mLoadingView");
            }
            liveLoadingView2.setVisibility(0);
            this.f13558w.sendEmptyMessageDelayed(0, 1000);
        } else if (i == 2) {
            View view5 = this.f13550o;
            if (view5 == null) {
                C89219l.m154710a("mPrepareContainer");
            }
            view5.setVisibility(8);
            View view6 = this.f13556u;
            if (view6 == null) {
                C89219l.m154710a("mOnlineContainer");
            }
            view6.setVisibility(0);
        } else if (i == 3) {
            View view7 = this.f13550o;
            if (view7 == null) {
                C89219l.m154710a("mPrepareContainer");
            }
            view7.setVisibility(0);
            View view8 = this.f13556u;
            if (view8 == null) {
                C89219l.m154710a("mOnlineContainer");
            }
            view8.setVisibility(8);
            TextView textView6 = this.f13548m;
            if (textView6 == null) {
                C89219l.m154710a("mPrepareCountDown");
            }
            textView6.setVisibility(8);
            HSImageView hSImageView3 = this.f13549n;
            if (hSImageView3 == null) {
                C89219l.m154710a("mCountDownBackGround");
            }
            hSImageView3.setVisibility(8);
            TextView textView7 = this.f13539c;
            if (textView7 == null) {
                C89219l.m154710a("mPrepareHint");
            }
            textView7.setText(R.string.dys);
            if (this.f13533K) {
                this.f13558w.sendEmptyMessage(1);
            } else {
                this.f13558w.sendEmptyMessageDelayed(1, 1500);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    /* renamed from: a */
    public final void mo10890a(long j) {
        String valueOf = String.valueOf(j);
        TextView textView = this.f13553r;
        if (textView == null) {
            C89219l.m154710a("mOnlineTicket");
        }
        if (!C89219l.m154714a((Object) valueOf, (Object) textView.getText().toString())) {
            TextView textView2 = this.f13553r;
            if (textView2 == null) {
                C89219l.m154710a("mOnlineTicket");
            }
            String a = C11207aa.m19863a(j);
            C89219l.m154716b(a, "");
            Locale locale = Locale.ROOT;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a.toUpperCase(locale);
            C89219l.m154716b(upperCase, "");
            textView2.setText(upperCase);
        }
    }

    /* renamed from: a */
    public final void mo11017a(SurfaceView surfaceView) {
        ViewParent viewParent;
        MethodCollector.m26663i(6105);
        if (surfaceView == null) {
            MethodCollector.m26664o(6105);
            return;
        }
        removeView(this.f13557v);
        this.f13557v = surfaceView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        SurfaceView surfaceView2 = this.f13557v;
        if (surfaceView2 != null) {
            surfaceView2.setLayoutParams(layoutParams);
        }
        SurfaceView surfaceView3 = this.f13557v;
        if (surfaceView3 != null) {
            viewParent = surfaceView3.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof ViewGroup) {
            if (viewParent == this) {
                MethodCollector.m26664o(6105);
                return;
            }
            ((ViewGroup) viewParent).removeView(this.f13557v);
        }
        addView(this.f13557v, 0);
        if (this.f13527E == 1) {
            mo11016a(2);
        }
        MethodCollector.m26664o(6105);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$e */
    static final class DialogInterface$OnClickListenerC5240e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC5240e f13564a = new DialogInterface$OnClickListenerC5240e();

        static {
            Covode.recordClassIndex(5832);
        }

        DialogInterface$OnClickListenerC5240e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5714i.m12553b(0);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.a$d */
    static final class DialogInterface$OnClickListenerC5239d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C5235a f13563a;

        static {
            Covode.recordClassIndex(5831);
        }

        DialogInterface$OnClickListenerC5239d(C5235a aVar) {
            this.f13563a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5714i.m12553b(1);
            this.f13563a.mo11016a(3);
            dialogInterface.dismiss();
            C5712g.m12498a("guest_over", null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.p316a.p318b.C5137b.AbstractC5139b
    /* renamed from: a */
    public final void mo10889a(int i, boolean z) {
        if (!this.f13526D && this.f13545i) {
            Animator animator = this.f13559x;
            if (animator == null || !animator.isRunning()) {
                ProgressBar progressBar = this.f13555t;
                if (progressBar == null) {
                    C89219l.m154710a("mOnlineProgress");
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, "progress", 100, 0);
                this.f13559x = ofInt;
                if (ofInt == null) {
                    C89219l.m154715b();
                }
                ofInt.setDuration(((long) i) * 1000);
                Animator animator2 = this.f13559x;
                if (animator2 == null) {
                    C89219l.m154715b();
                }
                animator2.setInterpolator(new LinearInterpolator());
                ProgressBar progressBar2 = this.f13555t;
                if (progressBar2 == null) {
                    C89219l.m154710a("mOnlineProgress");
                }
                progressBar2.setVisibility(0);
                Animator animator3 = this.f13559x;
                if (animator3 == null) {
                    C89219l.m154715b();
                }
                animator3.start();
                if (z) {
                    this.f13558w.sendEmptyMessageDelayed(2, ((long) (i - 5)) * 1000);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5235a(Context context, String str, C5137b.AbstractC5138a aVar, AbstractC5236a aVar2, DataChannel dataChannel) {
        super(context);
        long j;
        boolean z;
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(6258);
        this.f13534L = str;
        this.f13546j = aVar;
        this.f13535M = aVar2;
        this.f13547k = dataChannel;
        int value = GuestCountDownTimeSetting.INSTANCE.getValue();
        this.f13560y = value;
        double value2 = GuestPushStreamTimeAndroidSetting.INSTANCE.getValue();
        this.f13561z = value2;
        value = value <= 0 ? 5 : value;
        this.f13523A = value;
        this.f13544h = 5;
        if (value2 > 0.01d) {
            j = (long) (value2 * 1000.0d);
        } else {
            j = 0;
        }
        this.f13524B = j;
        if (j <= 0 || j >= ((long) (value * 1000))) {
            z = false;
        } else {
            z = true;
        }
        this.f13525C = z;
        this.f13529G = new C88411a();
        this.f13531I = -1;
        MethodCollector.m26664o(6258);
    }
}
