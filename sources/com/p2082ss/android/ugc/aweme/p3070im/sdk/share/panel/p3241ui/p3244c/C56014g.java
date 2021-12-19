package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g */
public final class C56014g extends RecyclerView.ViewHolder {

    /* renamed from: d */
    public static final C56018a f127727d = new C56018a((byte) 0);

    /* renamed from: a */
    public final AvatarImageView f127728a;

    /* renamed from: b */
    public final int f127729b = 2131232832;

    /* renamed from: c */
    public IMContact f127730c;

    static {
        Covode.recordClassIndex(65808);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.g$a */
    public static final class C56018a {
        static {
            Covode.recordClassIndex(65812);
        }

        private C56018a() {
        }

        public /* synthetic */ C56018a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56014g(View view, final SharePanelViewModel sharePanelViewModel) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(sharePanelViewModel, "");
        View findViewById = view.findViewById(R.id.a5k);
        C89219l.m154716b(findViewById, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById;
        this.f127728a = avatarImageView;
        avatarImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56014g.View$OnClickListenerC560151 */

            /* renamed from: a */
            final /* synthetic */ C56014g f127731a;

            static {
                Covode.recordClassIndex(65809);
            }

            {
                this.f127731a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                final C560161 r4 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56014g.View$OnClickListenerC560151.C560161 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC560151 f127733a;

                    static {
                        Covode.recordClassIndex(65810);
                    }

                    {
                        this.f127733a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        mo92867a();
                        return C89391z.f203057a;
                    }

                    /* renamed from: a */
                    public final void mo92867a() {
                        if (C55076b.m100723b().getUnder16Proxy() != null) {
                            IIMunder16Proxy under16Proxy = C55076b.m100723b().getUnder16Proxy();
                            if (under16Proxy.mo93021c()) {
                                if (under16Proxy != null) {
                                    under16Proxy.mo93026h();
                                    return;
                                }
                                return;
                            }
                        }
                        SharePanelViewModel sharePanelViewModel = sharePanelViewModel;
                        IMContact iMContact = this.f127733a.f127731a.f127730c;
                        if (iMContact == null) {
                            C89219l.m154715b();
                        }
                        sharePanelViewModel.mo92937a(iMContact, true);
                    }
                };
                SharePackage sharePackage = sharePanelViewModel.f127873d;
                if (sharePackage != null) {
                    C89219l.m154716b(view, "");
                    Context context = view.getContext();
                    C89219l.m154716b(context, "");
                    sharePackage.mo109570a(context, (AbstractC69581b) null, new AbstractC89171a<C89391z>() {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56014g.View$OnClickListenerC560151.C560172 */

                        static {
                            Covode.recordClassIndex(65811);
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            r4.mo92867a();
                            return C89391z.f203057a;
                        }
                    });
                    return;
                }
                r4.mo92867a();
            }
        });
    }
}
