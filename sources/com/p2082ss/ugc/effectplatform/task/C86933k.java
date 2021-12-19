package com.p2082ss.ugc.effectplatform.task;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import com.p2082ss.ugc.effectplatform.p4440a.C86693b;
import com.p2082ss.ugc.effectplatform.p4444b.AbstractC86755f;
import com.p2082ss.ugc.effectplatform.p4444b.C86749c;
import com.p2082ss.ugc.effectplatform.p4444b.C86751d;
import com.p2082ss.ugc.effectplatform.p4444b.C86752e;
import com.p2082ss.ugc.effectplatform.p4448e.AbstractC86768c;
import com.p2082ss.ugc.effectplatform.p4448e.C86769d;
import com.p2082ss.ugc.effectplatform.p4448e.C86772e;
import com.p2082ss.ugc.effectplatform.p4449f.C86781a;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.p4455l.C86824a;
import com.p2082ss.ugc.effectplatform.task.p4459c.C86904a;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import com.p2082ss.ugc.effectplatform.util.C86994k;
import com.p2082ss.ugc.effectplatform.util.C87001o;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import com.p2082ss.ugc.effectplatform.util.EffectUtilKt;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.C87991a;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.ugc.effectplatform.task.k */
public final class C86933k extends C86880aj<C86904a> {

    /* renamed from: e */
    public static final C86934a f195998e = new C86934a((byte) 0);

    /* renamed from: a */
    public C87991a<Long> f195999a = new C87991a<>(0L);

    /* renamed from: b */
    public C87991a<Long> f196000b = new C87991a<>(0L);

    /* renamed from: c */
    public C87991a<Long> f196001c = new C87991a<>(0L);

    /* renamed from: d */
    public final C86693b f196002d;

    /* renamed from: g */
    private C87991a<String> f196003g = new C87991a<>(null);

    /* renamed from: h */
    private final Effect f196004h;

    /* renamed from: i */
    private final C86769d f196005i;

    /* renamed from: j */
    private final C86687a f196006j;

    static {
        Covode.recordClassIndex(102698);
    }

    /* renamed from: com.ss.ugc.effectplatform.task.k$a */
    public static final class C86934a {
        static {
            Covode.recordClassIndex(102699);
        }

        private C86934a() {
        }

