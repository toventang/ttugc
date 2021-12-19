package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.p2270a;

import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2263h.C31940a;
import com.p2082ss.android.ugc.aweme.account.login.p2267ui.C32308a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32407x;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.timer.TimerHolder;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.m */
public final class C32352m extends AbstractC32581c {

    /* renamed from: b */
    public final C31940a.C31941a f77161b;

    /* renamed from: c */
    public final int f77162c;

    /* renamed from: d */
    public final JSONObject f77163d;

    /* renamed from: e */
    public final EnumC32592i f77164e;

    /* renamed from: f */
    public final EnumC32594j f77165f;

    static {
        Covode.recordClassIndex(39120);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32581c
    /* renamed from: a */
    public final boolean mo58399a() {
        C32308a aVar;
        ActivityC0945e activity = this.f77733a.getActivity();
        String a = C31940a.m66306a(this.f77161b);
        C89219l.m154716b(a, "");
        TimerHolder.C32597b a2 = TimerHolder.C32596a.m67088a(activity, a, this.f77164e);
        if (a2 == null || (aVar = a2.f77750a) == null || !aVar.mo58388d()) {
            AbstractC32572b bVar = this.f77733a;
            String a3 = C31940a.m66306a(this.f77161b);
            C89219l.m154716b(a3, "");
            C32407x.m66795a(bVar, a3, this.f77164e, this.f77165f, "", "auto_system", (String) null, 192).mo143251d(new C32353a(this)).mo143246c();
            return true;
        }
        AbstractC32572b bVar2 = this.f77733a;
        Bundle arguments = this.f77733a.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", EnumC32594j.PHONE_SMS_LOGIN.getValue());
        arguments.putBoolean("code_sent", false);
        arguments.putBoolean("bind_secure", true);
        C89219l.m154716b(arguments, "");
        bVar2.mo58461a(arguments);
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.a.m$a */
    static final class C32353a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C32352m f77166a;

        static {
            Covode.recordClassIndex(39121);
        }

        C32353a(C32352m mVar) {
            this.f77166a = mVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC32572b bVar = this.f77166a.f77733a;
            Bundle arguments = this.f77166a.f77733a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", EnumC32594j.PHONE_SMS_LOGIN.getValue());
            arguments.putBoolean("code_sent", true);
            arguments.putBoolean("bind_secure", true);
            C89219l.m154716b(arguments, "");
            bVar.mo58461a(arguments);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32352m(AbstractC32572b bVar, C31940a.C31941a aVar, int i, JSONObject jSONObject, EnumC32592i iVar, EnumC32594j jVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(jVar, "");
        this.f77161b = aVar;
        this.f77162c = i;
        this.f77163d = jSONObject;
        this.f77164e = iVar;
        this.f77165f = jVar;
    }
}
