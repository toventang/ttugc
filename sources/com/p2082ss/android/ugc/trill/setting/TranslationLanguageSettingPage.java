package com.p2082ss.android.ugc.trill.setting;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.C34692l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.i18n.language.C53451b;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53452a;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.language.p4381a.C85091a;
import com.p2082ss.android.ugc.trill.setting.TranslationLanguageViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage */
public final class TranslationLanguageSettingPage extends AbstractC68195a implements AbstractC1214u<ArrayList<C53451b>>, C85091a.AbstractC85093a {

    /* renamed from: e */
    public TextTitleBar f190434e;

    /* renamed from: f */
    public RecyclerView f190435f;

    /* renamed from: g */
    public TranslationLanguageViewModel f190436g;

    /* renamed from: h */
    public ArrayList<C68343a> f190437h;

    /* renamed from: i */
    public String f190438i;

    /* renamed from: j */
    public C85091a f190439j;

    /* renamed from: k */
    public int f190440k = -1;

    /* renamed from: l */
    public int f190441l = -1;

    /* renamed from: m */
    public String f190442m;

    /* renamed from: n */
    private SparseArray f190443n;

    static {
        Covode.recordClassIndex(99148);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f190443n == null) {
            this.f190443n = new SparseArray();
        }
        View view = (View) this.f190443n.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190443n.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f190443n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ayc;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: d */
    public final TextTitleBar mo130057d() {
        TextTitleBar textTitleBar = this.f190434e;
        if (textTitleBar == null) {
            C89219l.m154710a("mBtnFinish");
        }
        return textTitleBar;
    }

    /* renamed from: com.ss.android.ugc.trill.setting.TranslationLanguageSettingPage$a */
    public static final class C85112a implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ TranslationLanguageSettingPage f190444a;

