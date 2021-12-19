package com.p2082ss.android.ugc.aweme.tools.music.aichoosemusic;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c */
public final class C78724c {

    /* renamed from: a */
    public AbstractC31071f f176913a;

    /* renamed from: b */
    public AbstractC78725a f176914b;

    /* renamed from: c */
    public final Handler f176915c;

    /* renamed from: d */
    public long f176916d = 100;

    /* renamed from: e */
    public final RunnableC78726b f176917e;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c$a */
    public interface AbstractC78725a {
        static {
            Covode.recordClassIndex(91868);
        }
    }

    static {
        Covode.recordClassIndex(91867);
    }

    /* renamed from: b */
    public final void mo122576b() {
        this.f176915c.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo122575a() {
        this.f176915c.removeCallbacksAndMessages(null);
        this.f176915c.postDelayed(this.f176917e, this.f176916d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.music.aichoosemusic.c$b */
    public static final class RunnableC78726b implements Runnable {

        /* renamed from: a */
        public WeakReference<C78724c> f176918a;

        /* renamed from: b */
        public final Handler f176919b;

        static {
            Covode.recordClassIndex(91869);
        }

        public final void run() {
            AbstractC31071f fVar;
            C78724c cVar = this.f176918a.get();
            if (cVar != null) {
                if (!(cVar.f176914b == null || (fVar = cVar.f176913a) == null)) {
                    fVar.mo56370k();
                }
                this.f176919b.postDelayed(this, cVar.f176916d);
            }
        }

        public RunnableC78726b(C78724c cVar, Handler handler) {
            C89219l.m154721d(cVar, "");
            C89219l.m154721d(handler, "");
            this.f176919b = handler;
            this.f176918a = new WeakReference<>(cVar);
        }
    }

    public C78724c() {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f176915c = handler;
        this.f176917e = new RunnableC78726b(this, handler);
    }
}
