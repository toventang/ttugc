package com.bytedance.ies.ugc.aweme.commercialize.scene.impl.p1255d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17889b;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17890c;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17898b;
import com.p2082ss.android.ugc.aweme.commercialize.p2539d.EnumC37642b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.scene.impl.d.a */
public final class C17927a implements AbstractC17897a {

    /* renamed from: a */
    public static final C17927a f42736a = new C17927a();

    /* renamed from: b */
    private static AbstractC17898b f42737b;

    /* renamed from: c */
    private static boolean f42738c;

    /* renamed from: d */
    private static final String f42739d = C17927a.class.getSimpleName();

    private C17927a() {
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final boolean mo28511a(Aweme aweme, Context context, int i) {
        AbstractC17898b bVar;
        if (aweme == null || context == null || !aweme.isAd() || (bVar = f42737b) == null) {
            return false;
        }
        return bVar.mo28525a(aweme, context, i);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28510a(Aweme aweme, Context context, boolean z, boolean z2) {
        AbstractC17898b bVar;
        f42738c = false;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28524a(aweme, context, z, z2);
        }
    }

    /* renamed from: a */
    private static boolean m33249a() {
        if (!f42738c) {
            return false;
        }
        f42738c = false;
        return true;
    }

    static {
        Covode.recordClassIndex(20537);
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28502a(Context context) {
        AbstractC17898b bVar = f42737b;
        if (bVar != null) {
            bVar.mo28517a(context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1248b.AbstractC17888a
    /* renamed from: a */
    public final void mo28473a(AbstractC17890c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC17889b bVar = cVar.f42655b;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.scene.api.video.IVideoAdSceneCallback");
        f42737b = (AbstractC17898b) bVar;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: b */
    public final void mo28512b(Aweme aweme, Context context) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28526b(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: c */
    public final void mo28513c(Aweme aweme, Context context) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28530d(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: d */
    public final void mo28514d(Aweme aweme, Context context) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28531e(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: e */
    public final void mo28515e(Aweme aweme, Context context) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28532f(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: f */
    public final void mo28516f(Aweme aweme, Context context) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28533g(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28503a(Aweme aweme, Context context) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28518a(aweme, context);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28506a(Aweme aweme, Context context, EnumC37642b bVar) {
        AbstractC17898b bVar2;
        if (aweme != null && context != null && aweme.isAd() && (bVar2 = f42737b) != null) {
            bVar2.mo28520a(aweme, context, bVar);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28509a(Aweme aweme, Context context, boolean z) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28523a(aweme, context, z);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28504a(Aweme aweme, Context context, int i, int i2) {
        AbstractC17898b bVar;
        AbstractC17898b bVar2;
        if (aweme != null && context != null && aweme.isAd()) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        f42738c = true;
                        AbstractC17898b bVar3 = f42737b;
                        if (bVar3 != null) {
                            bVar3.mo28528c(aweme, context);
                        }
                    }
                } else if (!m33249a() && (bVar2 = f42737b) != null) {
                    bVar2.mo28529c(aweme, context, i2);
                }
            } else if (!m33249a() && (bVar = f42737b) != null) {
                bVar.mo28527b(aweme, context, i2);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28505a(Aweme aweme, Context context, long j, int i) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28519a(aweme, context, j, i);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28508a(Aweme aweme, Context context, String str, long j, int i) {
        AbstractC17898b bVar;
        C89219l.m154721d(str, "");
        if (aweme != null && context != null && aweme.isAd() && (bVar = f42737b) != null) {
            bVar.mo28522a(aweme, context, str, j, i);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.scene.api.p1251d.AbstractC17897a
    /* renamed from: a */
    public final void mo28507a(Aweme aweme, Context context, Aweme aweme2, String str, long j, int i, String str2) {
        AbstractC17898b bVar;
        if (aweme != null && context != null && (bVar = f42737b) != null) {
            bVar.mo28521a(aweme, context, aweme2, str, j, i, str2);
        }
    }
}
