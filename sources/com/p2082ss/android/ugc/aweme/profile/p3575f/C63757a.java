package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.f.a */
public final class C63757a extends C63787p {

    /* renamed from: a */
    protected String f144530a;

    /* renamed from: com.ss.android.ugc.aweme.profile.f.a$a */
    public interface AbstractC63760a extends C63787p.AbstractC63792a {
        static {
            Covode.recordClassIndex(75088);
        }

        /* renamed from: a */
        void mo102159a();

        /* renamed from: a */
        void mo102160a(Activity activity, View view);

        /* renamed from: a */
        void mo102162a(String str);
    }

    static {
        Covode.recordClassIndex(75085);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p
    /* renamed from: a */
    public final boolean mo102317a(int i, int i2, Intent intent) {
        return i == 10004;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3575f.C63787p
    /* renamed from: b */
    public final String mo102318b() {
        return this.f144530a;
    }

    /* renamed from: a */
    public final void mo102313a() {
        new C53484j().mo90076a(this.f144590b, new C53484j.AbstractC53488a() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a.C637581 */

            static {
                Covode.recordClassIndex(75086);
            }

            @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.AbstractC53488a
            /* renamed from: a */
            public final void mo90080a(String str) {
                if (C63757a.this.f144596h != null) {
                    ((AbstractC63760a) C63757a.this.f144596h).mo102162a(str);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo102320c() {
        if (this.f144596h != null) {
            ((AbstractC63760a) this.f144596h).mo102159a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo102321d() {
        if (!mo102357f()) {
            mo102313a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo102319b(View view) {
        if (this.f144596h != null) {
            ((AbstractC63760a) this.f144596h).mo102160a(this.f144590b, view);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.tux.sheet.a.a$e[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo102315a(View view) {
        String str;
        String str2;
        String[] stringArray = this.f144591c.getStringArray(R.array.ag);
        C23208a.C23211b bVar = new C23208a.C23211b();
        C23208a.C23214e[] eVarArr = new C23208a.C23214e[3];
        C23208a.C23214e eVar = new C23208a.C23214e();
        String str3 = "";
        if (stringArray.length > 0) {
            str = stringArray[0];
        } else {
            str = str3;
        }
        eVarArr[0] = eVar.mo37788a(str).mo37786a(new View$OnClickListenerC63772b(this));
        C23208a.C23214e eVar2 = new C23208a.C23214e();
        if (stringArray.length >= 2) {
            str2 = stringArray[1];
        } else {
            str2 = str3;
        }
        eVarArr[1] = eVar2.mo37788a(str2).mo37786a(new View$OnClickListenerC63773c(this));
        C23208a.C23214e eVar3 = new C23208a.C23214e();
        if (stringArray.length >= 3) {
            str3 = stringArray[2];
        }
        eVarArr[2] = eVar3.mo37788a(str3).mo37786a(new View$OnClickListenerC63774d(this, view));
        bVar.mo37797a(eVarArr).mo37800b().show(this.f144592d.getFragmentManager(), "Click Avatar Video");
    }

    /* renamed from: a */
    public final void mo102314a(int i, List<C29934d> list) {
        m115288b(i, this.f144530a, list);
    }

    /* renamed from: a */
    public final void mo102316a(String str, List<C29934d> list) {
        this.f144530a = str;
        m115288b(0, str, list);
    }

    /* renamed from: b */
    private void m115288b(int i, final String str, final List<C29934d> list) {
        C29339a.m58753a(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3575f.C63757a.RunnableC637592 */

            static {
                Covode.recordClassIndex(75087);
            }

            public final void run() {
                C31575b.m65865g().uploadVideoAvatar(C63757a.this.f144595g, Api.f79773f + "?uid=" + C31575b.m65865g().getCurUserId(), 4194304, str, list);
                C31575b.m65865g().getCurUser().setAvatarUpdateReminder(false);
            }
        }, i);
    }

    public C63757a(Activity activity, Fragment fragment, WeakHandler weakHandler, AbstractC63760a aVar) {
        super(activity, fragment, weakHandler, aVar);
    }
}
