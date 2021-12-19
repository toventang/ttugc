package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.C1482s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.List;

public class HorizontalTabScrollView extends FrameLayout {

    /* renamed from: a */
    public RecyclerView f11037a;

    /* renamed from: b */
    public C4028g f11038b;

    /* renamed from: c */
    private C4021a f11039c;

    /* renamed from: d */
    private int f11040d = -1;

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$c */
    public interface AbstractC4023c {
        static {
            Covode.recordClassIndex(4563);
        }

        /* renamed from: a */
        void mo8890a(int i);
    }

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$d */
    public interface AbstractC4024d {
        static {
            Covode.recordClassIndex(4564);
        }

        /* renamed from: a */
        void mo8891a(int i);
    }

    static {
        Covode.recordClassIndex(4560);
    }

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$g */
    public static class C4028g extends C1482s {

        /* renamed from: b */
        public List<AbstractC4024d> f11049b;

        static {
            Covode.recordClassIndex(4568);
        }

        private C4028g() {
        }

        /* synthetic */ C4028g(byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.C1482s, androidx.recyclerview.widget.AbstractC1392ac
        /* renamed from: a */
        public final View mo4855a(RecyclerView.AbstractC1362i iVar) {
            int i;
            View a = super.mo4855a(iVar);
            if (a != null) {
                i = ((RecyclerView.C1367j) a.getLayoutParams()).f4500c.getBindingAdapterPosition();
                if (i == 0) {
                    a = iVar.mo4358c(1);
                    i = 1;
                } else if (i == iVar.mo4685A() - 1) {
                    i = iVar.mo4685A() - 2;
                    a = iVar.mo4358c(i);
                }
            } else {
                i = -1;
            }
            int i2 = i - 1;
            List<AbstractC4024d> list = this.f11049b;
            if (list != null && !list.isEmpty()) {
                for (AbstractC4024d dVar : this.f11049b) {
                    dVar.mo8891a(i2);
                }
            }
            return a;
        }
    }

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$a */
    static class C4021a extends LinearLayoutManager {

        /* renamed from: a */
        public boolean f11041a;

        static {
            Covode.recordClassIndex(4561);
        }

        public C4021a() {
            super(0, false);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
            C4022b bVar = new C4022b(recyclerView.getContext());
            bVar.f11042f = this.f11041a;
            bVar.f4515g = i;
            mo4695a(bVar);
        }
    }

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$f */
    class C4027f extends RecyclerView.AbstractC1350a {

        /* renamed from: b */
        private RecyclerView.AbstractC1350a f11048b;

        static {
            Covode.recordClassIndex(4567);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m9833a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f11048b.getItemCount() + 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemViewType(int i) {
            if (i == 0 || i == getItemCount() - 1) {
                return -1;
            }
            return this.f11048b.getItemViewType(i);
        }

        public C4027f(RecyclerView.AbstractC1350a aVar) {
            this.f11048b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            this.f11048b.onBindViewHolder(viewHolder, i - 1);
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m9833a(C4027f fVar, ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolder;
            boolean a;
            MethodCollector.m26663i(11992);
            if (i == -1) {
                Space space = new Space(viewGroup.getContext());
                space.setLayoutParams(new ViewGroup.LayoutParams(HorizontalTabScrollView.this.getHalfScreenWidth(), -2));
                viewHolder = new C4029h(space);
            } else {
                viewHolder = fVar.f11048b.onCreateViewHolder(viewGroup, i);
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
            MethodCollector.m26664o(11992);
            return viewHolder;
        }
    }

    public int getHalfScreenWidth() {
        return (int) (((((float) getResources().getDisplayMetrics().widthPixels) * 1.0f) / 4.0f) * 3.0f);
    }

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$b */
    static class C4022b extends C1481r {

        /* renamed from: f */
        public boolean f11042f;

        static {
            Covode.recordClassIndex(4562);
        }

        public C4022b(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            return 80.0f / ((float) displayMetrics.densityDpi);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
            int b = mo5015b(view, mo5013b());
            int a = mo5012a(view, mo5016c());
            int a2 = mo5010a((int) Math.sqrt((double) ((b * b) + (a * a))));
            if (this.f11042f) {
                aVar.mo4780a(-b, -a, 1, null);
            } else if (a2 > 0) {
                aVar.mo4780a(-b, -a, a2, this.f4912b);
            }
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$h */
    public static class C4029h extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(4569);
        }

        public C4029h(View view) {
            super(view);
        }
    }

    /* renamed from: a */
    public final void mo9401a(int i) {
        this.f11039c.f11041a = false;
        this.f11037a.mo4435d(i + 1);
    }

    /* renamed from: b */
    public final void mo9402b(int i) {
        RecyclerView.AbstractC1350a adapter = this.f11037a.getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i + 1);
        }
    }

    public void setAdapter(RecyclerView.AbstractC1350a aVar) {
        RecyclerView recyclerView = this.f11037a;
        if (recyclerView != null) {
            recyclerView.setAdapter(new C4027f(aVar));
        }
    }

    /* renamed from: com.bytedance.android.live.core.widget.HorizontalTabScrollView$e */
    public static class C4025e implements RecyclerView.AbstractC1370m {

        /* renamed from: a */
        public AbstractC4023c f11043a;

        /* renamed from: b */
        private GestureDetector f11044b;

        static {
            Covode.recordClassIndex(4565);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final void mo4750a(boolean z) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: b */
        public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
        /* renamed from: a */
        public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
            if (this.f11044b.onTouchEvent(motionEvent)) {
                return true;
            }
            return false;
        }

        private C4025e(Context context, final RecyclerView recyclerView, AbstractC4023c cVar) {
            this.f11043a = cVar;
            this.f11044b = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
                /* class com.bytedance.android.live.core.widget.HorizontalTabScrollView.C4025e.C40261 */

                static {
                    Covode.recordClassIndex(4566);
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    View a;
                    RecyclerView recyclerView = recyclerView;
                    if (recyclerView == null || (a = recyclerView.mo4391a(motionEvent.getX(), motionEvent.getY())) == null || C4025e.this.f11043a == null) {
                        return false;
                    }
                    C4025e.this.f11043a.mo8890a(RecyclerView.m4278e(a) - 1);
                    return true;
                }
            });
        }

        public /* synthetic */ C4025e(Context context, RecyclerView recyclerView, AbstractC4023c cVar, byte b) {
            this(context, recyclerView, cVar);
        }
    }

    public HorizontalTabScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13264);
        removeAllViews();
        this.f11037a = new RecyclerView(getContext());
        getContext();
        C4021a aVar = new C4021a();
        this.f11039c = aVar;
        this.f11037a.setLayoutManager(aVar);
        C4028g gVar = new C4028g((byte) 0);
        this.f11038b = gVar;
        gVar.mo4857a(this.f11037a);
        addView(this.f11037a, new FrameLayout.LayoutParams(-1, -1));
        MethodCollector.m26664o(13264);
    }
}
