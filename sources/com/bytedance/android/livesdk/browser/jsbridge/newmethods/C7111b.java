package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b */
public final class C7111b extends AbstractC18334e<C7112a, C7113b> {

    /* renamed from: a */
    private DialogC9148b f17726a;

    static {
        Covode.recordClassIndex(7857);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$a */
    static final class C7112a {
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: a */
        String f17727a;
        @AbstractC27891c(mo46611a = "content")

        /* renamed from: b */
        String f17728b;
        @AbstractC27891c(mo46611a = "confirmText")

        /* renamed from: c */
        String f17729c;
        @AbstractC27891c(mo46611a = "showCancel")

        /* renamed from: d */
        boolean f17730d;
        @AbstractC27891c(mo46611a = "cancelText")

        /* renamed from: e */
        String f17731e;

        static {
            Covode.recordClassIndex(7858);
        }

        C7112a() {
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        DialogC9148b bVar = this.f17726a;
        if (bVar != null) {
            bVar.dismiss();
        }
        this.f17726a = null;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b */
    static final class C7113b {
        @AbstractC27891c(mo46611a = "data")

        /* renamed from: a */
        C7114a f17732a;

        static {
            Covode.recordClassIndex(7859);
        }

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.b$b$a */
        static final class C7114a {
            @AbstractC27891c(mo46611a = "confirm")

            /* renamed from: a */
            boolean f17733a;
            @AbstractC27891c(mo46611a = "cancel")

            /* renamed from: b */
            boolean f17734b;

            static {
                Covode.recordClassIndex(7860);
            }

            C7114a(boolean z) {
                this.f17733a = z;
                this.f17734b = !z;
            }
        }

        private C7113b(boolean z) {
            this.f17732a = new C7114a(z);
        }

        /* synthetic */ C7113b(boolean z, byte b) {
            this(z);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7112a aVar, C18338g gVar) {
        String str;
        String str2;
        C7112a aVar2 = aVar;
        DialogC9148b.C9149a aVar3 = new DialogC9148b.C9149a(gVar.f43859a);
        aVar3.f22245b = aVar2.f17728b;
        if (!TextUtils.isEmpty(aVar2.f17727a)) {
            aVar3.f22244a = aVar2.f17727a;
        }
        if (TextUtils.isEmpty(aVar2.f17729c)) {
            str = C3966y.m9657a((int) R.string.gtk);
        } else {
            str = aVar2.f17729c;
        }
        aVar3.mo15245a((CharSequence) str, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7164c(this), false);
        if (aVar2.f17730d) {
            if (TextUtils.isEmpty(aVar2.f17731e)) {
                str2 = C3966y.m9657a((int) R.string.gi8);
            } else {
                str2 = aVar2.f17731e;
            }
            aVar3.mo15250b((CharSequence) str2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7169d(this), false);
        }
        DialogC9148b a = aVar3.mo15247a();
        this.f17726a = a;
        a.show();
    }
}
