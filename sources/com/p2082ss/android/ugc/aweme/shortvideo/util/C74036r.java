package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.sticker.C75414m;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import p077b.C1743j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.r */
public final /* synthetic */ class C74036r implements AbstractC89171a {

    /* renamed from: a */
    private final Context f166174a;

    /* renamed from: b */
    private final boolean f166175b;

    /* renamed from: c */
    private final String f166176c;

    /* renamed from: d */
    private final Bundle f166177d;

    /* renamed from: e */
    private final C1743j f166178e;

    static {
        Covode.recordClassIndex(86788);
    }

    C74036r(Context context, boolean z, String str, Bundle bundle, C1743j jVar) {
        this.f166174a = context;
        this.f166175b = z;
        this.f166176c = str;
        this.f166177d = bundle;
        this.f166178e = jVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        Context context = this.f166174a;
        boolean z = this.f166175b;
        String str = this.f166176c;
        Bundle bundle = this.f166177d;
        C1743j jVar = this.f166178e;
        ProgressDialogC81146b bVar = null;
        AbstractC46415f a = C46404c.m89554a(context, null);
        if (z) {
            bVar = ProgressDialogC81146b.C81148b.m140903a(context, ProgressDialogC81146b.EnumC81147a.VISIBLE_AFTER_5S, C74023m.f166151a);
            bVar.setMessage(context.getString(R.string.frj));
            bVar.setCancelable(false);
            bVar.setIndeterminate(true);
            bVar.show();
        }
        C75414m.m132242a(a).mo118936a(str, "", new IFetchEffectListener(bVar, bundle, jVar) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740114 */

            /* renamed from: a */
            final /* synthetic */ ProgressDialogC81146b f166110a;

            /* renamed from: b */
            final /* synthetic */ Bundle f166111b;

            /* renamed from: c */
            final /* synthetic */ C1743j f166112c;

            static {
                Covode.recordClassIndex(86761);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                Effect effect2 = effect;
                C85056k.m146253b(this.f166110a);
                this.f166111b.putParcelable("first_sticker", effect2);
                if (effect2.getMusic() != null && !effect2.getMusic().isEmpty()) {
                    String a = C75462e.m132331a(effect2.getMusic().get(0));
                    if (!TextUtils.isEmpty(a)) {
                        this.f166111b.putString("path", a);
                    }
                }
                this.f166112c.mo5555a(this.f166111b);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                ProgressDialogC81146b bVar = this.f166110a;
                if (bVar != null) {
                    bVar.dismiss();
                }
                if (exceptionResult != null) {
                    exceptionResult.getException().printStackTrace();
                    this.f166112c.mo5554a(exceptionResult.getException());
                }
            }

            {
                this.f166110a = r1;
                this.f166111b = r2;
                this.f166112c = r3;
            }
        });
        return C89391z.f203057a;
    }
}
