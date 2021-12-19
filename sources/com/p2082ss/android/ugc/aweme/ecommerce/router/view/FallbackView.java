package com.p2082ss.android.ugc.aweme.ecommerce.router.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.WebView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.web.AbstractC16494c;
import com.bytedance.ies.bullet.kit.web.SSWebView;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.p1184ui.common.p1187c.C17029d;
import com.bytedance.ies.bullet.service.p1172f.p1173a.p1175b.AbstractC16741q;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C26614b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView */
public final class FallbackView extends AbstractC45290a implements AbstractC33974au {

    /* renamed from: i */
    public static final C45278a f105528i = new C45278a((byte) 0);

    /* renamed from: a */
    public Activity f105529a;

    /* renamed from: b */
    public BulletActivityWrapper f105530b;

    /* renamed from: c */
    public BulletContainerView f105531c;

    /* renamed from: d */
    public AbstractC16208i f105532d;

    /* renamed from: e */
    public SSWebView f105533e;

    /* renamed from: f */
    C26614b f105534f;

    /* renamed from: g */
    public boolean f105535g;

    /* renamed from: h */
    public int f105536h;

    /* renamed from: j */
    private final int f105537j;

    /* renamed from: k */
    private int f105538k;

    /* renamed from: l */
    private boolean f105539l;

