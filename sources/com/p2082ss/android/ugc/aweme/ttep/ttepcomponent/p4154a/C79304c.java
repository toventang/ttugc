package com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4154a;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14196o;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73353a;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout;
import com.p2082ss.android.ugc.aweme.utils.C80510gr;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.c */
public final class C79304c {

    /* renamed from: a */
    public RecordLayout.AbstractC74257a f178152a;

    static {
        Covode.recordClassIndex(92494);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ttepcomponent.a.c$a */
    public static final class C79305a implements RecordLayout.AbstractC74257a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f178153a;

        /* renamed from: b */
        final /* synthetic */ AbstractC14193m f178154b;

        /* renamed from: c */
        final /* synthetic */ ActivityC0945e f178155c;

        /* renamed from: d */
        final /* synthetic */ View.OnClickListener f178156d;

        /* renamed from: e */
        final /* synthetic */ RecordLayout f178157e;

        /* renamed from: f */
        final /* synthetic */ AbstractC14177d f178158f;

        static {
            Covode.recordClassIndex(92495);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: b */
        public final boolean mo111428b() {
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: h */
        public final void mo111434h() {
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: a */
        public final void mo111425a() {
            this.f178153a.invoke();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: e */
        public final void mo111431e() {
            this.f178156d.onClick(this.f178157e);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: g */
        public final boolean mo111433g() {
            return C73353a.m129491a(this.f178158f);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: d */
        public final void mo111430d() {
            C14207x xVar = new C14207x("record end");
            AbstractC14193m mVar = this.f178154b;
            if (mVar != null) {
                mVar.mo22889b(xVar);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: f */
        public final void mo111432f() {
            this.f178157e.setCurrentScaleMode(0);
            this.f178158f.mo22771Y();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: c */
        public final void mo111429c() {
            if (C80510gr.f180106a) {
                C80510gr.f180106a = false;
                C80510gr.m139527a("record_start");
            }
            AbstractC14193m mVar = this.f178154b;
            if (mVar != null) {
                mVar.mo22872a(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: a */
        public final void mo111426a(float f) {
            this.f178157e.setHasBeenMoveScaled(true);
            this.f178158f.mo22805b(f, this.f178157e.getY());
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.RecordLayout.AbstractC74257a
        /* renamed from: a */
        public final void mo111427a(int i) {
            AbstractC14193m mVar;
            ActivityC0945e eVar = this.f178155c;
            if (eVar == null) {
                C89219l.m154715b();
            }
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            if (!((ShortVideoContextViewModel) a).mo110049a() && (mVar = this.f178154b) != null) {
                mVar.mo22876a(new C14196o(i, 0, 6));
            }
        }

        C79305a(AbstractC89171a aVar, AbstractC14193m mVar, ActivityC0945e eVar, View.OnClickListener onClickListener, RecordLayout recordLayout, AbstractC14177d dVar) {
            this.f178153a = aVar;
            this.f178154b = mVar;
            this.f178155c = eVar;
            this.f178156d = onClickListener;
            this.f178157e = recordLayout;
            this.f178158f = dVar;
        }
    }

    public C79304c(ActivityC0945e eVar, AbstractC14177d dVar, AbstractC14193m mVar, RecordLayout recordLayout, AbstractC89171a<C89391z> aVar, View.OnClickListener onClickListener) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(recordLayout, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(onClickListener, "");
        C79305a aVar2 = new C79305a(aVar, mVar, eVar, onClickListener, recordLayout, dVar);
        this.f178152a = aVar2;
        recordLayout.setRecordListener(aVar2);
    }
}
