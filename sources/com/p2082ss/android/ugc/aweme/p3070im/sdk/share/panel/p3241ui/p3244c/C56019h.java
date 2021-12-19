package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimationImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h */
public final class C56019h extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C56020a f127735b = new C56020a((byte) 0);

    /* renamed from: a */
    public final SharePanelViewModel f127736a;

    /* renamed from: c */
    private final AbstractC89244h f127737c;

    /* renamed from: d */
    private final AbstractC89244h f127738d;

    static {
        Covode.recordClassIndex(65813);
    }

    /* renamed from: a */
    public final AnimationImageView mo92868a() {
        return (AnimationImageView) this.f127737c.getValue();
    }

    /* renamed from: b */
    public final TuxTextView mo92870b() {
        return (TuxTextView) this.f127738d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h$a */
    public static final class C56020a {
        static {
            Covode.recordClassIndex(65814);
        }

        private C56020a() {
        }

        public /* synthetic */ C56020a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h$b */
    static final class C56021b extends AbstractC89220m implements AbstractC89171a<AnimationImageView> {

        /* renamed from: a */
        final /* synthetic */ View f127739a;

        static {
            Covode.recordClassIndex(65815);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56021b(View view) {
            super(0);
            this.f127739a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AnimationImageView invoke() {
            return this.f127739a.findViewById(R.id.f9y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h$d */
    static final class C56024d extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ View f127743a;

        static {
            Covode.recordClassIndex(65818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56024d(View view) {
            super(0);
            this.f127743a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f127743a.findViewById(R.id.f9z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h$c */
    public static final class View$OnClickListenerC56022c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C56019h f127740a;

        /* renamed from: b */
        final /* synthetic */ IMContact f127741b;

        static {
            Covode.recordClassIndex(65816);
        }

        public View$OnClickListenerC56022c(C56019h hVar, IMContact iMContact) {
            this.f127740a = hVar;
            this.f127741b = iMContact;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SharePackage sharePackage = this.f127740a.f127736a.f127873d;
            if (sharePackage != null) {
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                sharePackage.mo109570a(context, (AbstractC69581b) null, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C56019h.View$OnClickListenerC56022c.C560231 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC56022c f127742a;

                    static {
                        Covode.recordClassIndex(65817);
                    }

                    {
                        this.f127742a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f127742a.f127740a.f127736a.mo92937a(this.f127742a.f127741b, true);
                        return C89391z.f203057a;
                    }
                });
                return;
            }
            this.f127740a.f127736a.mo92937a(this.f127741b, true);
        }
    }

    /* renamed from: a */
    public final boolean mo92869a(int i) {
        boolean a = C89064i.m154489a(new Integer[]{1, 3}, Integer.valueOf(i));
        Set<IMContact> b = this.f127736a.mo92938b();
        if ((b == null || b.isEmpty()) && !a) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56019h(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127736a = sharePanelViewModel;
        this.f127737c = C89250i.m154773a((AbstractC89171a) new C56021b(view));
        this.f127738d = C89250i.m154773a((AbstractC89171a) new C56024d(view));
    }
}
