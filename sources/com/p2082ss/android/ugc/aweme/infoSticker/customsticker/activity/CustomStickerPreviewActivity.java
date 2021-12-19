package com.p2082ss.android.ugc.aweme.infoSticker.customsticker.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22231l;
import com.bytedance.scene.C22217i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.common.p1832d.AbstractC24092j;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.p2082ss.android.ugc.aweme.infoSticker.customsticker.p3289a.C56677a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity */
public final class CustomStickerPreviewActivity extends AbstractActivityC33414h {

    /* renamed from: f */
    public static final C56710a f129249f = new C56710a((byte) 0);

    /* renamed from: e */
    public C56677a f129250e;

    /* renamed from: g */
    private EditCornerViewModel f129251g;

    /* renamed from: h */
    private EditPreviewStickerViewModel f129252h;

    /* renamed from: i */
    private String f129253i;

    /* renamed from: j */
    private String f129254j;

    /* renamed from: k */
    private String f129255k;

    /* renamed from: l */
    private String f129256l;

    /* renamed from: m */
    private HashMap f129257m;

    static {
        Covode.recordClassIndex(66560);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: b */
    public final void mo59493b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f129257m == null) {
            this.f129257m = new HashMap();
        }
        View view = (View) this.f129257m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f129257m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: h */
    public final void mo59496h() {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity$a */
    public static final class C56710a {

        /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity$a$a */
        public static final class C56711a<T> implements AbstractC24092j {

            /* renamed from: a */
            public static final C56711a f129258a = new C56711a();

            static {
                Covode.recordClassIndex(66562);
            }

            C56711a() {
            }

            @Override // com.facebook.common.p1832d.AbstractC24092j
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo39650a(Object obj) {
                return true;
            }
        }

        static {
            Covode.recordClassIndex(66561);
        }

        private C56710a() {
        }

        public /* synthetic */ C56710a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        if (Build.VERSION.SDK_INT >= 21) {
            overridePendingTransition(0, 0);
        }
        super.onPause();
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

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        C56677a aVar = this.f129250e;
        if (aVar == null) {
            C89219l.m154710a("rootScene");
        }
        if (aVar.mo62771E().mo93572b()) {
            super.onBackPressed();
            return;
        }
        C56677a aVar2 = this.f129250e;
        if (aVar2 == null) {
            C89219l.m154710a("rootScene");
        }
        if (!aVar2.mo62771E().f129176J) {
            C56677a aVar3 = this.f129250e;
            if (aVar3 == null) {
                C89219l.m154710a("rootScene");
            }
            if (aVar3.mo62771E().mo93571a()) {
                EditPreviewStickerViewModel editPreviewStickerViewModel = this.f129252h;
                if (editPreviewStickerViewModel == null) {
                    C89219l.m154710a("customStickerViewModel");
                }
                editPreviewStickerViewModel.mo93565a();
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h
    /* renamed from: a */
    public final void mo59491a(boolean z) {
        View findViewById = findViewById(R.id.pf);
        C89219l.m154716b(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = Math.max(C40979n.m82503a() - ((int) C30745b.m63132b(this, 8.0f)), 0) + ((int) C30745b.m63132b(this, 24.5f));
        findViewById.setLayoutParams(layoutParams2);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b, com.p2082ss.android.ugc.aweme.adaptation.AbstractActivityC33414h, androidx.appcompat.app.ActivityC0218d
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.b6);
        JediViewModel a = C20531t.m38716a(this).mo33800a(EditCornerViewModel.class);
        C89219l.m154716b(a, "");
        this.f129251g = (EditCornerViewModel) a;
        this.f129253i = m102707a(getIntent(), "shoot_way");
        this.f129254j = m102707a(getIntent(), "content_source");
        this.f129255k = m102707a(getIntent(), "content_type");
        this.f129256l = m102707a(getIntent(), "creation_id");
        MediaModel mediaModel = (MediaModel) getIntent().getParcelableExtra("preview_sticker_params");
        if (mediaModel != null) {
            C89219l.m154716b(mediaModel, "");
            this.f129250e = new C56677a(mediaModel, (Effect) getIntent().getParcelableExtra("custom_sticker"), this.f129253i, this.f129254j, this.f129255k, this.f129256l);
            C22217i.C22218a a2 = C22217i.m41761a(this, C56677a.class);
            a2.f52533e = false;
            a2.f52534f = new C56712b(this);
            a2.f52530b = false;
            a2.f52531c = false;
            a2.f52532d = R.id.dlw;
            a2.mo36469a();
        }
        JediViewModel a3 = C20531t.m38716a(this).mo33800a(EditPreviewStickerViewModel.class);
        C89219l.m154716b(a3, "");
        EditPreviewStickerViewModel editPreviewStickerViewModel = (EditPreviewStickerViewModel) a3;
        this.f129252h = editPreviewStickerViewModel;
        if (editPreviewStickerViewModel == null) {
            C89219l.m154710a("customStickerViewModel");
        }
        editPreviewStickerViewModel.mo33689c(new EditPreviewStickerViewModel.C56675l((MediaModel) getIntent().getParcelableExtra("preview_sticker_params")));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m102707a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.infoSticker.customsticker.activity.CustomStickerPreviewActivity$b */
    static final class C56712b implements AbstractC22231l {

        /* renamed from: a */
        final /* synthetic */ CustomStickerPreviewActivity f129259a;

        static {
            Covode.recordClassIndex(66563);
        }

        C56712b(CustomStickerPreviewActivity customStickerPreviewActivity) {
            this.f129259a = customStickerPreviewActivity;
        }

        @Override // com.bytedance.scene.AbstractC22231l
        public final AbstractC22219j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            C89219l.m154721d(classLoader, "");
            C89219l.m154721d(str, "");
            if (!C89219l.m154714a((Object) C56677a.class.getName(), (Object) str)) {
                return null;
            }
            C56677a aVar = this.f129259a.f129250e;
            if (aVar == null) {
                C89219l.m154710a("rootScene");
            }
            return aVar;
        }
    }
}
