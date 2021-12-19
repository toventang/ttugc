package com.p2082ss.android.ugc.aweme.commercialize.views.popupwebpage.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer */
public final class CommonPopUpWebBottomSheetContainer extends CoordinatorLayout {

    /* renamed from: i */
    public static boolean f92006i = true;

    /* renamed from: j */
    public static final C38952c f92007j = new C38952c((byte) 0);

    /* renamed from: h */
    public AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> f92008h;

    /* renamed from: k */
    private AbstractC38953d f92009k;

    /* renamed from: l */
    private final AbstractC89244h f92010l;

    /* renamed from: m */
    private AbstractC38951b f92011m;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer$b */
    public interface AbstractC38951b {
        static {
            Covode.recordClassIndex(46540);
        }

        /* renamed from: a */
        void mo67649a();

        /* renamed from: a */
        void mo67650a(View view, float f);

        /* renamed from: b */
        void mo67651b();

        /* renamed from: c */
        void mo67652c();

        /* renamed from: d */
        void mo67653d();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer$d */
    public interface AbstractC38953d {
        static {
            Covode.recordClassIndex(46542);
        }

        /* renamed from: a */
        boolean mo67654a();
    }

    public CommonPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final C38972a getActionMode() {
        return (C38972a) this.f92010l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer$c */
    public static final class C38952c {
        static {
            Covode.recordClassIndex(46541);
        }

        private C38952c() {
        }

        public /* synthetic */ C38952c(byte b) {
            this();
        }
    }

    public final AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> getBehavior() {
        return this.f92008h;
    }

    public final AbstractC38951b getCallback() {
        return this.f92011m;
    }

    public final AbstractC38953d getOnInterceptListener() {
        return this.f92009k;
    }

    /* renamed from: a */
    public final void mo14580a() {
        this.f92008h.mo66047c(3);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer$e */
    static final class C38954e extends AbstractC89220m implements AbstractC89171a<C38972a> {

        /* renamed from: a */
        final /* synthetic */ CommonPopUpWebBottomSheetContainer f92014a;

        /* renamed from: b */
        final /* synthetic */ Context f92015b;

        static {
            Covode.recordClassIndex(46543);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38954e(CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer, Context context) {
            super(0);
            this.f92014a = commonPopUpWebBottomSheetContainer;
            this.f92015b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C38972a invoke() {
            return new C38972a(this.f92015b, this.f92014a, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(46538);
    }

    /* renamed from: b */
    public final boolean mo66065b() {
        if (this.f92008h.f89575f == 3 || this.f92008h.f89575f == 4) {
            return true;
        }
        return false;
    }

    public final void setCallback(AbstractC38951b bVar) {
        this.f92011m = bVar;
    }

    public final void setOnInterceptListener(AbstractC38953d dVar) {
        this.f92009k = dVar;
    }

    public final void setBehavior(AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior) {
        C89219l.m154721d(adPopUpWebBottomSheetBehavior, "");
        this.f92008h = adPopUpWebBottomSheetBehavior;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC38953d dVar = this.f92009k;
        if (dVar != null) {
            return dVar.mo67654a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setWebViewForDragBehavior(WebView webView) {
        C89219l.m154721d(webView, "");
        this.f92008h.f89588s = webView;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.common.CommonPopUpWebBottomSheetContainer$a */
    public static final class C38950a extends AdPopUpWebBottomSheetBehavior.AbstractC37928a {

        /* renamed from: a */
        final /* synthetic */ AdPopUpWebBottomSheetBehavior f92012a;

        /* renamed from: b */
        final /* synthetic */ CommonPopUpWebBottomSheetContainer f92013b;

        static {
            Covode.recordClassIndex(46539);
        }

        C38950a(AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior, CommonPopUpWebBottomSheetContainer commonPopUpWebBottomSheetContainer) {
            this.f92012a = adPopUpWebBottomSheetBehavior;
            this.f92013b = commonPopUpWebBottomSheetContainer;
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AbstractC37928a
        /* renamed from: a */
        public final void mo66062a(View view, float f) {
            C89219l.m154721d(view, "");
            AbstractC38951b callback = this.f92013b.getCallback();
            if (callback != null) {
                callback.mo67650a(view, f);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.AbstractC37928a
        /* renamed from: a */
        public final void mo66063a(View view, int i) {
            AbstractC38951b callback;
            C89219l.m154721d(view, "");
            if (i == 1) {
                if (!CommonPopUpWebBottomSheetContainer.f92006i && !C38974b.f92070f) {
                    this.f92012a.mo66047c(3);
                }
                AbstractC38951b callback2 = this.f92013b.getCallback();
                if (callback2 != null) {
                    callback2.mo67652c();
                }
            } else if (i == 3) {
                if (this.f92013b.getActionMode().f92057b != 0) {
                    this.f92012a.mo66045b(this.f92013b.getActionMode().f92057b);
                }
                AbstractC38951b callback3 = this.f92013b.getCallback();
                if (callback3 != null) {
                    callback3.mo67649a();
                }
            } else if (i == 4) {
                AbstractC38951b callback4 = this.f92013b.getCallback();
                if (callback4 != null) {
                    callback4.mo67651b();
                }
            } else if (i == 5 && (callback = this.f92013b.getCallback()) != null) {
                callback.mo67653d();
            }
        }
    }

    private /* synthetic */ CommonPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommonPopUpWebBottomSheetContainer(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        AdPopUpWebBottomSheetBehavior<CommonPopUpWebBottomSheetContainer> adPopUpWebBottomSheetBehavior = new AdPopUpWebBottomSheetBehavior<>();
        adPopUpWebBottomSheetBehavior.f89580k = new C38950a(adPopUpWebBottomSheetBehavior, this);
        this.f92008h = adPopUpWebBottomSheetBehavior;
        this.f92010l = C89250i.m154773a((AbstractC89171a) new C38954e(this, context));
        this.f92008h.f89573d = true;
        f92006i = true;
        this.f92008h.mo66047c(5);
        this.f92008h.mo66045b(getActionMode().f92056a);
    }
}
