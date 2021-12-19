package com.p2082ss.avframework.opengl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.AVLog;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.avframework.opengl.GLTracer */
public class GLTracer {
    private static boolean sEnableGlTracer;
    private static volatile GLTracer sGlTracer;
    private List<StackInfo> threads = new ArrayList();

    static {
        Covode.recordClassIndex(100662);
    }

    public static void abort() {
        dump();
    }

    public static void checkAndDump() {
        checkAndDump(12);
    }

    public static void traceStack() {
        traceStack(Thread.currentThread());
    }

    private GLTracer() {
    }

    private static GLTracer getWithLock() {
        if (sGlTracer == null) {
            sGlTracer = new GLTracer();
        }
        return sGlTracer;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.avframework.opengl.GLTracer$StackInfo */
    public static class StackInfo {
        public String stack;
        public Thread thread;
        public String time;

        static {
            Covode.recordClassIndex(100663);
        }

        public String toString() {
            return "StackInfo{thread=" + this.thread + ", time='" + this.time + ", createStack=" + this.stack + '\'' + '}';
        }

        public StackInfo(Thread thread2, StackTraceElement[] stackTraceElementArr) {
            this.thread = thread2;
            if (stackTraceElementArr != null) {
                StringBuilder sb = new StringBuilder();
                for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                    sb.append("    at " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + " :" + stackTraceElement.getLineNumber() + ")").append("\n");
                }
                this.stack = "\n" + sb.toString();
            } else {
                this.stack = "none";
            }
            this.time = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        }
    }

    public static void dump() {
        MethodCollector.m26663i(1481);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    for (StackInfo stackInfo : getWithLock().threads) {
                        AVLog.ioe("GLTracer", stackInfo.toString());
                    }
                } finally {
                    MethodCollector.m26664o(1481);
                }
            }
            return;
        }
        MethodCollector.m26664o(1481);
    }

    public static int size() {
        int size;
        MethodCollector.m26663i(1506);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    size = getWithLock().threads.size();
                } finally {
                    MethodCollector.m26664o(1506);
                }
            }
            return size;
        }
        MethodCollector.m26664o(1506);
        return 0;
    }

    public static void removeTraceStack() {
        MethodCollector.m26663i(1392);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    synchronized (GLTracer.class) {
                        try {
                            Iterator<StackInfo> it = getWithLock().threads.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                StackInfo next = it.next();
                                if (next.thread == Thread.currentThread()) {
                                    getWithLock().threads.remove(next);
                                    AVLog.iow("GLTracer", "RemoveTrackStack remain " + getWithLock().threads.size());
                                    break;
                                }
                            }
                        } finally {
                            MethodCollector.m26664o(1392);
                        }
                    }
                    return;
                } finally {
                    MethodCollector.m26664o(1392);
                }
            }
            return;
        }
        MethodCollector.m26664o(1392);
    }

    public static void setEnableGlTracer(boolean z) {
        sEnableGlTracer = z;
    }

    public static void checkAndDump(int i) {
        if (sEnableGlTracer && size() > i) {
            dump();
        }
    }

    public static void traceStack(Thread thread) {
        MethodCollector.m26663i(1377);
        if (sEnableGlTracer) {
            synchronized (GLTracer.class) {
                try {
                    getWithLock().threads.add(new StackInfo(thread, Thread.currentThread().getStackTrace()));
                    AVLog.iow("GLTracer", "AddTrackStack with threadName[" + thread.getName() + "] current size " + getWithLock().threads.size());
                    int size = size();
                    if (size > 12) {
                        AVLog.ioe("GLTracer", "Too more GL thread with " + size + " VS 12");
                        abort();
                    }
                } finally {
                    MethodCollector.m26664o(1377);
                }
            }
            return;
        }
        MethodCollector.m26664o(1377);
    }
}
