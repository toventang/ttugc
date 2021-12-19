package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73507bi;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72684w;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bj */
public final class C73511bj extends AbstractC69746a<List<? extends C72683v>> {

    /* renamed from: a */
    public final boolean f165156a;

    static {
        Covode.recordClassIndex(86248);
    }

    public C73511bj(boolean z) {
        this.f165156a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo110105a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.agx, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C73507bi.C73508a(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a
    /* renamed from: a */
    public final /* synthetic */ boolean mo110107a(List<? extends C72683v> list, int i) {
        List<? extends C72683v> list2 = list;
        C89219l.m154721d(list2, "");
        if (((C72683v) list2.get(i)).f162953f == EnumC72684w.SAVE_LOCAL_OPTIONS) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a
    /* renamed from: a */
    public final /* synthetic */ void mo110106a(List<? extends C72683v> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        List<? extends C72683v> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        C72683v vVar = (C72683v) list3.get(i);
        if (viewHolder instanceof C73507bi.C73508a) {
            C73507bi.C73508a aVar = (C73507bi.C73508a) viewHolder;
            boolean z = true;
            if (!this.f165156a || i == list3.size() - 1) {
                z = false;
            }
            C89219l.m154721d(vVar, "");
            aVar.f165150a.setLeftIcon(vVar.f162956i);
            aVar.f165150a.setLeftText(vVar.f162954g);
            aVar.f165150a.setRightText(vVar.f162948a);
            if (!z) {
                aVar.f165151b.setVisibility(8);
            }
            aVar.itemView.setOnClickListener(new C73507bi.C73508a.View$OnClickListenerC73509a(aVar, vVar));
            if (vVar.f162952e != null) {
                AbstractC89183m<? super View, ? super CommonItemView, C89391z> mVar = vVar.f162952e;
                if (mVar == null) {
                    C89219l.m154715b();
                }
                View view = aVar.itemView;
                C89219l.m154716b(view, "");
                mVar.invoke(view, aVar.f165150a);
            }
        }
    }
}
