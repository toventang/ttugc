package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3632b;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.api.model.C33542a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.q.a.b.b */
public final class C65744b extends AbstractC65728a<C33542a, RecyclerView.ViewHolder> {
    static {
        Covode.recordClassIndex(77243);
    }

    public C65744b(AbstractC34884bl blVar) {
        super(blVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.b.b$a */
    public final class C65745a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ C65744b f148134a;

        static {
            Covode.recordClassIndex(77244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65745a(C65744b bVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f148134a = bVar;
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        C89219l.m154721d(viewHolder, "");
        C89219l.m154721d(obj, "");
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MethodCollector.m26663i(6052);
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        C65745a aVar = new C65745a(this, new View(viewGroup.getContext()));
        MethodCollector.m26664o(6052);
        return aVar;
    }
}
