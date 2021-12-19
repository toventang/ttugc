package com.bytedance.android.live.liveinteract.cohost.p279ui.p284e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p279ui.p283d.C4704c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.c */
public final class C4719c extends AbstractC89396c<C4704c, C4720a> {
    static {
        Covode.recordClassIndex(5296);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.c$a */
    public final class C4720a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final AbstractC89244h f12453a;

        /* renamed from: b */
        final /* synthetic */ C4719c f12454b;

        static {
            Covode.recordClassIndex(5297);
        }

        /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.e.c$a$a */
        static final class C4721a extends AbstractC89220m implements AbstractC89171a<LiveTextView> {

            /* renamed from: a */
            final /* synthetic */ View f12455a;

            static {
                Covode.recordClassIndex(5298);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4721a(View view) {
                super(0);
                this.f12455a = view;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ LiveTextView invoke() {
                return this.f12455a.findViewById(R.id.exe);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4720a(C4719c cVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f12454b = cVar;
            this.f12453a = C89250i.m154773a((AbstractC89171a) new C4721a(view));
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ C4720a mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b_d, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C4720a(this, a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(C4720a aVar, C4704c cVar) {
        C4720a aVar2 = aVar;
        C4704c cVar2 = cVar;
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(cVar2, "");
        ((LiveTextView) aVar2.f12453a.getValue()).setText(cVar2.f12433a);
    }
}
