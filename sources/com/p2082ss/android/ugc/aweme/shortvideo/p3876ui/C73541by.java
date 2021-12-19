package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.AbstractC23219c;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.by */
public final class C73541by extends Fragment implements AbstractC23185a {

    /* renamed from: a */
    public CommonItemView f165221a;

    /* renamed from: b */
    public CommonItemView f165222b;

    /* renamed from: c */
    public CommonItemView f165223c;

    /* renamed from: d */
    private CommentSettingItemStatus f165224d;

    /* renamed from: e */
    private CommonSettingItemStatus f165225e;

    /* renamed from: f */
    private CommonSettingItemStatus f165226f;

    /* renamed from: g */
    private HashMap f165227g;

    static {
        Covode.recordClassIndex(86278);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.by$a */
    public static final class C73542a implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ C73541by f165228a;

        static {
            Covode.recordClassIndex(86279);
        }

        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            C23226a.C23228b.m43789a(this.f165228a, AbstractC23219c.C23223d.f55028a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73542a(C73541by byVar) {
            this.f165228a = byVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f165227g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a b = new TuxNavBar.C23179a().mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37740a((AbstractC23190d) new C73542a(this)));
        C23194g gVar = new C23194g();
        String string = getString(R.string.azn);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = b.mo37731a(gVar.mo37753a(string));
        a.f54919d = true;
        return a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(9397);
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a1h, viewGroup, false);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            this.f165224d = (CommentSettingItemStatus) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(CommentSettingItemStatus.class);
            this.f165225e = (CommonSettingItemStatus) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(DuetSettingItemStatus.class);
            this.f165226f = (CommonSettingItemStatus) C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(StitchSettingItemStatus.class);
        }
        if (this.f165221a == null) {
            View inflate = ((ViewStub) a.findViewById(R.id.a_b)).inflate();
            if (inflate != null) {
                CommonItemView commonItemView = (CommonItemView) inflate;
                this.f165221a = commonItemView;
                CommentSettingItemStatus commentSettingItemStatus = this.f165224d;
                if (commentSettingItemStatus != null) {
                    if (commonItemView == null) {
                        C89219l.m154715b();
                    }
                    commentSettingItemStatus.bindView(commonItemView, this);
                }
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                MethodCollector.m26664o(9397);
                throw nullPointerException;
            }
        }
        if (this.f165222b == null) {
            View inflate2 = ((ViewStub) a.findViewById(R.id.apx)).inflate();
            if (inflate2 != null) {
                CommonItemView commonItemView2 = (CommonItemView) inflate2;
                this.f165222b = commonItemView2;
                CommonSettingItemStatus commonSettingItemStatus = this.f165225e;
                if (commonSettingItemStatus != null) {
                    if (commonItemView2 == null) {
                        C89219l.m154715b();
                    }
                    commonSettingItemStatus.bindView(commonItemView2, this);
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                MethodCollector.m26664o(9397);
                throw nullPointerException2;
            }
        }
        if (this.f165223c == null) {
            View inflate3 = ((ViewStub) a.findViewById(R.id.e9q)).inflate();
            if (inflate3 != null) {
                CommonItemView commonItemView3 = (CommonItemView) inflate3;
                this.f165223c = commonItemView3;
                CommonSettingItemStatus commonSettingItemStatus2 = this.f165226f;
                if (commonSettingItemStatus2 != null) {
                    if (commonItemView3 == null) {
                        C89219l.m154715b();
                    }
                    commonSettingItemStatus2.bindView(commonItemView3, this);
                }
            } else {
                NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.common.views.CommonItemView");
                MethodCollector.m26664o(9397);
                throw nullPointerException3;
            }
        }
        MethodCollector.m26664o(9397);
        return a;
    }
}
