package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p037h.C0792v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.e */
public final class C56007e extends RecyclerView.ViewHolder {

    /* renamed from: e */
    public static final C56009a f127706e = new C56009a((byte) 0);

    /* renamed from: a */
    public final AvatarImageView f127707a;

    /* renamed from: b */
    public final int f127708b = 2131232832;

    /* renamed from: c */
    public IMContact f127709c;

    /* renamed from: d */
    public final SharePanelViewModel f127710d;

    /* renamed from: f */
    private final TextView f127711f;

    /* renamed from: g */
    private final RelativeLayout f127712g;

    static {
        Covode.recordClassIndex(65801);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.e$a */
    public static final class C56009a {
        static {
            Covode.recordClassIndex(65803);
        }

        private C56009a() {
        }

        public /* synthetic */ C56009a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56007e(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        C89219l.m154721d(view, "");
        this.f127710d = sharePanelViewModel;
        View c = C0792v.m2762c(view, (int) R.id.cpq);
        C89219l.m154716b(c, "");
        this.f127711f = (TextView) c;
        View c2 = C0792v.m2762c(view, (int) R.id.clz);
        C89219l.m154716b(c2, "");
        this.f127707a = (AvatarImageView) c2;
        View c3 = C0792v.m2762c(view, (int) R.id.brh);
        C89219l.m154716b(c3, "");
        RelativeLayout relativeLayout = (RelativeLayout) c3;
        this.f127712g = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56007e.View$OnClickListenerC560081 */

            /* renamed from: a */
            final /* synthetic */ C56007e f127713a;

            static {
                Covode.recordClassIndex(65802);
            }

            {
                this.f127713a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!(C55076b.m100723b() == null || C55076b.m100723b().getUnder16Proxy() == null)) {
                    IIMunder16Proxy under16Proxy = C55076b.m100723b().getUnder16Proxy();
                    if (under16Proxy.mo93021c()) {
                        if (under16Proxy != null) {
                            under16Proxy.mo93026h();
                            return;
                        }
                        return;
                    }
                }
                SharePanelViewModel sharePanelViewModel = this.f127713a.f127710d;
                if (sharePanelViewModel != null) {
                    IMContact iMContact = this.f127713a.f127709c;
                    if (iMContact == null) {
                        C89219l.m154715b();
                    }
                    sharePanelViewModel.mo92937a(iMContact, true);
                }
            }
        });
    }
}
