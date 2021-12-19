package com.bytedance.apm.p779k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.k.i */
public final class C12545i {

    /* renamed from: a */
    public float f30507a;

    /* renamed from: b */
    public int f30508b;

    /* renamed from: c */
    public int f30509c;

    /* renamed from: d */
    private BroadcastReceiver f30510d;

    /* renamed from: e */
    private IntentFilter f30511e;

    static {
        Covode.recordClassIndex(14361);
    }

    /* renamed from: com.bytedance.apm.k.i$a */
    public static class C12547a {

        /* renamed from: a */
        public static final C12545i f30513a = new C12545i((byte) 0);

        static {
            Covode.recordClassIndex(14363);
        }
    }

    private C12545i() {
        this.f30510d = new BroadcastReceiver() {
            /* class com.bytedance.apm.p779k.C12545i.C125461 */

            static {
                Covode.recordClassIndex(14362);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    C12545i.this.f30507a = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                    C12545i.this.f30508b = intent.getIntExtra("status", 1);
                    C12545i.this.f30509c = intent.getIntExtra("plugged", -1);
                }
            }
        };
        this.f30511e = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* synthetic */ C12545i(byte b) {
        this();
    }
}
