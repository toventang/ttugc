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
import com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bk */
public final class C69887bk {

    /* renamed from: a */
    LighteningRecordLayout.AbstractC74254c f156159a;

    /* renamed from: b */
    public AbstractC69889a f156160b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.bk$a */
    public interface AbstractC69889a {
        static {
            Covode.recordClassIndex(82298);
        }

        /* renamed from: a */
        void mo110234a();

        /* renamed from: b */
        void mo110235b();
    }

    static {
        Covode.recordClassIndex(82296);
    }

    public C69887bk(final ActivityC0945e eVar, final AbstractC14177d dVar, final AbstractC14193m mVar, final LighteningRecordLayout lighteningRecordLayout, final ShortVideoContext shortVideoContext, final View.OnClickListener onClickListener) {
        C698881 r0 = new LighteningRecordLayout.AbstractC74254c() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.C69887bk.C698881 */

            static {
                Covode.recordClassIndex(82297);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final boolean mo110229a() {
                return false;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: c */
            public final void mo110231c() {
                onClickListener.onClick(lighteningRecordLayout);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: e */
            public final boolean mo110233e() {
                return C73353a.m129491a(dVar);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: d */
            public final void mo110232d() {
                lighteningRecordLayout.setCurrentScaleMode(0);
                dVar.mo22771Y();
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: b */
            public final void mo110230b() {
                if (C80510gr.f180106a) {
                    C80510gr.f180106a = false;
                    C80510gr.m139527a("record_start");
                }
                mVar.mo22872a(0);
                if (C69887bk.this.f156160b != null) {
                    C69887bk.this.f156160b.mo110235b();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final void mo110226a(float f) {
                lighteningRecordLayout.setHasBeenMoveScaled(true);
                dVar.mo22805b(f, lighteningRecordLayout.getY());
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final void mo110227a(int i) {
                if (!((ShortVideoContextViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class)).mo110049a()) {
                    mVar.mo22876a(new C14196o(i));
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.LighteningRecordLayout.AbstractC74254c
            /* renamed from: a */
            public final void mo110228a(boolean z) {
                C14207x xVar = new C14207x("record end");
                if (shortVideoContext.f155763X != 15 || z) {
                    mVar.mo22889b(xVar);
                    return;
                }
                mVar.mo22871a().mo116640a();
                xVar.f34485a = 5;
                mVar.mo22889b(xVar);
                lighteningRecordLayout.setVisibility(8);
                if (C69887bk.this.f156160b != null) {
                    C69887bk.this.f156160b.mo110234a();
                }
            }
        };
        this.f156159a = r0;
        lighteningRecordLayout.setRecordListener(r0);
    }
}
