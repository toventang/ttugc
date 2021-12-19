package com.p2082ss.android.ugc.aweme.contentlanguage;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.contentlanguage.ContentLanguageAdapter$1 */
public class ContentLanguageAdapter$1 implements AbstractC33974au {

    /* renamed from: a */
    final /* synthetic */ C40190d f94344a;

    static {
        Covode.recordClassIndex(47969);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        if (this.f94344a.f94367d != null) {
            this.f94344a.f94367d.f94417a.mo142944a();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public void onResume() {
        if (this.f94344a.f94366c != null) {
            C40190d dVar = this.f94344a;
            dVar.f94364a = dVar.f94366c.mo69433c().getValue();
            this.f94344a.notifyDataSetChanged();
        }
    }

    ContentLanguageAdapter$1(C40190d dVar) {
        this.f94344a = dVar;
    }
}
