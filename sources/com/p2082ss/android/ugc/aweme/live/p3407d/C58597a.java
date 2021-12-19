package com.p2082ss.android.ugc.aweme.live.p3407d;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdk.p425aa.p428c.C6520a;
import com.bytedance.android.livesdk.p425aa.p428c.C6522b;
import com.bytedance.android.livesdkapi.p675c.AbstractC11616a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize.live.p2575a.C38048a;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.live.d.a */
public final class C58597a implements AbstractC11616a {
    static {
        Covode.recordClassIndex(68893);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    /* renamed from: com.ss.android.ugc.aweme.live.d.a$b */
    static final class C58599b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC11616a.AbstractC11617a f133466a;

        static {
            Covode.recordClassIndex(68895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58599b(AbstractC11616a.AbstractC11617a aVar) {
            super(0);
            this.f133466a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f133466a.mo13992a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.live.d.a$a */
    static final class C58598a extends AbstractC89220m implements AbstractC89172b<Map<String, ? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C18129a.C18130a f133465a;

        static {
            Covode.recordClassIndex(68894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C58598a(C18129a.C18130a aVar) {
            super(1);
            this.f133465a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, ? extends String> map) {
            mo96055a(map);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo96055a(Map<String, String> map) {
            if (!(map == null || map.isEmpty())) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (!C89219l.m154714a((Object) entry.getKey(), (Object) "traffic_from_position")) {
                        this.f133465a.mo28900b(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.p675c.AbstractC11616a
    /* renamed from: a */
    public final void mo18413a(Uri uri, EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(uri, "");
        C89219l.m154721d(enterRoomConfig, "");
        try {
            String queryParameter = uri.getQueryParameter("adLiveJson");
            if (queryParameter != null) {
                C89219l.m154716b(queryParameter, "");
                C38048a aVar = (C38048a) C80342dg.m139301a(queryParameter, C38048a.class);
                if (!aVar.f89909f.isEmpty()) {
                    enterRoomConfig.f28233c.f28359o = aVar.f89904a;
                    enterRoomConfig.f28233c.f28356l = aVar.f89909f;
                    enterRoomConfig.f28233c.f28357m = aVar.f89910g;
                    enterRoomConfig.f28233c.f28358n = aVar.f89908e;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.android.livesdkapi.p675c.AbstractC11616a
    /* renamed from: a */
    public final void mo18411a(Context context, String str, long j) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        IFeedAdService c = FeedAdServiceImpl.m67808c();
        if (c != null) {
            c.mo58881a(context, str, j);
        }
    }

    @Override // com.bytedance.android.livesdkapi.p675c.AbstractC11616a
    /* renamed from: a */
    public final void mo18412a(Context context, String str, long j, AbstractC11616a.AbstractC11617a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        IFeedAdService c = FeedAdServiceImpl.m67808c();
        if (c != null) {
            c.mo58882a(context, str, j, new C58599b(aVar));
        }
    }

    @Override // com.bytedance.android.livesdkapi.p675c.AbstractC11616a
    /* renamed from: a */
    public final void mo18414a(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        HashMap<String, String> hashMap;
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C6520a aVar = (C6520a) DataChannelGlobal.f42558d.mo28324b(C6522b.class);
        if (aVar != null && (str3 = (hashMap = aVar.f16193P).get("value")) != null) {
            C89219l.m154716b(str3, "");
            HashMap<String, String> hashMap2 = aVar.f16194Q;
            C18129a.C18130a a = C18129a.m33747a(str, str2, str3, hashMap.get("log_extra"), hashMap.get("group_id"));
            C58598a aVar2 = new C58598a(a);
            aVar2.mo96055a(map);
            a.mo28898a(map2);
            aVar2.mo96055a(hashMap);
            a.mo28898a(hashMap2);
            try {
                String str4 = hashMap2.get("traffic_from_position");
                if (str4 != null) {
                    C89219l.m154716b(str4, "");
                    a.mo28897a("traffic_from_position", Integer.valueOf(Integer.parseInt(str4)));
                }
            } catch (NumberFormatException unused) {
            }
            a.mo28901b();
        }
    }
}
