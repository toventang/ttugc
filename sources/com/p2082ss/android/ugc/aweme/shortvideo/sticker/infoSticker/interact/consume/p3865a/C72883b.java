package com.p2082ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p3865a;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a.b */
public final class C72883b extends AbstractC0974l {

    /* renamed from: a */
    public final List<Fragment> f163545a = new ArrayList();

    static {
        Covode.recordClassIndex(85575);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f163545a.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72883b(AbstractC0952i iVar) {
        super(iVar);
        C89219l.m154721d(iVar, "");
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return this.f163545a.get(i);
    }
}
