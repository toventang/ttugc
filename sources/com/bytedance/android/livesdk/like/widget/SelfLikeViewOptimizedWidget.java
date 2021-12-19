package com.bytedance.android.livesdk.like.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.p036g.C0693f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.like.AbstractC9170d;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.anim.BottomLikeOptimizedView;
import com.bytedance.android.livesdk.like.widget.anim.LikeViewOptimizedTapView;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.userservice.C11115u;
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
import java.util.Iterator;
import java.util.LinkedList;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4617i.AbstractC89255c;

public final class SelfLikeViewOptimizedWidget extends LiveRecyclableWidget implements AbstractC9170d, AbstractC33974au {

    /* renamed from: a */
    public FrameLayout f22434a;

    /* renamed from: b */
    public LikeViewOptimizedTapView f22435b;

    /* renamed from: c */
    public BottomLikeOptimizedView f22436c;

    /* renamed from: d */
    public LottieAnimationView f22437d;

    /* renamed from: e */
    public final C0693f.C0695b<LottieAnimationView> f22438e = new C0693f.C0695b<>(5);

    /* renamed from: f */
    public final LinkedList<LottieAnimationView> f22439f = new LinkedList<>();

    /* renamed from: g */
    private final AbstractC89244h f22440g = C11831d.m20835a(new C9219f(this));

    /* renamed from: h */
    private final AbstractC89244h f22441h = C11831d.m20835a(new C9217d(this));

    /* renamed from: i */
    private long f22442i;

    /* renamed from: j */
    private Room f22443j;

    /* renamed from: k */
    private boolean f22444k;

    static {
        Covode.recordClassIndex(10116);
    }

    /* renamed from: a */
    private final C9215c m17467a() {
        return (C9215c) this.f22440g.getValue();
    }

