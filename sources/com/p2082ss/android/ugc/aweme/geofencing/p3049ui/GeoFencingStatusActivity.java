package com.p2082ss.android.ugc.aweme.geofencing.p3049ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.geofencing.p3045a.C52870a;
import com.p2082ss.android.ugc.aweme.geofencing.p3046b.C52880a;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.geofencing.p3048d.C52893a;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity */
public final class GeoFencingStatusActivity extends ActivityC33402b {

    /* renamed from: e */
    public static final C52904a f121677e = new C52904a((byte) 0);

    /* renamed from: d */
    public C52870a f121678d;

    /* renamed from: f */
    private HashMap f121679f;

    static {
        Covode.recordClassIndex(62310);
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f121679f == null) {
            this.f121679f = new HashMap();
        }
        View view = (View) this.f121679f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f121679f.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity$a */
    public static final class C52904a {
        static {
            Covode.recordClassIndex(62311);
        }

        private C52904a() {
        }

        public /* synthetic */ C52904a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C52880a.m97731a().mo142944a();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onBackPressed() {
        C52870a aVar = this.f121678d;
        if (aVar == null) {
            C89219l.m154710a("regionDeleteAdapter");
        }
        mo88571a(aVar.mo88539a());
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

    /* renamed from: a */
    public static final /* synthetic */ C52870a m97745a(GeoFencingStatusActivity geoFencingStatusActivity) {
        C52870a aVar = geoFencingStatusActivity.f121678d;
        if (aVar == null) {
            C89219l.m154710a("regionDeleteAdapter");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity$c */
    static final class View$OnClickListenerC52906c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeoFencingStatusActivity f121681a;

        static {
            Covode.recordClassIndex(62313);
        }

        View$OnClickListenerC52906c(GeoFencingStatusActivity geoFencingStatusActivity) {
            this.f121681a = geoFencingStatusActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GeoFencingStatusActivity geoFencingStatusActivity = this.f121681a;
            geoFencingStatusActivity.mo88571a(GeoFencingStatusActivity.m97745a(geoFencingStatusActivity).mo88539a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity$b */
    static final class View$OnClickListenerC52905b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GeoFencingStatusActivity f121680a;

        static {
            Covode.recordClassIndex(62312);
        }

        View$OnClickListenerC52905b(GeoFencingStatusActivity geoFencingStatusActivity) {
            this.f121680a = geoFencingStatusActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            GeoFencingStatusActivity geoFencingStatusActivity = this.f121680a;
            List<C52891a> a = GeoFencingStatusActivity.m97745a(geoFencingStatusActivity).mo88539a();
            C89219l.m154721d(a, "");
            if (geoFencingStatusActivity != null) {
                Intent intent = new Intent(geoFencingStatusActivity, GeoFencingSelectionActivity.class);
                C52893a.m97739a(intent, a);
                geoFencingStatusActivity.startActivityForResult(intent, 957, null);
            }
        }
    }

    /* renamed from: a */
    public final void mo88571a(List<C52891a> list) {
        if (getIntent().getBooleanExtra("extra.read_only", false)) {
            finish();
            return;
        }
        Intent intent = new Intent();
        C52893a.m97739a(intent, list);
        setResult(-1, intent);
        finish();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.be);
        Intent intent = getIntent();
        C89219l.m154716b(intent, "");
        List a = C52893a.m97738a(intent);
        if (a == null) {
            a = C89086z.INSTANCE;
        }
        boolean booleanExtra = getIntent().getBooleanExtra("extra.read_only", false);
        if (booleanExtra) {
            ((TuxTextView) mo59481d_(R.id.b9x)).setTextColor(C0643b.m2378c(this, R.color.bx));
            ((TuxTextView) mo59481d_(R.id.b9x)).setText(R.string.gaa);
            ((TuxTextView) mo59481d_(R.id.b9z)).setText(R.string.ga3);
        } else {
            ((TuxTextView) mo59481d_(R.id.b9x)).setOnClickListener(new View$OnClickListenerC52905b(this));
        }
        this.f121678d = new C52870a(this, booleanExtra, a);
        RecyclerView recyclerView = (RecyclerView) mo59481d_(R.id.b_9);
        C52870a aVar = this.f121678d;
        if (aVar == null) {
            C89219l.m154710a("regionDeleteAdapter");
        }
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((AVAutoRTLImageView) mo59481d_(R.id.b_a)).setOnClickListener(new View$OnClickListenerC52906c(this));
        C52880a.m97734b();
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.geofencing.ui.GeoFencingStatusActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onActivityResult(int i, int i2, Intent intent) {
        List<C52891a> a;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null && (a = C52893a.m97738a(intent)) != null) {
            C52870a aVar = this.f121678d;
            if (aVar == null) {
                C89219l.m154710a("regionDeleteAdapter");
            }
            C89219l.m154721d(a, "");
            aVar.f121625a = C89070n.m154585g((Collection) a);
            aVar.notifyDataSetChanged();
        }
    }
}
