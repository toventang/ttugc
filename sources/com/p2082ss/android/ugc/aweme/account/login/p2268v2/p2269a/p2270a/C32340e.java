package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.e */
public final class C32340e extends AbstractC32581c {

    /* renamed from: b */
    public final JSONObject f77136b;

    static {
        Covode.recordClassIndex(39108);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        C32308a aVar;
        JSONObject jSONObject = this.f77136b;
        if (jSONObject != null) {
            String string = jSONObject.getString("email");
            String string2 = this.f77136b.getString("password");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                ActivityC0945e activity = this.f77733a.getActivity();
                C89219l.m154716b(string, "");
                TimerHolder.C32597b a = TimerHolder.C32596a.m67088a(activity, string, EnumC32592i.SIGN_UP);
                if (a == null || (aVar = a.f77750a) == null || !aVar.mo58388d()) {
                    C32407x.m66788a(this.f77733a, string, 1, "auto_system", (Map) null, string2, 64).mo143251d(new C32341a(this, string2)).mo143246c();
                } else {
                    AbstractC32572b bVar = this.f77733a;
                    Bundle arguments = this.f77733a.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    arguments.putBoolean("code_sent", false);
                    arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_SIGN_UP.getValue());
                    arguments.putString("password", string2);
                    C89219l.m154716b(arguments, "");
                    bVar.mo58461a(arguments);
                    return true;
                }
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.e$a */
    static final class C32341a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32340e f77137a;

        /* renamed from: b */
        final /* synthetic */ String f77138b;

        static {
            Covode.recordClassIndex(39109);
        }

        C32341a(C32340e eVar, String str) {
            this.f77137a = eVar;
            this.f77138b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC32572b bVar = this.f77137a.f77733a;
            Bundle arguments = this.f77137a.f77733a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putBoolean("code_sent", true);
            arguments.putInt("next_page", EnumC32594j.EMAIL_SMS_SIGN_UP.getValue());
            arguments.putString("password", this.f77138b);
            C89219l.m154716b(arguments, "");
            bVar.mo58461a(arguments);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32340e(AbstractC32572b bVar, JSONObject jSONObject) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        this.f77136b = jSONObject;
    }
}
