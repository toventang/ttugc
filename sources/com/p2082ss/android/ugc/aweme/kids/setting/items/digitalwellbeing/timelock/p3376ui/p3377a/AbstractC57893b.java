package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57807b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.AbstractActivityC57888a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.b */
public abstract class AbstractC57893b extends AbstractC34586a {

    /* renamed from: a */
    protected Button f131974a;

    /* renamed from: b */
    protected Button f131975b;

    /* renamed from: c */
    protected View f131976c;

    static {
        Covode.recordClassIndex(67910);
    }

    /* renamed from: a */
    public final void mo95218a(Fragment fragment) {
        ((AbstractActivityC57888a) getActivity()).mo95214a(fragment);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f131974a = (Button) view.findViewById(R.id.y7);
        View findViewById = view.findViewById(R.id.pi);
        this.f131976c = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57893b.View$OnClickListenerC578941 */

            static {
                Covode.recordClassIndex(67911);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC57893b.this.getActivity().onBackPressed();
            }
        });
        this.f131975b = (Button) view.findViewById(R.id.y6);
        this.f131974a.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57893b.View$OnClickListenerC578952 */

            static {
                Covode.recordClassIndex(67912);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                Fragment a = C57913i.m104700a(2);
                C57807b.m104534a().mo95142a("TimeLockEnterFragmentV2").mo95138a(a).mo95140a(AbstractC57893b.this, new AbstractC34709b<Boolean>() {
                    /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57893b.View$OnClickListenerC578952.C578961 */

                    static {
                        Covode.recordClassIndex(67913);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ void mo61385a() {
                        AbstractC57893b.this.mo95218a(C57913i.m104701a(true));
                    }
                });
                AbstractC57893b.this.mo95218a(a);
            }
        });
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.acb, viewGroup, false);
    }
}
