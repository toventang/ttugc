package com.bytedance.android.livesdk.like.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeView;
import com.bytedance.android.livesdk.like.widget.anim.DiggTapView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9068cg;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11137ac;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashSet;
import java.util.Iterator;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88404ac;
import p4560f.p4561a.AbstractC88405ad;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;

public final class SelfLikeWidget extends LiveRecyclableWidget implements AbstractC9170d, AbstractC33974au {

    /* renamed from: f */
    public static final int f22461f = C3966y.m9653a(85.0f);

    /* renamed from: g */
    public static final int f22462g = C3966y.m9653a(32.0f);

    /* renamed from: h */
    public static final C9220a f22463h = new C9220a((byte) 0);

    /* renamed from: a */
    public FrameLayout f22464a;

    /* renamed from: b */
    public DiggTapView f22465b;

    /* renamed from: c */
    public BottomLikeView f22466c;

    /* renamed from: d */
    public LottieAnimationView f22467d;

    /* renamed from: e */
    public User f22468e;

    /* renamed from: i */
    private final AbstractC89244h f22469i = C11831d.m20835a(new C9236g(this));

    /* renamed from: j */
    private final AbstractC89244h f22470j = C11831d.m20835a(new C9234e(this));

    /* renamed from: k */
    private long f22471k;

    /* renamed from: l */
    private Room f22472l;

    /* renamed from: m */
    private boolean f22473m;

    /* renamed from: n */
    private boolean f22474n;

    /* renamed from: o */
    private IMessageManager f22475o;

    /* renamed from: p */
    private boolean f22476p;

    /* renamed from: q */
    private boolean f22477q;

    /* renamed from: a */
    private final C9230d m17479a() {
        return (C9230d) this.f22469i.getValue();
    }

