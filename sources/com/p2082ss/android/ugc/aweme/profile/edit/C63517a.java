package com.p2082ss.android.ugc.aweme.profile.edit;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.C12290b;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63984ap;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63821a;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80579im;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.a */
public final class C63517a extends C63821a implements C63757a.AbstractC63760a {

    /* renamed from: a */
    public boolean f144161a;

    /* renamed from: f */
    private List<C29934d> f144162f;

    static {
        Covode.recordClassIndex(74828);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a.AbstractC63760a
    /* renamed from: a */
    public final void mo102159a() {
        this.f144161a = true;
        if (this.f144681c != null) {
            ((AbstractC63984ap) this.f144681c).mo90043e();
        }
    }

    /* renamed from: b */
    public final void mo102164b() {
        if (this.f144680b != null && !TextUtils.isEmpty(this.f144683e)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C29934d("source", "0"));
            this.f144162f = arrayList;
            ((C63757a) this.f144680b).mo102316a(this.f144683e, this.f144162f);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a.AbstractC63760a
    /* renamed from: a */
    public final void mo102162a(String str) {
        if (this.f144681c != null) {
            ((AbstractC63984ap) this.f144681c).mo90036a(str);
        }
        this.f144683e = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.C63821a, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        String message2;
        String str;
        if (this.f144681c == null) {
            return;
        }
        if (message.obj instanceof Exception) {
            if (this.f144682d >= 4 || this.f144680b == null) {
                Exception exc = (Exception) message.obj;
                C33743c cVar = new C33743c();
                boolean z = exc instanceof C34485a;
                if (z) {
                    message2 = ((C34485a) exc).getErrorMsg();
                } else {
                    message2 = exc.getMessage();
                }
                C33743c a = cVar.mo59976a("errorDesc", message2);
                if (z) {
                    str = new StringBuilder().append(((C34480a) exc).getErrorCode()).toString();
                } else {
                    str = "-1";
                }
                C12290b.m22060a("aweme_avartar_upload_error_rate", 1, a.mo59976a("errorCode", str).mo59977a());
                ((AbstractC63984ap) this.f144681c).mo90035a((Exception) message.obj);
                if (this.f144680b != null) {
                    this.f144680b.mo102358g();
                    return;
                }
                return;
            }
            this.f144682d++;
            ((C63757a) this.f144680b).mo102314a((this.f144682d << 1) * 1000, this.f144162f);
        } else if (message.obj instanceof AvatarUri) {
            ((AbstractC63984ap) this.f144681c).mo90034a((AvatarUri) message.obj);
            C12290b.m22060a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.C63821a
    /* renamed from: b */
    public final void mo102165b(Activity activity, Fragment fragment) {
        this.f144680b = new C63757a(activity, fragment, new WeakHandler(this), this);
    }

    /* renamed from: a */
    public final void mo102161a(Activity activity, Fragment fragment) {
        this.f144680b = new C63757a(activity, fragment, new WeakHandler(this), this);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a.AbstractC63760a
    /* renamed from: a */
    public final void mo102160a(Activity activity, View view) {
        User curUser = C31575b.m65865g().getCurUser();
        C63873h.f144797a.startHeaderDetailActivity(activity, new C80222ap().mo123647a("extra_zoom_info", ZoomAnimationUtils.m138997a(view)).mo123650a("enable_edit_img", false).mo123650a("enable_download_img", true).mo123651a("uri", TextUtils.isEmpty(this.f144683e) ? C80580in.m139682a(C80579im.m139675a(curUser)) : new String[]{Uri.parse("file://" + this.f144683e).toString()}).mo123648a("share_info", curUser).f179700a);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.C63821a
    /* renamed from: a */
    public final boolean mo102163a(int i, int i2, Intent intent) {
        return super.mo102163a(i, i2, intent);
    }
}
