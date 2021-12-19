package com.p2082ss.android.ugc.aweme.journey.step.p3295d;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.C40313cq;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.p2082ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.d.a */
public final class C56916a extends AbstractC34586a {

    /* renamed from: a */
    private SparseArray f129620a;

    static {
        Covode.recordClassIndex(66803);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f129620a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        C89219l.m154721d(view, "");
        if (this.f129620a == null) {
            this.f129620a = new SparseArray();
        }
        View view2 = (View) this.f129620a.get(R.id.cfy);
        String str = null;
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.cfy);
                this.f129620a.put(R.id.cfy, view2);
            }
        }
        TuxStatusView tuxStatusView = (TuxStatusView) view2;
        if (tuxStatusView != null) {
            tuxStatusView.mo37867a();
        }
        Intent i = ((ComponentDependencies) C1181ae.m3881a(requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class)).mo94083i();
        if (i != null && i.getData() != null) {
            IDeepLinkService g = DeepLinkServiceImpl.m82568g();
            Uri data = i.getData();
            if (data != null) {
                str = data.getScheme();
            }
            if (g.mo70179c(str)) {
                intent = new Intent(getActivity(), C40313cq.f94478a.mo60093b());
            } else {
                intent = new Intent(getActivity(), C40313cq.f94478a.mo60090a());
            }
            intent.setFlags(536870912);
            intent.setAction("android.intent.action.VIEW");
            C29844g gVar = new C29844g(String.valueOf(i.getData()));
            gVar.mo52130a("random", new Random(1000).toString());
            intent.setData(Uri.parse(gVar.mo52126a()));
            intent.putExtras(i);
            intent.putExtra("new_user_journey", true);
            intent.putExtra("inner_from", "new_user_journey");
            if (i.getBooleanExtra("from_task", false)) {
                ActivityC0945e activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
                AbstractC81915c.m141874a(new C56955b());
                return;
            }
            ActivityC0945e activity2 = getActivity();
            if (activity2 != null) {
                activity2.startActivityForResult(intent, 1);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ab8, viewGroup, false);
    }
}
