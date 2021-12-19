package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p1777x.p1780c.C23697c;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.api.C39377a;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2647a.C39373a;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d;
import com.p2082ss.android.ugc.aweme.compliance.common.p2663d.C39618a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47809e;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.services.C68432f;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a */
public final class C39386a extends FrameLayout implements AbstractC1214u<C33942b>, AbstractC68351c {

    /* renamed from: d */
    public static final C39387a f92969d = new C39387a((byte) 0);

    /* renamed from: a */
    public final C47809e f92970a = C47809e.C47810a.f110762a;

    /* renamed from: b */
    public final String f92971b;

    /* renamed from: c */
    public boolean f92972c;

    /* renamed from: e */
    private int f92973e;

    /* renamed from: f */
    private boolean f92974f;

    /* renamed from: g */
    private int f92975g;

    /* renamed from: h */
    private boolean f92976h;

    /* renamed from: i */
    private boolean f92977i;

    /* renamed from: j */
    private final AbstractC89244h f92978j = C89250i.m154773a((AbstractC89171a) new C39398j(this));

    /* renamed from: k */
    private final AbstractC89244h f92979k = C89250i.m154773a((AbstractC89171a) new C39399k(this));

    /* renamed from: l */
    private final AbstractC89244h f92980l = C89250i.m154773a((AbstractC89171a) C39400l.f92999a);

    /* renamed from: m */
    private final AbstractC89244h f92981m = C89250i.m154773a((AbstractC89171a) new C39397i(this));

    /* renamed from: n */
    private SparseArray f92982n;

    static {
        Covode.recordClassIndex(47073);
    }

    private final int getLayout() {
        return R.layout.ty;
    }

    private final C39088c<AbstractC39085b<C68348f>, AbstractC68351c> getMPushSettingPresenter() {
        return (C39088c) this.f92979k.getValue();
    }

    /* renamed from: a */
    public final View mo68829a(int i) {
        if (this.f92982n == null) {
            this.f92982n = new SparseArray();
        }
        View view = (View) this.f92982n.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92982n.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
    }

    public final DataCenter getMDataCenter() {
        return (DataCenter) this.f92981m.getValue();
    }

    public final C39377a getMModel() {
        return (C39377a) this.f92978j.getValue();
    }

