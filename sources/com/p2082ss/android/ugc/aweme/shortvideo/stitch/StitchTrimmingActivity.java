package com.p2082ss.android.ugc.aweme.shortvideo.stitch;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.C70155ad;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71903i;
import com.p2082ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity */
public final class StitchTrimmingActivity extends AbstractActivityC33414h {

    /* renamed from: f */
    public static boolean f164192f = true;

    /* renamed from: g */
    public static final C73119a f164193g = new C73119a((byte) 0);

    /* renamed from: e */
    public C73134g f164194e;

    /* renamed from: h */
    private CutVideoViewModel f164195h;

    /* renamed from: i */
    private EditCornerViewModel f164196i;

    /* renamed from: j */
    private String f164197j;

    /* renamed from: k */
    private HashMap f164198k;

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f164198k == null) {
            this.f164198k = new HashMap();
        }
        View view = (View) this.f164198k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f164198k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity$a */
    public static final class C73119a {
        static {
            Covode.recordClassIndex(85833);
        }

        private C73119a() {
        }

        public /* synthetic */ C73119a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(85832);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public final void onResume() {
        String str;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", true);
        super.onResume();
        String str2 = this.f164197j;
        if (str2 == null) {
            str2 = "";
        }
        boolean z = f164192f;
        C89219l.m154721d(str2, "");
        C84425b a = new C84425b().mo129406a("shoot_way", "stitch").mo129406a("enter_from", "video_stitch_page").mo129406a("creation_id", str2).mo129406a("content_source", "shoot").mo129406a("content_type", "video");
        if (z) {
            str = "normal";
        } else {
            str = "back";
        }
        C39162r.m79460a("enter_video_stitch_page", a.mo129406a("enter_method", str).f188764a);
        f164192f = false;
        AbstractC81915c.m141874a(new C71903i());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onResume", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
        CutVideoViewModel cutVideoViewModel = this.f164195h;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            C73134g gVar = this.f164194e;
            if (gVar == null) {
                C89219l.m154710a("mRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = gVar.f164225f;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (!cutVideoViewModel2.mo110803g()) {
                VideoEditViewModel videoEditViewModel = gVar.f164227h;
                if (videoEditViewModel == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int i = videoEditViewModel.mo111232k().get(0).f156714f;
                VideoEditViewModel videoEditViewModel2 = gVar.f164227h;
                if (videoEditViewModel2 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int min = Math.min(i, videoEditViewModel2.mo111232k().get(0).f156715g);
                VideoEditViewModel videoEditViewModel3 = gVar.f164227h;
                if (videoEditViewModel3 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int i2 = videoEditViewModel3.mo111232k().get(0).f156714f;
                VideoEditViewModel videoEditViewModel4 = gVar.f164227h;
                if (videoEditViewModel4 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                int max = Math.max(i2, videoEditViewModel4.mo111232k().get(0).f156715g);
                CutVideoPreviewViewModel cutVideoPreviewViewModel = gVar.f164226g;
                if (cutVideoPreviewViewModel == null) {
                    C89219l.m154710a("previewViewModel");
                }
                cutVideoPreviewViewModel.mo110738a(min, max);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        int i;
        CutVideoViewModel cutVideoViewModel = this.f164195h;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            EditCornerViewModel editCornerViewModel = this.f164196i;
            if (editCornerViewModel == null) {
                C89219l.m154710a("cornerViewModel");
            }
            if (z) {
                i = C70636dh.m124833c(this);
            } else {
                i = 0;
            }
            editCornerViewModel.mo127318a(i);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, androidx.appcompat.app.ActivityC0218d
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        CutVideoViewModel cutVideoViewModel = this.f164195h;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel.mo110806j()) {
            CutVideoViewModel cutVideoViewModel2 = this.f164195h;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            bundle.putParcelable("workspace", cutVideoViewModel2.mo110802b().f156851i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
        int b;
        int i;
        CutVideoViewModel cutVideoViewModel = this.f164195h;
        if (cutVideoViewModel == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (!cutVideoViewModel.mo110803g()) {
            C73134g gVar = this.f164194e;
            if (gVar == null) {
                C89219l.m154710a("mRootScene");
            }
            CutVideoViewModel cutVideoViewModel2 = gVar.f164225f;
            if (cutVideoViewModel2 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            int i2 = 0;
            if (!cutVideoViewModel2.mo110803g()) {
                C73130f E = gVar.mo62771E();
                int c = C33398a.m68487c();
                View view = E.mo62771E().f52550n;
                C89219l.m154716b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (z) {
                    b = c;
                } else {
                    b = (int) C13628n.m24520b(E.f52549m, 132.0f);
                }
                marginLayoutParams.height = b;
                View view2 = E.mo62771E().f52550n;
                C89219l.m154716b(view2, "");
                view2.setLayoutParams(marginLayoutParams);
                View view3 = E.mo115683F().f52550n;
                C89219l.m154716b(view3, "");
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (z) {
                    i = (int) (C13628n.m24520b(E.f52549m, 5.5f) + ((float) c));
                } else {
                    i = 0;
                }
                marginLayoutParams2.bottomMargin = i;
                View view4 = E.mo115683F().f52550n;
                C89219l.m154716b(view4, "");
                view4.setLayoutParams(marginLayoutParams2);
            }
            EditCornerViewModel editCornerViewModel = this.f164196i;
            if (editCornerViewModel == null) {
                C89219l.m154710a("cornerViewModel");
            }
            if (z) {
                i2 = C33398a.m68487c();
            }
            editCornerViewModel.mo127320b(i2);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        Workspace workspace;
        C15477a.m28474a(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", true);
        super.onCreate(bundle);
        C63244g.m114602a().mo73293u();
        setContentView(R.layout.b6);
        if (!getIntent().hasExtra("stitch_params")) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
            return;
        }
        JediViewModel a = C20531t.m38716a(this).mo33800a(CutVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f164195h = (CutVideoViewModel) a;
        JediViewModel a2 = C20531t.m38716a(this).mo33800a(EditCornerViewModel.class);
        C89219l.m154716b(a2, "");
        this.f164196i = (EditCornerViewModel) a2;
        C70155ad adVar = new C70155ad();
        StitchParams stitchParams = (StitchParams) getIntent().getParcelableExtra("stitch_params");
        if (stitchParams != null) {
            String a3 = m129126a(getIntent(), "creation_id");
            this.f164197j = a3;
            if (TextUtils.isEmpty(a3)) {
                this.f164197j = UUID.randomUUID().toString();
            }
            adVar.f156866x = stitchParams;
            String videoPath = stitchParams.getVideoPath();
            if (TextUtils.isEmpty(videoPath)) {
                finish();
            } else {
                ArrayList<MediaModel> arrayList = new ArrayList<>();
                MediaModel mediaModel = new MediaModel(1);
                mediaModel.f134662b = videoPath;
                arrayList.add(mediaModel);
                adVar.mo110808a(arrayList);
                adVar.f156845c = true;
                adVar.f156846d = getIntent().getLongExtra("min_duration", 3000);
                if (bundle == null) {
                    workspace = C69744c.m123266a();
                } else {
                    workspace = (Workspace) bundle.getParcelable("workspace");
                }
                adVar.f156851i = workspace;
                CutVideoViewModel cutVideoViewModel = this.f164195h;
                if (cutVideoViewModel == null) {
                    C89219l.m154710a("cutVideoViewModel");
                }
                cutVideoViewModel.mo110801a(adVar);
                C84911q.m145926b("cutVideoModel initialized");
            }
        }
        C73134g gVar = new C73134g();
        this.f164194e = gVar;
        gVar.f164230k = this.f164197j;
        C22217i.C22218a a4 = C22217i.m41761a(this, C73134g.class);
        a4.f52533e = false;
        a4.f52534f = new C73120b(this);
        a4.f52530b = false;
        a4.f52531c = false;
        a4.f52532d = R.id.dlw;
        a4.mo36469a();
        CutVideoViewModel cutVideoViewModel2 = this.f164195h;
        if (cutVideoViewModel2 == null) {
            C89219l.m154710a("cutVideoViewModel");
        }
        if (cutVideoViewModel2.f156834a != null) {
            CutVideoViewModel cutVideoViewModel3 = this.f164195h;
            if (cutVideoViewModel3 == null) {
                C89219l.m154710a("cutVideoViewModel");
            }
            if (cutVideoViewModel3.mo110803g()) {
                ((AbstractActivityC33414h) this).f79438d = false;
            }
            C84911q.m145926b("cutVideoModel initialized state: ".concat(String.valueOf(z)));
            JediViewModel a5 = C20531t.m38716a(this).mo33800a(EditCornerViewModel.class);
            C89219l.m154716b(a5, "");
            this.f164196i = (EditCornerViewModel) a5;
        } else {
            z = false;
            C84911q.m145926b("cutVideoModel initialized state: ".concat(String.valueOf(z)));
            JediViewModel a52 = C20531t.m38716a(this).mo33800a(EditCornerViewModel.class);
            C89219l.m154716b(a52, "");
            this.f164196i = (EditCornerViewModel) a52;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m129126a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingActivity$b */
    static final class C73120b implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ StitchTrimmingActivity f164199a;

        static {
            Covode.recordClassIndex(85834);
        }

        C73120b(StitchTrimmingActivity stitchTrimmingActivity) {
            this.f164199a = stitchTrimmingActivity;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (!C89219l.m154714a((Object) C73134g.class.getName(), (Object) str)) {
                return null;
            }
            C73134g gVar = this.f164199a.f164194e;
            if (gVar == null) {
                C89219l.m154710a("mRootScene");
            }
            return gVar;
        }
    }
}
