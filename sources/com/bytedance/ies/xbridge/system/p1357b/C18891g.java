package com.bytedance.ies.xbridge.system.p1357b;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.system.p1356a.AbstractC18863g;
import com.bytedance.ies.xbridge.system.p1361c.C18910i;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.b.g */
public final class C18891g extends AbstractC18863g {

    /* renamed from: a */
    private final String f44728a = "XVibrateMethod";

    /* renamed from: com.bytedance.ies.xbridge.system.b.g$a */
    public enum EnumC18892a {
        LIGHT(50),
        MEDIUM(125),
        HEAVY(255),
        UNKNOWN(0);
        
        public static final C18893a Companion = new C18893a((byte) 0);

        /* renamed from: b */
        private final int f44730b;

        /* renamed from: com.bytedance.ies.xbridge.system.b.g$a$a */
        public static final class C18893a {
            static {
                Covode.recordClassIndex(21603);
            }

            private C18893a() {
            }

            public /* synthetic */ C18893a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnumC18892a m35090a(String str) {
                if (str == null) {
                    return EnumC18892a.UNKNOWN;
                }
                try {
                    String upperCase = str.toUpperCase();
                    C89219l.m154709a((Object) upperCase, "");
                    return EnumC18892a.valueOf(upperCase);
                } catch (Exception unused) {
                    return EnumC18892a.UNKNOWN;
                }
            }
        }

        public final int getAmplitude() {
            return this.f44730b;
        }

        static {
            Covode.recordClassIndex(21602);
        }

        private EnumC18892a(int i) {
            this.f44730b = i;
        }
    }

    static {
        Covode.recordClassIndex(21601);
    }

    /* renamed from: a */
    private static Object m35088a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(4427);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(4427);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // com.bytedance.ies.xbridge.system.p1356a.AbstractC18863g
    /* renamed from: a */
    public final void mo29847a(C18910i iVar, AbstractC18863g.AbstractC18864a aVar, EnumC18483e eVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            ALog.m59869i(this.f44728a, "Context is null");
            aVar.mo29848a((AbstractC18863g.AbstractC18864a) 0, "Context is null.");
            return;
        }
        try {
            EnumC18892a a = EnumC18892a.C18893a.m35090a(iVar.f44758b);
            if (a == EnumC18892a.UNKNOWN) {
                aVar.mo29848a(-3, "Illegal style");
                return;
            }
            int amplitude = a.getAmplitude();
            long j = (long) iVar.f44757a;
            Object a2 = m35088a(context, "vibrator");
            if (a2 != null) {
                Vibrator vibrator = (Vibrator) a2;
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(j, amplitude), (AudioAttributes) null);
                } else {
                    vibrator.vibrate(j);
                }
                ALog.m59869i(this.f44728a, "Vibrate success");
                aVar.mo29849a(new C18745b(), "vibrate execute success.");
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        } catch (Exception e) {
            aVar.mo29848a((AbstractC18863g.AbstractC18864a) 0, "Can not get vibrate service.");
            ALog.m59868e(this.f44728a, e);
        }
    }
}