    public final C39618a getMUserSettingChangePresenter() {
        return (C39618a) this.f92980l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$a */
    public static final class C39387a {
        static {
            Covode.recordClassIndex(47074);
        }

        private C39387a() {
        }

        public /* synthetic */ C39387a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$b */
    public static final class C39388b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39386a f92983a;

        static {
            Covode.recordClassIndex(47075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39388b(C39386a aVar) {
            super(0);
            this.f92983a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f92983a.f92972c = true;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$g */
    public static final class C39395g extends InputFilter.LengthFilter {
        static {
            Covode.recordClassIndex(47082);
        }

        C39395g() {
            super(30);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$l */
    static final class C39400l extends AbstractC89220m implements AbstractC89171a<C39618a> {

        /* renamed from: a */
        public static final C39400l f92999a = new C39400l();

        static {
            Covode.recordClassIndex(47087);
        }

        C39400l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39618a invoke() {
            return new C39618a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$j */
    static final class C39398j extends AbstractC89220m implements AbstractC89171a<C39377a> {

        /* renamed from: a */
        final /* synthetic */ C39386a f92997a;

        static {
            Covode.recordClassIndex(47085);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39398j(C39386a aVar) {
            super(0);
            this.f92997a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39377a invoke() {
            return new C39377a(this.f92997a.getMDataCenter());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$k */
    static final class C39399k extends AbstractC89220m implements AbstractC89171a<C39088c<AbstractC39085b<C68348f>, AbstractC68351c>> {

        /* renamed from: a */
        final /* synthetic */ C39386a f92998a;

        static {
            Covode.recordClassIndex(47086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39399k(C39386a aVar) {
            super(0);
            this.f92998a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39088c<AbstractC39085b<C68348f>, AbstractC68351c> invoke() {
            C39088c<AbstractC39085b<C68348f>, AbstractC68351c> providePushSettingFetchPresenter = C68432f.f153189a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.mo67839a_(this.f92998a);
            return providePushSettingFetchPresenter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$i */
    static final class C39397i extends AbstractC89220m implements AbstractC89171a<DataCenter> {

        /* renamed from: a */
        final /* synthetic */ C39386a f92996a;

        static {
            Covode.recordClassIndex(47084);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39397i(C39386a aVar) {
            super(0);
            this.f92996a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DataCenter invoke() {
            Context context = this.f92996a.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C1175ad a = C1181ae.m3881a((ActivityC0945e) context, (C1175ad.AbstractC1177b) null);
            Context context2 = this.f92996a.getContext();
            Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            return DataCenter.m69492a(a, (ActivityC0945e) context2).mo60189a("list_keywords", (AbstractC1214u<C33942b>) this.f92996a);
        }
    }

    public final void clearFocus() {
        super.clearFocus();
        DmtEditText dmtEditText = (DmtEditText) mo68829a(R.id.gu);
        if (dmtEditText != null) {
            dmtEditText.clearFocus();
        }
        Object a = m80090a(getContext(), "input_method");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) a).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* renamed from: a */
    public final void mo68830a() {
        CommonItemView commonItemView = (CommonItemView) mo68829a(R.id.a9k);
        C89219l.m154716b(commonItemView, "");
        if (commonItemView.mo27138d()) {
            View a = mo68829a(R.id.arv);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            DmtEditText dmtEditText = (DmtEditText) mo68829a(R.id.gu);
            C89219l.m154716b(dmtEditText, "");
            dmtEditText.setVisibility(0);
            TagMaxHeightRecyclerView tagMaxHeightRecyclerView = (TagMaxHeightRecyclerView) mo68829a(R.id.c28);
            C89219l.m154716b(tagMaxHeightRecyclerView, "");
            tagMaxHeightRecyclerView.setVisibility(0);
            TagMaxHeightRecyclerView tagMaxHeightRecyclerView2 = (TagMaxHeightRecyclerView) mo68829a(R.id.c28);
            RecyclerView.AbstractC1362i layoutManager = tagMaxHeightRecyclerView2.getLayoutManager();
            FlexboxLayoutManager flexboxLayoutManager = layoutManager;
            if (layoutManager == null) {
                FlexboxLayoutManager flexboxLayoutManager2 = new FlexboxLayoutManager(tagMaxHeightRecyclerView2.getContext());
                flexboxLayoutManager2.mo41247m();
                flexboxLayoutManager2.mo4356b(0);
                flexboxLayoutManager2.mo41248n();
                int i = flexboxLayoutManager2.f59776c;
                flexboxLayoutManager = flexboxLayoutManager2;
                if (i != 0) {
                    flexboxLayoutManager2.f59776c = 0;
                    flexboxLayoutManager2.mo4726o();
                    flexboxLayoutManager = flexboxLayoutManager2;
                }
            }
            tagMaxHeightRecyclerView2.setLayoutManager(flexboxLayoutManager);
            RecyclerView.AbstractC1350a adapter = tagMaxHeightRecyclerView2.getAdapter();
            if (adapter == null) {
                Context context = tagMaxHeightRecyclerView2.getContext();
                C89219l.m154716b(context, "");
                adapter = new C39373a(context, new C39388b(this));
            }
            tagMaxHeightRecyclerView2.setAdapter(adapter);
            return;
        }
        View a2 = mo68829a(R.id.arv);
        C89219l.m154716b(a2, "");
        a2.setVisibility(8);
        DmtEditText dmtEditText2 = (DmtEditText) mo68829a(R.id.gu);
        C89219l.m154716b(dmtEditText2, "");
        dmtEditText2.setVisibility(8);
        TagMaxHeightRecyclerView tagMaxHeightRecyclerView3 = (TagMaxHeightRecyclerView) mo68829a(R.id.c28);
        C89219l.m154716b(tagMaxHeightRecyclerView3, "");
        tagMaxHeightRecyclerView3.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        int i;
        String str;
        List<String> list;
        if (this.f92977i && this.f92972c) {
            RecyclerView recyclerView = (RecyclerView) mo68829a(R.id.c28);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof C39373a)) {
                adapter = null;
            }
            C39373a aVar = (C39373a) adapter;
            boolean z = true;
            if (aVar == null || (list = aVar.f92945a) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (T t : list) {
                    T t2 = t;
                    Objects.requireNonNull(t2, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (!C89219l.m154714a((Object) C89361p.m154917c((CharSequence) t2).toString(), (Object) "")) {
                        arrayList2.add(t);
                    }
                }
                ArrayList<String> arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) arrayList3, 10));
                for (String str2 : arrayList3) {
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                    arrayList4.add(C89361p.m154910b((CharSequence) str2).toString());
                }
                arrayList = arrayList4;
            }
            if (!(arrayList instanceof ArrayList)) {
                arrayList = null;
            }
            ArrayList arrayList5 = arrayList;
            if (arrayList5 != null) {
                C39377a mModel = getMModel();
                String b = new C27910f().mo46674b(arrayList5);
                C89219l.m154716b(b, "");
                C89219l.m154721d(b, "");
                C1731i<BaseResponse> commentFilterKeywords = mModel.mo68821a().setCommentFilterKeywords(b);
                C89219l.m154716b(commentFilterKeywords, "");
                commentFilterKeywords.mo5534a(new C39401m(this, arrayList5), C1731i.f5564c, null);
            }
            CommonItemView commonItemView = (CommonItemView) mo68829a(R.id.a9k);
            C89219l.m154716b(commonItemView, "");
            if (commonItemView.mo27138d() && arrayList5 != null && arrayList5.size() == 0) {
                CommonItemView commonItemView2 = (CommonItemView) mo68829a(R.id.a9k);
                C89219l.m154716b(commonItemView2, "");
                CommonItemView commonItemView3 = (CommonItemView) mo68829a(R.id.a9k);
                C89219l.m154716b(commonItemView3, "");
                commonItemView2.setChecked(!commonItemView3.mo27138d());
            }
            C47809e eVar = this.f92970a;
            String str3 = "comment_filter_status_" + this.f92971b;
            CommonItemView commonItemView4 = (CommonItemView) mo68829a(R.id.a9k);
            C89219l.m154716b(commonItemView4, "");
            if (commonItemView4.mo27138d()) {
                i = 1;
            } else {
                i = 2;
            }
            eVar.mo79876b(str3, Integer.valueOf(i));
            CommonItemView commonItemView5 = (CommonItemView) mo68829a(R.id.a9k);
            C89219l.m154716b(commonItemView5, "");
            if (commonItemView5.mo27138d()) {
                str = "filter_on";
            } else {
                str = "filter_off";
            }
            CommonItemView commonItemView6 = (CommonItemView) mo68829a(R.id.a9k);
            C89219l.m154716b(commonItemView6, "");
            boolean d = commonItemView6.mo27138d();
            if (this.f92973e != 1) {
                z = false;
            }
            if (d != z) {
                C39162r.m79460a(str, new C33744d().f79943a);
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$m */
    static final class C39401m<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C39386a f93000a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f93001b;

        static {
            Covode.recordClassIndex(47088);
        }

        C39401m(C39386a aVar, ArrayList arrayList) {
            this.f93000a = aVar;
            this.f93001b = arrayList;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$m$a */
        static final class C39403a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C39401m f93004a;

            static {
                Covode.recordClassIndex(47090);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39403a(C39401m mVar) {
                super(1);
                this.f93004a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(String str) {
                String str2 = str;
                C89219l.m154721d(str2, "");
                if (C23697c.m44781a(str2)) {
                    str2 = this.f93004a.f93000a.getContext().getString(R.string.aka);
                    C89219l.m154716b(str2, "");
                }
                Activity j = C17873f.m33102j();
                if (j == null) {
                    return null;
                }
                new C23144b(j).mo37633a(R.style.nz).mo37632a().mo37635a(str2).mo37637b();
                return C89391z.f203057a;
            }
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<BaseResponse> iVar) {
            String errorMsg;
            final C39403a aVar = new C39403a(this);
            String str = "";
            C89219l.m154716b(iVar, str);
            if (iVar.mo5539b() || iVar.mo5544c()) {
                Exception e = iVar.mo5546e();
                if (!(e instanceof C34485a)) {
                    e = null;
                }
                C34485a aVar2 = (C34485a) e;
                if (!(aVar2 == null || (errorMsg = aVar2.getErrorMsg()) == null)) {
                    str = errorMsg;
                }
                aVar.invoke(str);
            } else if (iVar.mo5535a()) {
                if (iVar.mo5545d().status_code != 0) {
                    String str2 = iVar.mo5545d().status_msg;
                    C89219l.m154716b(str2, str);
                    aVar.invoke(str2);
                } else {
                    CommonItemView commonItemView = (CommonItemView) this.f93000a.mo68829a(R.id.a9k);
                    C89219l.m154716b(commonItemView, str);
                    if (!commonItemView.mo27138d() || this.f93001b.size() != 0) {
                        CommonItemView commonItemView2 = (CommonItemView) this.f93000a.mo68829a(R.id.a9k);
                        C89219l.m154716b(commonItemView2, str);
                        if (commonItemView2.mo27138d()) {
                            Activity j = C17873f.m33102j();
                            if (j != null) {
                                new C23144b(j).mo37633a(R.style.nz).mo37632a().mo37640e(R.string.akb).mo37637b();
                            }
                        }
                    }
                    this.f93000a.getMUserSettingChangePresenter().mo69038a("comment_filter_status", 2, new AbstractC39627d(this) {
                        /* class com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui.C39386a.C39401m.C394021 */

                        /* renamed from: a */
                        final /* synthetic */ C39401m f93002a;

                        static {
                            Covode.recordClassIndex(47089);
                        }

                        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d
                        /* renamed from: a */
                        public final void mo68840a() {
                            Activity j = C17873f.m33102j();
                            if (j != null) {
                                new C23144b(j).mo37633a(R.style.nz).mo37632a().mo37640e(R.string.akb).mo37637b();
                            }
                            this.f93002a.f93000a.f92970a.mo79877b("settings_times_" + this.f93002a.f93000a.f92971b, "1");
                            this.f93002a.f93000a.f92970a.mo79877b("not_now_times_" + this.f93002a.f93000a.f92971b, "2");
                        }

                        @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d
                        /* renamed from: a */
                        public final void mo68841a(String str) {
                            C89219l.m154721d(str, "");
                            aVar.invoke(str);
                        }

                        {
                            this.f93002a = r1;
                        }
                    });
                }
                return null;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$c */
    static final class View$OnClickListenerC39389c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f92984a;

        /* renamed from: b */
        final /* synthetic */ C39386a f92985b;

        static {
            Covode.recordClassIndex(47076);
        }

        View$OnClickListenerC39389c(CommonItemView commonItemView, C39386a aVar) {
            this.f92984a = commonItemView;
            this.f92985b = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f92985b.f92972c = true;
            CommonItemView commonItemView = this.f92984a;
            C89219l.m154716b(commonItemView, "");
            CommonItemView commonItemView2 = this.f92984a;
            C89219l.m154716b(commonItemView2, "");
            commonItemView.setChecked(true ^ commonItemView2.mo27138d());
            CommonItemView commonItemView3 = this.f92984a;
            C89219l.m154716b(commonItemView3, "");
            if (commonItemView3.mo27138d()) {
                str = "manual_filter_on";
            } else {
                str = "manual_filter_off";
            }
            C39162r.m79460a(str, new C33744d().mo59983a("enter_from", "comment_filters").f79943a);
            this.f92985b.mo68830a();
            CommonItemView commonItemView4 = this.f92984a;
            C89219l.m154716b(commonItemView4, "");
            if (commonItemView4.mo27138d() && this.f92985b.getMDataCenter().mo60192a("list_keywords") == null) {
                this.f92985b.getMModel().mo68822b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$e */
    static final class View$OnClickListenerC39392e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f92990a;

        /* renamed from: b */
        final /* synthetic */ C39386a f92991b;

        /* renamed from: c */
        final /* synthetic */ Boolean f92992c;

        static {
            Covode.recordClassIndex(47079);
        }

        View$OnClickListenerC39392e(CommonItemView commonItemView, C39386a aVar, Boolean bool) {
            this.f92990a = commonItemView;
            this.f92991b = aVar;
            this.f92992c = bool;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f92991b.f92972c = true;
            CommonItemView commonItemView = this.f92990a;
            C89219l.m154716b(commonItemView, "");
            CommonItemView commonItemView2 = this.f92990a;
            C89219l.m154716b(commonItemView2, "");
            commonItemView.setChecked(true ^ commonItemView2.mo27138d());
            CommonItemView commonItemView3 = this.f92990a;
            C89219l.m154716b(commonItemView3, "");
            boolean d = commonItemView3.mo27138d();
            CommonItemView commonItemView4 = this.f92990a;
            C89219l.m154716b(commonItemView4, "");
            if (commonItemView4.mo27138d()) {
                str = "all_filter_on_ck";
            } else {
                str = "all_filter_off_ck";
            }
            C39162r.m79460a(str, new C33744d().f79943a);
            this.f92991b.getMUserSettingChangePresenter().mo69038a("author_review_all_comments", d ? 1 : 0, new AbstractC39627d(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui.C39386a.View$OnClickListenerC39392e.C393931 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39392e f92993a;

                static {
                    Covode.recordClassIndex(47080);
                }

                @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d
                /* renamed from: a */
                public final void mo68840a() {
                    new C23144b(this.f92993a.f92991b).mo37640e(R.string.akb).mo37637b();
                }

                {
                    this.f92993a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d
                /* renamed from: a */
                public final void mo68841a(String str) {
                    C89219l.m154721d(str, "");
                    CommonItemView commonItemView = this.f92993a.f92990a;
                    C89219l.m154716b(commonItemView, "");
                    CommonItemView commonItemView2 = this.f92993a.f92990a;
                    C89219l.m154716b(commonItemView2, "");
                    commonItemView.setChecked(!commonItemView2.mo27138d());
                    CommonItemView commonItemView3 = this.f92993a.f92990a;
                    C89219l.m154716b(commonItemView3, "");
                    this.f92993a.f92991b.f92970a.mo79875b("author_review_all_comments_" + this.f92993a.f92991b.f92971b, Boolean.valueOf(commonItemView3.mo27138d()));
                    C23144b bVar = new C23144b(this.f92993a.f92991b);
                    if (C23697c.m44781a(str)) {
                        str = this.f92993a.f92990a.getContext().getString(R.string.aka);
                        C89219l.m154716b(str, "");
                    }
                    bVar.mo37635a(str).mo37637b();
                }
            });
            CommonItemView commonItemView5 = this.f92990a;
            C89219l.m154716b(commonItemView5, "");
            this.f92991b.f92970a.mo79875b("author_review_all_comments_" + this.f92991b.f92971b, Boolean.valueOf(commonItemView5.mo27138d()));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        List<String> list;
        C33942b bVar2 = bVar;
        C39373a aVar = null;
        if (bVar2 != null) {
            list = (List) bVar2.mo60212a();
        } else {
            list = null;
        }
        if (C89206ad.m154681c(list) && list != null) {
            RecyclerView recyclerView = (RecyclerView) mo68829a(R.id.c28);
            C89219l.m154716b(recyclerView, "");
            RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
            if (adapter instanceof C39373a) {
                aVar = adapter;
            }
            C39373a aVar2 = aVar;
            if (aVar2 != null) {
                C89219l.m154721d(list, "");
                aVar2.f92945a = list;
            }
            RecyclerView recyclerView2 = (RecyclerView) mo68829a(R.id.c28);
            C89219l.m154716b(recyclerView2, "");
            RecyclerView.AbstractC1350a adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
            this.f92977i = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$d */
    static final class View$OnClickListenerC39390d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f92986a;

        /* renamed from: b */
        final /* synthetic */ C39256o f92987b;

        /* renamed from: c */
        final /* synthetic */ C39386a f92988c;

        static {
            Covode.recordClassIndex(47077);
        }

        View$OnClickListenerC39390d(CommonItemView commonItemView, C39256o oVar, C39386a aVar) {
            this.f92986a = commonItemView;
            this.f92987b = oVar;
            this.f92988c = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            C39256o oVar = this.f92987b;
            int i = 1;
            if (oVar == null || oVar.getShowType() != 1) {
                this.f92988c.f92972c = true;
                CommonItemView commonItemView = this.f92986a;
                C89219l.m154716b(commonItemView, "");
                CommonItemView commonItemView2 = this.f92986a;
                C89219l.m154716b(commonItemView2, "");
                commonItemView.setChecked(!commonItemView2.mo27138d());
                CommonItemView commonItemView3 = this.f92986a;
                C89219l.m154716b(commonItemView3, "");
                if (!commonItemView3.mo27138d()) {
                    i = 2;
                }
                this.f92988c.getMUserSettingChangePresenter().mo69038a("comment_offensive_filter", i, new AbstractC39627d(this) {
                    /* class com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui.C39386a.View$OnClickListenerC39390d.C393911 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC39390d f92989a;

                    static {
                        Covode.recordClassIndex(47078);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d
                    /* renamed from: a */
                    public final void mo68840a() {
                        new C23144b(this.f92989a.f92988c).mo37640e(R.string.akb).mo37637b();
                    }

                    {
                        this.f92989a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.compliance.common.p2663d.AbstractC39627d
                    /* renamed from: a */
                    public final void mo68841a(String str) {
                        C89219l.m154721d(str, "");
                        CommonItemView commonItemView = this.f92989a.f92986a;
                        C89219l.m154716b(commonItemView, "");
                        CommonItemView commonItemView2 = this.f92989a.f92986a;
                        C89219l.m154716b(commonItemView2, "");
                        int i = 1;
                        commonItemView.setChecked(!commonItemView2.mo27138d());
                        C47809e eVar = this.f92989a.f92988c.f92970a;
                        String str2 = "comment_offensive_filter_" + this.f92989a.f92988c.f92971b;
                        CommonItemView commonItemView3 = this.f92989a.f92986a;
                        C89219l.m154716b(commonItemView3, "");
                        if (!commonItemView3.mo27138d()) {
                            i = 2;
                        }
                        eVar.mo79876b(str2, Integer.valueOf(i));
                        C23144b bVar = new C23144b(this.f92989a.f92988c);
                        if (C23697c.m44781a(str)) {
                            str = this.f92989a.f92986a.getContext().getString(R.string.aka);
                            C89219l.m154716b(str, "");
                        }
                        bVar.mo37635a(str).mo37637b();
                    }
                });
                this.f92988c.f92970a.mo79876b("comment_offensive_filter_" + this.f92988c.f92971b, Integer.valueOf(i));
                CommonItemView commonItemView4 = this.f92986a;
                C89219l.m154716b(commonItemView4, "");
                if (commonItemView4.mo27138d()) {
                    str = "ai_filter_on";
                } else {
                    str = "ai_filter_off";
                }
                C39162r.m79460a(str, new C33744d().f79943a);
            } else if (this.f92987b.getResType() == 1) {
                CommonItemView commonItemView5 = this.f92986a;
                C89219l.m154716b(commonItemView5, "");
                new C23144b(commonItemView5).mo37640e(R.string.fko).mo37637b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$f */
    static final class View$OnClickListenerC39394f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommonItemView f92994a;

        static {
            Covode.recordClassIndex(47081);
        }

        View$OnClickListenerC39394f(CommonItemView commonItemView) {
            this.f92994a = commonItemView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C33744d dVar = new C33744d();
            ArrayList arrayList = new ArrayList();
            View rootView = this.f92994a.getRootView();
            C89219l.m154716b(rootView, "");
            CommonItemView commonItemView = (CommonItemView) rootView.findViewById(R.id.a9j);
            C89219l.m154716b(commonItemView, "");
            if (commonItemView.mo27138d()) {
                arrayList.add("all");
            }
            View rootView2 = this.f92994a.getRootView();
            C89219l.m154716b(rootView2, "");
            CommonItemView commonItemView2 = (CommonItemView) rootView2.findViewById(R.id.a9i);
            C89219l.m154716b(commonItemView2, "");
            if (commonItemView2.mo27138d()) {
                arrayList.add("ai");
            }
            View rootView3 = this.f92994a.getRootView();
            C89219l.m154716b(rootView3, "");
            CommonItemView commonItemView3 = (CommonItemView) rootView3.findViewById(R.id.a9k);
            C89219l.m154716b(commonItemView3, "");
            if (commonItemView3.mo27138d()) {
                arrayList.add("keyword");
            }
            C39162r.m79460a("filtered_comment_review_bysetting_ck", dVar.mo59982a("filters_condition", arrayList).f79943a);
            SmartRouter.buildRoute(this.f92994a.getContext(), "//webview").withParam("url", "https://www.tiktok.com/inapp/filtered_comments/posts?enable_report_optimization=1").withParam("hide_nav_bar", true).open();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo68831a(com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f r6) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui.C39386a.mo68831a(com.ss.android.ugc.aweme.setting.serverpush.a.f):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C39386a(android.content.Context r13) {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2650ui.C39386a.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private static Object m80090a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9359);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9359);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.ui.a$h */
    static final class C39396h implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C39386a f92995a;

        static {
            Covode.recordClassIndex(47083);
        }

        C39396h(C39386a aVar) {
            this.f92995a = aVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            if (i == 6) {
                DmtEditText dmtEditText = (DmtEditText) this.f92995a.mo68829a(R.id.gu);
                C89219l.m154716b(dmtEditText, "");
                if (String.valueOf(dmtEditText.getText()).length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    RecyclerView recyclerView = (RecyclerView) this.f92995a.mo68829a(R.id.c28);
                    C89219l.m154716b(recyclerView, "");
                    RecyclerView.AbstractC1350a adapter = recyclerView.getAdapter();
                    Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.business.commentfilter.adapter.KeyWordTagAdapter");
                    if (((C39373a) adapter).f92945a.size() >= 50) {
                        ((DmtEditText) this.f92995a.mo68829a(R.id.gu)).clearFocus();
                        new C23144b(this.f92995a).mo37640e(R.string.ak5).mo37637b();
                        C39162r.m79460a("keyword_filter_add_failed_ck", new C33744d().mo59983a("failed_reason", "over").f79943a);
                        return false;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this.f92995a.mo68829a(R.id.c28);
                    C89219l.m154716b(recyclerView2, "");
                    RecyclerView.AbstractC1350a adapter2 = recyclerView2.getAdapter();
                    Objects.requireNonNull(adapter2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.business.commentfilter.adapter.KeyWordTagAdapter");
                    C39373a aVar = (C39373a) adapter2;
                    DmtEditText dmtEditText2 = (DmtEditText) this.f92995a.mo68829a(R.id.gu);
                    C89219l.m154716b(dmtEditText2, "");
                    String valueOf = String.valueOf(dmtEditText2.getText());
                    C89219l.m154721d(valueOf, "");
                    aVar.f92947c.invoke();
                    C39162r.m79460a("keyword_filter_add_ck", new C33744d().mo59983a("keyword", valueOf).f79943a);
                    aVar.f92945a.add(0, valueOf);
                    aVar.notifyItemInserted(0);
                    aVar.notifyItemRangeChanged(1, aVar.getItemCount());
                    ((DmtEditText) this.f92995a.mo68829a(R.id.gu)).clearFocus();
                    ((DmtEditText) this.f92995a.mo68829a(R.id.gu)).setText("");
                } else {
                    ((DmtEditText) this.f92995a.mo68829a(R.id.gu)).clearFocus();
                    C39162r.m79460a("keyword_filter_add_failed_ck", new C33744d().mo59983a("failed_reason", "null").f79943a);
                    new C23144b(this.f92995a).mo37640e(R.string.ak9).mo37637b();
                }
            }
            return false;
        }
    }
}
