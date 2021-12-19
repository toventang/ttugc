package com.google.android.gms.common.api.internal;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.AbstractC25357i;
import com.google.android.gms.common.api.AbstractC25478k;
import com.google.android.gms.common.api.AbstractC25485p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1945d.HandlerC25727g;

/* renamed from: com.google.android.gms.common.api.internal.bw */
final class HandlerC25413bw extends HandlerC25727g {

    /* renamed from: a */
    private final /* synthetic */ C25412bv f60302a;

    static {
        Covode.recordClassIndex(30812);
    }

    public final void handleMessage(Message message) {
        MethodCollector.m26663i(9523);
        int i = message.what;
        if (i == 0) {
            AbstractC25478k<R> kVar = (AbstractC25478k) message.obj;
            synchronized (this.f60302a.f60297e) {
                if (kVar == null) {
                    try {
                        this.f60302a.f60294b.mo41632a(new Status(13, "Transform returned null"));
                    } catch (Throwable th) {
                        MethodCollector.m26664o(9523);
                        throw th;
                    }
                } else if (kVar instanceof C25406bp) {
                    this.f60302a.f60294b.mo41632a(((C25406bp) kVar).f60280a);
                } else {
                    C25412bv<? extends AbstractC25485p> bvVar = this.f60302a.f60294b;
                    synchronized (bvVar.f60297e) {
                        try {
                            bvVar.f60296d = kVar;
                            if (!(bvVar.f60293a == null && bvVar.f60295c == null)) {
                                AbstractC25357i iVar = bvVar.f60299g.get();
                                if (!(bvVar.f60301i || bvVar.f60293a == null || iVar == null)) {
                                    iVar.mo41522a(bvVar);
                                    bvVar.f60301i = true;
                                }
                                if (bvVar.f60298f != null) {
                                    bvVar.mo41633b(bvVar.f60298f);
                                } else if (bvVar.f60296d != null) {
                                    bvVar.f60296d.mo41543a(bvVar);
                                }
                            }
                        } catch (Throwable th2) {
                            MethodCollector.m26664o(9523);
                            throw th2;
                        }
                    }
                }
            }
            MethodCollector.m26664o(9523);
        } else if (i != 1) {
            int i2 = message.what;
            MethodCollector.m26664o(9523);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            if (valueOf.length() != 0) {
                "Runtime exception on the transformation worker thread: ".concat(valueOf);
            } else {
                new String("Runtime exception on the transformation worker thread: ");
            }
            MethodCollector.m26664o(9523);
            throw runtimeException;
        }
    }
}
