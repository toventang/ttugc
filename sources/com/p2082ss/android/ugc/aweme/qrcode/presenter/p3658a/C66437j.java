package com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.C0569a;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66405g;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.aweme.utils.C80310cp;

/* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.j */
public final class C66437j {

    /* renamed from: a */
    protected AbstractC66443a f149361a;

    /* renamed from: b */
    protected ActivityC0945e f149362b;

    /* renamed from: c */
    public String f149363c = "";

    /* renamed from: com.ss.android.ugc.aweme.qrcode.presenter.a.j$a */
    public interface AbstractC66443a {
        static {
            Covode.recordClassIndex(77977);
        }

        /* renamed from: d */
        void mo105292d();

        /* renamed from: e */
        void mo105293e();

        View getView();
    }

    static {
        Covode.recordClassIndex(77971);
    }

    /* renamed from: b */
    public final void mo105361b() {
        this.f149361a = null;
        this.f149362b = null;
    }

    /* renamed from: c */
    public final void mo105362c() {
        this.f149361a.mo105292d();
        C29339a.m58754b(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.RunnableC664381 */

            static {
                Covode.recordClassIndex(77972);
            }

            public final void run() {
                if (TextUtils.isEmpty(C66437j.this.f149363c)) {
                    C66437j.this.f149363c = C13607d.m24442b(new StringBuilder().append(System.currentTimeMillis()).toString()) + ".png";
                }
                if (C66437j.this.f149361a != null) {
                    final Uri a = C66405g.m118107a(C66437j.this.f149361a.getView(), C66437j.this.f149363c, C66437j.this.f149362b);
                    C29339a.m58754b(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.RunnableC664381.RunnableC664391 */

                        static {
                            Covode.recordClassIndex(77973);
                        }

                        public final void run() {
                            if (C66437j.this.f149361a != null) {
                                C66437j.this.f149361a.mo105293e();
                            }
                        }
                    });
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo105360a() {
        if (C0643b.m2367a(this.f149362b, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            mo105362c();
        } else {
            mo105363d();
        }
    }

    /* renamed from: d */
    public final void mo105363d() {
        C35444b.m72473a(this.f149362b, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35444b.AbstractC35447b() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.C664402 */

            static {
                Covode.recordClassIndex(77974);
            }

            @Override // com.p2082ss.android.ugc.aweme.p2440ce.C35444b.AbstractC35447b
            /* renamed from: a */
            public final void mo53515a(String[] strArr, int[] iArr) {
                if (iArr.length > 0 && iArr[0] == -1 && !C0569a.m2183a((Activity) C66437j.this.f149362b, strArr[0])) {
                    C80273bt.m139144a(C66437j.this.f149362b, new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.C664402.DialogInterface$OnClickListenerC664411 */

                        static {
                            Covode.recordClassIndex(77975);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                        }
                    }, new DialogInterface.OnClickListener() {
                        /* class com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.C664402.DialogInterface$OnClickListenerC664422 */

                        static {
                            Covode.recordClassIndex(77976);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C80310cp.m139213a(C66437j.this.f149362b);
                        }
                    }).show();
                }
            }
        });
    }
}
