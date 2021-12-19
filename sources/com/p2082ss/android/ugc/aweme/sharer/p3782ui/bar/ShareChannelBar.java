package com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar */
public final class ShareChannelBar extends FrameLayout implements AbstractC69681f {

    /* renamed from: a */
    private List<? extends AbstractC69581b> f155520a = C89086z.INSTANCE;

    /* renamed from: b */
    private AbstractC69681f f155521b;

    /* renamed from: c */
    private C69676d f155522c;

    /* renamed from: d */
    private final RecyclerView f155523d;

    static {
        Covode.recordClassIndex(82043);
    }

    /* renamed from: a */
    public final void mo109817a(AbstractC69681f fVar) {
        C89219l.m154721d(fVar, "");
        this.f155521b = fVar;
    }

    /* renamed from: a */
    public final void mo109818a(List<? extends AbstractC69581b> list) {
        C89219l.m154721d(list, "");
        this.f155520a = list;
        this.f155522c.mo109821a(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
    /* renamed from: a_ */
    public final void mo87413a_(AbstractC69581b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC69681f fVar = this.f155521b;
        if (fVar != null) {
            fVar.mo87413a_(bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareChannelBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(4222);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.z5});
        C89219l.m154716b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, C0643b.m2378c(getContext(), R.color.a3));
        obtainStyledAttributes.recycle();
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ah7, this, true);
        View findViewById = findViewById(R.id.a3z);
        C89219l.m154716b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f155523d = recyclerView;
        this.f155522c = new C69676d(context, this, true, false, color);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f155522c.mo109821a(this.f155520a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f155522c);
        MethodCollector.m26664o(4222);
    }
}
