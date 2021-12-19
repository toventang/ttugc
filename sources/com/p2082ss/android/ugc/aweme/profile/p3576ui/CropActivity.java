package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63425ak;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63803y;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PinchImageView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.PreviewBoxView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.SwitchModeFrameLayout;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63821a;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity */
public final class CropActivity extends ActivityC17312a implements AbstractC63852p, AbstractC63860x {

    /* renamed from: k */
    public static final C63911a f144898k = new C63911a((byte) 0);

    /* renamed from: A */
    private SparseArray f144899A;

    /* renamed from: a */
    public PinchImageView f144900a;

    /* renamed from: b */
    public PreviewBoxView f144901b;

    /* renamed from: c */
    public String f144902c;

    /* renamed from: d */
    C63821a f144903d;

    /* renamed from: e */
    public UrlModel f144904e;

    /* renamed from: f */
    Bitmap f144905f;

    /* renamed from: g */
    public Rect f144906g;

    /* renamed from: h */
    ProgressDialogC66468a f144907h;

    /* renamed from: i */
    final AbstractC89244h f144908i = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63926n.f144939a, "extra_source_type", Integer.class);

    /* renamed from: j */
    public Uri f144909j;

    /* renamed from: l */
    private SwitchModeFrameLayout f144910l;

    /* renamed from: m */
    private TextView f144911m;

    /* renamed from: n */
    private TextView f144912n;

    /* renamed from: o */
    private TuxTextView f144913o;

    /* renamed from: p */
    private View f144914p;

    /* renamed from: q */
    private DmtStatusView f144915q;

    /* renamed from: r */
    private C63425ak f144916r;

    /* renamed from: s */
    private C63828ae f144917s;

    /* renamed from: t */
    private final AbstractC89244h f144918t = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63922j.f144935a, "extra_min_width", Integer.class);

    /* renamed from: u */
    private final AbstractC89244h f144919u = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63921i.f144934a, "extra_min_height", Integer.class);

    /* renamed from: v */
    private final AbstractC89244h f144920v = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63920h.f144933a, "is_oval", Boolean.class);

    /* renamed from: w */
    private final AbstractC89244h f144921w = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63925m.f144938a, "rect_ratio", Float.class);

    /* renamed from: x */
    private final AbstractC89244h f144922x = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63924l.f144937a, "rect_margin", Integer.class);

    /* renamed from: y */
    private final AbstractC89244h f144923y = RouteArgExtension.INSTANCE.optionalArg(this, C63923k.f144936a, "original_url", String.class);

    /* renamed from: z */
    private final AbstractC89244h f144924z = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C63919g.f144932a, "extra_need_update_avatar", Boolean.class);

    static {
        Covode.recordClassIndex(75342);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f144899A;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f144899A == null) {
            this.f144899A = new SparseArray();
        }
        View view = (View) this.f144899A.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f144899A.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90040b(String str) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.CropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$a */
    public static final class C63911a {
        static {
            Covode.recordClassIndex(75343);
        }

        private C63911a() {
        }

        public /* synthetic */ C63911a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m115615a(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4, int i5, boolean z2) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(str, "");
            SmartRouter.buildRoute(activity, "//profile/crop").withParam("original_url", str).withParam("is_oval", z).withParam("rect_ratio", f).withParam("rect_margin", i).withParam("extra_min_width", i3).withParam("extra_min_height", i4).withParam("extra_source_type", i5).withParam("extra_need_update_avatar", z2).open(i2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
        if (z) {
            DmtStatusView dmtStatusView = this.f144915q;
            if (dmtStatusView == null) {
                C89219l.m154710a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
            ProgressDialogC66468a aVar = this.f144907h;
            if (aVar != null && aVar.isShowing()) {
                ProgressDialogC66468a aVar2 = this.f144907h;
                if (aVar2 != null) {
                    aVar2.setMessage(getString(R.string.h7r));
                }
                ProgressDialogC66468a aVar3 = this.f144907h;
                if (aVar3 != null) {
                    aVar3.mo105416b();
                }
                new Handler().postDelayed(new RunnableC63929p(this), 500);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$f */
    static final class RunnableC63918f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropActivity f144931a;

        static {
            Covode.recordClassIndex(75350);
        }

        RunnableC63918f(CropActivity cropActivity) {
            this.f144931a = cropActivity;
        }

        public final void run() {
            CropActivity.m115605b(this.f144931a).mo103877a();
        }
    }

    /* renamed from: a */
    public final void mo103473a() {
        ProgressDialogC66468a aVar = this.f144907h;
        if (aVar != null && aVar.isShowing()) {
            try {
                ProgressDialogC66468a aVar2 = this.f144907h;
                if (aVar2 != null) {
                    aVar2.dismiss();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        ProgressDialogC66468a aVar = this.f144907h;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f144907h = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$p */
    static final class RunnableC63929p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CropActivity f144942a;

        static {
            Covode.recordClassIndex(75361);
        }

        RunnableC63929p(CropActivity cropActivity) {
            this.f144942a = cropActivity;
        }

        public final void run() {
            this.f144942a.mo103473a();
            Intent intent = new Intent();
            intent.setData(Uri.fromFile(new File(this.f144942a.f144902c)));
            intent.putExtra("path", this.f144942a.f144904e);
            this.f144942a.setResult(-1, intent);
            this.f144942a.finish();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$e */
    public static final class C63917e extends SwitchModeFrameLayout.C64345a {

        /* renamed from: a */
        final /* synthetic */ CropActivity f144930a;

        static {
            Covode.recordClassIndex(75349);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C63917e(CropActivity cropActivity) {
            this.f144930a = cropActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.SwitchModeFrameLayout.AbstractC64346b, com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.SwitchModeFrameLayout.C64345a
        /* renamed from: a */
        public final void mo103478a(MotionEvent motionEvent) {
            if (motionEvent == null) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                PreviewBoxView b = CropActivity.m115605b(this.f144930a);
                if (b.f145835b != null && b.f145835b.isStarted()) {
                    b.f145835b.cancel();
                }
                if (Math.abs(b.f145839f - 0.5f) >= Float.MIN_NORMAL) {
                    b.f145839f = 0.5f;
                    b.setAlpha(b.f145839f);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f144930a.f144906g == null) {
                    CropActivity cropActivity = this.f144930a;
                    cropActivity.f144906g = CropActivity.m115605b(cropActivity).getVisibleRect();
                }
                CropActivity.m115605b(this.f144930a).mo103877a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$k */
    static final class C63923k extends AbstractC89220m implements AbstractC89172b<Boolean, String> {

        /* renamed from: a */
        public static final C63923k f144936a = new C63923k();

        static {
            Covode.recordClassIndex(75355);
        }

        C63923k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(Boolean bool) {
            bool.booleanValue();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$g */
    static final class C63919g extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        public static final C63919g f144932a = new C63919g();

        static {
            Covode.recordClassIndex(75351);
        }

        C63919g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$h */
    static final class C63920h extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        public static final C63920h f144933a = new C63920h();

        static {
            Covode.recordClassIndex(75352);
        }

        C63920h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            bool.booleanValue();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$i */
    static final class C63921i extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C63921i f144934a = new C63921i();

        static {
            Covode.recordClassIndex(75353);
        }

        C63921i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 250;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$j */
    static final class C63922j extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C63922j f144935a = new C63922j();

        static {
            Covode.recordClassIndex(75354);
        }

        C63922j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 250;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$l */
    static final class C63924l extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C63924l f144937a = new C63924l();

        static {
            Covode.recordClassIndex(75356);
        }

        C63924l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$m */
    static final class C63925m extends AbstractC89220m implements AbstractC89172b<Boolean, Float> {

        /* renamed from: a */
        public static final C63925m f144938a = new C63925m();

        static {
            Covode.recordClassIndex(75357);
        }

        C63925m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Float invoke(Boolean bool) {
            bool.booleanValue();
            return Float.valueOf(1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$n */
    static final class C63926n extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C63926n f144939a = new C63926n();

        static {
            Covode.recordClassIndex(75358);
        }

        C63926n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$o */
    static final class C63927o extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C63927o f144940a = new C63927o();

        static {
            Covode.recordClassIndex(75359);
        }

        C63927o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C639281.f144941a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PinchImageView m115602a(CropActivity cropActivity) {
        PinchImageView pinchImageView = cropActivity.f144900a;
        if (pinchImageView == null) {
            C89219l.m154710a("mCoverImage");
        }
        return pinchImageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ PreviewBoxView m115605b(CropActivity cropActivity) {
        PreviewBoxView previewBoxView = cropActivity.f144901b;
        if (previewBoxView == null) {
            C89219l.m154710a("mCoverWindow");
        }
        return previewBoxView;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$b */
    static final class View$OnClickListenerC63912b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f144925a;

        static {
            Covode.recordClassIndex(75344);
        }

        View$OnClickListenerC63912b(CropActivity cropActivity) {
            this.f144925a = cropActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (CropActivity.m115602a(this.f144925a).getPinchMode() == 0) {
                this.f144925a.setResult(0);
                this.f144925a.finish();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90039b(Exception exc) {
        C33615a.m68848a((Context) this, (Throwable) exc, (int) R.string.g1i);
        DmtStatusView dmtStatusView = this.f144915q;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo103473a();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$c */
    static final class View$OnClickListenerC63913c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f144926a;

        static {
            Covode.recordClassIndex(75345);
        }

        View$OnClickListenerC63913c(CropActivity cropActivity) {
            this.f144926a = cropActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C63803y.m115397a("save_profile", "click_save", UGCMonitor.TYPE_PHOTO);
            if (CropActivity.m115602a(this.f144926a).getPinchMode() == 0) {
                C1731i.m5640b(new Callable(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.CropActivity.View$OnClickListenerC63913c.CallableC639141 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC63913c f144927a;

                    static {
                        Covode.recordClassIndex(75346);
                    }

                    {
                        this.f144927a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        CropActivity cropActivity = this.f144927a.f144926a;
                        File file = new File(C80720e.m139916a("profileHeader"), "profileHeaderCrop.png");
                        PinchImageView pinchImageView = cropActivity.f144900a;
                        if (pinchImageView == null) {
                            C89219l.m154710a("mCoverImage");
                        }
                        Bitmap bitmap = cropActivity.f144905f;
                        if (bitmap == null) {
                            C89219l.m154710a("originalBitmap");
                        }
                        C89378p<Bitmap, Integer> a = cropActivity.mo103472a(pinchImageView, bitmap);
                        Bitmap first = a.getFirst();
                        String str = null;
                        if (first == null) {
                            return new C89378p(null, a.getSecond());
                        }
                        C89219l.m154716b(file, "");
                        String parent = file.getParent();
                        C89219l.m154716b(parent, "");
                        String name = file.getName();
                        C89219l.m154716b(name, "");
                        boolean a2 = CropActivity.m115604a(first, parent, name);
                        if (a2) {
                            file.getAbsolutePath();
                        }
                        C51423a.m95791b(4, "CropActivity", "saveBitmapToSD status: " + a2 + ' ' + file.length());
                        if (a2) {
                            str = file.getAbsolutePath();
                        }
                        return new C89378p(str, Integer.valueOf((int) R.string.boc));
                    }
                }, C1731i.f5562a).mo5534a(new AbstractC1729g(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.CropActivity.View$OnClickListenerC63913c.C639152 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC63913c f144928a;

                    static {
                        Covode.recordClassIndex(75347);
                    }

                    {
                        this.f144928a = r1;
                    }

                    @Override // p077b.AbstractC1729g
                    public final /* synthetic */ Object then(C1731i iVar) {
                        CharSequence charSequence;
                        C89219l.m154716b(iVar, "");
                        if (iVar.mo5535a() && (charSequence = (CharSequence) ((C89378p) iVar.mo5545d()).getFirst()) != null && charSequence.length() != 0) {
                            this.f144928a.f144926a.f144909j = Uri.fromFile(new File((String) ((C89378p) iVar.mo5545d()).getFirst()));
                            CropActivity cropActivity = this.f144928a.f144926a;
                            Object first = ((C89378p) iVar.mo5545d()).getFirst();
                            if (first == null) {
                                C89219l.m154715b();
                            }
                            String str = (String) first;
                            if (cropActivity.f144907h == null) {
                                cropActivity.f144907h = ProgressDialogC66468a.m118220a(cropActivity, cropActivity.getString(R.string.h8n));
                                ProgressDialogC66468a aVar = cropActivity.f144907h;
                                if (aVar != null) {
                                    aVar.setIndeterminate(false);
                                }
                                ProgressDialogC66468a aVar2 = cropActivity.f144907h;
                                if (aVar2 != null) {
                                    aVar2.mo105415a(cropActivity.getResources().getDrawable(R.drawable.b7n));
                                }
                            } else {
                                ProgressDialogC66468a aVar3 = cropActivity.f144907h;
                                if (aVar3 == null) {
                                    C89219l.m154715b();
                                }
                                if (!aVar3.isShowing()) {
                                    ProgressDialogC66468a aVar4 = cropActivity.f144907h;
                                    if (aVar4 != null) {
                                        aVar4.show();
                                    }
                                    ProgressDialogC66468a aVar5 = cropActivity.f144907h;
                                    if (aVar5 != null) {
                                        aVar5.mo105414a();
                                    }
                                }
                            }
                            cropActivity.f144902c = str;
                            C63821a aVar6 = cropActivity.f144903d;
                            if (aVar6 != null) {
                                aVar6.mo102364b(str);
                            }
                            C63821a aVar7 = cropActivity.f144903d;
                            if (aVar7 == null) {
                                return null;
                            }
                            aVar7.mo103275a(((Number) cropActivity.f144908i.getValue()).intValue());
                            return null;
                        } else if (iVar.mo5535a()) {
                            new C79459a(this.f144928a.f144926a).mo123050a(((Number) ((C89378p) iVar.mo5545d()).getSecond()).intValue()).mo123053a();
                            return null;
                        } else {
                            new C79459a(this.f144928a.f144926a).mo123050a(R.string.boc).mo123053a();
                            return null;
                        }
                    }
                }, C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90038b(AvatarUri avatarUri) {
        String str;
        List<String> list;
        String str2;
        String str3;
        String.valueOf(avatarUri);
        if (((Boolean) this.f144924z.getValue()).booleanValue()) {
            C63425ak akVar = this.f144916r;
            Map<String, String> map = null;
            if (akVar != null) {
                if (avatarUri != null) {
                    str3 = avatarUri.uri;
                } else {
                    str3 = null;
                }
                akVar.f143980d = str3;
            }
            C63828ae aeVar = this.f144917s;
            if (aeVar != null) {
                C63425ak akVar2 = this.f144916r;
                if (akVar2 != null) {
                    map = akVar2.mo102037a();
                }
                aeVar.mo103294a(map);
                return;
            }
            return;
        }
        mo103473a();
        Intent intent = new Intent();
        intent.setData(this.f144909j);
        String str4 = "";
        if (avatarUri == null || (str = avatarUri.uri) == null) {
            str = str4;
        }
        intent.putExtra("uri", str);
        if (!(avatarUri == null || (list = avatarUri.urlList) == null || (str2 = (String) C89070n.m154583g((List) list)) == null)) {
            str4 = str2;
        }
        intent.putExtra("url", str4);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ce  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 543
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.CropActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
        UrlModel urlModel;
        if (user != null) {
            urlModel = user.getAvatarMedium();
        } else {
            urlModel = null;
        }
        this.f144904e = urlModel;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C89378p<Bitmap, Integer> mo103472a(PinchImageView pinchImageView, Bitmap bitmap) {
        MethodCollector.m26663i(8057);
        RectF a = pinchImageView.mo103849a((RectF) null);
        if (this.f144906g == null) {
            C51423a.m95784a(4, "CropActivity", "getCropBitmap mWindowRect is nnull");
        }
        Rect rect = this.f144906g;
        if (rect == null) {
            C89378p<Bitmap, Integer> pVar = new C89378p<>(bitmap, Integer.valueOf((int) R.string.boc));
            MethodCollector.m26664o(8057);
            return pVar;
        }
        float width = ((float) bitmap.getWidth()) / a.width();
        float height = ((float) bitmap.getHeight()) / a.height();
        int b = C89271h.m154769b((int) ((((float) rect.left) - a.left) * width), 0);
        int b2 = C89271h.m154769b((int) ((((float) rect.top) - a.top) * height), 0);
        int c = C89271h.m154772c((int) (((float) rect.width()) * width), bitmap.getWidth() - b);
        int c2 = C89271h.m154772c((int) (((float) rect.height()) * height), bitmap.getHeight() - b2);
        if (c < ((Number) this.f144918t.getValue()).intValue() || c2 < ((Number) this.f144919u.getValue()).intValue()) {
            C89378p<Bitmap, Integer> pVar2 = new C89378p<>(null, Integer.valueOf((int) R.string.dp6));
            MethodCollector.m26664o(8057);
            return pVar2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, b, b2, c, c2);
        if (createBitmap == null || !m115603a(bitmap, b, b2, createBitmap)) {
            C51423a.m95791b(6, "CropActivity", new StringBuilder().append(b).append(' ').append(b2).append(' ').append(c).append(' ').append(c2).append(' ').append(bitmap.getWidth()).append(' ').append(bitmap.getHeight()).append(' ').append(bitmap.getConfig()).toString());
        } else {
            C51423a.m95791b(4, "CropActivity", "crop is successful " + width + ' ' + height + ' ' + b + ' ' + b2 + ' ' + c + ' ' + c2);
        }
        C89378p<Bitmap, Integer> pVar3 = new C89378p<>(createBitmap, Integer.valueOf((int) R.string.boc));
        MethodCollector.m26664o(8057);
        return pVar3;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        C33615a.m68848a((Context) this, (Throwable) exc, (int) R.string.g1i);
        DmtStatusView dmtStatusView = this.f144915q;
        if (dmtStatusView == null) {
            C89219l.m154710a("mDmtStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo103473a();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
        if (str != null && !TextUtils.isEmpty(str)) {
            new C79459a(this).mo123052a(str).mo123053a();
        }
    }

    /* renamed from: a */
    public static boolean m115604a(Bitmap bitmap, String str, String str2) {
        MethodCollector.m26663i(8337);
        C89219l.m154721d(bitmap, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (!C89219l.m154714a((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            C51423a.m95784a(6, "saveBitmapToSD", "not mounted");
            MethodCollector.m26664o(8337);
            return false;
        }
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            File file2 = new File(file.getPath() + "/" + str2);
            try {
                if (file2.exists() || file2.createNewFile()) {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        boolean compress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        if (!compress) {
                            C51423a.m95791b(6, "saveBitmapToSD", "compress fails");
                        }
                        fileOutputStream.flush();
                        try {
                            fileOutputStream.close();
                        } catch (Exception e) {
                            C51423a.m95786a(e);
                        }
                        MethodCollector.m26664o(8337);
                        return compress;
                    } catch (Exception e2) {
                        C51423a.m95786a(e2);
                        try {
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            C51423a.m95786a(e3);
                        }
                        MethodCollector.m26664o(8337);
                        return false;
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e4) {
                            C51423a.m95786a(e4);
                        }
                        MethodCollector.m26664o(8337);
                        throw th;
                    }
                } else {
                    C51423a.m95791b(6, "saveBitmapToSD", "createNewFile fails");
                    MethodCollector.m26664o(8337);
                    return false;
                }
            } catch (Exception e5) {
                C51423a.m95786a(e5);
                MethodCollector.m26664o(8337);
                return false;
            }
        } else {
            C51423a.m95791b(6, "saveBitmapToSD", "mkdirs fails");
            MethodCollector.m26664o(8337);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m115603a(Bitmap bitmap, int i, int i2, Bitmap bitmap2) {
        int c = C89271h.m154772c(bitmap2.getWidth(), bitmap.getWidth() - i);
        int c2 = C89271h.m154772c(bitmap2.getHeight(), bitmap.getHeight() - i2);
        for (int i3 = 0; i3 < c; i3++) {
            for (int b = C89271h.m154769b(c2 - 10, 0); b < c2; b++) {
                try {
                    if (bitmap.getPixel(i + i3, i2 + b) != bitmap2.getPixel(i3, b)) {
                        return false;
                    }
                } catch (IllegalArgumentException e) {
                    C51423a.m95790a((Throwable) e);
                } catch (IllegalStateException e2) {
                    C51423a.m95790a((Throwable) e2);
                }
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.CropActivity$d */
    static final class View$OnLayoutChangeListenerC63916d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ CropActivity f144929a;

        static {
            Covode.recordClassIndex(75348);
        }

        View$OnLayoutChangeListenerC63916d(CropActivity cropActivity) {
            this.f144929a = cropActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f144929a.f144906g == null) {
                CropActivity cropActivity = this.f144929a;
                cropActivity.f144906g = CropActivity.m115605b(cropActivity).getVisibleRect();
                CropActivity.m115602a(this.f144929a).setDisplayWindowRect(this.f144929a.f144906g);
            }
        }
    }
}
