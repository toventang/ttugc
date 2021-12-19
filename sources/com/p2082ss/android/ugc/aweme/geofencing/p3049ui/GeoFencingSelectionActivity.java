package com.p2082ss.android.ugc.aweme.geofencing.p3049ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.geofencing.p3045a.C52875b;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.geofencing.p3048d.C52893a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity */
public final class GeoFencingSelectionActivity extends ActivityC33402b {

    /* renamed from: f */
    public static final C52894a f121663f = new C52894a((byte) 0);

    /* renamed from: d */
    public C52875b f121664d;

    /* renamed from: e */
    public List<C52891a> f121665e;

    /* renamed from: g */
    private final AbstractC89244h f121666g = C89250i.m154773a((AbstractC89171a) C52895b.f121668a);

    /* renamed from: h */
    private HashMap f121667h;

    static {
        Covode.recordClassIndex(62299);
    }

    /* renamed from: g */
    private final C88411a m97741g() {
        return (C88411a) this.f121666g.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f121667h == null) {
            this.f121667h = new HashMap();
        }
        View view = (View) this.f121667h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f121667h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$a */
    public static final class C52894a {
        static {
            Covode.recordClassIndex(62300);
        }

        private C52894a() {
        }

        public /* synthetic */ C52894a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$b */
    static final class C52895b extends AbstractC89220m implements AbstractC89171a<C88411a> {

        /* renamed from: a */
        public static final C52895b f121668a = new C52895b();

        static {
            Covode.recordClassIndex(62301);
        }

        C52895b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C88411a invoke() {
            return new C88411a();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        m97741g().dispose();
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
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

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        C52875b bVar = this.f121664d;
        if (bVar == null) {
            C89219l.m154710a("regionAdapter");
        }
        bVar.mo88543a();
        List<C52891a> list = this.f121665e;
        if (list == null) {
            C89219l.m154710a("initialState");
        }
        if (!list.isEmpty()) {
            List<C52891a> list2 = this.f121665e;
            if (list2 == null) {
                C89219l.m154710a("initialState");
            }
            mo88561a(list2);
            return;
        }
        new C17197a.C17200a(this).mo27189a(R.string.ga2).mo27194b(R.string.ga1).mo27190a(R.string.ga0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC52902i(this), false).mo27195b(R.string.g_z, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC52903j.f121676a, false).mo27193a().mo27185c();
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$c */
    public static final class C52896c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121669a;

        static {
            Covode.recordClassIndex(62302);
        }

        C52896c(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121669a = geoFencingSelectionActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            if (i != 0) {
                KeyboardUtils.m70897c(this.f121669a.mo59481d_(R.id.b_7));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$e */
    public static final class C52898e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121671a;

        static {
            Covode.recordClassIndex(62304);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52898e(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121671a = geoFencingSelectionActivity;
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
                TuxTextView tuxTextView = (TuxTextView) this.f121671a.mo59481d_(R.id.b_6);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(8);
                GeoFencingSelectionActivity.m97740a(this.f121671a).mo88544a("");
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.f121671a.mo59481d_(R.id.b_6);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            GeoFencingSelectionActivity.m97740a(this.f121671a).mo88544a(editable.toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$g */
    static final class View$OnClickListenerC52900g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121673a;

        static {
            Covode.recordClassIndex(62306);
        }

        View$OnClickListenerC52900g(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121673a = geoFencingSelectionActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121673a.onBackPressed();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C52875b m97740a(GeoFencingSelectionActivity geoFencingSelectionActivity) {
        C52875b bVar = geoFencingSelectionActivity.f121664d;
        if (bVar == null) {
            C89219l.m154710a("regionAdapter");
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$f */
    static final class View$OnClickListenerC52899f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121672a;

        static {
            Covode.recordClassIndex(62305);
        }

        View$OnClickListenerC52899f(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121672a = geoFencingSelectionActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((DmtEditText) this.f121672a.mo59481d_(R.id.b_7)).setText("");
            KeyboardUtils.m70897c(this.f121672a.mo59481d_(R.id.b_7));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$h */
    static final class View$OnClickListenerC52901h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121674a;

        static {
            Covode.recordClassIndex(62307);
        }

        View$OnClickListenerC52901h(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121674a = geoFencingSelectionActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GeoFencingSelectionActivity geoFencingSelectionActivity = this.f121674a;
            geoFencingSelectionActivity.mo88561a(GeoFencingSelectionActivity.m97740a(geoFencingSelectionActivity).mo88543a());
        }
    }

    /* renamed from: a */
    public final void mo88561a(List<C52891a> list) {
        Intent intent = new Intent();
        C52893a.m97739a(intent, list);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$d */
    static final class C52897d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121670a;

        static {
            Covode.recordClassIndex(62303);
        }

        C52897d(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121670a = geoFencingSelectionActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
            if (r8 != null) goto L_0x0023;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.geofencing.p3049ui.GeoFencingSelectionActivity.C52897d.accept(java.lang.Object):void");
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.bd);
        Intent intent = getIntent();
        C89219l.m154716b(intent, "");
        List<C52891a> a = C52893a.m97738a(intent);
        if (a == null) {
            a = C89086z.INSTANCE;
        }
        this.f121665e = a;
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            it.next().setSelected(true);
        }
        this.f121664d = new C52875b(a);
        RecyclerView recyclerView = (RecyclerView) mo59481d_(R.id.b_3);
        C89219l.m154716b(recyclerView, "");
        C52875b bVar = this.f121664d;
        if (bVar == null) {
            C89219l.m154710a("regionAdapter");
        }
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.mo4405a(new C52896c(this));
        C88411a g = m97741g();
        C52875b bVar2 = this.f121664d;
        if (bVar2 == null) {
            C89219l.m154710a("regionAdapter");
        }
        AbstractC88979t<R> d = bVar2.f121636b.mo143292d((AbstractC88434g<? super Boolean, ? extends R>) new C52875b.C52877b(bVar2));
        C89219l.m154716b(d, "");
        g.mo142945a(d.mo143289d(new C52897d(this)));
        ((DmtEditText) mo59481d_(R.id.b_7)).addTextChangedListener(new C52898e(this));
        ((TuxTextView) mo59481d_(R.id.b_6)).setOnClickListener(new View$OnClickListenerC52899f(this));
        ((TuxTextView) mo59481d_(R.id.b9y)).setOnClickListener(new View$OnClickListenerC52900g(this));
        ((TuxTextView) mo59481d_(R.id.b_5)).setOnClickListener(new View$OnClickListenerC52901h(this));
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$j */
    public static final class DialogInterface$OnClickListenerC52903j implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC52903j f121676a = new DialogInterface$OnClickListenerC52903j();

        static {
            Covode.recordClassIndex(62309);
        }

        DialogInterface$OnClickListenerC52903j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingSelectionActivity$i */
    public static final class DialogInterface$OnClickListenerC52902i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeoFencingSelectionActivity f121675a;

        static {
            Covode.recordClassIndex(62308);
        }

        DialogInterface$OnClickListenerC52902i(GeoFencingSelectionActivity geoFencingSelectionActivity) {
            this.f121675a = geoFencingSelectionActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f121675a.mo88561a(C89086z.INSTANCE);
        }
    }
}
