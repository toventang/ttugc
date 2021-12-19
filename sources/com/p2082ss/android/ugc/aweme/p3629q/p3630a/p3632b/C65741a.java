package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3631a.C65735b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.q.a.b.a */
public final class C65741a extends AbstractC65728a<C33542a, C65742a> {

    /* renamed from: d */
    public final C89399f f148130d;

    static {
        Covode.recordClassIndex(77240);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.a$b */
    public static final class C65743b extends RecyclerView.AbstractC1361h {

        /* renamed from: a */
        public final int f148133a;

        static {
            Covode.recordClassIndex(77242);
        }

        public C65743b(int i) {
            this.f148133a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1361h
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1378s sVar) {
            C89219l.m154721d(rect, "");
            C89219l.m154721d(view, "");
            C89219l.m154721d(recyclerView, "");
            C89219l.m154721d(sVar, "");
            rect.left = this.f148133a;
        }
    }

    public C65741a(AbstractC34884bl blVar) {
        super(blVar);
        C89399f fVar = new C89399f();
        this.f148130d = fVar;
        fVar.mo143771a(AnchorCell.class, new C65735b(blVar));
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a94, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65742a(this, a);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.a$a */
    public final class C65742a extends AbstractC65728a<C33542a, C65742a>.C65729a {

        /* renamed from: b */
        public final RecyclerView f148131b;

        /* renamed from: c */
        final /* synthetic */ C65741a f148132c;

        static {
            Covode.recordClassIndex(77241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65742a(C65741a aVar, View view) {
            super(aVar, view);
            C89219l.m154721d(view, "");
            this.f148132c = aVar;
            View findViewById = view.findViewById(R.id.dgr);
            C89219l.m154716b(findViewById, "");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f148131b = recyclerView;
            Context context = view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.mo4402a(new C65743b((int) C13628n.m24520b(context, 4.0f)));
            recyclerView.setAdapter(aVar.f148130d);
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        C33542a aVar = (C33542a) obj;
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(aVar, "");
        ArrayList<AnchorCell> arrayList = aVar.f79669e;
        if (arrayList != null && !arrayList.isEmpty()) {
            C89399f fVar = this.f148130d;
            ArrayList<AnchorCell> arrayList2 = aVar.f79669e;
            if (arrayList2 == null) {
                C89219l.m154715b();
            }
            fVar.mo17153a(arrayList2);
            C89399f fVar2 = this.f148130d;
            fVar2.notifyItemRangeChanged(0, fVar2.f203060b.size());
        }
    }
}
