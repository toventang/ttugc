package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46079a;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46091h;
import com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout;
import com.p2082ss.android.ugc.tools.view.widget.DoubleColorBallAnimationLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.p */
public final class C46184p extends AbstractLoadingLayout {

    /* renamed from: a */
    final List<C46079a> f107578a;

    /* renamed from: b */
    final C46153k f107579b;

    /* renamed from: c */
    final LinearLayoutManager f107580c;

    /* renamed from: d */
    private HashMap f107581d;

    static {
        Covode.recordClassIndex(54743);
    }

    /* renamed from: a */
    private View m89103a() {
        if (this.f107581d == null) {
            this.f107581d = new HashMap();
        }
        View view = (View) this.f107581d.get(Integer.valueOf((int) R.id.do_));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.do_);
        this.f107581d.put(Integer.valueOf((int) R.id.do_), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo78405a(C46079a aVar) {
        C89219l.m154721d(aVar, "");
        int indexOf = this.f107578a.indexOf(aVar);
        if (indexOf >= 0) {
            this.f107579b.notifyItemChanged(indexOf);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final View mo78403a(Context context, AttributeSet attributeSet) {
        C89219l.m154721d(context, "");
        return new DoubleColorBallAnimationLayout(context, attributeSet, 0);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractLoadingLayout
    /* renamed from: a */
    public final void mo78404a(int i, int i2) {
        int i3;
        super.mo78404a(i, i2);
        int i4 = 0;
        if (this.f190054e != null) {
            View view = this.f190054e;
            C89219l.m154716b(view, "");
            if (i2 == 0) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            view.setVisibility(i3);
        }
        View view2 = this.f190055f;
        C89219l.m154716b(view2, "");
        if (i2 != 1) {
            i4 = 8;
        }
        view2.setVisibility(i4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46184p(Context context, AbstractC46187r<? super C46079a> rVar, AbstractC46187r<? super C46091h> rVar2, AbstractC89172b<? super C46079a, C89391z> bVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(rVar, "");
        C89219l.m154721d(rVar2, "");
        ArrayList arrayList = new ArrayList();
        this.f107578a = arrayList;
        C46153k kVar = new C46153k(arrayList, rVar, rVar2, bVar);
        this.f107579b = kVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.mo4356b(0);
        this.f107580c = linearLayoutManager;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.zd, this, true);
        RecyclerView recyclerView = (RecyclerView) m89103a();
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) m89103a();
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(kVar);
    }
}