    /* renamed from: b */
    private final C9207b m17470b() {
        return (C9207b) this.f22441h.getValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bb_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$d */
    static final class C9217d extends AbstractC89220m implements AbstractC89171a<C9207b> {

        /* renamed from: a */
        final /* synthetic */ SelfLikeViewOptimizedWidget f22458a;

        static {
            Covode.recordClassIndex(10128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9217d(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
            super(0);
            this.f22458a = selfLikeViewOptimizedWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9207b invoke() {
            return new C9207b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$f */
    static final class C9219f extends AbstractC89220m implements AbstractC89171a<C9215c> {

        /* renamed from: a */
        final /* synthetic */ SelfLikeViewOptimizedWidget f22460a;

        static {
            Covode.recordClassIndex(10130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9219f(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
            super(0);
            this.f22460a = selfLikeViewOptimizedWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C9215c invoke() {
            return new C9215c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$c */
    public final class C9215c extends AbstractC9206a {
        static {
            Covode.recordClassIndex(10126);
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget.AbstractC9206a
        /* renamed from: b */
        public final void mo15318b() {
            SelfLikeViewOptimizedWidget.m17468a(SelfLikeViewOptimizedWidget.this).mo15370a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9215c() {
            super();
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$c$a */
        public static final class C9216a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C9215c f22456a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89238e f22457b;

            static {
                Covode.recordClassIndex(10127);
            }

            public final void onAnimationEnd(Animator animator) {
                MethodCollector.m26663i(4798);
                C89219l.m154721d(animator, "");
                if (SelfLikeViewOptimizedWidget.this.f22439f.contains(this.f22457b.element)) {
                    this.f22457b.element.setVisibility(8);
                    if (!SelfLikeViewOptimizedWidget.this.f22438e.release(this.f22457b.element)) {
                        SelfLikeViewOptimizedWidget.m17469b(SelfLikeViewOptimizedWidget.this).removeView(this.f22457b.element);
                    }
                    SelfLikeViewOptimizedWidget.this.f22439f.remove(this.f22457b.element);
                }
                MethodCollector.m26664o(4798);
            }

            C9216a(C9215c cVar, C89233z.C89238e eVar) {
                this.f22456a = cVar;
                this.f22457b = eVar;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b */
    public final class C9207b extends AbstractC9206a {

        /* renamed from: b */
        Bitmap f22446b;

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$c */
        public static final class C9210c<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C9210c f22450a = new C9210c();

            static {
                Covode.recordClassIndex(10121);
            }

            C9210c() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$g */
        static final class C9214g<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C9214g f22454a = new C9214g();

            static {
                Covode.recordClassIndex(10125);
            }

            C9214g() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        static {
            Covode.recordClassIndex(10118);
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget.AbstractC9206a
        /* renamed from: b */
        public final void mo15318b() {
            SelfLikeViewOptimizedWidget.m17471c(SelfLikeViewOptimizedWidget.this).mo15328a();
            Bitmap bitmap = this.f22446b;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }

        @Override // com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget.AbstractC9206a
        /* renamed from: a */
        public final void mo15317a() {
            AbstractC88979t<Bitmap> a;
            AbstractC88979t<R> d;
            AbstractC88979t<R> b;
            AbstractC88979t<R> a2;
            AbstractC11181z zVar;
            SelfLikeViewOptimizedWidget.m17471c(SelfLikeViewOptimizedWidget.this).setAvatar(this.f22446b);
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            AbstractC2994b a3 = b2.mo13147a();
            C89219l.m154716b(a3, "");
            ImageModel avatarThumb = a3.getAvatarThumb();
            if (avatarThumb != null && (a = C7577g.m15569a(avatarThumb)) != null && (d = a.mo143292d(C9208a.f22448a)) != null && (b = d.mo143278b(C88925a.m154180b(C88946a.f201991c))) != null && (a2 = b.mo143261a(C88391a.m153580a(C88392a.f200660a))) != null && (zVar = (AbstractC11181z) a2.mo143274a(WidgetExtendsKt.autoDispose(SelfLikeViewOptimizedWidget.this))) != null) {
                zVar.mo17950a(new C9209b(this), C9210c.f22450a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$a */
        public static final class C9208a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9208a f22448a = new C9208a();

            static {
                Covode.recordClassIndex(10119);
            }

            C9208a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C89219l.m154721d(bitmap, "");
                return OptimizedLikeHelper.m17411a(bitmap, OptimizedLikeHelper.f22331u);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$b */
        public static final class C9209b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C9207b f22449a;

            static {
                Covode.recordClassIndex(10120);
            }

            C9209b(C9207b bVar) {
                this.f22449a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    SelfLikeViewOptimizedWidget.m17471c(SelfLikeViewOptimizedWidget.this).setAvatar(bitmap);
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$d */
        static final class C9211d<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9211d f22451a = new C9211d();

            static {
                Covode.recordClassIndex(10122);
            }

            C9211d() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                AbstractC2994b bVar = (AbstractC2994b) obj;
                C89219l.m154721d(bVar, "");
                return C7577g.m15569a(bVar.getAvatarThumb());
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$e */
        static final class C9212e<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C9212e f22452a = new C9212e();

            static {
                Covode.recordClassIndex(10123);
            }

            C9212e() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                C89219l.m154721d(bitmap, "");
                return OptimizedLikeHelper.m17411a(bitmap, OptimizedLikeHelper.f22331u);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$b$f */
        static final class C9213f<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C9207b f22453a;

            static {
                Covode.recordClassIndex(10124);
            }

            C9213f(C9207b bVar) {
                this.f22453a = bVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    SelfLikeViewOptimizedWidget.m17471c(SelfLikeViewOptimizedWidget.this).setAvatar(bitmap);
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C9207b() {
            super();
            MethodCollector.m26663i(5568);
            Context context = SelfLikeViewOptimizedWidget.this.context;
            C89219l.m154716b(context, "");
            this.f22446b = OptimizedLikeHelper.m17411a(BitmapFactory.decodeResource(context.getResources(), 2131234441), OptimizedLikeHelper.f22331u);
            MethodCollector.m26664o(5568);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        MethodCollector.m26663i(5434);
        m17467a().mo15318b();
        m17470b().mo15318b();
        LottieAnimationView lottieAnimationView = this.f22437d;
        if (lottieAnimationView == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView.mo5836d();
        LottieAnimationView lottieAnimationView2 = this.f22437d;
        if (lottieAnimationView2 == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView2.setVisibility(8);
        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f22442i);
        if (likeHelper != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15280b(this);
            likeHelper.mo15279b((View) null);
        }
        Iterator<LottieAnimationView> it = this.f22439f.iterator();
        while (it.hasNext()) {
            LottieAnimationView next = it.next();
            C89219l.m154716b(next, "");
            LottieAnimationView lottieAnimationView3 = next;
            it.remove();
            lottieAnimationView3.setVisibility(8);
            if (!this.f22438e.release(lottieAnimationView3)) {
                FrameLayout frameLayout = this.f22434a;
                if (frameLayout == null) {
                    C89219l.m154710a("tapLottieContainer");
                }
                frameLayout.removeView(lottieAnimationView3);
            }
            lottieAnimationView3.mo5836d();
        }
        m17467a();
        m17470b();
        MethodCollector.m26664o(5434);
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$a */
    abstract class AbstractC9206a {
        static {
            Covode.recordClassIndex(10117);
        }

        /* renamed from: a */
        public void mo15317a() {
        }

        /* renamed from: b */
        public void mo15318b() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public AbstractC9206a() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget$e */
    public static final class C9218e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ SelfLikeViewOptimizedWidget f22459a;

        static {
            Covode.recordClassIndex(10129);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C9218e(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
            this.f22459a = selfLikeViewOptimizedWidget;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            LottieAnimationView lottieAnimationView = this.f22459a.f22437d;
            if (lottieAnimationView == null) {
                C89219l.m154710a("flowerAnimation");
            }
            lottieAnimationView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ FrameLayout m17469b(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        FrameLayout frameLayout = selfLikeViewOptimizedWidget.f22434a;
        if (frameLayout == null) {
            C89219l.m154710a("tapLottieContainer");
        }
        return frameLayout;
    }

    /* renamed from: c */
    public static final /* synthetic */ BottomLikeOptimizedView m17471c(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        BottomLikeOptimizedView bottomLikeOptimizedView = selfLikeViewOptimizedWidget.f22436c;
        if (bottomLikeOptimizedView == null) {
            C89219l.m154710a("bottomLikeOptimizedView");
        }
        return bottomLikeOptimizedView;
    }

    /* renamed from: a */
    public static final /* synthetic */ LikeViewOptimizedTapView m17468a(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        LikeViewOptimizedTapView likeViewOptimizedTapView = selfLikeViewOptimizedWidget.f22435b;
        if (likeViewOptimizedTapView == null) {
            C89219l.m154710a("optimizedTapView");
        }
        return likeViewOptimizedTapView;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.ef7);
        C89219l.m154716b(findViewById, "");
        this.f22434a = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.ef9);
        C89219l.m154716b(findViewById2, "");
        this.f22435b = (LikeViewOptimizedTapView) findViewById2;
        View findViewById3 = findViewById(R.id.dv1);
        C89219l.m154716b(findViewById3, "");
        this.f22436c = (BottomLikeOptimizedView) findViewById3;
        View findViewById4 = findViewById(R.id.b66);
        C89219l.m154716b(findViewById4, "");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById4;
        this.f22437d = lottieAnimationView;
        if (lottieAnimationView == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView.mo5828a(new C9218e(this));
        m17467a().mo15317a();
        m17470b().mo15317a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        long j;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.mo28318b(C9093de.class);
        } else {
            room = null;
        }
        this.f22443j = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.mo28318b(C9119ed.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f22444k = z;
        Room room2 = this.f22443j;
        if (room2 != null) {
            j = room2.getId();
        } else {
            j = 0;
        }
        this.f22442i = j;
        m17467a();
        C9207b b = m17470b();
        ((AbstractC11181z) C11115u.m19743a().mo17915b().mo13170j().mo143267a((AbstractC88434g<? super AbstractC2994b, ? extends AbstractC88984x<? extends R>>) C9207b.C9211d.f22451a, false).mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143292d(C9207b.C9212e.f22452a).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(WidgetExtendsKt.autoDispose(SelfLikeViewOptimizedWidget.this))).mo17950a(new C9207b.C9213f(b), C9207b.C9214g.f22454a);
        LottieAnimationView lottieAnimationView = this.f22437d;
        if (lottieAnimationView == null) {
            C89219l.m154710a("flowerAnimation");
        }
        lottieAnimationView.setVisibility(8);
        AbstractC9168b likeHelper = ((AbstractC10073p) C6193a.m13435a(AbstractC10073p.class)).getLikeHelper(this.f22442i);
        if (likeHelper != null && likeHelper.mo15295n() && likeHelper.mo15293l()) {
            likeHelper.mo15271a(this);
            LikeViewOptimizedTapView likeViewOptimizedTapView = this.f22435b;
            if (likeViewOptimizedTapView == null) {
                C89219l.m154710a("optimizedTapView");
            }
            likeHelper.mo15279b(likeViewOptimizedTapView);
        }
    }

    @Override // com.bytedance.android.livesdk.like.AbstractC9170d
    /* renamed from: a */
    public final void mo10821a(AbstractC9168b bVar, int i) {
        C89219l.m154721d(bVar, "");
        if (bVar.mo15296o() && i >= bVar.mo15284d()) {
            LottieAnimationView lottieAnimationView = this.f22437d;
            if (lottieAnimationView == null) {
                C89219l.m154710a("flowerAnimation");
            }
            if (!lottieAnimationView.f5900b.mo6025g()) {
                LottieAnimationView lottieAnimationView2 = this.f22437d;
                if (lottieAnimationView2 == null) {
                    C89219l.m154710a("flowerAnimation");
                }
                lottieAnimationView2.setVisibility(0);
                LottieAnimationView lottieAnimationView3 = this.f22437d;
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
        RoomAuthStatus roomAuthStatus;
        MethodCollector.m26663i(5428);
        C89219l.m154721d(bVar, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (b.mo13165e()) {
            Room room = this.f22443j;
            if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enableDigg) {
                if (Build.VERSION.SDK_INT >= 21 && !this.f22444k) {
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
                    C9207b b2 = m17470b();
                    C89219l.m154721d(j, "");
                    int a = C3966y.m9653a((float) (AbstractC89255c.Default.nextInt(1, 16) * 2));
                    BottomLikeOptimizedView c = m17471c(SelfLikeViewOptimizedWidget.this);
                    float f5 = OptimizedLikeHelper.f22333w;
                    Bitmap bitmap = b2.f22446b;
                    if (bitmap != null) {
                        i3 = bitmap.getWidth();
                    } else {
                        i3 = 0;
                    }
                    float f6 = f5 - ((float) (i3 / 2));
                    float f7 = OptimizedLikeHelper.f22334x;
                    float f8 = (float) a;
                    float f9 = OptimizedLikeHelper.f22333w - f8;
                    float f10 = OptimizedLikeHelper.f22335y;
                    float f11 = OptimizedLikeHelper.f22333w - f8;
                    float f12 = OptimizedLikeHelper.f22332v;
                    Bitmap bitmap2 = b2.f22446b;
                    if (bitmap2 != null) {
                        i4 = bitmap2.getHeight();
                    } else {
                        i4 = 0;
                    }
                    c.mo15329a(j, f6, f7, f9, f10, f11, f12 - ((float) (i4 / 2)));
                    C9215c a2 = m17467a();
                    C89219l.m154721d(bVar, "");
                    C89219l.m154721d(j, "");
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = (T) SelfLikeViewOptimizedWidget.this.f22438e.acquire();
                    if (eVar.element == null) {
                        T t = (T) new LottieAnimationView(SelfLikeViewOptimizedWidget.this.context);
                        t.setAnimation("digg_tap/data.json");
                        t.setImageAssetsFolder("digg_tap/images");
                        eVar.element = t;
                        int i5 = OptimizedLikeHelper.f22330t;
                        m17469b(SelfLikeViewOptimizedWidget.this).addView(eVar.element, i5, i5);
                        eVar.element.mo5828a(new C9215c.C9216a(a2, eVar));
                    }
                    SelfLikeViewOptimizedWidget.this.f22439f.add(eVar.element);
                    eVar.element.setVisibility(0);
                    eVar.element.setX(f - ((float) (OptimizedLikeHelper.f22330t / 2)));
                    eVar.element.setY(f2 - ((float) (OptimizedLikeHelper.f22330t / 2)));
                    eVar.element.mo5826a();
                    if (f3 > 0.0f && f4 > 0.0f) {
                        LikeViewOptimizedTapView a3 = m17468a(SelfLikeViewOptimizedWidget.this);
                        C89219l.m154721d(j, "");
                        LikeViewOptimizedTapView.C9271a acquire = a3.f22632a.acquire();
                        if (acquire == null) {
                            acquire = new LikeViewOptimizedTapView.C9271a();
                        } else {
                            a3.mo15371a(acquire);
                        }
                        ImageView imageView = acquire.f22634a;
                        int i6 = LikeViewOptimizedTapView.f22630c;
                        a3.addView(imageView, i6, i6);
                        C89219l.m154721d(j, "");
                        acquire.f22634a.setImageBitmap(j);
                        acquire.f22634a.setAlpha(1.0f);
                        acquire.f22634a.setX(f - ((float) (LikeViewOptimizedTapView.f22630c / 2)));
                        acquire.f22634a.setY(f2 - ((float) (LikeViewOptimizedTapView.f22630c / 2)));
                        acquire.f22635b.f22643a = f3;
                        acquire.f22636c.f22643a = f2;
                        acquire.f22637d.setObjectValues(Float.valueOf(acquire.f22634a.getX()), Float.valueOf(f3 - ((float) (LikeViewOptimizedTapView.f22630c / 2))));
                        acquire.f22638e.setObjectValues(Float.valueOf(acquire.f22634a.getY()), Float.valueOf(f4 - ((float) (LikeViewOptimizedTapView.f22630c / 2))));
                        LikeViewOptimizedTapView.this.f22633b.add(acquire);
                        acquire.f22639f.start();
                    }
                    MethodCollector.m26664o(5428);
                    return;
                }
                MethodCollector.m26664o(5428);
                return;
            }
            MethodCollector.m26664o(5428);
            return;
        }
        MethodCollector.m26664o(5428);
    }
}
