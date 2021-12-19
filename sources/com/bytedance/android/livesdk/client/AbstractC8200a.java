package com.bytedance.android.livesdk.client;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageClient;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87079c;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87078b;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87081e;
import com.p2082ss.ugc.live.sdk.msg.p4471b.C87083f;
import com.p2082ss.ugc.live.sdk.msg.p4473d.AbstractC87110f;
import com.p2082ss.ugc.live.sdk.msg.p4473d.C87107d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.client.a */
public abstract class AbstractC8200a implements IMessageClient {

    /* renamed from: a */
    public final String f20325a = "AbsMessageClient";

    /* renamed from: b */
    private final IMessageApi f20326b = ((IMessageApi) C5805e.m12718a().mo11572a(IMessageApi.class));

    static {
        Covode.recordClassIndex(9024);
    }

    /* renamed from: com.bytedance.android.livesdk.client.a$b */
    static final class C8202b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC87079c f20329a;

        static {
            Covode.recordClassIndex(9026);
        }

        C8202b(AbstractC87079c cVar) {
            this.f20329a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f20329a.mo13086a(AbstractC87110f.C87111a.m150860a(new Exception((Throwable) obj)));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.client.a$d */
    static final class C8204d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC87079c f20332a;

        static {
            Covode.recordClassIndex(9028);
        }

        C8204d(AbstractC87079c cVar) {
            this.f20332a = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f20332a.mo13086a(AbstractC87110f.C87111a.m150860a(new Exception((Throwable) obj)));
        }
    }

    /* renamed from: a */
    public static String m16310a(C22028c cVar) {
        List<C22027b> list;
        T t;
        String str;
        if (cVar == null || (list = cVar.f52042d) == null) {
            return "";
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            C89219l.m154716b(t2, "");
            if (C89219l.m154714a((Object) "x-tt-logid", (Object) t2.f52037a)) {
                break;
            }
        }
        T t3 = t;
        if (t3 == null || (str = t3.f52038b) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.bytedance.android.livesdk.client.a$a */
    static final class C8201a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC8200a f20327a;

        /* renamed from: b */
        final /* synthetic */ AbstractC87079c f20328b;

        static {
            Covode.recordClassIndex(9025);
        }

        C8201a(AbstractC8200a aVar, AbstractC87079c cVar) {
            this.f20327a = aVar;
            this.f20328b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC87110f<C87083f, ? extends Exception> fVar;
            C22028c cVar = ((C22099u) obj).f52261a;
            C89219l.m154716b(cVar, "");
            if (cVar.mo35845a()) {
                TypedInput typedInput = cVar.f52043e;
                Objects.requireNonNull(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
                byte[] bytes = ((TypedByteArray) typedInput).getBytes();
                Iterable iterable = cVar.f52042d;
                if (iterable == null) {
                    iterable = C89086z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a(iterable, 10));
                for (T t : iterable) {
                    C89219l.m154716b(t, "");
                    arrayList.add(new C87078b(t.f52037a, t.f52038b));
                }
                fVar = AbstractC87110f.C87111a.m150861a(new C87083f.C87084a().mo140795a(cVar.f52040b).mo140797a(cVar.f52041c).mo140798a((List<C87078b>) arrayList).mo140799a(bytes).f196318a);
            } else {
                C3854a.m9453a(6, this.f20327a.f20325a, "http post response failed, code: " + cVar.f52040b + ". logId: " + AbstractC8200a.m16310a(cVar));
                fVar = AbstractC87110f.C87111a.m150860a(new Exception("response failed"));
            }
            this.f20328b.mo13086a(fVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.client.a$c */
    static final class C8203c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC8200a f20330a;

        /* renamed from: b */
        final /* synthetic */ AbstractC87079c f20331b;

        static {
            Covode.recordClassIndex(9027);
        }

        C8203c(AbstractC8200a aVar, AbstractC87079c cVar) {
            this.f20330a = aVar;
            this.f20331b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            AbstractC87110f<C87083f, ? extends Exception> fVar;
            C22028c cVar = ((C22099u) obj).f52261a;
            C89219l.m154716b(cVar, "");
            if (cVar.mo35845a()) {
                TypedInput typedInput = cVar.f52043e;
                Objects.requireNonNull(typedInput, "null cannot be cast to non-null type com.bytedance.retrofit2.mime.TypedByteArray");
                byte[] bytes = ((TypedByteArray) typedInput).getBytes();
                Iterable iterable = cVar.f52042d;
                if (iterable == null) {
                    iterable = C89086z.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C89070n.m154526a(iterable, 10));
                for (T t : iterable) {
                    C89219l.m154716b(t, "");
                    arrayList.add(new C87078b(t.f52037a, t.f52038b));
                }
                fVar = AbstractC87110f.C87111a.m150861a(new C87083f.C87084a().mo140795a(cVar.f52040b).mo140797a(cVar.f52041c).mo140798a((List<C87078b>) arrayList).mo140799a(bytes).f196318a);
            } else {
                C3854a.m9453a(6, this.f20330a.f20325a, "http post response failed, code: " + cVar.f52040b + ". logId: " + AbstractC8200a.m16310a(cVar));
                fVar = AbstractC87110f.C87111a.m150860a(new Exception("response failed"));
            }
            this.f20331b.mo13086a(fVar);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87085g
    /* renamed from: b */
    public final void mo14437b(C87081e eVar, AbstractC87079c cVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        IMessageApi iMessageApi = this.f20326b;
        String str = eVar.f196302b;
        C89219l.m154716b(str, "");
        Map<String, String> map = eVar.f196303c;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = eVar.f196304d;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        iMessageApi.doGetAsync(str, map, map2).mo143271a(new C11191f()).mo143254a(new C8201a(this, cVar), new C8202b(cVar));
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87085g
    /* renamed from: a */
    public final void mo14436a(C87081e eVar, AbstractC87079c cVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        TypedByteArray typedByteArray = new TypedByteArray(eVar.f196307g, C87107d.m150856a(eVar), new String[0]);
        IMessageApi iMessageApi = this.f20326b;
        String str = eVar.f196302b;
        C89219l.m154716b(str, "");
        Map<String, String> map = eVar.f196303c;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = eVar.f196304d;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        iMessageApi.doPostAsync(str, map, map2, typedByteArray).mo143271a(new C11191f()).mo143254a(new C8203c(this, cVar), new C8204d(cVar));
    }
}
