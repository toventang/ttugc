package com.bytedance.android.live.uikit.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.C1764a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.uikit.recyclerview.a */
public abstract class AbstractC6235a extends AbstractC6239b {

    /* renamed from: a */
    public AbstractC6237a f15604a;

    /* renamed from: c */
    private C6238b f15605c;

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.a$a */
    public interface AbstractC6237a {
        static {
            Covode.recordClassIndex(6946);
        }

        /* renamed from: a */
        void mo12217a();
    }

    static {
        Covode.recordClassIndex(6944);
    }

    /* renamed from: a */
    public final void mo12213a() {
        C6238b bVar = this.f15605c;
        if (bVar != null) {
            ((LoadingStatusView) bVar.itemView).setStatus(0);
        }
    }

    /* renamed from: b */
    public final void mo12215b() {
        C6238b bVar = this.f15605c;
        if (bVar != null) {
            ((LoadingStatusView) bVar.itemView).mo12206a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    public final int getItemCount() {
        if (mo12221c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    /* renamed from: a */
    public final void mo12214a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof C6238b) {
            C6238b bVar = (C6238b) viewHolder;
            if (((LoadingStatusView) bVar.itemView).f15598b == -1 && AbstractC6235a.this.f15604a != null) {
                AbstractC6235a.this.f15604a.mo12217a();
            }
            RecyclerView.C1367j jVar = (RecyclerView.C1367j) this.f15605c.itemView.getLayoutParams();
            if (jVar instanceof StaggeredGridLayoutManager.C1385b) {
                ((StaggeredGridLayoutManager.C1385b) jVar).f4602b = true;
            }
            this.f15605c.itemView.setLayoutParams(jVar);
        }
    }

    @Override // com.bytedance.android.live.uikit.recyclerview.AbstractC6239b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo12212a(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.wz);
        int dimensionPixelSize2 = viewGroup.getResources().getDimensionPixelSize(R.dimen.x0);
        loadingStatusView.setLayoutParams(new RecyclerView.C1367j(-1, dimensionPixelSize));
        LoadingStatusView.C6234a aVar = new LoadingStatusView.C6234a(viewGroup.getContext());
        aVar.mo12209a(dimensionPixelSize2).mo12210a(R.string.giv, new View.OnClickListener() {
            /* class com.bytedance.android.live.uikit.recyclerview.AbstractC6235a.View$OnClickListenerC62361 */

            static {
                Covode.recordClassIndex(6945);
            }

            public final void onClick(View view) {
                if (AbstractC6235a.this.f15604a != null) {
                    AbstractC6235a.this.f15604a.mo12217a();
                }
            }
        });
        aVar.f15601b = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bbh, viewGroup, false);
        loadingStatusView.setBuilder(aVar);
        C6238b bVar = new C6238b(loadingStatusView);
        this.f15605c = bVar;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.a$b */
    class C6238b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(6947);
        }

        public C6238b(View view) {
            super(view);
        }
    }
}
