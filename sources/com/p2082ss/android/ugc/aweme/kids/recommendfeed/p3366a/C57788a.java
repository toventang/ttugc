package com.p2082ss.android.ugc.aweme.kids.recommendfeed.p3366a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57402b;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.C57487b;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.model.C57792a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.a.a */
public final class C57788a extends AbstractC34586a implements AbstractC57402b {

    /* renamed from: a */
    public static final C57789a f131815a = new C57789a((byte) 0);

    /* renamed from: b */
    private C57487b f131816b;

    /* renamed from: c */
    private HashMap f131817c;

    static {
        Covode.recordClassIndex(67779);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.recommendfeed.a.a$a */
    public static final class C57789a {
        static {
            Covode.recordClassIndex(67780);
        }

        private C57789a() {
        }

        public /* synthetic */ C57789a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57402b
    /* renamed from: a */
    public final void mo94665a() {
        C57487b bVar = this.f131816b;
        if (bVar != null) {
            bVar.mo94742a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57402b
    /* renamed from: b */
    public final void mo94666b() {
        C57487b bVar = this.f131816b;
        if (bVar != null) {
            bVar.f131117a.mo94674f();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131817c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        C57487b bVar = this.f131816b;
        if (bVar != null) {
            bVar.f131117a.f130868h = !z;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Fragment a = getChildFragmentManager().mo3551a("recommend_feed_fragment");
        if (!(a instanceof C57487b)) {
            a = null;
        }
        C57487b bVar = (C57487b) a;
        this.f131816b = bVar;
        if (bVar == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from", "homepage_hot");
            C57792a aVar = new C57792a();
            C89219l.m154721d(bundle2, "");
            C89219l.m154721d(aVar, "");
            C57487b bVar2 = new C57487b();
            bVar2.f131118b = aVar;
            bVar2.setArguments(bundle2);
            AbstractC0976n a2 = getChildFragmentManager().mo3552a();
            C89219l.m154716b(a2, "");
            a2.mo3470b(R.id.a4t, bVar2, "recommend_feed_fragment");
            a2.mo3473c();
            this.f131816b = bVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.acp, viewGroup, false);
    }
}
