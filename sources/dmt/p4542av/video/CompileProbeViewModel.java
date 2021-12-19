package dmt.p4542av.video;

import androidx.lifecycle.AbstractC1174ac;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65380bt;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.gamora.editor.C82041c;
import com.p2082ss.android.ugc.gamora.editor.C82130d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: dmt.av.video.CompileProbeViewModel */
public final class CompileProbeViewModel extends AbstractC1174ac {

    /* renamed from: a */
    private final AbstractC89244h f200056a = C89250i.m154773a((AbstractC89171a) C88143a.f200057a);

    static {
        Covode.recordClassIndex(104172);
    }

    /* renamed from: a */
    public final C82041c mo142640a() {
        return (C82041c) this.f200056a.getValue();
    }

    /* renamed from: dmt.av.video.CompileProbeViewModel$a */
    static final class C88143a extends AbstractC89220m implements AbstractC89171a<C82041c> {

        /* renamed from: a */
        public static final C88143a f200057a = new C88143a();

        static {
            Covode.recordClassIndex(104173);
        }

        C88143a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C82041c invoke() {
            C73991bj.m130131b("CompileProbeViewModel -> init");
            if (C65380bt.m117077a()) {
                C73991bj.m130131b("CompileProbeViewModel -> CompileProbeV2");
                return new C82130d();
            }
            C73991bj.m130131b("CompileProbeViewModel -> CompileProbe");
            return new C82041c();
        }
    }
}