        static {
            Covode.recordClassIndex(99149);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C85112a(TranslationLanguageSettingPage translationLanguageSettingPage) {
            this.f190444a = translationLanguageSettingPage;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            C89219l.m154721d(view, "");
            this.f190444a.mo108725h();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C68343a aVar;
            C89219l.m154721d(view, "");
            if (this.f190444a.mo130057d().getEndText() != null) {
                DmtTextView endText = this.f190444a.mo130057d().getEndText();
                C89219l.m154716b(endText, "");
                if (endText.getCurrentTextColor() != C0643b.m2378c(this.f190444a.mo130057d().getContext(), R.color.y)) {
                    Intent intent = new Intent();
                    ArrayList<C68343a> arrayList = this.f190444a.f190437h;
                    if (!(arrayList == null || (aVar = arrayList.get(this.f190444a.f190441l)) == null)) {
                        TranslationLanguageViewModel translationLanguageViewModel = this.f190444a.f190436g;
                        if (translationLanguageViewModel != null) {
                            C89219l.m154716b(aVar, "");
                            String languageCode = aVar.getLanguageCode();
                            C89219l.m154716b(languageCode, "");
                            C89219l.m154721d(languageCode, "");
                            translationLanguageViewModel.f190448c.setTranslationLanguage("selected_translation_language", languageCode).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(TranslationLanguageViewModel.C85114b.f190449a, TranslationLanguageViewModel.C85115c.f190450a);
                        }
                        C89219l.m154716b(aVar, "");
                        intent.putExtra("updated_language_name", aVar.getLocalName());
                        intent.putExtra("updated_language_code", aVar.getLanguageCode());
                        C39162r.m79460a("save_transl_lang", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", "translate_subtitle").mo59983a("lang", aVar.getLanguageCode()).f79943a);
                    }
                    ActivityC0945e activity = this.f190444a.getActivity();
                    if (activity != null) {
                        activity.setResult(-1, intent);
                    }
                    this.f190444a.mo108725h();
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(ArrayList<C53451b> arrayList) {
        ArrayList<C53451b> arrayList2 = arrayList;
        if (!C13603b.m24435a((Collection) arrayList2)) {
            C85091a aVar = this.f190439j;
            if (aVar == null) {
                C85091a aVar2 = new C85091a(getContext(), this);
                this.f190439j = aVar2;
                aVar2.f190372a = arrayList2;
                RecyclerView recyclerView = this.f190435f;
                if (recyclerView == null) {
                    C89219l.m154710a("mTranslationListLanguageView");
                }
                recyclerView.setAdapter(this.f190439j);
                return;
            }
            aVar.f190372a = arrayList2;
            C85091a aVar3 = this.f190439j;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            aVar3.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.language.p4381a.C85091a.AbstractC85093a
    /* renamed from: b */
    public final void mo130032b(int i) {
        if (i != this.f190441l) {
            if (i == this.f190440k) {
                TextTitleBar textTitleBar = this.f190434e;
                if (textTitleBar == null) {
                    C89219l.m154710a("mBtnFinish");
                }
                DmtTextView endText = textTitleBar.getEndText();
                TextTitleBar textTitleBar2 = this.f190434e;
                if (textTitleBar2 == null) {
                    C89219l.m154710a("mBtnFinish");
                }
                endText.setTextColor(C0643b.m2378c(textTitleBar2.getContext(), R.color.y));
                TextTitleBar textTitleBar3 = this.f190434e;
                if (textTitleBar3 == null) {
                    C89219l.m154710a("mBtnFinish");
                }
                DmtTextView endText2 = textTitleBar3.getEndText();
                C89219l.m154716b(endText2, "");
                endText2.setEnabled(false);
            } else {
                TextTitleBar textTitleBar4 = this.f190434e;
                if (textTitleBar4 == null) {
                    C89219l.m154710a("mBtnFinish");
                }
                DmtTextView endText3 = textTitleBar4.getEndText();
                TextTitleBar textTitleBar5 = this.f190434e;
                if (textTitleBar5 == null) {
                    C89219l.m154710a("mBtnFinish");
                }
                endText3.setTextColor(C0643b.m2378c(textTitleBar5.getContext(), R.color.bh));
                TextTitleBar textTitleBar6 = this.f190434e;
                if (textTitleBar6 == null) {
                    C89219l.m154710a("mBtnFinish");
                }
                DmtTextView endText4 = textTitleBar6.getEndText();
                C89219l.m154716b(endText4, "");
                endText4.setEnabled(true);
            }
            TranslationLanguageViewModel translationLanguageViewModel = this.f190436g;
            if (translationLanguageViewModel != null) {
                int i2 = this.f190441l;
                C1213t<ArrayList<C53451b>> tVar = translationLanguageViewModel.f190446a;
                if (tVar != null && !C13603b.m24435a((Collection) tVar.getValue())) {
                    if (i2 >= 0) {
                        ArrayList<C53451b> value = tVar.getValue();
                        if (value == null) {
                            C89219l.m154715b();
                        }
                        C53451b bVar = value.get(i2);
                        C89219l.m154716b(bVar, "");
                        bVar.f122675a = false;
                    }
                    ArrayList<C53451b> value2 = tVar.getValue();
                    if (value2 == null) {
                        C89219l.m154715b();
                    }
                    C53451b bVar2 = value2.get(i);
                    C89219l.m154716b(bVar2, "");
                    bVar2.f122675a = true;
                    translationLanguageViewModel.f190447b = i;
                }
            }
            this.f190441l = i;
            C85091a aVar = this.f190439j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    private static String m146370a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.eiz);
        C89219l.m154716b(findViewById, "");
        this.f190434e = (TextTitleBar) findViewById;
        View findViewById2 = view.findViewById(R.id.c_b);
        C89219l.m154716b(findViewById2, "");
        this.f190435f = (RecyclerView) findViewById2;
        super.onViewCreated(view, bundle);
        ArrayList<C68343a> arrayList = null;
        TranslationLanguageViewModel translationLanguageViewModel = (TranslationLanguageViewModel) C1181ae.m3879a(this, (C1175ad.AbstractC1177b) null).mo3983a(TranslationLanguageViewModel.class);
        this.f190436g = translationLanguageViewModel;
        if (translationLanguageViewModel != null) {
            if (translationLanguageViewModel.f190446a == null) {
                translationLanguageViewModel.f190446a = new C1213t<>();
            }
            C1213t<ArrayList<C53451b>> tVar = translationLanguageViewModel.f190446a;
            if (tVar == null) {
                C89219l.m154715b();
            } else {
                tVar.observe(this, this);
            }
        }
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Serializable serializableExtra = intent.getSerializableExtra("translation_language");
                if (serializableExtra instanceof ArrayList) {
                    arrayList = serializableExtra;
                }
                this.f190437h = arrayList;
                this.f190438i = m146370a(intent, "selected_translation_language_code");
                this.f190442m = m146370a(intent, "enter_method");
            }
        }
        ArrayList<C68343a> arrayList2 = this.f190437h;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            mo108725h();
        }
        TranslationLanguageViewModel translationLanguageViewModel2 = this.f190436g;
        int i = -1;
        if (translationLanguageViewModel2 != null) {
            ArrayList<C68343a> arrayList3 = this.f190437h;
            String str = this.f190438i;
            ArrayList<C53451b> arrayList4 = new ArrayList<>();
            if (arrayList3 != null) {
                int i2 = 0;
                i = -1;
                for (T t : arrayList3) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (C89361p.m154872a(str, t2.getLanguageCode(), false)) {
                        arrayList4.add(new C53451b(new C53452a("", t2.getEnglishName(), t2.getLanguageCode(), t2.getLocalName()), true));
                        i = i2;
                    } else {
                        arrayList4.add(new C53451b(new C53452a("", t2.getEnglishName(), t2.getLanguageCode(), t2.getLocalName()), false));
                    }
                    i2 = i3;
                }
            }
            C1213t<ArrayList<C53451b>> tVar2 = translationLanguageViewModel2.f190446a;
            if (tVar2 != null) {
                tVar2.postValue(arrayList4);
            }
        }
        this.f190440k = i;
        this.f190441l = i;
        RecyclerView recyclerView = this.f190435f;
        if (recyclerView == null) {
            C89219l.m154710a("mTranslationListLanguageView");
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        C34692l a = C34692l.m70857a(getContext());
        C89219l.m154716b(a, "");
        RecyclerView recyclerView2 = this.f190435f;
        if (recyclerView2 == null) {
            C89219l.m154710a("mTranslationListLanguageView");
        }
        recyclerView2.mo4415b(a);
        TextTitleBar textTitleBar = this.f190434e;
        if (textTitleBar == null) {
            C89219l.m154710a("mBtnFinish");
        }
        DmtTextView titleView = textTitleBar.getTitleView();
        TextTitleBar textTitleBar2 = this.f190434e;
        if (textTitleBar2 == null) {
            C89219l.m154710a("mBtnFinish");
        }
        titleView.setTextColor(C0643b.m2378c(textTitleBar2.getContext(), R.color.np));
        TextTitleBar textTitleBar3 = this.f190434e;
        if (textTitleBar3 == null) {
            C89219l.m154710a("mBtnFinish");
        }
        textTitleBar3.setTitle("Translation Language");
        TextTitleBar textTitleBar4 = this.f190434e;
        if (textTitleBar4 == null) {
            C89219l.m154710a("mBtnFinish");
        }
        DmtTextView endText = textTitleBar4.getEndText();
        C89219l.m154716b(endText, "");
        endText.setEnabled(false);
        TextTitleBar textTitleBar5 = this.f190434e;
        if (textTitleBar5 == null) {
            C89219l.m154710a("mBtnFinish");
        }
        DmtTextView endText2 = textTitleBar5.getEndText();
        TextTitleBar textTitleBar6 = this.f190434e;
        if (textTitleBar6 == null) {
            C89219l.m154710a("mBtnFinish");
        }
        endText2.setTextColor(C0643b.m2378c(textTitleBar6.getContext(), R.color.y));
        TextTitleBar textTitleBar7 = this.f190434e;
        if (textTitleBar7 == null) {
            C89219l.m154710a("mBtnFinish");
        }
        textTitleBar7.setOnTitleBarClickListener(new C85112a(this));
    }
}
