package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bt */
public final class C8097bt {
    static {
        Covode.recordClassIndex(8904);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.bt$a */
    public static final class C8098a extends AbstractC89220m implements AbstractC89172b<EmoteModel, CharSequence> {

        /* renamed from: a */
        public static final C8098a f20108a = new C8098a();

        static {
            Covode.recordClassIndex(8905);
        }

        C8098a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CharSequence invoke(EmoteModel emoteModel) {
            EmoteModel emoteModel2 = emoteModel;
            C89219l.m154721d(emoteModel2, "");
            String str = emoteModel2.f8727g;
            C89219l.m154716b(str, "");
            return str;
        }
    }

    /* renamed from: a */
    public static final HashMap<String, String> m16256a(String str, long j, String str2, String str3, String str4, int i, boolean z) {
        String str5;
        C89378p[] pVarArr = new C89378p[7];
        pVarArr[0] = C89387v.m154943a("content", str);
        pVarArr[1] = C89387v.m154943a("room_id", String.valueOf(j));
        pVarArr[2] = C89387v.m154943a("request_id", str2);
        pVarArr[3] = C89387v.m154943a("common_label_list", str3);
        pVarArr[4] = C89387v.m154943a("enter_source", str4);
        if (z) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        pVarArr[5] = C89387v.m154943a("post_anyway", str5);
        pVarArr[6] = C89387v.m154943a("input_type", String.valueOf(i));
        Map a = C89041ag.m154421a(pVarArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new HashMap<>(linkedHashMap);
    }
}
