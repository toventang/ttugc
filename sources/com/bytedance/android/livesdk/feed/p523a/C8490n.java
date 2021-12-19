package com.bytedance.android.livesdk.feed.p523a;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.feed.a.n */
public final /* synthetic */ class C8490n implements AbstractC1214u {

    /* renamed from: a */
    private final C8476d f20997a;

    static {
        Covode.recordClassIndex(9343);
    }

    C8490n(C8476d dVar) {
        this.f20997a = dVar;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        Map<String, Long> map;
        C8476d dVar = this.f20997a;
        if (obj == BaseFeedRepository.EnumC8657a.START && (map = dVar.f20962a.f20945l) != null) {
            map.size();
        }
        if (obj == BaseFeedRepository.EnumC8657a.SUCCESS) {
            AbstractC8472a aVar = dVar.f20962a;
            aVar.mo14805a(aVar.f20945l, false);
            dVar.f20963b.mo4413b(0);
        }
    }
}
