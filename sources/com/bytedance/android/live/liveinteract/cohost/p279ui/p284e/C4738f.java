package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4707f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.f */
public final class C4738f extends AbstractC89396c<C4707f, C4739a> {
    static {
        Covode.recordClassIndex(5315);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.f$a */
    public final class C4739a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f12478a;

        /* renamed from: b */
        final /* synthetic */ C4738f f12479b;

        static {
            Covode.recordClassIndex(5316);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.f$a$a */
        static final class C4740a extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12480a;

            static {
                Covode.recordClassIndex(5317);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4740a(View view) {
                super(0);
                this.f12480a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12480a.findViewById(R.id.exh);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4739a(C4738f fVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12479b = fVar;
            this.f12478a = C89250i.m154773a((AbstractC89171a) new C4740a(view));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4739a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b_8, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C4739a(this, a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4739a aVar, C4707f fVar) {
        C4739a aVar2 = aVar;
        C4707f fVar2 = fVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(fVar2, "");
        ((LiveTextView) aVar2.f12478a.getValue()).setText(fVar2.f12437a);
    }
}