        public /* synthetic */ C86934a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.task.C86880aj
    /* renamed from: a */
    public final void mo140577a() {
        Long valueOf;
        if (C87007u.m150697a(this.f196004h.getZipPath()) || C87007u.m150697a(this.f196004h.getUnzipPath())) {
            this.f196004h.setZipPath(this.f196002d.f195507c + C88045d.f199951a + this.f196004h.getId() + ".zip");
            this.f196004h.setUnzipPath(this.f196002d.f195507c + C88045d.f199951a + this.f196004h.getId());
        }
        UrlModel trans_file_url = this.f196004h.getTrans_file_url();
        if (trans_file_url == null || trans_file_url.getUri() == null) {
            C86824a.m150397a(this.f196006j.f195453i, this.f196004h);
        } else {
            try {
                new C86929j(this.f196006j, this.f196002d.f195507c, this.f196004h).mo140577a();
                C88060b.m153135a("EffectFetcherTask", "fetchEffect: " + this.f196004h.getEffect_id() + " name: " + this.f196004h.getName() + " download trans res success, " + this.f196004h.getTransResPath());
            } catch (Exception e) {
                C88060b.m153136a("EffectFetcherTask", "fetchEffect: " + this.f196004h.getEffect_id() + " name: " + this.f196004h.getName() + " download trans res failed, " + this.f196004h.getTransResPath(), null);
                mo140596a((C86880aj) this, new C86840e(10019, e));
                return;
            }
        }
        if (!C88045d.m153118f(this.f196004h.getUnzipPath()) || !EffectUtilKt.m150630a(this.f196004h.getUnzipPath())) {
            mo140594a(this);
            C88060b.m153135a("EffectFetcherTask", "download effect: " + this.f196004h.getEffect_id() + ", name: " + this.f196004h.getName() + ", uri: " + this.f196004h.getFile_url().getUri() + " start");
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            if (!C87001o.m150692a(this.f196006j.f195435C)) {
                mo140596a((C86880aj) this, new C86840e(10011));
                return;
            }
            List<String> list = this.f196002d.f195506b;
            int i = 0;
            if (list == null || list.isEmpty() || C86993j.m150665a(this.f196004h.getFile_url())) {
                mo140596a((C86880aj) this, new C86840e(10003));
                return;
            }
            int size = list.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.f195893f) {
                    mo140596a((C86880aj) this, new C86840e(10001));
                    return;
                } else {
                    try {
                        this.f196003g.f199870a = (V) list.get(i);
                        V v = this.f196003g.f199870a;
                        if (v == null) {
                            break;
                        }
                        C86769d dVar = this.f196005i;
                        if (!(dVar == null || (valueOf = Long.valueOf(dVar.mo140023a(v, new C86935b(this, eVar)))) == null || valueOf.longValue() <= 0)) {
                            mo140597a((C86880aj<C86904a>) this, new C86904a(this.f196004h));
                            return;
                        }
                        i++;
                    } catch (Exception e2) {
                        C88060b.m153136a("EffectFetcherTask", "download: " + this.f196004h.getEffect_id() + ", name: " + this.f196004h.getName() + " failed, count: " + i, e2);
                        if (i == list.size() - 1) {
                            C86840e eVar2 = new C86840e(e2);
                            eVar2.mo140160a(this.f196003g.f199870a, "", "");
                            if (!(e2 instanceof C86781a)) {
                                String b = C86994k.m150674b(this.f196004h.getZipPath());
                                if (b != null) {
                                    AbstractC86755f a = C86751d.m150298a(b);
                                    if (a instanceof C86752e) {
                                        C86749c cVar = (C86749c) a;
                                        Effect effect = this.f196004h;
                                        C89219l.m154719c(effect, "");
                                        cVar.mo140011d(effect.getId() + ".zip");
                                        String unzipPath = effect.getUnzipPath();
                                        if (unzipPath != null) {
                                            try {
                                                String d = C88045d.m153116d(unzipPath);
                                                if (d != null) {
                                                    cVar.mo140011d(d);
                                                }
                                                C88045d.m153119g(unzipPath);
                                            } catch (Exception e3) {
                                                C88060b.m153136a("EffectDiskLruCache", "remove effect failed! " + e3.getMessage(), null);
                                            }
                                        }
                                    } else {
                                        C88045d.m153119g(this.f196004h.getUnzipPath());
                                        C88045d.m153119g(this.f196004h.getZipPath());
                                    }
                                }
                            } else {
                                eVar2.f195757b = "editor in currently editing!";
                            }
                            mo140596a((C86880aj) this, eVar2);
                            return;
                        }
                    }
                }
            }
            mo140596a((C86880aj) this, new C86840e(eVar.element));
            return;
        }
        C88060b.m153135a("EffectFetcherTask", "fetchEffect: " + this.f196004h.getEffect_id() + " name: " + this.f196004h.getName() + " already exists!");
        mo140597a((C86880aj<C86904a>) this, new C86904a(this.f196004h));
    }

    /* renamed from: com.ss.ugc.effectplatform.task.k$b */
    public static final class C86935b implements AbstractC86768c {

        /* renamed from: a */
        final /* synthetic */ C86933k f196007a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f196008b;

        static {
            Covode.recordClassIndex(102700);
        }

        @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86768c
        /* renamed from: a */
        public final void mo140020a(C86772e eVar) {
            C89219l.m154719c(eVar, "");
            if (eVar.mo140029a()) {
                this.f196007a.f196000b.f199870a = (V) Long.valueOf(eVar.f195683d);
                this.f196007a.f195999a.f199870a = (V) Long.valueOf(eVar.f195680a);
                this.f196007a.f196001c.f199870a = (V) Long.valueOf(eVar.f195684e);
                return;
            }
            this.f196008b.element = (T) eVar.f195685f;
        }

        C86935b(C86933k kVar, C89233z.C89238e eVar) {
            this.f196007a = kVar;
            this.f196008b = eVar;
        }

        @Override // com.p2082ss.ugc.effectplatform.p4448e.AbstractC86768c
        /* renamed from: a */
        public final void mo140019a(int i, long j) {
            C86933k kVar = this.f196007a;
            kVar.mo140595a(kVar, i, j);
        }
    }

    /* renamed from: a */
    private static boolean m150563a(Effect effect, C86840e eVar) {
        if (eVar.f195756a == 10001) {
            return false;
        }
        if (effect != null && eVar.f195756a == 10003 && effect.getEffect_type() == 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo140597a(C86880aj<C86904a> ajVar, C86904a aVar) {
        String str = "";
        C89219l.m154719c(ajVar, str);
        C89219l.m154719c(aVar, str);
        super.mo140597a((C86880aj) ajVar, (Object) aVar);
        C88060b.m153135a("EffectFetcherTask", "download effect: " + this.f196004h.getEffect_id() + ", name: " + this.f196004h.getName() + " success");
        V v = this.f196006j.f195463s.f199870a;
        if (v != null) {
            C86687a aVar2 = this.f196006j;
            String effect_id = this.f196004h.getEffect_id();
            C89378p[] pVarArr = new C89378p[4];
            pVarArr[0] = C89387v.m154943a("duration", this.f195999a.f199870a);
            pVarArr[1] = C89387v.m154943a("unzip_time", this.f196000b.f199870a);
            pVarArr[2] = C89387v.m154943a("size", this.f196001c.f199870a);
            V v2 = this.f196003g.f199870a;
            if (v2 != null) {
                str = v2;
            }
            pVarArr[3] = C89387v.m154943a("download_url", str);
            C86802b.m150356b(v, aVar2, effect_id, C89041ag.m154421a(pVarArr));
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.task.C86880aj
    /* renamed from: a */
    public final void mo140596a(C86880aj<C86904a> ajVar, C86840e eVar) {
        V v;
        String str = "";
        C89219l.m154719c(ajVar, str);
        C89219l.m154719c(eVar, str);
        C88060b.m153136a("EffectFetcherTask", "download effect: " + this.f196004h.getEffect_id() + ", name: " + this.f196004h.getName() + " failed!, error msg: " + eVar.f195757b + ", error code: " + eVar.f195756a, null);
        super.mo140596a((C86880aj) ajVar, eVar);
        if (m150563a(this.f196004h, eVar) && (v = this.f196006j.f195463s.f199870a) != null) {
            C86687a aVar = this.f196006j;
            String effect_id = this.f196004h.getEffect_id();
            C89378p[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("error_code", Integer.valueOf(eVar.f195756a));
            String str2 = this.f196003g.f199870a;
            if (str2 == null) {
                str2 = str;
            }
            pVarArr[1] = C89387v.m154943a("download_url", str2);
            Map a = C89041ag.m154421a(pVarArr);
            String str3 = eVar.f195757b;
            if (str3 != null) {
                str = str3;
            }
            C86802b.m150358c(v, false, aVar, effect_id, a, str);
        }
    }

    public C86933k(C86693b bVar, C86769d dVar, C86687a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(aVar, "");
        this.f196002d = bVar;
        this.f196005i = dVar;
        this.f196006j = aVar;
        this.f196004h = bVar.f195505a;
    }
}
