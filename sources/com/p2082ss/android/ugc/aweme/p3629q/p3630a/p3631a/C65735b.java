package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3631a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.model.AnchorIcon;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteRoundImageView;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.q.a.a.b */
public final class C65735b extends AbstractC65728a<AnchorCell, C65736a> {
    static {
        Covode.recordClassIndex(77234);
    }

    public C65735b(AbstractC34884bl blVar) {
        super(blVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a.b$a */
    public final class C65736a extends AbstractC65728a<AnchorCell, C65736a>.C65729a {

        /* renamed from: b */
        public final RemoteRoundImageView f148123b;

        /* renamed from: c */
        final /* synthetic */ C65735b f148124c;

        static {
            Covode.recordClassIndex(77235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65736a(C65735b bVar, View view) {
            super(bVar, view);
            C89219l.m154721d(view, "");
            this.f148124c = bVar;
            this.f148123b = (RemoteRoundImageView) view.findViewById(R.id.bhh);
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a95, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65736a(this, a);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        String str;
        C65736a aVar = (C65736a) viewHolder;
        AnchorCell anchorCell = (AnchorCell) obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(anchorCell, "");
        RemoteRoundImageView remoteRoundImageView = aVar.f148123b;
        AnchorIcon anchorIcon = anchorCell.f79656b;
        if (anchorIcon != null) {
            str = anchorIcon.f79663a;
        } else {
            str = null;
        }
        C34577e.m70608b(remoteRoundImageView, str, -1, -1);
    }
}
