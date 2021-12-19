package com.p2082ss.android.ugc.aweme.setting.serverpush.p3731ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage */
public final class PushSettingManagerPage extends AbstractC68195a {

    /* renamed from: e */
    public static final C68377a f153027e = new C68377a((byte) 0);

    /* renamed from: f */
    private SparseArray f153028f;

    static {
        Covode.recordClassIndex(80605);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f153028f == null) {
            this.f153028f = new SparseArray();
        }
        View view = (View) this.f153028f.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f153028f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void bx_() {
        SparseArray sparseArray = this.f153028f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    /* renamed from: c */
    public final int mo64296c() {
        return R.layout.axe;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerPage$a */
    public static final class C68377a {
        static {
            Covode.recordClassIndex(80606);
        }

        private C68377a() {
        }

        public /* synthetic */ C68377a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static String m120656a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Intent intent;
        Fragment aVar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            Fragment a = fragmentManager.mo3551a("FRAGMENT_PUSH_MANAGER_LIST");
            if (a == null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!g.isLogin()) {
                    aVar = new C68395m();
                    aVar.setArguments(new Bundle());
                } else if (Build.VERSION.SDK_INT < 26 || !C16048b.m29633a().mo25421a(false, "enable_notification_category", false)) {
                    aVar = new C68378a();
                    aVar.setArguments(new Bundle());
                } else {
                    aVar = new C68386g();
                    aVar.setArguments(new Bundle());
                }
                a = aVar;
            }
            Bundle bundle2 = new Bundle();
            ActivityC0945e activity = getActivity();
            if (activity == null || (intent = activity.getIntent()) == null) {
                str = null;
            } else {
                str = m120656a(intent, "enter_from");
            }
            bundle2.putString("enter_from", str);
            if (a != null) {
                a.setArguments(bundle2);
                AbstractC0976n a2 = fragmentManager.mo3552a();
                C89219l.m154716b(a2, "");
                a2.mo3470b(R.id.b82, a, "FRAGMENT_PUSH_MANAGER_LIST").mo3473c();
            }
        }
    }
}
