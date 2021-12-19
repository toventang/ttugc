package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.ai */
public class C9522ai {
    @AbstractC27891c(mo46611a = "brightening")

    /* renamed from: a */
    public C9523a f23101a = new C9523a(0.35f);
    @AbstractC27891c(mo46611a = "beauty_skin")

    /* renamed from: b */
    public C9523a f23102b = new C9523a(0.35f);
    @AbstractC27891c(mo46611a = "big_eyes")

    /* renamed from: c */
    public C9523a f23103c = new C9523a(0.5f);
    @AbstractC27891c(mo46611a = "face_lift")

    /* renamed from: d */
    public C9523a f23104d = new C9523a(0.5f);
    @AbstractC27891c(mo46611a = "sharp")

    /* renamed from: e */
    public C9523a f23105e = new C9523a(0.05f);

    static {
        Covode.recordClassIndex(11061);
    }

    /* renamed from: com.bytedance.android.livesdk.model.ai$a */
    public class C9523a {
        @AbstractC27891c(mo46611a = "scale")

        /* renamed from: a */
        public float f23106a = 1.0f;
        @AbstractC27891c(mo46611a = "default")

        /* renamed from: b */
        public float f23107b;

        static {
            Covode.recordClassIndex(11062);
        }

        public C9523a(float f) {
            this.f23107b = f;
        }
    }
}
