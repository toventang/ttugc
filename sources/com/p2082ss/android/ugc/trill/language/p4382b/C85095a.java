package com.p2082ss.android.ugc.trill.language.p4382b;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.p4204e.C80369a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.language.p4381a.C85091a;
import com.p2082ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.trill.language.b.a */
public final class C85095a extends AbstractC34586a implements AbstractC1214u<ArrayList<C53451b>>, C85091a.AbstractC85093a {

    /* renamed from: a */
    TextTitleBar f190379a;

    /* renamed from: b */
    RecyclerView f190380b;

    /* renamed from: c */
    public int f190381c;

    /* renamed from: d */
    private AppLanguageViewModel f190382d;

    /* renamed from: e */
    private C85091a f190383e;

    /* renamed from: j */
    private int f190384j;

    static {
        Covode.recordClassIndex(99118);
    }

    /* renamed from: a */
    public final void mo130033a() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(ArrayList<C53451b> arrayList) {
        ArrayList<C53451b> arrayList2 = arrayList;
        if (!C13603b.m24435a((Collection) arrayList2)) {
            C85091a aVar = this.f190383e;
            if (aVar == null) {
                C85091a aVar2 = new C85091a(getContext(), this);
                this.f190383e = aVar2;
                aVar2.f190372a = arrayList2;
                this.f190380b.setAdapter(this.f190383e);
                return;
            }
            aVar.f190372a = arrayList2;
            this.f190383e.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.language.p4381a.C85091a.AbstractC85093a
    /* renamed from: b */
    public final void mo130032b(int i) {
        if (i != this.f190381c) {
            if (i == this.f190384j) {
                this.f190379a.getEndText().setTextColor(C0643b.m2378c(getContext(), R.color.y));
                this.f190379a.getEndText().setEnabled(false);
            } else {
                this.f190379a.getEndText().setTextColor(C0643b.m2378c(getContext(), R.color.bh));
                this.f190379a.getEndText().setEnabled(true);
            }
            AppLanguageViewModel appLanguageViewModel = this.f190382d;
            int i2 = this.f190381c;
            C1213t<ArrayList<C53451b>> tVar = appLanguageViewModel.f190386a;
            if (!C13603b.m24435a((Collection) tVar.getValue())) {
                if (i2 >= 0) {
                    tVar.getValue().get(i2).f122675a = false;
                }
                tVar.getValue().get(i).f122675a = true;
                appLanguageViewModel.f190387b = i;
            }
            this.f190381c = i;
            this.f190383e.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(AppLanguageViewModel.class);
            this.f190382d = appLanguageViewModel;
            if (appLanguageViewModel.f190386a == null) {
                appLanguageViewModel.f190386a = new C1213t<>();
            }
            appLanguageViewModel.f190386a.observe(this, this);
            AppLanguageViewModel appLanguageViewModel2 = this.f190382d;
            int i = -1;
            String b = C53438a.m98624b(getContext());
            ArrayList<C53451b> arrayList = new ArrayList<>();
            for (AbstractC58069b bVar : SettingServiceImpl.m120782v().mo108874j().values()) {
                if (TextUtils.equals(bVar.mo90021e(), b)) {
                    arrayList.add(new C53451b(bVar, true));
                    i = arrayList.size() - 1;
                } else {
                    arrayList.add(new C53451b(bVar, false));
                }
            }
            appLanguageViewModel2.f190386a.postValue(arrayList);
            this.f190384j = i;
            this.f190381c = i;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        this.f190379a = (TextTitleBar) view.findViewById(R.id.eiz);
        this.f190380b = (RecyclerView) view.findViewById(R.id.c_b);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.f190380b;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f190380b.mo4402a(C34692l.m70857a(getContext()));
        this.f190379a.getTitleView().setTextColor(C0643b.m2378c(this.f190379a.getContext(), R.color.np));
        this.f190379a.setTitle(getText(R.string.u5));
        this.f190379a.getEndText().setEnabled(false);
        this.f190379a.getEndText().setTextColor(C0643b.m2378c(this.f190379a.getContext(), R.color.y));
        this.f190379a.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.trill.language.p4382b.C85095a.C850961 */

            static {
                Covode.recordClassIndex(99119);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                C85095a.this.mo130033a();
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
                if (C85095a.this.f190379a == null || C85095a.this.f190379a.getEndText() == null || C85095a.this.f190379a.getEndText().getCurrentTextColor() == C0643b.m2378c(C85095a.this.f190379a.getContext(), R.color.y)) {
                    C85095a.this.mo130033a();
                    return;
                }
                C53453b.C53456a.f122693a.mo90023a(SettingServiceImpl.m120782v().mo108873i().get(C85095a.this.f190381c).mo90017a(), SettingServiceImpl.m120782v().mo108873i().get(C85095a.this.f190381c).mo90022f(), C85095a.this.getContext());
                AVExternalServiceImpl.m113114a().configService().cacheConfig().clearFilterCache();
                C80369a.f179895a = 0.0f;
            }
        });
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ax7, viewGroup, false);
    }
}
