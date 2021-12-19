package com.p2082ss.android.ugc.trill.setting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.C85146j;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.trill.setting.TranslationVoiceSettingPage */
public final class TranslationVoiceSettingPage extends AbstractC68195a implements C85146j.AbstractC85147a {

    /* renamed from: e */
    public TextTitleBar f190451e;

    /* renamed from: f */
    public RecyclerView f190452f;

    /* renamed from: g */
    public C85146j f190453g;

    /* renamed from: h */
    public int f190454h = -1;

    /* renamed from: i */
    public String f190455i = "";

    /* renamed from: j */
    public final List<Integer> f190456j = C89070n.m154522b(Integer.valueOf((int) R.string.h8i), Integer.valueOf((int) R.string.h8j));

    /* renamed from: k */
    private SparseArray f190457k;

    static {
        Covode.recordClassIndex(99154);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f190457k == null) {
            this.f190457k = new SparseArray();
        }
        View view = (View) this.f190457k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190457k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f190457k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.ayd;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: d */
    private final List<C85146j.C85149c> m146378d() {
        String str;
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : this.f190456j) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            int intValue = t.intValue();
            Context context = getContext();
            if (context == null || (str = context.getString(intValue)) == null) {
                str = "";
            }
            C89219l.m154716b(str, "");
            if (i == this.f190454h) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(new C85146j.C85149c(str, z));
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.trill.setting.TranslationVoiceSettingPage$a */
    public static final class C85116a implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ TranslationVoiceSettingPage f190458a;

        static {
            Covode.recordClassIndex(99155);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C85116a(TranslationVoiceSettingPage translationVoiceSettingPage) {
            this.f190458a = translationVoiceSettingPage;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            int i;
            C89219l.m154721d(view, "");
            this.f190458a.mo108725h();
            String f = TranslatedCaptionCacheServiceImpl.m146355j().mo108896f();
            int hashCode = f.hashCode();
            if (hashCode != 50) {
                if (hashCode == 51 && f.equals("3")) {
                    i = 3;
                    C39162r.m79460a("save_transl_voice", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", this.f190458a.f190455i).mo59980a("voice", i).f79943a);
                }
            } else if (f.equals("2")) {
                i = 2;
                C39162r.m79460a("save_transl_voice", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", this.f190458a.f190455i).mo59980a("voice", i).f79943a);
            }
            i = 0;
            C39162r.m79460a("save_transl_voice", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", this.f190458a.f190455i).mo59980a("voice", i).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.trill.setting.C85146j.AbstractC85147a
    /* renamed from: b */
    public final void mo130058b(int i) {
        if (i != this.f190454h) {
            this.f190454h = i;
            C85146j jVar = this.f190453g;
            if (jVar != null) {
                jVar.mo130074a(m146378d());
            }
            C85146j jVar2 = this.f190453g;
            if (jVar2 != null) {
                jVar2.notifyDataSetChanged();
            }
            if (i == 0) {
                C85145i.m146398a("2");
            } else if (i == 1) {
                C85145i.m146398a("3");
            }
        }
    }

    /* renamed from: a */
    private static String m146377a(Intent intent, String str) {
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
        this.f190451e = (TextTitleBar) findViewById;
        View findViewById2 = view.findViewById(R.id.c_g);
        C89219l.m154716b(findViewById2, "");
        this.f190452f = (RecyclerView) findViewById2;
        super.onViewCreated(view, bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            C89219l.m154716b(activity, "");
            Intent intent = activity.getIntent();
            if (intent != null) {
                this.f190455i = m146377a(intent, "enter_method");
            }
        }
        TextTitleBar textTitleBar = this.f190451e;
        if (textTitleBar == null) {
            C89219l.m154710a("mBtnFinish");
        }
        textTitleBar.setOnTitleBarClickListener(new C85116a(this));
        this.f190454h = TextUtils.equals(C85145i.m146401c(), "3") ? 1 : 0;
        RecyclerView recyclerView = this.f190452f;
        if (recyclerView == null) {
            C89219l.m154710a("mTranslationVoiceView");
        }
        getContext();
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        C85146j jVar = new C85146j(getContext(), this);
        this.f190453g = jVar;
        jVar.mo130074a(m146378d());
        RecyclerView recyclerView2 = this.f190452f;
        if (recyclerView2 == null) {
            C89219l.m154710a("mTranslationVoiceView");
        }
        recyclerView2.setAdapter(this.f190453g);
    }
}
