package com.bytedance.android.live.publicscreen.p386a.p387a;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;

/* renamed from: com.bytedance.android.live.publicscreen.a.a.a */
public abstract class AbstractC5858a<MODEL extends AbstractC5873h, VH extends AbstractC5887a<MODEL>> extends AbstractC89396c<MODEL, VH> {

    /* renamed from: a */
    public C5889g f14720a;

    static {
        Covode.recordClassIndex(6465);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: c */
    public final /* synthetic */ void mo11659c(RecyclerView.ViewHolder viewHolder) {
        AbstractC5887a aVar = (AbstractC5887a) viewHolder;
        C89219l.m154721d(aVar, "");
        super.mo11659c(aVar);
        aVar.mo11738a();
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo11656a(RecyclerView.ViewHolder viewHolder) {
        AbstractC5887a aVar = (AbstractC5887a) viewHolder;
        C89219l.m154721d(aVar, "");
        super.mo11656a(aVar);
        MODEL model = aVar.f14743c;
        if (model != null) {
            model.mo11678f();
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: b */
    public final /* synthetic */ void mo11658b(RecyclerView.ViewHolder viewHolder) {
        AbstractC5887a aVar = (AbstractC5887a) viewHolder;
        C89219l.m154721d(aVar, "");
        super.mo11658b(aVar);
        MODEL model = aVar.f14743c;
        if (model != null) {
            model.mo11679g();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.bytedance.android.live.publicscreen.a.f.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        AbstractC5887a aVar = (AbstractC5887a) viewHolder;
        AbstractC5873h hVar = (AbstractC5873h) obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(hVar, "");
        C5889g gVar = this.f14720a;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        gVar.f14757n.mo11668a(hVar);
        hVar.mo11676d().f14726a++;
        hVar.mo11677e();
        C5889g gVar2 = this.f14720a;
        if (gVar2 == null) {
            C89219l.m154710a("publicScreenContext");
        }
        aVar.mo10370a(gVar2, hVar);
        C5889g gVar3 = this.f14720a;
        if (gVar3 == null) {
            C89219l.m154710a("publicScreenContext");
        }
        gVar3.f14757n.mo11670b(hVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.android.live.publicscreen.a.a.a<MODEL extends com.bytedance.android.live.publicscreen.a.d.h, VH extends com.bytedance.android.live.publicscreen.a.f.a<MODEL>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10468a(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        mo11657a((AbstractC5887a) viewHolder, (AbstractC5873h) obj, (List<Object>) list);
    }

    /* renamed from: a */
    public final void mo11657a(VH vh, MODEL model, List<Object> list) {
        C89219l.m154721d(vh, "");
        C89219l.m154721d(model, "");
        C89219l.m154721d(list, "");
        C5889g gVar = this.f14720a;
        if (gVar == null) {
            C89219l.m154710a("publicScreenContext");
        }
        gVar.f14757n.mo11668a(model);
        model.mo11676d().f14727b = SystemClock.uptimeMillis();
        model.mo11676d().f14726a++;
        model.mo11677e();
        C5889g gVar2 = this.f14720a;
        if (gVar2 == null) {
            C89219l.m154710a("publicScreenContext");
        }
        vh.mo11739a(gVar2, model, list);
        model.mo11676d().f14728c = SystemClock.uptimeMillis();
        C5889g gVar3 = this.f14720a;
        if (gVar3 == null) {
            C89219l.m154710a("publicScreenContext");
        }
        gVar3.f14757n.mo11670b(model);
    }
}
