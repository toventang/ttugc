package com.p2082ss.android.ugc.aweme.p2440ce;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerpermissions.C17773l;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.ce.b */
public final class C35444b {

    /* renamed from: a */
    static final AbstractC35448c f83613a;

    /* renamed from: com.ss.android.ugc.aweme.ce.b$b */
    public interface AbstractC35447b {
        static {
            Covode.recordClassIndex(42623);
        }

        /* renamed from: a */
        void mo53515a(String[] strArr, int[] iArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.ce.b$c */
    interface AbstractC35448c {
        static {
            Covode.recordClassIndex(42624);
        }

        /* renamed from: a */
        void mo62342a(Activity activity, String[] strArr, AbstractC35447b bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ce.b$d */
    static class C35449d implements AbstractC35448c {
        static {
            Covode.recordClassIndex(42625);
        }

        C35449d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35448c
        /* renamed from: a */
        public final void mo62342a(Activity activity, String[] strArr, AbstractC35447b bVar) {
            if (activity.getFragmentManager().findFragmentByTag("permissions") == null) {
                FragmentC35443a aVar = new FragmentC35443a();
                Bundle bundle = new Bundle();
                bundle.putStringArray("permissions", strArr);
                aVar.setArguments(bundle);
                aVar.f83612a = bVar;
                activity.getFragmentManager().beginTransaction().add(aVar, "permissions").commitAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ce.b$a */
    static class C35445a implements AbstractC35448c {

        /* renamed from: a */
        final Handler f83614a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(42621);
        }

        C35445a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35448c
        /* renamed from: a */
        public final void mo62342a(Activity activity, final String[] strArr, final AbstractC35447b bVar) {
            this.f83614a.post(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.p2440ce.C35444b.C35445a.RunnableC354461 */

                static {
                    Covode.recordClassIndex(42622);
                }

                public final void run() {
                    if (bVar != null) {
                        int[] iArr = new int[strArr.length];
                        Arrays.fill(iArr, 0);
                        bVar.mo53515a(strArr, iArr);
                    }
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(42620);
        if (Build.VERSION.SDK_INT >= 23) {
            f83613a = new C35449d();
        } else {
            f83613a = new C35445a();
        }
    }

    /* renamed from: a */
    public static void m72473a(Activity activity, String[] strArr, AbstractC35447b bVar) {
        boolean z = activity instanceof ActivityC0945e;
        boolean a = SettingsManager.m29616a().mo25400a("enable_power_permissions", false);
        if (!z || !a) {
            f83613a.mo62342a(activity, strArr, bVar);
        } else {
            C17773l.m32969a((ActivityC0945e) activity).mo28229a(strArr).mo28230a(new C35450c(bVar));
        }
    }
}
