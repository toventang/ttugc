package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.p468i.C7030b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg */
public final class C7124bg extends AbstractC18334e<C7126b, Object> {

    /* renamed from: a */
    private AbstractC7125a f17746a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg$a */
    public interface AbstractC7125a {
        static {
            Covode.recordClassIndex(7871);
        }

        /* renamed from: a */
        void mo13293a(C7030b bVar);

        /* renamed from: c */
        C7030b mo13299c();
    }

    static {
        Covode.recordClassIndex(7870);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        this.f17746a = null;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bg$b */
    static final class C7126b {
        @AbstractC27891c(mo46611a = "title")

        /* renamed from: a */
        String f17747a;
        @AbstractC27891c(mo46611a = "desc")

        /* renamed from: b */
        String f17748b;
        @AbstractC27891c(mo46611a = "image")

        /* renamed from: c */
        String f17749c;
        @AbstractC27891c(mo46611a = "url")

        /* renamed from: d */
        String f17750d;

        static {
            Covode.recordClassIndex(7872);
        }

        C7126b() {
        }
    }

    public C7124bg(AbstractC7125a aVar) {
        this.f17746a = aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(C7126b bVar, C18338g gVar) {
        C7126b bVar2 = bVar;
        this.f17746a.mo13293a(new C7030b(bVar2.f17747a, bVar2.f17748b, bVar2.f17749c, bVar2.f17750d));
        finishWithSuccess();
    }
}
