package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.SafeHandler;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.C75462e;
import com.p2082ss.android.ugc.aweme.view.ProgressDialogC81146b;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p077b.C1743j;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.s */
public final /* synthetic */ class C74037s implements AbstractC89171a {

    /* renamed from: a */
    private final Context f166179a;

    /* renamed from: b */
    private final String f166180b;

    /* renamed from: c */
    private final C1743j f166181c;

    /* renamed from: d */
    private final Bundle f166182d;

    static {
        Covode.recordClassIndex(86789);
    }

    C74037s(Context context, String str, C1743j jVar, Bundle bundle) {
        this.f166179a = context;
        this.f166180b = str;
        this.f166181c = jVar;
        this.f166182d = bundle;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        Context context = this.f166179a;
        String str = this.f166180b;
        C1743j jVar = this.f166181c;
        Bundle bundle = this.f166182d;
        boolean[] zArr = {false};
        ProgressDialogC81146b[] bVarArr = {null};
        if (context instanceof AbstractC1204m) {
            zArr[0] = true;
            new SafeHandler((AbstractC1204m) context).postDelayed(new Runnable(zArr, context, bVarArr) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.RunnableC740125 */

                /* renamed from: a */
                final /* synthetic */ boolean[] f166113a;

                /* renamed from: b */
                final /* synthetic */ Context f166114b;

                /* renamed from: c */
                final /* synthetic */ ProgressDialogC81146b[] f166115c;

                static {
                    Covode.recordClassIndex(86762);
                }

                public final void run() {
                    if (this.f166113a[0]) {
                        Context context = this.f166114b;
                        if ((context instanceof Activity) && !((Activity) context).isFinishing()) {
                            this.f166115c[0] = ProgressDialogC81146b.C81148b.m140902a(this.f166114b);
                            this.f166115c[0].setMessage(this.f166114b.getResources().getString(R.string.g1j));
                        }
                    }
                }

                {
                    this.f166113a = r1;
                    this.f166114b = r2;
                    this.f166115c = r3;
                }
            }, 300);
        }
        IAVEffectService effectService = AVExternalServiceImpl.m113114a().abilityService().effectService();
        HashMap hashMap = new HashMap();
        hashMap.put("scene", "");
        effectService.buildEffectPlatform(context, new IAVEffectService.IAVEffectReadyCallback<AbstractC46415f>(str, hashMap, zArr, bVarArr, jVar, bundle) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740136 */

            /* renamed from: a */
            final /* synthetic */ String f166116a;

            /* renamed from: b */
            final /* synthetic */ Map f166117b;

            /* renamed from: c */
            final /* synthetic */ boolean[] f166118c;

            /* renamed from: d */
            final /* synthetic */ ProgressDialogC81146b[] f166119d;

            /* renamed from: e */
            final /* synthetic */ C1743j f166120e;

            /* renamed from: f */
            final /* synthetic */ Bundle f166121f;

            static {
                Covode.recordClassIndex(86763);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
            public final /* synthetic */ void finish(AbstractC46415f fVar) {
                AbstractC46415f fVar2 = fVar;
                if (fVar2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f166116a);
                    fVar2.mo78912a((List<String>) arrayList, this.f166117b, false, (IFetchEffectListListener) new IFetchEffectListListener() {
                        /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740136.C740141 */

                        static {
                            Covode.recordClassIndex(86764);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            C740136.this.f166118c[0] = false;
                            C85056k.m146253b(C740136.this.f166119d[0]);
                            if (exceptionResult != null) {
                                exceptionResult.getException().printStackTrace();
                                C740136.this.f166120e.mo5554a(exceptionResult.getException());
                            }
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<Effect> list) {
                            List<Effect> list2 = list;
                            C740136.this.f166118c[0] = false;
                            C85056k.m146253b(C740136.this.f166119d[0]);
                            if (list2 != null && list2.size() > 0 && list2.get(0) != null) {
                                Effect effect = list2.get(0);
                                C740136.this.f166121f.putParcelable("first_sticker", effect);
                                if (effect.getMusic() != null && !effect.getMusic().isEmpty()) {
                                    String a = C75462e.m132331a(effect.getMusic().get(0));
                                    if (!TextUtils.isEmpty(a)) {
                                        C740136.this.f166121f.putString("path", a);
                                    }
                                }
                                C740136.this.f166120e.mo5555a(C740136.this.f166121f);
                            }
                        }
                    });
                }
            }

            {
                this.f166116a = r1;
                this.f166117b = r2;
                this.f166118c = r3;
                this.f166119d = r4;
                this.f166120e = r5;
                this.f166121f = r6;
            }
        }, null);
        return C89391z.f203057a;
    }
}
