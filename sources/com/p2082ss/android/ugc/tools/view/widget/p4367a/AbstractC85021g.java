package com.p2082ss.android.ugc.tools.view.widget.p4367a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.a.g */
public abstract class AbstractC85021g extends AbstractC85016d implements AbstractC85027b<EnumC85026a> {

    /* renamed from: c */
    public EnumC85026a f190201c;

    /* renamed from: d */
    public AbstractC89171a<C89391z> f190202d;

    static {
        Covode.recordClassIndex(99042);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract RecyclerView.ViewHolder mo129590a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo129591a(RecyclerView.ViewHolder viewHolder, EnumC85026a aVar);

    /* Return type fixed from 'java.lang.Enum' to match base method */
    @Override // com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b
    public /* bridge */ /* synthetic */ EnumC85026a getState() {
        return this.f190201c;
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.a.g$a */
    static final class RunnableC85022a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC85021g f190203a;

        static {
            Covode.recordClassIndex(99043);
        }

        RunnableC85022a(AbstractC85021g gVar) {
            this.f190203a = gVar;
        }

        public final void run() {
            AbstractC89171a<C89391z> aVar = this.f190203a.f190202d;
            if (aVar != null && this.f190203a.f190201c == EnumC85026a.NONE) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AbstractC85021g(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        super(aVar, true);
        C89219l.m154721d(aVar, "");
        this.f190201c = EnumC85026a.NONE;
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85016d
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo129944b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return mo129590a(viewGroup);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4367a.AbstractC85016d
    /* renamed from: a */
    public final void mo129943a(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        mo129591a(viewHolder, this.f190201c);
        viewHolder.itemView.post(new RunnableC85022a(this));
    }

    /* renamed from: a */
    public final void setState(EnumC85026a aVar) {
        C89219l.m154721d(aVar, "");
        this.f190201c = aVar;
        notifyItemChanged(getItemCount() - 1);
    }

    public /* synthetic */ AbstractC85021g(RecyclerView.AbstractC1350a aVar, byte b) {
        this(aVar);
    }
}
