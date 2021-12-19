package com.p2082ss.ttvideoengine.p4412f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4418k.C86557i;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.ttvideoengine.f.d */
public final class C86433d {

    /* renamed from: a */
    Handler f193791a;

    /* renamed from: b */
    public boolean f193792b;

    /* renamed from: c */
    public String f193793c = "";

    /* renamed from: d */
    public AbstractC86435a f193794d;

    /* renamed from: e */
    public AbstractC86561j f193795e;

    /* renamed from: f */
    private Context f193796f;

    /* renamed from: com.ss.ttvideoengine.f.d$a */
    public interface AbstractC86435a {
        static {
            Covode.recordClassIndex(101663);
        }

        /* renamed from: a */
        void mo137299a();

        /* renamed from: a */
        void mo137300a(String str, C86633c cVar);
    }

    static {
        Covode.recordClassIndex(101661);
    }

    /* renamed from: a */
    public final void mo137466a(C86633c cVar) {
        this.f193791a.sendMessage(this.f193791a.obtainMessage(1, cVar));
    }

    /* renamed from: com.ss.ttvideoengine.f.d$b */
    static class HandlerC86436b extends Handler {

        /* renamed from: a */
        private final WeakReference<C86433d> f193798a;

        static {
            Covode.recordClassIndex(101664);
        }

        public final void handleMessage(Message message) {
            AbstractC86435a aVar;
            C86433d dVar = this.f193798a.get();
            if (dVar != null && (aVar = dVar.f193794d) != null) {
                if (dVar.f193792b) {
                    aVar.mo137299a();
                    return;
                }
                int i = message.what;
                if (i == 1) {
                    aVar.mo137300a(null, (C86633c) message.obj);
                } else if (i == 2) {
                    aVar.mo137300a((String) message.obj, null);
                }
            }
        }

        public HandlerC86436b(C86433d dVar, Looper looper) {
            super(looper);
            this.f193798a = new WeakReference<>(dVar);
        }
    }

    public C86433d(Context context, AbstractC86561j jVar) {
        this.f193796f = context;
        this.f193791a = new HandlerC86436b(this, C86640h.m150077a());
        if (jVar == null) {
            this.f193795e = new C86557i();
        } else {
            this.f193795e = jVar;
        }
    }
}
