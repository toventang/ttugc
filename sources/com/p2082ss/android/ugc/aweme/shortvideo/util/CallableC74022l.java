package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.ProviderEffect;
import com.p2082ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1743j;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.l */
public final /* synthetic */ class CallableC74022l implements Callable {

    /* renamed from: a */
    private final Context f166145a;

    /* renamed from: b */
    private final String f166146b;

    /* renamed from: c */
    private final ProgressDialogC84958b f166147c;

    /* renamed from: d */
    private final boolean f166148d = false;

    /* renamed from: e */
    private final C1743j f166149e;

    /* renamed from: f */
    private final ArrayList f166150f;

    static {
        Covode.recordClassIndex(86772);
    }

    CallableC74022l(Context context, String str, ProgressDialogC84958b bVar, C1743j jVar, ArrayList arrayList) {
        this.f166145a = context;
        this.f166146b = str;
        this.f166147c = bVar;
        this.f166149e = jVar;
        this.f166150f = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Context context = this.f166145a;
        C46404c.m89554a(context, null).mo78901a(this.f166146b, "gifs", (Map<String, String>) null, true, (AbstractC86794c) new AbstractC86794c(this.f166147c, this.f166148d, this.f166149e, this.f166150f) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.util.C74007f.C740168 */

            /* renamed from: a */
            final /* synthetic */ ProgressDialogC84958b f166129a;

            /* renamed from: b */
            final /* synthetic */ boolean f166130b;

            /* renamed from: c */
            final /* synthetic */ C1743j f166131c;

            /* renamed from: d */
            final /* synthetic */ ArrayList f166132d;

            static {
                Covode.recordClassIndex(86766);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
            public final /* bridge */ /* synthetic */ void onSuccess(GifProviderEffectListResponse gifProviderEffectListResponse) {
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c
            /* renamed from: a */
            public final void mo116409a(C86840e eVar) {
                this.f166129a.dismiss();
                if (this.f166130b) {
                    this.f166131c.mo5554a(eVar.f195758c);
                } else {
                    this.f166131c.mo5555a(new Bundle());
                }
            }

            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86794c
            /* renamed from: a */
            public final void mo116410a(List<? extends ProviderEffect> list) {
                this.f166129a.dismiss();
                Bundle bundle = new Bundle();
                for (ProviderEffect providerEffect : list) {
                    this.f166132d.add(new GreenScreenMaterial(3, 0, 0, providerEffect.getId(), providerEffect.getUser_name(), "", providerEffect.getPath(), "prop_reuse"));
                }
                bundle.putParcelableArrayList("green_screen_material_list", this.f166132d);
                this.f166131c.mo5555a(bundle);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
            @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
            public final /* synthetic */ void onFail(GifProviderEffectListResponse gifProviderEffectListResponse, C86840e eVar) {
                this.f166129a.dismiss();
                if (this.f166130b) {
                    this.f166131c.mo5554a(eVar.f195758c);
                } else {
                    this.f166131c.mo5555a(new Bundle());
                }
            }

            {
                this.f166129a = r1;
                this.f166130b = r2;
                this.f166131c = r3;
                this.f166132d = r4;
            }
        });
        return null;
    }
}
