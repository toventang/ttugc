package androidx.browser.p024a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.p009a.AbstractC0067a;
import android.support.p009a.AbstractC0070b;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.push.downgrade.C65713d;

/* renamed from: androidx.browser.a.b */
public class C0471b {

    /* renamed from: a */
    private final AbstractC0070b f1800a;

    /* renamed from: b */
    private final ComponentName f1801b;

    static {
        Covode.recordClassIndex(536);
    }

    /* renamed from: a */
    public final boolean mo2031a() {
        try {
            return this.f1800a.mo56a(0);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final C0483e mo2032b() {
        BinderC04732 r3 = new AbstractC0067a.AbstractBinderC0068a(null) {
            /* class androidx.browser.p024a.C0471b.BinderC04732 */

            /* renamed from: a */
            final /* synthetic */ C0470a f1803a = null;

            /* renamed from: c */
            private Handler f1805c = new Handler(Looper.getMainLooper());

            static {
                Covode.recordClassIndex(538);
            }

            @Override // android.support.p009a.AbstractC0067a
            /* renamed from: a */
            public final void mo48a(final Bundle bundle) {
                if (this.f1803a != null) {
                    this.f1805c.post(new Runnable() {
                        /* class androidx.browser.p024a.C0471b.BinderC04732.RunnableC04763 */

                        static {
                            Covode.recordClassIndex(541);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.p009a.AbstractC0067a
            /* renamed from: a */
            public final void mo47a(final int i, final Bundle bundle) {
                if (this.f1803a != null) {
                    this.f1805c.post(new Runnable() {
                        /* class androidx.browser.p024a.C0471b.BinderC04732.RunnableC04741 */

                        static {
                            Covode.recordClassIndex(539);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.p009a.AbstractC0067a
            /* renamed from: b */
            public final void mo50b(final String str, final Bundle bundle) {
                if (this.f1803a != null) {
                    this.f1805c.post(new Runnable() {
                        /* class androidx.browser.p024a.C0471b.BinderC04732.RunnableC04774 */

                        static {
                            Covode.recordClassIndex(542);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.p009a.AbstractC0067a
            /* renamed from: a */
            public final void mo49a(final String str, final Bundle bundle) {
                if (this.f1803a != null) {
                    this.f1805c.post(new Runnable() {
                        /* class androidx.browser.p024a.C0471b.BinderC04732.RunnableC04752 */

                        static {
                            Covode.recordClassIndex(540);
                        }

                        public final void run() {
                        }
                    });
                }
            }

            @Override // android.support.p009a.AbstractC0067a
            /* renamed from: a */
            public final void mo46a(final int i, final Uri uri, final boolean z, final Bundle bundle) {
                if (this.f1803a != null) {
                    this.f1805c.post(new Runnable() {
                        /* class androidx.browser.p024a.C0471b.BinderC04732.RunnableC04785 */

                        static {
                            Covode.recordClassIndex(543);
                        }

                        public final void run() {
                        }
                    });
                }
            }
        };
        try {
            if (!this.f1800a.mo57a(r3)) {
                return null;
            }
            return new C0483e(this.f1800a, r3, this.f1801b);
        } catch (RemoteException unused) {
            return null;
        }
    }

    C0471b(AbstractC0070b bVar, ComponentName componentName) {
        this.f1800a = bVar;
        this.f1801b = componentName;
    }

    /* renamed from: a */
    public static boolean m1709a(Context context, String str) {
        if (str == null) {
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        try {
            return m1710a(applicationContext, str, new AbstractServiceConnectionC0481d() {
                /* class androidx.browser.p024a.C0471b.C04721 */

                static {
                    Covode.recordClassIndex(537);
                }

                public final void onServiceDisconnected(ComponentName componentName) {
                }

                @Override // androidx.browser.p024a.AbstractServiceConnectionC0481d
                /* renamed from: a */
                public final void mo2033a(C0471b bVar) {
                    bVar.mo2031a();
                    applicationContext.unbindService(this);
                }
            });
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m1710a(Context context, String str, AbstractServiceConnectionC0481d dVar) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, dVar, 33);
        }
        if (C65713d.m117625a(context, intent)) {
            return true;
        }
        return context.bindService(intent, dVar, 33);
    }
}
