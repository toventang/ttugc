package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.common.utility.C13616g;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d */
public final class C32183d extends C32232n {

    /* renamed from: a */
    public TextView f76818a;

    static {
        Covode.recordClassIndex(38948);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$a */
    static final class CallableC32184a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C32183d f76819a;

        static {
            Covode.recordClassIndex(38949);
        }

        CallableC32184a(C32183d dVar) {
            this.f76819a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f76819a.f76907h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            return C13616g.m24464a(jSONObject, "description", "");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n
    /* renamed from: a */
    public final View mo58188a() {
        MethodCollector.m26663i(9881);
        if (this.f76910k.getLayoutResource() <= 0) {
            this.f76910k.setLayoutResource(R.layout.gw);
        }
        View inflate = this.f76910k.inflate();
        View findViewById = inflate.findViewById(R.id.td);
        C89219l.m154716b(findViewById, "");
        this.f76818a = (TextView) findViewById;
        if (this.f76907h != null) {
            C1731i.m5640b(new CallableC32184a(this), C1731i.f5562a).mo5534a(new C32185b(this), C1731i.f5564c, null);
        }
        MethodCollector.m26664o(9881);
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TextView m66546a(C32183d dVar) {
        TextView textView = dVar.f76818a;
        if (textView == null) {
            C89219l.m154710a("errorText");
        }
        return textView;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$b */
    static final class C32185b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C32183d f76820a;

        static {
            Covode.recordClassIndex(38950);
        }

        C32185b(C32183d dVar) {
            this.f76820a = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<String> iVar) {
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (!TextUtils.isEmpty(iVar.mo5545d())) {
                    C32183d.m66546a(this.f76820a).setText(iVar.mo5545d());
                    return null;
                }
            }
            TextView a = C32183d.m66546a(this.f76820a);
            ActivityC0218d d = this.f76820a.mo58247d();
            if (d == null) {
                C89219l.m154715b();
            }
            a.setText(d.getString(R.string.arc));
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32183d(ActivityC0218d dVar, ViewStub viewStub, C32232n.AbstractC32233a aVar) {
        super(dVar, viewStub, aVar);
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(viewStub, "");
        C89219l.m154721d(aVar, "");
    }
}
