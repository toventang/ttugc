package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import p4560f.p4561a.AbstractC88979t;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextApi */
public final class ReadTextApi {

    /* renamed from: a */
    public final AbstractC89244h f185456a = C89250i.m154773a((AbstractC89171a) C83004a.f185457a);

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextApi$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(96871);
        }

        @AbstractC22012t(mo35799a = "/media/api/text/speech/invoke/")
        AbstractC88979t<FetchTextAudioResponse> submitText(@AbstractC22018z(mo35807a = "req_text") String str, @AbstractC21996d Object obj);
    }

    static {
        Covode.recordClassIndex(96870);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextApi$a */
    static final class C83004a extends AbstractC89220m implements AbstractC89171a<Api> {

        /* renamed from: a */
        public static final C83004a f185457a = new C83004a();

        static {
            Covode.recordClassIndex(96872);
        }

        C83004a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Api invoke() {
            AbstractC63196au C = C63244g.m114602a().mo73257C();
            AVApi b = AVApiImpl.m123134b();
            C89219l.m154716b(b, "");
            String a = b.mo109850a();
            C89219l.m154716b(a, "");
            return C.createRetrofit(a, true, Api.class);
        }
    }
}
