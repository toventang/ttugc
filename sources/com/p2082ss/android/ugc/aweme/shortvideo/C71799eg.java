package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttuploader.TTVideoUploader;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.eg */
public final class C71799eg {

    /* renamed from: a */
    public static AbstractC71800a f160907a = new C71801b((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.eg$a */
    public interface AbstractC71800a {
        static {
            Covode.recordClassIndex(84345);
        }

        /* renamed from: a */
        void mo113452a(TTVideoUploader tTVideoUploader, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.eg$b */
    static class C71801b implements AbstractC71800a {
        static {
            Covode.recordClassIndex(84346);
        }

        private C71801b() {
        }

        /* synthetic */ C71801b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.C71799eg.AbstractC71800a
        /* renamed from: a */
        public final void mo113452a(TTVideoUploader tTVideoUploader, int i) {
            tTVideoUploader.setEnableHttps(i);
        }
    }

    static {
        Covode.recordClassIndex(84344);
    }
}
