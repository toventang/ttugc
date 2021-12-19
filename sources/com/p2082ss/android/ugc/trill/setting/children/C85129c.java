package com.p2082ss.android.ugc.trill.setting.children;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.setting.children.c */
public final class C85129c extends AbstractC34586a {

    /* renamed from: a */
    View f190478a;

    /* renamed from: b */
    TextView f190479b;

    /* renamed from: c */
    CommonItemView f190480c;

    /* renamed from: d */
    public AbstractC85130a f190481d;

    /* renamed from: com.ss.android.ugc.trill.setting.children.c$a */
    public interface AbstractC85130a {
        static {
            Covode.recordClassIndex(99170);
        }

        /* renamed from: a */
        void mo130064a(Bundle bundle);
    }

    static {
        Covode.recordClassIndex(99169);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        this.f190478a = view.findViewById(R.id.ejf);
        this.f190479b = (TextView) view.findViewById(R.id.title);
        this.f190480c = (CommonItemView) view.findViewById(R.id.a3q);
        View findViewById = view.findViewById(R.id.a3q);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC85131d(this));
        }
        View findViewById2 = view.findViewById(R.id.pi);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC85132e(this));
        }
        super.onViewCreated(view, bundle);
        this.f190479b.setText(R.string.fo4);
        this.f190478a.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
        this.f190480c.setLeftText(C53438a.m98624b(getContext()));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a0q, viewGroup, false);
    }
}
