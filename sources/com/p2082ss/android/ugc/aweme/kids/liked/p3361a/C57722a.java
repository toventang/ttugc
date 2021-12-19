package com.p2082ss.android.ugc.aweme.kids.liked.p3361a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.kids.common.p3331ui.awemegrid.AbstractC57377c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.a.a */
public final class C57722a extends AbstractC34586a {

    /* renamed from: a */
    public static final C57723a f131707a = new C57723a((byte) 0);

    /* renamed from: b */
    private AbstractC57377c f131708b;

    /* renamed from: c */
    private HashMap f131709c;

    static {
        Covode.recordClassIndex(67699);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.a.a$a */
    public static final class C57723a {
        static {
            Covode.recordClassIndex(67700);
        }

        private C57723a() {
        }

        public /* synthetic */ C57723a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f131709c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Fragment a = getChildFragmentManager().mo3551a("favorite_grid_fragment");
        if (!(a instanceof AbstractC57377c)) {
            a = null;
        }
        AbstractC57377c cVar = (AbstractC57377c) a;
        this.f131708b = cVar;
        if (cVar == null && getContext() != null) {
            Bundle bundle2 = new Bundle();
            C57724b bVar = new C57724b((byte) 0);
            bVar.f130783b = new C57728c();
            bVar.setArguments(bundle2);
            AbstractC0976n a2 = getChildFragmentManager().mo3552a();
            C89219l.m154716b(a2, "");
            a2.mo3470b(R.id.c8q, bVar, "favorite_grid_fragment");
            a2.mo3473c();
            this.f131708b = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ad8, viewGroup, false);
    }
}
