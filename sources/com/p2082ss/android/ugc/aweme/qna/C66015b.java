package com.p2082ss.android.ugc.aweme.qna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.b */
public final class C66015b extends AbstractC0975m {

    /* renamed from: a */
    public int f148631a = -1;

    /* renamed from: b */
    public final Context f148632b;

    /* renamed from: c */
    private final List<AbstractC66098a> f148633c = new ArrayList();

    static {
        Covode.recordClassIndex(77521);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f148633c.size();
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        return mo105076b(i);
    }

    /* renamed from: a */
    public final void mo105075a(AbstractC66098a aVar) {
        C89219l.m154721d(aVar, "");
        this.f148633c.add(aVar);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final AbstractC66098a mo105076b(int i) {
        return this.f148633c.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        String string = this.f148632b.getString(mo105076b(i).mo64296c(), "0");
        C89219l.m154716b(string, "");
        return string;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66015b(Context context, AbstractC0952i iVar) {
        super(iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        this.f148632b = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
        this.f148633c.remove(i);
        notifyDataSetChanged();
    }
}
