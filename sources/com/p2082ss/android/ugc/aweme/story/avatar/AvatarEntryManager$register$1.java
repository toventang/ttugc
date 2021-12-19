package com.p2082ss.android.ugc.aweme.story.avatar;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.AvatarEntryManager$register$1 */
public final class AvatarEntryManager$register$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ AbstractC1204m f171770a;

    static {
        Covode.recordClassIndex(89469);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        Integer num;
        AbstractC1204m mVar = this.f171770a;
        StringBuilder append = new StringBuilder("target: ").append(mVar).append(", views: ");
        Set<AbstractC76546f> set = C76494a.f171781c.get(mVar);
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        append.append(num);
        Set<AbstractC76546f> set2 = C76494a.f171781c.get(mVar);
        if (set2 != null) {
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                C76494a.f171782d.mo120230a((AbstractC76546f) it.next());
            }
        }
        C76494a.f171781c.remove(mVar);
    }

    AvatarEntryManager$register$1(AbstractC1204m mVar) {
        this.f171770a = mVar;
    }
}
