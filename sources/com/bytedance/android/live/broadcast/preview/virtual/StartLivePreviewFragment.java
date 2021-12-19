package com.bytedance.android.live.broadcast.preview.virtual;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.p048g.p049a.p050a.C0996c;
import com.C1764a;
import com.bytedance.android.live.broadcast.EnumC3338p;
import com.bytedance.android.live.broadcast.api.C3046c;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.p192c.AbstractC3185a;
import com.bytedance.android.live.broadcast.p192c.C3215b;
import com.bytedance.android.live.broadcast.p195d.C3223d;
import com.bytedance.android.live.broadcast.p195d.C3224e;
import com.bytedance.android.live.broadcast.p195d.C3225f;
import com.bytedance.android.live.broadcast.preview.virtual.LiveSettingApi;
import com.bytedance.android.live.broadcast.stream.C3678c;
import com.bytedance.android.live.broadcast.stream.C3704d;
import com.bytedance.android.live.broadcast.stream.capture.AbstractC3688a;
import com.bytedance.android.live.broadcast.stream.capture.C3691b;
import com.bytedance.android.live.broadcast.stream.capture.C3693c;
import com.bytedance.android.live.broadcast.stream.capture.p208a.C3689a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.C4217d;
import com.bytedance.android.live.effect.api.AbstractC4169e;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p250i.p251a.AbstractC4357d;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisableEffectSetting;
import com.bytedance.android.livesdk.p425aa.C6560m;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p561j.C9012af;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11685f;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11686g;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;

