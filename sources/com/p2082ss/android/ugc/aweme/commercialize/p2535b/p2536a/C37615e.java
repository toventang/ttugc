package com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a.C37616f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.a.e */
public final class C37615e extends AbstractC39056b<List<? extends AnchorPublishStruct>> {

    /* renamed from: a */
    public final AbstractC1204m f88922a;

    static {
        Covode.recordClassIndex(45037);
    }

    public C37615e(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f88922a = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo63163a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.adz, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C37616f(a, this.f88922a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ boolean mo63165a(List<? extends AnchorPublishStruct> list, int i) {
        C89219l.m154721d(list, "");
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, androidx.recyclerview.widget.RecyclerView$ViewHolder, java.util.List] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39056b
    /* renamed from: a */
    public final /* synthetic */ void mo63164a(List<? extends AnchorPublishStruct> list, int i, RecyclerView.ViewHolder viewHolder, List list2) {
        int i2;
        List<? extends AnchorPublishStruct> list3 = list;
        C89219l.m154721d(list3, "");
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(list2, "");
        AnchorPublishStruct anchorPublishStruct = (AnchorPublishStruct) list3.get(i);
        boolean z = viewHolder instanceof C37616f;
        if (z) {
            C37616f fVar = (C37616f) viewHolder;
            C89219l.m154721d(anchorPublishStruct, "");
            if (anchorPublishStruct.type == EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE()) {
                anchorPublishStruct.extensionMisc.getExtensionDataRepo().getI18nStarAtlasClosed().observe(fVar.f88930h, new C37616f.C37617a(fVar));
            }
            TextView textView = fVar.f88927e;
            int i3 = 0;
            if (anchorPublishStruct.isBeta) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView.setVisibility(i2);
            fVar.f88927e.setText(R.string.g);
            TextView textView2 = fVar.f88928f;
            if (!anchorPublishStruct.isNew) {
                i3 = 8;
            }
            textView2.setVisibility(i3);
            fVar.f88928f.setText(R.string.dd9);
            String str = anchorPublishStruct.subtitle;
            if (str != null) {
                fVar.f88926d.setText(str);
            }
            C34577e.m70592a(fVar.f88923a, anchorPublishStruct.icon);
            if (anchorPublishStruct.type == 40) {
                fVar.f88924b.setMaxEms(20);
            }
            fVar.f88924b.setText(anchorPublishStruct.title);
            if (anchorPublishStruct.enable) {
                TextView textView3 = fVar.f88924b;
                View view = fVar.itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                textView3.setTextColor(context.getResources().getColor(R.color.a2));
            } else {
                TextView textView4 = fVar.f88924b;
                View view2 = fVar.itemView;
                C89219l.m154716b(view2, "");
                Context context2 = view2.getContext();
                C89219l.m154716b(context2, "");
                textView4.setTextColor(context2.getResources().getColor(R.color.c3));
            }
            fVar.itemView.setOnClickListener(new C37616f.View$OnClickListenerC37618b(anchorPublishStruct));
        }
        if (i == list3.size() - 1) {
            if (!z) {
                viewHolder = null;
            }
            C37616f fVar2 = (C37616f) viewHolder;
            if (fVar2 != null) {
                fVar2.f88929g.setVisibility(8);
            }
        }
    }
}
