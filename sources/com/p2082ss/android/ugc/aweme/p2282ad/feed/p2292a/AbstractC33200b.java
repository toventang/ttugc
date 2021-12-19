package com.p2082ss.android.ugc.aweme.p2282ad.feed.p2292a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.a.b */
public abstract class AbstractC33200b {

    /* renamed from: a */
    public static boolean f78893a;

    /* renamed from: b */
    public static boolean f78894b;

    /* renamed from: c */
    public static final C33201a f78895c = new C33201a((byte) 0);

    static {
        Covode.recordClassIndex(40023);
    }

    /* renamed from: a */
    public abstract long mo59124a();

    /* renamed from: a */
    public abstract void mo59125a(Aweme aweme, boolean z);

    /* renamed from: a */
    public abstract void mo59126a(boolean z);

    /* renamed from: a */
    public abstract boolean mo59127a(Aweme aweme);

    /* renamed from: a */
    public abstract boolean mo59128a(Aweme aweme, int i);

    /* renamed from: b */
    public abstract void mo59129b();

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.a.b$a */
    public static final class C33201a {
        static {
            Covode.recordClassIndex(40024);
        }

        private C33201a() {
        }

        public /* synthetic */ C33201a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m68064a(Aweme aweme) {
            AwemeRawAd awemeRawAd;
            if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.isEnableVideoResume()) {
                return false;
            }
            return true;
        }
    }
}
