package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1205n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.internal.AbstractC56811d;
import com.p2082ss.android.ugc.aweme.internal.IShoutOutApiService;
import com.p2082ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.shortvideo.C71815es;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shoutouts.C74381a;
import com.p2082ss.android.ugc.aweme.shoutouts.C74424f;
import com.p2082ss.android.ugc.aweme.shoutouts.C74426g;
import com.p2082ss.android.ugc.tools.p4341d.p4342a.C84412c;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88303z;
import java.io.Serializable;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut */
public final class VEVideoPublishPreviewActivityShoutOut extends ActivityC33402b {

    /* renamed from: h */
    public static final C73337a f164743h = new C73337a((byte) 0);

    /* renamed from: d */
    public C88303z f164744d;

    /* renamed from: e */
    public View f164745e;

    /* renamed from: f */
    public boolean f164746f;

    /* renamed from: g */
    public boolean f164747g;

    /* renamed from: i */
    private final C1205n f164748i = new C1205n(this);

    /* renamed from: j */
    private HashMap f164749j;

    static {
        Covode.recordClassIndex(86068);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f164749j == null) {
            this.f164749j = new HashMap();
        }
        View view = (View) this.f164749j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f164749j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut$a */
    public static final class C73337a {
        static {
            Covode.recordClassIndex(86069);
        }

        private C73337a() {
        }

