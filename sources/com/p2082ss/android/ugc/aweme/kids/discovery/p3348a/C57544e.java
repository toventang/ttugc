package com.p2082ss.android.ugc.aweme.kids.discovery.p3348a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57550f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.e */
public final class C57544e extends C57540c {

    /* renamed from: i */
    public static final C57546a f131368i = new C57546a((byte) 0);

    /* renamed from: g */
    public AbstractC57547b f131369g = new C57536a();

    /* renamed from: h */
    public AbstractC57548c f131370h;

    /* renamed from: j */
    private int f131371j = -1;

    /* renamed from: k */
    private C57550f f131372k;

    /* renamed from: l */
    private boolean f131373l;

    /* renamed from: m */
    private View f131374m;

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.e$b */
    public static abstract class AbstractC57547b {
        static {
            Covode.recordClassIndex(67497);
        }

        /* renamed from: a */
        public abstract View mo94888a(ViewGroup viewGroup, C57544e eVar);

        /* renamed from: a */
        public abstract void mo94889a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.e$c */
    public interface AbstractC57548c {
        static {
            Covode.recordClassIndex(67498);
        }

        /* renamed from: a */
        void mo94898a();
    }

    static {
        Covode.recordClassIndex(67494);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.e$a */
    public static final class C57546a {
        static {
            Covode.recordClassIndex(67496);
        }

        private C57546a() {
        }

        public /* synthetic */ C57546a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.a.e$d */
    public static final class RunnableC57549d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C57544e f131376a;

        /* renamed from: b */
        final /* synthetic */ int f131377b;

        static {
            Covode.recordClassIndex(67499);
        }

        RunnableC57549d(C57544e eVar, int i) {
            this.f131376a = eVar;
            this.f131377b = i;
        }

        public final void run() {
            this.f131376a.f131369g.mo94889a(this.f131377b);
        }
    }

    /* renamed from: a */
    public final void mo94894a() {
        if (!this.f131373l && this.f131371j == 1) {
            this.f131373l = true;
            AbstractC57548c cVar = this.f131370h;
            if (cVar != null) {
                cVar.mo94898a();
            }
        }
    }

    /* renamed from: c */
    private final void m104259c(int i) {
        RecyclerView recyclerView = this.f131359e;
        if (recyclerView != null) {
            recyclerView.post(new RunnableC57549d(this, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo94896b(int i) {
        if (this.f131371j != i) {
            this.f131371j = i;
            m104259c(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57540c, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo4418b(this.f131372k);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57540c, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (this.f131374m == viewHolder.itemView) {
            mo94894a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57544e(RecyclerView.AbstractC1350a<RecyclerView.ViewHolder> aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
        C57550f fVar = new C57550f();
        this.f131372k = fVar;
        C575451 r0 = new C57550f.AbstractC57551a(this) {
            /* class com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57544e.C575451 */

            /* renamed from: a */
            final /* synthetic */ C57544e f131375a;

            static {
                Covode.recordClassIndex(67495);
            }

            @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57550f.AbstractC57551a
            /* renamed from: a */
            public final void mo94897a() {
                this.f131375a.mo94894a();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f131375a = r1;
            }
        };
        C89219l.m154721d(r0, "");
        fVar.f131378a = r0;
    }

    /* renamed from: a */
    public final void mo94895a(int i) {
        if (i != 0) {
            this.f131373l = false;
            mo94896b(i);
            return;
        }
        throw new IllegalArgumentException("STATE_INIT only can be set in the LoadMoreAdapterWrapper");
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.discovery.p3348a.C57540c, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.f131374m == null) {
            this.f131374m = this.f131369g.mo94888a(recyclerView, this);
            this.f131369g.mo94889a(0);
            View view = this.f131374m;
            if (view == null) {
                C89219l.m154715b();
            }
            mo94893a(view);
        }
        recyclerView.mo4405a(this.f131372k);
    }
}
