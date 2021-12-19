package com.p2082ss.android.ugc.gamora.editor.lightening.p4284d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ugc.aweme.experiment.C46787cd;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.property.C65350at;
import com.p2082ss.android.ugc.aweme.property.C65394cg;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.gamora.editor.C83395y;
import com.p2082ss.android.ugc.gamora.editor.toolbar.C83184g;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.d.a */
public final class C82397a extends C83184g {

    /* renamed from: x */
    private final boolean f184308x = C65350at.m117036a();

    static {
        Covode.recordClassIndex(96233);
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.toolbar.C83184g
    /* renamed from: E */
    public final List<C83395y> mo62771E() {
        Serializable serializable;
        int i;
        int i2;
        ArrayList<String> arrayList;
        Intent intent;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Activity activity = this.f52549m;
        C61288d dVar = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            serializable = null;
        } else {
            serializable = intent.getSerializableExtra("key_mv_theme_data");
        }
        if (serializable instanceof C61288d) {
            dVar = serializable;
        }
        C61288d dVar2 = dVar;
        boolean z = false;
        if (!(dVar2 == null || (arrayList = dVar2.selectMediaList) == null || arrayList.size() <= 1)) {
            z = true;
        }
        int i3 = 2131232574;
        int i4 = 2131232580;
        if (!"slideshow".equals(C71817eu.m126792c(mo128298G())) || !z) {
            if (!this.f184308x) {
                i4 = 2131232579;
            }
            arrayList3.add(new C83395y(3, i4, R.string.hc5));
            if (!this.f184308x) {
                i3 = 2131232573;
            }
            arrayList3.add(new C83395y(4, i3, R.string.g3w));
            if (this.f184308x) {
                i = 2131232548;
            } else {
                i = 2131232547;
            }
            arrayList3.add(new C83395y(2, i, R.string.bkw));
        } else {
            if (!this.f184308x) {
                i4 = 2131232579;
            }
            arrayList3.add(new C83395y(3, i4, R.string.hc5));
            if (!this.f184308x) {
                i3 = 2131232573;
            }
            arrayList3.add(new C83395y(4, i3, R.string.g3w));
            if (!C65394cg.m117094a()) {
                if (this.f184308x) {
                    i2 = 2131232548;
                } else {
                    i2 = 2131232547;
                }
                arrayList3.add(new C83395y(2, i2, R.string.bkw));
            }
        }
        arrayList2.addAll(arrayList3);
        arrayList2.addAll(super.mo62771E());
        return arrayList2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82397a(C21582f fVar) {
        super(fVar);
        C89219l.m154721d(fVar, "");
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        if (!mo128298G().mIsFromDraft || mo128298G().mOrigin != 0 || !C46787cd.m90133a()) {
            mo128299H().setImageResource(2131232189);
        } else {
            mo128299H().setImageResource(2131232420);
        }
    }
}
