package com.weekend.recorder.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.weekend.recorder.api.p4510a.AbstractC87934a;
import com.weekend.recorder.api.p4510a.AbstractC87935b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.weekend.recorder.api.a */
public final class C87932a implements IAutoRecorder {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f199692a = {new C89232y(C89204ab.m154669a(C87932a.class), "recorder", "getRecorder()Lcom/weekend/recorder/api/IAutoRecorder;")};

    /* renamed from: b */
    public static final C87932a f199693b = new C87932a();

    /* renamed from: c */
    private static final AbstractC89244h f199694c = C89250i.m154773a((AbstractC89171a) C87933a.f199695a);

    /* renamed from: a */
    private static IAutoRecorder m152940a() {
        return (IAutoRecorder) f199694c.getValue();
    }

    private C87932a() {
    }

    /* renamed from: com.weekend.recorder.api.a$a */
    static final class C87933a extends AbstractC89220m implements AbstractC89171a<IAutoRecorder> {

        /* renamed from: a */
        public static final C87933a f199695a = new C87933a();

        static {
            Covode.recordClassIndex(103948);
        }

        C87933a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAutoRecorder invoke() {
            return m152941a();
        }

        /* renamed from: a */
        private static IAutoRecorder m152941a() {
            try {
                Object newInstance = Class.forName("com.weekend.recorder.RecorderWrapper").newInstance();
                if (newInstance != null) {
                    return (IAutoRecorder) newInstance;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(103947);
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final boolean getWeekEndRecorderSwitch(Context context) {
        C89219l.m154719c(context, "");
        IAutoRecorder a = m152940a();
        if (a == null || !a.getWeekEndRecorderSwitch(context)) {
            return false;
        }
        return true;
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void switchEnable(Context context, boolean z) {
        C89219l.m154719c(context, "");
        IAutoRecorder a = m152940a();
        if (a != null) {
            a.switchEnable(context, z);
        }
    }

    @Override // com.weekend.recorder.api.IAutoRecorder
    public final void init(String str, String str2, AbstractC87935b bVar, AbstractC87934a aVar) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        IAutoRecorder a = m152940a();
        if (a != null) {
            a.init(str, str2, bVar, aVar);
        }
    }
}
