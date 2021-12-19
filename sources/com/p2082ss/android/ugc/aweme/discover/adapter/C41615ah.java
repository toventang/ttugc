package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.C0823h;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.mob.C42462k;
import com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41954a;
import com.p2082ss.android.ugc.aweme.discover.p2777k.C42175a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ah */
public final class C41615ah extends AbstractView$OnAttachStateChangeListenerC41671b implements AbstractC41954a {

    /* renamed from: a */
    public static final C41616a f97051a = new C41616a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f97052b = C89250i.m154773a((AbstractC89171a) C41617b.f97053a);

    static {
        Covode.recordClassIndex(49528);
    }

    /* renamed from: c */
    private final C42175a.C42176a m83566c() {
        return (C42175a.C42176a) this.f97052b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ah$a */
    public static final class C41616a {
        static {
            Covode.recordClassIndex(49529);
        }

        private C41616a() {
        }

        public /* synthetic */ C41616a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C41615ah m83569a(ViewGroup viewGroup) {
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.awd, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C41615ah(a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42642ah
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo70833b() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ah$b */
    static final class C41617b extends AbstractC89220m implements AbstractC89171a<C42175a.C42176a> {

        /* renamed from: a */
        public static final C41617b f97053a = new C41617b();

        static {
            Covode.recordClassIndex(49530);
        }

        C41617b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C42175a.C42176a invoke() {
            return C42175a.m84430a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2773h.AbstractC41954a
    /* renamed from: a */
    public final void mo60336a() {
        new C42462k().mo71677a(mo70877F().f151314i).mo96792f();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41615ah(View view) {
        super(view);
        C89219l.m154721d(view, "");
        if (m83566c() == null) {
            view.setVisibility(8);
        } else {
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ap4);
            C89219l.m154716b(tuxTextView, "");
            C42175a.C42176a c = m83566c();
            if (c == null) {
                C89219l.m154715b();
            }
            tuxTextView.setText(c.getUserNote());
        }
        C0823h.m2917e((TextView) view.findViewById(R.id.ap4), (int) C13628n.m24520b(view.getContext(), 17.0f));
    }
}
