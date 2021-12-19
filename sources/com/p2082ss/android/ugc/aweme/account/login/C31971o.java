package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.o */
public final class C31971o extends AbstractC34586a {

    /* renamed from: a */
    C31943j f76355a;

    /* renamed from: b */
    private HashMap f76356b;

    static {
        Covode.recordClassIndex(38725);
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onDestroyView() {
        C31943j jVar = this.f76355a;
        if (jVar != null) {
            Dialog dialog = jVar.f76292c;
            if (dialog != null) {
                dialog.dismiss();
            }
            Dialog dialog2 = jVar.f76293d;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            Dialog dialog3 = jVar.f76294e;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
        super.onDestroyView();
        HashMap hashMap = this.f76356b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ActivityC0945e activity = getActivity();
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.I18nSignUpActivity");
            this.f76355a = new C31943j((I18nSignUpActivity) activity, view, arguments.getBoolean("view_type"), arguments.getBoolean("is_from_new_user_journey", false), arguments.getBoolean("age_gate_block", false), arguments.getBoolean("is_fullscreen", false), arguments.getBoolean("is_expandable_dialog", false));
            if (arguments.getBoolean("show_learn_feed_toast")) {
                new C79459a(getActivity()).mo123050a(R.string.cub).mo123053a();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.gg, viewGroup, false);
    }
}
