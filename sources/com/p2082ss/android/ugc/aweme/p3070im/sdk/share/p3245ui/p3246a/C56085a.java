package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3246a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.viewmodel.ShareDialogViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56216k;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.a.a */
public final class C56085a {

    /* renamed from: a */
    public final TuxStatusView f127911a;

    /* renamed from: b */
    public final Activity f127912b;

    /* renamed from: c */
    public final ShareDialogViewModel f127913c;

    static {
        Covode.recordClassIndex(65884);
    }

    /* renamed from: a */
    public final void mo92948a() {
        this.f127911a.setVisibility(8);
    }

    public C56085a(TuxStatusView tuxStatusView, Activity activity, ShareDialogViewModel shareDialogViewModel, AbstractC1204m mVar) {
        C89219l.m154721d(tuxStatusView, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(shareDialogViewModel, "");
        C89219l.m154721d(mVar, "");
        this.f127911a = tuxStatusView;
        this.f127912b = activity;
        this.f127913c = shareDialogViewModel;
        shareDialogViewModel.f128113c.observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3246a.C56085a.C560861 */

            /* renamed from: a */
            final /* synthetic */ C56085a f127914a;

            static {
                Covode.recordClassIndex(65885);
            }

            {
                this.f127914a = r1;
            }

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.a.a$1$a */
            static final class C56087a extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C560861 f127915a;

                static {
                    Covode.recordClassIndex(65886);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C56087a(C560861 r2) {
                    super(1);
                    this.f127915a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
                    TuxButton tuxButton2 = tuxButton;
                    C89219l.m154721d(tuxButton2, "");
                    tuxButton2.setButtonVariant(0);
                    tuxButton2.setButtonSize(3);
                    tuxButton2.setText(R.string.cgf);
                    tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3246a.C56085a.C560861.C56087a.View$OnClickListenerC560881 */

                        /* renamed from: a */
                        final /* synthetic */ C56087a f127916a;

                        static {
                            Covode.recordClassIndex(65887);
                        }

                        {
                            this.f127916a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f127916a.f127915a.f127914a.f127913c.f128116f.postValue(true);
                        }
                    });
                    return C89391z.f203057a;
                }
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                View findViewById;
                if (((List) obj).isEmpty()) {
                    Context context = this.f127914a.f127911a.getContext();
                    TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                    String string = context.getString(R.string.cge);
                    C89219l.m154716b(string, "");
                    TuxStatusView.C23263c a = cVar.mo37879a(string);
                    String string2 = context.getString(R.string.cgd);
                    C89219l.m154716b(string2, "");
                    TuxStatusView.C23263c a2 = a.mo37878a((CharSequence) string2);
                    a2.f55132j = new C56087a(this);
                    this.f127914a.f127911a.setStatus(a2);
                    if (C56216k.m102134d() && (findViewById = this.f127914a.f127911a.findViewById(R.id.bka)) != null) {
                        findViewById.setVisibility(8);
                    }
                    this.f127914a.f127911a.setVisibility(0);
                    return;
                }
                this.f127914a.mo92948a();
            }
        });
        shareDialogViewModel.f128112b.observe(mVar, new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.p3246a.C56085a.C560892 */

            /* renamed from: a */
            final /* synthetic */ C56085a f127917a;

            static {
                Covode.recordClassIndex(65888);
            }

            {
                this.f127917a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                if (((List) obj).isEmpty()) {
                    if (C56216k.m102134d()) {
                        View findViewById = this.f127917a.f127911a.findViewById(R.id.bka);
                        if (findViewById == null) {
                            View a = C1764a.m5927a(LayoutInflater.from(this.f127917a.f127912b), R.layout.a7i, this.f127917a.f127911a, false);
                            this.f127917a.f127911a.addView(a);
                            C89219l.m154716b(a, "");
                            a.setVisibility(0);
                        } else {
                            findViewById.setVisibility(0);
                        }
                    } else {
                        Context context = this.f127917a.f127911a.getContext();
                        TuxStatusView.C23263c a2 = new TuxStatusView.C23263c().mo37876a(1, 2131232925);
                        String string = context.getString(R.string.cgx);
                        C89219l.m154716b(string, "");
                        TuxStatusView.C23263c a3 = a2.mo37879a(string);
                        String string2 = context.getString(R.string.cgw);
                        C89219l.m154716b(string2, "");
                        this.f127917a.f127911a.setStatus(a3.mo37878a((CharSequence) string2));
                    }
                    this.f127917a.f127911a.setVisibility(0);
                    return;
                }
                this.f127917a.mo92948a();
            }
        });
    }
}
