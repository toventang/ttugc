package com.p2082ss.android.ugc.aweme.sec;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.sec.AbstractC67826d;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sec.f */
public class C67829f<T> extends AbstractC67826d.C67827a<T> {

    /* renamed from: c */
    public boolean f152024c;

    /* renamed from: d */
    public boolean f152025d;

    /* renamed from: e */
    public final Object f152026e = new Object();

    /* renamed from: f */
    public JSONObject f152027f;

    static {
        Covode.recordClassIndex(79490);
    }

    @Override // com.p2082ss.android.ugc.aweme.sec.AbstractC67826d.C67827a, com.p2082ss.android.ugc.aweme.sec.AbstractC67826d
    /* renamed from: a */
    public T mo95562a() {
        if (this.f152023b == null) {
            return null;
        }
        return (T) this.f152023b.mo95562a();
    }

    @Override // com.p2082ss.android.ugc.aweme.sec.AbstractC67826d.C67827a, com.p2082ss.android.ugc.aweme.sec.AbstractC67826d
    /* renamed from: b */
    public T mo95563b() {
        if (this.f152023b == null) {
            return null;
        }
        return (T) this.f152023b.mo95563b();
    }

    @Override // com.p2082ss.android.ugc.aweme.sec.AbstractC67826d.C67827a
    /* renamed from: c */
    public final T mo106932c() {
        return this.f152024c ? (T) mo95563b() : (T) mo95562a();
    }

    /* renamed from: a */
    public final boolean mo106934a(int i) {
        MethodCollector.m26663i(4898);
        Activity j = C17873f.m33102j();
        if (j == null || !SecApiImpl.m119993a().needVerifyImage(i)) {
            MethodCollector.m26664o(4898);
            return false;
        }
        SecApiImpl.m119993a().popCaptcha(j, i, new C67837a() {
            /* class com.p2082ss.android.ugc.aweme.sec.C67829f.C678301 */

            static {
                Covode.recordClassIndex(79491);
            }

            @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
            /* renamed from: a */
            public final void mo61882a(boolean z, int i) {
                MethodCollector.m26663i(3550);
                C67829f.this.f152024c = z;
                C67829f.this.f152025d = true;
                synchronized (C67829f.this.f152026e) {
                    try {
                        C67829f.this.f152026e.notifyAll();
                    } finally {
                        MethodCollector.m26664o(3550);
                    }
                }
            }
        });
        synchronized (this.f152026e) {
            int i2 = 4;
            while (!this.f152025d) {
                try {
                    int i3 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    this.f152026e.wait(50000);
                    i2 = i3;
                } catch (Throwable th) {
                    MethodCollector.m26664o(4898);
                    throw th;
                }
            }
            this.f152026e.notifyAll();
        }
        MethodCollector.m26664o(4898);
        return true;
    }

    /* renamed from: a */
    public final boolean mo106935a(String str) {
        MethodCollector.m26663i(4902);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(4902);
            return false;
        }
        Activity j = C17873f.m33102j();
        if (j == null) {
            MethodCollector.m26664o(4902);
            return false;
        }
        int i = 4;
        SecApiImpl.m119993a().popCaptchaV2(j, str, new C67837a() {
            /* class com.p2082ss.android.ugc.aweme.sec.C67829f.C678312 */

            static {
                Covode.recordClassIndex(79492);
            }

            @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
            /* renamed from: a */
            public final void mo61882a(boolean z, int i) {
                MethodCollector.m26663i(3534);
                C67829f.this.f152024c = z;
                C67829f.this.f152025d = true;
                synchronized (C67829f.this.f152026e) {
                    try {
                        C67829f.this.f152026e.notifyAll();
                    } finally {
                        MethodCollector.m26664o(3534);
                    }
                }
            }
        });
        synchronized (this.f152026e) {
            while (!this.f152025d) {
                try {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    this.f152026e.wait(50000);
                    i = i2;
                } catch (Throwable th) {
                    MethodCollector.m26664o(4902);
                    throw th;
                }
            }
            this.f152026e.notifyAll();
        }
        MethodCollector.m26664o(4902);
        return true;
    }
}
