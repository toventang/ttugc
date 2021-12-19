package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40896k;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.tools.music.p4125d.C78811c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a */
public final class C78745a extends AbstractC39060f<MusicModel> implements AbstractC40895j, AbstractC63154aa.AbstractC63160e {

    /* renamed from: a */
    public boolean f176947a;

    /* renamed from: b */
    public int f176948b;

    /* renamed from: c */
    public boolean f176949c;

    /* renamed from: d */
    public int f176950d = -1;

    /* renamed from: e */
    public int f176951e = -1;

    /* renamed from: f */
    public RecyclerView f176952f;

    /* renamed from: g */
    public ImageView f176953g;

    /* renamed from: h */
    public AnimatorSet f176954h = new AnimatorSet();

    /* renamed from: i */
    public final List<Animator> f176955i = new ArrayList();

    /* renamed from: j */
    public int f176956j = 1;

    /* renamed from: k */
    public Map<String, Boolean> f176957k = new LinkedHashMap();

    /* renamed from: w */
    public AbstractC40896k f176958w;

    /* renamed from: x */
    public AbstractC40895j f176959x;

    /* renamed from: y */
    private boolean f176960y = true;

    static {
        Covode.recordClassIndex(91888);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: c */
    public final int mo60933c() {
        if (C13603b.m24435a((Collection) this.f92236l)) {
            return 9;
        }
        return super.mo60933c();
    }

    /* renamed from: l */
    public final MusicModel mo122582l() {
        List list = this.f92236l;
        if (list != null) {
            return (MusicModel) C89070n.m154561b(list, this.f176950d);
        }
        return null;
    }

    /* renamed from: m */
    public final MusicModel mo122583m() {
        List list = this.f92236l;
        if (list != null) {
            return (MusicModel) C89070n.m154561b(list, this.f176951e);
        }
        return null;
    }

    /* renamed from: n */
    public final void mo122584n() {
        if (this.f176954h.isRunning()) {
            this.f176954h.cancel();
        }
    }

    /* renamed from: p */
    public final void mo122586p() {
        mo101591a(-1);
        this.f176950d = -1;
        this.f176951e = -1;
    }

    /* renamed from: q */
    private void m137461q() {
        RecyclerView.ViewHolder viewHolder;
        int i = this.f176951e;
        if (i >= 0) {
            RecyclerView recyclerView = this.f176952f;
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

    /* renamed from: o */
    public final void mo122585o() {
        RecyclerView.ViewHolder viewHolder;
        int i = this.f176951e;
        if (i >= 0) {
            RecyclerView recyclerView = this.f176952f;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C78811c) {
                ((C78811c) viewHolder).mo122640b();
            } else {
                notifyItemChanged(this.f176951e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$b */
    public static final class RunnableC78747b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78745a f176962a;

        static {
            Covode.recordClassIndex(91890);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4126a.C78745a.RunnableC78747b.run():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC78747b(C78745a aVar) {
            this.f176962a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.a.a$a */
    public static final class C78746a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C78745a f176961a;

        static {
            Covode.recordClassIndex(91889);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78746a(C78745a aVar) {
            this.f176961a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f176961a.f176956j = 3;
            this.f176961a.f176954h.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f176961a.f176956j < 3) {
                this.f176961a.f176954h.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f176961a.f176956j++;
        }
    }

    /* renamed from: d */
    private final int m137460d(int i) {
        if (this.f176947a) {
            return i - 1;
        }
        return i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: c_ */
    public final int mo63367c_(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return (int) C13628n.m24520b(context, 72.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: d */
    public final void mo67829d(boolean z) {
        ImageView imageView;
        super.mo67829d(z);
        if (!z && (imageView = this.f176953g) != null) {
            imageView.clearAnimation();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f176952f = recyclerView;
    }

    /* renamed from: b */
    public final MusicModel mo122581b(int i) {
        List list = this.f92236l;
        if (list != null) {
            return (MusicModel) C89070n.m154561b(list, m137460d(i));
        }
        return null;
    }

    public C78745a(AbstractC40895j jVar) {
        C89219l.m154721d(jVar, "");
        this.f176959x = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa.AbstractC63160e
    /* renamed from: a */
    public final void mo101591a(int i) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount() - 1;
        int i2 = this.f176950d;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i2 >= 0 && itemCount >= i2) {
            RecyclerView recyclerView = this.f176952f;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C78811c) {
                ((C78811c) viewHolder).mo122639a(false);
            } else {
                notifyItemChanged(this.f176950d);
            }
        }
        this.f176950d = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.f176952f;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.mo4451f(this.f176950d);
            }
            if (viewHolder2 instanceof C78811c) {
                ((C78811c) viewHolder2).mo122639a(true);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a_ */
    public final RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        Context context;
        Integer num = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.ag3, viewGroup, false);
        this.f176953g = (ImageView) a.findViewById(R.id.bxi);
        RecyclerView.ViewHolder a_ = super.mo62748a_(viewGroup);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.mo27381c().mo27403a(a));
        RecyclerView.C1367j jVar = new RecyclerView.C1367j(mo63367c_(viewGroup), mo63367c_(viewGroup));
        if (viewGroup == null || (num = Integer.valueOf(viewGroup.getHeight())) == null) {
            C89219l.m154715b();
        }
        jVar.bottomMargin = num.intValue() - mo63367c_(viewGroup);
        dmtStatusView.setLayoutParams(jVar);
        C89219l.m154716b(a_, "");
        return a_;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        List list;
        MusicModel musicModel;
        String musicId;
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof C78811c) {
            viewHolder.getLayoutPosition();
            int adapterPosition = viewHolder.getAdapterPosition();
            List list2 = this.f92236l;
            if (list2 != null && !list2.isEmpty() && (list = this.f92236l) != null && (musicModel = (MusicModel) list.get(adapterPosition)) != null && (musicId = musicModel.getMusicId()) != null) {
                if (this.f176957k.get(musicId) == null || C89219l.m154714a((Object) this.f176957k.get(musicId), (Object) false)) {
                    this.f176957k.put(musicId, true);
                    AbstractC40896k kVar = this.f176958w;
                    if (kVar != null) {
                        kVar.mo70093a(adapterPosition);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    /* renamed from: a */
    public final void mo63355a(RecyclerView.ViewHolder viewHolder) {
        MethodCollector.m26663i(2609);
        super.mo63355a(viewHolder);
        ImageView imageView = this.f176953g;
        if (imageView != null) {
            imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.e6));
            MethodCollector.m26664o(2609);
            return;
        }
        MethodCollector.m26664o(2609);
    }

    /* renamed from: a */
    public final void mo122580a(int i, boolean z) {
        mo122585o();
        this.f176951e = i;
        if (z) {
            m137461q();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        C89219l.m154721d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C89219l.m154716b(from, "");
        return new C78811c(C78811c.C78813a.m137577a(from, viewGroup), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j
    /* renamed from: a */
    public final void mo70092a(View view, int i) {
        C89219l.m154721d(view, "");
        AbstractC40895j jVar = this.f176959x;
        if (jVar != null) {
            jVar.mo70092a(view, m137460d(i));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final void mo60186a(RecyclerView.ViewHolder viewHolder, int i) {
        MusicModel musicModel;
        boolean z;
        C89219l.m154721d(viewHolder, "");
        if (viewHolder instanceof C78811c) {
            boolean z2 = false;
            if (i >= this.f176948b) {
                this.f176960y = false;
            }
            C78811c cVar = (C78811c) viewHolder;
            List list = this.f92236l;
            if (list != null) {
                musicModel = (MusicModel) C89070n.m154561b(list, m137460d(i));
            } else {
                musicModel = null;
            }
            int i2 = this.f176950d;
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            int i3 = this.f176951e;
            if (i2 != i3 && i3 == i) {
                z2 = true;
            }
            cVar.mo122638a(musicModel, z, z2);
        }
    }
}
