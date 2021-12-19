package com.bytedance.android.livesdk.chatroom.p499ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.C1764a;
import com.bytedance.android.p147c.p148a.AbstractC2713c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.as */
public final class C7769as extends PagerAdapter {

    /* renamed from: a */
    private final List<AbstractC2713c> f19282a;

    static {
        Covode.recordClassIndex(8564);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f19282a.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.c.a.c> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7769as(List<? extends AbstractC2713c> list) {
        C89219l.m154721d(list, "");
        this.f19282a = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return C89219l.m154714a(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        MethodCollector.m26663i(9561);
        C89219l.m154721d(viewGroup, "");
        AbstractC2713c cVar = this.f19282a.get(i);
        C89219l.m154721d(viewGroup, "");
        if (cVar.f8103f == null) {
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.baz, viewGroup, false);
            C89219l.m154716b(a, "");
            cVar.f8103f = a;
            View view = cVar.f8103f;
            if (view == null) {
                C89219l.m154710a("view");
            }
            View findViewById = view.findViewById(R.id.bou);
            C89219l.m154716b(findViewById, "");
            cVar.f8107j = findViewById;
            View view2 = cVar.f8107j;
            if (view2 == null) {
                C89219l.m154710a("deleteView");
            }
            view2.setOnClickListener(new AbstractC2713c.View$OnClickListenerC2715b(cVar));
            View view3 = cVar.f8103f;
            if (view3 == null) {
                C89219l.m154710a("view");
            }
            ViewGroup viewGroup2 = (ViewGroup) view3.findViewById(R.id.bot);
            C89219l.m154716b(viewGroup2, "");
            viewGroup2.addView(cVar.mo7224a(viewGroup2), -1, -1);
        }
        View view4 = cVar.f8103f;
        if (view4 == null) {
            C89219l.m154710a("view");
        }
        viewGroup.addView(view4, -1, -1);
        MethodCollector.m26664o(9561);
        return view4;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(9562);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null) {
            viewGroup.removeView(view);
            MethodCollector.m26664o(9562);
            return;
        }
        MethodCollector.m26664o(9562);
    }
}
