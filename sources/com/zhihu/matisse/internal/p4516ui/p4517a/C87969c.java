package com.zhihu.matisse.internal.p4516ui.p4517a;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4516ui.C87974c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.a.c */
public final class C87969c extends AbstractC0974l {

    /* renamed from: a */
    private ArrayList<Item> f199799a = new ArrayList<>();

    /* renamed from: b */
    private AbstractC87970a f199800b = null;

    /* renamed from: com.zhihu.matisse.internal.ui.a.c$a */
    public interface AbstractC87970a {
        static {
            Covode.recordClassIndex(103989);
        }
    }

    static {
        Covode.recordClassIndex(103988);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f199799a.size();
    }

    /* renamed from: a */
    public final void mo142505a(List<Item> list) {
        this.f199799a.addAll(list);
    }

    public C87969c(AbstractC0952i iVar) {
        super(iVar);
    }

    /* renamed from: c */
    public final Item mo142506c(int i) {
        return this.f199799a.get(i);
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        C87974c cVar = new C87974c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", this.f199799a.get(i));
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
    }
}
