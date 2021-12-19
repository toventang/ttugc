package com.p2082ss.android.ugc.aweme.prop.p3605a;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.prop.a.a */
public final class C65261a<T extends AbstractC34586a> extends AbstractC0974l {

    /* renamed from: a */
    private List<T> f147258a;

    static {
        Covode.recordClassIndex(76738);
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: b */
    public final long mo3640b(int i) {
        return (long) i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f147258a.size();
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return this.f147258a.get(i);
    }

    public C65261a(AbstractC0952i iVar, List<T> list) {
        super(iVar);
        this.f147258a = list;
    }
}
