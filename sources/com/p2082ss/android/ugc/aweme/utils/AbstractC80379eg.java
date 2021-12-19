package com.p2082ss.android.ugc.aweme.utils;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1203l;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.eg */
public interface AbstractC80379eg extends AbstractC1203l {

    /* renamed from: com.ss.android.ugc.aweme.utils.eg$a */
    public static final class C80380a {
        static {
            Covode.recordClassIndex(93648);
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
        public static void onCreate(AbstractC80379eg egVar) {
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
        public static void onDestroy(AbstractC80379eg egVar) {
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
        public static void onPause(AbstractC80379eg egVar) {
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
        public static void onResume(AbstractC80379eg egVar) {
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
        public static void onStart(AbstractC80379eg egVar) {
        }

        @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
        public static void onStop(AbstractC80379eg egVar) {
        }
    }

    static {
        Covode.recordClassIndex(93647);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    void onCreate();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    void onDestroy();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    void onPause();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    void onResume();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    void onStart();

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    void onStop();
}
