package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.base.C87457f;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87540d;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.AbstractC87678z;
import com.ttnet.org.chromium.net.C87645j;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class CronetUrlRequest extends AbstractC87640p {

    /* renamed from: i */
    static final /* synthetic */ boolean f198723i = true;

    /* renamed from: A */
    private final int f198724A;

    /* renamed from: B */
    private int f198725B;

    /* renamed from: C */
    private int f198726C;

    /* renamed from: D */
    private AbstractC87540d f198727D;

    /* renamed from: E */
    private C87594e f198728E;

    /* renamed from: F */
    private String f198729F;

    /* renamed from: G */
    private int f198730G;

    /* renamed from: H */
    private int f198731H;

    /* renamed from: I */
    private int f198732I;

    /* renamed from: J */
    private int f198733J;

    /* renamed from: K */
    private long f198734K;

    /* renamed from: L */
    private RunnableC87571a f198735L;

    /* renamed from: M */
    private Runnable f198736M;

    /* renamed from: a */
    public long f198737a;

    /* renamed from: b */
    public boolean f198738b;

    /* renamed from: c */
    public boolean f198739c;

    /* renamed from: d */
    public final Object f198740d = new Object();

    /* renamed from: e */
    public final VersionSafeCallbacks.C87589f f198741e;

    /* renamed from: f */
    public final VersionSafeCallbacks.C87587d f198742f;

    /* renamed from: g */
    public CronetUploadDataStream f198743g;

    /* renamed from: h */
    public C87642r f198744h;

    /* renamed from: j */
    private final boolean f198745j;

    /* renamed from: k */
    private boolean f198746k;

    /* renamed from: l */
    private final CronetUrlRequestContext f198747l;

    /* renamed from: m */
    private final Executor f198748m;

    /* renamed from: n */
    private final List<String> f198749n;

    /* renamed from: o */
    private final String f198750o;

    /* renamed from: p */
    private final int f198751p;

    /* renamed from: q */
    private String f198752q;

    /* renamed from: r */
    private final HeadersList f198753r;

    /* renamed from: t */
    private String f198754t;

    /* renamed from: u */
    private final Collection<Object> f198755u;

    /* renamed from: v */
    private final boolean f198756v;

    /* renamed from: w */
    private final boolean f198757w;

    /* renamed from: x */
    private final boolean f198758x;

    /* renamed from: y */
    private final int f198759y;

    /* renamed from: z */
    private final boolean f198760z;

    private native void nativeAbortWhenUploadException(long j);

    private native void nativeAddRequestCookieHeader(long j, String str, String str2);

    private native boolean nativeAddRequestHeader(long j, String str, String str2);

    private native void nativeAppTimeout(long j);

    private native long nativeCreateRequestAdapter(long j, String str, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4);

    private native void nativeDestroy(long j, boolean z);

    private native void nativeFollowDeferredRedirect(long j);

    private native void nativeGetStatus(long j, VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener);

    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeRemoveRequestCookieHeader(long j);

    private native boolean nativeSetHttpMethod(long j, String str);

    private native void nativeSetRequestTimeout(long j, int i);

    private native void nativeSetSocketTimeout(long j, int i, int i2, int i3);

    private native void nativeSetThrottleNetSpeed(long j, long j2);

    private native void nativeStart(long j);

    private native void nativeStopRedirect(long j);

    /* access modifiers changed from: package-private */
    public static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
        static {
            Covode.recordClassIndex(103541);
        }

        private HeadersList() {
        }

        /* synthetic */ HeadersList(byte b) {
            this();
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: e */
    public final String mo141694e() {
        return this.f198729F;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141690a(ByteBuffer byteBuffer) {
        MethodCollector.m26663i(4172);
        C87635k.m152364b(byteBuffer);
        C87635k.m152363a(byteBuffer);
        synchronized (this.f198740d) {
            try {
                if (this.f198739c) {
                    this.f198739c = false;
                    if (!mo141865h()) {
                        if (nativeReadData(this.f198737a, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                            MethodCollector.m26664o(4172);
                            return;
                        }
                        this.f198739c = true;
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to call native read");
                        MethodCollector.m26664o(4172);
                        throw illegalArgumentException;
                    }
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Unexpected read attempt.");
                MethodCollector.m26664o(4172);
                throw illegalStateException;
            } finally {
                MethodCollector.m26664o(4172);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141689a(String str, String str2) {
        MethodCollector.m26663i(4184);
        synchronized (this.f198740d) {
            try {
                long j = this.f198737a;
                if (j != 0) {
                    nativeAddRequestCookieHeader(j, str, str2);
                    MethodCollector.m26664o(4184);
                }
            } finally {
                MethodCollector.m26664o(4184);
            }
        }
    }

    /* renamed from: a */
    public final void mo141855a(Exception exc) {
        C87591b bVar = new C87591b("Exception received from UrlRequest.Callback", exc);
        C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in CalledByNative method", exc);
        m152163a((AbstractC87540d) bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo141857a(Throwable th) {
        MethodCollector.m26663i(4331);
        C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in upload method", th);
        synchronized (this.f198740d) {
            try {
                long j = this.f198737a;
                if (j != 0) {
                    nativeAbortWhenUploadException(j);
                    MethodCollector.m26664o(4331);
                }
            } finally {
                MethodCollector.m26664o(4331);
            }
        }
    }

    static {
        Covode.recordClassIndex(103530);
    }

    private void onCanceled() {
        C87595f.m152308a(this.f198754t);
        m152164a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875698 */

            static {
                Covode.recordClassIndex(103539);
            }

            public final void run() {
                try {
                    VersionSafeCallbacks.C87589f fVar = CronetUrlRequest.this.f198741e;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    fVar.mo141706b(cronetUrlRequest, cronetUrlRequest.f198744h);
                    CronetUrlRequest.this.mo141867j();
                } catch (Exception e) {
                    C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in onCanceled method", e);
                }
            }
        });
    }

    /* renamed from: h */
    public final boolean mo141865h() {
        if (!this.f198746k || this.f198737a != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private AbstractC87655t m152166l() {
        return new C87637m(this.f198750o, this.f198755u, this.f198728E, this.f198726C, this.f198744h, this.f198727D);
    }

    /* renamed from: g */
    public final void mo141864g() {
        MethodCollector.m26663i(4161);
        String str = this.f198754t;
        if (str != null) {
            C87595f.m152309a(str, this);
        }
        nativeStart(this.f198737a);
        MethodCollector.m26664o(4161);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo141866i() {
        if (!this.f198745j && this.f198747l.mo141884a(Thread.currentThread())) {
            throw new C87645j();
        }
    }

    /* renamed from: k */
    private void m152165k() {
        MethodCollector.m26663i(4318);
        synchronized (this.f198740d) {
            try {
                if (this.f198746k || mo141865h()) {
                    IllegalStateException illegalStateException = new IllegalStateException("Request is already started.");
                    MethodCollector.m26664o(4318);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.m26664o(4318);
            }
        }
    }

    private void onNativeAdapterDestroyed() {
        MethodCollector.m26663i(4522);
        synchronized (this.f198740d) {
            try {
                Runnable runnable = this.f198736M;
                if (runnable != null) {
                    runnable.run();
                }
                if (this.f198727D != null) {
                    MethodCollector.m26664o(4522);
                }
            } finally {
                MethodCollector.m26664o(4522);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: b */
    public final void mo141691b() {
        MethodCollector.m26663i(4162);
        synchronized (this.f198740d) {
            try {
                if (this.f198738b) {
                    this.f198738b = false;
                    if (!mo141865h()) {
                        nativeFollowDeferredRedirect(this.f198737a);
                        MethodCollector.m26664o(4162);
                        return;
                    }
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException("No redirect to follow.");
                MethodCollector.m26664o(4162);
                throw illegalStateException;
            } finally {
                MethodCollector.m26664o(4162);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: c */
    public final void mo141692c() {
        MethodCollector.m26663i(4175);
        synchronized (this.f198740d) {
            try {
                if (!mo141865h() && this.f198746k) {
                    mo141863f(2);
                    MethodCollector.m26664o(4175);
                }
            } finally {
                MethodCollector.m26664o(4175);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: d */
    public final void mo141693d() {
        MethodCollector.m26663i(4187);
        C87595f.m152308a(this.f198754t);
        synchronized (this.f198740d) {
            try {
                long j = this.f198737a;
                if (j != 0) {
                    nativeAppTimeout(j);
                    MethodCollector.m26664o(4187);
                }
            } finally {
                MethodCollector.m26664o(4187);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: f */
    public final void mo141695f() {
        MethodCollector.m26663i(4185);
        synchronized (this.f198740d) {
            try {
                long j = this.f198737a;
                if (j != 0) {
                    nativeRemoveRequestCookieHeader(j);
                    MethodCollector.m26664o(4185);
                }
            } finally {
                MethodCollector.m26664o(4185);
            }
        }
    }

    /* renamed from: j */
    public final void mo141867j() {
        if (this.f198728E != null) {
            final C87637m mVar = new C87637m(this.f198750o, this.f198755u, this.f198728E, this.f198726C, this.f198744h, this.f198727D);
            this.f198747l.mo141883a(mVar);
            VersionSafeCallbacks.C87587d dVar = this.f198742f;
            if (dVar != null) {
                try {
                    dVar.getExecutor().execute(new Runnable() {
                        /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875632 */

                        static {
                            Covode.recordClassIndex(103533);
                        }

                        public final void run() {
                            CronetUrlRequest.this.f198742f.onRequestFinished(mVar);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception posting task to executor", e);
                }
            }
        }
    }

    /* renamed from: com.ttnet.org.chromium.net.impl.CronetUrlRequest$a */
    final class RunnableC87571a implements Runnable {

        /* renamed from: a */
        ByteBuffer f198780a;

        static {
            Covode.recordClassIndex(103542);
        }

        public final void run() {
            MethodCollector.m26663i(7238);
            CronetUrlRequest.this.mo141866i();
            ByteBuffer byteBuffer = this.f198780a;
            this.f198780a = null;
            try {
                synchronized (CronetUrlRequest.this.f198740d) {
                    try {
                        if (!CronetUrlRequest.this.mo141865h()) {
                            CronetUrlRequest.this.f198739c = true;
                            VersionSafeCallbacks.C87589f fVar = CronetUrlRequest.this.f198741e;
                            CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                            fVar.mo141703a(cronetUrlRequest, cronetUrlRequest.f198744h, byteBuffer);
                            MethodCollector.m26664o(7238);
                        }
                    } finally {
                        MethodCollector.m26664o(7238);
                    }
                }
            } catch (Exception e) {
                CronetUrlRequest.this.mo141855a(e);
                MethodCollector.m26664o(7238);
            }
        }

        private RunnableC87571a() {
        }

        /* synthetic */ RunnableC87571a(CronetUrlRequest cronetUrlRequest, byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[Catch:{ RuntimeException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x010e A[Catch:{ RuntimeException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0117 A[Catch:{ RuntimeException -> 0x015c }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0137  */
    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141686a() {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.impl.CronetUrlRequest.mo141686a():void");
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141687a(int i) {
        this.f198725B = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: b */
    public final void mo141858b(int i) {
        this.f198730G = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: c */
    public final void mo141860c(int i) {
        this.f198731H = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: d */
    public final void mo141861d(int i) {
        this.f198732I = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: e */
    public final void mo141862e(int i) {
        this.f198733J = i;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: a */
    public final void mo141856a(String str) {
        m152165k();
        Objects.requireNonNull(str, "Method is required.");
        this.f198752q = str;
    }

    /* renamed from: a */
    private void m152164a(Runnable runnable) {
        try {
            this.f198748m.execute(runnable);
        } catch (RejectedExecutionException e) {
            C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception posting task to executor", e);
            m152163a((AbstractC87540d) new C87593d("Exception posting task to executor", e));
        }
    }

    private void onSucceeded(long j) {
        this.f198744h.mo142019a(j);
        C87595f.m152308a(this.f198754t);
        m152164a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875687 */

            static {
                Covode.recordClassIndex(103538);
            }

            public final void run() {
                MethodCollector.m26663i(4972);
                synchronized (CronetUrlRequest.this.f198740d) {
                    try {
                        if (!CronetUrlRequest.this.mo141865h()) {
                            CronetUrlRequest.this.mo141863f(0);
                            try {
                                VersionSafeCallbacks.C87589f fVar = CronetUrlRequest.this.f198741e;
                                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                fVar.mo141700a(cronetUrlRequest, cronetUrlRequest.f198744h);
                                CronetUrlRequest.this.mo141867j();
                                MethodCollector.m26664o(4972);
                            } catch (Exception e) {
                                C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in onSucceeded method", e);
                                MethodCollector.m26664o(4972);
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(4972);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    private void m152163a(final AbstractC87540d dVar) {
        MethodCollector.m26663i(4338);
        synchronized (this.f198740d) {
            try {
                if (!mo141865h()) {
                    if (f198723i || this.f198727D == null) {
                        this.f198727D = dVar;
                        mo141863f(1);
                        try {
                            this.f198748m.execute(new Runnable() {
                                /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875654 */

                                static {
                                    Covode.recordClassIndex(103535);
                                }

                                public final void run() {
                                    try {
                                        VersionSafeCallbacks.C87589f fVar = CronetUrlRequest.this.f198741e;
                                        CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                        fVar.mo141701a(cronetUrlRequest, cronetUrlRequest.f198744h, dVar);
                                        CronetUrlRequest.this.mo141867j();
                                    } catch (Exception e) {
                                        C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in onFailed method", e);
                                    }
                                }
                            });
                            MethodCollector.m26664o(4338);
                        } catch (RejectedExecutionException e) {
                            C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception posting task to executor", e);
                            MethodCollector.m26664o(4338);
                        }
                    } else {
                        AssertionError assertionError = new AssertionError();
                        MethodCollector.m26664o(4338);
                        throw assertionError;
                    }
                }
            } finally {
                MethodCollector.m26664o(4338);
            }
        }
    }

    /* renamed from: f */
    public final void mo141863f(int i) {
        MethodCollector.m26663i(4325);
        boolean z = true;
        if (f198723i || this.f198727D == null || i == 1) {
            this.f198726C = i;
            if (this.f198737a == 0) {
                MethodCollector.m26664o(4325);
                return;
            }
            this.f198747l.mo141886i();
            long j = this.f198737a;
            if (i != 2) {
                z = false;
            }
            nativeDestroy(j, z);
            this.f198737a = 0;
            MethodCollector.m26664o(4325);
            return;
        }
        AssertionError assertionError = new AssertionError();
        MethodCollector.m26664o(4325);
        throw assertionError;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab
    /* renamed from: a */
    public final void mo141688a(long j) {
        MethodCollector.m26663i(4133);
        synchronized (this.f198740d) {
            try {
                this.f198734K = j;
                long j2 = this.f198737a;
                if (j2 != 0) {
                    nativeSetThrottleNetSpeed(j2, j);
                }
            } finally {
                MethodCollector.m26664o(4133);
            }
        }
    }

    /* renamed from: a */
    public final void mo141853a(AbstractC87529ab.AbstractC87532c cVar) {
        MethodCollector.m26663i(4182);
        final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new VersionSafeCallbacks.UrlRequestStatusListener(cVar);
        synchronized (this.f198740d) {
            try {
                long j = this.f198737a;
                if (j != 0) {
                    nativeGetStatus(j, urlRequestStatusListener);
                    return;
                }
                m152164a(new Runnable() {
                    /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875643 */

                    static {
                        Covode.recordClassIndex(103534);
                    }

                    public final void run() {
                        urlRequestStatusListener.onStatus(-1);
                    }
                });
                MethodCollector.m26664o(4182);
            } finally {
                MethodCollector.m26664o(4182);
            }
        }
    }

    private void onStatus(final VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i) {
        m152164a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875709 */

            static {
                Covode.recordClassIndex(103540);
            }

            public final void run() {
                int i;
                VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = urlRequestStatusListener;
                int i2 = i;
                if (AbstractC87640p.f199057s || (i2 >= 0 && i2 <= 15)) {
                    switch (i2) {
                        case 0:
                            i = 0;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        default:
                            throw new IllegalArgumentException("No request status found.");
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            i = 5;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            i = 6;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            i = 7;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            i = 8;
                            break;
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            i = 9;
                            break;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            i = 10;
                            break;
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            i = 11;
                            break;
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            i = 12;
                            break;
                        case ABRConfig.ABR_SELECT_SCENE:
                            i = 13;
                            break;
                        case 15:
                            i = 14;
                            break;
                    }
                    urlRequestStatusListener.onStatus(i);
                    return;
                }
                throw new AssertionError();
            }
        });
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: b */
    public final void mo141859b(String str, String str2) {
        m152165k();
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f198753r.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    private String[] addSecurityFactor(String str, String[] strArr) {
        Map<String, String> a;
        HashMap hashMap = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            hashMap.put(strArr[i2].toLowerCase(Locale.US), strArr[i2 + 1]);
        }
        CronetUrlRequestContext cronetUrlRequestContext = this.f198747l;
        if (cronetUrlRequestContext.f198792g == null || (a = cronetUrlRequestContext.f198792g.mo142025a(str, hashMap)) == null) {
            return null;
        }
        String[] strArr2 = new String[(a.size() * 2)];
        for (Map.Entry<String, String> entry : a.entrySet()) {
            strArr2[i] = entry.getKey();
            strArr2[i + 1] = entry.getValue();
            i += 2;
        }
        return strArr2;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87640p
    /* renamed from: a */
    public final void mo141854a(AbstractC87678z zVar, Executor executor) {
        Objects.requireNonNull(zVar, "Invalid UploadDataProvider.");
        if (this.f198752q == null) {
            this.f198752q = "POST";
        }
        this.f198743g = new CronetUploadDataStream(zVar, executor, this);
    }

    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.f198744h.mo142019a(j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.f198735L == null) {
                this.f198735L = new RunnableC87571a(this, (byte) 0);
            }
            byteBuffer.position(i2 + i);
            this.f198735L.f198780a = byteBuffer;
            m152164a(this.f198735L);
            return;
        }
        m152163a((AbstractC87540d) new C87593d("ByteBuffer modified externally during read", null));
    }

    private void onError(int i, int i2, int i3, String str, long j) {
        C87642r rVar = this.f198744h;
        if (rVar != null) {
            rVar.mo142019a(j);
        }
        C87595f.m152308a(this.f198754t);
        if (i == 10 || i == 3) {
            m152163a((AbstractC87540d) new C87636l("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2, i3));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                i = 5;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                i = 6;
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                i = 7;
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                i = 8;
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                i = 9;
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                i = 10;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                i = 11;
                break;
            default:
                C87457f.m151789c(CronetUrlRequestContext.f198783b, "Unknown error code: ".concat(String.valueOf(i)), new Object[0]);
                break;
        }
        m152163a((AbstractC87540d) new NetworkExceptionImpl("Exception in CronetUrlRequest: ".concat(String.valueOf(str)), i, i2));
    }

    /* renamed from: a */
    private C87642r m152162a(int i, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        HeadersList headersList = new HeadersList((byte) 0);
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new C87642r(new ArrayList(this.f198749n), i, str, headersList, z, str2, str3, j);
    }

    private void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3, long j, final String str4) {
        this.f198744h = m152162a(i, str, strArr, z, str2, str3, j);
        m152164a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875676 */

            static {
                Covode.recordClassIndex(103537);
            }

            public final void run() {
                MethodCollector.m26663i(5340);
                CronetUrlRequest.this.mo141866i();
                synchronized (CronetUrlRequest.this.f198740d) {
                    try {
                        if (!CronetUrlRequest.this.mo141865h()) {
                            CronetUrlRequest.this.f198739c = true;
                            try {
                                VersionSafeCallbacks.C87589f fVar = CronetUrlRequest.this.f198741e;
                                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                                fVar.mo141707b(cronetUrlRequest, cronetUrlRequest.f198744h, str4);
                                MethodCollector.m26664o(5340);
                            } catch (Exception e) {
                                CronetUrlRequest.this.mo141855a(e);
                                MethodCollector.m26664o(5340);
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(5340);
                    }
                }
            }
        });
    }

    private void onRedirectReceived(final String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        final C87642r a = m152162a(i, str2, strArr, z, str3, str4, j);
        this.f198749n.add(str);
        m152164a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC875665 */

            static {
                Covode.recordClassIndex(103536);
            }

            public final void run() {
                MethodCollector.m26663i(7387);
                CronetUrlRequest.this.mo141866i();
                synchronized (CronetUrlRequest.this.f198740d) {
                    try {
                        if (!CronetUrlRequest.this.mo141865h()) {
                            CronetUrlRequest.this.f198738b = true;
                            try {
                                CronetUrlRequest.this.f198741e.mo141702a(CronetUrlRequest.this, a, str);
                                MethodCollector.m26664o(7387);
                            } catch (Exception e) {
                                CronetUrlRequest.this.mo141855a(e);
                                MethodCollector.m26664o(7387);
                            }
                        }
                    } finally {
                        MethodCollector.m26664o(7387);
                    }
                }
            }
        });
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, AbstractC87529ab.AbstractC87531b bVar, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, AbstractC87655t.AbstractC87656a aVar) {
        VersionSafeCallbacks.C87587d dVar;
        ArrayList arrayList = new ArrayList();
        this.f198749n = arrayList;
        this.f198753r = new HeadersList((byte) 0);
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        this.f198745j = z3;
        this.f198747l = cronetUrlRequestContext;
        this.f198750o = str;
        arrayList.add(str);
        int i4 = 3;
        if (i == 0) {
            i4 = 1;
        } else if (i == 1) {
            i4 = 2;
        } else if (i != 2) {
            if (i == 3 || i != 4) {
                i4 = 4;
            } else {
                i4 = 5;
            }
        }
        this.f198751p = i4;
        this.f198741e = new VersionSafeCallbacks.C87589f(bVar);
        this.f198748m = executor;
        this.f198755u = collection;
        this.f198756v = z;
        this.f198757w = z2;
        this.f198758x = z4;
        this.f198759y = i2;
        this.f198760z = z5;
        this.f198724A = i3;
        if (aVar != null) {
            dVar = new VersionSafeCallbacks.C87587d(aVar);
        } else {
            dVar = null;
        }
        this.f198742f = dVar;
    }

    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, long j16, String str, long j17, long j18, String str2, String str3, String str4) {
        MethodCollector.m26663i(4384);
        synchronized (this.f198740d) {
            try {
                if (this.f198728E == null) {
                    this.f198728E = new C87594e(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, j16, str, j17, j18, str2, str3);
                    this.f198729F = str4;
                    this.f198741e.mo141705a(str4, m152166l());
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Metrics collection should only happen once.");
                    MethodCollector.m26664o(4384);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.m26664o(4384);
                throw th;
            }
        }
        final AbstractC87655t l = m152166l();
        m152164a(new Runnable() {
            /* class com.ttnet.org.chromium.net.impl.CronetUrlRequest.RunnableC8756210 */

            static {
                Covode.recordClassIndex(103532);
            }

            public final void run() {
                try {
                    CronetUrlRequest.this.f198741e.mo141704a(CronetUrlRequest.this, l);
                } catch (Exception e) {
                    C87457f.m151789c(CronetUrlRequestContext.f198783b, "Exception in onMetricsCollected method", e);
                }
            }
        });
        this.f198747l.mo141883a(l);
        MethodCollector.m26664o(4384);
    }
}
