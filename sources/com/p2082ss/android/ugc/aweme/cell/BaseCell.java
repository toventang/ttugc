package com.p2082ss.android.ugc.aweme.cell;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import com.p2082ss.android.ugc.aweme.p2727db.AbstractC40940e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cell.BaseCell */
public abstract class BaseCell<T extends AbstractC34793a> extends PowerCell<T> {
    static {
        Covode.recordClassIndex(42627);
    }

    /* renamed from: b */
    public abstract View mo62345b(ViewGroup viewGroup);

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: m */
    public final void mo28074m() {
        super.mo28074m();
        m72479a();
    }

    /* renamed from: a */
    private final AbstractC40940e m72479a() {
        AbstractC34793a aVar = (AbstractC34793a) this.f42160d;
        if (aVar != null) {
            return aVar.f82131a;
        }
        return null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        AbstractC40940e a = m72479a();
        if (a != null) {
            a.cl_();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        return mo62345b(viewGroup);
    }

    /* renamed from: a */
    public void mo23350a(T t) {
        C89219l.m154721d(t, "");
        super.mo23350a((AbstractC17641a) t);
        boolean b = t.mo61501b();
        if (b) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            view.setVisibility(0);
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
        } else if (!b) {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            view3.setVisibility(8);
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = 0;
                layoutParams2.height = 0;
            }
        }
    }
}
