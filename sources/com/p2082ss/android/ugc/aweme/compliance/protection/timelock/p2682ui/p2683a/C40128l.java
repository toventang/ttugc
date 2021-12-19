package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a;
import com.bytedance.ies.dmt.p1194ui.widget.setting.SettingItem;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.common.p2664e.p2665a.C39628a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l */
public class C40128l extends AbstractC40108a {

    /* renamed from: a */
    public SettingItem f94218a;

    /* renamed from: b */
    private TuxTextCell f94219b;

    /* renamed from: k */
    private TuxTextCell f94220k;

    /* renamed from: l */
    private TuxTextCell f94221l;

    static {
        Covode.recordClassIndex(47911);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a
    /* renamed from: c */
    public final int mo69239c() {
        return R.layout.ue;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a
    /* renamed from: d */
    public final void mo69240d() {
        C39162r.m79460a("open_time_lock", new C33744d().f79943a);
        super.mo69240d();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.l$a */
    public static class C40131a {

        /* renamed from: a */
        public static ArrayList<C40131a> f94224a;

        /* renamed from: b */
        public int f94225b;

        static {
            Covode.recordClassIndex(47914);
            ArrayList<C40131a> arrayList = new ArrayList<>();
            f94224a = arrayList;
            arrayList.add(new C40131a(40));
            f94224a.add(new C40131a(60));
            f94224a.add(new C40131a(90));
            f94224a.add(new C40131a(120));
        }

        public C40131a(int i) {
            this.f94225b = i;
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.AbstractC40108a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f94219b = (TuxTextCell) view.findViewById(R.id.ehu);
        this.f94220k = (TuxTextCell) view.findViewById(R.id.ehv);
        this.f94221l = (TuxTextCell) view.findViewById(R.id.ehw);
        SettingItem settingItem = (SettingItem) view.findViewById(R.id.brp);
        this.f94218a = settingItem;
        settingItem.setOnSettingItemClickListener(new AbstractC17281a.AbstractC17283a() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40128l.C401291 */

            static {
                Covode.recordClassIndex(47912);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.setting.AbstractC17281a.AbstractC17283a
            /* renamed from: a */
            public final void mo27494a() {
                ((AbstractActivityC40107a) C40128l.this.getActivity()).mo69256a(C39628a.m80469a(C40139s.class).mo69040a());
            }
        });
        TimeLockOptionViewModel timeLockOptionViewModel = (TimeLockOptionViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class);
        timeLockOptionViewModel.f94261a.observe(this, new AbstractC1214u<C40131a>() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40128l.C401302 */

            static {
                Covode.recordClassIndex(47913);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(C40131a aVar) {
                C40128l.this.f94218a.setRightTxt(C40128l.this.getString(R.string.gdv, Integer.valueOf(aVar.f94225b)));
            }
        });
        if (timeLockOptionViewModel.f94261a.getValue() == null) {
            timeLockOptionViewModel.f94261a.setValue(new C40131a(60));
        }
        this.f94221l.setTitle(getString(R.string.fkn));
        if (mo69259h()) {
            String str = mo69258g().getValue().f94263b.f94266c;
            if (!TextUtils.isEmpty(str)) {
                this.f94185c.setText(getString(R.string.brf, str));
            } else {
                this.f94185c.setText(getString(R.string.dmr));
            }
            this.f94219b.setTitle(getString(R.string.dms));
            this.f94220k.setTitle(getString(R.string.brg));
            this.f94221l.setTitle(getString(R.string.brh));
        }
    }
}
