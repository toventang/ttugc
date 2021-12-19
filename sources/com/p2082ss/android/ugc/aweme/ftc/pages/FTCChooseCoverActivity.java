package com.p2082ss.android.ugc.aweme.ftc.pages;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1205n;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.ftc.pages.C52765c;
import com.p2082ss.android.ugc.aweme.ftc.widgets.FTCChooseCoverView;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73972ax;
import com.p2082ss.android.ugc.aweme.sticker.text.C75894b;
import com.p2082ss.android.ugc.aweme.sticker.text.C75896c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88296t;
import dmt.p4542av.video.C88303z;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.util.HashMap;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity */
public final class FTCChooseCoverActivity extends ActivityC33402b implements AbstractC52760a, VEEditorAutoStartStopArbiter.AbstractC88148a {

    /* renamed from: d */
    public static final C52745a f121377d = new C52745a((byte) 0);

    /* renamed from: e */
    private final C1205n f121378e = new C1205n(this);

    /* renamed from: f */
    private VideoPublishEditModel f121379f;

    /* renamed from: g */
    private C88303z f121380g;

    /* renamed from: h */
    private final C1213t<C88296t> f121381h = new C1213t<>();

    /* renamed from: i */
    private final C1213t<Bitmap> f121382i = new C1213t<>();

    /* renamed from: j */
    private final C1213t<Boolean> f121383j = new C1213t<>();

    /* renamed from: k */
    private HashMap f121384k;

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f121384k == null) {
            this.f121384k = new HashMap();
        }
        View view = (View) this.f121384k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f121384k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity$a */
    public static final class C52745a {
        static {
            Covode.recordClassIndex(62142);
        }

        private C52745a() {
        }

        public /* synthetic */ C52745a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.pages.AbstractC52760a
    /* renamed from: b */
    public final C1213t<C88296t> mo88409b() {
        return this.f121381h;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f121378e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity$e */
    static final class C52749e extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ FTCChooseCoverActivity f121388a;

        static {
            Covode.recordClassIndex(62146);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52749e(FTCChooseCoverActivity fTCChooseCoverActivity) {
            super(0);
            this.f121388a = fTCChooseCoverActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            View d_ = this.f121388a.mo59481d_(R.id.bs3);
            C89219l.m154716b(d_, "");
            return d_;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity$f */
    static final class C52750f extends AbstractC89220m implements AbstractC89171a<SurfaceView> {

        /* renamed from: a */
        final /* synthetic */ FTCChooseCoverActivity f121389a;

        static {
            Covode.recordClassIndex(62147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52750f(FTCChooseCoverActivity fTCChooseCoverActivity) {
            super(0);
            this.f121389a = fTCChooseCoverActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SurfaceView invoke() {
            View d_ = this.f121389a.mo59481d_(R.id.d5p);
            C89219l.m154716b(d_, "");
            return d_;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.pages.AbstractC52760a
    /* renamed from: c */
    public final VideoPublishEditModel mo88410c() {
        VideoPublishEditModel videoPublishEditModel = this.f121379f;
        if (videoPublishEditModel == null) {
            C89219l.m154710a("mModel");
        }
        return videoPublishEditModel;
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.w, R.anim.x);
    }

    static {
        Covode.recordClassIndex(62141);
        C75894b.m133079a();
        C75896c.m133081a();
        C75896c.m133084b();
    }

    /* renamed from: h */
    private final C52765c m97632h() {
        Fragment a = getSupportFragmentManager().mo3551a("cover");
        if (!(a instanceof C52765c)) {
            a = null;
        }
        return (C52765c) a;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.pages.AbstractC52760a
    /* renamed from: a */
    public final AbstractC31071f mo88408a() {
        C88303z zVar = this.f121380g;
        if (zVar == null) {
            C89219l.m154710a("mPresenter");
        }
        AbstractC31071f fVar = zVar.f200423w;
        C89219l.m154716b(fVar, "");
        return fVar;
    }

    @Override // dmt.p4542av.video.VEEditorAutoStartStopArbiter.AbstractC88148a
    /* renamed from: g */
    public final void mo88412g() {
        C52765c h = m97632h();
        if (h != null && h.f121433f) {
            AbstractC52760a aVar = h.f121428a;
            if (aVar == null) {
                C89219l.m154710a("mDependency");
            }
            Bitmap c = aVar.mo88408a().mo56340c();
            if (c != null) {
                AbstractC52760a aVar2 = h.f121428a;
                if (aVar2 == null) {
                    C89219l.m154710a("mDependency");
                }
                h.f121429b = (float) aVar2.mo88408a().mo56370k();
                ((FTCChooseCoverView) h.mo88434a(R.id.fbp)).setVideoCoverFrameView(c);
                c.recycle();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        C52765c h = m97632h();
        if (h != null) {
            C52746b bVar = new C52746b(this);
            C89219l.m154721d(bVar, "");
            AbstractC52760a aVar = h.f121428a;
            if (aVar == null) {
                C89219l.m154710a("mDependency");
            }
            C63244g.m114602a().mo73265K().mo101706a(!C73972ax.m130099a(aVar.mo88410c().mVideoCoverStartTm, h.f121429b / 1000.0f), new C52765c.C52776g(h, bVar));
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        this.f121378e.mo4017a(AbstractC1196i.EnumC1199b.DESTROYED);
        mo88408a().mo56395z();
        C88303z zVar = this.f121380g;
        if (zVar == null) {
            C89219l.m154710a("mPresenter");
        }
        zVar.mo142796b();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity$b */
    static final class C52746b extends AbstractC89220m implements AbstractC89172b<Boolean, Boolean> {

        /* renamed from: a */
        final /* synthetic */ FTCChooseCoverActivity f121385a;

        static {
            Covode.recordClassIndex(62143);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52746b(FTCChooseCoverActivity fTCChooseCoverActivity) {
            super(1);
            this.f121385a = fTCChooseCoverActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (!booleanValue) {
                FTCChooseCoverActivity.super.onBackPressed();
            }
            return Boolean.valueOf(booleanValue);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity$d */
    static final class C52748d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FTCChooseCoverActivity f121387a;

        static {
            Covode.recordClassIndex(62145);
        }

        C52748d(FTCChooseCoverActivity fTCChooseCoverActivity) {
            this.f121387a = fTCChooseCoverActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                ((ImageView) this.f121387a.mo59481d_(R.id.bs3)).setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity$c */
    static final class C52747c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ FTCChooseCoverActivity f121386a;

        static {
            Covode.recordClassIndex(62144);
        }

        C52747c(FTCChooseCoverActivity fTCChooseCoverActivity) {
            this.f121386a = fTCChooseCoverActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ImageView imageView = (ImageView) this.f121386a.mo59481d_(R.id.bs3);
                C89219l.m154716b(imageView, "");
                if (booleanValue) {
                    i = 0;
                } else {
                    i = 8;
                }
                imageView.setVisibility(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:241:0x041b  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x0450  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x050f  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r24) {
        /*
        // Method dump skipped, instructions count: 1362
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity.onCreate(android.os.Bundle):void");
    }
}
