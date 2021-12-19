package com.p2082ss.android.ugc.aweme.compliance.business.p2642b;

import android.os.Bundle;
import com.bytedance.apm.C12397c;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13933m;
import com.bytedance.crash.runtime.C14031r;
import com.bytedance.geckox.C14894c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.statisticlogger.C18205a;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.deviceregister.AbstractC29900f;
import com.p2082ss.android.p2144h.C29913a;
import com.p2082ss.android.p2144h.C29921d;
import com.p2082ss.android.ugc.aweme.compliance.common.C39608b;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61595q;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.ISecApi;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.utils.C80333dc;
import com.p2082ss.ttvideoengine.C86313ai;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a */
public final class C39309a {

    /* renamed from: a */
    public static final C39309a f92798a = new C39309a();

    private C39309a() {
    }

    static {
        Covode.recordClassIndex(46988);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a$a */
    public static final class CallableC39310a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ boolean f92799a;

        /* renamed from: b */
        final /* synthetic */ Runnable f92800b;

        static {
            Covode.recordClassIndex(46989);
        }

        public CallableC39310a(boolean z, Runnable runnable) {
            this.f92799a = z;
            this.f92800b = runnable;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List<String> list;
            boolean z = this.f92799a;
            if (z) {
                C61595q.m111546b(C61595q.f139774b);
            }
            AVExternalServiceImpl.m113114a().updateVESDKDeviceId("");
            C29921d dVar = C29921d.C29923a.f71406a;
            C89219l.m154716b(dVar, "");
            C29913a aVar = dVar.f71403g;
            aVar.f71355e = "";
            dVar.mo52230a(aVar);
            C18205a.m33883f();
            C14894c b = C80333dc.m139275b();
            if (b != null) {
                b.mo23997a("");
            }
            C12397c.m22283a("device_id", "");
            C12397c.m22283a("install_id", "");
            HashMap hashMap = new HashMap();
            hashMap.put("deviceid", "");
            C86313ai.m148640a(C17867d.m33078a(), hashMap);
            C14031r b2 = C13933m.m25226b();
            C89219l.m154716b(b2, "");
            b2.mo22550a("");
            SecApiImpl.m119993a().updateDeviceIdAndInstallId("", "");
            AppLog.clearWhenSwitchChildMode(z);
            Bundle bundle = new Bundle();
            bundle.putInt("is_kids_mode", this.f92799a ? 1 : 0);
            AppLog.setCustomerHeader(bundle);
            if (this.f92799a) {
                list = C39608b.m80430p();
            } else {
                list = null;
            }
            AppLog.setWhiteEventFilterForChildMode(list);
            AppLog.resetDidWhenSwitchChildMode(C17867d.m33078a(), this.f92799a, 30000, new AbstractC29900f(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.p2642b.C39309a.CallableC39310a.C393111 */

                /* renamed from: a */
                final /* synthetic */ CallableC39310a f92801a;

                static {
                    Covode.recordClassIndex(46990);
                }

                /* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a$a$1$a */
                static final class CallableC39312a<V> implements Callable {

                    /* renamed from: a */
                    final /* synthetic */ C393111 f92802a;

                    static {
                        Covode.recordClassIndex(46991);
                    }

                    CallableC39312a(C393111 r1) {
                        this.f92802a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        Runnable runnable = this.f92802a.f92801a.f92800b;
                        if (runnable == null) {
                            return null;
                        }
                        runnable.run();
                        return C89391z.f203057a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.compliance.business.b.a$a$1$b */
                static final class CallableC39313b<V> implements Callable {

                    /* renamed from: a */
                    final /* synthetic */ C393111 f92803a;

                    static {
                        Covode.recordClassIndex(46992);
                    }

                    CallableC39313b(C393111 r1) {
                        this.f92803a = r1;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        Runnable runnable = this.f92803a.f92801a.f92800b;
                        if (runnable == null) {
                            return null;
                        }
                        runnable.run();
                        return C89391z.f203057a;
                    }
                }

                @Override // com.p2082ss.android.deviceregister.AbstractC29900f
                /* renamed from: a */
                public final void mo52186a() {
                    C1731i.m5640b(new CallableC39313b(this), C1731i.f5564c);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92801a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.HashMap */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.p2082ss.android.deviceregister.AbstractC29900f
                /* renamed from: a */
                public final void mo52187a(String str, String str2) {
                    String str3;
                    String str4;
                    String str5;
                    C12397c.m22283a("device_id", str);
                    C12397c.m22283a("install_id", str2);
                    C14031r b = C13933m.m25226b();
                    C89219l.m154716b(b, "");
                    b.mo22550a(str);
                    HashMap hashMap = new HashMap();
                    if (str == null) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    hashMap.put("deviceid", str3);
                    C86313ai.m148640a(C17867d.m33078a(), hashMap);
                    C14894c b2 = C80333dc.m139275b();
                    if (b2 != null) {
                        b2.mo23997a(str);
                    }
                    IExternalService a = AVExternalServiceImpl.m113114a();
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    a.updateVESDKDeviceId(str4);
                    C29921d dVar = C29921d.C29923a.f71406a;
                    C89219l.m154716b(dVar, "");
                    C29913a aVar = dVar.f71403g;
                    if (str == null) {
                        str5 = "";
                    } else {
                        str5 = str;
                    }
                    aVar.f71355e = str5;
                    dVar.mo52230a(aVar);
                    C18205a.m33883f();
                    ISecApi a2 = SecApiImpl.m119993a();
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    a2.updateDeviceIdAndInstallId(str, str2);
                    C1731i.m5640b(new CallableC39312a(this), C1731i.f5564c);
                }
            });
            return C89391z.f203057a;
        }
    }
}
