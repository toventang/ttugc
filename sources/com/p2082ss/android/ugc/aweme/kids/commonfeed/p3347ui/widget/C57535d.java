package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C1455k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57397d;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.report.p3346a.C57459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.d */
public final class C57535d extends LinearLayout {

    /* renamed from: a */
    private LinearLayout f131342a;

    /* renamed from: b */
    private RecyclerView f131343b;

    /* renamed from: c */
    private ReportErrorView f131344c;

    static {
        Covode.recordClassIndex(67481);
    }

    public final void setErrorVisibility(boolean z) {
        if (z) {
            ReportErrorView reportErrorView = this.f131344c;
            if (reportErrorView == null) {
                C89219l.m154710a("reportErrorView");
            }
            reportErrorView.setVisibility(4);
            return;
        }
        ReportErrorView reportErrorView2 = this.f131344c;
        if (reportErrorView2 == null) {
            C89219l.m154710a("reportErrorView");
        }
        reportErrorView2.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57535d(Context context, List<C57459a> list) {
        super(context, null);
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        MethodCollector.m26663i(7067);
        LayoutInflater.from(context).inflate(R.layout.ad2, this);
        View findViewById = findViewById(R.id.div);
        C89219l.m154716b(findViewById, "");
        this.f131342a = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.diu);
        C89219l.m154716b(findViewById2, "");
        this.f131343b = (RecyclerView) findViewById2;
        View findViewById3 = findViewById(R.id.dil);
        C89219l.m154716b(findViewById3, "");
        this.f131344c = (ReportErrorView) findViewById3;
        C57397d dVar = new C57397d(context);
        C89219l.m154721d(list, "");
        dVar.f130844a.clear();
        dVar.f130844a.addAll(list);
        dVar.notifyDataSetChanged();
        RecyclerView recyclerView = this.f131343b;
        if (recyclerView == null) {
            C89219l.m154710a("listView");
        }
        recyclerView.setAdapter(dVar);
        RecyclerView recyclerView2 = this.f131343b;
        if (recyclerView2 == null) {
            C89219l.m154710a("listView");
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        C1455k kVar = new C1455k(context);
        kVar.mo4960a(getResources().getDrawable(R.drawable.ay8));
        RecyclerView recyclerView3 = this.f131343b;
        if (recyclerView3 == null) {
            C89219l.m154710a("listView");
        }
        recyclerView3.mo4415b(kVar);
        ReportErrorView reportErrorView = this.f131344c;
        if (reportErrorView == null) {
            C89219l.m154710a("reportErrorView");
        }
        reportErrorView.setVisibility(4);
        MethodCollector.m26664o(7067);
    }
}
