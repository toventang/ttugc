package com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3784b.C69661a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.MicroShareChannelBar */
public final class MicroShareChannelBar extends FrameLayout implements AbstractC69681f {

    /* renamed from: a */
    public List<? extends AbstractC69581b> f155508a = C89086z.INSTANCE;

    /* renamed from: b */
    public AbstractC69681f f155509b;

    /* renamed from: c */
    public final C69676d f155510c;

    /* renamed from: d */
    private final RecyclerView f155511d;

    static {
        Covode.recordClassIndex(82038);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
    /* renamed from: a_ */
    public final void mo87413a_(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC69681f fVar = this.f155509b;
        if (fVar != null) {
            fVar.mo87413a_(bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MicroShareChannelBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(4341);
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.vd});
        C89219l.m154716b(obtainStyledAttributes, "");
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ah9, this, true);
        View findViewById = findViewById(R.id.a3z);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f155511d = recyclerView;
        C69676d dVar = new C69676d(context, this, C69661a.f155503a == 0 ? false : z, z2);
        this.f155510c = dVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        dVar.mo109821a(this.f155508a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        MethodCollector.m26664o(4341);
    }
}
