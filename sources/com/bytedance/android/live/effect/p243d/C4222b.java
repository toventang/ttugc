package com.bytedance.android.live.effect.p243d;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.p242c.C4199e;
import com.bytedance.android.live.effect.p244e.C4251c;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.d.b */
public final class C4222b extends AbstractC0975m {

    /* renamed from: a */
    public Fragment f11708a;

    /* renamed from: b */
    private final List<String> f11709b = new ArrayList();

    static {
        Covode.recordClassIndex(4792);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        C89219l.m154721d(obj, "");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f11709b.size() + 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4222b(AbstractC0952i iVar) {
        super(iVar);
        C89219l.m154721d(iVar, "");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i == this.f11709b.size()) {
            return C4147a.f11588f;
        }
        return this.f11709b.get(i);
    }

    @Override // androidx.fragment.app.AbstractC0975m
    /* renamed from: a */
    public final Fragment mo3649a(int i) {
        if (i == this.f11709b.size()) {
            return new C4199e();
        }
        String str = this.f11709b.get(i);
        C89219l.m154721d(str, "");
        C4251c cVar = new C4251c();
        Bundle bundle = new Bundle();
        bundle.putString("live_effect_panel_name", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    /* renamed from: a */
    public final void mo9927a(List<C4315e<C11672a>> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f11861a);
        }
        ArrayList arrayList2 = arrayList;
        boolean z = !C89219l.m154714a(this.f11709b, arrayList2);
        this.f11709b.clear();
        this.f11709b.addAll(arrayList2);
        if (z) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0975m
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Object obj2;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (!C89219l.m154714a(this.f11708a, obj)) {
            if (!(obj instanceof Fragment)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            this.f11708a = (Fragment) obj2;
        }
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
