package com.bytedance.android.monitorV2.p735h;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.monitorV2.p729b.C12076a;
import com.bytedance.android.monitorV2.p733f.C12093a;
import com.bytedance.android.monitorV2.p735h.p736a.C12097a;
import com.bytedance.android.monitorV2.p735h.p736a.C12099b;
import com.bytedance.android.monitorV2.p735h.p736a.C12100c;
import com.bytedance.android.monitorV2.p735h.p736a.C12102d;
import com.bytedance.android.monitorV2.p735h.p736a.C12103e;
import com.bytedance.android.monitorV2.p737i.C12115b;
import com.bytedance.android.monitorV2.p740l.C12125b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.bytedance.android.monitorV2.h.c */
public final class C12105c extends AbstractC12096a implements AbstractC12113f {

    /* renamed from: a */
    public C12102d f29119a;

    /* renamed from: b */
    public boolean f29120b;

    /* renamed from: c */
    public C12111d f29121c;

    static {
        Covode.recordClassIndex(13834);
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: b */
    public final C12097a mo19479b() {
        if (this.f29119a.f29095a != null) {
            return this.f29119a.f29095a;
        }
        return new C12097a();
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: c */
    public final C12103e mo19480c() {
        if (this.f29119a.f29096b != null) {
            return this.f29119a.f29096b;
        }
        return new C12103e();
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: d */
    public final List<C12099b> mo19481d() {
        if (this.f29119a.f29095a == null || this.f29119a.f29095a.f29031c == null) {
            return new ArrayList();
        }
        return this.f29119a.f29095a.f29031c;
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: e */
    public final Map<String, Integer> mo19482e() {
        if (this.f29119a.f29100f != null) {
            return this.f29119a.f29100f;
        }
        return new HashMap();
    }

    /* renamed from: b */
    public final void mo19483b(int i) {
        if (i > 0) {
            mo19447a(i);
        }
    }

    @Override // com.bytedance.android.monitorV2.p735h.AbstractC12113f
    /* renamed from: a */
    public final void mo19478a(Context context) {
        if (context != null) {
            if (!this.f29120b) {
                C12093a.m21524a(new Runnable() {
                    /* class com.bytedance.android.monitorV2.p735h.C12105c.RunnableC121061 */

                    static {
                        Covode.recordClassIndex(13835);
                    }

                    public final void run() {
                        C12102d a = C12105c.this.f29121c.mo19489a();
                        if (a != null) {
                            C12105c.this.f29119a = a;
                        }
                        if (C12105c.this.f29119a != null) {
                            C12105c cVar = C12105c.this;
                            cVar.mo19483b(cVar.f29119a.f29098d);
                            C12115b.m21581a("HybridSettingRequestService", C12105c.this.f29119a.f29096b.toString());
                            C12105c.this.f29120b = true;
                            return;
                        }
                        C12115b.m21581a("HybridSettingRequestService_init", "monitor setting init: failed");
                        new Timer().schedule(new TimerTask() {
                            /* class com.bytedance.android.monitorV2.p735h.C12105c.RunnableC121061.C121071 */

                            static {
                                Covode.recordClassIndex(13836);
                            }

                            public final void run() {
                                C12102d a = C12105c.this.f29121c.mo19489a();
                                if (a != null) {
                                    C12105c.this.f29119a = a;
                                }
                                if (C12105c.this.f29119a == null) {
                                    C12115b.m21581a("HybridSettingRequestService_retry", "monitor setting retry after 10 min: failed");
                                    return;
                                }
                                C12105c.this.mo19483b(C12105c.this.f29119a.f29098d);
                                C12105c.this.f29120b = true;
                                C12115b.m21581a("HybridSettingRequestService_retry", "monitor setting retry after 10 min: succeeded");
                            }
                        }, 600000);
                    }
                });
            }
            mo19448a(new AbstractC12112e() {
                /* class com.bytedance.android.monitorV2.p735h.C12105c.C121082 */

                static {
                    Covode.recordClassIndex(13837);
                }

                @Override // com.bytedance.android.monitorV2.p735h.AbstractC12112e
                /* renamed from: a */
                public final void mo19486a(int i) {
                    C12105c cVar = C12105c.this;
                    if (i > 0) {
                        C12093a.m21524a(new Runnable(i) {
                            /* class com.bytedance.android.monitorV2.p735h.C12105c.RunnableC121093 */

                            /* renamed from: a */
                            final /* synthetic */ int f29125a;

                            static {
                                Covode.recordClassIndex(13838);
                            }

                            public final void run() {
                                new Timer().schedule(new TimerTask() {
                                    /* class com.bytedance.android.monitorV2.p735h.C12105c.RunnableC121093.C121101 */

                                    static {
                                        Covode.recordClassIndex(13839);
                                    }

                                    public final void run() {
                                        C12102d a = C12105c.this.f29121c.mo19489a();
                                        if (a != null) {
                                            C12105c.this.f29119a = a;
                                        }
                                        if (C12105c.this.f29119a != null) {
                                            C12105c.this.mo19483b(C12105c.this.f29119a.f29098d);
                                            C12115b.m21581a("HybridSettingRequestService", C12105c.this.f29119a.f29096b.toString());
                                            C12115b.m21581a("HybridSettingRequestService_update", "monitor setting updating every " + RunnableC121093.this.f29125a + " secs: succeeded");
                                            return;
                                        }
                                        C12115b.m21581a("HybridSettingRequestService_update", "monitor setting updating every " + RunnableC121093.this.f29125a + " secs: failed");
                                    }
                                }, (long) (this.f29125a * 1000));
                            }

                            {
                                this.f29125a = r2;
                            }
                        });
                    }
                }
            });
        }
    }

    public C12105c(C12100c cVar) {
        C12102d a;
        this.f29121c = new C12111d(cVar);
        String a2 = C12076a.m21501a("monitor_setting_response", "");
        this.f29119a = (TextUtils.isEmpty(a2) || (a = C12125b.m21628a(a2)) == null) ? new C12102d() : a;
    }
}
