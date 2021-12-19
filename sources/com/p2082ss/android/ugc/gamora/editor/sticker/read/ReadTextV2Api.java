package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.p1610b.AbstractC21996d;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import com.bytedance.ttnet.p1703d.C22944d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api */
public final class ReadTextV2Api {

    /* renamed from: a */
    public static final C83005a f185458a = new C83005a((byte) 0);

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api$Api */
    public interface Api {
        static {
            Covode.recordClassIndex(96875);
        }

        @AbstractC89731o(mo144285a = "/media/api/text/speech/invoke/")
        AbstractC21983b<FetchTextAudioResponse> get(@AbstractC22018z(mo35807a = "req_text") String str, @AbstractC22018z(mo35807a = "text_speaker") String str2, @AbstractC21996d Object obj);
    }

    static {
        Covode.recordClassIndex(96874);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextV2Api$a */
    public static final class C83005a {
        static {
            Covode.recordClassIndex(96876);
        }

        private C83005a() {
        }

        public /* synthetic */ C83005a(byte b) {
            this();
        }

        /* renamed from: a */
        public static FetchTextAudioResponse m143330a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C22944d dVar = new C22944d();
            dVar.f35401d = 30000;
            dVar.f35400c = 30000;
            dVar.f35402e = 30000;
            T t = ((Api) C63244g.m114602a().mo73257C().createRetrofit(C63244g.m114602a().mo73257C().getApiHost(), true, Api.class)).get(str, str2, dVar).execute().f52262b;
            C89219l.m154716b(t, "");
            return t;
        }
    }
}
