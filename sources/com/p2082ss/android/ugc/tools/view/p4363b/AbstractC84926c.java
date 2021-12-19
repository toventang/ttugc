package com.p2082ss.android.ugc.tools.view.p4363b;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.view.widget.AVStatusView;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.b.c */
public abstract class AbstractC84926c extends AbstractC84932f {

    /* renamed from: i */
    static final String f189759i = AbstractC84926c.class.getSimpleName();

    /* renamed from: a */
    private int f189760a;

    /* renamed from: b */
    private String f189761b;

    /* renamed from: c */
    private TextView f189762c;

    /* renamed from: d */
    private long f189763d = -1;

    /* renamed from: j */
    public int f189764j = -1;

    /* renamed from: k */
    public int f189765k;

    /* renamed from: l */
    public String f189766l;

    /* renamed from: m */
    public RecyclerView f189767m;

    /* renamed from: n */
    public C84929b f189768n;

    /* renamed from: o */
    public AbstractC84928a f189769o;

    /* renamed from: p */
    public GridLayoutManager.AbstractC1337c f189770p;

    /* renamed from: com.ss.android.ugc.tools.view.b.c$a */
    public interface AbstractC84928a {
        static {
            Covode.recordClassIndex(98922);
        }

        /* renamed from: a */
        void mo112467a();
    }

    /* renamed from: com.ss.android.ugc.tools.view.b.c$b */
    public class C84929b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public C84931e f189773a;

        /* renamed from: b */
        public TextView f189774b;

        static {
            Covode.recordClassIndex(98923);
        }

        /* renamed from: a */
        public final void mo129699a() {
            ((AVStatusView) this.itemView).mo129846b();
        }

        /* renamed from: b */
        public final void mo129700b() {
            ((AVStatusView) this.itemView).mo129845a();
        }

        public C84929b(View view, TextView textView) {
            super(view);
            this.f189774b = textView;
            textView.setOnClickListener(new View$OnClickListenerC84930d(this));
        }
    }

    static {
        Covode.recordClassIndex(98920);
    }

    /* renamed from: e */
    public final void mo129698e() {
        C84929b bVar = this.f189768n;
        if (bVar != null) {
            bVar.mo129700b();
        }
        this.f189764j = -1;
        this.f189763d = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    public int getItemCount() {
        if (mo112426a() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: d */
    public final void mo129697d() {
        C84929b bVar = this.f189768n;
        if (bVar != null) {
            bVar.mo129699a();
        }
        this.f189764j = 0;
        if (this.f189763d == -1) {
            this.f189763d = System.currentTimeMillis();
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final void mo129696a(RecyclerView.ViewHolder viewHolder) {
        C84929b bVar = (C84929b) viewHolder;
        AVStatusView aVStatusView = (AVStatusView) bVar.itemView;
        aVStatusView.setStatus(AbstractC84926c.this.f189764j);
        if (aVStatusView.f190043b == -1 && AbstractC84926c.this.f189769o != null) {
            AbstractC84926c.this.f189769o.mo112467a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f189767m = recyclerView;
        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo4320a(new GridLayoutManager.AbstractC1337c() {
                /* class com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84926c.C849271 */

                static {
                    Covode.recordClassIndex(98921);
                }

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
                /* renamed from: a */
                public final int mo4342a(int i) {
                    if (AbstractC84926c.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4316b;
                    }
                    if (AbstractC84926c.this.f189770p != null) {
                        return AbstractC84926c.this.f189770p.mo4342a(i);
                    }
                    return 1;
                }
            });
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
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.f189763d != -1 && !TextUtils.isEmpty(this.f189766l)) {
            C63244g.m114602a().mo73263I().mo101632a("aweme_feed_load_more_duration", this.f189766l, (float) (System.currentTimeMillis() - this.f189763d));
            this.f189763d = -1;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo129695a(ViewGroup viewGroup) {
        AVStatusView aVStatusView = new AVStatusView(viewGroup.getContext());
        aVStatusView.setLayoutParams(new RecyclerView.C1367j(-1, viewGroup.getResources().getDimensionPixelSize(R.dimen.gz)));
        TextView textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bif, (ViewGroup) null);
        this.f189762c = textView;
        int i = this.f189765k;
        if (i != 0) {
            textView.setTextColor(i);
        }
        int i2 = this.f189760a;
        if (i2 != 0) {
            this.f189762c.setText(i2);
        }
        String str = this.f189761b;
        if (str != null) {
            this.f189762c.setText(str);
        }
        this.f189762c.setGravity(17);
        TextView textView2 = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b3c, (ViewGroup) null);
        textView2.setText(R.string.cxh);
        textView2.setGravity(17);
        AVStatusView.C84988a a = AVStatusView.C84988a.m146075a(viewGroup.getContext());
        a.f190048c = this.f189762c;
        a.f190048c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        aVStatusView.setBuilder(a.mo129852a(textView2));
        C84929b bVar = new C84929b(aVStatusView, textView2);
        this.f189768n = bVar;
        return bVar;
    }
}
