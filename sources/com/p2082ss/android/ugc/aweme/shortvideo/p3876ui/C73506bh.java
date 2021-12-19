package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch;
import com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73507bi;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.EnumC72684w;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.bh */
public final class C73506bh extends AbstractC69746a<List<? extends C72683v>> {

    /* renamed from: a */
    public final boolean f165147a;

    static {
        Covode.recordClassIndex(86243);
    }

    public C73506bh(boolean z) {
        this.f165147a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo110105a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.agt, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C73507bi(a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a
    /* renamed from: a */
    public final /* synthetic */ boolean mo110107a(List<? extends C72683v> list, int i) {
        List<? extends C72683v> list2 = list;
        C89219l.m154721d(list2, "");
        if (((C72683v) list2.get(i)).f162953f != EnumC72684w.SAVE_LOCAL_OPTIONS) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3787a.AbstractC69746a
    /* renamed from: a */
    public final /* synthetic */ void mo110106a(List<? extends C72683v> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        boolean z;
        List<? extends C72683v> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        C72683v vVar = (C72683v) list3.get(i);
        if (viewHolder instanceof C73507bi) {
            C73507bi biVar = (C73507bi) viewHolder;
            if (!this.f165147a || i == list3.size() - 1) {
                z = false;
            } else {
                z = true;
            }
            C89219l.m154721d(vVar, "");
            DmtSettingSwitch switchRight = biVar.f165148a.getSwitchRight();
            if (switchRight != null) {
                Context context = biVar.f165148a.getContext();
                C89219l.m154716b(context, "");
                switchRight.setTrackTintList(context.getResources().getColorStateList(R.color.fi));
            }
            biVar.f165148a.setLeftIcon(vVar.f162956i);
            biVar.f165148a.setLeftText(vVar.f162954g);
            if (vVar.f162955h.length() > 0) {
                biVar.f165148a.setDesc(vVar.f162955h);
            }
            if (!z) {
                biVar.f165149b.setVisibility(8);
            }
            biVar.f165148a.setChecked(vVar.f162957j);
            biVar.itemView.setOnClickListener(new C73507bi.View$OnClickListenerC73510b(biVar, vVar));
            if (vVar.f162952e != null) {
                AbstractC89183m<? super View, ? super CommonItemView, C89391z> mVar = vVar.f162952e;
                if (mVar == null) {
                    C89219l.m154715b();
                }
                View view = biVar.itemView;
                C89219l.m154716b(view, "");
                mVar.invoke(view, biVar.f165148a);
            }
        }
    }
}
