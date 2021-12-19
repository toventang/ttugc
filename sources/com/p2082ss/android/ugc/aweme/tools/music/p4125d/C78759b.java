package com.p2082ss.android.ugc.aweme.tools.music.p4125d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78811c;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.b */
public class C78759b extends AbstractC63154aa.AbstractC63163h implements AbstractC40895j {

    /* renamed from: n */
    public static final C78760a f176993n = new C78760a((byte) 0);

    /* renamed from: a */
    public int f176994a = -1;

    /* renamed from: b */
    public int f176995b = -1;

    /* renamed from: c */
    public RecyclerView f176996c;

    /* renamed from: d */
    public AbstractC40896k f176997d;

    /* renamed from: e */
    public AnimatorSet f176998e = new AnimatorSet();

    /* renamed from: f */
    public List<Animator> f176999f = new ArrayList();

    /* renamed from: g */
    public int f177000g = 1;

    /* renamed from: h */
    public boolean f177001h;

    /* renamed from: i */
    public int f177002i;

    /* renamed from: j */
    public Map<String, Boolean> f177003j = new LinkedHashMap();

    /* renamed from: k */
    public Set<String> f177004k = new LinkedHashSet();

    /* renamed from: l */
    public List<? extends MusicModel> f177005l;

    /* renamed from: m */
    public AbstractC40895j f177006m;

    /* renamed from: o */
    private boolean f177007o = true;

