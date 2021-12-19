package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1284f.AbstractC18272a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57448a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.AbstractC57449b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3345h.C57450c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.b.a */
public final class C57390a extends AbstractC18272a {

    /* renamed from: d */
    public AbstractC57449b f130829d;

    /* renamed from: e */
    public final Map<Integer, C57450c> f130830e = new HashMap();

    /* renamed from: f */
    public final Fragment f130831f;

    /* renamed from: g */
    public final String f130832g;

    /* renamed from: h */
    private final C57391b f130833h = new C57391b();

    /* renamed from: i */
    private final String f130834i;

    /* renamed from: j */
    private final View.OnTouchListener f130835j;

    static {
        Covode.recordClassIndex(67310);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f130833h.f130836a.size();
    }

    /* renamed from: a */
    public final Aweme mo94652a(int i) {
        return this.f130833h.mo94654a(i);
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18272a
    /* renamed from: a */
    public final void mo29161a(View view) {
        Object obj;
        AbstractC57448a aVar = null;
        if (view != null) {
            obj = view.getTag(R.id.c22);
        } else {
            obj = null;
        }
        if (obj instanceof AbstractC57448a) {
            aVar = obj;
        }
        AbstractC57448a aVar2 = aVar;
        if (aVar2 != null) {
            aVar2.mo94721c();
            if (this.f130830e.containsKey(Integer.valueOf(aVar2.mo94726h()))) {
                this.f130830e.remove(Integer.valueOf(aVar2.mo94726h()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo94653a(List<? extends Aweme> list) {
        C57391b bVar = this.f130833h;
        bVar.f130836a.clear();
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    bVar.f130836a.add(obj);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        View view = (View) obj;
        Object tag = view != null ? view.getTag(R.id.c22) : null;
        if (!(tag instanceof AbstractC57448a)) {
            tag = null;
        }
        AbstractC57448a aVar = (AbstractC57448a) tag;
        int count = getCount();
        for (int i = 0; i < count; i++) {
            Aweme a = mo94652a(i);
            if (aVar != null) {
                String aid = a != null ? a.getAid() : null;
                Aweme b = aVar.mo94720b();
                if (C13627m.m24499a(aid, b != null ? b.getAid() : null)) {
                    return i;
                }
            }
        }
        return -2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0155  */
    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18272a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo29160a(int r16, android.view.View r17, android.view.ViewGroup r18) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.commonfeed.p3334b.C57390a.mo29160a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57390a(Context context, Fragment fragment, String str, String str2, View.OnTouchListener onTouchListener) {
        super(context, LayoutInflater.from(context));
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(onTouchListener, "");
        this.f130831f = fragment;
        this.f130832g = str;
        this.f130834i = str2;
        this.f130835j = onTouchListener;
    }
}
