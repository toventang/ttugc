package com.p2082ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.net.C39148c;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63821a;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.C66378b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66449b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66450c;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66423c;
import com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p2082ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVEnigma;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVEnigmaResult;
import com.p2082ss.android.ugc.aweme.services.external.ability.p3711qr.AVScanSettings;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2 */
public class ScanQRCodeActivityV2 extends ActivityC17312a implements View.OnClickListener, AbstractC63852p, AbstractC66451d, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private FrameLayout f149380A;

    /* renamed from: B */
    private RelativeLayout f149381B;

    /* renamed from: C */
    private boolean f149382C;

    /* renamed from: D */
    private C66474d f149383D;

    /* renamed from: E */
    private QrCodeScanService f149384E;

    /* renamed from: a */
    public int f149385a;

    /* renamed from: b */
    public boolean f149386b;

    /* renamed from: c */
    SurfaceView f149387c;

    /* renamed from: d */
    public IQRCodeScanner f149388d;

    /* renamed from: e */
    public AbstractC66450c f149389e;

    /* renamed from: f */
    AbstractC66449b f149390f;

    /* renamed from: g */
    C63821a f149391g;

    /* renamed from: h */
    public boolean f149392h;

    /* renamed from: i */
    public boolean f149393i;

    /* renamed from: j */
    public boolean f149394j;

    /* renamed from: k */
    public boolean f149395k;

    /* renamed from: l */
    ImageView f149396l;

    /* renamed from: m */
    public GestureDetector f149397m;

    /* renamed from: n */
    public ScaleGestureDetector f149398n;

    /* renamed from: o */
    public GestureDetector f149399o;

    /* renamed from: p */
    public float f149400p = 1.0f;

    /* renamed from: q */
    public boolean f149401q;

    /* renamed from: r */
    IQRCodeScanner.OnEnigmaScanListener f149402r = new IQRCodeScanner.OnEnigmaScanListener() {
        /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.C664571 */

        static {
            Covode.recordClassIndex(77993);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener
        public final void onFail(int i) {
            if (ScanQRCodeActivityV2.this.f149395k && ScanQRCodeActivityV2.this.f149389e != null) {
                ScanQRCodeActivityV2.this.f149389e.mo105351a(ScanQRCodeActivityV2.this.f149392h);
            }
            if (ScanQRCodeActivityV2.this.f149392h && ScanQRCodeActivityV2.this.f149388d != null) {
                ScanQRCodeActivityV2.this.f149388d.stopPicScan();
            }
            ScanQRCodeActivityV2.this.f149392h = false;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner.OnEnigmaScanListener
        public final void onSuccess(AVEnigmaResult aVEnigmaResult) {
            if (ScanQRCodeActivityV2.this.f149395k && !ScanQRCodeActivityV2.this.f149394j && ScanQRCodeActivityV2.this.f149389e != null && aVEnigmaResult != null) {
                if (aVEnigmaResult.getResult() != null && aVEnigmaResult.getResult().length > 0) {
                    ScanQRCodeActivityV2.this.f149394j = true;
                    AVEnigma[] result = aVEnigmaResult.getResult();
                    if (ScanQRCodeActivityV2.this.f149386b) {
                        Intent intent = new Intent();
                        intent.putExtra("scan_code_result", result[0].getText());
                        intent.putExtra("scan_code_type", result[0].getType());
                        ScanQRCodeActivityV2.this.setResult(-1, intent);
                        ScanQRCodeActivityV2.this.finish();
                        return;
                    }
                    result[0].getText();
                    ScanQRCodeActivityV2.this.f149389e.mo105352a(ScanQRCodeActivityV2.this.f149392h, result[0].getType(), result[0].getText(), ScanQRCodeActivityV2.this.f149385a);
                } else if (ScanQRCodeActivityV2.this.f149388d != null) {
                    ScanQRCodeActivityV2.this.f149388d.zoomByRatio(aVEnigmaResult.zoomFactor);
                }
            }
            ScanQRCodeActivityV2.this.f149392h = false;
        }
    };

    /* renamed from: s */
    private TextView f149403s;

    /* renamed from: t */
    private TextTitleBar f149404t;

    /* renamed from: u */
    private ProgressDialogC66468a f149405u;

    /* renamed from: v */
    private boolean f149406v;

    /* renamed from: w */
    private TextView f149407w;

    /* renamed from: x */
    private boolean f149408x;

    /* renamed from: y */
    private TextView f149409y;

    /* renamed from: z */
    private TextView f149410z;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2$b */
    public interface AbstractC66465b {
        static {
            Covode.recordClassIndex(78001);
        }

        /* renamed from: a */
        void mo105404a();
    }

    static {
        Covode.recordClassIndex(77992);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90038b(AvatarUri avatarUri) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90039b(Exception exc) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(124, new RunnableC90250g(ScanQRCodeActivityV2.class, "onNetStateChangeEvent", C39148c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: c */
    public final void mo105371c() {
        this.f149396l.clearAnimation();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo105390i() {
        C68863ah.f154027a.mo109417b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: b */
    public final void mo105370b() {
        C1731i.m5640b(new CallableC66478h(this), C1731i.f5562a);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: e */
    public final void mo105373e() {
        ProgressDialogC66468a aVar = this.f149405u;
        if (aVar != null && aVar.isShowing()) {
            this.f149405u.dismiss();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: f */
    public final void mo105374f() {
        this.f149394j = false;
        IQRCodeScanner iQRCodeScanner = this.f149388d;
        if (iQRCodeScanner != null) {
            iQRCodeScanner.enableCameraScan(true, 65536);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Object mo105391j() {
        MethodCollector.m26663i(1871);
        synchronized (this) {
            try {
                IQRCodeScanner iQRCodeScanner = this.f149388d;
                if (iQRCodeScanner != null) {
                    iQRCodeScanner.stop();
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(1871);
                throw th;
            }
        }
        MethodCollector.m26664o(1871);
        return null;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        if (this.f149408x) {
            m118199k();
        }
        this.f149387c.setVisibility(4);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", true);
        this.f149384E.mo105338a();
        super.onResume();
        this.f149387c.setVisibility(0);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onResume", false);
    }

    /* renamed from: k */
    private void m118199k() {
        IQRCodeScanner iQRCodeScanner = this.f149388d;
        if (iQRCodeScanner != null) {
            iQRCodeScanner.closeLight();
        }
        this.f149408x = false;
        this.f149407w.setAlpha(0.8f);
        this.f149407w.setText(R.string.cuo);
        Drawable drawable = getResources().getDrawable(2131233566);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f149407w.setCompoundDrawables(null, drawable, null, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: d */
    public final void mo105372d() {
        ProgressDialogC66468a aVar = this.f149405u;
        if (aVar == null) {
            ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(this, "");
            this.f149405u = a;
            a.setIndeterminate(false);
        } else if (!aVar.isShowing()) {
            this.f149405u.show();
            this.f149405u.mo105414a();
        }
    }

    /* renamed from: g */
    public final void mo105388g() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-this.f149396l.getHeight()), (float) (this.f149380A.getHeight() - C34728n.m70946a(20.0d)));
        translateAnimation.setDuration(InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(1);
        translateAnimation.setFillAfter(false);
        translateAnimation.setInterpolator(new LinearInterpolator());
        this.f149396l.startAnimation(translateAnimation);
    }

    /* renamed from: h */
    public final void mo105389h() {
        MethodCollector.m26663i(1863);
        if (!this.f149382C) {
            C66474d dVar = new C66474d(this, (float) this.f149380A.getLeft(), (float) this.f149380A.getTop(), (float) this.f149380A.getRight(), (float) this.f149380A.getBottom());
            this.f149383D = dVar;
            this.f149381B.addView(dVar, 2);
            this.f149382C = true;
        }
        MethodCollector.m26664o(1863);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C66378b.f149286b.mo90116a("", 0);
        AbstractC66450c cVar = this.f149389e;
        if (cVar != null) {
            cVar.mo105354b();
        }
        C63821a aVar = this.f149391g;
        if (aVar != null) {
            aVar.mo103277d();
            this.f149391g.f144681c = null;
        }
        this.f149389e = null;
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.CallableC664637 */

            static {
                Covode.recordClassIndex(77999);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                MethodCollector.m26663i(33);
                if (ScanQRCodeActivityV2.this.f149388d != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        try {
                            if (ScanQRCodeActivityV2.this.f149388d != null) {
                                ScanQRCodeActivityV2.this.f149388d.stop();
                                ScanQRCodeActivityV2.this.f149388d.release();
                                ScanQRCodeActivityV2.this.f149388d.setScanListener(null);
                                ScanQRCodeActivityV2.this.f149388d = null;
                            }
                        } finally {
                            MethodCollector.m26664o(33);
                        }
                    }
                }
                return null;
            }
        }, C1731i.f5562a);
        GestureDetector gestureDetector = this.f149397m;
        if (gestureDetector != null) {
            gestureDetector.setOnDoubleTapListener(null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: a */
    public final void mo105368a() {
        if (this.f149388d == null) {
            mo105386a((AbstractC66465b) null);
        }
        final AVCameraParams aVCameraParams = new AVCameraParams(C17867d.m33078a(), 1);
        final AVScanSettings aVScanSettings = new AVScanSettings();
        aVScanSettings.width = 1280;
        aVScanSettings.height = 720;
        float b = (float) C34723i.m70928b(this);
        float a = (float) C34723i.m70924a(this);
        aVScanSettings.detectRectLeft = this.f149380A.getX() / b;
        aVScanSettings.detectRectTop = this.f149380A.getY() / a;
        aVScanSettings.detectRectWidth = ((float) this.f149380A.getWidth()) / b;
        aVScanSettings.detectRectHeight = ((float) this.f149380A.getHeight()) / a;
        aVScanSettings.detectRequirement = 65536;
        aVScanSettings.buildChainFlag = 1;
        aVScanSettings.enableDetectRect = true;
        C1731i.m5640b(new Callable<Object>() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.CallableC664626 */

            static {
                Covode.recordClassIndex(77998);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                MethodCollector.m26663i(49);
                synchronized (ScanQRCodeActivityV2.this) {
                    try {
                        if (ScanQRCodeActivityV2.this.f149388d != null && ScanQRCodeActivityV2.this.f149393i) {
                            IQRCodeScanner iQRCodeScanner = ScanQRCodeActivityV2.this.f149388d;
                            ScanQRCodeActivityV2 scanQRCodeActivityV2 = ScanQRCodeActivityV2.this;
                            iQRCodeScanner.startScan(scanQRCodeActivityV2, aVCameraParams, scanQRCodeActivityV2.f149387c.getHolder(), aVScanSettings);
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(49);
                        throw th;
                    }
                }
                MethodCollector.m26664o(49);
                return null;
            }
        }, C1731i.f5562a).mo5534a(new AbstractC1729g<Object, Object>() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.C664615 */

            static {
                Covode.recordClassIndex(77997);
            }

            @Override // p077b.AbstractC1729g
            public final Object then(C1731i<Object> iVar) {
                MethodCollector.m26663i(29);
                synchronized (ScanQRCodeActivityV2.this) {
                    try {
                        if (ScanQRCodeActivityV2.this.f149388d != null && !ScanQRCodeActivityV2.this.f149393i) {
                            ScanQRCodeActivityV2.this.f149388d.stop();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(29);
                        throw th;
                    }
                }
                MethodCollector.m26664o(29);
                return null;
            }
        }, C1731i.f5562a, null).mo5534a(new AbstractC1729g<Object, Object>() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.C664604 */

            static {
                Covode.recordClassIndex(77996);
            }

            @Override // p077b.AbstractC1729g
            public final Object then(C1731i<Object> iVar) {
                ScanQRCodeActivityV2.this.f149397m = new GestureDetector(ScanQRCodeActivityV2.this, new C66464a(ScanQRCodeActivityV2.this, (byte) 0));
                ScanQRCodeActivityV2.this.f149398n = new ScaleGestureDetector(ScanQRCodeActivityV2.this, new ScaleGestureDetector$OnScaleGestureListenerC66466c(ScanQRCodeActivityV2.this, (byte) 0));
                ScanQRCodeActivityV2.this.f149399o = new GestureDetector(ScanQRCodeActivityV2.this, new GestureDetector$OnGestureListenerC66467d(ScanQRCodeActivityV2.this, (byte) 0));
                return null;
            }
        }, C1731i.f5564c, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2$d */
    class GestureDetector$OnGestureListenerC66467d implements GestureDetector.OnGestureListener {
        static {
            Covode.recordClassIndex(78003);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onShowPress(MotionEvent motionEvent) {
        }

        private GestureDetector$OnGestureListenerC66467d() {
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            ScanQRCodeActivityV2.this.f149388d.processTouchEvent(motionEvent.getX() / ((float) C34723i.m70928b(ScanQRCodeActivityV2.this)), motionEvent.getY() / ((float) C34723i.m70924a(ScanQRCodeActivityV2.this)));
            return true;
        }

        /* synthetic */ GestureDetector$OnGestureListenerC66467d(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2$a */
    class C66464a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        private final float f149421b;

        /* renamed from: c */
        private long f149422c;

        static {
            Covode.recordClassIndex(78000);
        }

        private C66464a() {
            this.f149421b = 0.03f;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ScanQRCodeActivityV2.this.f149388d == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f149422c < 500) {
                return false;
            }
            this.f149422c = currentTimeMillis;
            if (ScanQRCodeActivityV2.this.f149400p > 1.0f) {
                while (ScanQRCodeActivityV2.this.f149400p > 1.0f) {
                    ScanQRCodeActivityV2.this.f149400p -= 0.03f;
                    ScanQRCodeActivityV2.this.f149388d.zoomByRatio(ScanQRCodeActivityV2.this.f149400p);
                }
            } else {
                while (ScanQRCodeActivityV2.this.f149400p < 3.0f) {
                    ScanQRCodeActivityV2.this.f149400p += 0.03f;
                    ScanQRCodeActivityV2.this.f149388d.zoomByRatio(ScanQRCodeActivityV2.this.f149400p);
                }
            }
            return false;
        }

        /* synthetic */ C66464a(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2$c */
    class ScaleGestureDetector$OnScaleGestureListenerC66466c implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: b */
        private final float f149424b;

        static {
            Covode.recordClassIndex(78002);
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        private ScaleGestureDetector$OnScaleGestureListenerC66466c() {
            this.f149424b = 0.05f;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!(ScanQRCodeActivityV2.this.f149388d == null || scaleGestureDetector == null)) {
                if (scaleGestureDetector.getScaleFactor() >= 1.0f && ScanQRCodeActivityV2.this.f149400p <= 3.0f) {
                    ScanQRCodeActivityV2.this.f149400p += 0.05f;
                } else if (ScanQRCodeActivityV2.this.f149400p >= 1.0f) {
                    ScanQRCodeActivityV2.this.f149400p -= 0.05f;
                }
                ScanQRCodeActivityV2.this.f149388d.zoomByRatio(ScanQRCodeActivityV2.this.f149400p);
            }
            return false;
        }

        /* synthetic */ ScaleGestureDetector$OnScaleGestureListenerC66466c(ScanQRCodeActivityV2 scanQRCodeActivityV2, byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.AbstractC66451d
    /* renamed from: a */
    public final void mo105369a(int i) {
        SurfaceView surfaceView = this.f149387c;
        if (surfaceView != null) {
            surfaceView.postDelayed(new RunnableC66479i(this), (long) i);
        }
    }

    /* renamed from: a */
    public final void mo105386a(AbstractC66465b bVar) {
        this.f149394j = false;
        AVExternalServiceImpl.m113114a().abilityService().cameraService().getScanner(true, this, this.f149387c.getHolder(), new C66476f(this, bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63852p
    /* renamed from: b */
    public final void mo90040b(String str) {
        if (this.f149388d == null) {
            mo105386a(new C66481k(this, str));
        } else {
            mo105387a(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo105387a(String str) {
        AVScanSettings aVScanSettings = new AVScanSettings();
        aVScanSettings.width = 1280;
        aVScanSettings.height = 720;
        aVScanSettings.buildChainFlag = 1;
        aVScanSettings.detectModelDir = "";
        this.f149392h = true;
        this.f149388d.startPicScan(str, aVScanSettings, 1000);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C66474d dVar = this.f149383D;
        if (dVar != null) {
            float left = (float) this.f149380A.getLeft();
            float top = (float) this.f149380A.getTop();
            float right = (float) this.f149380A.getRight();
            dVar.f149442a = top;
            dVar.f149443b = (float) this.f149380A.getBottom();
            dVar.f149444c = left;
            dVar.f149445d = right;
            dVar.invalidate();
        }
    }

    @AbstractC90264r
    public void onNetStateChangeEvent(C39148c cVar) {
        if (!isDestroyed()) {
            if (C34719f.C34720a.f82009a.mo61395c()) {
                this.f149409y.setVisibility(8);
                this.f149395k = true;
                return;
            }
            this.f149409y.setVisibility(0);
            this.f149395k = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f149397m;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        GestureDetector gestureDetector2 = this.f149399o;
        if (gestureDetector2 != null && gestureDetector2.onTouchEvent(motionEvent)) {
            return true;
        }
        ScaleGestureDetector scaleGestureDetector = this.f149398n;
        if (scaleGestureDetector == null || !scaleGestureDetector.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.eyh) {
            if (this.f149408x) {
                m118199k();
                return;
            }
            IQRCodeScanner iQRCodeScanner = this.f149388d;
            if (iQRCodeScanner != null) {
                iQRCodeScanner.openLight();
            }
            this.f149408x = true;
            this.f149407w.setAlpha(1.0f);
            this.f149407w.setText(R.string.cun);
            Drawable drawable = getResources().getDrawable(2131233567);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f149407w.setCompoundDrawables(null, drawable, null, null);
        } else if (id == R.id.ezy && !C58001a.m104815a(view, 1200)) {
            if (!C31575b.m65865g().isLogin()) {
                C58957c.m108320a(this, "scan", "click_my_qr", (Bundle) null, new C66480j(this));
            } else if (this.f149406v) {
                finish();
            } else {
                mo105390i();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78668b = true;
        xVar.f78672f = R.attr.a1;
        xVar.f78674h = true;
        activityConfiguration(new C66475e(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.c1);
        this.f149406v = getIntent().getBooleanExtra("enter_from", false);
        this.f149385a = getIntent().getIntExtra("scan_page_from", 0);
        this.f149401q = getIntent().getBooleanExtra("camera_only", false);
        this.f149386b = getIntent().getBooleanExtra("is_kill_self_after_scan", false);
        this.f149403s = (TextView) findViewById(R.id.ezy);
        TextTitleBar textTitleBar = (TextTitleBar) findViewById(R.id.eiz);
        this.f149404t = textTitleBar;
        textTitleBar.getBackBtn().setImageResource(R.drawable.ajg);
        this.f149393i = false;
        this.f149387c = (SurfaceView) findViewById(R.id.ec6);
        this.f149407w = (TextView) findViewById(R.id.eyh);
        this.f149409y = (TextView) findViewById(R.id.etj);
        this.f149396l = (ImageView) findViewById(R.id.dpa);
        this.f149410z = (TextView) findViewById(R.id.f1u);
        this.f149380A = (FrameLayout) findViewById(R.id.b5a);
        this.f149381B = (RelativeLayout) findViewById(R.id.dnk);
        TextTitleBar textTitleBar2 = this.f149404t;
        String str = "";
        C89219l.m154721d(textTitleBar2, str);
        textTitleBar2.getBackBtn().setImageResource(R.drawable.abe);
        this.f149387c.getHolder().addCallback(new SurfaceHolder.Callback() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.SurfaceHolder$CallbackC664582 */

            static {
                Covode.recordClassIndex(77994);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public final void mo105397a() {
                ScanQRCodeActivityV2.this.f149388d.enableCameraScan(true, 65536);
                ScanQRCodeActivityV2.this.mo105368a();
                ScanQRCodeActivityV2.this.mo105388g();
                ScanQRCodeActivityV2.this.mo105389h();
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                MethodCollector.m26663i(124);
                synchronized (this) {
                    try {
                        ScanQRCodeActivityV2.this.f149393i = true;
                    } catch (Throwable th) {
                        MethodCollector.m26664o(124);
                        throw th;
                    }
                }
                if (ScanQRCodeActivityV2.this.f149388d == null) {
                    ScanQRCodeActivityV2.this.mo105386a(new C66485o(this));
                    MethodCollector.m26664o(124);
                    return;
                }
                mo105397a();
                MethodCollector.m26664o(124);
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                MethodCollector.m26663i(138);
                ScanQRCodeActivityV2.this.f149396l.clearAnimation();
                synchronized (this) {
                    try {
                        ScanQRCodeActivityV2.this.f149393i = false;
                    } finally {
                        MethodCollector.m26664o(138);
                    }
                }
                if (ScanQRCodeActivityV2.this.f149388d != null) {
                    synchronized (ScanQRCodeActivityV2.this) {
                        try {
                            if (ScanQRCodeActivityV2.this.f149388d != null) {
                                ScanQRCodeActivityV2.this.f149388d.stop();
                                ScanQRCodeActivityV2.this.f149388d.release();
                            }
                        } finally {
                            MethodCollector.m26664o(138);
                        }
                    }
                    return;
                }
                MethodCollector.m26664o(138);
            }
        });
        this.f149404t.f41206f.setVisibility(8);
        DmtTextView endText = this.f149404t.getEndText();
        endText.setTextColor(C0643b.m2378c(endText.getContext(), R.color.a9));
        this.f149403s.setOnClickListener(this);
        this.f149403s.setText(getString(R.string.hck));
        this.f149404t.setTitle(getString(R.string.fe4));
        TextTitleBar textTitleBar3 = this.f149404t;
        if (!this.f149401q) {
            str = getString(R.string.r2);
        }
        textTitleBar3.setEndText(str);
        this.f149404t.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2.C664593 */

            static {
                Covode.recordClassIndex(77995);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                ScanQRCodeActivityV2.this.finish();
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
                if (!ScanQRCodeActivityV2.this.f149401q) {
                    C63821a aVar = ScanQRCodeActivityV2.this.f149391g;
                    if (aVar.f144680b != null) {
                        aVar.f144680b.mo102346a(2);
                    }
                }
            }
        });
        this.f149384E = QrCodeScanImpl.m118122b();
        mo105386a((AbstractC66465b) null);
        C66423c cVar = new C66423c(this, this);
        this.f149390f = cVar;
        cVar.mo105348a();
        this.f149389e = this.f149390f;
        C63821a aVar = new C63821a();
        this.f149391g = aVar;
        aVar.f144681c = this;
        this.f149391g.mo102165b(this, null);
        this.f149407w.setOnClickListener(this);
        if (C34719f.C34720a.f82009a.mo61395c()) {
            this.f149409y.setVisibility(8);
            this.f149395k = true;
        } else {
            this.f149395k = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2", "onCreate", false);
    }

    /* renamed from: a */
    public static void m118198a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C63821a aVar = this.f149391g;
        if (aVar != null) {
            aVar.mo102163a(i, i2, intent);
        }
    }
}
