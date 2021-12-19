package com.p2082ss.android.ugc.aweme.simkit.impl.p3910a;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a;
import com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.model.p3913b.C74676a;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.a.a */
public final class C74620a implements AbstractC74605d {

    /* renamed from: a */
    private final String f167756a = "SuperResolutionStrategy";

    /* renamed from: b */
    private long f167757b;

    /* renamed from: c */
    private double f167758c = 0.2d;

    /* renamed from: d */
    private int f167759d;

    /* renamed from: e */
    private int f167760e;

    static {
        Covode.recordClassIndex(87441);
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: a */
    public final void mo117329a() {
        ICommonConfig commonConfig;
        try {
            AbstractC74608c a = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a, "");
            ISimKitConfig b = a.mo117290b();
            if (!(b == null || (commonConfig = b.getCommonConfig()) == null)) {
                commonConfig.getSuperResolutionStrategyConfig();
            }
            if (System.currentTimeMillis() - this.f167757b >= 300000) {
                Intent b2 = m131040b(C84231a.f188309a, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (b2 != null) {
                    double intExtra = (double) b2.getIntExtra("level", -1);
                    double intExtra2 = (double) b2.getIntExtra("scale", -1);
                    Double.isNaN(intExtra);
                    Double.isNaN(intExtra2);
                    Double valueOf = Double.valueOf(intExtra / intExtra2);
                    if (valueOf != null) {
                        this.f167758c = valueOf.doubleValue();
                    }
                }
                this.f167757b = System.currentTimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: b */
    public final void mo117330b() {
        ICommonConfig commonConfig;
        C74676a aVar = null;
        try {
            AbstractC74608c a = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a, "");
            ISimKitConfig b = a.mo117290b();
            if (b != null && (commonConfig = b.getCommonConfig()) != null) {
                aVar = commonConfig.getSuperResolutionStrategyConfig();
                if (aVar != null && aVar.f167843c != 10) {
                    this.f167759d--;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static Intent m131039a(Application application, IntentFilter intentFilter) {
        try {
            return application.registerReceiver(null, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(null, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static Intent m131040b(Application application, IntentFilter intentFilter) {
        SecurityException securityException;
        C58039a.m104863a(C17879g.m33104a());
        try {
            return m131039a(application, intentFilter);
        } catch (Exception unused) {
            try {
                return ReceiverRegisterLancetHelper.registerReceiver(null, intentFilter);
            } catch (SecurityException e) {
                securityException = e;
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            } catch (IllegalArgumentException e2) {
                String message = e2.getMessage();
                securityException = e2;
                if (message != null) {
                    boolean contains = e2.getMessage().contains("regist too many Broadcast Receivers");
                    securityException = e2;
                    if (contains) {
                        throw e2;
                    }
                }
                C13468b.m24211a(securityException, "Register Receiver Exception");
                return null;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.simkit.api.AbstractC74605d
    /* renamed from: a */
    public final int mo117328a(String str, boolean z, long j, int i, String str2, float f) {
        ICommonConfig commonConfig;
        if (z) {
            return 4;
        }
        if (TextUtils.isEmpty(str2)) {
            return 2;
        }
        if (str2 == null) {
            C89219l.m154707a();
        }
        if (!C89361p.m154908a((CharSequence) str2, (CharSequence) "540", false) && !C89361p.m154908a((CharSequence) str2, (CharSequence) "720", false)) {
            return 2;
        }
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        int PlayerAbSuperResolutionVideoDurationExp = b.getSimPlayerExperiment().PlayerAbSuperResolutionVideoDurationExp();
        if (PlayerAbSuperResolutionVideoDurationExp > 0 && j > ((long) (PlayerAbSuperResolutionVideoDurationExp * 1000))) {
            return 12;
        }
        C74676a aVar = null;
        try {
            AbstractC74608c a2 = AbstractC74616d.m131036a();
            C89219l.m154709a((Object) a2, "");
            ISimKitConfig b2 = a2.mo117290b();
            if (!(b2 == null || (commonConfig = b2.getCommonConfig()) == null)) {
                aVar = commonConfig.getSuperResolutionStrategyConfig();
            }
        } catch (Throwable unused) {
        }
        if (aVar == null) {
            return 1;
        }
        TextUtils.isEmpty(str);
        double d = (double) aVar.f167842b;
        Double.isNaN(d);
        int i2 = aVar.f167843c;
        if (this.f167758c < d / 100.0d) {
            return 6;
        }
        if (i2 == 10) {
            return 100;
        }
        int i3 = this.f167759d;
        if (i3 + 1 <= i2) {
            this.f167759d = i3 + 1;
            this.f167760e = 0;
            return 100;
        }
        if (i3 + 1 > i2) {
            int i4 = this.f167760e;
            if (i4 + 1 <= 10 - i2) {
                this.f167760e = i4 + 1;
                this.f167759d = i2;
                return 8;
            }
        }
        if (i3 + 1 <= i2 || this.f167760e + 1 <= 10 - i2) {
            return 11;
        }
        this.f167760e = 0;
        this.f167759d = 0;
        this.f167759d = 1;
        return 100;
    }
}
