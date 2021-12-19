package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class MessageCenter {
    private static final List<Listener> sListeners = new ArrayList();
    private static HandlerThread sMessageCenterThread;
    private static final Object sMessageCenterThreadLock = new Object();
    private static Handler sMessageHandler;

    public interface Listener {
        static {
            Covode.recordClassIndex(2725);
        }

        void onMessageReceived(int i, int i2, int i3, String str);
    }

    static {
        Covode.recordClassIndex(2724);
    }

    public static void removeAllListener() {
        MethodCollector.m26663i(2951);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.clear();
                destroy();
            } finally {
                MethodCollector.m26664o(2951);
            }
        }
    }

    public static void destroy() {
        MethodCollector.m26663i(2961);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    synchronized (sMessageCenterThreadLock) {
                        try {
                            Handler handler = sMessageHandler;
                            if (handler != null) {
                                handler.removeCallbacksAndMessages(null);
                                sMessageHandler = null;
                            }
                            HandlerThread handlerThread = sMessageCenterThread;
                            if (handlerThread != null) {
                                handlerThread.quit();
                                sMessageCenterThread = null;
                            }
                        } finally {
                            MethodCollector.m26664o(2961);
                        }
                    }
                    list.clear();
                }
            } finally {
                MethodCollector.m26664o(2961);
            }
        }
    }

    public static void init() {
        MethodCollector.m26663i(2958);
        synchronized (sMessageCenterThreadLock) {
            try {
                HandlerThread handlerThread = sMessageCenterThread;
                if (handlerThread == null || !handlerThread.isAlive() || sMessageCenterThread.getLooper() == null) {
                    HandlerThread handlerThread2 = new HandlerThread("MessageCenter");
                    sMessageCenterThread = handlerThread2;
                    handlerThread2.start();
                    sMessageHandler = new MessageHandler(sMessageCenterThread.getLooper());
                }
            } finally {
                MethodCollector.m26664o(2958);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class MessageHandler extends Handler {
        static {
            Covode.recordClassIndex(2726);
        }

        public MessageHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            MessageCenter.handleMessage(message);
        }
    }

    public static void addListener(Listener listener) {
        MethodCollector.m26663i(10376);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                if (list.isEmpty()) {
                    init();
                }
                list.add(listener);
            } finally {
                MethodCollector.m26664o(10376);
            }
        }
    }

    public static void removeListener(Listener listener) {
        MethodCollector.m26663i(2949);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                list.remove(listener);
                if (list.isEmpty()) {
                    destroy();
                }
            } finally {
                MethodCollector.m26664o(2949);
            }
        }
    }

    public static void setListener(Listener listener) {
        MethodCollector.m26663i(9752);
        synchronized (sListeners) {
            try {
                addListener(listener);
            } finally {
                MethodCollector.m26664o(9752);
            }
        }
    }

    public static void handleMessage(Message message) {
        MethodCollector.m26663i(2989);
        List<Listener> list = sListeners;
        synchronized (list) {
            try {
                for (Listener listener : list) {
                    listener.onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
                }
            } finally {
                MethodCollector.m26664o(2989);
            }
        }
    }

    private static void postMessage(int i, int i2, int i3, String str) {
        MethodCollector.m26663i(2968);
        synchronized (sMessageCenterThreadLock) {
            try {
                Handler handler = sMessageHandler;
                if (handler != null) {
                    Message.obtain(handler, i, i2, i3, str).sendToTarget();
                    MethodCollector.m26664o(2968);
                }
            } finally {
                MethodCollector.m26664o(2968);
            }
        }
    }
}
