package com.bytedance.android.livesdkapi.host;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdkapi.host.e */
public interface AbstractC11803e extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdkapi.host.e$a */
    public static class C11804a {
        static {
            Covode.recordClassIndex(13502);
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.host.e$b */
    public interface AbstractC11805b {
        static {
            Covode.recordClassIndex(13503);
        }

        /* renamed from: a */
        void mo8986a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(13501);
    }

    /* renamed from: a */
    C11804a mo18862a(ImageModel imageModel, AbstractC11805b bVar);

    /* renamed from: a */
    String mo18863a(ImageModel imageModel);
}
