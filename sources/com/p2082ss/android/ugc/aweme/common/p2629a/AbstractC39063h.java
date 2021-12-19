package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.a.h */
public abstract class AbstractC39063h extends AbstractC39073l {

    /* renamed from: o */
    static final String f92239o = AbstractC39063h.class.getSimpleName();

    /* renamed from: a */
    private long f92240a = -1;

    /* renamed from: b */
    private boolean f92241b = false;

    /* renamed from: c */
    private final RecyclerView.AbstractC1371n f92242c = new RecyclerView.AbstractC1371n() {
        /* class com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.C390641 */

        static {
            Covode.recordClassIndex(46680);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            if (i2 >= 0 && AbstractC39063h.this.mo67822h()) {
                recyclerView.mo4479i();
            }
        }
    };

    /* renamed from: d */
    private final RecyclerView.AbstractC1369l f92243d = new RecyclerView.AbstractC1369l() {
        /* class com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.C390652 */

        static {
            Covode.recordClassIndex(46681);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1369l
        /* renamed from: a */
        public final boolean mo4749a(int i, int i2) {
            if (i2 < 0) {
                return false;
            }
            return AbstractC39063h.this.mo67822h();
        }
    };

    /* renamed from: p */
    public String f92244p;

    /* renamed from: q */
    public RecyclerView f92245q;

    /* renamed from: r */
    public AbstractC39067a f92246r;

    /* renamed from: s */
    public GridLayoutManager.AbstractC1337c f92247s;

    /* renamed from: t */
    public AbstractC39074m f92248t;

    /* renamed from: u */
    public final C39068b f92249u = new C39068b();

    /* renamed from: com.ss.android.ugc.aweme.common.a.h$a */
    public interface AbstractC39067a {
        static {
            Covode.recordClassIndex(46683);
        }

        /* renamed from: l */
        void mo62679l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo67817b(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo67821g() {
        return false;
    }

    public void aq_() {
        mo67818c(false);
    }

    static {
        Covode.recordClassIndex(46679);
    }

    public void ap_() {
        this.f92249u.f92255b = 1;
        mo63369e();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        if (mo60933c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: i */
    public final void mo67823i() {
        this.f92249u.f92255b = 2;
        mo63369e();
    }

    /* renamed from: j */
    public final void mo67824j() {
        RecyclerView recyclerView = this.f92245q;
        if (recyclerView != null) {
            mo67812a(recyclerView, true);
        }
    }

    /* renamed from: k */
    public final void mo67825k() {
        mo67814a(C17867d.m33078a().getString(R.string.b3f));
    }

    /* renamed from: e */
    private void mo63369e() {
        if (this.f92274v && this.f92245q != null) {
            this.f92245q.post(new RunnableC39070i(this, new RuntimeException("Notify when recyclerview scroll or layout")));
        }
    }

    public void ao_() {
        this.f92249u.f92255b = 0;
        mo63369e();
        if (this.f92240a == -1) {
            this.f92240a = System.currentTimeMillis();
        }
    }

    /* renamed from: h */
    public final boolean mo67822h() {
        if (this.f92245q != null && mo67821g() && this.f92241b && !this.f92245q.canScrollVertically(1)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.common.a.h$b */
    public static class C39068b {

        /* renamed from: a */
        public boolean f92254a;

        /* renamed from: b */
        public int f92255b = -1;

        /* renamed from: c */
        public CharSequence f92256c = C17867d.m33078a().getString(R.string.cxi);

        /* renamed from: d */
        public int f92257d = -16777216;

        /* renamed from: e */
        public MovementMethod f92258e;

        /* renamed from: f */
        public CharSequence f92259f = C17867d.m33078a().getString(R.string.cxh);

        /* renamed from: g */
        public int f92260g = -16777216;

        static {
            Covode.recordClassIndex(46684);
        }

        protected C39068b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.a.h$c */
    public class C39069c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        C39072k f92261a;

        /* renamed from: c */
        private final TextView f92263c;

        /* renamed from: d */
        private final TextView f92264d;

        static {
            Covode.recordClassIndex(46685);
        }

        /* renamed from: a */
        public void mo67826a() {
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            this.f92264d.setText(AbstractC39063h.this.f92249u.f92259f);
            this.f92264d.setTextColor(AbstractC39063h.this.f92249u.f92260g);
            this.f92263c.setText(AbstractC39063h.this.f92249u.f92256c);
            this.f92263c.setTextColor(AbstractC39063h.this.f92249u.f92257d);
            if (AbstractC39063h.this.f92249u.f92258e != null) {
                this.f92263c.setMovementMethod(AbstractC39063h.this.f92249u.f92258e);
            }
            if (AbstractC39063h.this.f92249u.f92255b == -1) {
                dmtStatusView.mo27382d();
                if (AbstractC39063h.this.f92249u.f92254a) {
                    dmtStatusView.setVisibility(8);
                }
            } else if (AbstractC39063h.this.f92249u.f92255b == 1) {
                dmtStatusView.mo27385g();
            } else if (AbstractC39063h.this.f92249u.f92255b == 0) {
                dmtStatusView.mo27382d();
                dmtStatusView.mo27384f();
            } else if (AbstractC39063h.this.f92249u.f92255b == 2) {
                RecyclerView recyclerView = AbstractC39063h.this.f92245q;
                DmtStatusView dmtStatusView2 = (DmtStatusView) this.itemView;
                if (!TextUtils.equals(this.f92264d.getText(), this.f92264d.getResources().getString(R.string.eyo))) {
                    this.f92264d.setText(R.string.eyo);
                }
                dmtStatusView2.mo27387h();
                if (this.f92261a == null) {
                    this.f92261a = new C39072k(recyclerView, AbstractC39063h.this.f92246r);
                }
                this.f92261a.f92268a = true;
            }
            if (dmtStatusView.mo27383e() && AbstractC39063h.this.f92246r != null) {
                AbstractC39063h.this.f92246r.mo62679l();
            }
        }

        public C39069c(ViewGroup viewGroup) {
            super(new DmtStatusView(viewGroup.getContext()));
            MethodCollector.m26663i(13377);
            DmtStatusView dmtStatusView = (DmtStatusView) this.itemView;
            int c_ = AbstractC39063h.this.mo63367c_(viewGroup);
            AbstractC39063h.this.mo67817b((View) dmtStatusView);
            dmtStatusView.setLayoutParams(new RecyclerView.C1367j(-1, c_));
            TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
            this.f92263c = textView;
            textView.setGravity(17);
            TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.big, (ViewGroup) null);
            this.f92264d = textView2;
            textView2.setText(R.string.cxh);
            textView2.setGravity(17);
            dmtStatusView.setBuilder(DmtStatusView.C17269a.m31905a(viewGroup.getContext()).mo27406b(textView).mo27408c(textView2));
            textView2.setOnClickListener(new View$OnClickListenerC39071j(this));
            MethodCollector.m26664o(13377);
        }
    }

    /* renamed from: a */
    public void mo67813a(AbstractC39067a aVar) {
        this.f92246r = aVar;
    }

    /* renamed from: f */
    public final void mo67819f(int i) {
        mo67820g(i);
    }

    /* renamed from: a */
    public final void mo67811a(MovementMethod movementMethod) {
        this.f92249u.f92258e = movementMethod;
        mo63369e();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a_ */
    public RecyclerView.ViewHolder mo62748a_(ViewGroup viewGroup) {
        return mo67816b(viewGroup);
    }

    /* renamed from: b */
    public final RecyclerView.ViewHolder mo67816b(ViewGroup viewGroup) {
        return new C39069c(viewGroup);
    }

    /* renamed from: g */
    public final void mo67820g(int i) {
        this.f92249u.f92257d = i;
        mo63369e();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public void mo63355a(RecyclerView.ViewHolder viewHolder) {
        ((C39069c) viewHolder).mo67826a();
    }

    /* renamed from: c_ */
    public int mo63367c_(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.gz);
    }

    /* renamed from: c */
    public final void mo67818c(boolean z) {
        if (z) {
            this.f92249u.f92254a = true;
        }
        this.f92249u.f92255b = -1;
        mo63369e();
        this.f92240a = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo4418b(this.f92242c);
        if (recyclerView.getOnFlingListener() == this.f92243d) {
            recyclerView.setOnFlingListener(null);
        }
    }

    /* renamed from: a */
    public final void mo67814a(CharSequence charSequence) {
        this.f92249u.f92256c = charSequence;
        mo63369e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f92245q = recyclerView;
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
                /* class com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.C390663 */

                static {
                    Covode.recordClassIndex(46682);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
                /* renamed from: a */
                public final int mo4342a(int i) {
                    int itemViewType = AbstractC39063h.this.getItemViewType(i);
                    if (itemViewType == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4316b;
                    }
                    if (AbstractC39063h.this.f92248t != null) {
                        return AbstractC39063h.this.f92248t.mo67830b(itemViewType);
                    }
                    if (AbstractC39063h.this.f92247s != null) {
                        return AbstractC39063h.this.f92247s.mo4342a(i);
                    }
                    return 1;
                }
            });
        }
        recyclerView.mo4405a(this.f92242c);
        if (recyclerView.getOnFlingListener() == null) {
            recyclerView.setOnFlingListener(this.f92243d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.C1385b)) {
            StaggeredGridLayoutManager.C1385b bVar = (StaggeredGridLayoutManager.C1385b) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            bVar.f4602b = z;
        }
        if (viewHolder instanceof C39069c) {
            this.f92241b = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.f92240a != -1 && !TextUtils.isEmpty(this.f92244p)) {
            C34611o.m70670b("aweme_feed_load_more_duration", this.f92244p, (float) (System.currentTimeMillis() - this.f92240a));
            this.f92240a = -1;
        }
        if (viewHolder instanceof C39069c) {
            this.f92241b = false;
        }
    }

    /* renamed from: a */
    public void mo67815a(Exception exc) {
        if (this.f92274v && getItemCount() > 0) {
            notifyItemChanged(getItemCount() - 1);
        }
    }

    /* renamed from: a */
    public final void mo67812a(RecyclerView recyclerView, boolean z) {
        this.f92249u.f92255b = 2;
        mo63369e();
        if (z) {
            new C23144b(recyclerView).mo37640e(R.string.cxg).mo37637b();
        }
    }
}
