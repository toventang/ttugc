package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.main.viewModel.AdHomePageDataVM;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1257a.AbstractC17934b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.C18017a;
import com.bytedance.tux.p1721g.C23144b;
import com.google.gson.C27910f;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

public final class SwipeUpType5Mask extends FrameLayout implements AbstractC18019c {

    /* renamed from: d */
    public static final C18065a f42996d = new C18065a((byte) 0);

    /* renamed from: a */
    public final Map<String, String> f42997a;

    /* renamed from: b */
    Aweme f42998b;

    /* renamed from: c */
    public float f42999c;

    /* renamed from: e */
    private int f43000e;

    /* renamed from: f */
    private AdHomePageDataVM f43001f;

    /* renamed from: g */
    private GestureDetector f43002g;

    /* renamed from: h */
    private final GestureDetector.OnGestureListener f43003h;

    /* renamed from: i */
    private final AbstractC1214u<Float> f43004i;

    static {
        Covode.recordClassIndex(20693);
    }

    public SwipeUpType5Mask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private static /* synthetic */ void getStatus$annotations() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* renamed from: b */
    public final void mo28747b() {
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.SwipeUpType5Mask$a */
    public static final class C18065a {
        static {
            Covode.recordClassIndex(20694);
        }

        private C18065a() {
        }

        public /* synthetic */ C18065a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    /* renamed from: a */
    public final void mo28746a() {
        C1213t<Float> tVar;
        AdHomePageDataVM adHomePageDataVM = this.f43001f;
        if (adHomePageDataVM != null && (tVar = adHomePageDataVM.f42663c) != null) {
            tVar.removeObserver(this.f43004i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getContext() instanceof ActivityC0945e) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            this.f43001f = AdHomePageDataVM.C17902a.m33208a((ActivityC0945e) context);
        }
        this.f43002g = new GestureDetector(getContext(), this.f43003h);
        setOnTouchListener(new View$OnTouchListenerC18068d(this));
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.SwipeUpType5Mask$b */
    public static final class C18066b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ SwipeUpType5Mask f43005a;

        /* renamed from: b */
        final /* synthetic */ Context f43006b;

        static {
            Covode.recordClassIndex(20695);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C89219l.m154721d(motionEvent, "");
            this.f43005a.getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            String str;
            AwemeRawAd awemeRawAd;
            C89219l.m154721d(motionEvent, "");
            SwipeUpType5Mask swipeUpType5Mask = this.f43005a;
            AbstractC17934b a = C17957a.m33426a();
            if (a != null && a.mo28631c(swipeUpType5Mask.f42998b)) {
                AbstractC17934b a2 = C17957a.m33426a();
                if (a2 == null) {
                    C89219l.m154715b();
                }
                if (a2.mo28633d(swipeUpType5Mask.f42998b)) {
                    new C23144b(swipeUpType5Mask).mo37640e(R.string.o6).mo37637b();
                } else {
                    Aweme aweme = swipeUpType5Mask.f42998b;
                    if (aweme == null) {
                        C89219l.m154715b();
                    }
                    aweme.getAid();
                    Aweme aweme2 = swipeUpType5Mask.f42998b;
                    if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                        str = null;
                    } else {
                        str = awemeRawAd.getOpenUrl();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Uri parse = Uri.parse(str);
                        C89219l.m154716b(parse, "");
                        if (TextUtils.equals(parse.getHost(), "challenge")) {
                            Aweme aweme3 = swipeUpType5Mask.f42998b;
                            if (aweme3 == null) {
                                C89219l.m154715b();
                            }
                            AwemeRawAd awemeRawAd2 = aweme3.getAwemeRawAd();
                            if (awemeRawAd2 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(awemeRawAd2, "");
                            C29844g gVar = new C29844g(awemeRawAd2.getOpenUrl());
                            gVar.mo52130a("extra_challenge_from", "awesome_splash");
                            Aweme aweme4 = swipeUpType5Mask.f42998b;
                            if (aweme4 == null) {
                                C89219l.m154715b();
                            }
                            AwemeRawAd awemeRawAd3 = aweme4.getAwemeRawAd();
                            if (awemeRawAd3 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(awemeRawAd3, "");
                            awemeRawAd3.setOpenUrl(gVar.mo52126a());
                        }
                    }
                    AbstractC17934b a3 = C17957a.m33426a();
                    if (a3 != null) {
                        Context context = swipeUpType5Mask.getContext();
                        C89219l.m154716b(context, "");
                        a3.mo28617a(context, swipeUpType5Mask.f42998b, swipeUpType5Mask.f42997a);
                    }
                }
            }
            return true;
        }

        C18066b(SwipeUpType5Mask swipeUpType5Mask, Context context) {
            this.f43005a = swipeUpType5Mask;
            this.f43006b = context;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C89219l.m154721d(motionEvent, "");
            C89219l.m154721d(motionEvent2, "");
            if (Math.abs(f) >= Math.abs(f2) || (motionEvent2.getY() > motionEvent.getY() && this.f43005a.f42999c <= C29661o.m59767a(this.f43006b, 50.0f))) {
                this.f43005a.getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                this.f43005a.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (motionEvent == null) {
            return false;
        }
        GestureDetector gestureDetector = this.f43002g;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (this.f43000e != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.SwipeUpType5Mask$c */
    static final class C18067c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SwipeUpType5Mask f43007a;

        /* renamed from: b */
        final /* synthetic */ Context f43008b;

        static {
            Covode.recordClassIndex(20696);
        }

        C18067c(SwipeUpType5Mask swipeUpType5Mask, Context context) {
            this.f43007a = swipeUpType5Mask;
            this.f43008b = context;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (this.f43007a.f42999c >= C29661o.m59767a(this.f43008b, 50.0f)) {
                this.f43007a.getParent().requestDisallowInterceptTouchEvent(true);
            }
            SwipeUpType5Mask swipeUpType5Mask = this.f43007a;
            C89219l.m154716b(f, "");
            swipeUpType5Mask.f42999c = f.floatValue();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18019c
    public final void onEvent(C18017a aVar) {
        C1213t<Float> tVar;
        C89219l.m154721d(aVar, "");
        this.f43000e = aVar.f42891a;
        this.f42998b = aVar.f42892b;
        AdHomePageDataVM adHomePageDataVM = this.f43001f;
        if (adHomePageDataVM != null && (tVar = adHomePageDataVM.f42663c) != null) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
            tVar.observe((AbstractC1204m) context, this.f43004i);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.SwipeUpType5Mask$d */
    static final class View$OnTouchListenerC18068d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ SwipeUpType5Mask f43009a;

        static {
            Covode.recordClassIndex(20697);
        }

        View$OnTouchListenerC18068d(SwipeUpType5Mask swipeUpType5Mask) {
            this.f43009a = swipeUpType5Mask;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            HashMap hashMap = new HashMap();
            if (C80471gb.m139483a(this.f43009a.getContext())) {
                hashMap.put("click_x", String.valueOf(((float) C34723i.m70928b(this.f43009a.getContext())) - motionEvent.getRawX()));
            } else {
                hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
            }
            hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
            Map<String, String> map = this.f43009a.f42997a;
            String b = new C27910f().mo46674b(hashMap);
            C89219l.m154716b(b, "");
            map.put("ad_extra_data", b);
            return false;
        }
    }

    private /* synthetic */ SwipeUpType5Mask(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SwipeUpType5Mask(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1780);
        this.f43000e = 4;
        this.f42997a = new HashMap();
        this.f43003h = new C18066b(this, context);
        this.f43004i = new C18067c(this, context);
        MethodCollector.m26664o(1780);
    }
}
