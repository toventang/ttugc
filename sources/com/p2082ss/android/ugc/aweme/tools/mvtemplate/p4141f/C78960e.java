package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0975m;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.f.e */
public final class C78960e extends AbstractC0975m {

    /* renamed from: a */
    public C21582f f177467a;

    /* renamed from: b */
    private List<C78957b> f177468b = new ArrayList();

    /* renamed from: c */
    private List<MvThemeData> f177469c = new ArrayList();

    static {
        Covode.recordClassIndex(92109);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f177469c.size();
    }

    /* renamed from: b */
    public final void mo122759b(List<MvThemeData> list) {
        if (!C84904k.m145909a(list)) {
            this.f177469c.addAll(list);
            notifyDataSetChanged();
        }
    }

    public C78960e(AbstractC0952i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final void mo122757a(List<MvThemeData> list) {
        if (!C84904k.m145909a(list)) {
            this.f177469c.clear();
            this.f177469c.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final MvThemeData mo122760c(int i) {
        if (!C84904k.m145909a(this.f177469c) && i >= 0 && i < this.f177469c.size()) {
            return this.f177469c.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public final C78957b mo3649a(int i) {
        if (i < this.f177468b.size()) {
            return this.f177468b.get(i);
        }
        C78957b a = C78957b.m137771a(this.f177469c.get(i), i, this.f177467a);
        this.f177468b.add(a);
        return a;
    }
}
