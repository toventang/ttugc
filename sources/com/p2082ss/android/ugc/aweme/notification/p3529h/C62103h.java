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

/* renamed from: com.ss.android.ugc.aweme.notification.h.h */
public final class C62103h extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public final View f140954a;

    /* renamed from: b */
    private final AbstractC89244h f140955b = C89250i.m154773a((AbstractC89171a) new C62105a(this));

    /* renamed from: c */
    private final AbstractC89244h f140956c = C89250i.m154773a((AbstractC89171a) new C62106b(this));

    static {
        Covode.recordClassIndex(72857);
    }

    /* renamed from: a */
    private final RemoteImageView m112297a() {
        return (RemoteImageView) this.f140955b.getValue();
    }

    /* renamed from: b */
    private final TuxTextView m112298b() {
        return (TuxTextView) this.f140956c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.h$a */
    static final class C62105a extends AbstractC89220m implements AbstractC89171a<RemoteImageView> {

        /* renamed from: a */
        final /* synthetic */ C62103h f140958a;

        static {
            Covode.recordClassIndex(72859);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62105a(C62103h hVar) {
            super(0);
            this.f140958a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RemoteImageView invoke() {
            return this.f140958a.f140954a.findViewById(R.id.buj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.h$b */
    static final class C62106b extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ C62103h f140959a;

        static {
            Covode.recordClassIndex(72860);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62106b(C62103h hVar) {
            super(0);
            this.f140959a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f140959a.f140954a.findViewById(R.id.f63);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62103h(View view, UrlModel urlModel, String str, String str2, final AbstractC89171a<C89391z> aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f140954a = view;
        if (urlModel != null) {
            C34577e.m70592a(m112297a(), urlModel);
        } else if (str != null) {
            C34577e.m70608b(m112297a(), str, -1, -1);
        }
        m112297a().setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.notification.p3529h.C62103h.View$OnClickListenerC621041 */

            static {
                Covode.recordClassIndex(72858);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                aVar.invoke();
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            TuxTextView b = m112298b();
            C89219l.m154716b(b, "");
            b.setVisibility(0);
            TuxTextView b2 = m112298b();
            C89219l.m154716b(b2, "");
            b2.setText(str2);
            C46579b.m89899a(m112298b());
        }
    }
}
