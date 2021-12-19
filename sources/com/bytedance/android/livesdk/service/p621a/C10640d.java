package com.bytedance.android.livesdk.service.p621a;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

/* renamed from: com.bytedance.android.livesdk.service.a.d */
public final class C10640d {

    /* renamed from: a */
    public HashSet<EnumC10643c> f25644a;

    /* renamed from: b */
    private Handler f25645b;

    static {
        Covode.recordClassIndex(12230);
    }

    /* renamed from: com.bytedance.android.livesdk.service.a.d$a */
    public static class C10641a {

        /* renamed from: a */
        public static C10640d f25646a = new C10640d((byte) 0);

        static {
            Covode.recordClassIndex(12231);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.service.a.d$b */
    public class RunnableC10642b implements Runnable {

        /* renamed from: b */
        private EnumC10643c f25648b;

        static {
            Covode.recordClassIndex(12232);
        }

        public final void run() {
            if (this.f25648b != null) {
                C10640d.this.f25644a.remove(this.f25648b);
            }
        }

        RunnableC10642b(EnumC10643c cVar) {
            this.f25648b = cVar;
        }
    }

    private C10640d() {
        this.f25644a = new HashSet<>();
        this.f25645b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: com.bytedance.android.livesdk.service.a.d$c */
    public enum EnumC10643c {
        GIFT_DIALOG,
        RECHARGE_DIALOG;

        static {
            Covode.recordClassIndex(12233);
        }
    }

    /* synthetic */ C10640d(byte b) {
        this();
    }

    /* renamed from: a */
    public final boolean mo17551a(EnumC10643c cVar) {
        if (this.f25644a.contains(cVar)) {
            return false;
        }
        this.f25644a.add(cVar);
        this.f25645b.postDelayed(new RunnableC10642b(cVar), 1000);
        return true;
    }
}
