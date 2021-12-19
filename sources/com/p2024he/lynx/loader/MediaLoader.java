package com.p2024he.lynx.loader;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

/* renamed from: com.he.lynx.loader.MediaLoader */
public interface MediaLoader {

    /* renamed from: com.he.lynx.loader.MediaLoader$RequestParams */
    public static class RequestParams {
        public boolean audio;
        public boolean effect;
        public FacingMode facingMode = FacingMode.USER;
        public boolean video;

        static {
            Covode.recordClassIndex(33789);
        }
    }

    /* renamed from: com.he.lynx.loader.MediaLoader$Responder */
    public interface Responder {
        static {
            Covode.recordClassIndex(33790);
        }

        void onResponse(boolean z);
    }

    static {
        Covode.recordClassIndex(33787);
    }

    Uri loadMedia(String str);

    void onRequest(RequestParams requestParams, Responder responder);

    /* renamed from: com.he.lynx.loader.MediaLoader$FacingMode */
    public enum FacingMode {
        USER,
        ENVIRONMENT;

        static {
            Covode.recordClassIndex(33788);
        }
    }
}
