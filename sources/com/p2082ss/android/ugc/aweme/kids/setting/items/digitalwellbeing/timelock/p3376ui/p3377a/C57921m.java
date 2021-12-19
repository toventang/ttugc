package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.p2368b.p2369a.C34507d;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57806a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.AbstractC57886a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.C57887b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.TimeLockRuler;
import com.p2082ss.android.ugc.aweme.kids.setting.p3367a.C57802a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.m */
public class C57921m extends AbstractC57910f {

    /* renamed from: d */
    TextView f132026d;

    /* renamed from: e */
    TuxTextView f132027e;

    /* renamed from: j */
    private String f132028j;

    static {
        Covode.recordClassIndex(67938);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57910f, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: b */
    public final void mo95179b() {
        super.mo95179b();
        mo95235d();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57910f
    /* renamed from: d */
    public final void mo95235d() {
        if (getActivity() != null) {
            getActivity().finish();
        }
        mo95221a(this.f131980a);
        C57806a<Boolean> a = C57887b.m104654a();
        if (a != null) {
            Boolean.valueOf(true);
            a.mo95139a();
        } else if (!TextUtils.equals(this.f132028j, "logout") && !TextUtils.equals(this.f132028j, "add_account") && !TextUtils.equals(this.f132028j, "switch_account")) {
            new C79459a(C17867d.m33078a()).mo123052a(getResources().getString(R.string.ge9)).mo123053a();
            ((AbstractC57886a) C34507d.m70492a(C17867d.m33078a(), AbstractC57886a.class)).mo60951a(System.currentTimeMillis());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    /* renamed from: b */
    public final void mo95222b(String str) {
        mo95234c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57910f, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57897c
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        super.onViewCreated(view, bundle);
        C57806a<Boolean> a = C57887b.m104654a();
        if (a != null) {
            TimeLockRuler.isContentFilterOn();
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("from");
        } else {
            str = "";
        }
        this.f132028j = str;
        this.f132026d = (TextView) view.findViewById(R.id.f82);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.f8o);
        this.f132027e = tuxTextView;
        tuxTextView.mo37697a(26.0f);
        if (a != null) {
            boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
            TextView textView = this.f132026d;
            if (!isContentFilterOn) {
                i = R.string.geb;
            } else if (TextUtils.equals(this.f132028j, "add_account")) {
                i = R.string.ot;
            } else if (TextUtils.equals(this.f132028j, "switch_account")) {
                i = R.string.g92;
            } else if (!C57802a.m104518b()) {
                i = R.string.fl0;
            } else {
                i = R.string.gea;
            }
            textView.setText(getString(i));
            TuxTextView tuxTextView2 = this.f132027e;
            if (isContentFilterOn) {
                i2 = R.string.gee;
            } else {
                i2 = R.string.gef;
            }
            tuxTextView2.setText(getString(i2));
            ImageView imageView = (ImageView) view.findViewById(R.id.ei3);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57921m.View$OnClickListenerC579221 */

                static {
                    Covode.recordClassIndex(67939);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (C57921m.this.f131980a != null) {
                        C57921m mVar = C57921m.this;
                        mVar.mo95221a(mVar.f131980a);
                    }
                    if (C57921m.this.getActivity() != null) {
                        C57921m.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        this.f132026d.setText(getString(R.string.gec, String.valueOf(TimeLockRuler.getLockTimeInMin())));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ac7, viewGroup, false);
    }
}
