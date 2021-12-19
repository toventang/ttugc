package com.p2082ss.android.ugc.aweme.setting.page.datasave;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.setting.C68124l;
import com.p2082ss.android.ugc.aweme.setting.api.DataSaverApi;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.a */
public final class View$OnClickListenerC68264a extends C40945h implements View.OnClickListener {

    /* renamed from: a */
    private final String f152816a;

    /* renamed from: b */
    private final String f152817b;

    /* renamed from: c */
    private final Context f152818c;

    static {
        Covode.recordClassIndex(80473);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34800h mo70128b() {
        return mo70128b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h
    /* renamed from: a */
    public final C34800h mo70133a() {
        return new C34800h(C68124l.m120410a(), this.f152816a, this, false, null, null, null, null, this.f152817b, false, 15352);
    }

    /* renamed from: c */
    public final void mo108759c() {
        mo70138g();
        new C79459a(this.f152818c).mo123050a(R.string.bos).mo123053a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.datasave.a$a */
    static final class C68265a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68264a f152819a;

        /* renamed from: b */
        final /* synthetic */ int f152820b;

        /* renamed from: c */
        final /* synthetic */ boolean f152821c;

        static {
            Covode.recordClassIndex(80474);
        }

        C68265a(View$OnClickListenerC68264a aVar, int i, boolean z) {
            this.f152819a = aVar;
            this.f152820b = i;
            this.f152821c = z;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<BaseResponse> iVar) {
            String str;
            C89219l.m154716b(iVar, "");
            if (iVar.mo5539b() || iVar.mo5544c()) {
                this.f152819a.mo108759c();
                return null;
            } else if (!iVar.mo5535a()) {
                return null;
            } else {
                if (C68124l.m120411a(this.f152820b)) {
                    if (this.f152821c) {
                        str = "data_saver_on";
                    } else {
                        str = "data_saver_off";
                    }
                    C39162r.onEventV3(str);
                    return null;
                }
                this.f152819a.mo108759c();
                return null;
            }
        }
    }

    public View$OnClickListenerC68264a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        String string = fragment.getString(R.string.b41);
        C89219l.m154716b(string, "");
        this.f152816a = string;
        String string2 = fragment.getString(R.string.b40);
        C89219l.m154716b(string2, "");
        this.f152817b = string2;
        this.f152818c = fragment.getContext();
    }

    public final void onClick(View view) {
        int i;
        ClickAgent.onClick(view);
        mo70138g();
        boolean z = ((C34800h) mo70132l()).f82200c;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C68265a aVar = new C68265a(this, i, z);
        C89219l.m154721d(aVar, "");
        DataSaverApi.C67989a.f152321a.setDataSaverSetting(i).mo5534a(aVar, C1731i.f5564c, null);
    }
}
