package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.AbstractC60162u;
import com.p2082ss.android.ugc.aweme.view.p4230b.C81152a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.d */
public final class C81127d extends AbstractC0975m {

    /* renamed from: a */
    public Context f181297a;

    /* renamed from: b */
    public AbstractC0952i f181298b;

    /* renamed from: c */
    public List<? extends AbstractC60162u> f181299c;

    static {
        Covode.recordClassIndex(94455);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f181299c.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return ((AbstractC60162u) this.f181299c.get(i)).mo97837b();
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        AbstractC60162u uVar = (AbstractC60162u) this.f181299c.get(i);
        C89219l.m154721d(uVar, "");
        C81152a aVar = new C81152a();
        aVar.f181347a = uVar;
        return aVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81127d(Context context, AbstractC0952i iVar, List<? extends AbstractC60162u> list) {
        super(iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(list, "");
        this.f181297a = context;
        this.f181298b = iVar;
        this.f181299c = list;
    }
}
