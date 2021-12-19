package com.bytedance.android.live.core.paging.p224a;

import android.database.Observable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import androidx.p053i.AbstractC1036i;
import androidx.p053i.AbstractC1044j;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.android.live.base.model.C2964c;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.core.paging.a.b */
public abstract class AbstractC3971b<T> extends AbstractC1044j<T, RecyclerView.ViewHolder> {

    /* renamed from: a */
    public PagingViewModel<T> f10882a;

    /* renamed from: b */
    public C3884b.EnumC3885a f10883b = null;

    /* renamed from: c */
    public C3884b.EnumC3885a f10884c = null;

    /* renamed from: d */
    public boolean f10885d;

    /* renamed from: e */
    public boolean f10886e;

    /* renamed from: f */
    public boolean f10887f = true;

    /* renamed from: g */
    public boolean f10888g = true;

    /* renamed from: h */
    public boolean f10889h = true;

    /* renamed from: i */
    public final AbstractC3971b<T>.C3974b f10890i;

    /* renamed from: j */
    private final AbstractC1214u<AbstractC1036i<T>> f10891j = new C3979c(this);

    /* renamed from: k */
    private final AbstractC1214u<C3884b> f10892k = new C3980d(this);

    /* renamed from: l */
    private final AbstractC1214u<C3884b> f10893l = new AbstractC1214u<C3884b>() {
        /* class com.bytedance.android.live.core.paging.p224a.AbstractC3971b.C39721 */

        static {
            Covode.recordClassIndex(4503);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C3884b bVar) {
            C3884b bVar2 = bVar;
            if (bVar2 != null) {
                AbstractC3971b.this.f10884c = bVar2.f10741a;
                AbstractC3971b bVar3 = AbstractC3971b.this;
                bVar3.mo9334a(bVar3.f10883b);
            }
        }
    };

    /* renamed from: m */
    private final AbstractC1214u<Boolean> f10894m = new C3981e(this);

    /* renamed from: n */
    private final AbstractC1214u<Boolean> f10895n = new C3982f(this);

    /* renamed from: o */
    private final AbstractC1214u<Integer> f10896o = new C3983g(this);

    /* renamed from: p */
    private boolean f10897p = false;

    /* renamed from: q */
    private boolean f10898q;

    /* renamed from: r */
    private final AbstractC3971b<T>.C3975c f10899r;

    static {
        Covode.recordClassIndex(4502);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9330a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract RecyclerView.ViewHolder mo9340b(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m9687a(this, viewGroup, i);
    }

    /* renamed from: a */
    public final void mo9337a(boolean z) {
        if (this.f10898q == z || this.f10886e) {
            this.f10898q = z;
            return;
        }
        this.f10898q = z;
        notifyDataSetChanged();
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.b$c */
    class C3975c extends RecyclerView.AbstractC1353c {
        static {
            Covode.recordClassIndex(4506);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4655a() {
            AbstractC3971b.this.f10890i.mo9346a();
        }

        C3975c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: b */
        public final void mo4660b(int i, int i2) {
            AbstractC3971b.this.f10890i.mo9348b(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: c */
        public final void mo4661c(int i, int i2) {
            AbstractC3971b.this.f10890i.mo9349c(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4656a(int i, int i2) {
            AbstractC3971b.this.f10890i.mo9347a(i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
        /* renamed from: a */
        public final void mo4657a(int i, int i2, int i3) {
            AbstractC3971b.this.f10890i.mo9350d(i, i2);
        }
    }

    /* renamed from: b */
    private boolean mo14806b() {
        if (!this.f10886e || !this.f10887f || this.f10885d) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m9692d() {
        if (this.f10883b == C3884b.EnumC3885a.RUNNING) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m9693e() {
        if (this.f10883b == C3884b.EnumC3885a.FAILED) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.b$b */
    class C3974b extends Observable<RecyclerView.AbstractC1353c> {
        static {
            Covode.recordClassIndex(4505);
        }

        /* renamed from: a */
        public final void mo9346a() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AbstractC1353c) this.mObservers.get(size)).mo4655a();
            }
        }

        C3974b() {
        }

        /* renamed from: a */
        private int m9712a(int i) {
            if (AbstractC3971b.this.f10885d) {
                return i + 1;
            }
            return i;
        }

        /* renamed from: b */
        public final void mo9348b(int i, int i2) {
            int a = m9712a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AbstractC1353c) this.mObservers.get(size)).mo4660b(a, i2);
            }
        }

        /* renamed from: c */
        public final void mo9349c(int i, int i2) {
            int a = m9712a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AbstractC1353c) this.mObservers.get(size)).mo4661c(a, i2);
            }
        }

        /* renamed from: a */
        public final void mo9347a(int i, int i2) {
            int a = m9712a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AbstractC1353c) this.mObservers.get(size)).mo4658a(a, i2, (Object) null);
            }
        }

