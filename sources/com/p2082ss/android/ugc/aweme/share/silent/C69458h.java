package com.p2082ss.android.ugc.aweme.share.silent;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg;
import com.p2082ss.android.ugc.aweme.share.C68846a;

/* renamed from: com.ss.android.ugc.aweme.share.silent.h */
public final class C69458h implements AbstractC63220bg {
    static {
        Covode.recordClassIndex(81796);
    }

    /* renamed from: a */
    private AbstractC63220bg.AbstractC63221a m122660a(final AbstractC69445b bVar) {
        return new AbstractC63220bg.AbstractC63221a() {
            /* class com.p2082ss.android.ugc.aweme.share.silent.C69458h.C694591 */

            static {
                Covode.recordClassIndex(81797);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: c */
            public final View mo101699c() {
                return bVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: a */
            public final String mo101692a() {
                return bVar.mo109682c();
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: b */
            public final int mo101698b() {
                return bVar.getSaveUploadType();
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: d */
            public final void mo101700d() {
                bVar.setSaveLocalEnabled(false);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: a */
            public final void mo101693a(int i) {
                bVar.mo109675a(i);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: a */
            public final void mo101694a(Fragment fragment) {
                bVar.f155142h = fragment;
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: a */
            public final void mo101695a(AbstractC63220bg.AbstractC63222b bVar) {
                AbstractC69445b bVar2 = bVar;
                bVar.getClass();
                bVar2.mo109678a(new C69460i(bVar));
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: a */
            public final void mo101696a(String str) {
                bVar.setSyncShareViewTitle(str);
            }

            @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg.AbstractC63221a
            /* renamed from: a */
            public final void mo101697a(boolean z) {
                bVar.mo109679a(z);
            }
        };
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg
    /* renamed from: a */
    public final AbstractC63220bg.AbstractC63221a mo101690a(ActivityC0945e eVar) {
        AbstractC69445b jVar;
        if (C68846a.C68847a.m121492a()) {
            jVar = new C69470r(eVar);
        } else {
            jVar = new C69461j(eVar);
        }
        return m122660a(jVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63220bg
    /* renamed from: b */
    public final AbstractC63220bg.AbstractC63221a mo101691b(ActivityC0945e eVar) {
        AbstractC69445b fVar;
        if (C68846a.C68847a.m121492a()) {
            fVar = new C69457g(eVar);
        } else {
            fVar = new C69456f(eVar);
        }
        return m122660a(fVar);
    }
}
