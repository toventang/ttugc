package com.p2082ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50540h;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.metrics.C59211af;
import com.p2082ss.android.ugc.aweme.qrcode.p3653b.C66373a;
import com.p2082ss.android.ugc.aweme.qrcode.p3657f.C66407a;
import com.p2082ss.android.ugc.aweme.qrcode.p3657f.C66408b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j;
import com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b;
import com.p2082ss.android.ugc.aweme.qrcode.view.ProgressDialogC66468a;
import com.p2082ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.qrcode.QRCodeFragment */
public class QRCodeFragment extends AbstractC66368a implements View.OnClickListener, C66437j.AbstractC66443a {

    /* renamed from: e */
    protected C66414j f149241e;

    /* renamed from: f */
    protected C66437j f149242f;

    /* renamed from: g */
    public ProgressDialogC66468a f149243g;

    /* renamed from: h */
    public boolean f149244h;

    /* renamed from: i */
    private TextView f149245i;

    /* renamed from: j */
    private TextView f149246j;

    /* renamed from: k */
    private FrameLayout f149247k;

    /* renamed from: l */
    private AbstractC66469b f149248l;

    /* renamed from: m */
    private View f149249m;

    /* renamed from: n */
    private TextTitleBar f149250n;

    /* renamed from: o */
    private TextView f149251o;

    /* renamed from: p */
    private List<Aweme> f149252p;

