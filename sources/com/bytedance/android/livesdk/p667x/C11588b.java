package com.bytedance.android.livesdk.p667x;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.livesdk.x.b */
public final class C11588b {

    /* renamed from: a */
    public ConcurrentHashMap<Integer, AbstractC11587a> f27733a;

    /* renamed from: b */
    public ConcurrentHashMap<Integer, Integer> f27734b;

    /* renamed from: c */
    public ConcurrentHashMap<Integer, Integer> f27735c;

    /* renamed from: d */
    public int[][] f27736d;

    /* renamed from: e */
    public AbstractC11587a f27737e;

    /* renamed from: f */
    public Thread f27738f;

    /* renamed from: g */
    private Handler f27739g;

    static {
        Covode.recordClassIndex(13254);
    }

    /* renamed from: com.bytedance.android.livesdk.x.b$a */
    public static class C11589a {

        /* renamed from: a */
        public static C11588b f27740a = new C11588b((byte) 0);

        static {
            Covode.recordClassIndex(13255);
        }
    }

    private C11588b() {
        this.f27733a = new ConcurrentHashMap<>();
        this.f27734b = new ConcurrentHashMap<>();
        this.f27735c = new ConcurrentHashMap<>();
        this.f27739g = new Handler(Looper.getMainLooper());
    }

    /* renamed from: b */
    public final void mo18394b() {
        if (!(this.f27737e == null || Thread.currentThread() == Looper.getMainLooper().getThread())) {
            this.f27738f = Thread.currentThread();
            for (AbstractC11587a aVar = this.f27737e; aVar != null; aVar = aVar.mNextTask) {
                aVar.start();
            }
            this.f27738f = null;
        }
    }

    /* renamed from: a */
    public final void mo18391a() {
        if (this.f27737e != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            for (AbstractC11587a aVar = this.f27737e; aVar != null; aVar = aVar.mNextTask) {
                Iterator<Integer> it = aVar.preTasks().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next = it.next();
                        if (!(next.intValue() == aVar.getTaskId() || this.f27733a.get(next).isFinished())) {
                            break;
                        }
                    } else if (aVar.isIDLE()) {
                        aVar.start();
                    }
                }
            }
        }
    }

    /* synthetic */ C11588b(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo18392a(int i, AbstractC11587a aVar) {
        if (!this.f27733a.containsKey(Integer.valueOf(i))) {
            this.f27733a.put(Integer.valueOf(i), aVar);
            int size = this.f27734b.size();
            this.f27734b.put(Integer.valueOf(i), Integer.valueOf(size));
            this.f27735c.put(Integer.valueOf(size), Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final boolean mo18393a(int i, int[] iArr, Stack stack) {
        iArr[i] = -1;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (this.f27736d[i][i2] == 1) {
                if (iArr[i2] < 0) {
                    return false;
                }
                if (iArr[i2] != 1 && !mo18393a(i2, iArr, stack)) {
                    return false;
                }
            }
        }
        iArr[i] = 1;
        stack.push(Integer.valueOf(i));
        return true;
    }
}
