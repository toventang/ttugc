package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.view.View;
import android.view.ViewStub;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.n */
public class C32232n {

    /* renamed from: a */
    private final WeakReference<ActivityC0218d> f76906a;

    /* renamed from: h */
    public JSONObject f76907h;

    /* renamed from: i */
    public String f76908i;

    /* renamed from: j */
    public String f76909j = "";

    /* renamed from: k */
    public final ViewStub f76910k;

    /* renamed from: l */
    public AbstractC32233a f76911l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.n$a */
    public interface AbstractC32233a {
        static {
            Covode.recordClassIndex(38998);
        }

        /* renamed from: a */
        void mo58070a(String str);
    }

    static {
        Covode.recordClassIndex(38997);
    }

    /* renamed from: a */
    public View mo58188a() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final ActivityC0218d mo58247d() {
        return this.f76906a.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo58248d(String str) {
        C89219l.m154721d(str, "");
        this.f76909j = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo58249e(String str) {
        AbstractC32233a aVar = this.f76911l;
        if (aVar != null) {
            aVar.mo58070a(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo58246b(Integer num, String str) {
        String str2;
        ActivityC0218d dVar = this.f76906a.get();
        if (dVar == null || (str2 = dVar.getString(R.string.bos)) == null) {
            str2 = "Sorry, error occurred";
        }
        C89219l.m154716b(str2, "");
        if (str == null || num == null) {
            return str2;
        }
        num.intValue();
        if (num.intValue() == 1066) {
            return str2;
        }
        return str;
    }

    public C32232n(ActivityC0218d dVar, ViewStub viewStub, AbstractC32233a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewStub, "");
        this.f76910k = viewStub;
        this.f76911l = aVar;
        this.f76906a = new WeakReference<>(dVar);
    }
}
