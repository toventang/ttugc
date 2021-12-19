package com.p2082ss.android.socialbase.downloader.p2188j;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.socialbase.downloader.j.h */
public final class HandlerC30526h extends Handler {

    /* renamed from: a */
    private final WeakReference<AbstractC30527a> f72827a;

    /* renamed from: com.ss.android.socialbase.downloader.j.h$a */
    public interface AbstractC30527a {
        static {
            Covode.recordClassIndex(37055);
        }

        /* renamed from: a */
        void mo54275a(Message message);
    }

    static {
        Covode.recordClassIndex(37054);
    }

    public final void handleMessage(Message message) {
        AbstractC30527a aVar = this.f72827a.get();
        if (aVar != null && message != null) {
            aVar.mo54275a(message);
        }
    }

    public HandlerC30526h(Looper looper, AbstractC30527a aVar) {
        super(looper);
        this.f72827a = new WeakReference<>(aVar);
    }
}