    static {
        Covode.recordClassIndex(53730);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestory();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$a */
    public static final class C45278a {
        static {
            Covode.recordClassIndex(53731);
        }

        private C45278a() {
        }

        public /* synthetic */ C45278a(byte b) {
            this();
        }
    }

    public final boolean getDraggable() {
        return this.f105539l;
    }

    public final Activity getActivity() {
        Activity activity = this.f105529a;
        if (activity == null) {
            C89219l.m154710a("activity");
        }
        return activity;
    }

    public final BulletActivityWrapper getActivityWrapper() {
        BulletActivityWrapper bulletActivityWrapper = this.f105530b;
        if (bulletActivityWrapper == null) {
            C89219l.m154710a("activityWrapper");
        }
        return bulletActivityWrapper;
    }

    public final BulletContainerView getBulletContainerView() {
        BulletContainerView bulletContainerView = this.f105531c;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        return bulletContainerView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$e */
    public static final class C45282e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FallbackView f105552a;

        static {
            Covode.recordClassIndex(53735);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45282e(FallbackView fallbackView) {
            super(0);
            this.f105552a = fallbackView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!this.f105552a.f105535g) {
                this.f105552a.getBulletContainerView().mo26842b();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$f */
    public static final class C45283f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ FallbackView f105553a;

        static {
            Covode.recordClassIndex(53736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45283f(FallbackView fallbackView) {
            super(0);
            this.f105553a = fallbackView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!this.f105553a.f105535g) {
                this.f105553a.getBulletContainerView().mo26842b();
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestory() {
        BulletContainerView bulletContainerView = this.f105531c;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.mo25721a();
        BulletContainerView bulletContainerView2 = this.f105531c;
        if (bulletContainerView2 == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView2.getProviderFactory().mo25824a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$k */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC45289k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ FallbackView f105567a;

        /* renamed from: b */
        final /* synthetic */ FallbackView f105568b;

        /* renamed from: c */
        final /* synthetic */ boolean f105569c;

        static {
            Covode.recordClassIndex(53742);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC45289k(FallbackView fallbackView, FallbackView fallbackView2, boolean z) {
            this.f105567a = fallbackView;
            this.f105568b = fallbackView2;
            this.f105569c = z;
        }

        public final void onGlobalLayout() {
            int i;
            Rect rect = new Rect();
            this.f105568b.getWindowVisibleDisplayFrame(rect);
            if (this.f105569c) {
                i = 0;
            } else {
                i = this.f105567a.f105536h;
            }
            int i2 = (rect.bottom - rect.top) + i;
            if (this.f105568b.getLayoutParams().height != i2) {
                this.f105568b.getLayoutParams().height = i2;
                this.f105568b.requestLayout();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a
    /* renamed from: a */
    public final boolean mo76364a() {
        BulletActivityWrapper bulletActivityWrapper = this.f105530b;
        if (bulletActivityWrapper == null) {
            C89219l.m154710a("activityWrapper");
        }
        Activity activity = this.f105529a;
        if (activity == null) {
            C89219l.m154710a("activity");
        }
        return bulletActivityWrapper.mo26064a(activity);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$h */
    public static final class RunnableC45285h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FallbackView f105555a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f105556b;

        /* renamed from: c */
        final /* synthetic */ Uri f105557c;

        /* renamed from: d */
        final /* synthetic */ DmtStatusView f105558d;

        /* renamed from: e */
        final /* synthetic */ boolean f105559e;

        static {
            Covode.recordClassIndex(53738);
        }

        RunnableC45285h(FallbackView fallbackView, ActivityC0945e eVar, Uri uri, DmtStatusView dmtStatusView, boolean z) {
            this.f105555a = fallbackView;
            this.f105556b = eVar;
            this.f105557c = uri;
            this.f105558d = dmtStatusView;
            this.f105559e = z;
        }

        public final void run() {
            String queryParameter;
            Dialog dialog;
            Window window;
            this.f105555a.getBulletContainerView().mo25820a(BulletService.m71938f().mo61850a());
            this.f105555a.getBulletContainerView().setActivityWrapper(this.f105555a.getActivityWrapper());
            this.f105555a.getBulletContainerView().mo26839a(BulletService.m71938f().mo61849a(this.f105556b), 17, 0, 0, 0, 0);
            AbstractC17046h.C17047a.m31518a(this.f105555a.getBulletContainerView(), this.f105557c, null, new AbstractC17046h.AbstractC17048b(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.router.view.FallbackView.RunnableC45285h.C452861 */

                /* renamed from: a */
                final /* synthetic */ RunnableC45285h f105560a;

                static {
                    Covode.recordClassIndex(53739);
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
                /* renamed from: a */
                public final void mo25854a(AbstractC16208i iVar, Uri uri, AbstractC16741q qVar) {
                    C89219l.m154721d(iVar, "");
                    C89219l.m154721d(uri, "");
                    C89219l.m154721d(qVar, "");
                }

                /* renamed from: a */
                private static boolean m87872a() {
                    try {
                        return C34719f.C34720a.f82009a.mo61395c();
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f105560a = r1;
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
                /* renamed from: a */
                public final void mo25851a(Uri uri) {
                    C89219l.m154721d(uri, "");
                    this.f105560a.f105555a.f105535g = true;
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
                /* renamed from: a */
                public final void mo25852a(Uri uri, Throwable th) {
                    C89219l.m154721d(uri, "");
                    C89219l.m154721d(th, "");
                    this.f105560a.f105555a.f105535g = false;
                    if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132253e = m87872a();
                    }
                    if (C58029j.f132253e) {
                        this.f105560a.f105558d.mo27388i();
                        new C23144b(this.f105560a.f105556b).mo37640e(R.string.ftv).mo37637b();
                        return;
                    }
                    this.f105560a.f105558d.mo27387h();
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
                /* renamed from: a */
                public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
                    C89219l.m154721d(view, "");
                    C89219l.m154721d(uri, "");
                    C89219l.m154721d(iVar, "");
                    this.f105560a.f105555a.f105535g = false;
                    this.f105560a.f105558d.mo27385g();
                }

                @Override // com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
                /* renamed from: a */
                public final void mo25855a(List<? extends C17029d<? extends View>> list, Uri uri, AbstractC16208i iVar, boolean z) {
                    ViewParent viewParent;
                    C89219l.m154721d(list, "");
                    C89219l.m154721d(uri, "");
                    C89219l.m154721d(iVar, "");
                    this.f105560a.f105555a.f105532d = iVar;
                    FallbackView fallbackView = this.f105560a.f105555a;
                    C26614b bVar = fallbackView.f105534f;
                    if (bVar != null) {
                        View view = bVar.getView();
                        View view2 = null;
                        if (view != null) {
                            viewParent = view.getParent();
                        } else {
                            viewParent = null;
                        }
                        if (viewParent instanceof View) {
                            view2 = viewParent;
                        }
                        View view3 = view2;
                        C89233z.C89236c cVar = new C89233z.C89236c();
                        cVar.element = 0;
                        C45281d dVar = new C45281d(cVar);
                        AbstractC16208i iVar2 = fallbackView.f105532d;
                        if (iVar2 instanceof AbstractC16494c) {
                            WebView n = ((AbstractC16494c) iVar2).mo26210n();
                            if (n instanceof SSWebView) {
                                SSWebView sSWebView = (SSWebView) n;
                                fallbackView.f105533e = sSWebView;
                                sSWebView.setWebScrollListener(new C45287i(dVar));
                                BottomSheetBehavior a = BottomSheetBehavior.m52754a(view3);
                                a.f62901o = new C45280c(a, fallbackView, cVar, bVar);
                            }
                        }
                    }
                }
            }, 2);
            FallbackView fallbackView = this.f105555a;
            Uri uri = this.f105557c;
            boolean z = this.f105559e;
            String queryParameter2 = uri.getQueryParameter("url");
            if (queryParameter2 != null && (queryParameter = Uri.parse(queryParameter2).getQueryParameter("soft_input_adjust")) != null && queryParameter.length() != 0) {
                if (fallbackView.f105534f != null) {
                    C26614b bVar = fallbackView.f105534f;
                    if (bVar != null && (dialog = bVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                        C89219l.m154716b(window, "");
                        BulletContainerView bulletContainerView = fallbackView.f105531c;
                        if (bulletContainerView == null) {
                            C89219l.m154710a("bulletContainerView");
                        }
                        View findViewById = bulletContainerView.getRootView().findViewById(R.id.acf);
                        BulletContainerView bulletContainerView2 = fallbackView.f105531c;
                        if (bulletContainerView2 == null) {
                            C89219l.m154710a("bulletContainerView");
                        }
                        View findViewById2 = bulletContainerView2.getRootView().findViewById(R.id.aeb);
                        if (findViewById != null && findViewById2 != null) {
                            window.setSoftInputMode(36);
                            View rootView = fallbackView.getRootView();
                            C89219l.m154716b(rootView, "");
                            rootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC45288j(fallbackView, findViewById, fallbackView));
                            return;
                        }
                        return;
                    }
                    return;
                }
                Activity activity = fallbackView.f105529a;
                if (activity == null) {
                    C89219l.m154710a("activity");
                }
                activity.getWindow().setSoftInputMode(36);
                View rootView2 = fallbackView.getRootView();
                C89219l.m154716b(rootView2, "");
                rootView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC45289k(fallbackView, fallbackView, z));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$j */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC45288j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        public boolean f105562a;

        /* renamed from: b */
        public int f105563b;

        /* renamed from: c */
        final /* synthetic */ FallbackView f105564c;

        /* renamed from: d */
        final /* synthetic */ View f105565d;

        /* renamed from: e */
        final /* synthetic */ FallbackView f105566e;

        static {
            Covode.recordClassIndex(53741);
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f105565d.getWindowVisibleDisplayFrame(rect);
            int height = this.f105565d.getHeight() - rect.bottom;
            int i = 0;
            if (height > 0) {
                if (!this.f105562a) {
                    this.f105563b = this.f105566e.getHeight();
                    this.f105562a = true;
                }
                int height2 = this.f105565d.getHeight() - height;
                int i2 = this.f105563b;
                if (height2 <= i2) {
                    int height3 = this.f105565d.getHeight() - height;
                    Context context = this.f105564c.getContext();
                    C89219l.m154716b(context, "");
                    int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier > 0) {
                        i = context.getResources().getDimensionPixelSize(identifier);
                    }
                    i2 = height3 - i;
                }
                if (this.f105566e.getLayoutParams().height != i2) {
                    this.f105566e.getLayoutParams().height = i2;
                    this.f105566e.requestLayout();
                }
            } else if (this.f105562a) {
                this.f105562a = false;
                if (this.f105566e.getLayoutParams().height != this.f105563b) {
                    this.f105566e.getLayoutParams().height = this.f105563b;
                    this.f105566e.requestLayout();
                }
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC45288j(FallbackView fallbackView, View view, FallbackView fallbackView2) {
            this.f105564c = fallbackView;
            this.f105565d = view;
            this.f105566e = fallbackView2;
        }
    }

    public final void setDraggable(boolean z) {
        this.f105539l = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$b */
    public static final class C45279b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105540a = 700;

        /* renamed from: b */
        final /* synthetic */ int f105541b;

        /* renamed from: c */
        final /* synthetic */ Context f105542c;

        /* renamed from: d */
        final /* synthetic */ int f105543d;

        /* renamed from: e */
        final /* synthetic */ int f105544e;

        /* renamed from: f */
        final /* synthetic */ int f105545f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89171a f105546g;

        static {
            Covode.recordClassIndex(53732);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f105546g.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45279b(int i, Context context, int i2, int i3, AbstractC89171a aVar) {
            super(700);
            this.f105541b = i;
            this.f105542c = context;
            this.f105543d = i2;
            this.f105544e = i3;
            this.f105545f = R.string.bfs;
            this.f105546g = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$d */
    public static final class C45281d implements AbstractC45291b {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89236c f105551a;

        static {
            Covode.recordClassIndex(53734);
        }

        C45281d(C89233z.C89236c cVar) {
            this.f105551a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45291b
        /* renamed from: a */
        public final void mo76375a(int i) {
            this.f105551a.element = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$i */
    public static final class C45287i implements SSWebView.AbstractC16469b {

        /* renamed from: a */
        final /* synthetic */ AbstractC45291b f105561a;

        static {
            Covode.recordClassIndex(53740);
        }

        C45287i(AbstractC45291b bVar) {
            this.f105561a = bVar;
        }

        @Override // com.bytedance.ies.bullet.kit.web.SSWebView.AbstractC16469b
        public final void onScrollChanged(int i, int i2, int i3, int i4) {
            this.f105561a.mo76375a(i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a
    /* renamed from: a */
    public final void mo76363a(C26614b bVar) {
        C89219l.m154721d(bVar, "");
        this.f105534f = bVar;
    }

    public final void setActivity(Activity activity) {
        C89219l.m154721d(activity, "");
        this.f105529a = activity;
    }

    public final void setActivityWrapper(BulletActivityWrapper bulletActivityWrapper) {
        C89219l.m154721d(bulletActivityWrapper, "");
        this.f105530b = bulletActivityWrapper;
    }

    public final void setBulletContainerView(BulletContainerView bulletContainerView) {
        C89219l.m154721d(bulletContainerView, "");
        this.f105531c = bulletContainerView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FallbackView(Context context) {
        super(context);
        int i;
        C89219l.m154721d(context, "");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        this.f105536h = i;
        this.f105537j = (int) C13628n.m24520b(context, 72.0f);
        this.f105538k = (int) C13628n.m24520b(context, 52.0f);
        this.f105539l = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$g */
    public static final class C45284g extends BulletActivityWrapper {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f105554a;

        static {
            Covode.recordClassIndex(53737);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45284g(ActivityC0945e eVar, Activity activity) {
            super(activity);
            this.f105554a = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a
    /* renamed from: a */
    public final void mo76361a(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        BulletActivityWrapper bulletActivityWrapper = this.f105530b;
        if (bulletActivityWrapper == null) {
            C89219l.m154710a("activityWrapper");
        }
        bulletActivityWrapper.mo26828c(activity, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.router.view.AbstractC45290a
    /* renamed from: b */
    public final void mo76365b(Activity activity, Bundle bundle) {
        C89219l.m154721d(activity, "");
        BulletActivityWrapper bulletActivityWrapper = this.f105530b;
        if (bulletActivityWrapper == null) {
            C89219l.m154710a("activityWrapper");
        }
        bulletActivityWrapper.mo26826b(activity, bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.view.FallbackView$c */
    public static final class C45280c extends BottomSheetBehavior.AbstractC26607a {

        /* renamed from: a */
        final /* synthetic */ BottomSheetBehavior f105547a;

        /* renamed from: b */
        final /* synthetic */ FallbackView f105548b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f105549c;

        /* renamed from: d */
        final /* synthetic */ C26614b f105550d;

        static {
            Covode.recordClassIndex(53733);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37774a(View view, float f) {
            C89219l.m154721d(view, "");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37775a(View view, int i) {
            C89219l.m154721d(view, "");
            if (i == 1) {
                if (!this.f105548b.getDraggable() || this.f105549c.element > 0) {
                    BottomSheetBehavior bottomSheetBehavior = this.f105547a;
                    C89219l.m154716b(bottomSheetBehavior, "");
                    bottomSheetBehavior.mo43978c(3);
                    return;
                }
                SSWebView sSWebView = this.f105548b.f105533e;
                if (sSWebView != null) {
                    sSWebView.scrollBy(0, 1);
                }
            } else if (i == 5) {
                this.f105550d.dismiss();
            }
        }

        C45280c(BottomSheetBehavior bottomSheetBehavior, FallbackView fallbackView, C89233z.C89236c cVar, C26614b bVar) {
            this.f105547a = bottomSheetBehavior;
            this.f105548b = fallbackView;
            this.f105549c = cVar;
            this.f105550d = bVar;
        }
    }

    /* renamed from: a */
    public final void mo76362a(ActivityC0945e eVar, Uri uri, boolean z) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(uri, "");
        this.f105529a = eVar;
        eVar.getLifecycle().mo4012a(this);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        if (z) {
            marginLayoutParams.topMargin = this.f105536h;
        }
        setLayoutParams(marginLayoutParams);
        C1764a.m5927a(eVar.getLayoutInflater(), R.layout.om, this, true);
        View findViewById = findViewById(R.id.zu);
        C89219l.m154716b(findViewById, "");
        this.f105531c = (BulletContainerView) findViewById;
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.awv);
        DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(eVar);
        Context context = getContext();
        C89219l.m154716b(context, "");
        DmtStatusView.C17269a c = a.mo27408c(m87862a(context, R.string.dcq, R.string.bft, R.drawable.ys, new C45282e(this)));
        Context context2 = getContext();
        C89219l.m154716b(context2, "");
        dmtStatusView.setBuilder(c.mo27409d(m87862a(context2, R.string.bfr, R.string.bfq, R.drawable.zb, new C45283f(this))));
        C45284g gVar = new C45284g(eVar, eVar);
        gVar.mo26823a((AbstractC1204m) eVar);
        this.f105530b = gVar;
        BulletContainerView bulletContainerView = this.f105531c;
        if (bulletContainerView == null) {
            C89219l.m154710a("bulletContainerView");
        }
        bulletContainerView.post(new RunnableC45285h(this, eVar, uri, dmtStatusView, z));
    }

    /* renamed from: a */
    private static View m87862a(Context context, int i, int i2, int i3, AbstractC89171a<C89391z> aVar) {
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.pj, null, false);
        ((AppCompatImageView) a.findViewById(R.id.bky)).setImageResource(i3);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(context.getText(i));
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.efr);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i2));
        TuxButton tuxButton = (TuxButton) a.findViewById(R.id.djd);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setText(context.getText(R.string.bfs));
        TuxButton tuxButton2 = (TuxButton) a.findViewById(R.id.djd);
        C89219l.m154716b(tuxButton2, "");
        tuxButton2.setOnClickListener(new C45279b(i3, context, i, i2, aVar));
        C89219l.m154716b(a, "");
        return a;
    }
}
