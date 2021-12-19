package com.p2082ss.android.ugc.aweme.p4173ug.p4181g;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80355dq;
import com.p2082ss.android.ugc.aweme.utils.C80467fz;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ug.g.a */
public final class C79632a {

    /* renamed from: a */
    public static final C79632a f178675a = new C79632a();

    private C79632a() {
    }

    static {
        Covode.recordClassIndex(92844);
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.g.a$a */
    public static final class CallableC79633a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f178676a;

        static {
            Covode.recordClassIndex(92845);
        }

        public CallableC79633a(Context context) {
            this.f178676a = context;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            final InstallReferrerClient a = InstallReferrerClient.m6882a(this.f178676a).mo6233a();
            a.mo6229a(new InstallReferrerStateListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p4173ug.p4181g.C79632a.CallableC79633a.C796341 */

                /* renamed from: a */
                final /* synthetic */ CallableC79633a f178677a;

                static {
                    Covode.recordClassIndex(92846);
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerServiceDisconnected() {
                }

                /* renamed from: com.ss.android.ugc.aweme.ug.g.a$a$1$a */
                static final class CallableC79635a<V> implements Callable {

                    /* renamed from: a */
                    final /* synthetic */ C796341 f178679a;

                    /* renamed from: b */
                    final /* synthetic */ int f178680b;

                    static {
                        Covode.recordClassIndex(92847);
                    }

                    CallableC79635a(C796341 r1, int i) {
                        this.f178679a = r1;
                        this.f178680b = i;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        if (this.f178680b == 0) {
                            try {
                                InstallReferrerClient installReferrerClient = a;
                                C89219l.m154716b(installReferrerClient, "");
                                String a = installReferrerClient.mo6232c().mo6236a();
                                C79632a.m138446a(a);
                                C80467fz.m139472a(a);
                                C80355dq.m139320a(a);
                                C79632a.m138448b(this.f178679a.f178677a.f178676a);
                                a.mo6231b();
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }
                        return C89391z.f203057a;
                    }
                }

                @Override // com.android.installreferrer.api.InstallReferrerStateListener
                public final void onInstallReferrerSetupFinished(int i) {
                    C1731i.m5640b(new CallableC79635a(this, i), C1731i.f5562a);
                }

                {
                    this.f178677a = r1;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m138446a(String str) {
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "utm_source=tt_wallpaper", false)) {
            C39162r.onEventV3("app_install_from_wallpaper");
        }
    }

    /* renamed from: b */
    public static void m138448b(Context context) {
        C89219l.m154721d(context, "");
        C34822d.m71158a(context, "preinsatll_appflyer", 0).edit().putBoolean("checkedInstallReferrer", true).apply();
    }

    /* renamed from: a */
    public static boolean m138447a(Context context) {
        C89219l.m154721d(context, "");
        return C34822d.m71158a(context, "preinsatll_appflyer", 0).getBoolean("checkedInstallReferrer", false);
    }
}
