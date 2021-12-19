package com.p2082ss.android.ugc.trill.setting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68343a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68368j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage */
public final class DisplayAndCaptionSettingPage extends AbstractC68195a implements AbstractC68351c {

    /* renamed from: l */
    public static final C85103a f190406l = new C85103a((byte) 0);

    /* renamed from: e */
    public String f190407e;

    /* renamed from: f */
    public String f190408f = "";

    /* renamed from: g */
    public CommonItemView f190409g;

    /* renamed from: h */
    public CommonItemView f190410h;

    /* renamed from: i */
    public CommonItemView f190411i;

    /* renamed from: j */
    public CommonItemView f190412j;

    /* renamed from: k */
    public CommonItemView f190413k;

    /* renamed from: m */
    private C68368j f190414m;

    /* renamed from: n */
    private SparseArray f190415n;

    static {
        Covode.recordClassIndex(99134);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f190415n == null) {
            this.f190415n = new SparseArray();
        }
        View view = (View) this.f190415n.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f190415n.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68832a(Exception exc) {
        C89219l.m154721d(exc, "");
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f190415n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.axh;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage$a */
    public static final class C85103a {
        static {
            Covode.recordClassIndex(99135);
        }

        private C85103a() {
        }

        public /* synthetic */ C85103a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    public final CommonItemView mo130045d() {
        CommonItemView commonItemView = this.f190411i;
        if (commonItemView == null) {
            C89219l.m154710a("autoTranslationToggle");
        }
        return commonItemView;
    }

    /* renamed from: e */
    public final CommonItemView mo130046e() {
        CommonItemView commonItemView = this.f190412j;
        if (commonItemView == null) {
            C89219l.m154710a("ttsToggle");
        }
        return commonItemView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m146339f() {
        /*
            r4 = this;
            boolean r0 = com.p2082ss.android.ugc.trill.setting.C85144h.m146397a()
            if (r0 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService r0 = com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl.m146355j()
            java.lang.String r3 = r0.mo108896f()
            int r1 = r3.hashCode()
            r0 = 50
            r2 = 0
            if (r1 == r0) goto L_0x0040
            r0 = 51
            if (r1 == r0) goto L_0x002a
        L_0x001b:
            java.lang.String r2 = ""
        L_0x001d:
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r1 = r4.f190413k
            if (r1 != 0) goto L_0x0026
            java.lang.String r0 = "ttsVoiceItem"
            p4600h.p4611f.p4613b.C89219l.m154710a(r0)
        L_0x0026:
            r1.setRightText(r2)
        L_0x0029:
            return
        L_0x002a:
            java.lang.String r0 = "3"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x001d
            r0 = 2131831519(0x7f112adf, float:1.9296066E38)
            java.lang.String r2 = r1.getString(r0)
            goto L_0x001d
        L_0x0040:
            java.lang.String r0 = "2"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001b
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L_0x001d
            r0 = 2131831518(0x7f112ade, float:1.9296064E38)
            java.lang.String r2 = r1.getString(r0)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage.m146339f():void");
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage$c */
    static final class View$OnClickListenerC85105c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAndCaptionSettingPage f190418a;

        static {
            Covode.recordClassIndex(99137);
        }

        View$OnClickListenerC85105c(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f190418a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C59206ab.m108755a("enter_general_setting").mo96746b("previous_page", "settings_page").mo96746b("enter_method", "click_button").mo96792f();
            C39162r.m79460a("display_settings", new C33744d().mo59983a("enter_from", "settings_page").f79943a);
            SmartRouter.buildRoute(this.f190418a.getContext(), "aweme://display/setting").open();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage$f */
    static final class View$OnClickListenerC85108f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAndCaptionSettingPage f190421a;

        static {
            Covode.recordClassIndex(99140);
        }

        View$OnClickListenerC85108f(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f190421a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("enter_transl_voice", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", this.f190421a.f190408f).f79943a);
            SmartRouter.buildRoute(this.f190421a.getContext(), "//translation/voice/setting").withParam("enter_method", this.f190421a.f190408f).open(1001);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage$b */
    static final class View$OnClickListenerC85104b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAndCaptionSettingPage f190416a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f190417b;

        static {
            Covode.recordClassIndex(99136);
        }

        View$OnClickListenerC85104b(DisplayAndCaptionSettingPage displayAndCaptionSettingPage, ArrayList arrayList) {
            this.f190416a = displayAndCaptionSettingPage;
            this.f190417b = arrayList;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("enter_transl_lang", new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", "translate_subtitle").f79943a);
            SmartRouter.buildRoute(this.f190416a.getContext(), "//translation/language/setting").withParam("translation_language", this.f190417b).withParam("selected_translation_language_code", this.f190416a.f190407e).withParam("enter_method", this.f190416a.f190408f).open(1000);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage$d */
    static final class View$OnClickListenerC85106d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAndCaptionSettingPage f190419a;

        static {
            Covode.recordClassIndex(99138);
        }

        View$OnClickListenerC85106d(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f190419a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f190419a.mo130045d().setChecked(!this.f190419a.mo130045d().mo27138d());
            C85145i.f190498a.storeBoolean("enable_translation", this.f190419a.mo130045d().mo27138d());
            DisplayAndCaptionSettingPage displayAndCaptionSettingPage = this.f190419a;
            displayAndCaptionSettingPage.mo130044a(displayAndCaptionSettingPage.mo130045d().mo27138d());
            C33744d a = new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", this.f190419a.f190408f);
            if (this.f190419a.mo130045d().mo27138d()) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("change_transl_status", a.mo59983a("to_status", str).f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage$e */
    static final class View$OnClickListenerC85107e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DisplayAndCaptionSettingPage f190420a;

        static {
            Covode.recordClassIndex(99139);
        }

        View$OnClickListenerC85107e(DisplayAndCaptionSettingPage displayAndCaptionSettingPage) {
            this.f190420a = displayAndCaptionSettingPage;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f190420a.mo130046e().setChecked(!this.f190420a.mo130046e().mo27138d());
            C85145i.f190498a.storeBoolean("enable_caption_tts", this.f190420a.mo130046e().mo27138d());
            C33744d a = new C33744d().mo59983a("enter_from", "settings_page").mo59983a("enter_method", this.f190420a.f190408f);
            if (this.f190420a.mo130046e().mo27138d()) {
                str = "on";
            } else {
                str = "off";
            }
            C39162r.m79460a("change_tts_status", a.mo59983a("tts_status", str).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68351c
    /* renamed from: a */
    public final void mo68831a(C68348f fVar) {
        CommonItemView commonItemView;
        Resources resources;
        String string;
        if (fVar != null && fVar.f152966ab != null && !fVar.f152966ab.isEmpty()) {
            String str = "";
            if (fVar.f152967ac != null) {
                C68343a aVar = fVar.f152967ac;
                C89219l.m154716b(aVar, str);
                this.f190407e = aVar.getLanguageCode();
                commonItemView = this.f190410h;
                if (commonItemView == null) {
                    C89219l.m154710a("translationLanguageItem");
                }
                C68343a aVar2 = fVar.f152967ac;
                C89219l.m154716b(aVar2, str);
                str = aVar2.getLocalName();
            } else {
                this.f190407e = "empty";
                commonItemView = this.f190410h;
                if (commonItemView == null) {
                    C89219l.m154710a("translationLanguageItem");
                }
                Context context = getContext();
                if (!(context == null || (resources = context.getResources()) == null || (string = resources.getString(R.string.dgz)) == null)) {
                    str = string;
                }
            }
            commonItemView.setRightText(str);
            ArrayList arrayList = new ArrayList(fVar.f152966ab);
            CommonItemView commonItemView2 = this.f190410h;
            if (commonItemView2 == null) {
                C89219l.m154710a("translationLanguageItem");
            }
            commonItemView2.setOnClickListener(new View$OnClickListenerC85104b(this, arrayList));
        }
    }

    /* renamed from: a */
    public final void mo130044a(boolean z) {
        boolean z2;
        if (!z || !TranslatedCaptionCacheServiceImpl.m146355j().mo108893d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            CommonItemView commonItemView = this.f190412j;
            if (commonItemView == null) {
                C89219l.m154710a("ttsToggle");
            }
            commonItemView.setVisibility(0);
            if (C85144h.m146397a()) {
                CommonItemView commonItemView2 = this.f190413k;
                if (commonItemView2 == null) {
                    C89219l.m154710a("ttsVoiceItem");
                }
                commonItemView2.setVisibility(0);
                return;
            }
            return;
        }
        CommonItemView commonItemView3 = this.f190412j;
        if (commonItemView3 == null) {
            C89219l.m154710a("ttsToggle");
        }
        commonItemView3.setVisibility(8);
        CommonItemView commonItemView4 = this.f190413k;
        if (commonItemView4 == null) {
            C89219l.m154710a("ttsVoiceItem");
        }
        commonItemView4.setVisibility(8);
    }

    /* renamed from: a */
    private static String m146338a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.trill.setting.DisplayAndCaptionSettingPage.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onActivityResult(int i, int i2, Intent intent) {
        String a;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1000) {
            if (intent != null) {
                String a2 = m146338a(intent, "updated_language_name");
                if (!(a2 == null || a2.length() == 0)) {
                    CommonItemView commonItemView = this.f190410h;
                    if (commonItemView == null) {
                        C89219l.m154710a("translationLanguageItem");
                    }
                    commonItemView.setRightText(a2);
                }
                if (intent != null && (a = m146338a(intent, "updated_language_code")) != null && a.length() != 0) {
                    this.f190407e = a;
                }
            }
        } else if (i == 1001) {
            m146339f();
        }
    }
}
