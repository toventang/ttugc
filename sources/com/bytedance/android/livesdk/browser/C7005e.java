package com.bytedance.android.livesdk.browser;

import android.app.Activity;
import com.bytedance.android.live.p176b.AbstractC2937k;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.e */
public final class C7005e implements AbstractC2937k {

    /* renamed from: b */
    public static final C7006a f17589b = new C7006a((byte) 0);

    /* renamed from: a */
    public final Map<String, WeakReference<Activity>> f17590a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(7744);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.e$a */
    public static final class C7006a {
        static {
            Covode.recordClassIndex(7745);
        }

        private C7006a() {
        }

        public /* synthetic */ C7006a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.browser.e$b */
    public static final class C7007b {

        /* renamed from: a */
        public static final C7005e f17591a = new C7005e();

        /* renamed from: b */
        public static final C7007b f17592b = new C7007b();

        private C7007b() {
        }

        static {
            Covode.recordClassIndex(7746);
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2937k
    /* renamed from: a */
    public final void mo7678a(String str, Activity activity) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(activity, "");
        this.f17590a.put(str, new WeakReference<>(activity));
    }
}
