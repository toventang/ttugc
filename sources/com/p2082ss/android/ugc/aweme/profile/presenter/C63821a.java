package com.p2082ss.android.ugc.aweme.profile.presenter;

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
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.a */
public class C63821a implements WeakHandler.IHandler, C63787p.AbstractC63792a {

    /* renamed from: a */
    private WeakHandler f144679a = new WeakHandler(this);

    /* renamed from: b */
    public C63787p f144680b;

    /* renamed from: c */
    public AbstractC63852p f144681c;

    /* renamed from: d */
    protected int f144682d;

    /* renamed from: e */
    protected String f144683e;

    /* renamed from: f */
    private List<C29934d> f144684f;

    static {
        Covode.recordClassIndex(75245);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p.AbstractC63792a
    /* renamed from: c */
    public final void mo102365c() {
        this.f144682d = 0;
    }

    /* renamed from: d */
    public final void mo103277d() {
        C63787p pVar = this.f144680b;
        if (pVar != null) {
            pVar.mo102358g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p.AbstractC63792a
    /* renamed from: b */
    public final void mo102364b(String str) {
        this.f144683e = str;
        AbstractC63852p pVar = this.f144681c;
        if (pVar != null) {
            pVar.mo90040b(str);
        }
    }

    /* renamed from: a */
    public final void mo103275a(int i) {
        if (i != -1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C29934d("source", String.valueOf(i)));
            m115458a(this.f144683e, arrayList);
            return;
        }
        m115458a(this.f144683e, null);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        String message2;
        String str;
        String str2;
        if (this.f144681c == null) {
            return;
        }
        if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
            Exception exc = (Exception) message.obj;
            if (this.f144680b != null) {
                int i = this.f144682d;
                if (!(exc instanceof C34485a) && !(exc instanceof FileNotFoundException) && !(exc instanceof NullPointerException) && i <= 3) {
                    if (exc.getMessage() != null) {
                        str2 = exc.getMessage();
                    } else {
                        str2 = "";
                    }
                    if (!str2.contains("Content-Length") && (!str2.contains("expected") || !str2.contains("received"))) {
                        int i2 = this.f144682d + 1;
                        this.f144682d = i2;
                        this.f144680b.mo102348a((i2 << 1) * 1000, this.f144683e, this.f144684f);
                        return;
                    }
                }
            }
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
            C12290b.m22060a("aweme_avartar_upload_error_rate", 1, a.mo59976a("errorCode", str).mo59976a("imageUrl", this.f144683e).mo59977a());
            C51423a.m95790a((Throwable) message.obj);
            this.f144681c.mo90039b((Exception) message.obj);
        } else if (message.obj instanceof AvatarUri) {
            this.f144681c.mo90038b((AvatarUri) message.obj);
            C12290b.m22060a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
        }
    }

    /* renamed from: a */
    private void m115458a(String str, List<C29934d> list) {
        this.f144683e = str;
        this.f144684f = list;
        C63787p pVar = this.f144680b;
        if (pVar != null) {
            pVar.mo102352b(str, list);
        }
    }

    /* renamed from: b */
    public void mo102165b(Activity activity, Fragment fragment) {
        this.f144680b = new C63787p(activity, fragment, new WeakHandler(this), this);
    }

    /* renamed from: a */
    public boolean mo102163a(int i, int i2, Intent intent) {
        C63787p pVar = this.f144680b;
        if (pVar == null) {
            return false;
        }
        return pVar.mo102317a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo103276a(Activity activity, View view, User user) {
        String uri;
        C63787p pVar = this.f144680b;
        if (pVar != null) {
            if (TextUtils.isEmpty(this.f144683e)) {
                uri = null;
            } else {
                uri = Uri.parse("file://" + this.f144683e).toString();
            }
            pVar.mo102350a(activity, view, user, uri);
        }
    }
}
