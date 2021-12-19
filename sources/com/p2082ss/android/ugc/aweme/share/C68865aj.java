package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.AbstractC39091d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.openshare.Share;
import com.p2082ss.android.ugc.aweme.p2231ab.C31363a;
import com.p2082ss.android.ugc.aweme.utils.C80522ha;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.share.aj */
public final class C68865aj {

    /* renamed from: a */
    public Share.Request f154030a;

    /* renamed from: b */
    private Activity f154031b;

    /* renamed from: c */
    private AbstractC39091d f154032c;

    static {
        Covode.recordClassIndex(81166);
    }

    public C68865aj(Activity activity, AbstractC39091d dVar) {
        if (dVar != null && !TextUtils.isEmpty(dVar.mClientKey)) {
            this.f154031b = activity;
            this.f154030a = C80522ha.m139585a(dVar.getShareRequestBundle());
            this.f154032c = dVar;
        }
    }

    /* renamed from: a */
    public final void mo109440a(String str, int i) {
        if (this.f154030a != null) {
            Share.Response response = new Share.Response();
            response.subErrorCode = i;
            response.errorCode = C31363a.m65572a(i);
            response.state = this.f154030a.mState;
            response.errorMsg = str;
            C33744d a = new C33744d().mo59983a("launch_from", this.f154030a.mClientKey);
            String str2 = "";
            if (this.f154030a.extras != null) {
                str2 = this.f154030a.extras.getString("style_id", str2);
            }
            C39162r.m79460a("share_error_status", a.mo59983a("style_id", str2).mo59980a("error_code", i).f79943a);
            mo109441a(this.f154030a, response);
        }
    }

    /* renamed from: a */
    public final boolean mo109441a(Share.Request request, Share.Response response) {
        if (request == null) {
            return false;
        }
        String callerPackage = request.getCallerPackage();
        String str = request.callerLocalEntry;
        if (TextUtils.isEmpty(callerPackage) || response == null || this.f154031b == null || TextUtils.isEmpty(str) || !response.checkArgs() || TextUtils.equals(C17867d.m33078a().getPackageName(), callerPackage)) {
            return false;
        }
        Bundle bundle = new Bundle();
        response.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callerPackage, str));
        intent.putExtras(bundle);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        try {
            Activity activity = this.f154031b;
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
            this.f154031b.finish();
            return true;
        } catch (Exception unused) {
            this.f154031b.finish();
        }
        return false;
    }
}