    static {
        Covode.recordClassIndex(77884);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.AbstractC66443a, androidx.fragment.app.Fragment
    public View getView() {
        return this.f149248l;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: c */
    public final void mo64296c() {
        ProgressDialogC66468a aVar = this.f149243g;
        if (aVar != null && aVar.isShowing()) {
            this.f149243g.dismiss();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C50540h.m94753a(this.f149252p);
        C66437j jVar = this.f149242f;
        if (jVar != null) {
            jVar.mo105361b();
        }
        mo64296c();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.AbstractC66443a
    /* renamed from: d */
    public final void mo105292d() {
        ProgressDialogC66468a aVar = this.f149243g;
        if (aVar != null && !aVar.isShowing()) {
            this.f149243g.show();
            this.f149243g.mo105414a();
        }
        C59211af afVar = new C59211af();
        afVar.f134808a = this.f149241e.enterFrom;
        afVar.f134809b = "normal";
        afVar.f134810c = "shaped";
        afVar.mo96792f();
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j.AbstractC66443a
    /* renamed from: e */
    public final void mo105293e() {
        if (!getActivity().isFinishing()) {
            mo64296c();
            new C79459a(getContext()).mo123050a(R.string.fdu).mo123053a();
            this.f149245i.announceForAccessibility(getString(R.string.fdu));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo27717b(C66397e.f149300a);
    }

    public void onClick(View view) {
        boolean z;
        ClickAgent.onClick(view);
        int id = view.getId();
        if (id == R.id.bsy) {
            getActivity().finish();
        } else if (id == R.id.f2y) {
            if (this.f149248l.f149436f) {
                this.f149242f.mo105360a();
                return;
            }
            new C79459a(C17867d.m33078a()).mo123052a(getString(R.string.bb3)).mo123053a();
            view.announceForAccessibility(getString(R.string.bb3));
        } else if (id != R.id.f2z) {
        } else {
            if (MSAdaptionService.m97895c().mo89375b(getContext())) {
                Toast makeText = Toast.makeText(getContext(), getString(R.string.bed), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
                return;
            }
            C39162r.m79460a("qr_code_scan_enter", new C33744d().mo59983a("enter_from", "qr_code_detail").mo59983a("previous_page", this.f149241e.enterFrom).f79943a);
            Context context = getContext();
            if (this.f149241e.type == 4) {
                z = true;
            } else {
                z = false;
            }
            QRCodePermissionActivity.m118195a(context, false, z);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC66469b aVar;
        MethodCollector.m26663i(1518);
        super.onViewCreated(view, bundle);
        mo27716a(C66389d.f149290a);
        this.f149252p = C50540h.f116810b;
        this.f149249m = view.findViewById(R.id.ach);
        this.f149250n = (TextTitleBar) view.findViewById(R.id.eiz);
        this.f149251o = (TextView) view.findViewById(R.id.dpb);
        this.f149245i = (TextView) view.findViewById(R.id.f2y);
        this.f149246j = (TextView) view.findViewById(R.id.f2z);
        this.f149247k = (FrameLayout) view.findViewById(R.id.dc8);
        this.f149245i.setOnClickListener(this);
        this.f149246j.setOnClickListener(this);
        this.f149250n.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.QRCodeFragment.C663641 */

            static {
                Covode.recordClassIndex(77885);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                QRCodeFragment.this.getActivity().finish();
            }
        });
        this.f149250n.getBackBtn().setContentDescription(getString(R.string.a20));
        C66414j jVar = this.f149241e;
        if (jVar == null) {
            getActivity().finish();
            MethodCollector.m26664o(1518);
            return;
        }
        this.f149250n.setTitle(getString(C66375c.m118063a(jVar.type, this.f149241e.objectId)));
        int c = C13628n.m24522c(getContext(), (float) C13628n.m24521b(getContext()));
        if (c < 660) {
            float f = ((float) c) / 667.0f;
            this.f149247k.setScaleX(f);
            this.f149247k.setScaleY(f);
            float f2 = ((1.0f - f) * 400.0f) / 2.0f;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f149247k.getLayoutParams();
            layoutParams.topMargin = (int) C13628n.m24520b(getContext(), (32.0f * f) - f2);
            this.f149247k.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f149251o.getLayoutParams();
            layoutParams2.topMargin = (int) C13628n.m24520b(getContext(), 16.0f - f2);
            this.f149251o.setLayoutParams(layoutParams2);
        }
        C66414j jVar2 = this.f149241e;
        if (jVar2 == null || jVar2.type != 4) {
            aVar = new C66407a(getContext());
        } else {
            aVar = new C66408b(getContext());
        }
        this.f149248l = aVar;
        this.f149247k.addView(aVar);
        if (this.f149243g == null) {
            ProgressDialogC66468a a = ProgressDialogC66468a.m118220a(getContext(), getResources().getString(R.string.f4l));
            this.f149243g = a;
            a.setIndeterminate(false);
            this.f149243g.getWindow().addFlags(32);
        }
        this.f149248l.setOnBindQrCodeListener(new AbstractC66469b.AbstractC66472a() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.QRCodeFragment.C663652 */

            static {
                Covode.recordClassIndex(77886);
            }

            @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b.AbstractC66472a
            /* renamed from: c */
            public final void mo105297c() {
                QRCodeFragment.this.f149244h = true;
                QRCodeFragment.this.mo64296c();
            }

            @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b.AbstractC66472a
            /* renamed from: a */
            public final void mo105295a() {
                C66373a aVar = new C66373a();
                aVar.f149276a = QRCodeFragment.this.f149241e.enterFrom;
                aVar.f149277b = "shaped";
                aVar.mo96792f();
                QRCodeFragment.this.mo64296c();
            }

            @Override // com.p2082ss.android.ugc.aweme.qrcode.view.AbstractC66469b.AbstractC66472a
            /* renamed from: b */
            public final void mo105296b() {
                if (!QRCodeFragment.this.f149244h && QRCodeFragment.this.f149243g != null && QRCodeFragment.this.f149243g.isShowing()) {
                    QRCodeFragment.this.f149243g.dismiss();
                }
            }
        });
        this.f149248l.setData(this.f149241e);
        this.f149249m.setBackgroundColor(C0643b.m2378c(getContext(), R.color.v));
        this.f149250n.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        this.f149245i.setTextColor(C0643b.m2378c(getContext(), R.color.o0));
        this.f149246j.setTextColor(C0643b.m2378c(getContext(), R.color.o0));
        this.f149248l.setQRCodeCardTitleColor(C0643b.m2378c(getContext(), R.color.bx));
        this.f149248l.setQRCodeCardSubtitleColor(C0643b.m2378c(getContext(), R.color.c5));
        MethodCollector.m26664o(1518);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.bz, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C66437j jVar = this.f149242f;
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == -1) {
                    jVar.mo105363d();
                    return;
                }
            }
            jVar.mo105362c();
        }
    }
}
