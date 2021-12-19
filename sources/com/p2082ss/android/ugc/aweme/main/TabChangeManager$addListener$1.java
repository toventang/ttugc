package com.p2082ss.android.ugc.aweme.main;

import androidx.lifecycle.AbstractC1192f;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AbstractC34687g;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$addListener$1 */
public final class TabChangeManager$addListener$1 implements AbstractC1192f {

    /* renamed from: a */
    final /* synthetic */ TabChangeManager f134326a;

    /* renamed from: b */
    final /* synthetic */ AbstractC34687g f134327b;

    static {
        Covode.recordClassIndex(69346);
    }

    TabChangeManager$addListener$1(TabChangeManager tabChangeManager, AbstractC34687g gVar) {
        this.f134326a = tabChangeManager;
        this.f134327b = gVar;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            this.f134326a.f134311c.remove(this.f134327b);
        }
    }
}
