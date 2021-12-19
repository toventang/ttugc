package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40128l;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.a.s */
public class C40139s extends AbstractC34586a {

    /* renamed from: a */
    ViewGroup f94241a;

    /* renamed from: b */
    private ButtonTitleBar f94242b;

    static {
        Covode.recordClassIndex(47922);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        MethodCollector.m26663i(3315);
        super.onViewCreated(view, bundle);
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) view.findViewById(R.id.ejf);
        this.f94242b = buttonTitleBar;
        buttonTitleBar.setTitle(R.string.gda);
        this.f94242b.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40139s.C401401 */

            static {
                Covode.recordClassIndex(47923);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                C40139s.this.getActivity().onBackPressed();
            }
        });
        this.f94242b.mo27298a(true);
        this.f94241a = (ViewGroup) view.findViewById(R.id.acf);
        C1213t<C40128l.C40131a> tVar = ((TimeLockOptionViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class)).f94261a;
        Iterator<C40128l.C40131a> it = C40128l.C40131a.f94224a.iterator();
        while (it.hasNext()) {
            C40128l.C40131a next = it.next();
            TuxTextCell tuxTextCell = new TuxTextCell(getContext());
            tuxTextCell.setTitle(getString(R.string.gdv, Integer.valueOf(next.f94225b)));
            tuxTextCell.setTag(Integer.valueOf(next.f94225b));
            tuxTextCell.setWithSeparator(true);
            tuxTextCell.setOnClickListener(new C40141t(tVar, next));
            ViewGroup viewGroup = this.f94241a;
            viewGroup.addView(tuxTextCell, viewGroup.getChildCount());
        }
        Context context = getContext();
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(C34728n.m70946a(20.0d), C34728n.m70946a(20.0d)));
        imageView.setImageDrawable(C0643b.m2369a(context, 2131231825));
        AbstractC23293c.C23302f fVar = new AbstractC23293c.C23302f(context, null);
        fVar.mo37963a(imageView, true);
        fVar.f55228c.findViewById(R.id.icon_iv).setVisibility(8);
        tVar.observe(this, new C40142u(this, fVar));
        MethodCollector.m26664o(3315);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.ug, viewGroup, false);
    }
}
