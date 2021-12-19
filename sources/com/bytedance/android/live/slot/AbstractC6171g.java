package com.bytedance.android.live.slot;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.slot.g */
public abstract class AbstractC6171g implements AbstractC6162ae {

    /* renamed from: b */
    public static final C6172a f15410b = new C6172a((byte) 0);

    /* renamed from: a */
    public boolean f15411a;

    /* renamed from: c */
    private final Handler f15412c;

    /* renamed from: d */
    private final Runnable f15413d;

    /* renamed from: e */
    private final long f15414e;

    static {
        Covode.recordClassIndex(6877);
    }

    /* renamed from: a */
    public abstract void mo12084a(String str);

    /* renamed from: com.bytedance.android.live.slot.g$a */
    public static final class C6172a {
        static {
            Covode.recordClassIndex(6878);
        }

        private C6172a() {
        }

        public /* synthetic */ C6172a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.slot.g$b */
    static final class RunnableC6173b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC6171g f15415a;

        static {
            Covode.recordClassIndex(6879);
        }

        RunnableC6173b(AbstractC6171g gVar) {
            this.f15415a = gVar;
        }

        public final void run() {
            this.f15415a.f15411a = true;
        }
    }

    public AbstractC6171g() {
        this.f15414e = 300;
        this.f15411a = true;
        this.f15412c = new Handler(Looper.getMainLooper());
        this.f15413d = new RunnableC6173b(this);
    }

    public /* synthetic */ AbstractC6171g(byte b) {
        this();
    }

    @Override // com.bytedance.android.live.slot.AbstractC6162ae
    /* renamed from: a */
    public final void mo12082a(View view, String str) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        if (this.f15411a) {
            this.f15411a = false;
            this.f15412c.postDelayed(this.f15413d, this.f15414e);
            mo12084a(str);
        }
    }
}
