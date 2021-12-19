package com.bytedance.android.p147c.p148a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p236e.p237a.p238a.AbstractC4141a;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.c.a.c */
public abstract class AbstractC2713c {

    /* renamed from: a */
    private View f8101a;

    /* renamed from: b */
    private AbstractC2714a f8102b;

    /* renamed from: f */
    public View f8103f;

    /* renamed from: g */
    public boolean f8104g;

    /* renamed from: h */
    public ImageView f8105h;

    /* renamed from: i */
    public final int f8106i = C3966y.m9653a(54.0f);

    /* renamed from: j */
    public View f8107j;

    /* renamed from: k */
    public boolean f8108k;

    /* renamed from: l */
    public final Context f8109l;

    /* renamed from: com.bytedance.android.c.a.c$a */
    public interface AbstractC2714a extends AbstractC4141a {
        static {
            Covode.recordClassIndex(3104);
        }

        /* renamed from: a */
        void mo7239a(AbstractC2713c cVar);

        /* renamed from: a_ */
        void mo7241a_();
    }

    static {
        Covode.recordClassIndex(3103);
    }

    /* renamed from: a */
    public abstract int mo7223a();

    /* renamed from: a */
    public abstract View mo7224a(ViewGroup viewGroup);

    /* renamed from: a */
    public void mo7225a(boolean z) {
    }

    /* renamed from: b */
    public View mo7235b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return null;
    }

    /* renamed from: b */
    public abstract CharSequence mo7226b();

    /* renamed from: b */
    public void mo7236b(boolean z) {
    }

    /* renamed from: c */
    public abstract void mo7227c();

    /* renamed from: d */
    public abstract boolean mo7228d();

    /* renamed from: e */
    public abstract void mo7229e();

    /* renamed from: com.bytedance.android.c.a.c$b */
    public static final class View$OnClickListenerC2715b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC2713c f8110a;

        static {
            Covode.recordClassIndex(3105);
        }

        public View$OnClickListenerC2715b(AbstractC2713c cVar) {
            this.f8110a = cVar;
        }

        public final void onClick(View view) {
            this.f8110a.mo7227c();
        }
    }

    /* renamed from: a */
    public void mo7232a(AbstractC2714a aVar) {
        this.f8102b = aVar;
    }

    /* renamed from: c */
    public final void mo7246c(boolean z) {
        if (this.f8108k != z) {
            this.f8108k = z;
            mo7236b(z);
        }
    }

    public AbstractC2713c(Context context) {
        C89219l.m154721d(context, "");
        this.f8109l = context;
    }

    /* renamed from: c */
    public final View mo7245c(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        if (this.f8101a == null) {
            this.f8101a = mo7235b(viewGroup);
        }
        return this.f8101a;
    }

    /* renamed from: d */
    public final void mo7247d(boolean z) {
        ImageView imageView = this.f8105h;
        if (imageView == null) {
            C89219l.m154710a("indicatorView");
        }
        if (imageView.isSelected() != z) {
            ImageView imageView2 = this.f8105h;
            if (imageView2 == null) {
                C89219l.m154710a("indicatorView");
            }
            imageView2.setSelected(z);
            mo7225a(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo7248e(boolean z) {
        if (z) {
            View view = this.f8107j;
            if (view == null) {
                C89219l.m154710a("deleteView");
            }
            view.setVisibility(0);
            return;
        }
        View view2 = this.f8107j;
        if (view2 == null) {
            C89219l.m154710a("deleteView");
        }
        view2.setVisibility(8);
    }
}
