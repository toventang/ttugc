package com.ttnet.org.chromium.base.task;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ttnet.org.chromium.base.C87444b;
import com.ttnet.org.chromium.base.C87451e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskRunnerImpl implements AbstractC87494n {

    /* renamed from: f */
    static final /* synthetic */ boolean f198411f = true;

    /* renamed from: a */
    protected final Object f198412a;

    /* renamed from: b */
    protected long f198413b;

    /* renamed from: c */
    protected final Runnable f198414c;

    /* renamed from: d */
    protected LinkedList<Runnable> f198415d;

    /* renamed from: e */
    protected List<Pair<Runnable, Long>> f198416e;

    /* renamed from: g */
    private final C87496p f198417g;

    /* renamed from: h */
    private final String f198418h;

    /* renamed from: i */
    private final int f198419i;

    /* renamed from: j */
    private boolean f198420j;

    /* renamed from: k */
    private final C87451e f198421k;

    private native void nativeDestroy(long j);

    private native long nativeInit(int i, boolean z, int i2, boolean z2, boolean z3, byte b, byte[] bArr);

    private native void nativePostDelayedTask(long j, Runnable runnable, long j2);

    /* access modifiers changed from: protected */
    public native boolean nativeBelongsToCurrentThread(long j);

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: b */
    public final void mo141540b() {
        C87451e.m151783a(this.f198421k);
    }

    static {
        Covode.recordClassIndex(103420);
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: c */
    public final void mo141541c() {
        MethodCollector.m26663i(6486);
        synchronized (this.f198412a) {
            try {
                m151821e();
                m151822f();
            } finally {
                MethodCollector.m26664o(6486);
            }
        }
    }

    /* renamed from: e */
    private void m151821e() {
        MethodCollector.m26663i(6487);
        if (this.f198413b == 0) {
            this.f198413b = nativeInit(this.f198419i, this.f198417g.f198465l, this.f198417g.f198466m, this.f198417g.f198467n, this.f198417g.f198468o, this.f198417g.f198469p, this.f198417g.f198470q);
        }
        MethodCollector.m26664o(6487);
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: a */
    public final void mo141538a() {
        MethodCollector.m26663i(6039);
        synchronized (this.f198412a) {
            try {
                C87451e.m151783a(this.f198421k);
                this.f198420j = true;
                long j = this.f198413b;
                if (j != 0) {
                    nativeDestroy(j);
                }
                this.f198413b = 0;
            } finally {
                MethodCollector.m26664o(6039);
            }
        }
    }

    /* renamed from: f */
    private void m151822f() {
        LinkedList<Runnable> linkedList = this.f198415d;
        if (linkedList != null) {
            Iterator<Runnable> it = linkedList.iterator();
            while (it.hasNext()) {
                m151820b(it.next(), 0);
            }
            for (Pair<Runnable, Long> pair : this.f198416e) {
                m151820b((Runnable) pair.first, ((Long) pair.second).longValue());
            }
            this.f198415d = null;
            this.f198416e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r3 == null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r1 = r5.f198417g.f198466m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r1 == 1) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == 2) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        android.os.Process.setThreadPriority(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        android.os.Process.setThreadPriority(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        android.os.Process.setThreadPriority(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        if (r3 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        r3.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6341);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0054, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0055, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(6341);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141542d() {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.task.TaskRunnerImpl.mo141542d():void");
    }

    TaskRunnerImpl(C87496p pVar) {
        this(pVar, "TaskRunnerImpl");
    }

    /* renamed from: b */
    private void m151820b(Runnable runnable, long j) {
        MethodCollector.m26663i(6638);
        nativePostDelayedTask(this.f198413b, runnable, j);
        MethodCollector.m26664o(6638);
    }

    private TaskRunnerImpl(C87496p pVar, String str) {
        C87451e eVar;
        this.f198412a = new Object();
        this.f198414c = new RunnableC87495o(this);
        if (!C87444b.f198337a) {
            eVar = null;
        } else {
            eVar = new C87451e(new C87451e.C87455d(this, new C87451e.C87452a()));
        }
        this.f198421k = eVar;
        this.f198415d = new LinkedList<>();
        this.f198416e = new ArrayList();
        this.f198417g = pVar;
        this.f198418h = str + ".PreNativeTask.run";
        this.f198419i = 0;
        if (PostTask.f198406b != null) {
            PostTask.f198406b.add(this);
        } else {
            mo141541c();
        }
    }

    @Override // com.ttnet.org.chromium.base.task.AbstractC87494n
    /* renamed from: a */
    public final void mo141539a(Runnable runnable, long j) {
        MethodCollector.m26663i(6194);
        synchronized (this.f198412a) {
            try {
                if (f198411f || !this.f198420j) {
                    LinkedList<Runnable> linkedList = this.f198415d;
                    if (linkedList == null) {
                        m151820b(runnable, 0);
                        return;
                    }
                    linkedList.add(runnable);
                    PostTask.m151819a().execute(this.f198414c);
                    MethodCollector.m26664o(6194);
                    return;
                }
                AssertionError assertionError = new AssertionError();
                MethodCollector.m26664o(6194);
                throw assertionError;
            } finally {
                MethodCollector.m26664o(6194);
            }
        }
    }
}
