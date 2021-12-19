package com.p2082ss.android.ugc.aweme.i18n.musically.cut;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.DialogInterfaceC0216c;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;
import com.p2082ss.android.ugc.aweme.utils.permission.C80620e;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.j */
public final class C53484j {

    /* renamed from: a */
    AbstractC53489b f122775a;

    /* renamed from: b */
    private AbstractC53488a f122776b;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.j$a */
    public interface AbstractC53488a {
        static {
            Covode.recordClassIndex(63061);
        }

        /* renamed from: a */
        void mo90080a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.cut.j$b */
    public interface AbstractC53489b {
        static {
            Covode.recordClassIndex(63062);
        }

        /* renamed from: a */
        void mo90031a(Intent intent);
    }

    static {
        Covode.recordClassIndex(63057);
    }

    /* renamed from: a */
    private static String m98693a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo90077b(Activity activity, AbstractC53488a aVar) {
        this.f122776b = aVar;
        SmartRouter.buildRoute(activity, "//profile/avatar_choose").open(2, new C53490k(this));
    }

    /* renamed from: a */
    public final void mo90076a(final Activity activity, final AbstractC53488a aVar) {
        if (C80620e.m139781c(activity) == 0) {
            mo90077b(activity, aVar);
        } else {
            C35444b.m72473a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35444b.AbstractC35447b() {
                /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.C534851 */

                static {
                    Covode.recordClassIndex(63058);
                }

                @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
                /* renamed from: a */
                public final void mo53515a(String[] strArr, int[] iArr) {
                    Activity activity = activity;
                    if (activity != null && !activity.isFinishing()) {
                        if (iArr[0] == 0) {
                            C53484j.this.mo90077b(activity, aVar);
                            return;
                        }
                        Activity activity2 = activity;
                        DialogInterfaceC0216c a = new DialogInterfaceC0216c.C0217a(activity2, R.style.l7).mo445a(R.string.dgi).mo454b(R.string.dgg).mo455b(R.string.a8y, new DialogInterface.OnClickListener(activity2) {
                            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.DialogInterface$OnClickListenerC534873 */

                            /* renamed from: a */
                            final /* synthetic */ Activity f122781a;

                            static {
                                Covode.recordClassIndex(63060);
                            }

                            {
                                this.f122781a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                this.f122781a.finish();
                            }
                        }).mo446a(R.string.as0, new DialogInterface.OnClickListener(activity2) {
                            /* class com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.DialogInterface$OnClickListenerC534862 */

                            /* renamed from: a */
                            final /* synthetic */ Activity f122780a;

                            static {
                                Covode.recordClassIndex(63059);
                            }

                            {
                                this.f122780a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C80310cp.m139213a(this.f122780a);
                            }
                        }).mo453a();
                        try {
                            a.setCancelable(false);
                            a.setCanceledOnTouchOutside(false);
                            a.show();
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo90075a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 2) {
                this.f122776b.mo90080a(m98693a(intent, "mp4"));
            } else if (i == 3) {
                this.f122775a.mo90031a(intent);
            }
        }
    }
}
