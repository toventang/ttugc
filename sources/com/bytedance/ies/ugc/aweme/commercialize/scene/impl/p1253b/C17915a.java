package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1253b;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17886b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17887c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.C17885a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17889b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17890c;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.b.a */
public final class C17915a implements AbstractC17886b {

    /* renamed from: a */
    private C17885a f42690a;

    /* renamed from: b */
    private AbstractC17887c f42691b;

    /* renamed from: c */
    private Fragment f42692c;

    static {
        Covode.recordClassIndex(20525);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17886b
    /* renamed from: a */
    public final void mo28469a() {
        m33224c();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1247a.AbstractC17886b
    /* renamed from: b */
    public final void mo28470b() {
        m33224c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if (r1.mo28472a(r0) == false) goto L_0x006f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m33224c() {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1253b.C17915a.m33224c():void");
    }

    /* renamed from: a */
    private static boolean m33223a(Intent intent) {
        if (intent == null || !TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") || !intent.hasCategory("android.intent.category.LAUNCHER")) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17888a
    /* renamed from: a */
    public final void mo28473a(AbstractC17890c cVar) {
        C89219l.m154721d(cVar, "");
        C17885a aVar = (C17885a) cVar;
        this.f42690a = aVar;
        if (aVar == null) {
            C89219l.m154710a("feedRecommendFragmentAdDepend");
        }
        AbstractC17889b bVar = aVar.f42655b;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.feed_recommend.IFeedRecommendFragmentAdSceneCallBack");
        this.f42691b = (AbstractC17887c) bVar;
        C17885a aVar2 = this.f42690a;
        if (aVar2 == null) {
            C89219l.m154710a("feedRecommendFragmentAdDepend");
        }
        Fragment fragment = aVar2.f42654a;
        if (fragment == null) {
            C89219l.m154710a("fragment");
        }
        this.f42692c = fragment;
    }
}