        /* renamed from: d */
        public final void mo9350d(int i, int i2) {
            int a = m9712a(i);
            int a2 = m9712a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AbstractC1353c) this.mObservers.get(size)).mo4657a(a, a2, 1);
            }
        }
    }

    /* renamed from: c */
    private boolean mo14808c() {
        if (this.f10886e || !this.f10898q || !this.f10889h) {
            return false;
        }
        return true;
    }

    @Override // androidx.p053i.AbstractC1044j, androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        boolean z = this.f10885d;
        boolean c = mo14808c();
        boolean b = mo14806b();
        boolean f = m9694f();
        return (z ? 1 : 0) + super.getItemCount() + (c ? 1 : 0) + (f ? 1 : 0) + (b ? 1 : 0);
    }

    /* renamed from: f */
    private boolean m9694f() {
        C3884b.EnumC3885a aVar;
        if (mo14808c() || !this.f10888g || (aVar = this.f10884c) == null) {
            return false;
        }
        if (aVar != C3884b.EnumC3885a.SUCCESS) {
            if (this.f10884c == C3884b.EnumC3885a.FAILED) {
                return m9693e();
            }
            return false;
        } else if (m9692d() || m9693e()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.b$a */
    public static abstract class AbstractC3973a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4504);
        }

        /* renamed from: a */
        public void mo9344a() {
        }

        /* renamed from: a */
        public void mo9345a(boolean z) {
        }

        public AbstractC3973a(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.b$d */
    public static class C3976d extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4507);
        }

        public C3976d(View view) {
            super(view);
        }
    }

    /* renamed from: com.bytedance.android.live.core.paging.a.b$f */
    public static class C3978f extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4509);
        }

        /* renamed from: a */
        public void mo9351a() {
        }

        public C3978f(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public final int mo9338b(int i) {
        return i - (this.f10885d ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RecyclerView.ViewHolder mo9331a(ViewGroup viewGroup) {
        throw new RuntimeException("create your header view holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void registerAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        this.f10890i.registerObserver(cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC1353c cVar) {
        this.f10890i.unregisterObserver(cVar);
    }

    /* renamed from: c */
    private T mo14807c(int i) {
        if (i < 0 || i >= super.getItemCount()) {
            return null;
        }
        return (T) super.mo3758a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo9335a(C3884b bVar) {
        if (bVar != null) {
            mo9334a(bVar.f10741a);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof AbstractC10937b) {
            ((AbstractC10937b) viewHolder).mo14823a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof AbstractC10937b) {
            ((AbstractC10937b) viewHolder).mo14824b();
        }
    }

    /* renamed from: a */
    private static void m9688a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) viewHolder.itemView.getLayoutParams();
        if (jVar instanceof StaggeredGridLayoutManager.C1385b) {
            ((StaggeredGridLayoutManager.C1385b) jVar).f4602b = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RecyclerView.ViewHolder mo9339b(ViewGroup viewGroup) {
        return new C3976d(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4z, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC10937b) {
            ((AbstractC10937b) viewHolder).mo14840e();
        } else if (!(viewHolder instanceof C3978f) && (viewHolder instanceof AbstractC3973a)) {
            ((AbstractC3973a) viewHolder).mo9344a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public RecyclerView.ViewHolder mo9342c(ViewGroup viewGroup) {
        return new C3976d(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4y, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.paging.a.b$e */
    public static class C3977e extends AbstractC3973a {

        /* renamed from: a */
        PagingViewModel f10903a;

        /* renamed from: b */
        private View f10904b;

        /* renamed from: c */
        private TextView f10905c;

        static {
            Covode.recordClassIndex(4508);
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.AbstractC3973a
        /* renamed from: a */
        public final void mo9344a() {
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.AbstractC3973a
        /* renamed from: a */
        public final void mo9345a(boolean z) {
            C3884b value = this.f10903a.f10973c.getValue();
            View findViewById = this.itemView.findViewById(R.id.e7c);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            if (value == null || !value.mo9244b() || !z) {
                layoutParams.height = -2;
                this.f10904b.setVisibility(8);
                TextView textView = this.f10905c;
                textView.setTextColor(textView.getResources().getColor(R.color.wp));
                this.f10905c.setText(R.string.giv);
            } else {
                layoutParams.height = -1;
                this.f10904b.setVisibility(0);
                TextView textView2 = this.f10905c;
                textView2.setTextColor(textView2.getResources().getColor(R.color.wq));
                this.f10905c.setText(R.string.gix);
            }
            findViewById.setLayoutParams(layoutParams);
            this.itemView.setOnClickListener(new View$OnClickListenerC3984h(this));
        }

        C3977e(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f10903a = pagingViewModel;
            this.f10904b = view.findViewById(R.id.awo);
            this.f10905c = (TextView) view.findViewById(R.id.awu);
        }
    }

    public AbstractC3971b(C1445j.AbstractC1451e<T> eVar) {
        super(eVar);
        AbstractC3971b<T>.C3975c cVar = new C3975c();
        this.f10899r = cVar;
        this.f10890i = new C3974b();
        super.registerAdapterDataObserver(cVar);
    }

    @Override // androidx.p053i.AbstractC1044j
    /* renamed from: a */
    public final T mo3758a(int i) {
        int itemCount = super.getItemCount();
        boolean z = this.f10885d;
        int i2 = itemCount + (z ? 1 : 0);
        if (z && i == 0) {
            return null;
        }
        if (m9694f() && i == i2) {
            return null;
        }
        if (mo14808c() && i == i2) {
            return null;
        }
        if (!mo14806b() || i != i2) {
            return mo14807c(mo9338b(i));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        int itemCount = getItemCount() - 1;
        if (mo14806b() && i == 0) {
            return -1091641683;
        }
        if (this.f10885d && i == 0) {
            return -559038738;
        }
        if (!m9694f() || i != itemCount) {
            if (mo14808c() && i == itemCount) {
                return -559038737;
            }
            int b = mo9338b(i);
            if (b >= super.getItemCount()) {
                return -8888;
            }
            return mo9330a((Object) mo14807c(b));
        } else if (m9693e()) {
            return -1091576149;
        } else {
            return -1091576148;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo9334a(C3884b.EnumC3885a aVar) {
        boolean z = this.f10897p;
        this.f10883b = aVar;
        boolean f = m9694f();
        int itemCount = super.getItemCount();
        if (!z) {
            if (f) {
                notifyItemInserted(itemCount);
            }
        } else if (!f) {
            notifyItemRemoved(getItemCount());
        } else {
            notifyItemRemoved(itemCount);
            notifyItemInserted(itemCount);
        }
        this.f10897p = f;
    }

    /* renamed from: a */
    public final void mo9336a(PagingViewModel<T> pagingViewModel) {
        PagingViewModel<T> pagingViewModel2 = this.f10882a;
        if (pagingViewModel2 != null) {
            pagingViewModel2.f10977g.removeObserver(this.f10891j);
            this.f10882a.f10972b.removeObserver(this.f10892k);
            this.f10882a.f10973c.removeObserver(this.f10893l);
            this.f10882a.f10975e.removeObserver(this.f10894m);
            this.f10882a.f10974d.removeObserver(this.f10895n);
            this.f10882a.f10976f.removeObserver(this.f10896o);
        }
        this.f10882a = pagingViewModel;
        if (pagingViewModel != null) {
            pagingViewModel.f10977g.observeForever(this.f10891j);
            pagingViewModel.f10972b.observeForever(this.f10892k);
            pagingViewModel.f10973c.observeForever(this.f10893l);
            pagingViewModel.f10975e.observeForever(this.f10894m);
            pagingViewModel.f10974d.observeForever(this.f10895n);
            pagingViewModel.f10976f.observeForever(this.f10896o);
        }
    }

    /* renamed from: c */
    public void mo9343c(RecyclerView.ViewHolder viewHolder, int i) {
        m9688a(viewHolder);
    }

    /* renamed from: a */
    public RecyclerView.ViewHolder mo9332a(ViewGroup viewGroup, int i) {
        if (i == -1091576148) {
            return new C3978f(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b51, viewGroup, false));
        }
        if (i == -1091576149) {
            return new C3977e(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b50, viewGroup, false), this.f10882a);
        }
        throw new RuntimeException("unknown footer type");
    }

    /* renamed from: b */
    public void mo9341b(RecyclerView.ViewHolder viewHolder, int i) {
        m9688a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int itemViewType = getItemViewType(i);
        if (itemViewType == -559038738) {
            m9688a(viewHolder);
        } else if (itemViewType == -559038737) {
            mo9343c(viewHolder, i);
        } else if (itemViewType == -1091576148 || itemViewType == -1091576149) {
            m9688a(viewHolder);
            if (viewHolder instanceof C3978f) {
                ((C3978f) viewHolder).mo9351a();
            } else if (viewHolder instanceof AbstractC3973a) {
                AbstractC3973a aVar = (AbstractC3973a) viewHolder;
                if (this.f10886e || super.getItemCount() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo9345a(z);
            }
        } else if (itemViewType == -1091641683) {
            mo9341b(viewHolder, i);
        } else {
            mo9333a(viewHolder, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9333a(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof AbstractC10937b) {
            T a = mo3758a(i);
            if (a instanceof C2964c) {
                a = (T) a.f8714a;
            }
            AbstractC10937b bVar = (AbstractC10937b) viewHolder;
            bVar.mo9329a(a, i);
            if (bVar.mo14825c()) {
                m9688a(viewHolder);
            }
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m9687a(AbstractC3971b bVar, ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        boolean a;
        if (i == -559038738) {
            viewHolder = bVar.mo9331a(viewGroup);
        } else if (i == -559038737) {
            viewHolder = bVar.mo9339b(viewGroup);
        } else if (i == -1091576148 || i == -1091576149) {
            viewHolder = bVar.mo9332a(viewGroup, i);
        } else if (i == -1091641683) {
            viewHolder = bVar.mo9342c(viewGroup);
        } else {
            viewHolder = bVar.mo9340b(viewGroup, i);
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
        return viewHolder;
    }
}
