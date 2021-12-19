package com.p2082ss.android.ugc.aweme;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.api.model.AnchorCell;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.discover.adapter.C41731m;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2957n.C49763p;
import com.p2082ss.android.ugc.aweme.p2362b.AbstractC34403c;
import com.p2082ss.android.ugc.aweme.p3629q.AbstractC65727a;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3631a.C65737c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.ag */
public final class C33431ag extends C31294aa implements AbstractC39102c<AnchorCell>, AbstractC49762o {

    /* renamed from: f */
    public static final C33432a f79467f = new C33432a((byte) 0);

    /* renamed from: d */
    C33433b f79468d;

    /* renamed from: e */
    public C89399f f79469e;

    /* renamed from: g */
    private C39101b<C33444ah> f79470g;

    /* renamed from: h */
    private C33444ah f79471h;

    /* renamed from: i */
    private C89399f f79472i;

    /* renamed from: j */
    private C41731m<RecyclerView.ViewHolder> f79473j;

    /* renamed from: k */
    private SparseArray f79474k;

    static {
        Covode.recordClassIndex(40288);
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final View mo57294a(int i) {
        if (this.f79474k == null) {
            this.f79474k = new SparseArray();
        }
        View view = (View) this.f79474k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f79474k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.C31294aa
    /* renamed from: a */
    public final void mo57295a() {
        SparseArray sparseArray = this.f79474k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<AnchorCell> list, boolean z) {
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.C31294aa
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo57295a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$a */
    public static final class C33432a {
        static {
            Covode.recordClassIndex(40289);
        }

        private C33432a() {
        }

        public /* synthetic */ C33432a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar != null) {
            mVar.mo70917a(1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar == null || mVar.f97353a != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        C39101b<C33444ah> bVar = this.f79470g;
        if (bVar != null) {
            bVar.ck_();
            bVar.mo67840h();
        }
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$b */
    public final class C33433b {

        /* renamed from: a */
        final Keva f79475a;

        /* renamed from: b */
        public final String f79476b;

        /* renamed from: c */
        final /* synthetic */ C33431ag f79477c;

        static {
            Covode.recordClassIndex(40290);
        }

        /* renamed from: a */
        public final String[] mo59526a() {
            String[] stringArray = this.f79475a.getStringArray(this.f79476b, new String[0]);
            C89219l.m154716b(stringArray, "");
            return stringArray;
        }

        public C33433b(C33431ag agVar, String str) {
            C89219l.m154721d(str, "");
            this.f79477c = agVar;
            this.f79476b = str;
            this.f79475a = Keva.getRepo(str);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfr);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        EditText editText = (EditText) mo57294a(R.id.drj);
        C89219l.m154716b(editText, "");
        String obj = editText.getText().toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = C89361p.m154910b((CharSequence) obj).toString();
        C39101b<C33444ah> bVar = this.f79470g;
        if (bVar != null) {
            bVar.mo57616a(4, obj2);
        }
    }

    /* renamed from: c */
    public final void mo59521c() {
        String[] a;
        C33433b bVar = this.f79468d;
        if (bVar != null && (a = bVar.mo59526a()) != null) {
            List<?> j = C89064i.m154509j(a);
            C89399f fVar = this.f79469e;
            if (fVar == null) {
                C89219l.m154710a("mHistoryAdapter");
            } else {
                fVar.mo17153a(j);
            }
            C89399f fVar2 = this.f79469e;
            if (fVar2 == null) {
                C89219l.m154710a("mHistoryAdapter");
            } else {
                fVar2.notifyDataSetChanged();
            }
            if (j.size() > 2) {
                TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.a6b);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.f8i);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(0);
        TuxTextView tuxTextView2 = (TuxTextView) mo57294a(R.id.f8h);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfr);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgt);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(8);
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar != null) {
            mVar.mo70917a(0);
        }
    }

    /* renamed from: d */
    public final void mo59524d() {
        C39101b<C33444ah> bVar = this.f79470g;
        if (bVar != null) {
            EditText editText = (EditText) mo57294a(R.id.drj);
            C89219l.m154716b(editText, "");
            String obj = editText.getText().toString();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj2 = C89361p.m154910b((CharSequence) obj).toString();
            if (!TextUtils.isEmpty(obj2)) {
                bVar.mo57616a(1, obj2);
                RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgs);
                C89219l.m154716b(recyclerView, "");
                recyclerView.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.a6b);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                C38754l.m78612b(getContext(), mo57294a(R.id.drj));
                C33433b bVar2 = this.f79468d;
                if (bVar2 != null) {
                    C89219l.m154721d(obj2, "");
                    String[] strArr = {obj2};
                    String[] stringArray = bVar2.f79475a.getStringArray(bVar2.f79476b, new String[0]);
                    C89219l.m154716b(stringArray, "");
                    C89219l.m154721d(strArr, "");
                    C89219l.m154721d(stringArray, "");
                    int length = stringArray.length;
                    Object[] copyOf = Arrays.copyOf(strArr, length + 1);
                    System.arraycopy(stringArray, 0, copyOf, 1, length);
                    C89219l.m154716b(copyOf, "");
                    Object[] array = C89070n.m154571d((Iterable) C89064i.m154511l(copyOf), 10).toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    bVar2.f79475a.storeStringArray(bVar2.f79476b, (String[]) array);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$f */
    public static final class C33437f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C33431ag f79483a;

        static {
            Covode.recordClassIndex(40294);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33437f(C33431ag agVar) {
            this.f79483a = agVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3 && i != 4 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            this.f79483a.mo59524d();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$g */
    public static final class C33438g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C33431ag f79484a;

        static {
            Covode.recordClassIndex(40295);
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33438g(C33431ag agVar) {
            this.f79484a = agVar;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C89219l.m154721d(editable, "");
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ImageView imageView = (ImageView) this.f79484a.mo57294a(R.id.dri);
                C89219l.m154716b(imageView, "");
                imageView.setVisibility(4);
                return;
            }
            ImageView imageView2 = (ImageView) this.f79484a.mo57294a(R.id.dri);
            C89219l.m154716b(imageView2, "");
            imageView2.setVisibility(0);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C89219l.m154721d(charSequence, "");
            RecyclerView recyclerView = (RecyclerView) this.f79484a.mo57294a(R.id.dgs);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setVisibility(0);
            C33431ag agVar = this.f79484a;
            TuxTextView tuxTextView = (TuxTextView) agVar.mo57294a(R.id.f8i);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) agVar.mo57294a(R.id.f8h);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            RecyclerView recyclerView2 = (RecyclerView) agVar.mo57294a(R.id.dgt);
            C89219l.m154716b(recyclerView2, "");
            recyclerView2.setVisibility(8);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) agVar.mo57294a(R.id.cfr);
            C89219l.m154716b(dmtLoadingLayout, "");
            dmtLoadingLayout.setVisibility(8);
            this.f79484a.mo59521c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$e */
    static final class View$OnClickListenerC33436e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33431ag f79482a;

        static {
            Covode.recordClassIndex(40293);
        }

        View$OnClickListenerC33436e(C33431ag agVar) {
            this.f79482a = agVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f79482a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C89399f m68537a(C33431ag agVar) {
        C89399f fVar = agVar.f79469e;
        if (fVar == null) {
            C89219l.m154710a("mHistoryAdapter");
        }
        return fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar != null) {
            mVar.mo70917a(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar != null) {
            mVar.mo70917a(2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$h */
    static final class View$OnClickListenerC33439h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33431ag f79485a;

        static {
            Covode.recordClassIndex(40296);
        }

        View$OnClickListenerC33439h(C33431ag agVar) {
            this.f79485a = agVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((EditText) this.f79485a.mo57294a(R.id.drj)).setText("");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar != null) {
            mVar.mo70917a(z ? 1 : 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            EditText editText = (EditText) mo57294a(R.id.drj);
            C89219l.m154716b(editText, "");
            editText.getText().clear();
            C38754l.m78612b(getContext(), mo57294a(R.id.drj));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$d */
    public static final class C33435d implements C65737c.AbstractC65738a {

        /* renamed from: a */
        final /* synthetic */ C89399f f79480a;

        /* renamed from: b */
        final /* synthetic */ C33431ag f79481b;

        static {
            Covode.recordClassIndex(40292);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3631a.C65737c.AbstractC65738a
        /* renamed from: a */
        public final void mo59528a(String str) {
            List<?> list;
            C89219l.m154721d(str, "");
            C89399f fVar = this.f79480a;
            C33431ag agVar = this.f79481b;
            C33433b bVar = agVar.f79468d;
            if (bVar != null) {
                C89219l.m154721d(str, "");
                String[] stringArray = bVar.f79475a.getStringArray(bVar.f79476b, new String[0]);
                C89219l.m154716b(stringArray, "");
                ArrayList arrayList = new ArrayList();
                for (String str2 : stringArray) {
                    if (!TextUtils.equals(str2, str)) {
                        arrayList.add(str2);
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                bVar.f79475a.storeStringArray(bVar.f79476b, strArr);
                if (strArr != null) {
                    if (strArr.length <= 2) {
                        TuxTextView tuxTextView = (TuxTextView) agVar.mo57294a(R.id.a6b);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setVisibility(8);
                    }
                    list = C89064i.m154509j(strArr);
                    fVar.mo17153a(list);
                    this.f79480a.notifyDataSetChanged();
                }
            }
            list = new ArrayList<>();
            fVar.mo17153a(list);
            this.f79480a.notifyDataSetChanged();
        }

        C33435d(C89399f fVar, C33431ag agVar) {
            this.f79480a = fVar;
            this.f79481b = agVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$i */
    static final class View$OnClickListenerC33440i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C33431ag f79486a;

        static {
            Covode.recordClassIndex(40297);
        }

        View$OnClickListenerC33440i(C33431ag agVar) {
            this.f79486a = agVar;
        }

        public final void onClick(View view) {
            List<?> list;
            ClickAgent.onClick(view);
            C33431ag agVar = this.f79486a;
            C33433b bVar = agVar.f79468d;
            if (bVar != null) {
                bVar.f79475a.erase(bVar.f79476b);
            }
            TuxTextView tuxTextView = (TuxTextView) agVar.mo57294a(R.id.a6b);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(0);
            C89399f a = C33431ag.m68537a(this.f79486a);
            if (!(a == null || (list = a.f203060b) == null)) {
                list.clear();
            }
            C89399f a2 = C33431ag.m68537a(this.f79486a);
            if (a2 != null) {
                a2.notifyDataSetChanged();
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.f79486a.mo57294a(R.id.a6b);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.C31294aa
    public final void onActivityCreated(Bundle bundle) {
        C89399f fVar;
        super.onActivityCreated(bundle);
        C89399f fVar2 = new C89399f();
        ActivityC0945e activity = getActivity();
        Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.IFragmentNavigation");
        C65737c cVar = new C65737c((AbstractC34884bl) activity);
        cVar.f148116a = new C33434c(fVar2, this);
        cVar.f148125d = new C33435d(fVar2, this);
        fVar2.mo143771a(String.class, cVar);
        this.f79469e = fVar2;
        AbstractC34403c adapterFactory = C31294aa.f75003b.adapterFactory((AbstractC34884bl) getActivity());
        String str = null;
        if (adapterFactory != null) {
            fVar = new C89399f();
            adapterFactory.mo60824a(fVar, adapterFactory.f81321a, "search_result");
        } else {
            fVar = null;
        }
        this.f79472i = fVar;
        this.f79470g = new C39101b<>();
        this.f79468d = new C33433b(this, "anchor_search_history" + C31294aa.f75003b.name());
        this.f79471h = new C33444ah(C31294aa.f75003b.getTYPE());
        C39101b<C33444ah> bVar = this.f79470g;
        if (bVar != null) {
            bVar.mo67839a_(this);
        }
        C39101b<C33444ah> bVar2 = this.f79470g;
        if (bVar2 != null) {
            bVar2.mo67838a((AbstractC39085b) this.f79471h);
        }
        ((TuxTextView) mo57294a(R.id.a17)).setOnClickListener(new View$OnClickListenerC33436e(this));
        EditText editText = (EditText) mo57294a(R.id.drj);
        C89219l.m154716b(editText, "");
        Context context = getContext();
        if (context != null) {
            C31294aa.f75003b.anchorInfo();
            str = context.getString(R.string.amw);
        }
        editText.setHint(str);
        EditText editText2 = (EditText) mo57294a(R.id.drj);
        C89219l.m154716b(editText2, "");
        editText2.setImeOptions(3);
        EditText editText3 = (EditText) mo57294a(R.id.drj);
        C89219l.m154716b(editText3, "");
        editText3.setInputType(1);
        ((EditText) mo57294a(R.id.drj)).setOnEditorActionListener(new C33437f(this));
        ((EditText) mo57294a(R.id.drj)).addTextChangedListener(new C33438g(this));
        EditText editText4 = (EditText) mo57294a(R.id.drj);
        C89219l.m154716b(editText4, "");
        editText4.setFocusable(true);
        EditText editText5 = (EditText) mo57294a(R.id.drj);
        C89219l.m154716b(editText5, "");
        editText5.setFocusableInTouchMode(true);
        ((EditText) mo57294a(R.id.drj)).requestFocus();
        C38754l.m78609a(getContext(), mo57294a(R.id.drj));
        ((ImageView) mo57294a(R.id.dri)).setOnClickListener(new View$OnClickListenerC33439h(this));
        ((TuxTextView) mo57294a(R.id.a6b)).setOnClickListener(new View$OnClickListenerC33440i(this));
        this.f79473j = C41731m.m83697a(this.f79472i);
        RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgt);
        C89219l.m154716b(recyclerView, "");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) mo57294a(R.id.dgt);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f79473j);
        RecyclerView recyclerView3 = (RecyclerView) mo57294a(R.id.dgt);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setOnFlingListener(new C49763p((RecyclerView) mo57294a(R.id.dgt), this));
        RecyclerView recyclerView4 = (RecyclerView) mo57294a(R.id.dgs);
        C89219l.m154716b(recyclerView4, "");
        getContext();
        recyclerView4.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView5 = (RecyclerView) mo57294a(R.id.dgs);
        C89219l.m154716b(recyclerView5, "");
        C89399f fVar3 = this.f79469e;
        if (fVar3 == null) {
            C89219l.m154710a("mHistoryAdapter");
        }
        recyclerView5.setAdapter(fVar3);
        mo59521c();
    }

    /* renamed from: com.ss.android.ugc.aweme.ag$c */
    public static final class C33434c implements AbstractC65727a<String> {

        /* renamed from: a */
        final /* synthetic */ C89399f f79478a;

        /* renamed from: b */
        final /* synthetic */ C33431ag f79479b;

        static {
            Covode.recordClassIndex(40291);
        }

        C33434c(C89399f fVar, C33431ag agVar) {
            this.f79478a = fVar;
            this.f79479b = agVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.view.View, java.lang.Object] */
        @Override // com.p2082ss.android.ugc.aweme.p3629q.AbstractC65727a
        /* renamed from: a */
        public final /* synthetic */ void mo59527a(View view, String str) {
            String str2 = str;
            C89219l.m154721d(view, "");
            C89219l.m154721d(str2, "");
            C33431ag agVar = this.f79479b;
            ((EditText) agVar.mo57294a(R.id.drj)).setText(str2);
            ((EditText) agVar.mo57294a(R.id.drj)).setSelection(str2.length());
            agVar.mo59524d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<AnchorCell> list, boolean z) {
        C89399f fVar;
        if (!(list == null || list.isEmpty() || (fVar = this.f79472i) == null)) {
            fVar.mo17153a(list);
        }
        C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
        if (mVar != null) {
            mVar.mo70917a(z ? 1 : 0);
        }
        C89399f fVar2 = this.f79472i;
        if (fVar2 != null) {
            fVar2.notifyDataSetChanged();
        }
        C31294aa.f75003b.anchorMob();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<AnchorCell> list, boolean z) {
        TuxTextView tuxTextView = (TuxTextView) mo57294a(R.id.f8i);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(8);
        TuxTextView tuxTextView2 = (TuxTextView) mo57294a(R.id.f8h);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(8);
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo57294a(R.id.cfr);
        C89219l.m154716b(dmtLoadingLayout, "");
        dmtLoadingLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) mo57294a(R.id.dgt);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setVisibility(0);
        if (list != null && !list.isEmpty()) {
            C89399f fVar = this.f79472i;
            if (fVar != null) {
                fVar.mo17153a(list);
            }
            C41731m<RecyclerView.ViewHolder> mVar = this.f79473j;
            if (mVar != null) {
                mVar.mo70917a(z ? 1 : 0);
            }
            C89399f fVar2 = this.f79472i;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
            C31294aa.f75003b.anchorMob();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aw, viewGroup, false);
    }
}
