package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57906e;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57935b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.k */
public class C57917k extends AbstractC34586a {

    /* renamed from: a */
    TextView f132020a;

    /* renamed from: b */
    ViewGroup f132021b;

    static {
        Covode.recordClassIndex(67934);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(12363);
        super.onViewCreated(view, bundle);
        this.f132020a = (TextView) view.findViewById(R.id.title);
        this.f132021b = (ViewGroup) view.findViewById(R.id.acf);
        view.findViewById(R.id.pi).setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57917k.View$OnClickListenerC579181 */

            static {
                Covode.recordClassIndex(67935);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C57917k.this.getActivity().onBackPressed();
            }
        });
        final C1213t<C57906e.C57909a> tVar = ((TimeLockOptionViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class)).f132036a;
        this.f132020a.setText(getString(R.string.gda));
        Iterator<C57906e.C57909a> it = C57906e.C57909a.f132003a.iterator();
        while (it.hasNext()) {
            final C57906e.C57909a next = it.next();
            C57935b bVar = new C57935b(getContext());
            boolean z = false;
            bVar.setStartText(getString(R.string.gdv, Integer.valueOf(next.f132004b)));
            bVar.setOnSettingItemClickListener(new C57935b.AbstractC57937a() {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57917k.C579192 */

                static {
                    Covode.recordClassIndex(67936);
                }

                @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57935b.AbstractC57937a
                /* renamed from: a */
                public final boolean mo95238a() {
                    tVar.setValue(next);
                    return false;
                }
            });
            if (tVar.getValue().f132004b == next.f132004b) {
                z = true;
            }
            bVar.setChecked(z);
            bVar.setRippleColor(C0643b.m2378c(getContext(), R.color.j));
            bVar.setRippleDelayClick(true);
            bVar.setRippleOverlay(true);
            bVar.setRippleHover(true);
            ViewGroup viewGroup = this.f132021b;
            viewGroup.addView(bVar, viewGroup.getChildCount());
        }
        MethodCollector.m26664o(12363);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.acc, viewGroup, false);
    }
}
