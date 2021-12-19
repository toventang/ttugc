package com.bytedance.common.p900c;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.common.c.b */
public final class C13501b {

    /* renamed from: a */
    public static C13502a f32887a = new C13503b((byte) 0);

    /* renamed from: com.bytedance.common.c.b$a */
    public static class C13502a {
        static {
            Covode.recordClassIndex(15510);
        }

        /* renamed from: a */
        public String mo21775a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo21776a(WebSettings webSettings, boolean z) {
        }

        private C13502a() {
        }

        /* synthetic */ C13502a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.common.c.b$b */
    static class C13503b extends C13502a {
        static {
            Covode.recordClassIndex(15511);
        }

        private C13503b() {
            super((byte) 0);
        }

        /* synthetic */ C13503b(byte b) {
            this();
        }

        @Override // com.bytedance.common.p900c.C13501b.C13502a
        /* renamed from: a */
        public final String mo21775a(Context context) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.bytedance.common.p900c.C13501b.C13502a
        /* renamed from: a */
        public final void mo21776a(WebSettings webSettings, boolean z) {
            try {
                webSettings.setMediaPlaybackRequiresUserGesture(z);
            } catch (Throwable unused) {
            }
        }
    }

    static {
        Covode.recordClassIndex(15509);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m24283a(WebSettings webSettings, boolean z) {
        f32887a.mo21776a(webSettings, z);
    }
}
