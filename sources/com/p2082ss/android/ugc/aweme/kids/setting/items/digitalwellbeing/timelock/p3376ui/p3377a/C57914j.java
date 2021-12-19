package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b;
import com.p2082ss.android.ugc.aweme.kids.setting.base.session.C57807b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.C57878a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity.TeenageModeSetting;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.C57887b;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.AbstractActivityC57888a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.widget.TimeLockDesc;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.j */
public class C57914j extends AbstractC57893b {

    /* renamed from: d */
    private TimeLockDesc f132014d;

    /* renamed from: e */
    private TimeLockDesc f132015e;

    /* renamed from: j */
    private TimeLockDesc f132016j;

    /* renamed from: k */
    private int f132017k;

    static {
        Covode.recordClassIndex(67931);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57893b
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f132014d = (TimeLockDesc) view.findViewById(R.id.ehy);
        this.f132015e = (TimeLockDesc) view.findViewById(R.id.ehz);
        this.f132016j = (TimeLockDesc) view.findViewById(R.id.ehx);
        int b = C57878a.m104639b();
        this.f132017k = b;
        this.f132014d.setText(getString(R.string.gdc, Integer.valueOf(b)));
        this.f132015e.setText(getString(R.string.brg));
        this.f131975b.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57914j.View$OnClickListenerC579151 */

            static {
                Covode.recordClassIndex(67932);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C57914j jVar = C57914j.this;
                Fragment a = C57913i.m104700a(1);
                C57807b.m104534a().mo95142a("TimeLockEnterFragmentV2").mo95138a(a).mo95140a(jVar, new AbstractC34709b() {
                    /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57914j.C579162 */

                    static {
                        Covode.recordClassIndex(67933);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.session.AbstractC34709b
                    /* renamed from: a */
                    public final void mo61385a() {
                        String str;
                        Resources resources;
                        ActivityC0945e activity = C57914j.this.getActivity();
                        TeenageModeSetting teenageModeSetting = C57878a.f131951a;
                        if (teenageModeSetting != null) {
                            teenageModeSetting.setTimeLockSelfInMin(0);
                        }
                        C79459a aVar = new C79459a(C17867d.m33078a());
                        if (activity == null || (resources = activity.getResources()) == null) {
                            str = null;
                        } else {
                            str = resources.getString(R.string.gdp);
                        }
                        aVar.mo123052a(str).mo123053a();
                        if (activity != null) {
                            C57887b.m104656a(activity);
                            ((AbstractActivityC57888a) activity).mo95214a(C57913i.m104699a());
                        }
                        C57878a.m104637a(C57878a.f131951a);
                    }
                });
                jVar.mo95218a(a);
            }
        });
    }
}
