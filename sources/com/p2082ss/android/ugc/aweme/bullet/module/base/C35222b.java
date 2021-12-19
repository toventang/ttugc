package com.p2082ss.android.ugc.aweme.bullet.module.base;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.bullet.business.AbstractC35125b;
import com.p2082ss.android.ugc.aweme.bullet.business.C35123a;
import com.p2082ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.base.b */
public class C35222b extends AbstractC35203a {
    static {
        Covode.recordClassIndex(42384);
    }

    public /* synthetic */ C35222b(C16248b bVar) {
        this(bVar, new C35123a());
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.bullet.module.base.AbstractC35203a
    /* renamed from: a */
    public final void mo62079a(C35226e eVar) {
        C89219l.m154721d(eVar, "");
        OpenURLHintLayout openURLHintLayout = this.f83147h;
        if (openURLHintLayout != null) {
            openURLHintLayout.mo67406a(AwemeService.m70060b().mo60690d(eVar.mo62115f()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r6 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r14 != null) goto L_0x001c;
     */
    @Override // com.p2082ss.android.ugc.aweme.bullet.p2411b.AbstractC34964a, com.bytedance.ies.bullet.p1184ui.common.p1186b.AbstractC17019c
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b mo26898b(android.content.Context r14) {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.module.base.C35222b.mo26898b(android.content.Context):com.bytedance.ies.bullet.c.e.a.b");
    }

    /* renamed from: a */
    private static String m72111a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35222b(C16248b bVar, AbstractC35125b bVar2) {
        super(bVar, bVar2);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
    }
}
