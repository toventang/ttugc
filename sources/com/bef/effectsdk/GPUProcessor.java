package com.bef.effectsdk;

import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;

public class GPUProcessor {
    public static Listener sListener;

    public interface Listener {
        static {
            Covode.recordClassIndex(2689);
        }

        void onMessageReceived(int i, int i2, int i3, String str);
    }

    static {
        Covode.recordClassIndex(2687);
    }

    public static void destroy() {
        MessageCenter.destroy();
        sListener = null;
    }

    public static void init() {
        MessageCenter.init();
        MessageCenter.setListener(new MessageCenter.Listener() {
            /* class com.bef.effectsdk.GPUProcessor.C23851 */

            static {
                Covode.recordClassIndex(2688);
            }

            @Override // com.bef.effectsdk.message.MessageCenter.Listener
            public final void onMessageReceived(int i, int i2, int i3, String str) {
                if (GPUProcessor.sListener != null) {
                    GPUProcessor.sListener.onMessageReceived(i, i2, i3, str);
                }
            }
        });
    }

    public static void setListener(Listener listener) {
        sListener = listener;
    }
}
