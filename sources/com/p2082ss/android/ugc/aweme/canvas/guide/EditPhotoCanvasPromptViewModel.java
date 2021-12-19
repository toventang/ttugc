package com.p2082ss.android.ugc.aweme.canvas.guide;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel */
public final class EditPhotoCanvasPromptViewModel extends AbstractC1174ac {

    /* renamed from: b */
    public static final C35385a f83479b = new C35385a((byte) 0);

    /* renamed from: a */
    public final C1213t<Boolean> f83480a = new C1213t<>();

    static {
        Covode.recordClassIndex(42558);
    }

    /* renamed from: com.ss.android.ugc.aweme.canvas.guide.EditPhotoCanvasPromptViewModel$a */
    public static final class C35385a {
        static {
            Covode.recordClassIndex(42559);
        }

        private C35385a() {
        }

        public /* synthetic */ C35385a(byte b) {
            this();
        }

        /* renamed from: a */
        public static EditPhotoCanvasPromptViewModel m72412a(ActivityC0945e eVar) {
            C89219l.m154721d(eVar, "");
            AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(EditPhotoCanvasPromptViewModel.class);
            C89219l.m154716b(a, "");
            return (EditPhotoCanvasPromptViewModel) a;
        }
    }

    /* renamed from: a */
    public final void mo62287a() {
        this.f83480a.postValue(true);
    }
}
