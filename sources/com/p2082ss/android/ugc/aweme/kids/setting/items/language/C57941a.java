package com.p2082ss.android.ugc.aweme.kids.setting.items.language;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3378a.C57943a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3380c.C57951b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d.C57953a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.viewmodel.AppLanguageViewModel;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a */
public final class C57941a extends AbstractC34586a implements AbstractC1214u<ArrayList<C57951b>>, C57943a.AbstractC57944a {

    /* renamed from: a */
    public int f132091a;

    /* renamed from: b */
    private AppLanguageViewModel f132092b;

    /* renamed from: c */
    private C57943a f132093c;

    /* renamed from: d */
    private int f132094d;

    /* renamed from: e */
    private HashMap f132095e;

    static {
        Covode.recordClassIndex(67964);
    }

    /* renamed from: b */
    public final View mo95291b(int i) {
        if (this.f132095e == null) {
            this.f132095e = new HashMap();
        }
        View view = (View) this.f132095e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f132095e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f132095e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo95289a() {
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            activity.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.a$a */
    public static final class C57942a implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C57941a f132096a;

        static {
            Covode.recordClassIndex(67965);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57942a(C57941a aVar) {
            this.f132096a = aVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f132096a.mo95289a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
            if (r3 == androidx.core.content.C0643b.m2378c(r1, com.p2082ss.android.ugc.trill.R.color.y)) goto L_0x004b;
         */
        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo27340b(android.view.View r9) {
            /*
            // Method dump skipped, instructions count: 291
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.items.language.C57941a.C57942a.mo27340b(android.view.View):void");
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(ArrayList<C57951b> arrayList) {
        ArrayList<C57951b> arrayList2 = arrayList;
        if (!C13603b.m24435a((Collection) arrayList2)) {
            C57943a aVar = this.f132093c;
            if (aVar == null) {
                Context context = getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                C57943a aVar2 = new C57943a(context, this);
                this.f132093c = aVar2;
                aVar2.f132097a = arrayList2;
                RecyclerView recyclerView = (RecyclerView) mo95291b(R.id.c_b);
                if (recyclerView != null) {
                    recyclerView.setAdapter(this.f132093c);
                    return;
                }
                return;
            }
            aVar.f132097a = arrayList2;
            C57943a aVar3 = this.f132093c;
            if (aVar3 != null) {
                aVar3.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3378a.C57943a.AbstractC57944a
    /* renamed from: a */
    public final void mo95290a(int i) {
        DmtTextView endText;
        DmtTextView endText2;
        DmtTextView endText3;
        DmtTextView endText4;
        if (i != this.f132091a) {
            if (i == this.f132094d) {
                TextTitleBar textTitleBar = (TextTitleBar) mo95291b(R.id.eiz);
                if (!(textTitleBar == null || (endText4 = textTitleBar.getEndText()) == null)) {
                    Context context = getContext();
                    if (context == null) {
                        C89219l.m154715b();
                    }
                    endText4.setTextColor(C0643b.m2378c(context, R.color.y));
                }
                TextTitleBar textTitleBar2 = (TextTitleBar) mo95291b(R.id.eiz);
                if (!(textTitleBar2 == null || (endText3 = textTitleBar2.getEndText()) == null)) {
                    endText3.setEnabled(false);
                }
            } else {
                TextTitleBar textTitleBar3 = (TextTitleBar) mo95291b(R.id.eiz);
                if (!(textTitleBar3 == null || (endText2 = textTitleBar3.getEndText()) == null)) {
                    Context context2 = getContext();
                    if (context2 == null) {
                        C89219l.m154715b();
                    }
                    endText2.setTextColor(C0643b.m2378c(context2, R.color.bh));
                }
                TextTitleBar textTitleBar4 = (TextTitleBar) mo95291b(R.id.eiz);
                if (!(textTitleBar4 == null || (endText = textTitleBar4.getEndText()) == null)) {
                    endText.setEnabled(true);
                }
            }
            AppLanguageViewModel appLanguageViewModel = this.f132092b;
            if (appLanguageViewModel != null) {
                int i2 = this.f132091a;
                C1213t<ArrayList<C57951b>> tVar = appLanguageViewModel.f132135a;
                if (tVar == null) {
                    C89219l.m154715b();
                }
                if (!C13603b.m24435a((Collection) tVar.getValue())) {
                    if (i2 >= 0) {
                        ArrayList<C57951b> value = tVar.getValue();
                        if (value == null) {
                            C89219l.m154715b();
                        }
                        value.get(i2).f132115b = false;
                    }
                    ArrayList<C57951b> value2 = tVar.getValue();
                    if (value2 == null) {
                        C89219l.m154715b();
                    }
                    value2.get(i).f132115b = true;
                    appLanguageViewModel.f132136b = i;
                }
            }
            this.f132091a = i;
            C57943a aVar = this.f132093c;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            AppLanguageViewModel appLanguageViewModel = (AppLanguageViewModel) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(AppLanguageViewModel.class);
            this.f132092b = appLanguageViewModel;
            if (appLanguageViewModel != null) {
                if (appLanguageViewModel.f132135a == null) {
                    appLanguageViewModel.f132135a = new C1213t<>();
                }
                C1213t<ArrayList<C57951b>> tVar = appLanguageViewModel.f132135a;
                if (tVar == null) {
                    C89219l.m154715b();
                } else {
                    tVar.observe(this, this);
                }
            }
            AppLanguageViewModel appLanguageViewModel2 = this.f132092b;
            if (appLanguageViewModel2 == null) {
                C89219l.m154715b();
            }
            getContext();
            int i = -1;
            AbstractC58069b a = C57953a.C57955b.f132121a.mo95295a();
            if (a == null) {
                C89219l.m154715b();
            }
            String e = a.mo90021e();
            C89219l.m154716b(e, "");
            ArrayList<C57951b> arrayList = new ArrayList<>();
            for (AbstractC58069b bVar : C57953a.C57955b.f132121a.f132119a.values()) {
                if (TextUtils.equals(bVar.mo90021e(), e)) {
                    arrayList.add(new C57951b(bVar, true));
                    i = arrayList.size() - 1;
                } else {
                    arrayList.add(new C57951b(bVar, false));
                }
            }
            C1213t<ArrayList<C57951b>> tVar2 = appLanguageViewModel2.f132135a;
            if (tVar2 != null) {
                tVar2.postValue(arrayList);
            }
            this.f132094d = i;
            this.f132091a = i;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        DmtTextView endText;
        DmtTextView endText2;
        DmtTextView titleView;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo95291b(R.id.c_b);
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        }
        C34692l a = C34692l.m70857a(getContext());
        C89219l.m154716b(a, "");
        RecyclerView recyclerView2 = (RecyclerView) mo95291b(R.id.c_b);
        if (recyclerView2 != null) {
            recyclerView2.mo4402a(a);
        }
        AbstractC17250a aVar = (AbstractC17250a) mo95291b(R.id.eiz);
        if (!(aVar == null || (titleView = aVar.getTitleView()) == null)) {
            Context context = getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            titleView.setTextColor(C0643b.m2378c(context, R.color.np));
        }
        AbstractC17250a aVar2 = (AbstractC17250a) mo95291b(R.id.eiz);
        if (aVar2 != null) {
            aVar2.setTitle(getText(R.string.u5));
        }
        TextTitleBar textTitleBar = (TextTitleBar) mo95291b(R.id.eiz);
        if (!(textTitleBar == null || (endText2 = textTitleBar.getEndText()) == null)) {
            endText2.setEnabled(false);
        }
        TextTitleBar textTitleBar2 = (TextTitleBar) mo95291b(R.id.eiz);
        if (!(textTitleBar2 == null || (endText = textTitleBar2.getEndText()) == null)) {
            Context context2 = getContext();
            if (context2 == null) {
                C89219l.m154715b();
            }
            endText.setTextColor(C0643b.m2378c(context2, R.color.y));
        }
        TextTitleBar textTitleBar3 = (TextTitleBar) mo95291b(R.id.eiz);
        if (textTitleBar3 != null) {
            textTitleBar3.setOnTitleBarClickListener(new C57942a(this));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.adp, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }
}