        public /* synthetic */ C73337a(byte b) {
            this();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f164748i;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        this.f164748i.mo4017a(AbstractC1196i.EnumC1199b.DESTROYED);
        C88303z zVar = this.f164744d;
        if (zVar != null) {
            zVar.mo142796b();
        }
        C84412c.m145200a(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C88303z zVar;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onResume", true);
        super.onResume();
        if (!this.f164746f && !this.f164747g && (zVar = this.f164744d) != null) {
            zVar.mo142800e();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut$d */
    static final class RunnableC73340d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f164752a;

        /* renamed from: b */
        final /* synthetic */ VideoPublishEditModel f164753b;

        static {
            Covode.recordClassIndex(86072);
        }

        RunnableC73340d(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut, VideoPublishEditModel videoPublishEditModel) {
            this.f164752a = vEVideoPublishPreviewActivityShoutOut;
            this.f164753b = videoPublishEditModel;
        }

        public final void run() {
            if (this.f164753b.mShoutOutsData.getPrice() != null && this.f164753b.mShoutOutsData.getBuyerMoneyDes() != null) {
                C74381a buyerMoneyDes = this.f164753b.mShoutOutsData.getBuyerMoneyDes();
                if (buyerMoneyDes == null) {
                    C89219l.m154715b();
                }
                if (!TextUtils.isEmpty(buyerMoneyDes.getCurrencyCharacter())) {
                    IShoutOutApiService b = ShoutOutServiceImpl.m103042b();
                    View findViewById = this.f164752a.findViewById(R.id.c73);
                    C89219l.m154716b(findViewById, "");
                    ViewGroup viewGroup = (ViewGroup) findViewById;
                    C74426g price = this.f164753b.mShoutOutsData.getPrice();
                    if (price == null) {
                        C89219l.m154715b();
                    }
                    int coin = price.getCoin();
                    C74381a buyerMoneyDes2 = this.f164753b.mShoutOutsData.getBuyerMoneyDes();
                    if (buyerMoneyDes2 == null) {
                        C89219l.m154715b();
                    }
                    float money = (float) buyerMoneyDes2.getMoney();
                    C74381a buyerMoneyDes3 = this.f164753b.mShoutOutsData.getBuyerMoneyDes();
                    if (buyerMoneyDes3 == null) {
                        C89219l.m154715b();
                    }
                    String currencyCharacter = buyerMoneyDes3.getCurrencyCharacter();
                    if (currencyCharacter == null) {
                        C89219l.m154715b();
                    }
                    b.mo93981a(viewGroup, coin, money, currencyCharacter, this.f164753b.mShoutOutsData.getDesc(), new AbstractC56811d(this) {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VEVideoPublishPreviewActivityShoutOut.RunnableC73340d.C733411 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC73340d f164754a;

                        static {
                            Covode.recordClassIndex(86073);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f164754a = r1;
                        }

                        @Override // com.p2082ss.android.ugc.aweme.internal.AbstractC56811d
                        /* renamed from: a */
                        public final void mo93984a(boolean z) {
                            C88303z zVar;
                            if (z) {
                                this.f164754a.f164752a.f164747g = true;
                                C88303z zVar2 = this.f164754a.f164752a.f164744d;
                                if (zVar2 != null) {
                                    zVar2.mo142799d();
                                    return;
                                }
                                return;
                            }
                            this.f164754a.f164752a.f164747g = false;
                            if (!this.f164754a.f164752a.f164746f && (zVar = this.f164754a.f164752a.f164744d) != null) {
                                zVar.mo142800e();
                            }
                        }
                    });
                }
            }
        }
    }

    public final void setPlayView(View view) {
        C89219l.m154721d(view, "");
        this.f164745e = view;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut$e */
    static final class View$OnClickListenerC73342e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f164755a;

        static {
            Covode.recordClassIndex(86074);
        }

        View$OnClickListenerC73342e(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut) {
            this.f164755a = vEVideoPublishPreviewActivityShoutOut;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164755a.finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        getIntent();
        C84412c.m145203a(this, bundle);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut$b */
    static final class View$OnClickListenerC73338b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f164750a;

        static {
            Covode.recordClassIndex(86070);
        }

        View$OnClickListenerC73338b(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut) {
            this.f164750a = vEVideoPublishPreviewActivityShoutOut;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f164750a.f164746f) {
                this.f164750a.f164746f = false;
                VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut = this.f164750a;
                C88303z zVar = vEVideoPublishPreviewActivityShoutOut.f164744d;
                if (zVar != null) {
                    zVar.mo142800e();
                }
                View view2 = vEVideoPublishPreviewActivityShoutOut.f164745e;
                if (view2 == null) {
                    C89219l.m154710a("playView");
                }
                view2.setVisibility(4);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut$c */
    static final class View$OnClickListenerC73339c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEVideoPublishPreviewActivityShoutOut f164751a;

        static {
            Covode.recordClassIndex(86071);
        }

        View$OnClickListenerC73339c(VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut) {
            this.f164751a = vEVideoPublishPreviewActivityShoutOut;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f164751a.f164746f) {
                this.f164751a.f164746f = true;
                VEVideoPublishPreviewActivityShoutOut vEVideoPublishPreviewActivityShoutOut = this.f164751a;
                C88303z zVar = vEVideoPublishPreviewActivityShoutOut.f164744d;
                if (zVar != null) {
                    zVar.mo142799d();
                }
                View view2 = vEVideoPublishPreviewActivityShoutOut.f164745e;
                if (view2 == null) {
                    C89219l.m154710a("playView");
                }
                view2.setVisibility(0);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", true);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(R.layout.cd);
        View findViewById = findViewById(R.id.d2o);
        C89219l.m154716b(findViewById, "");
        this.f164745e = findViewById;
        if (findViewById == null) {
            C89219l.m154710a("playView");
        }
        findViewById.setTranslationY((-((float) C30745b.m63133b(this))) * 0.16f);
        C84412c.m145202a(this, getIntent(), bundle);
        View view = this.f164745e;
        if (view == null) {
            C89219l.m154710a("playView");
        }
        view.setOnClickListener(new View$OnClickListenerC73338b(this));
        C63238c.m114590a(C71815es.m126788a());
        View findViewById2 = findViewById(R.id.d69);
        C89219l.m154716b(findViewById2, "");
        SurfaceView surfaceView = (SurfaceView) findViewById2;
        Serializable serializableExtra = getIntent().getSerializableExtra("args");
        if (serializableExtra != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) serializableExtra;
            C88303z zVar = new C88303z(videoPublishEditModel.videoEditorType);
            this.f164744d = zVar;
            zVar.f200404d = true;
            C88303z zVar2 = this.f164744d;
            if (zVar2 == null) {
                C89219l.m154715b();
            }
            C74424f.m130881a(this, videoPublishEditModel, zVar2, this.f164748i, surfaceView);
            surfaceView.setVisibility(0);
            surfaceView.setOnClickListener(new View$OnClickListenerC73339c(this));
            new SafeHandler(this).post(new RunnableC73340d(this, videoPublishEditModel));
            findViewById(R.id.pf).setOnClickListener(new View$OnClickListenerC73342e(this));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", false);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivityShoutOut", "onCreate", false);
        throw nullPointerException;
    }
}
