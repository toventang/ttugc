package com.p2082ss.ugc.effectplatform.p4453j;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86800i;
import com.p2082ss.ugc.effectplatform.task.C86882al;
import com.p2082ss.ugc.effectplatform.task.C86886am;
import com.p2082ss.ugc.effectplatform.task.C86978z;
import com.p2082ss.ugc.effectplatform.util.C87006t;
import com.p2082ss.ugc.effectplatform.util.C87009w;
import java.util.HashMap;
import java.util.List;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4522b.C87993b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.j.g */
public final class C86816g {

    /* renamed from: a */
    public C87991a<C87989b<String, String>> f195727a = new C87991a<>(null);

    /* renamed from: b */
    public final C86687a f195728b;

    /* renamed from: com.ss.ugc.effectplatform.j.g$a */
    public static abstract class AbstractC86817a implements AbstractC86796e<String> {
        static {
            Covode.recordClassIndex(102516);
        }
    }

    static {
        Covode.recordClassIndex(102515);
    }

    /* renamed from: com.ss.ugc.effectplatform.j.g$c */
    public static final class C86819c extends AbstractC86817a {

        /* renamed from: a */
        final /* synthetic */ AbstractC86800i f195733a;

        static {
            Covode.recordClassIndex(102518);
        }

        C86819c(AbstractC86800i iVar) {
            this.f195733a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(String str) {
            C89219l.m154719c(str, "");
            AbstractC86800i iVar = this.f195733a;
            if (iVar != null) {
                iVar.onFinally();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(String str, C86840e eVar) {
            C89219l.m154719c(eVar, "");
        }
    }

    public C86816g(C86687a aVar) {
        C89219l.m154719c(aVar, "");
        this.f195728b = aVar;
    }

    /* renamed from: com.ss.ugc.effectplatform.j.g$b */
    public static final class C86818b implements AbstractC86796e<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ C86816g f195729a;

        /* renamed from: b */
        final /* synthetic */ String f195730b;

        /* renamed from: c */
        final /* synthetic */ String f195731c;

        /* renamed from: d */
        final /* synthetic */ AbstractC86796e f195732d;

        static {
            Covode.recordClassIndex(102517);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(HashMap<String, String> hashMap) {
            HashMap<String, String> hashMap2 = hashMap;
            C89219l.m154719c(hashMap2, "");
            if (this.f195729a.f195727a.f199870a == null) {
                C87993b.m153065a(this.f195729a.f195727a, new C87989b(true));
            }
            V v = this.f195729a.f195727a.f199870a;
            if (v != null) {
                v.putAll(hashMap2);
            }
            this.f195729a.mo140053a(this.f195730b, this.f195731c, this.f195732d);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(HashMap<String, String> hashMap, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            if (this.f195729a.f195727a.f199870a == null) {
                C87993b.m153065a(this.f195729a.f195727a, new C87989b(true));
            }
            AbstractC86796e eVar2 = this.f195732d;
            if (eVar2 != null) {
                eVar2.onSuccess(true);
            }
        }

        public C86818b(C86816g gVar, String str, String str2, AbstractC86796e eVar) {
            this.f195729a = gVar;
            this.f195730b = str;
            this.f195731c = str2;
            this.f195732d = eVar;
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.j.g$d */
    public static final class C86820d implements AbstractC86796e<HashMap<String, String>> {

        /* renamed from: a */
        final /* synthetic */ C86816g f195734a;

        /* renamed from: b */
        final /* synthetic */ String f195735b;

        /* renamed from: c */
        final /* synthetic */ String f195736c;

        /* renamed from: d */
        final /* synthetic */ String f195737d;

        /* renamed from: e */
        final /* synthetic */ AbstractC86800i f195738e;

        static {
            Covode.recordClassIndex(102519);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onSuccess(HashMap<String, String> hashMap) {
            HashMap<String, String> hashMap2 = hashMap;
            C89219l.m154719c(hashMap2, "");
            if (this.f195734a.f195727a.f199870a == null) {
                C87993b.m153065a(this.f195734a.f195727a, new C87989b(true));
            }
            V v = this.f195734a.f195727a.f199870a;
            if (v != null) {
                v.putAll(hashMap2);
            }
            this.f195734a.mo140054a(this.f195735b, this.f195736c, this.f195737d, this.f195738e);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.ugc.effectplatform.model.e] */
        @Override // com.p2082ss.ugc.effectplatform.p4451h.AbstractC86796e
        public final /* synthetic */ void onFail(HashMap<String, String> hashMap, C86840e eVar) {
            C89219l.m154719c(eVar, "");
            if (this.f195734a.f195727a.f199870a == null) {
                C87993b.m153065a(this.f195734a.f195727a, new C87989b(true));
            }
        }

        public C86820d(C86816g gVar, String str, String str2, String str3, AbstractC86800i iVar) {
            this.f195734a = gVar;
            this.f195735b = str;
            this.f195736c = str2;
            this.f195737d = str3;
            this.f195738e = iVar;
        }
    }

    /* renamed from: a */
    public final void mo140053a(String str, String str2, AbstractC86796e<Boolean> eVar) {
        if (this.f195727a.f199870a == null && eVar != null) {
            eVar.onSuccess(true);
        }
        V v = this.f195727a.f199870a;
        if (v != null) {
            if (v.containsKey(str)) {
                if (C87009w.m150700a(str2) > C87009w.m150700a((String) v.get(str))) {
                    if (eVar != null) {
                        eVar.onSuccess(true);
                    }
                } else if (eVar != null) {
                    eVar.onSuccess(false);
                }
            } else if (eVar != null) {
                eVar.onSuccess(true);
            }
        }
    }

    /* renamed from: a */
    public final String mo140052a(String str, List<String> list, boolean z, AbstractC86796e<List<String>> eVar) {
        C89219l.m154719c(list, "");
        String a = C87006t.m150696a();
        if (eVar != null) {
            this.f195728b.f195443K.mo140036a(a, eVar);
        }
        C86978z zVar = new C86978z(this.f195728b, str, a, list, z, null);
        C86882al alVar = this.f195728b.f195470z;
        if (alVar != null) {
            alVar.mo140600a(zVar);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo140054a(String str, String str2, String str3, AbstractC86800i iVar) {
        if (this.f195727a.f199870a == null && iVar != null) {
            iVar.onFinally();
        }
        V v = this.f195727a.f199870a;
        if (v != null) {
            v.put(str2, str3);
            this.f195728b.f195443K.mo140036a(str, new C86819c(iVar));
            C86886am amVar = new C86886am(this.f195728b, str, v);
            C86882al alVar = this.f195728b.f195470z;
            if (alVar != null) {
                alVar.mo140600a(amVar);
            }
        }
    }
}
