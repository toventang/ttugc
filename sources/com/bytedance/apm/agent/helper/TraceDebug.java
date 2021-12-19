package com.bytedance.apm.agent.helper;

import com.bytedance.apm.agent.tracing.Trace;
import com.bytedance.covode.number.Covode;

public class TraceDebug {
    private static OnLogListener mOnLogListener;

    public interface OnLogListener {
        static {
            Covode.recordClassIndex(14016);
        }

        void log(String str, long j);
    }

    static {
        Covode.recordClassIndex(14015);
    }

    public static OnLogListener getLogListener() {
        return mOnLogListener;
    }

    public static void setLogListener(OnLogListener onLogListener) {
        mOnLogListener = onLogListener;
    }

    public static void notifyLogListener(Trace trace, long j) {
        OnLogListener onLogListener = mOnLogListener;
        if (onLogListener != null) {
            onLogListener.log(trace.methodName, j);
        }
    }
}
