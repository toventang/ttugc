package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.az */
public final class C62083az extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final View f140924a;

    /* renamed from: b */
    private final AbstractC89244h f140925b = C89250i.m154773a((AbstractC89171a) new C62085a(this));

    /* renamed from: c */
    private final AbstractC89244h f140926c = C89250i.m154773a((AbstractC89171a) new C62086b(this));

    static {
        Covode.recordClassIndex(72837);
    }

    /* renamed from: a */
    private final RemoteImageView m112277a() {
        return (RemoteImageView) this.f140925b.getValue();
    }

    /* renamed from: b */
    private final TuxTextView m112278b() {
        return (TuxTextView) this.f140926c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.az$a */
    static final class C62085a extends AbstractC89220m implements AbstractC89171a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ C62083az f140928a;

        static {
            Covode.recordClassIndex(72839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62085a(C62083az azVar) {
            super(0);
            this.f140928a = azVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.f140928a.f140924a.findViewById(R.id.buj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.az$b */
    static final class C62086b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C62083az f140929a;

        static {
            Covode.recordClassIndex(72840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62086b(C62083az azVar) {
            super(0);
            this.f140929a = azVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140929a.f140924a.findViewById(R.id.f63);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62083az(View view, UrlModel urlModel, String str, String str2, final AbstractC89171a<C89391z> aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f140924a = view;
        if (urlModel != null) {
            C34577e.m70592a(m112277a(), urlModel);
        } else if (str != null) {
            C34577e.m70608b(m112277a(), str, -1, -1);
        }
        m112277a().setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.C62083az.View$OnClickListenerC620841 */

            static {
                Covode.recordClassIndex(72838);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.invoke();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            TuxTextView b = m112278b();
            C89219l.m154716b(b, "");
            b.setVisibility(0);
            TuxTextView b2 = m112278b();
            C89219l.m154716b(b2, "");
            b2.setText(str2);
            C46579b.m89899a(m112278b());
        }
    }
}
