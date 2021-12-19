package com.bytedance.bdturing.verify;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.bdturing.AbstractC13248b;
import com.bytedance.bdturing.C13270e;
import com.bytedance.bdturing.C13285g;
import com.bytedance.bdturing.DialogC13293l;
import com.bytedance.bdturing.p865e.C13278f;
import com.bytedance.bdturing.p865e.C13280g;
import com.bytedance.bdturing.verify.p867a.AbstractC13322a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

public final class RiskControlService implements AbstractC13321a {
    public DialogC13293l mDialogShowing;

    static {
        Covode.recordClassIndex(15283);
    }

    @Override // com.bytedance.bdturing.verify.AbstractC13321a
    public final boolean isProcess(int i) {
        return i == 1 || i == 2 || i == 3 || i == 5 || i == 12;
    }

    public final void dismissVerifyDialog() {
        DialogC13293l lVar = this.mDialogShowing;
        if (lVar != null && lVar.isShowing()) {
            DialogC13293l lVar2 = this.mDialogShowing;
            if (lVar2 == null) {
                C89219l.m154707a();
            }
            lVar2.dismiss();
        }
    }

    /* renamed from: com.bytedance.bdturing.verify.RiskControlService$a */
    public static final class C13317a implements C13278f.AbstractC13279a {

        /* renamed from: a */
        final /* synthetic */ RiskControlService f32570a;

        /* renamed from: b */
        final /* synthetic */ AbstractC13322a f32571b;

        /* renamed from: c */
        final /* synthetic */ AbstractC13248b f32572c;

        static {
            Covode.recordClassIndex(15284);
        }

        /* renamed from: com.bytedance.bdturing.verify.RiskControlService$a$a */
        static final class RunnableC13318a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C13317a f32573a;

            static {
                Covode.recordClassIndex(15285);
            }

            RunnableC13318a(C13317a aVar) {
                this.f32573a = aVar;
            }

            public final void run() {
                C13270e.m23846a();
                this.f32573a.f32570a.mDialogShowing = new DialogC13293l(this.f32573a.f32571b, this.f32573a.f32572c);
                DialogC13293l lVar = this.f32573a.f32570a.mDialogShowing;
                if (lVar != null) {
                    lVar.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                        /* class com.bytedance.bdturing.verify.RiskControlService.C13317a.RunnableC13318a.DialogInterface$OnDismissListenerC133191 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC13318a f32574a;

                        static {
                            Covode.recordClassIndex(15286);
                        }

                        {
                            this.f32574a = r1;
                        }

                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (dialogInterface == this.f32574a.f32573a.f32570a.mDialogShowing) {
                                this.f32574a.f32573a.f32570a.mDialogShowing = null;
                            }
                        }
                    });
                }
                DialogC13293l lVar2 = this.f32573a.f32570a.mDialogShowing;
                if (lVar2 != null) {
                    lVar2.show();
                }
                C13270e.m23850b();
            }
        }

        C13317a(RiskControlService riskControlService, AbstractC13322a aVar, AbstractC13248b bVar) {
            this.f32570a = riskControlService;
            this.f32571b = aVar;
            this.f32572c = bVar;
        }

        @Override // com.bytedance.bdturing.p865e.C13278f.AbstractC13279a
        /* renamed from: a */
        public final void mo21399a(int i, String str, long j) {
            Activity activity;
            Activity activity2 = this.f32571b.f32577a;
            if ((activity2 == null || !activity2.isFinishing()) && (activity = this.f32571b.f32577a) != null) {
                activity.runOnUiThread(new RunnableC13318a(this));
            }
        }
    }

    @Override // com.bytedance.bdturing.verify.AbstractC13321a
    public final boolean execute(AbstractC13322a aVar, AbstractC13248b bVar) {
        boolean z;
        MethodCollector.m26663i(2099);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(bVar, "");
        DialogC13293l lVar = this.mDialogShowing;
        if (lVar == null || !lVar.isShowing()) {
            C13280g gVar = C13280g.f32476h;
            C13317a aVar2 = new C13317a(this, aVar, bVar);
            C89219l.m154719c(aVar2, "");
            boolean z2 = false;
            if (C13280g.m23878a() > System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aVar2.mo21399a(200, null, 0);
            } else {
                synchronized (gVar) {
                    try {
                        if (C13280g.f32474f.size() == 0) {
                            z2 = true;
                        }
                        C13280g.f32474f.add(aVar2);
                        if (z2) {
                            C13280g.m23882a(0);
                        }
                    } finally {
                        MethodCollector.m26664o(2099);
                    }
                }
            }
            return true;
        }
        C13285g.m23901a("verifyDialog still showing skip this request");
        bVar.mo21411a(998);
        MethodCollector.m26664o(2099);
        return true;
    }
}
