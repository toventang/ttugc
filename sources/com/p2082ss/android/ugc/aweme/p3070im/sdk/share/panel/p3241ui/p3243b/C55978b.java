package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3242a.C55974b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.C56055a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.widget.SharePanelWidget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56266c;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b.C56269b;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.b.b */
public final class C55978b extends C55979c {

    /* renamed from: a */
    public SharePanelWidget f127644a;

    /* renamed from: b */
    public final C56269b f127645b;

    /* renamed from: c */
    public final AbstractC56266c f127646c;

    static {
        Covode.recordClassIndex(65772);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b, com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55979c
    /* renamed from: a */
    public final View mo92844a() {
        SharePanelWidget sharePanelWidget = this.f127644a;
        if (sharePanelWidget == null) {
            return null;
        }
        View view = sharePanelWidget.f127802e;
        if (view == null) {
            C89219l.m154710a("editLayout");
        }
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b, com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55979c
    /* renamed from: b */
    public final View mo92845b() {
        SharePanelWidget sharePanelWidget = this.f127644a;
        if (sharePanelWidget != null) {
            return sharePanelWidget.f127805h;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b, com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55979c
    /* renamed from: c */
    public final List<IMContact> mo92846c() {
        SharePanelWidget sharePanelWidget = this.f127644a;
        if (sharePanelWidget == null) {
            return null;
        }
        SharePanelViewModel sharePanelViewModel = sharePanelWidget.f127799b;
        if (sharePanelViewModel == null) {
            C89219l.m154710a("viewModel");
        }
        return C89070n.m154585g((Collection) sharePanelViewModel.mo92938b());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.share.AbstractC56267b, com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3243b.C55979c
    /* renamed from: d */
    public final void mo92847d() {
        SharePanelWidget sharePanelWidget = this.f127644a;
        if (sharePanelWidget != null) {
            SharePanelViewModel sharePanelViewModel = sharePanelWidget.f127799b;
            if (sharePanelViewModel == null) {
                C89219l.m154710a("viewModel");
            }
            sharePanelViewModel.mo92938b().clear();
            C56055a aVar = sharePanelWidget.f127804g;
            if (aVar != null) {
                aVar.mo92916b().mo92924d();
                aVar.mo92918d();
            }
            C55974b bVar = sharePanelWidget.f127801d;
            if (bVar == null) {
                C89219l.m154710a("headAdapter");
            }
            bVar.notifyDataSetChanged();
            RecyclerView recyclerView = sharePanelWidget.f127800c;
            if (recyclerView == null) {
                C89219l.m154710a("headRecyclerView");
            }
            recyclerView.mo4413b(0);
            sharePanelWidget.mo92904b();
            sharePanelWidget.mo92905c();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55978b(C56269b bVar, AbstractC56266c cVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        this.f127645b = bVar;
        this.f127646c = cVar;
    }
}
