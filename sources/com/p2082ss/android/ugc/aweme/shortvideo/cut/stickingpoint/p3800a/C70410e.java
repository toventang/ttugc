package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70066ac;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70091f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70442h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e */
public final class C70410e extends C70582z {

    /* renamed from: i */
    public AbstractC70442h f157351i;

    /* renamed from: j */
    private boolean f157352j;

    static {
        Covode.recordClassIndex(82853);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m124188a(this, viewGroup, i);
    }

    /* renamed from: c */
    public final List<C70066ac> mo110984c() {
        List<C70066ac> list = this.f157924a;
        C89219l.m154716b(list, "");
        return list;
    }

    /* renamed from: d */
    public final boolean mo110985d() {
        if (!C70455f.m124270b() || !this.f157352j) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final int getItemCount() {
        if (mo110985d()) {
            return super.getItemCount() + 1;
        }
        return super.getItemCount();
    }

    /* renamed from: a */
    public final void mo110982a(boolean z) {
        this.f157352j = z;
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$a */
    public final class C70411a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C70410e f157353a;

        static {
            Covode.recordClassIndex(82854);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$a$a */
        static final class View$OnClickListenerC70412a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C70411a f157354a;

            static {
                Covode.recordClassIndex(82855);
            }

            View$OnClickListenerC70412a(C70411a aVar) {
                this.f157354a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC70442h hVar = this.f157354a.f157353a.f157351i;
                if (hVar != null) {
                    hVar.mo110936b(view);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70411a(C70410e eVar, ViewGroup viewGroup) {
            super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aaz, viewGroup, false));
            C89219l.m154721d(viewGroup, "");
            this.f157353a = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$b */
    public final class C70413b extends C70582z.C70585c {

        /* renamed from: d */
        final /* synthetic */ C70410e f157355d;

        static {
            Covode.recordClassIndex(82856);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z.C70585c
        /* renamed from: a */
        public final void mo110987a(C70582z.C70585c cVar) {
            C89219l.m154721d(cVar, "");
            this.itemView.setOnClickListener(new View$OnClickListenerC70414a(this, cVar));
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.e$b$a */
        static final class View$OnClickListenerC70414a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C70413b f157356a;

            /* renamed from: b */
            final /* synthetic */ C70582z.C70585c f157357b;

            static {
                Covode.recordClassIndex(82857);
            }

            View$OnClickListenerC70414a(C70413b bVar, C70582z.C70585c cVar) {
                this.f157356a = bVar;
                this.f157357b = cVar;
            }

            public final void onClick(View view) {
                int b;
                ClickAgent.onClick(view);
                if (this.f157356a.f157355d.f157927d && (b = this.f157356a.f157355d.mo110983b(this.f157357b.getAdapterPosition())) >= 0 && b < this.f157356a.f157355d.f157924a.size()) {
                    C70582z.AbstractC70584b bVar = this.f157356a.f157355d.f157926c;
                    VideoSegment videoSegment = ((C70066ac) this.f157356a.f157355d.f157924a.get(b)).f156680b;
                    C89219l.m154716b(videoSegment, "");
                    bVar.mo110976a(b, videoSegment.mo110571a(true));
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70413b(C70410e eVar, ViewGroup viewGroup) {
            super(viewGroup);
            C89219l.m154721d(viewGroup, "");
            this.f157355d = eVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final void mo110981a(View view) {
        C89219l.m154721d(view, "");
        AbstractC70442h hVar = this.f157351i;
        if (hVar != null) {
            hVar.mo110937c(view);
        }
    }

    /* renamed from: b */
    public final int mo110983b(int i) {
        if (mo110985d()) {
            return i - 1;
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final C70066ac mo110980a(int i) {
        if (!mo110985d()) {
            return super.mo110980a(i);
        }
        if (getItemViewType(i) != 10002) {
            return null;
        }
        return (C70066ac) this.f157924a.get(mo110983b(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final long getItemId(int i) {
        if (!mo110985d()) {
            return super.getItemId(i);
        }
        if (getItemViewType(i) == 10001) {
            return 10001;
        }
        if (getItemViewType(i) == 10003) {
            return 10003;
        }
        return (long) ((C70066ac) this.f157924a.get(mo110983b(i))).f156679a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final int getItemViewType(int i) {
        if (!mo110985d()) {
            return super.getItemViewType(i);
        }
        if (i == 0) {
            return 10001;
        }
        if (mo110983b(i) < this.f157924a.size()) {
            return 10002;
        }
        return 10003;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final int mo110979a(RecyclerView recyclerView, int i) {
        C89219l.m154721d(recyclerView, "");
        if (mo110985d()) {
            i++;
        }
        return super.mo110979a(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C70411a) {
            C70411a aVar = (C70411a) viewHolder;
            aVar.itemView.setOnClickListener(new C70411a.View$OnClickListenerC70412a(aVar));
        } else if (viewHolder instanceof C70413b) {
            ((C70582z.C70585c) viewHolder).mo111350a(mo110980a(i), (C70582z.C70585c) viewHolder);
        }
        super.onBindViewHolder(viewHolder, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.AbstractC70081l, com.p2082ss.android.ugc.aweme.shortvideo.cut.C70582z
    /* renamed from: a */
    public final void mo110558a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(viewHolder2, "");
        if (!mo110985d()) {
            super.mo110558a(viewHolder, viewHolder2);
            return;
        }
        int b = mo110983b(viewHolder.getAdapterPosition());
        int b2 = mo110983b(viewHolder2.getAdapterPosition());
        if (b < this.f157924a.size() && b2 < this.f157924a.size()) {
            int i = ((C70582z.C70585c) viewHolder).f157934b.f156709a;
            int i2 = ((C70582z.C70585c) viewHolder2).f157934b.f156709a;
            mo111341a(i, i2);
            this.f157924a.add(b2, this.f157924a.remove(b));
            notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            this.f157929f.mo110476a(new C70091f(1, i, i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70410e(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        super(videoEditViewModel, cutMultiVideoViewModel, list);
        C89219l.m154721d(videoEditViewModel, "");
        C89219l.m154721d(cutMultiVideoViewModel, "");
        C89219l.m154721d(list, "");
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m124188a(C70410e eVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(12389);
        C89219l.m154721d(viewGroup, "");
        if (i == 10001) {
            viewHolder = new C70411a(eVar, viewGroup);
        } else if (i == 10002) {
            viewHolder = new C70413b(eVar, viewGroup);
        } else {
            viewHolder = super.onCreateViewHolder(viewGroup, i);
            C89219l.m154716b(viewHolder, "");
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = viewHolder.getClass().getName();
        MethodCollector.m26664o(12389);
        return viewHolder;
    }
}
