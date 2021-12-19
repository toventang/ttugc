package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.video.C88151a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a */
public final class C71436a {

    /* renamed from: a */
    public Handler f160055a = new Handler(Looper.myLooper()) {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.C71436a.HandlerC714382 */

        static {
            Covode.recordClassIndex(83972);
        }

        public final void handleMessage(Message message) {
            if (message.what == 2) {
                Bitmap bitmap = (Bitmap) message.getData().getParcelable("bitmap");
                String string = message.getData().getString("path");
                if (C71436a.this.f160057c != null) {
                    C71436a.this.f160057c.mo113032a(string, bitmap);
                }
            }
        }
    };

    /* renamed from: b */
    public Handler f160056b = new Handler(this.f160058d.getLooper()) {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d.C71436a.HandlerC714371 */

        static {
            Covode.recordClassIndex(83971);
        }

        public final void handleMessage(Message message) {
            if (message.what == 1) {
                String str = (String) message.obj;
                if (C80720e.m139927b(str)) {
                    C88151a.m153230a("extracting_frame", "video_clip");
                    VEUtils.getVideoFrames(str, new int[]{0}, new C71440b(this, str));
                }
            }
        }
    };

    /* renamed from: c */
    public AbstractC71439a f160057c;

    /* renamed from: d */
    private HandlerThread f160058d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.a$a */
    public interface AbstractC71439a {
        static {
            Covode.recordClassIndex(83973);
        }

        /* renamed from: a */
        void mo113032a(String str, Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(83970);
    }

    /* renamed from: a */
    public final void mo113054a() {
        if (this.f160058d != null) {
            int i = Build.VERSION.SDK_INT;
            this.f160058d.quitSafely();
        }
    }

    public C71436a() {
        HandlerThread handlerThread = new HandlerThread("multi_edit_cover_creator");
        this.f160058d = handlerThread;
        handlerThread.start();
    }
}