    static {
        Covode.recordClassIndex(91902);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemViewType(int i) {
        return i == 0 ? 0 : 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m137485a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b$a */
    public static final class C78760a {
        static {
            Covode.recordClassIndex(91903);
        }

        private C78760a() {
        }

        public /* synthetic */ C78760a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: a */
    public final int mo101596a() {
        return this.f176994a - 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: b */
    public final int mo101602b() {
        return this.f176995b - 1;
    }

    /* renamed from: g */
    public final void mo122597g() {
        this.f176994a = -1;
        this.f176995b = -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: d */
    public final void mo101606d() {
        if (this.f176998e.isRunning()) {
            this.f176998e.cancel();
        }
    }

    /* renamed from: f */
    public final void mo122596f() {
        RecyclerView recyclerView = this.f176996c;
        if (recyclerView != null) {
            recyclerView.post(new RunnableC78762c(this));
        }
    }

    /* renamed from: h */
    public final void mo122598h() {
        RecyclerView recyclerView = this.f176996c;
        if (recyclerView != null) {
            recyclerView.mo4451f(this.f176994a);
        }
    }

    /* renamed from: j */
    private void m137486j() {
        RecyclerView.ViewHolder viewHolder;
        int i = this.f176995b;
        if (i > 0) {
            RecyclerView recyclerView = this.f176996c;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C78811c) {
                ((C78811c) viewHolder).mo122637a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: c */
    public final void mo101605c() {
        RecyclerView.ViewHolder viewHolder;
        int i = this.f176995b;
        if (i > 0) {
            RecyclerView recyclerView = this.f176996c;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C78811c) {
                ((C78811c) viewHolder).mo122640b();
            } else {
                notifyItemChanged(this.f176995b);
            }
        }
    }

    /* renamed from: e */
    public final MusicModel mo122595e() {
        List<? extends MusicModel> list = this.f177005l;
        if (list != null) {
            return (MusicModel) C89070n.m154561b((List) list, this.f176995b - 1);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        int i;
        List<? extends MusicModel> list = this.f177005l;
        if (list != null && list.size() == 0) {
            return 9;
        }
        List<? extends MusicModel> list2 = this.f177005l;
        if (list2 != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        return i + 1;
    }

    /* renamed from: i */
    public final MusicModel mo122599i() {
        List<? extends MusicModel> list = this.f177005l;
        if (list != null) {
            return (MusicModel) C89070n.m154561b((List) list, this.f176994a - 1);
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b$c */
    public static final class RunnableC78762c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78759b f177009a;

        static {
            Covode.recordClassIndex(91905);
        }

        public final void run() {
            this.f177009a.f177001h = true;
            this.f177009a.f177000g = 1;
            this.f177009a.f176999f.clear();
            this.f177009a.f176998e.cancel();
            this.f177009a.f176998e.removeAllListeners();
            this.f177009a.f176998e = new AnimatorSet();
            this.f177009a.f176999f = new ArrayList();
            C78759b bVar = this.f177009a;
            RecyclerView recyclerView = bVar.f176996c;
            RecyclerView.AbstractC1362i layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            bVar.f177002i = ((LinearLayoutManager) layoutManager).mo4373m();
            int i = this.f177009a.f177002i;
            for (int i2 = 1; i2 < i; i2++) {
                C78759b bVar2 = this.f177009a;
                RecyclerView recyclerView2 = bVar2.f176996c;
                RecyclerView.ViewHolder f = recyclerView2 != null ? recyclerView2.mo4451f(i2) : null;
                int i3 = (i2 - 1) * 175;
                if (f instanceof C78811c) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((C78811c) f).f177124a, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.5f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.5f, 1.0f));
                    C89219l.m154716b(ofPropertyValuesHolder, "");
                    ofPropertyValuesHolder.setDuration(700L);
                    ofPropertyValuesHolder.setStartDelay((long) i3);
                    bVar2.f176999f.add(ofPropertyValuesHolder);
                }
            }
            C78759b bVar3 = this.f177009a;
            bVar3.f176998e.playTogether(bVar3.f176999f);
            bVar3.f176998e.start();
            bVar3.f176998e.addListener(new C78761b(bVar3));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC78762c(C78759b bVar) {
            this.f177009a = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: a */
    public final void mo101599a(AbstractC40896k kVar) {
        this.f176997d = kVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b$b */
    public static final class C78761b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78759b f177008a;

        static {
            Covode.recordClassIndex(91904);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78761b(C78759b bVar) {
            this.f177008a = bVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f177008a.f177000g = 3;
            this.f177008a.f176998e.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f177008a.f177000g < 3) {
                this.f177008a.f176998e.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f177008a.f177000g++;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: a */
    public final void mo101597a(int i) {
        this.f176994a = i + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: c */
    public final MusicModel mo101604c(int i) {
        List<? extends MusicModel> list = this.f177005l;
        if (list != null) {
            return (MusicModel) C89070n.m154561b((List) list, i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f176996c = recyclerView;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: b */
    public final void mo101603b(int i) {
        RecyclerView.ViewHolder viewHolder;
        int i2 = this.f176994a;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i2 > 0 && i2 < getItemCount()) {
            RecyclerView recyclerView = this.f176996c;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(this.f176994a);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C78811c) {
                ((C78811c) viewHolder).mo122639a(false);
            } else {
                notifyItemChanged(this.f176994a);
            }
        }
        int i3 = i + 1;
        this.f176994a = i3;
        if (i3 < getItemCount()) {
            RecyclerView recyclerView2 = this.f176996c;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.mo4451f(this.f176994a);
            }
            if (viewHolder2 instanceof C78811c) {
                ((C78811c) viewHolder2).mo122639a(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        List<? extends MusicModel> list;
        MusicModel musicModel;
        String musicId;
        MusicModel musicModel2;
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C78811c) {
            viewHolder.getLayoutPosition();
            int adapterPosition = viewHolder.getAdapterPosition() - 1;
            List<? extends MusicModel> list2 = this.f177005l;
            if (list2 != null && !list2.isEmpty() && (list = this.f177005l) != null && (musicModel = (MusicModel) list.get(adapterPosition)) != null && (musicId = musicModel.getMusicId()) != null) {
                if (this.f177003j.get(musicId) == null || C89219l.m154714a((Object) this.f177003j.get(musicId), (Object) false)) {
                    this.f177003j.put(musicId, true);
                    AbstractC40896k kVar = this.f176997d;
                    if (kVar != null) {
                        kVar.mo70093a(adapterPosition);
                    }
                }
                if (!this.f177004k.contains(musicId)) {
                    List<? extends MusicModel> list3 = this.f177005l;
                    String str = null;
                    if (!(list3 == null || (musicModel2 = (MusicModel) C89070n.m154561b((List) list3, adapterPosition)) == null || musicModel2.getComeFromForMod() != 1)) {
                        C84425b a = new C84425b().mo129406a("item_id", musicModel2.getMusicId());
                        C89219l.m154716b("94349537828", "");
                        C84425b a2 = a.mo129406a("channel_id", "94349537828");
                        LogPbBean logPb = musicModel2.getLogPb();
                        if (logPb != null) {
                            str = logPb.getImprId();
                        }
                        C80322d.m139251a("jarvis_item_show", a2.mo129406a("req_id", str).f188764a);
                    }
                    this.f177004k.add(musicId);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63163h
    /* renamed from: a */
    public final void mo101598a(int i, boolean z) {
        mo101605c();
        this.f176995b = i + 1;
        if (z) {
            m137486j();
        }
    }

    public C78759b(List<? extends MusicModel> list, AbstractC40895j jVar) {
        C89219l.m154721d(jVar, "");
        this.f177005l = list;
        this.f177006m = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
    /* renamed from: a */
    public final void mo70092a(View view, int i) {
        C89219l.m154721d(view, "");
        AbstractC40895j jVar = this.f177006m;
        if (jVar != null) {
            jVar.mo70092a(view, i - 1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MusicModel musicModel;
        boolean z;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C78811c) {
            boolean z2 = false;
            if (i >= this.f177002i) {
                this.f177007o = false;
            }
            C78811c cVar = (C78811c) viewHolder;
            List<? extends MusicModel> list = this.f177005l;
            if (list != null) {
                musicModel = (MusicModel) C89070n.m154561b((List) list, i - 1);
            } else {
                musicModel = null;
            }
            int i2 = this.f176994a;
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            int i3 = this.f176995b;
            if (i2 != i3 && i3 == i) {
                z2 = true;
            }
            cVar.mo122638a(musicModel, z, z2);
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m137485a(C78759b bVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        MethodCollector.m26663i(2750);
        C89219l.m154721d(viewGroup, "");
        if (bVar.getItemViewType(i) != 0) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            C89219l.m154716b(from, "");
            viewHolder = new C78811c(C78811c.C78813a.m137577a(from, viewGroup), bVar);
        } else {
            LayoutInflater from2 = LayoutInflater.from(viewGroup.getContext());
            C89219l.m154716b(from2, "");
            C89219l.m154721d(from2, "");
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(from2, R.layout.dn, viewGroup, false);
            C89219l.m154716b(a2, "");
            viewHolder = new C78814d(a2, bVar);
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
        MethodCollector.m26664o(2750);
        return viewHolder;
    }
}
