package com.p2082ss.avframework.opengl;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.utils.AVLog;
import com.p2082ss.avframework.utils.SafeHandlerThread;

/* renamed from: com.ss.avframework.opengl.GLThread */
public class GLThread extends SafeHandlerThread {
    static {
        Covode.recordClassIndex(100657);
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        MethodCollector.m26663i(1282);
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.addRef();
        }
        if (GlUtil.nativeAttachThreadToOpenGl()) {
            AVLog.ioi("GLThread", "gl thread(" + getName() + ") is attached to opengl ...");
            MethodCollector.m26664o(1282);
            return;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("OpenGl thread created failed.");
        MethodCollector.m26664o(1282);
        throw androidRuntimeException;
    }

    public void run() {
        MethodCollector.m26663i(1309);
        AVLog.ioi("GLThread", "gl thread(" + getName() + ") is runing ...");
        super.run();
        AVLog.ioi("GLThread", "gl thread(" + getName() + ") is exit ...");
        GlUtil.nativeDetachThreadToOpenGl();
        AVLog.ioi("GLThread", "gl thread(" + getName() + ") is exit done");
        GLThreadManager gLThreadManager = GLThreadManager.get();
        if (gLThreadManager != null) {
            gLThreadManager.decrementRef();
        }
        GLTracer.removeTraceStack();
        MethodCollector.m26664o(1309);
    }

    public GLThread(String str) {
        super(str);
        GLTracer.traceStack(this);
    }
}
