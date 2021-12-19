package com.bytedance.platform.p1565a.p1567b.p1570c.p1571a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.platform.p1565a.p1566a.C21633h;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.platform.a.b.c.a.d */
public final class C21654d extends AbstractC21651a {

    /* renamed from: c */
    public HandlerC21655a f51387c;

    /* renamed from: d */
    private Method f51388d;

    static {
        Covode.recordClassIndex(25295);
    }

    /* renamed from: a */
    public final void mo35316a() {
        Message obtainMessage = this.f51387c.obtainMessage(101);
        if (Build.VERSION.SDK_INT >= 22) {
            obtainMessage.setAsynchronous(true);
        } else {
            if (this.f51388d == null) {
                this.f51388d = C21633h.m40586a((Class<?>) Message.class, "setAsynchronous", Boolean.TYPE);
            }
            try {
                Method method = this.f51388d;
                Object[] objArr = {true};
                Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obtainMessage, objArr}, 110000, "java.lang.Object", true, "com_bytedance_platform_horae_java_impl_sync_hook_TimerInMessageQueue_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a.first).booleanValue()) {
                    Object obj = a.second;
                } else {
                    C15346a.m28242a(method.invoke(obtainMessage, objArr), method, new Object[]{obtainMessage, objArr}, "com_bytedance_platform_horae_java_impl_sync_hook_TimerInMessageQueue_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                }
            } catch (Throwable unused) {
            }
        }
        this.f51387c.sendMessageDelayed(obtainMessage, 3000);
    }

    public C21654d(AbstractC21652b bVar) {
        super("TimerInMessageQueue", bVar);
    }

    /* renamed from: com.bytedance.platform.a.b.c.a.d$a */
    public class HandlerC21655a extends Handler {
        static {
            Covode.recordClassIndex(25296);
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 101) {
                if (C21654d.this.f51383b != null) {
                    C21654d.this.f51383b.mo35299a();
                }
                C21654d.this.mo35316a();
            }
        }

        public HandlerC21655a(Looper looper) {
            super(looper);
        }
    }
}
