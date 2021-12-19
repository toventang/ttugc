package com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38615aa;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer */
public final class AdPopUpWebBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: i */
    public static boolean f89604i = true;

    /* renamed from: j */
    public static final C37932c f89605j = new C37932c((byte) 0);

    /* renamed from: h */
    AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> f89606h;

    /* renamed from: k */
    private AbstractC37933d f89607k;

    /* renamed from: l */
    private final AbstractC89244h f89608l;

    /* renamed from: m */
    private AbstractC37931b f89609m;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer$b */
    public interface AbstractC37931b {
        static {
            Covode.recordClassIndex(45386);
        }

        /* renamed from: a */
        void mo66076a();

        /* renamed from: a */
        void mo66077a(View view, float f);

        /* renamed from: b */
        void mo66078b();

        /* renamed from: c */
        void mo66079c();

        /* renamed from: d */
        void mo66080d();

        /* renamed from: e */
        void mo66081e();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer$d */
    public interface AbstractC37933d {
        static {
            Covode.recordClassIndex(45388);
        }

        /* renamed from: a */
        boolean mo66082a();
    }

    public AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final C37975a getActionMode() {
        return (C37975a) this.f89608l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer$c */
    public static final class C37932c {
        static {
            Covode.recordClassIndex(45387);
        }

        private C37932c() {
        }

        public /* synthetic */ C37932c(byte b) {
            this();
        }
    }

    public final AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> getBehavior() {
        return this.f89606h;
    }

    public final AbstractC37931b getCallback() {
        return this.f89609m;
    }

    public final AbstractC37933d getOnInterceptListener() {
        return this.f89607k;
    }

    /* renamed from: a */
    public final void mo14580a() {
        this.f89606h.mo66047c(3);
    }

    /* renamed from: b */
    public final void mo66065b() {
        this.f89606h.mo66047c(6);
    }

    /* renamed from: c */
    public final void mo66066c() {
        this.f89606h.mo66047c(4);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer$e */
    static final class C37934e extends AbstractC89220m implements AbstractC89171a<C37975a> {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f89612a;

        /* renamed from: b */
        final /* synthetic */ Context f89613b;

        static {
            Covode.recordClassIndex(45389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37934e(AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, Context context) {
            super(0);
            this.f89612a = adPopUpWebBottomSheetContainer;
            this.f89613b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C37975a invoke() {
            return new C37975a(this.f89613b, this.f89612a, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(45384);
    }

    /* renamed from: d */
    public final boolean mo66067d() {
        if (this.f89606h.f89575f == 3 || this.f89606h.f89575f == 4) {
            return true;
        }
        return false;
    }

    public final void setCallback(AbstractC37931b bVar) {
        this.f89609m = bVar;
    }

    public final void setOnInterceptListener(AbstractC37933d dVar) {
        this.f89607k = dVar;
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior) {
        C89219l.m154721d(adPopUpWebBottomSheetBehavior, "");
        this.f89606h = adPopUpWebBottomSheetBehavior;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC37933d dVar = this.f89607k;
        if (dVar != null) {
            return dVar.mo66082a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setWebViewForDragBehavior(WebView webView) {
        C89219l.m154721d(webView, "");
        this.f89606h.f89588s = webView;
    }

    /* renamed from: b */
    public final void mo31074b(int i) {
        getActionMode().mo66194a(i);
        this.f89606h.mo66045b(getActionMode().f89712a);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer$a */
    public static final class C37930a extends AdPopUpWebBottomSheetBehavior.AbstractC37928a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetBehavior f89610a;

        /* renamed from: b */
        final /* synthetic */ AdPopUpWebBottomSheetContainer f89611b;

        static {
            Covode.recordClassIndex(45385);
        }

        C37930a(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer) {
            this.f89610a = adPopUpWebBottomSheetBehavior;
            this.f89611b = adPopUpWebBottomSheetContainer;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AbstractC37928a
        /* renamed from: a */
        public final void mo66062a(View view, float f) {
            C89219l.m154721d(view, "");
            AbstractC37931b callback = this.f89611b.getCallback();
            if (callback != null) {
                callback.mo66077a(view, f);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AbstractC37928a
        /* renamed from: a */
        public final void mo66063a(View view, int i) {
            AbstractC37931b callback;
            C89219l.m154721d(view, "");
            String.valueOf(i);
            if (i == 1) {
                if (!AdPopUpWebBottomSheetContainer.f89604i && !C38615aa.f91251i) {
                    this.f89610a.mo66047c(3);
                }
                AbstractC37931b callback2 = this.f89611b.getCallback();
                if (callback2 != null) {
                    callback2.mo66079c();
                }
            } else if (i == 3) {
                if (this.f89611b.getActionMode().f89713b != 0) {
                    if (this.f89611b.getActionMode().f89720i == 3) {
                        this.f89610a.f89574e = true;
                    } else {
                        this.f89610a.mo66045b(this.f89611b.getActionMode().f89713b);
                    }
                }
                AbstractC37931b callback3 = this.f89611b.getCallback();
                if (callback3 != null) {
                    callback3.mo66076a();
                }
            } else if (i == 4) {
                AbstractC37931b callback4 = this.f89611b.getCallback();
                if (callback4 != null) {
                    callback4.mo66078b();
                }
            } else if (i == 5) {
                AbstractC37931b callback5 = this.f89611b.getCallback();
                if (callback5 != null) {
                    callback5.mo66080d();
                }
            } else if (i == 6 && (callback = this.f89611b.getCallback()) != null) {
                callback.mo66081e();
            }
        }
    }

    private /* synthetic */ AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        AdPopUpWebBottomSheetBehavior<AdPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.f89580k = new C37930a(adPopUpWebBottomSheetBehavior, this);
        this.f89606h = adPopUpWebBottomSheetBehavior;
        this.f89608l = C89250i.m154773a((AbstractC89171a) new C37934e(this, context));
        this.f89606h.f89573d = true;
        f89604i = true;
        this.f89606h.mo66047c(5);
        this.f89606h.mo66045b(getActionMode().f89712a);
    }
}
