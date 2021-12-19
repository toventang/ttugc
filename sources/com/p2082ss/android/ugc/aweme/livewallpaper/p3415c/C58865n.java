package com.p2082ss.android.ugc.aweme.livewallpaper.p3415c;

import android.opengl.GLES20;
import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.n */
public class C58865n implements AbstractC58858h {

    /* renamed from: a */
    protected AbstractC58867b f134001a;

    /* renamed from: b */
    private int f134002b;

    /* renamed from: c */
    private int f134003c;

    /* renamed from: d */
    private int f134004d;

    /* renamed from: e */
    private int f134005e;

    /* renamed from: f */
    private AbstractC58857g f134006f = new C58864m();

    /* renamed from: g */
    private ReentrantLock f134007g = new ReentrantLock();

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.n$b */
    public interface AbstractC58867b {
        static {
            Covode.recordClassIndex(69181);
        }

        /* renamed from: a */
        void mo96297a(AbstractC58858h hVar);
    }

    static {
        Covode.recordClassIndex(69179);
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58857g
    /* renamed from: a */
    public final int mo96278a() {
        return this.f134006f.mo96278a();
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58858h
    /* renamed from: d */
    public final void mo96281d() {
        this.f134007g.unlock();
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58858h
    /* renamed from: c */
    public final int mo96280c() {
        if (!this.f134007g.isHeldByCurrentThread()) {
            this.f134007g.lock();
            return this.f134002b;
        }
        throw new AndroidRuntimeException("Dead lock!!");
    }

    @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.AbstractC58857g
    /* renamed from: b */
    public final int mo96279b() {
        int b = this.f134006f.mo96279b();
        if (b == 1) {
            this.f134001a.mo96297a(this);
            return 0;
        } else if (b > 0) {
            return 0;
        } else {
            throw new RuntimeException(new Exception("reference idx " + (b - 1) + " app abort!!"));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo96296e() {
        mo96280c();
        int i = this.f134002b;
        if (i > 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        int i2 = this.f134003c;
        if (i2 > 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        }
        this.f134003c = 0;
        this.f134002b = 0;
        this.f134001a = new C58866a(this, (byte) 0);
        this.f134007g.unlock();
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.c.n$a */
    class C58866a implements AbstractC58867b {
        static {
            Covode.recordClassIndex(69180);
        }

        private C58866a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.livewallpaper.p3415c.C58865n.AbstractC58867b
        /* renamed from: a */
        public final void mo96297a(AbstractC58858h hVar) {
            C58865n.this.f134001a = null;
        }

        /* synthetic */ C58866a(C58865n nVar, byte b) {
            this();
        }
    }

    public C58865n(int i, int i2, int i3, AbstractC58867b bVar) {
        this.f134002b = i;
        this.f134004d = i2;
        this.f134005e = i3;
        this.f134001a = bVar == null ? new C58866a(this, (byte) 0) : bVar;
    }
}
