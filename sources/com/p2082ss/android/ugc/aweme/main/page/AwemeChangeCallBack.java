package com.p2082ss.android.ugc.aweme.main.page;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack */
public class AwemeChangeCallBack extends AbstractC1174ac {

    /* renamed from: a */
    private C33943c<Aweme> f134514a = new C33943c<>();

    /* renamed from: com.ss.android.ugc.aweme.main.page.AwemeChangeCallBack$a */
    public interface AbstractC59111a {
        static {
            Covode.recordClassIndex(69463);
        }

        /* renamed from: a */
        void mo37101a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(69461);
    }

    /* renamed from: a */
    public static Aweme m108593a(ActivityC0945e eVar) {
        return m108598b(eVar).getValue();
    }

    /* renamed from: b */
    private static C33943c<Aweme> m108598b(ActivityC0945e eVar) {
        return ((AwemeChangeCallBack) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(AwemeChangeCallBack.class)).f134514a;
    }

    /* renamed from: a */
    public static void m108595a(ActivityC0945e eVar, AbstractC1214u<Aweme> uVar) {
        m108598b(eVar).removeObserver(uVar);
    }

    /* renamed from: a */
    public static void m108596a(ActivityC0945e eVar, Aweme aweme) {
        m108598b(eVar).setValue(aweme);
    }

    /* renamed from: b */
    public static AbstractC1214u<Aweme> m108597b(ActivityC0945e eVar, AbstractC1204m mVar, AbstractC59111a aVar) {
        C59112a aVar2 = new C59112a(aVar);
        m108598b(eVar).observe(mVar, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public static void m108594a(ActivityC0945e eVar, AbstractC1204m mVar, final AbstractC59111a aVar) {
        m108598b(eVar).observe(mVar, new AbstractC1214u<Aweme>() {
            /* class com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack.C591101 */

            static {
                Covode.recordClassIndex(69462);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Aweme aweme) {
                Aweme aweme2 = aweme;
                AbstractC59111a aVar = aVar;
                if (aVar != null) {
                    aVar.mo37101a(aweme2);
                }
            }
        });
    }
}
