package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57807b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.p3375a.C57879a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.AbstractActivityC57888a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.a */
public abstract class AbstractC57889a extends AbstractC34586a implements AbstractC57877a {

    /* renamed from: a */
    protected Button f131966a;

    /* renamed from: b */
    protected View f131967b;

    /* renamed from: c */
    protected TextView f131968c;

    /* renamed from: d */
    protected C57879a f131969d;

    /* renamed from: e */
    private TuxStatusView f131970e;

    static {
        Covode.recordClassIndex(67906);
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: a */
    public final void mo95178a() {
        m104669d();
    }

    /* renamed from: d */
    private void m104669d() {
        TuxStatusView tuxStatusView = this.f131970e;
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.api.p3374a.AbstractC57877a
    /* renamed from: b */
    public final void mo95179b() {
        m104669d();
        C57878a.m104636a(getActivity(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo95215c() {
        Fragment a;
        if (!C57878a.m104640c()) {
            a = C57913i.m104701a(false);
        } else {
            a = C57913i.m104700a(0);
            C57807b.m104534a().mo95142a("TimeLockEnterFragmentV2").mo95138a(a).mo95140a(this, new AbstractC34709b() {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57889a.C578923 */

                static {
                    Covode.recordClassIndex(67909);
                }

                @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                /* renamed from: a */
                public final void mo61385a() {
                    C57878a.m104636a(AbstractC57889a.this.getActivity(), false);
                }
            });
        }
        ((AbstractActivityC57888a) getActivity()).mo95214a(a);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f131966a = (Button) view.findViewById(R.id.y7);
        this.f131968c = (TextView) view.findViewById(R.id.eht);
        View findViewById = view.findViewById(R.id.pi);
        this.f131967b = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57889a.View$OnClickListenerC578901 */

            static {
                Covode.recordClassIndex(67907);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC57889a.this.getActivity().onBackPressed();
            }
        });
        this.f131966a.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57889a.View$OnClickListenerC578912 */

            static {
                Covode.recordClassIndex(67908);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC57889a.this.mo95215c();
            }
        });
        this.f131970e = (TuxStatusView) view.findViewById(R.id.e7i);
        C57879a aVar = new C57879a();
        this.f131969d = aVar;
        aVar.mo95197a(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.aca, viewGroup, false);
    }
}
