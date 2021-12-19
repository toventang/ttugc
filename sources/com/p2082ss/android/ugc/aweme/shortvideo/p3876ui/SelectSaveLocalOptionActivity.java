package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.p2730de.C40979n;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71907a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.permissionmanager.C73772f;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity */
public final class SelectSaveLocalOptionActivity extends ActivityC33402b {

    /* renamed from: d */
    public static VideoPublishEditModel f164683d;

    /* renamed from: e */
    public static final List<Integer> f164684e = C89070n.m154524c(Integer.valueOf((int) R.string.dkc), Integer.valueOf((int) R.string.a9r), Integer.valueOf((int) R.string.a9q));

    /* renamed from: f */
    public static final C73321a f164685f = new C73321a((byte) 0);

    /* renamed from: g */
    private ButtonTitleBar f164686g;

    /* renamed from: h */
    private RecyclerView f164687h;

    /* renamed from: i */
    private boolean f164688i;

    /* renamed from: j */
    private boolean f164689j;

    /* renamed from: k */
    private HashMap f164690k;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$b */
    public interface AbstractC73323b {
        static {
            Covode.recordClassIndex(86051);
        }

        /* renamed from: a */
        void mo114954a();

        /* renamed from: a */
        void mo114955a(int i);

        /* renamed from: b */
        void mo114956b();
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final boolean cz_() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    /* renamed from: d_ */
    public final View mo59481d_(int i) {
        if (this.f164690k == null) {
            this.f164690k = new HashMap();
        }
        View view = (View) this.f164690k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f164690k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$a */
    public static final class C73321a {
        static {
            Covode.recordClassIndex(86049);
        }

        private C73321a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$a$a */
        public static final class C73322a implements C72631i.AbstractC72633b {

            /* renamed from: a */
            final /* synthetic */ Dialog f164691a;

            /* renamed from: b */
            final /* synthetic */ C72631i.AbstractC72633b f164692b;

            /* renamed from: c */
            final /* synthetic */ String f164693c;

            static {
                Covode.recordClassIndex(86050);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
            /* renamed from: a */
            public final void mo114916a() {
                this.f164691a.dismiss();
                this.f164692b.mo114916a();
                C72631i.C72632a.m128110a("", this.f164693c, "video_post_page", "download_with_publish", "download");
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
            /* renamed from: b */
            public final void mo114917b() {
                this.f164691a.dismiss();
                this.f164692b.mo114917b();
                C72631i.C72632a.m128110a("", this.f164693c, "video_post_page", "download_with_publish", "cancel");
            }

            C73322a(Dialog dialog, C72631i.AbstractC72633b bVar, String str) {
                this.f164691a = dialog;
                this.f164692b = bVar;
                this.f164693c = str;
            }
        }

        public /* synthetic */ C73321a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$d */
    public static final class C73329d implements AbstractC73323b {

        /* renamed from: a */
        final /* synthetic */ SelectSaveLocalOptionActivity f164713a;

        static {
            Covode.recordClassIndex(86057);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
        /* renamed from: a */
        public final void mo114954a() {
            this.f164713a.setResult(0);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
        /* renamed from: b */
        public final void mo114956b() {
            this.f164713a.finish();
        }

        C73329d(SelectSaveLocalOptionActivity selectSaveLocalOptionActivity) {
            this.f164713a = selectSaveLocalOptionActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.AbstractC73323b
        /* renamed from: a */
        public final void mo114955a(int i) {
            this.f164713a.setResult(-1, new Intent().putExtra("extra_save_option", i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$c */
    public static final class C73324c extends RecyclerView.AbstractC1350a<C73325a> {

        /* renamed from: a */
        public RecyclerView f164694a;

        /* renamed from: b */
        public final List<Integer> f164695b;

        /* renamed from: c */
        public int f164696c;

        /* renamed from: d */
        public final boolean f164697d;

        /* renamed from: e */
        public final boolean f164698e;

        /* renamed from: f */
        public final ActivityC0945e f164699f;

        /* renamed from: g */
        public final AbstractC73323b f164700g;

        static {
            Covode.recordClassIndex(86052);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C73325a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m129378a(viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            List<Integer> list = this.f164695b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
            C89219l.m154721d(recyclerView, "");
            super.onAttachedToRecyclerView(recyclerView);
            this.f164694a = recyclerView;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$c$a */
        public static final class C73325a extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final TuxRadio f164701a;

            /* renamed from: b */
            public final TextView f164702b;

            /* renamed from: c */
            public final TextView f164703c;

            static {
                Covode.recordClassIndex(86053);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C73325a(View view) {
                super(view);
                C89219l.m154721d(view, "");
                View findViewById = view.findViewById(R.id.ddr);
                C89219l.m154716b(findViewById, "");
                this.f164701a = (TuxRadio) findViewById;
                View findViewById2 = view.findViewById(R.id.ext);
                C89219l.m154716b(findViewById2, "");
                this.f164702b = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.euz);
                C89219l.m154716b(findViewById3, "");
                this.f164703c = (TextView) findViewById3;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$c$b */
        static final class View$OnClickListenerC73326b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C73324c f164704a;

            /* renamed from: b */
            final /* synthetic */ int f164705b;

            /* renamed from: c */
            final /* synthetic */ C73325a f164706c;

            static {
                Covode.recordClassIndex(86054);
            }

            View$OnClickListenerC73326b(C73324c cVar, int i, C73325a aVar) {
                this.f164704a = cVar;
                this.f164705b = i;
                this.f164706c = aVar;
            }

            public final void onClick(final View view) {
                ClickAgent.onClick(view);
                if (!this.f164704a.f164697d || !C71907a.m126982a() || this.f164705b == 0) {
                    C73324c cVar = this.f164704a;
                    cVar.mo115892a(this.f164705b, this.f164706c, cVar.f164700g);
                    return;
                }
                ActivityC0945e eVar = this.f164704a.f164699f;
                C733271 r4 = new C72631i.AbstractC72633b(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.SelectSaveLocalOptionActivity.C73324c.View$OnClickListenerC73326b.C733271 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC73326b f164707a;

                    static {
                        Covode.recordClassIndex(86055);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                    /* renamed from: b */
                    public final void mo114917b() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i.AbstractC72633b
                    /* renamed from: a */
                    public final void mo114916a() {
                        View view = view;
                        C89219l.m154716b(view, "");
                        view.setAlpha(1.0f);
                        this.f164707a.f164704a.mo115892a(this.f164707a.f164705b, this.f164707a.f164706c, this.f164707a.f164704a.f164700g);
                    }

                    {
                        this.f164707a = r1;
                    }
                };
                String str = "";
                C89219l.m154721d(eVar, str);
                C89219l.m154721d(r4, str);
                AbstractC32846a e = C63238c.f143594u.mo93906e();
                if (e != null) {
                    String c = e.mo58660c();
                    C89219l.m154716b(c, str);
                    str = c;
                }
                C72631i iVar = new C72631i();
                Dialog a = iVar.mo114915a(eVar);
                if (a != null) {
                    iVar.f162808a = new C73321a.C73322a(a, r4, str);
                    a.show();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$c$c */
        public static final class C73328c extends AbstractC89220m implements AbstractC89183m<Boolean, Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C73324c f164709a;

            /* renamed from: b */
            final /* synthetic */ C73325a f164710b;

            /* renamed from: c */
            final /* synthetic */ int f164711c;

            /* renamed from: d */
            final /* synthetic */ AbstractC73323b f164712d;

            static {
                Covode.recordClassIndex(86056);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C73328c(C73324c cVar, C73325a aVar, int i, AbstractC73323b bVar) {
                super(2);
                this.f164709a = cVar;
                this.f164710b = aVar;
                this.f164711c = i;
                this.f164712d = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, Boolean bool2) {
                RecyclerView.ViewHolder viewHolder;
                TuxRadio tuxRadio;
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                RecyclerView recyclerView = this.f164709a.f164694a;
                C73325a aVar = null;
                if (recyclerView != null) {
                    viewHolder = recyclerView.mo4451f(this.f164709a.f164696c);
                } else {
                    viewHolder = null;
                }
                if (viewHolder instanceof C73325a) {
                    aVar = viewHolder;
                }
                C73325a aVar2 = aVar;
                if (!(aVar2 == null || (tuxRadio = aVar2.f164701a) == null)) {
                    tuxRadio.setChecked(!booleanValue2);
                }
                this.f164710b.f164701a.setChecked(booleanValue2);
                if (booleanValue) {
                    this.f164709a.f164696c = this.f164711c;
                    this.f164712d.mo114955a(this.f164711c);
                    this.f164712d.mo114956b();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ void onBindViewHolder(C73325a aVar, int i) {
            int i2;
            boolean z;
            Integer num;
            C73325a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            TextView textView = aVar2.f164702b;
            Context a = C40963b.m82473a();
            List<Integer> list = this.f164695b;
            if (list == null || (num = list.get(i)) == null) {
                i2 = 0;
            } else {
                i2 = num.intValue();
            }
            textView.setText(a.getString(i2));
            if (i == 2) {
                aVar2.f164703c.setText(C63238c.f143574a.getString(R.string.a9p));
                aVar2.f164703c.setVisibility(0);
            } else {
                aVar2.f164703c.setVisibility(8);
            }
            TuxRadio tuxRadio = aVar2.f164701a;
            if (this.f164696c == i) {
                z = true;
            } else {
                z = false;
            }
            tuxRadio.setChecked(z);
            aVar2.f164701a.setClickable(false);
            if (this.f164698e && this.f164697d && C71907a.m126982a()) {
                View view = aVar2.itemView;
                C89219l.m154716b(view, "");
                view.setAlpha(0.34f);
            }
            aVar2.itemView.setOnClickListener(new View$OnClickListenerC73326b(this, i, aVar2));
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m129378a(ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(7073);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ab1, viewGroup, false);
            C89219l.m154716b(a2, "");
            C73325a aVar = new C73325a(a2);
            try {
                if (aVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = aVar.getClass().getName();
            MethodCollector.m26664o(7073);
            return aVar;
        }

        /* renamed from: a */
        public final void mo115892a(int i, C73325a aVar, AbstractC73323b bVar) {
            if (i >= 0 && 2 >= i) {
                if (this.f164696c != i) {
                    C73496bd.m129633a(this.f164699f, i, SelectSaveLocalOptionActivity.f164683d, null, new C73328c(this, aVar, i, bVar));
                    return;
                }
                bVar.mo114954a();
                bVar.mo114956b();
            }
        }

        public C73324c(List<Integer> list, int i, boolean z, boolean z2, ActivityC0945e eVar, AbstractC73323b bVar) {
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(bVar, "");
            this.f164695b = list;
            this.f164696c = i;
            this.f164697d = z;
            this.f164698e = z2;
            this.f164699f = eVar;
            this.f164700g = bVar;
        }
    }

    public final void finish() {
        super.finish();
        if (!SettingsManager.m29616a().mo25400a("enable_high_quality_video", false)) {
            overridePendingTransition(R.anim.o, R.anim.m);
        }
    }

    static {
        Covode.recordClassIndex(86048);
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

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity$e */
    public static final class C73330e implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ SelectSaveLocalOptionActivity f164714a;

        static {
            Covode.recordClassIndex(86058);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73330e(SelectSaveLocalOptionActivity selectSaveLocalOptionActivity) {
            this.f164714a = selectSaveLocalOptionActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f164714a.onBackPressed();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b
    public final void onCreate(Bundle bundle) {
        int i;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f164688i = getIntent().getBooleanExtra("mute_download", false);
        this.f164689j = getIntent().getBooleanExtra("download_gray_tag", false);
        C23073a.C23074a.m43508a(this).mo37494a(R.color.l).mo37503d(R.color.l).mo37495a(true).f54627a.mo33415d();
        setContentView(R.layout.agv);
        View findViewById = findViewById(R.id.eiz);
        C89219l.m154716b(findViewById, "");
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) findViewById;
        this.f164686g = buttonTitleBar;
        if (buttonTitleBar == null) {
            C89219l.m154710a("mTitleBar");
        }
        ViewGroup.LayoutParams layoutParams = buttonTitleBar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C40979n.m82503a();
        }
        View findViewById2 = findViewById(R.id.dnz);
        C89219l.m154716b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f164687h = recyclerView;
        if (recyclerView == null) {
            C89219l.m154710a("mRv");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        if (C73772f.m129823a("android.permission.WRITE_EXTERNAL_STORAGE")) {
            i = getIntent().getIntExtra("extra_save_option", 0);
        } else {
            i = 0;
        }
        recyclerView.setAdapter(new C73324c(f164684e, i, this.f164688i, this.f164689j, this, new C73329d(this)));
        ButtonTitleBar buttonTitleBar2 = this.f164686g;
        if (buttonTitleBar2 == null) {
            C89219l.m154710a("mTitleBar");
        }
        buttonTitleBar2.setOnTitleBarClickListener(new C73330e(this));
        if (!SettingsManager.m29616a().mo25400a("enable_high_quality_video", false)) {
            ButtonTitleBar buttonTitleBar3 = this.f164686g;
            if (buttonTitleBar3 == null) {
                C89219l.m154710a("mTitleBar");
            }
            buttonTitleBar3.getStartBtn().setImageResource(2131232469);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.SelectSaveLocalOptionActivity", "onCreate", false);
    }
}
