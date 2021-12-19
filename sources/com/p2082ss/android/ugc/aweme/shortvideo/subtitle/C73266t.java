package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.property.C65339ai;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.t */
public final class C73266t extends RecyclerView.AbstractC1350a<C73268b> {

    /* renamed from: a */
    public int f164522a = -1;

    /* renamed from: b */
    public View f164523b;

    /* renamed from: c */
    public AbstractC73267a f164524c;

    /* renamed from: d */
    public float f164525d;

    /* renamed from: e */
    public float f164526e;

    /* renamed from: f */
    public int f164527f = -1;

    /* renamed from: g */
    public ArrayList<C75313h> f164528g;

    /* renamed from: h */
    private RecyclerView f164529h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.t$a */
    public interface AbstractC73267a {
        static {
            Covode.recordClassIndex(85985);
        }

        /* renamed from: a */
        void mo115722a(int i, int i2);
    }

    static {
        Covode.recordClassIndex(85984);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C73268b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m129328a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f164528g.size();
    }

    public C73266t(ArrayList<C75313h> arrayList) {
        C89219l.m154721d(arrayList, "");
        this.f164528g = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f164529h = recyclerView;
    }

    /* renamed from: a */
    public final void mo115779a(List<C75313h> list) {
        C89219l.m154721d(list, "");
        ArrayList<C75313h> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C75313h(list.get(i)));
        }
        this.f164528g = arrayList;
        notifyDataSetChanged();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.t$d */
    static final class View$OnClickListenerC73270d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73266t f164534a;

        /* renamed from: b */
        final /* synthetic */ int f164535b;

        /* renamed from: c */
        final /* synthetic */ C73268b f164536c;

        static {
            Covode.recordClassIndex(85988);
        }

        View$OnClickListenerC73270d(C73266t tVar, int i, C73268b bVar) {
            this.f164534a = tVar;
            this.f164535b = i;
            this.f164536c = bVar;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            if (this.f164534a.f164527f == this.f164535b) {
                i = this.f164536c.f164530a.getOffsetForPosition(this.f164534a.f164525d, this.f164534a.f164526e);
            } else {
                i = -1;
            }
            AbstractC73267a aVar = this.f164534a.f164524c;
            if (aVar != null) {
                int i2 = this.f164535b;
                if (!C65339ai.m117025a()) {
                    i = this.f164534a.f164528g.get(this.f164535b).getText().length();
                }
                aVar.mo115722a(i2, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo115778a(int i) {
        int i2;
        RecyclerView.ViewHolder viewHolder;
        RecyclerView.ViewHolder f;
        if (i != -1 && i != (i2 = this.f164522a)) {
            this.f164522a = i;
            RecyclerView recyclerView = this.f164529h;
            RecyclerView.ViewHolder viewHolder2 = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder != null) {
                RecyclerView recyclerView2 = this.f164529h;
                if (recyclerView2 != null) {
                    viewHolder2 = recyclerView2.mo4451f(i2);
                }
                Objects.requireNonNull(viewHolder2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleAdapter.SubtitleViewHolder");
                ((C73268b) viewHolder2).f164530a.setTextColor(C40963b.m82473a().getResources().getColor(R.color.ac));
            }
            RecyclerView recyclerView3 = this.f164529h;
            if (recyclerView3 != null && (f = recyclerView3.mo4451f(i)) != null) {
                Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleAdapter.SubtitleViewHolder");
                ((C73268b) f).f164530a.setTextColor(C40963b.m82473a().getResources().getColor(R.color.l));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.t$b */
    public final class C73268b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f164530a;

        /* renamed from: b */
        final /* synthetic */ C73266t f164531b;

        static {
            Covode.recordClassIndex(85986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73268b(C73266t tVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f164531b = tVar;
            View findViewById = view.findViewById(R.id.eb8);
            C89219l.m154716b(findViewById, "");
            this.f164530a = (TextView) findViewById;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.t$c */
    static final class View$OnTouchListenerC73269c implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C73266t f164532a;

        /* renamed from: b */
        final /* synthetic */ int f164533b;

        static {
            Covode.recordClassIndex(85987);
        }

        View$OnTouchListenerC73269c(C73266t tVar, int i) {
            this.f164532a = tVar;
            this.f164533b = i;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            if (motionEvent.getActionMasked() != 0) {
                return false;
            }
            this.f164532a.f164525d = motionEvent.getX();
            this.f164532a.f164526e = motionEvent.getY();
            this.f164532a.f164527f = this.f164533b;
            return false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C73268b bVar, int i) {
        C73268b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        if (this.f164522a == i) {
            bVar2.f164530a.setTextColor(C40963b.m82473a().getResources().getColor(R.color.l));
        } else {
            bVar2.f164530a.setTextColor(C40963b.m82473a().getResources().getColor(R.color.ac));
        }
        bVar2.f164530a.setVisibility(0);
        bVar2.f164530a.setText(this.f164528g.get(i).getText());
        if (!TextUtils.isEmpty(bVar2.f164530a.getText())) {
            bVar2.f164530a.setOnTouchListener(new View$OnTouchListenerC73269c(this, i));
            bVar2.f164530a.setOnClickListener(new View$OnClickListenerC73270d(this, i, bVar2));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m129328a(C73266t tVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11755);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b2h, viewGroup, false);
        C89219l.m154716b(a2, "");
        tVar.f164523b = a2;
        View view = tVar.f164523b;
        if (view == null) {
            C89219l.m154710a("view");
        }
        C73268b bVar = new C73268b(tVar, view);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(11755);
        return bVar;
    }
}
