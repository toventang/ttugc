package com.p2082ss.android.socialbase.downloader.p2188j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.socialbase.downloader.j.e */
public final class C30519e implements Handler.Callback {

    /* renamed from: a */
    private volatile Handler f72817a = new Handler(C30520a.f72818a, this);

    /* renamed from: com.ss.android.socialbase.downloader.j.e$b */
    public interface AbstractC30521b {
        static {
            Covode.recordClassIndex(37049);
        }

        /* renamed from: a */
        long mo54360a();
    }

    static {
        Covode.recordClassIndex(37047);
    }

    /* renamed from: a */
    public final void mo54357a() {
        Handler handler = this.f72817a;
        if (handler != null) {
            this.f72817a = null;
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: com.ss.android.socialbase.downloader.j.e$a */
    public static class C30520a {

        /* renamed from: a */
        public static final Looper f72818a;

        static {
            Covode.recordClassIndex(37048);
            HandlerThread handlerThread = new HandlerThread("DownloadWatchDog");
            handlerThread.start();
            f72818a = handlerThread.getLooper();
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return true;
        }
        try {
            AbstractC30521b bVar = (AbstractC30521b) message.obj;
            long a = bVar.mo54360a();
            if (a <= 0) {
                return true;
            }
            mo54358a(bVar, a);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final void mo54358a(AbstractC30521b bVar, long j) {
        Handler handler = this.f72817a;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = bVar;
            handler.sendMessageDelayed(obtain, j);
        }
    }
}
