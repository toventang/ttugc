package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ttnet.org.chromium.net.urlconnection.f */
public class ExecutorC87668f implements Executor {

    /* renamed from: c */
    static final /* synthetic */ boolean f199159c = true;

    /* renamed from: h */
    private static final AtomicBoolean f199160h = new AtomicBoolean(false);

    /* renamed from: a */
    public boolean f199161a;

    /* renamed from: b */
    public boolean f199162b;

    /* renamed from: d */
    private final BlockingQueue<Runnable> f199163d = new LinkedBlockingQueue();

    /* renamed from: e */
    private InterruptedIOException f199164e;

    /* renamed from: f */
    private RuntimeException f199165f;

    /* renamed from: g */
    private long f199166g = -1;

    static {
        Covode.recordClassIndex(103651);
    }

    /* renamed from: a */
    public final void mo142089a() {
        if (f199159c || m152533c()) {
            this.f199162b = false;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public final void mo142091b() {
        if (f199159c || m152533c()) {
            this.f199161a = false;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: c */
    private boolean m152533c() {
        if (f199160h.get()) {
            return true;
        }
        long j = this.f199166g;
        if (j == -1) {
            this.f199166g = Thread.currentThread().getId();
            return true;
        } else if (j == Thread.currentThread().getId()) {
            return true;
        } else {
            return false;
        }
    }

    public void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                this.f199163d.put(runnable);
            } catch (InterruptedException e) {
                throw new RejectedExecutionException(e);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public final void mo142090a(int i) {
        if (f199159c || m152533c()) {
            long nanoTime = System.nanoTime();
            long convert = TimeUnit.NANOSECONDS.convert((long) i, TimeUnit.MILLISECONDS);
            if (this.f199162b) {
                InterruptedIOException interruptedIOException = this.f199164e;
                if (interruptedIOException != null) {
                    throw interruptedIOException;
                }
                throw this.f199165f;
            } else if (!this.f199161a) {
                this.f199161a = true;
                while (this.f199161a) {
                    if (i == 0) {
                        try {
                            m152532a(false, 0).run();
                        } catch (SocketTimeoutException e) {
                            this.f199161a = false;
                            this.f199162b = true;
                            throw e;
                        } catch (InterruptedIOException e2) {
                            this.f199161a = false;
                            this.f199162b = true;
                            this.f199164e = e2;
                            throw e2;
                        } catch (RuntimeException e3) {
                            this.f199161a = false;
                            this.f199162b = true;
                            this.f199165f = e3;
                            throw e3;
                        }
                    } else {
                        m152532a(true, (convert - System.nanoTime()) + nanoTime).run();
                    }
                }
            } else {
                throw new IllegalStateException("Cannot run loop when it is already running.");
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private Runnable m152532a(boolean z, long j) {
        Runnable runnable;
        if (!z) {
            try {
                runnable = this.f199163d.take();
            } catch (InterruptedException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException();
                interruptedIOException.initCause(e);
                throw interruptedIOException;
            }
        } else {
            runnable = this.f199163d.poll(j, TimeUnit.NANOSECONDS);
        }
        if (runnable != null) {
            return runnable;
        }
        throw new SocketTimeoutException();
    }
}
