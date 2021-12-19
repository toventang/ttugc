package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.compliance.p3371a.p3372a.p3373a.C57875a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.AbstractActivityC57888a;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.widget.TimeLockDesc;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.NewSettingItem;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.e */
public class C57906e extends AbstractC57889a {

    /* renamed from: e */
    public NewSettingItem f131997e;

    /* renamed from: j */
    private TimeLockDesc f131998j;

    /* renamed from: k */
    private TimeLockDesc f131999k;

    /* renamed from: l */
    private TimeLockDesc f132000l;

    static {
        Covode.recordClassIndex(67923);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57889a
    /* renamed from: c */
    public final void mo95215c() {
        super.mo95215c();
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.ui.a.e$a */
    public static class C57909a {

        /* renamed from: a */
        public static ArrayList<C57909a> f132003a;

        /* renamed from: b */
        public int f132004b;

        static {
            Covode.recordClassIndex(67926);
            ArrayList<C57909a> arrayList = new ArrayList<>();
            f132003a = arrayList;
            arrayList.add(new C57909a(40));
            f132003a.add(new C57909a(60));
            f132003a.add(new C57909a(90));
            f132003a.add(new C57909a(120));
        }

        public C57909a(int i) {
            this.f132004b = i;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.AbstractC57889a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f131998j = (TimeLockDesc) view.findViewById(R.id.ehu);
        this.f131999k = (TimeLockDesc) view.findViewById(R.id.ehv);
        this.f132000l = (TimeLockDesc) view.findViewById(R.id.ehw);
        NewSettingItem newSettingItem = (NewSettingItem) view.findViewById(R.id.brp);
        this.f131997e = newSettingItem;
        newSettingItem.mo95242a();
        this.f131997e.setOnSettingItemClickListener(new AbstractC17281a.AbstractC17283a() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57906e.C579071 */

            static {
                Covode.recordClassIndex(67924);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a.AbstractC17283a
            /* renamed from: a */
            public final void mo27494a() {
                ((AbstractActivityC57888a) C57906e.this.getActivity()).mo95214a(C57875a.m104628a(C57917k.class).mo95175a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f132036a.observe(this, new AbstractC1214u<C57909a>() {
            /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.timelock.p3376ui.p3377a.C57906e.C579082 */

            static {
                Covode.recordClassIndex(67925);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C57909a aVar) {
                C57906e.this.f131997e.setRightTxt(C57906e.this.getString(R.string.gdv, Integer.valueOf(aVar.f132004b)));
            }
        });
        if (timeLockOptionViewModel.f132036a.getValue() == null) {
            timeLockOptionViewModel.f132036a.setValue(new C57909a(60));
        }
        this.f132000l.setText(getString(R.string.fkn));
    }
}
