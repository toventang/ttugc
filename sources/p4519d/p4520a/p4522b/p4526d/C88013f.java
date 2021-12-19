package p4519d.p4520a.p4522b.p4526d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4519d.p4520a.p4522b.p4526d.AbstractC88016h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.b.d.f */
public final class C88013f implements AbstractC88016h {
    static {
        Covode.recordClassIndex(104039);
    }

    @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88016h
    /* renamed from: a */
    public final AbstractC88016h.AbstractC88017a mo142591a() {
        return new C88014a();
    }

    /* renamed from: d.a.b.d.f$a */
    static final class C88014a implements AbstractC88016h.AbstractC88017a {

        /* renamed from: a */
        public volatile Handler f199889a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        public final Object f199890b = new Object();

        static {
            Covode.recordClassIndex(104040);
        }

        @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88016h.AbstractC88017a
        /* renamed from: a */
        public final void mo142592a() {
            MethodCollector.m26663i(11620);
            if (this.f199889a != null) {
                synchronized (this.f199890b) {
                    try {
                        Handler handler = this.f199889a;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                    } finally {
                        MethodCollector.m26664o(11620);
                    }
                }
                return;
            }
            MethodCollector.m26664o(11620);
        }

        @Override // p4519d.p4520a.p4522b.p4526d.AbstractC88016h.AbstractC88017a
        /* renamed from: a */
        public final void mo142593a(AbstractC89171a<C89391z> aVar) {
            MethodCollector.m26663i(11447);
            C89219l.m154719c(aVar, "");
            if (this.f199889a != null) {
                synchronized (this.f199890b) {
                    try {
                        Handler handler = this.f199889a;
                        if (handler != null) {
                            Boolean.valueOf(handler.postDelayed(new RunnableC88015g(aVar), 0));
                        }
                    } finally {
                        MethodCollector.m26664o(11447);
                    }
                }
                return;
            }
            MethodCollector.m26664o(11447);
        }
    }
}
