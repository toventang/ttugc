package com.p2082ss.android.ugc.aweme.contentlanguage.p2684a;

import android.os.Bundle;
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
import com.p2082ss.android.ugc.aweme.contentlanguage.C40180a;
import com.p2082ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53452a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.contentlanguage.a.a */
public final class C40184a extends AbstractC34586a implements AbstractC1214u<ArrayList<C53451b>>, C40180a.AbstractC40182a {

    /* renamed from: a */
    public ContentPreferenceViewModel f94352a;

    /* renamed from: b */
    TextTitleBar f94353b;

    /* renamed from: c */
    RecyclerView f94354c;

    /* renamed from: d */
    public int f94355d;

    /* renamed from: e */
    private C40180a f94356e;

    /* renamed from: j */
    private int f94357j;

    static {
        Covode.recordClassIndex(47976);
    }

    /* renamed from: a */
    public final void mo69382a() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().mo3562c();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ContentPreferenceViewModel contentPreferenceViewModel = this.f94352a;
        if (contentPreferenceViewModel != null && contentPreferenceViewModel.f94424b) {
            contentPreferenceViewModel.mo69435e();
            contentPreferenceViewModel.f94424b = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(ArrayList<C53451b> arrayList) {
        ArrayList<C53451b> arrayList2 = arrayList;
        if (!C13603b.m24435a((Collection) arrayList2)) {
            C40180a aVar = this.f94356e;
            if (aVar == null) {
                C40180a aVar2 = new C40180a(getContext(), this);
                this.f94356e = aVar2;
                aVar2.f94345a = arrayList2;
                this.f94354c.setAdapter(this.f94356e);
                return;
            }
            aVar.f94345a = arrayList2;
            this.f94356e.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.contentlanguage.C40180a.AbstractC40182a
    /* renamed from: a */
    public final void mo69381a(int i) {
        C53451b bVar;
        ArrayList<C53451b> value;
        C53451b bVar2;
        if (i != this.f94355d) {
            if (i == this.f94357j) {
                this.f94353b.getEndText().setTextColor(C0643b.m2378c(getContext(), R.color.y));
                this.f94353b.getEndText().setEnabled(false);
            } else {
                this.f94353b.getEndText().setTextColor(C0643b.m2378c(getContext(), R.color.bh));
                this.f94353b.getEndText().setEnabled(true);
            }
            ContentPreferenceViewModel contentPreferenceViewModel = this.f94352a;
            int i2 = this.f94355d;
            C1213t<ArrayList<C53451b>> d = contentPreferenceViewModel.mo69434d();
            if (!C13603b.m24435a((Collection) d.getValue())) {
                if (!(i2 < 0 || (value = d.getValue()) == null || (bVar2 = value.get(i2)) == null)) {
                    bVar2.f122675a = false;
                }
                ArrayList<C53451b> value2 = d.getValue();
                if (!(value2 == null || (bVar = value2.get(i)) == null)) {
                    bVar.f122675a = true;
                }
                contentPreferenceViewModel.f94423a = i;
            }
            this.f94355d = i;
            this.f94356e.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        ArrayList<C53451b> value;
        C53451b bVar;
        super.onCreate(bundle);
        if (getActivity() != null) {
            Integer num = null;
            ContentPreferenceViewModel contentPreferenceViewModel = (ContentPreferenceViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(ContentPreferenceViewModel.class);
            this.f94352a = contentPreferenceViewModel;
            contentPreferenceViewModel.mo69434d().observe(this, this);
            ContentPreferenceViewModel contentPreferenceViewModel2 = this.f94352a;
            C89219l.m154721d(getContext(), "");
            if (!C13603b.m24435a((Collection) contentPreferenceViewModel2.mo69434d().getValue()) && contentPreferenceViewModel2.f94423a >= 0) {
                int i = contentPreferenceViewModel2.f94423a;
                ArrayList<C53451b> value2 = contentPreferenceViewModel2.mo69434d().getValue();
                if (value2 == null || (num = Integer.valueOf(value2.size())) == null) {
                    C89219l.m154715b();
                }
                if (!(i > num.intValue() - 1 || (value = contentPreferenceViewModel2.mo69434d().getValue()) == null || (bVar = value.get(contentPreferenceViewModel2.f94423a)) == null)) {
                    bVar.f122675a = false;
                }
            }
            this.f94357j = -1;
            this.f94355d = -1;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        this.f94353b = (TextTitleBar) view.findViewById(R.id.eiz);
        this.f94354c = (RecyclerView) view.findViewById(R.id.c_b);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = this.f94354c;
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        this.f94354c.mo4402a(C34692l.m70857a(getContext()));
        this.f94353b.getTitleView().setTextColor(C0643b.m2378c(getContext(), R.color.np));
        this.f94353b.setTitle(getText(R.string.atp));
        this.f94353b.getEndText().setEnabled(false);
        this.f94353b.getEndText().setTextColor(C0643b.m2378c(getContext(), R.color.y));
        this.f94353b.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.contentlanguage.p2684a.C40184a.C401851 */

            static {
                Covode.recordClassIndex(47977);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                if (C40184a.this.getActivity() != null) {
                    C40184a.this.getActivity().getSupportFragmentManager().mo3562c();
                }
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
                C68343a aVar;
                if (C40184a.this.f94353b == null || C40184a.this.f94353b.getEndText() == null || C40184a.this.f94353b.getEndText().getCurrentTextColor() == C0643b.m2378c(view.getContext(), R.color.y)) {
                    C40184a.this.mo69382a();
                } else if (C40184a.this.f94355d != -1) {
                    ContentPreferenceViewModel contentPreferenceViewModel = C40184a.this.f94352a;
                    C53451b bVar = C40184a.this.f94352a.mo69434d().getValue().get(C40184a.this.f94355d);
                    if (bVar == null) {
                        aVar = null;
                    } else {
                        aVar = new C68343a();
                        if (bVar.f122676b instanceof C53452a) {
                            C53452a aVar2 = (C53452a) bVar.f122676b;
                            aVar.setEnglishName(aVar2.f122677a);
                            aVar.setLanguageCode(aVar2.f122678b);
                            aVar.setLocalName(bVar.mo90015a());
                        } else {
                            throw new IllegalStateException("please send I18nLanguageItem");
                        }
                    }
                    contentPreferenceViewModel.mo69430a(aVar);
                    C40184a.this.mo69382a();
                }
            }
        });
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.b3, viewGroup, false);
    }
}
