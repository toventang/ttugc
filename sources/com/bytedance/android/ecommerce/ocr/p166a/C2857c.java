package com.bytedance.android.ecommerce.ocr.p166a;

import android.content.Context;
import android.hardware.Camera;
import android.os.SystemClock;
import com.bytedance.android.ecommerce.ocr.view.C2901f;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.ecommerce.ocr.a.c */
public final class C2857c {

    /* renamed from: a */
    public Camera f8491a;

    /* renamed from: b */
    Camera.CameraInfo f8492b;

    /* renamed from: c */
    public C2842a f8493c;

    /* renamed from: d */
    boolean f8494d;

    /* renamed from: e */
    public C2860d f8495e = new C2860d();

    /* renamed from: f */
    public C2865h f8496f;

    /* renamed from: g */
    C2871m f8497g;

    /* renamed from: h */
    public C2871m f8498h;

    /* renamed from: i */
    public int f8499i = -1;

    /* renamed from: j */
    public AbstractC2859b f8500j;

    /* renamed from: k */
    public long f8501k;

    /* renamed from: l */
    float f8502l = 1.0f;

    /* renamed from: m */
    final C2858a f8503m;

    /* renamed from: n */
    private String f8504n;

    /* renamed from: o */
    private Context f8505o;

    /* renamed from: p */
    private int f8506p = 10;

    /* renamed from: com.bytedance.android.ecommerce.ocr.a.c$b */
    public interface AbstractC2859b {
        static {
            Covode.recordClassIndex(3285);
        }
    }

    static {
        Covode.recordClassIndex(3283);
    }

    /* renamed from: a */
    public final boolean mo7453a() {
        int i = this.f8499i;
        if (i == -1) {
            throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
        } else if (i % LiveFeedRefreshTimeSetting.DEFAULT != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: com.bytedance.android.ecommerce.ocr.a.c$a */
    final class C2858a implements Camera.PreviewCallback {

        /* renamed from: a */
        public AbstractC2868k f8507a;

        /* renamed from: b */
        public C2871m f8508b;

        static {
            Covode.recordClassIndex(3284);
        }

        public C2858a() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            C2871m mVar = this.f8508b;
            AbstractC2868k kVar = this.f8507a;
            if (mVar != null) {
                if (kVar == null) {
                    return;
                }
                if (bArr != null) {
                    try {
                        kVar.mo7460a(new C2901f(bArr, mVar.f8535a, mVar.f8536b));
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - C2857c.this.f8501k >= 200) {
                            C2857c.this.f8501k = elapsedRealtime;
                        }
                    } catch (Throwable unused) {
                        new Exception("parse data error");
                        kVar.mo7459a();
                    }
                } else {
                    throw new NullPointerException("No preview data received");
                }
            } else if (kVar != null) {
                new Exception("No resolution available");
                kVar.mo7459a();
            }
        }
    }

    public C2857c(Context context) {
        this.f8505o = context;
        this.f8503m = new C2858a();
    }

    /* renamed from: a */
    public final void mo7451a(int i) {
        Camera camera = this.f8491a;
        if (camera != null) {
            Camera.Parameters parameters = camera.getParameters();
            if (i >= 0 && i < parameters.getMaxZoom()) {
                C2842a aVar = this.f8493c;
                if (aVar != null) {
                    aVar.mo7427d();
                }
                if (parameters.isSmoothZoomSupported()) {
                    this.f8491a.startSmoothZoom(i);
                } else {
                    int zoom = this.f8491a.getParameters().getZoom();
                    if (zoom < i) {
                        while (zoom <= i) {
                            parameters.setZoom(zoom);
                            this.f8491a.setParameters(parameters);
                            zoom++;
                        }
                    } else if (zoom > i) {
                        while (zoom >= i) {
                            parameters.setZoom(zoom);
                            this.f8491a.setParameters(parameters);
                            zoom--;
                        }
                    }
                }
                C2842a aVar2 = this.f8493c;
                if (aVar2 != null) {
                    aVar2.mo7425b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        if (r1.equals(r4.getFocusMode()) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r4.setFocusMode(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r9 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.C2878a.m8165a(r4, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r8.f8495e.f8511b == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if ("negative".equals(r4.getColorEffect()) != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r0 = com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.C2878a.m8162a(r4.getSupportedColorEffects(), "negative");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r0 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r4.setColorEffect(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (r8.f8495e.f8512c == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        if ("barcode".equals(r4.getSceneMode()) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        r0 = com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.C2878a.m8162a(r4.getSupportedSceneModes(), "barcode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008f, code lost:
        if (r0 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r4.setSceneMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0098, code lost:
        if (r8.f8495e.f8513d == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
        r0 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r4.isVideoStabilizationSupported() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r4.getVideoStabilization() != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r4.setVideoStabilization(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b2, code lost:
        if (r4.getMaxNumFocusAreas() <= 0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b4, code lost:
        r4.setFocusAreas(com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.C2878a.m8163a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        if (r4.getMaxNumMeteringAreas() <= 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c1, code lost:
        r4.setMeteringAreas(com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.C2878a.m8163a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c8, code lost:
        r0 = r4.getSupportedPreviewSizes();
        r7 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        if (r0 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d3, code lost:
        r0 = r4.getPreviewSize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if (r0 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        r7.add(new com.bytedance.android.ecommerce.ocr.p166a.C2871m(r0.width, r0.height));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (r7.size() != 0) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00eb, code lost:
        r8.f8497g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f5, code lost:
        if ("glass-1".equals(android.os.Build.DEVICE) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f7, code lost:
        com.bytedance.android.ecommerce.ocr.p168c.p169a.p170a.C2878a.m8164a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fa, code lost:
        r4.setPreviewFormat(17);
        r8.f8491a.setParameters(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0104, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        r2 = r8.f8496f;
        r1 = mo7453a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010d, code lost:
        if (r2.f8527a != null) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010f, code lost:
        r1 = r2.f8529c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0111, code lost:
        if (r3 != null) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0113, code lost:
        r0 = (com.bytedance.android.ecommerce.ocr.p166a.C2871m) r7.get(0);
        r8.f8497g = r0;
        r4.setPreviewSize(r0.f8535a, r8.f8497g.f8536b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0125, code lost:
        java.util.Collections.sort(r7, new com.bytedance.android.ecommerce.ocr.p166a.AbstractC2869l.C28701(r1, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x012e, code lost:
        if (r1 == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0130, code lost:
        r3 = r2.f8527a.mo7462a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0137, code lost:
        r3 = r2.f8527a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x013a, code lost:
        r5 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0142, code lost:
        if (r5.hasNext() == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0144, code lost:
        r0 = r5.next();
        r7.add(new com.bytedance.android.ecommerce.ocr.p166a.C2871m(r0.width, r0.height));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r9 == false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r1 == null) goto L_0x002f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7452a(boolean r9) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.ecommerce.ocr.p166a.C2857c.mo7452a(boolean):void");
    }
}
