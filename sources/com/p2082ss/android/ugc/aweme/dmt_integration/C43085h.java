package com.p2082ss.android.ugc.aweme.dmt_integration;

import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17300a;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.p2082ss.android.ugc.tools.p4343e.AbstractC84420f;
import com.p2082ss.android.ugc.tools.view.style.AbstractC84968c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.h */
final /* synthetic */ class C43085h implements AbstractC89172b {

    /* renamed from: a */
    private final AVInitializerImpl f100426a;

    static {
        Covode.recordClassIndex(51238);
    }

    C43085h(AVInitializerImpl aVInitializerImpl) {
        this.f100426a = aVInitializerImpl;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        AVInitializerImpl aVInitializerImpl = this.f100426a;
        AbstractC84420f fVar = (AbstractC84420f) obj;
        fVar.mo129401a(C43089l.f100430a);
        fVar.mo129400a(new AbstractC84968c() {
            /* class com.p2082ss.android.ugc.aweme.dmt_integration.AVInitializerImpl.C430503 */

            static {
                Covode.recordClassIndex(51201);
            }

            @Override // com.p2082ss.android.ugc.tools.view.style.AbstractC84968c
            /* renamed from: a */
            public final Typeface mo73253a(int i) {
                return C17300a.m32029a().mo27609a(i);
            }

            @Override // com.p2082ss.android.ugc.tools.view.style.AbstractC84968c
            /* renamed from: a */
            public final Typeface mo73254a(String str) {
                return C17301b.m32033a().mo27611a(str);
            }
        });
        fVar.mo129402a(C43090m.f100431a);
        return C89391z.f203057a;
    }
}
