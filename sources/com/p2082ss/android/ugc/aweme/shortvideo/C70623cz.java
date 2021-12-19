package com.p2082ss.android.ugc.aweme.shortvideo;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73353a;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import com.p2082ss.android.ugc.aweme.utils.C80571if;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cz */
public final class C70623cz {

    /* renamed from: a */
    RecordLayout.AbstractC74257a f158054a;

    /* renamed from: b */
    public final C80571if f158055b = new C80571if();

    static {
        Covode.recordClassIndex(83089);
    }

    public C70623cz(final ActivityC0945e eVar, final AbstractC14177d dVar, final AbstractC14193m mVar, final RecordLayout recordLayout, final View.OnClickListener onClickListener) {
        C706241 r0 = new RecordLayout.AbstractC74257a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.C70623cz.C706241 */

            static {
                Covode.recordClassIndex(83090);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: a */
            public final void mo111425a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: b */
            public final boolean mo111428b() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: e */
            public final void mo111431e() {
                onClickListener.onClick(recordLayout);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: g */
            public final boolean mo111433g() {
                return C73353a.m129491a(dVar);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: d */
            public final void mo111430d() {
                mVar.mo22889b(new C14207x("record end"));
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: f */
            public final void mo111432f() {
                recordLayout.setCurrentScaleMode(0);
                dVar.mo22771Y();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: c */
            public final void mo111429c() {
                if (C80510gr.f180106a) {
                    C80510gr.f180106a = false;
                    C80510gr.m139527a("record_start");
                }
                mVar.mo22872a(0);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: h */
            public final void mo111434h() {
                C70623cz.this.f158055b.mo123790a("click_record", System.currentTimeMillis() - recordLayout.getActionDownTime());
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: a */
            public final void mo111426a(float f) {
                recordLayout.setHasBeenMoveScaled(true);
                dVar.mo22805b(f, recordLayout.getY());
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
            /* renamed from: a */
            public final void mo111427a(int i) {
                if (!((ShortVideoContextViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class)).mo110049a()) {
                    mVar.mo22876a(new C14196o(i));
                }
            }
        };
        this.f158054a = r0;
        recordLayout.setRecordListener(r0);
    }
}