    /* renamed from: b */
    private final C9222c m17482b() {
        return (C9222c) this.f22470j.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bb9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$a */
    public static final class C9220a {
        static {
            Covode.recordClassIndex(10132);
        }

        private C9220a() {
        }

        public /* synthetic */ C9220a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Bitmap m17486a(Bitmap bitmap, int i) {
            MethodCollector.m26663i(5753);
            C89219l.m154721d(bitmap, "");
            Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Rect rect = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect);
            float f = (float) (i / 2);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            paint.setColor(Color.parseColor("#ffffff"));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth((float) C3966y.m9653a(1.3f));
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
            C89219l.m154716b(createBitmap, "");
            MethodCollector.m26664o(5753);
            return createBitmap;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$e */
    static final class C9234e extends AbstractC89220m implements AbstractC89171a<C9222c> {

        /* renamed from: a */
        final /* synthetic */ SelfLikeWidget f22498a;

        static {
            Covode.recordClassIndex(10146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9234e(SelfLikeWidget selfLikeWidget) {
            super(0);
            this.f22498a = selfLikeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9222c invoke() {
            return new C9222c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$g */
    static final class C9236g extends AbstractC89220m implements AbstractC89171a<C9230d> {

        /* renamed from: a */
        final /* synthetic */ SelfLikeWidget f22500a;

        static {
            Covode.recordClassIndex(10148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9236g(SelfLikeWidget selfLikeWidget) {
            super(0);
            this.f22500a = selfLikeWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9230d invoke() {
            return new C9230d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$d */
    public final class C9230d extends AbstractC9221b {

        /* renamed from: b */
        final HashSet<Bitmap> f22488b = new HashSet<>();

        /* renamed from: c */
        final HashSet<LottieAnimationView> f22489c = new HashSet<>();

        static {
            Covode.recordClassIndex(10142);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$d$b */
        public static final class C9232b implements AbstractC88428a {

            /* renamed from: a */
            final /* synthetic */ C9230d f22493a;

            /* renamed from: b */
            final /* synthetic */ LottieAnimationView f22494b;

            /* renamed from: c */
            final /* synthetic */ C9233c f22495c;

            static {
                Covode.recordClassIndex(10144);
            }

            C9232b(C9230d dVar, LottieAnimationView lottieAnimationView, C9233c cVar) {
                this.f22493a = dVar;
                this.f22494b = lottieAnimationView;
                this.f22495c = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88428a
            /* renamed from: a */
            public final void mo8579a() {
                this.f22494b.mo5832b(this.f22495c);
                this.f22493a.mo15323a(this.f22494b);
            }
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.AbstractC9221b
        /* renamed from: b */
        public final void mo15322b() {
            SelfLikeWidget.m17480a(SelfLikeWidget.this).mo15358a();
            this.f22489c.clear();
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.AbstractC9221b
        /* renamed from: a */
        public final void mo15321a() {
            MethodCollector.m26663i(5977);
            HashSet<Bitmap> hashSet = this.f22488b;
            Context context = SelfLikeWidget.this.context;
            C89219l.m154716b(context, "");
            hashSet.add(BitmapFactory.decodeResource(context.getResources(), 2131234013));
            MethodCollector.m26664o(5977);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$d$a */
        public static final class C9231a<T> implements AbstractC88407af {

            /* renamed from: a */
            final /* synthetic */ LottieAnimationView f22491a;

            /* renamed from: b */
            final /* synthetic */ C9233c f22492b;

            static {
                Covode.recordClassIndex(10143);
            }

            C9231a(LottieAnimationView lottieAnimationView, C9233c cVar) {
                this.f22491a = lottieAnimationView;
                this.f22492b = cVar;
            }

            @Override // p4560f.p4561a.AbstractC88407af
            public final void subscribe(AbstractC88405ad<Animator.AnimatorListener> adVar) {
                C89219l.m154721d(adVar, "");
                this.f22491a.mo5828a(this.f22492b);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$d$c */
        public static final class C9233c extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C9230d f22496a;

            /* renamed from: b */
            final /* synthetic */ LottieAnimationView f22497b;

            static {
                Covode.recordClassIndex(10145);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                this.f22497b.mo5832b(this);
                this.f22496a.mo15323a(this.f22497b);
            }

            C9233c(C9230d dVar, LottieAnimationView lottieAnimationView) {
                this.f22496a = dVar;
                this.f22497b = lottieAnimationView;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9230d() {
            super();
        }

        /* renamed from: a */
        public final void mo15323a(LottieAnimationView lottieAnimationView) {
            MethodCollector.m26663i(6299);
            lottieAnimationView.setVisibility(4);
            if (this.f22489c.size() >= 5) {
                SelfLikeWidget.m17481b(SelfLikeWidget.this).removeView(lottieAnimationView);
                MethodCollector.m26664o(6299);
                return;
            }
            this.f22489c.add(lottieAnimationView);
            MethodCollector.m26664o(6299);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo15324a(LottieAnimationView lottieAnimationView, PointF pointF) {
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setX(pointF.x);
            lottieAnimationView.setY(pointF.y);
            C9233c cVar = new C9233c(this, lottieAnimationView);
            ((AbstractC11137ac) AbstractC88403ab.m153596a((AbstractC88407af) new C9231a(lottieAnimationView, cVar)).mo142919b((AbstractC88428a) new C9232b(this, lottieAnimationView, cVar)).mo142916a((AbstractC88404ac) WidgetExtendsKt.autoDispose(SelfLikeWidget.this))).mo17935a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c */
    public final class C9222c extends AbstractC9221b {

        /* renamed from: b */
        public Bitmap f22479b;

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$c */
        public static final class C9225c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C9225c f22483a = new C9225c();

            static {
                Covode.recordClassIndex(10137);
            }

            C9225c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$g */
        static final class C9229g<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C9229g f22487a = new C9229g();

            static {
                Covode.recordClassIndex(10141);
            }

            C9229g() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(10134);
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.AbstractC9221b
        /* renamed from: b */
        public final void mo15322b() {
            SelfLikeWidget.m17483c(SelfLikeWidget.this).mo15344a();
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeWidget.AbstractC9221b
        /* renamed from: a */
        public final void mo15321a() {
            AbstractC88979t<Bitmap> a;
            AbstractC88979t<R> d;
            AbstractC88979t<R> b;
            AbstractC88979t<R> a2;
            AbstractC11181z zVar;
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            AbstractC2994b a3 = b2.mo13147a();
            C89219l.m154716b(a3, "");
            ImageModel avatarThumb = a3.getAvatarThumb();
            if (avatarThumb != null && (a = C7577g.m15569a(avatarThumb)) != null && (d = a.mo143292d(C9223a.f22481a)) != null && (b = d.mo143278b(C88925a.m154180b(C88946a.f201991c))) != null && (a2 = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null && (zVar = (AbstractC11181z) a2.mo143274a(WidgetExtendsKt.autoDispose(SelfLikeWidget.this))) != null) {
                zVar.mo17950a(new C9224b(this), C9225c.f22483a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$a */
        public static final class C9223a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9223a f22481a = new C9223a();

            static {
                Covode.recordClassIndex(10135);
            }

            C9223a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C89219l.m154721d(bitmap, "");
                return C9220a.m17486a(bitmap, SelfLikeWidget.f22462g);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$b */
        public static final class C9224b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C9222c f22482a;

            static {
                Covode.recordClassIndex(10136);
            }

            C9224b(C9222c cVar) {
                this.f22482a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f22482a.f22479b = bitmap;
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$d */
        static final class C9226d<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9226d f22484a = new C9226d();

            static {
                Covode.recordClassIndex(10138);
            }

            C9226d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                AbstractC2994b bVar = (AbstractC2994b) obj;
                C89219l.m154721d(bVar, "");
                return C7577g.m15569a(bVar.getAvatarThumb());
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$e */
        static final class C9227e<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9227e f22485a = new C9227e();

            static {
                Covode.recordClassIndex(10139);
            }

            C9227e() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C89219l.m154721d(bitmap, "");
                return C9220a.m17486a(bitmap, SelfLikeWidget.f22462g);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$c$f */
        static final class C9228f<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C9222c f22486a;

            static {
                Covode.recordClassIndex(10140);
            }

            C9228f(C9222c cVar) {
                this.f22486a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    this.f22486a.f22479b = bitmap;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9222c() {
            super();
            MethodCollector.m26663i(5893);
            Context context = SelfLikeWidget.this.context;
            C89219l.m154716b(context, "");
            this.f22479b = OptimizedLikeHelper.m17411a(BitmapFactory.decodeResource(context.getResources(), 2131234441), OptimizedLikeHelper.f22331u);
            MethodCollector.m26664o(5893);
        }
    }

    static {
        Covode.recordClassIndex(10131);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        m17479a().mo15322b();
        m17482b().mo15322b();
        LottieAnimationView lottieAnimationView = this.f22467d;
        if (lottieAnimationView == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView.mo5836d();
        LottieAnimationView lottieAnimationView2 = this.f22467d;
        if (lottieAnimationView2 == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView2.setVisibility(8);
        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f22471k);
        if (likeHelper != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15280b(this);
            likeHelper.mo15279b((View) null);
        }
        Iterator<T> it = m17479a().f22488b.iterator();
        while (it.hasNext()) {
            it.next().recycle();
        }
        m17482b();
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$b */
    abstract class AbstractC9221b {
        static {
            Covode.recordClassIndex(10133);
        }

        /* renamed from: a */
        public void mo15321a() {
        }

        /* renamed from: b */
        public void mo15322b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public AbstractC9221b() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeWidget$f */
    public static final class C9235f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ SelfLikeWidget f22499a;

        static {
            Covode.recordClassIndex(10147);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9235f(SelfLikeWidget selfLikeWidget) {
            this.f22499a = selfLikeWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LottieAnimationView lottieAnimationView = this.f22499a.f22467d;
            if (lottieAnimationView == null) {
                C89219l.m154710a("flowerAnimation");
            }
            lottieAnimationView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m17481b(SelfLikeWidget selfLikeWidget) {
        FrameLayout frameLayout = selfLikeWidget.f22464a;
        if (frameLayout == null) {
            C89219l.m154710a("tapLottieContainer");
        }
        return frameLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ BottomLikeView m17483c(SelfLikeWidget selfLikeWidget) {
        BottomLikeView bottomLikeView = selfLikeWidget.f22466c;
        if (bottomLikeView == null) {
            C89219l.m154710a("bottomLikeView");
        }
        return bottomLikeView;
    }

    /* renamed from: a */
    public static final /* synthetic */ DiggTapView m17480a(SelfLikeWidget selfLikeWidget) {
        DiggTapView diggTapView = selfLikeWidget.f22465b;
        if (diggTapView == null) {
            C89219l.m154710a("tapView");
        }
        return diggTapView;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.ef7);
        C89219l.m154716b(findViewById, "");
        this.f22464a = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.ef9);
        C89219l.m154716b(findViewById2, "");
        this.f22465b = (DiggTapView) findViewById2;
        View findViewById3 = findViewById(R.id.dv1);
        C89219l.m154716b(findViewById3, "");
        this.f22466c = (BottomLikeView) findViewById3;
        View findViewById4 = findViewById(R.id.b66);
        C89219l.m154716b(findViewById4, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById4;
        this.f22467d = lottieAnimationView;
        if (lottieAnimationView == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView.mo5828a(new C9235f(this));
        m17479a().mo15321a();
        m17482b().mo15321a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        boolean z2;
        long j;
        Boolean bool;
        Boolean bool2;
        this.f22476p = false;
        this.f22477q = false;
        DataChannel dataChannel = this.dataChannel;
        IMessageManager iMessageManager = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f22472l = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool2 = (Boolean) dataChannel2.mo28318b(C9076co.class)) == null) {
            z = true;
        } else {
            z = bool2.booleanValue();
        }
        this.f22473m = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.mo28318b(C9119ed.class)) == null) {
            z2 = false;
        } else {
            z2 = bool.booleanValue();
        }
        this.f22474n = z2;
        this.f22468e = C2997d.C2998a.m8305a();
        Room room2 = this.f22472l;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.f22471k = j;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.mo28318b(C9068cg.class);
        }
        this.f22475o = iMessageManager;
        m17479a();
        C9222c b = m17482b();
        ((AbstractC11181z) C11115u.m19743a().mo17915b().mo13170j().mo143267a((AbstractC88434g<? super AbstractC2994b, ? extends AbstractC88984x<? extends R>>) C9222c.C9226d.f22484a, false).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(C9222c.C9227e.f22485a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(SelfLikeWidget.this))).mo17950a(new C9222c.C9228f(b), C9222c.C9229g.f22487a);
        LottieAnimationView lottieAnimationView = this.f22467d;
        if (lottieAnimationView == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView.setVisibility(8);
        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f22471k);
        if (likeHelper != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15271a(this);
            DiggTapView diggTapView = this.f22465b;
            if (diggTapView == null) {
                C89219l.m154710a("tapView");
            }
            likeHelper.mo15279b(diggTapView);
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
        C89219l.m154721d(bVar, "");
        if (bVar.mo15296o() && i >= bVar.mo15284d()) {
            LottieAnimationView lottieAnimationView = this.f22467d;
            if (lottieAnimationView == null) {
                C89219l.m154710a("flowerAnimation");
            }
            if (!lottieAnimationView.f5900b.mo6025g()) {
                LottieAnimationView lottieAnimationView2 = this.f22467d;
                if (lottieAnimationView2 == null) {
                    C89219l.m154710a("flowerAnimation");
                }
                lottieAnimationView2.setVisibility(0);
                LottieAnimationView lottieAnimationView3 = this.f22467d;
                if (lottieAnimationView3 == null) {
                    C89219l.m154710a("flowerAnimation");
                }
                lottieAnimationView3.mo5826a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10822a(AbstractC9168b bVar, int i, int i2, float f, float f2, float f3, float f4) {
        int i3;
        int i4;
        LottieAnimationView lottieAnimationView;
        RoomAuthStatus roomAuthStatus;
        MethodCollector.m26663i(6489);
        C89219l.m154721d(bVar, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (b.mo13165e()) {
            Room room = this.f22472l;
            if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enableDigg) {
                if (Build.VERSION.SDK_INT >= 21 && !this.f22474n) {
                    try {
                        View view = getView();
                        if (view != null) {
                            view.performHapticFeedback(1, 2);
                        }
                    } catch (Throwable unused) {
                    }
                }
                Bitmap j = bVar.mo15291j();
                if (j != null) {
                    if (!j.isRecycled()) {
                        C9222c b2 = m17482b();
                        C89219l.m154721d(j, "");
                        Bitmap bitmap = b2.f22479b;
                        int nextInt = AbstractC89255c.Default.nextInt(1, 16) * 2;
                        BottomLikeView c = m17483c(SelfLikeWidget.this);
                        float a = (float) C3966y.m9653a(50.0f);
                        if (bitmap != null) {
                            i3 = bitmap.getWidth();
                        } else {
                            i3 = 0;
                        }
                        PointF pointF = new PointF(a - ((float) (i3 / 2)), (float) C3966y.m9653a(236.0f));
                        float f5 = 50.0f - ((float) nextInt);
                        float a2 = (float) C3966y.m9653a(f5);
                        float a3 = (float) C3966y.m9653a(150.0f);
                        if (bitmap != null) {
                            i4 = bitmap.getHeight();
                        } else {
                            i4 = 0;
                        }
                        PointF pointF2 = new PointF(a2, a3 - ((float) (i4 / 2)));
                        PointF pointF3 = new PointF((float) C3966y.m9653a(f5), (float) C3966y.m9653a(55.0f));
                        C89219l.m154721d(j, "");
                        C89219l.m154721d(pointF, "");
                        C89219l.m154721d(pointF2, "");
                        C89219l.m154721d(pointF3, "");
                        c.f22537a.add(new BottomLikeView.C9248b(c, true, bitmap, j, pointF, pointF2, pointF3));
                        C9230d a4 = m17479a();
                        C89219l.m154721d(j, "");
                        int[] iArr = new int[2];
                        m17481b(SelfLikeWidget.this).getLocationOnScreen(iArr);
                        int i5 = f22461f;
                        PointF pointF4 = new PointF((f - ((float) iArr[0])) - ((float) (i5 / 2)), (f2 - ((float) iArr[1])) - ((float) (i5 / 2)));
                        HashSet<LottieAnimationView> hashSet = a4.f22489c;
                        if (!(!hashSet.isEmpty()) || hashSet == null || (lottieAnimationView = (LottieAnimationView) C89070n.m154565c((Iterable) hashSet)) == null) {
                            lottieAnimationView = new LottieAnimationView(SelfLikeWidget.this.context);
                            a4.mo15324a(lottieAnimationView, pointF4);
                            lottieAnimationView.setAnimation("digg_tap/data.json");
                            lottieAnimationView.setImageAssetsFolder("digg_tap/images");
                            m17481b(SelfLikeWidget.this).addView(lottieAnimationView, new FrameLayout.LayoutParams(i5, i5));
                        } else {
                            a4.f22489c.remove(lottieAnimationView);
                            a4.mo15324a(lottieAnimationView, pointF4);
                        }
                        lottieAnimationView.mo5826a();
                        int[] iArr2 = new int[2];
                        m17480a(SelfLikeWidget.this).getLocationOnScreen(iArr2);
                        PointF pointF5 = new PointF(f - ((float) iArr2[0]), f2 - ((float) iArr2[1]));
                        if (f3 > 0.0f && f4 > 0.0f) {
                            PointF pointF6 = new PointF(f3, f4);
                            DiggTapView a5 = m17480a(SelfLikeWidget.this);
                            C89219l.m154721d(j, "");
                            C89219l.m154721d(pointF5, "");
                            C89219l.m154721d(pointF6, "");
                            a5.f22599a.add(new DiggTapView.C9261b(a5, j, pointF5, pointF6));
                        }
                    }
                    MethodCollector.m26664o(6489);
                    return;
                }
                MethodCollector.m26664o(6489);
                return;
            }
            MethodCollector.m26664o(6489);
            return;
        }
        MethodCollector.m26664o(6489);
    }
}