public class StartLivePreviewFragment extends C10935a implements AbstractC11686g {
    private static int PREVIEW_HEIGHT = 1280;
    private static int PREVIEW_WIDTH = 720;
    private AnimationSet l2RAnimationSet;
    private AbstractC11683e listener = new AbstractC11683e() {
        /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.C35673 */

        static {
            Covode.recordClassIndex(4054);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8842a(String str, String str2) {
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8851a(AbstractC11683e.AbstractC11684a aVar) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8852a(C11672a aVar, String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8853a(PrivacyCert privacyCert) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8854a(String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8857b() {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8859b(C11672a aVar, String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8860b(PrivacyCert privacyCert) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8861b(String str) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: d */
        public final void mo8864d(float f) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8847a() {
            StartLivePreviewFragment.this.getActivity().finish();
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final int mo8855b(String[] strArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8980b(strArr);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: c */
        public final int mo8862c(String[] strArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8982c(strArr);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: c */
        public final void mo8863c(float f) {
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null) {
                StartLivePreviewFragment.this.mLiveBeautyHelper.mo8534c(f);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8845a(String[] strArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8978a(strArr);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final void mo8858b(float f) {
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null) {
                StartLivePreviewFragment.this.mLiveBeautyHelper.mo8533b(f);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8848a(float f) {
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null) {
                StartLivePreviewFragment.this.mLiveBeautyHelper.mo8531a(f);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8849a(int i) {
            boolean z;
            if (StartLivePreviewFragment.this.mLiveBeautyHelper != null && StartLivePreviewFragment.this.mLiveFilterHelper != null) {
                int f = StartLivePreviewFragment.this.mLiveFilterHelper.mo9888f();
                StartLivePreviewFragment.this.mLiveFilterHelper.mo9880a(i);
                StartLivePreviewFragment startLivePreviewFragment = StartLivePreviewFragment.this;
                if (i < f) {
                    z = true;
                } else {
                    z = false;
                }
                startLivePreviewFragment.showFilterName(z);
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: b */
        public final int mo8856b(String[] strArr, String[] strArr2) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8981b(strArr, strArr2);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8846a(String[] strArr, String[] strArr2) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8979a(strArr, strArr2);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final void mo8850a(int i, PrivacyCert privacyCert) {
            if (i != StartLivePreviewFragment.this.mCameraType) {
                StartLivePreviewFragment.this.mCameraType = i;
                if (StartLivePreviewFragment.this.mCameraCapture != null) {
                    StartLivePreviewFragment.this.mCameraCapture.mo8969b(privacyCert);
                }
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8843a(String str, String str2, float f) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8974a(str, str2, f);
            return 0;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11683e
        /* renamed from: a */
        public final int mo8844a(String str, String str2, int[] iArr) {
            if (StartLivePreviewFragment.this.mStickerEffect == null) {
                return 0;
            }
            StartLivePreviewFragment.this.mStickerEffect.mo8975a(str, str2, iArr);
            return 0;
        }
    };
    public AbstractC3688a mCameraCapture;
    public int mCameraType = 1;
    public View mFilterLayout;
    private TextView mFilterText;
    private GestureDetectLayout mGestureDetectLayout;
    public GestureDetector mGestureDetector;
    private View.OnTouchListener mGestureTouchListener = new View.OnTouchListener() {
        /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.View$OnTouchListenerC35684 */

        static {
            Covode.recordClassIndex(4055);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            StartLivePreviewFragment.this.mGestureDetector.onTouchEvent(motionEvent);
            return false;
        }
    };
    public boolean mInitializedEffect;
    public AbstractC3185a mLiveBeautyHelper;
    public AbstractC4169e mLiveFilterHelper;
    private AbstractC3055a mLiveStream;
    private View mLoadingView;
    private int mScreenWidth;
    private boolean mShowStartLiveFragment;
    private AbstractC11685f mStartLiveFragment;
    public C3689a mStickerEffect;
    public AbstractC88412b mSubscribe;
    private SurfaceView mSurfaceView;
    private AnimationSet r2LAnimationSet;

    public static StartLivePreviewFragment newInstance() {
        return new StartLivePreviewFragment();
    }

    static {
        Covode.recordClassIndex(4051);
    }

    private void initGestureDetector() {
        this.mGestureDetector = new GestureDetector(getActivity(), new C3569a(this, (byte) 0));
        this.mGestureDetectLayout.mo18161a(this.mGestureTouchListener);
    }

    public void initEffect() {
        if (!this.mInitializedEffect) {
            this.mInitializedEffect = true;
            AbstractC4169e f = C4217d.m10323f();
            this.mLiveFilterHelper = f;
            f.mo9882a(this.mCameraCapture);
            this.mLiveBeautyHelper = new C3215b();
            C3689a aVar = new C3689a();
            this.mStickerEffect = aVar;
            AbstractC3688a aVar2 = this.mCameraCapture;
            if (aVar2 != null) {
                aVar2.mo8964a(aVar);
            }
            this.mStickerEffect.mo8972a(LiveNewEffectPanelSetting.INSTANCE.useNewPanel() ? 1 : 0);
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onPause() {
        AbstractC11685f fVar = this.mStartLiveFragment;
        if (fVar != null) {
            fVar.mo8730E();
        }
        AbstractC3055a aVar = this.mLiveStream;
        if (aVar != null) {
            aVar.mo8297b(PrivacyCert.Builder.with("bpea-389").usage("").tag("[offline test only] fragment onPause").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        super.onPause();
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC3055a aVar = this.mLiveStream;
        if (aVar != null) {
            aVar.mo8289a(PrivacyCert.Builder.with("bpea-368").usage("").tag("[Offline test only] Switch to foreground").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
        AbstractC11685f fVar = this.mStartLiveFragment;
        if (fVar == null) {
            this.mShowStartLiveFragment = true;
        } else {
            fVar.mo8729D();
        }
    }

    private void initLiveFragment() {
        AbstractC11685f createStartLiveFragment = ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).createStartLiveFragment(null);
        this.mStartLiveFragment = createStartLiveFragment;
        createStartLiveFragment.mo8736a(this.listener);
        AbstractC0976n a = getActivity().getSupportFragmentManager().mo3552a();
        a.mo3469b(R.id.ad6, this.mStartLiveFragment.mo8731F());
        a.mo3478e();
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().mo8698a(this);
        if (this.mShowStartLiveFragment) {
            this.mStartLiveFragment.mo8729D();
        }
    }

    private void initView() {
        this.mScreenWidth = C3966y.m9664c();
        this.mFilterLayout = getView().findViewById(R.id.b25);
        this.mGestureDetectLayout = (GestureDetectLayout) getView().findViewById(R.id.cz7);
        this.mSurfaceView = (SurfaceView) getView().findViewById(R.id.ec9);
        this.mFilterText = (TextView) getView().findViewById(R.id.b27);
        View findViewById = getView().findViewById(R.id.cfa);
        this.mLoadingView = findViewById;
        findViewById.setVisibility(0);
        ((LiveSettingApi.WebcastAPI) C5805e.m12718a().mo11572a(LiveSettingApi.WebcastAPI.class)).getLivePodCast().mo143271a(new C11191f()).mo143254a(new C3572c(this), new C3573d(this));
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onDestroy() {
        AbstractC3688a aVar = this.mCameraCapture;
        if (aVar != null) {
            aVar.mo8965a(PrivacyCert.Builder.with("bpea-432").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            this.mCameraCapture = null;
        }
        AbstractC88412b bVar = this.mSubscribe;
        if (bVar != null && !bVar.isDisposed()) {
            this.mSubscribe.dispose();
        }
        AbstractC3055a aVar2 = this.mLiveStream;
        if (aVar2 != null) {
            aVar2.mo8299c(PrivacyCert.Builder.with("bpea-489").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            this.mLiveStream = null;
        }
        ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).startLiveManager().mo8700b(this);
        super.onDestroy();
    }

    private void initCameraCapture() {
        int i;
        if (AbstractC6804a.f17058i.mo13068b().intValue() == 0) {
            i = 2;
        } else {
            i = 1;
        }
        this.mCameraType = i;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            if (intent == null || !C13627m.m24499a(m8970x46daf309(intent, "orientation"), "landscape")) {
                PREVIEW_WIDTH = 720;
                PREVIEW_HEIGHT = 1280;
            } else {
                PREVIEW_WIDTH = 1280;
                PREVIEW_HEIGHT = 720;
            }
        }
        C3704d.C3705a aVar = new C3704d.C3705a(getContext());
        aVar.f10269v = ((AbstractC4357d) C6193a.m13435a(AbstractC4357d.class)).getProjectKey();
        aVar.f10237E = new C3224e();
        aVar.f10267t = new C3225f();
        aVar.f10238F = new C3223d();
        aVar.f10264q = i;
        aVar.f10240H = EnumC3338p.INST.getModelFilePath();
        aVar.f10241I = EnumC3338p.INST.getResourceFinder(getContext());
        C3704d.C3705a a = aVar.mo9020a(PREVIEW_WIDTH, PREVIEW_HEIGHT);
        a.f10265r = 5;
        this.mLiveStream = new C3678c(a.mo9021a());
        C3691b bVar = new C3691b(this.mSurfaceView, this.mLiveStream, true);
        this.mCameraCapture = bVar;
        bVar.mo8962a(new C3693c.AbstractC3694a() {
            /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.C35651 */

            static {
                Covode.recordClassIndex(4052);
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.C3693c.AbstractC3694a
            /* renamed from: a */
            public final void mo8838a(int i, int i2) {
            }

            @Override // com.bytedance.android.live.broadcast.stream.capture.C3693c.AbstractC3694a
            /* renamed from: a */
            public final void mo8837a() {
                if (!StartLivePreviewFragment.this.mInitializedEffect) {
                    StartLivePreviewFragment.this.mSubscribe = AbstractC88979t.m154310b((Object) 1).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3574e(this), C3575f.f9903a);
                }
            }
        });
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11686g
    public void onStartLive() {
        AbstractC3688a aVar = this.mCameraCapture;
        if (aVar != null) {
            aVar.mo8965a(PrivacyCert.Builder.with("bpea-431").usage("").tag("stop video/audio capture when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy()).build());
            this.mCameraCapture = null;
        }
        AbstractC4169e eVar = this.mLiveFilterHelper;
        if (eVar != null) {
            eVar.mo9879a();
        }
        AbstractC3055a aVar2 = this.mLiveStream;
        if (aVar2 != null) {
            aVar2.mo8297b(PrivacyCert.Builder.with("bpea-390").usage("").tag("[offline test only] fragment onPause").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            this.mLiveStream.mo8299c(PrivacyCert.Builder.with("bpea-490").usage("").tag("release when live ends").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            this.mLiveStream = null;
        }
        getActivity().finish();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment$a */
    public final class C3569a extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(4056);
        }

        private C3569a() {
        }

        /* synthetic */ C3569a(StartLivePreviewFragment startLivePreviewFragment, byte b) {
            this();
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            boolean z;
            if (!(TestDisableEffectSetting.INSTANCE.getValue() || motionEvent == null || motionEvent2 == null)) {
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                    if (x > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (StartLivePreviewFragment.this.mLiveFilterHelper != null) {
                        if (C11279p.m20022c()) {
                            DataChannelGlobal.f42558d.mo28321a(C3046c.class, false);
                        }
                        if (z) {
                            StartLivePreviewFragment.this.mLiveFilterHelper.mo9885c();
                        } else {
                            StartLivePreviewFragment.this.mLiveFilterHelper.mo9886d();
                        }
                        StartLivePreviewFragment.this.showFilterName(z);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C6560m.f16387j = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initView$1$StartLivePreviewFragment(Throwable th) {
        C11226ao.m19883a(C3966y.m9669e(), "fetch live permission fail, please retry", 0);
        this.mLoadingView.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$initView$0$StartLivePreviewFragment(C5832d dVar) {
        C3571b bVar = ((LiveSettingApi.C3564a) dVar.data).f9886b;
        if (bVar != null) {
            DataChannelGlobal.f42558d.mo28321a(C9012af.class, new C11826b(false, bVar.f9896a, bVar.f9898c, bVar.f9897b, bVar.f9899d));
        }
        C3570a aVar = ((LiveSettingApi.C3564a) dVar.data).f9887c;
        if (aVar != null) {
            DataChannelGlobal.f42558d.mo28321a(C9115e.class, new C11825a(aVar.f9895c, aVar.f9894b, aVar.f9893a));
        }
        initLiveFragment();
        this.mLoadingView.setVisibility(8);
    }

    public void showFilterName(boolean z) {
        String str;
        AbstractC4169e eVar = this.mLiveFilterHelper;
        if (eVar != null) {
            str = eVar.mo9884b();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            this.mFilterText.setText(str);
            if (z) {
                if (this.l2RAnimationSet == null) {
                    this.l2RAnimationSet = generateAnimationSet(true);
                } else {
                    this.mFilterLayout.clearAnimation();
                }
                this.mFilterLayout.startAnimation(this.l2RAnimationSet);
                return;
            }
            if (this.r2LAnimationSet == null) {
                this.r2LAnimationSet = generateAnimationSet(false);
            } else {
                this.mFilterLayout.clearAnimation();
            }
            this.mFilterLayout.startAnimation(this.r2LAnimationSet);
        }
    }

    private AnimationSet generateAnimationSet(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = (this.mScreenWidth - this.mFilterText.getWidth()) / 2;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new C0996c());
        alphaAnimation.setDuration(300);
        if (z) {
            f = (float) (-width);
        } else {
            f = (float) width;
        }
        float f6 = -50.0f;
        if (z) {
            f2 = -50.0f;
        } else {
            f2 = 50.0f;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(f, f2, 0.0f, 0.0f);
        translateAnimation.setInterpolator(new C0996c());
        translateAnimation.setDuration(300);
        if (z) {
            f3 = -50.0f;
            f4 = 50.0f;
        } else {
            f3 = 50.0f;
            f4 = -50.0f;
        }
        TranslateAnimation translateAnimation2 = new TranslateAnimation(f3, f4, 0.0f, 0.0f);
        translateAnimation2.setInterpolator(new LinearInterpolator());
        translateAnimation2.setStartOffset(300);
        translateAnimation2.setDuration(200);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(500);
        alphaAnimation2.setInterpolator(new C0995b());
        alphaAnimation2.setDuration(300);
        if (z) {
            f6 = 50.0f;
            f5 = (float) width;
        } else {
            f5 = (float) (-width);
        }
        TranslateAnimation translateAnimation3 = new TranslateAnimation(f6, f5, 0.0f, 0.0f);
        translateAnimation3.setStartOffset(500);
        translateAnimation3.setInterpolator(new C0995b());
        translateAnimation3.setDuration(300);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(translateAnimation2);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.addAnimation(translateAnimation3);
        animationSet.setAnimationListener(new Animation.AnimationListener() {
            /* class com.bytedance.android.live.broadcast.preview.virtual.StartLivePreviewFragment.animationAnimation$AnimationListenerC35662 */

            static {
                Covode.recordClassIndex(4053);
            }

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                StartLivePreviewFragment.this.mFilterLayout.setVisibility(4);
            }

            public final void onAnimationStart(Animation animation) {
                StartLivePreviewFragment.this.mFilterLayout.setVisibility(0);
            }
        });
        return animationSet;
    }

    /* renamed from: com_bytedance_android_live_broadcast_preview_virtual_StartLivePreviewFragment_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m8970x46daf309(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        super.onViewCreated(view, bundle);
        ActivityC0945e activity = getActivity();
        if (!(activity == null || (intent = activity.getIntent()) == null || !C13627m.m24499a(m8970x46daf309(intent, "orientation"), "landscape"))) {
            activity.setRequestedOrientation(0);
        }
        initView();
        initCameraCapture();
        initGestureDetector();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.b4c, viewGroup, false);
    }
}
