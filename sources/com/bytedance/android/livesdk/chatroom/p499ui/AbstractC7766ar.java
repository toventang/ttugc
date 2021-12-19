package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Activity;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.model.C7686f;
import com.bytedance.android.livesdk.event.C8448b;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ar */
public interface AbstractC7766ar {

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ar$a */
    public interface AbstractC7767a {
        static {
            Covode.recordClassIndex(8562);
        }

        /* renamed from: a */
        boolean mo14042a();

        /* renamed from: b */
        void mo14043b();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ar$b */
    public interface AbstractC7768b {
        static {
            Covode.recordClassIndex(8563);
        }

        /* renamed from: a */
        void mo14044a();

        /* renamed from: a */
        void mo14045a(C7686f fVar);

        /* renamed from: a */
        void mo14046a(String str, boolean z, int i);

        /* renamed from: a */
        void mo14047a(List<? extends EmoteModel> list);

        /* renamed from: b */
        void mo14048b();
    }

    static {
        Covode.recordClassIndex(8561);
    }

    /* renamed from: a */
    void mo14034a();

    /* renamed from: a */
    void mo14035a(Activity activity, String str);

    /* renamed from: a */
    void mo14036a(AbstractC7768b bVar);

    /* renamed from: a */
    void mo14037a(C8448b bVar);

    /* renamed from: a */
    void mo14038a(String str);

    /* renamed from: a */
    void mo14039a(boolean z);

    /* renamed from: b */
    void mo14040b();

    void dismissAllowingStateLoss();
}
