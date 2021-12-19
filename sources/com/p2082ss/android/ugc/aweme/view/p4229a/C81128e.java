package com.p2082ss.android.ugc.aweme.view.p4229a;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.C60152l;
import com.p2082ss.android.ugc.aweme.view.p4230b.C81154b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.view.a.e */
public final class C81128e extends AbstractC0975m {

    /* renamed from: a */
    public Context f181300a;

    /* renamed from: b */
    public AbstractC0952i f181301b;

    /* renamed from: c */
    public AbstractC60142d f181302c;

    /* renamed from: d */
    private final List<C60152l> f181303d = new ArrayList(this.f181302c.mo97820f().values());

    static {
        Covode.recordClassIndex(94456);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f181302c.mo97820f().size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        return this.f181303d.get(i).f137117c;
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        C60152l lVar = this.f181303d.get(i);
        AbstractC60142d dVar = this.f181302c;
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(dVar, "");
        C81154b bVar = new C81154b();
        bVar.f181350a = dVar;
        bVar.f181351b = lVar;
        return bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        super.destroyItem(viewGroup, i, obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81128e(Context context, AbstractC0952i iVar, AbstractC60142d dVar) {
        super(iVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(dVar, "");
        this.f181300a = context;
        this.f181301b = iVar;
        this.f181302c = dVar;
    }
}
