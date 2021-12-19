package com.bytedance.hybrid.spark.page;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.hybrid.spark.AbstractC15528b;
import com.bytedance.hybrid.spark.C15534d;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.p1107a.AbstractC15508d;
import com.bytedance.hybrid.spark.p1107a.AbstractC15509e;
import com.bytedance.hybrid.spark.p1107a.AbstractC15510f;
import com.bytedance.hybrid.spark.p1107a.AbstractC15513i;
import com.bytedance.hybrid.spark.p1107a.AbstractC15514j;
import com.bytedance.hybrid.spark.p1107a.C15515k;
import com.bytedance.hybrid.spark.p1108b.C15529a;
import com.bytedance.hybrid.spark.p1110d.C15553f;
import com.bytedance.hybrid.spark.p1110d.C15554g;
import com.bytedance.hybrid.spark.p1110d.C15555h;
import com.bytedance.hybrid.spark.p1110d.C15556i;
import com.bytedance.hybrid.spark.p1110d.C15557j;
import com.bytedance.hybrid.spark.p1110d.C15558k;
import com.bytedance.hybrid.spark.p1110d.C15559l;
import com.bytedance.hybrid.spark.p1110d.C15562m;
import com.bytedance.hybrid.spark.p1110d.C15563n;
import com.bytedance.hybrid.spark.p1110d.C15564o;
import com.bytedance.hybrid.spark.p1110d.C15567p;
import com.bytedance.hybrid.spark.p1111e.C15573c;
import com.bytedance.hybrid.spark.p1111e.ViewTreeObserver$OnGlobalLayoutListenerC15571a;
import com.bytedance.immersionbar.C20057e;
import com.bytedance.immersionbar.EnumC20054b;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21154h;
import com.bytedance.lynx.hybrid.service.AbstractC21349b;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21136a;
import com.bytedance.lynx.p1507a.p1508a.p1510b.C21138c;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class SparkActivity extends ActivityC0945e implements AbstractC15509e {

    /* renamed from: i */
    public static final C15577a f37980i = new C15577a((byte) 0);

    /* renamed from: a */
    public SparkContext f37981a;

    /* renamed from: b */
    public boolean f37982b;

    /* renamed from: c */
    public boolean f37983c;

    /* renamed from: d */
    public Integer f37984d;

    /* renamed from: e */
    public C15564o.C15565a.EnumC15566a f37985e;

    /* renamed from: f */
    public boolean f37986f;

    /* renamed from: g */
    public C20057e f37987g;

    /* renamed from: h */
    public C21136a f37988h;

    /* renamed from: j */
    private C15581a f37989j;

    /* renamed from: k */
    private AbstractC15508d f37990k;

    /* renamed from: l */
    private HashMap f37991l;

    static {
        Covode.recordClassIndex(17840);
    }

    /* renamed from: a */
    private View m28698a(int i) {
        if (this.f37991l == null) {
            this.f37991l = new HashMap();
        }
        View view = (View) this.f37991l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f37991l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: com.bytedance.hybrid.spark.page.SparkActivity$a */
    public static final class C15577a {
        static {
            Covode.recordClassIndex(17841);
        }

        private C15577a() {
        }

        public /* synthetic */ C15577a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15509e
    /* renamed from: a */
    public final void mo25250a() {
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        if (!mo25361c()) {
            super.onBackPressed();
        }
    }

    @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15511g
    /* renamed from: b */
    public final void mo25252b() {
        C15573c.m28691a("SparkActivity", "refresh", this.f37981a);
        C15581a aVar = this.f37989j;
        if (aVar == null) {
            C89219l.m154710a("sparkFragment");
        }
        aVar.mo25252b();
    }

    public final void finish() {
        C15515k b;
        super.finish();
        AbstractC15508d dVar = this.f37990k;
        if (dVar != null && (b = dVar.mo25249b()) != null) {
            overridePendingTransition(b.f37784a, b.f37785b);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        AbstractC21154h kitView;
        C15477a.m28477c(this);
        super.onPause();
        C15581a aVar = this.f37989j;
        if (aVar == null) {
            C89219l.m154710a("sparkFragment");
        }
        C15593c cVar = aVar.f37997a;
        if (cVar != null && (kitView = cVar.getKitView()) != null) {
            kitView.mo34726a("viewDisappeared", null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onResume() {
        AbstractC21154h kitView;
        C15477a.m28476b(this);
        super.onResume();
        C15581a aVar = this.f37989j;
        if (aVar == null) {
            C89219l.m154710a("sparkFragment");
        }
        C15593c cVar = aVar.f37997a;
        if (cVar != null && (kitView = cVar.getKitView()) != null) {
            kitView.mo34726a("viewAppeared", null);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: c */
    public final boolean mo25361c() {
        String str;
        boolean z;
        AbstractC21154h kitView;
        String str2;
        Map<String, Boolean> map = C15529a.f37875a;
        SparkContext sparkContext = this.f37981a;
        String str3 = "";
        if (sparkContext == null || (str = sparkContext.f50280f) == null) {
            str = str3;
        }
        Boolean bool = map.get(str);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C15573c.m28691a("SparkActivity", "onBackPressed enableBlockBackPress:" + z + " disableBackPress:" + this.f37982b, this.f37981a);
        if (z) {
            C15581a aVar = this.f37989j;
            if (aVar == null) {
                C89219l.m154710a("sparkFragment");
            }
            C15593c cVar = aVar.f37997a;
            if (!(cVar == null || (kitView = cVar.getKitView()) == null)) {
                JSONObject jSONObject = new JSONObject();
                SparkContext sparkContext2 = this.f37981a;
                if (!(sparkContext2 == null || (str2 = sparkContext2.f50280f) == null)) {
                    str3 = str2;
                }
                jSONObject.put("containerID", str3);
                kitView.mo34726a("sparkOnBackPressAction", C89070n.m154516a(jSONObject));
            }
            return true;
        }
        C15581a aVar2 = this.f37989j;
        if (aVar2 == null) {
            C89219l.m154710a("sparkFragment");
        }
        if (!aVar2.mo25365a() && !this.f37982b) {
            return false;
        }
        return true;
    }

    /* renamed from: com.bytedance.hybrid.spark.page.SparkActivity$b */
    static final class View$OnClickListenerC15578b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SparkActivity f37992a;

        static {
            Covode.recordClassIndex(17842);
        }

        View$OnClickListenerC15578b(SparkActivity sparkActivity) {
            this.f37992a = sparkActivity;
        }

        public final void onClick(View view) {
            if (!this.f37992a.f37982b) {
                this.f37992a.finish();
            }
        }
    }

    /* renamed from: com.bytedance.hybrid.spark.page.SparkActivity$d */
    static final class View$OnClickListenerC15580d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SparkActivity f37995a;

        static {
            Covode.recordClassIndex(17844);
        }

        View$OnClickListenerC15580d(SparkActivity sparkActivity) {
            this.f37995a = sparkActivity;
        }

        public final void onClick(View view) {
            if (!this.f37995a.mo25361c()) {
                this.f37995a.finish();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C21136a m28699a(SparkActivity sparkActivity) {
        C21136a aVar = sparkActivity.f37988h;
        if (aVar == null) {
            C89219l.m154710a("schemaParams");
        }
        return aVar;
    }

    /* renamed from: com.bytedance.hybrid.spark.page.SparkActivity$c */
    public static final class C15579c implements AbstractC15514j {

        /* renamed from: a */
        final /* synthetic */ SparkActivity f37993a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f37994b;

        static {
            Covode.recordClassIndex(17843);
        }

        @Override // com.bytedance.hybrid.spark.p1107a.AbstractC15514j
        /* renamed from: a */
        public final void mo25264a(String str) {
            T t;
            C15573c.m28691a("SparkActivity", "onReceivedTitle " + str + " useWebTitle = " + SparkActivity.m28699a(this.f37993a).getUseWebTitle(), this.f37993a.f37981a);
            if (SparkActivity.m28699a(this.f37993a).getUseWebTitle() && !TextUtils.isEmpty(str) && (t = this.f37994b.element) != null) {
                if (str == null) {
                    str = "";
                }
                t.mo25260a(str);
            }
        }

        C15579c(SparkActivity sparkActivity, C89233z.C89238e eVar) {
            this.f37993a = sparkActivity;
            this.f37994b = eVar;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public final void onCreate(Bundle bundle) {
        C21136a aVar;
        boolean z;
        View a;
        C21138c b;
        SparkContext sparkContext;
        C15515k a2;
        MethodCollector.m26663i(12064);
        C15477a.m28474a(this, bundle);
        SparkContext sparkContext2 = (SparkContext) getIntent().getParcelableExtra("sparkContext");
        this.f37981a = sparkContext2;
        C15573c.m28691a("SparkActivity", "onCreate", sparkContext2);
        SparkContext sparkContext3 = this.f37981a;
        String str = null;
        AbstractC15508d dVar = sparkContext3 != null ? (AbstractC15508d) sparkContext3.mo34746a(AbstractC15508d.class) : null;
        this.f37990k = dVar;
        if (!(dVar == null || (a2 = dVar.mo25248a()) == null)) {
            overridePendingTransition(a2.f37784a, a2.f37785b);
        }
        super.onCreate(bundle);
        setContentView(R.layout.b0a);
        View findViewById = findViewById(R.id.cw);
        int i = Build.VERSION.SDK_INT;
        new ViewTreeObserver$OnGlobalLayoutListenerC15571a(findViewById);
        SparkContext sparkContext4 = this.f37981a;
        if ((sparkContext4 == null || sparkContext4.mo25239a() == null) && (sparkContext = this.f37981a) != null) {
            sparkContext.mo25240a(this);
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        SparkContext sparkContext5 = this.f37981a;
        eVar.element = sparkContext5 != null ? (T) sparkContext5.mo34746a(AbstractC15513i.class) : null;
        if (eVar.element == null) {
            AbstractC15528b bVar = C15534d.f37882a;
            eVar.element = bVar != null ? (T) bVar.mo25313a() : null;
        }
        SparkContext sparkContext6 = this.f37981a;
        if (sparkContext6 == null || (b = sparkContext6.mo25241b()) == null || !(b instanceof C21136a) || (aVar = (C21136a) b) == null) {
            aVar = new C21136a(null, 1, null);
        }
        this.f37988h = aVar;
        ((FrameLayout) m28698a(R.id.ej3)).removeAllViews();
        T t = eVar.element;
        if (!(t == null || (a = t.mo25256a(this)) == null)) {
            ((FrameLayout) m28698a(R.id.ej3)).addView(a);
        }
        SparkContext sparkContext7 = this.f37981a;
        if (sparkContext7 != null) {
            C15579c cVar = new C15579c(this, eVar);
            C89219l.m154719c(cVar, "");
            sparkContext7.mo34748a(AbstractC15514j.class, cVar);
        }
        StringBuilder sb = new StringBuilder("SparkFragment#");
        SparkContext sparkContext8 = this.f37981a;
        if (sparkContext8 != null) {
            str = sparkContext8.f50280f;
        }
        String sb2 = sb.append(str).toString();
        Fragment a3 = getSupportFragmentManager().mo3551a(sb2);
        if (a3 instanceof C15581a) {
            C15581a aVar2 = (C15581a) a3;
            this.f37989j = aVar2;
            if (aVar2 == null) {
                C89219l.m154710a("sparkFragment");
            }
            Bundle arguments = aVar2.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C89219l.m154709a((Object) arguments, "");
            C15581a aVar3 = this.f37989j;
            if (aVar3 == null) {
                C89219l.m154710a("sparkFragment");
            }
            arguments.putParcelable("sparkContext", this.f37981a);
            aVar3.setArguments(arguments);
            C15581a aVar4 = this.f37989j;
            if (aVar4 == null) {
                C89219l.m154710a("sparkFragment");
            }
            aVar4.mo25252b();
        } else {
            C15573c.m28691a("SparkActivity", "Create SparkFragment", this.f37981a);
            C15581a aVar5 = new C15581a();
            this.f37989j = aVar5;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("sparkContext", this.f37981a);
            aVar5.setArguments(bundle2);
            AbstractC0976n a4 = getSupportFragmentManager().mo3552a();
            C15581a aVar6 = this.f37989j;
            if (aVar6 == null) {
                C89219l.m154710a("sparkFragment");
            }
            a4.mo3454a(R.id.cw, aVar6, sb2).mo3473c();
        }
        ArrayList<AbstractC15510f> arrayList = new ArrayList();
        C21136a aVar7 = this.f37988h;
        if (aVar7 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15553f(aVar7, this));
        C21136a aVar8 = this.f37988h;
        if (aVar8 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15562m(aVar8, eVar.element));
        C21136a aVar9 = this.f37988h;
        if (aVar9 == null) {
            C89219l.m154710a("schemaParams");
        }
        FrameLayout frameLayout = (FrameLayout) m28698a(R.id.ej3);
        C89219l.m154709a((Object) frameLayout, "");
        arrayList.add(new C15554g(aVar9, frameLayout));
        C21136a aVar10 = this.f37988h;
        if (aVar10 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15558k(aVar10, eVar.element));
        C21136a aVar11 = this.f37988h;
        if (aVar11 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15557j(aVar11, this, eVar.element));
        C21136a aVar12 = this.f37988h;
        if (aVar12 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15556i(aVar12, this, eVar.element));
        C21136a aVar13 = this.f37988h;
        if (aVar13 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15559l(aVar13, eVar.element));
        C21136a aVar14 = this.f37988h;
        if (aVar14 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15555h(aVar14, this));
        C21136a aVar15 = this.f37988h;
        if (aVar15 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15563n(aVar15, this, this.f37987g));
        C21136a aVar16 = this.f37988h;
        if (aVar16 == null) {
            C89219l.m154710a("schemaParams");
        }
        arrayList.add(new C15564o(aVar16, this));
        C21136a aVar17 = this.f37988h;
        if (aVar17 == null) {
            C89219l.m154710a("schemaParams");
        }
        FrameLayout frameLayout2 = (FrameLayout) m28698a(R.id.ej3);
        C89219l.m154709a((Object) frameLayout2, "");
        arrayList.add(new C15567p(aVar17, this, frameLayout2));
        for (AbstractC15510f fVar : arrayList) {
            fVar.mo25251a();
        }
        C15573c.m28691a("SparkActivity", "initStatusBar", this.f37981a);
        C20057e a5 = C20057e.m37951a((ActivityC0945e) this);
        this.f37987g = a5;
        if (this.f37983c && a5 != null) {
            a5.mo33406a(EnumC20054b.FLAG_HIDE_STATUS_BAR);
        }
        Integer num = this.f37984d;
        if (num != null) {
            int intValue = num.intValue();
            C20057e eVar2 = this.f37987g;
            if (eVar2 != null) {
                eVar2.mo33409b(intValue);
            }
        }
        C15564o.C15565a.EnumC15566a aVar18 = this.f37985e;
        if (aVar18 != null) {
            C20057e eVar3 = this.f37987g;
            boolean z2 = false;
            if (eVar3 != null) {
                if (aVar18 == C15564o.C15565a.EnumC15566a.DARK) {
                    z = true;
                } else {
                    z = false;
                }
                eVar3.mo33410b(z);
            }
            C20057e eVar4 = this.f37987g;
            if (eVar4 != null) {
                if (aVar18 == C15564o.C15565a.EnumC15566a.DARK) {
                    z2 = true;
                }
                eVar4.mo33413c(z2);
            }
        }
        if (this.f37986f) {
            LinearLayout linearLayout = (LinearLayout) m28698a(R.id.dnh);
            C89219l.m154709a((Object) linearLayout, "");
            linearLayout.setFitsSystemWindows(!this.f37986f);
            C20057e eVar5 = this.f37987g;
            if (eVar5 != null) {
                eVar5.mo33404a();
            }
        }
        C20057e eVar6 = this.f37987g;
        if (eVar6 != null) {
            eVar6.mo33415d();
        }
        T t2 = eVar.element;
        if (t2 != null) {
            t2.mo25258a(new View$OnClickListenerC15580d(this));
        }
        T t3 = eVar.element;
        if (t3 != null) {
            t3.mo25263b(new View$OnClickListenerC15578b(this));
            MethodCollector.m26664o(12064);
            return;
        }
        MethodCollector.m26664o(12064);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC21349b bVar;
        SparkContext sparkContext = this.f37981a;
        if (!(sparkContext == null || (bVar = (AbstractC21349b) sparkContext.mo34746a(AbstractC21349b.class)) == null)) {
            bVar.mo34951a(i);
        }
        super.onActivityResult(i, i2, intent);
    }
}
