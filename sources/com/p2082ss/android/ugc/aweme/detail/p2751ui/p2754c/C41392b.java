package com.p2082ss.android.ugc.aweme.detail.p2751ui.p2754c;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.c.b */
public final class C41392b extends C41387a {

    /* renamed from: t */
    private SparseArray f96570t;

    static {
        Covode.recordClassIndex(49287);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2754c.C41387a
    /* renamed from: a */
    public final View mo61343a(int i) {
        if (this.f96570t == null) {
            this.f96570t = new SparseArray();
        }
        View view = (View) this.f96570t.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f96570t.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2754c.C41387a
    /* renamed from: e */
    public final void mo61344e() {
        SparseArray sparseArray = this.f96570t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.detail.p2751ui.p2754c.C41387a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public final void onDestroy() {
        String str;
        super.onDestroy();
        C49812b bVar = this.f96635j;
        C89219l.m154716b(bVar, "");
        String eventType = bVar.getEventType();
        C89219l.m154716b(eventType, "");
        C41178b bVar2 = this.f96636k;
        C89219l.m154716b(bVar2, "");
        Aweme bM = bVar2.mo84738bM();
        if (bM == null || (str = bM.getAid()) == null) {
            str = "";
        }
        C89219l.m154721d(eventType, "");
        C89219l.m154721d(str, "");
        C39162r.m79460a("westwindow_play_end", new C33744d().mo59983a("enter_from", eventType).mo59983a("enter_method", C76598h.f171916a).mo59983a("last_group_id", str).f79943a);
        C76598h.f171916a = "system";
    }
}
