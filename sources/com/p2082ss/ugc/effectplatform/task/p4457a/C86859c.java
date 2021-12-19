package com.p2082ss.ugc.effectplatform.task.p4457a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.algorithm.C86706c;
import com.p2082ss.ugc.effectplatform.algorithm.C86712f;
import com.p2082ss.ugc.effectplatform.algorithm.C86715h;
import com.p2082ss.ugc.effectplatform.model.C86840e;
import com.p2082ss.ugc.effectplatform.model.C86841f;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.algorithm.C86836c;
import com.p2082ss.ugc.effectplatform.model.algorithm.EnumC86835b;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4446c.C86757a;
import com.p2082ss.ugc.effectplatform.p4448e.C86763a;
import com.p2082ss.ugc.effectplatform.p4449f.C86784d;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h;
import com.p2082ss.ugc.effectplatform.p4452i.C86802b;
import com.p2082ss.ugc.effectplatform.task.AbstractC86891b;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import com.p2082ss.ugc.effectplatform.util.C87001o;
import com.p2082ss.ugc.effectplatform.util.C87005s;
import com.p2082ss.ugc.effectplatform.util.EnumC87003q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4522b.p4523a.C87992a;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4519d.p4520a.p4532e.C88060b;
import p4519d.p4520a.p4534g.C88067b;
import p4519d.p4520a.p4534g.C88069d;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.task.a.c */
public final class C86859c extends AbstractC86891b {

    /* renamed from: a */
    private final C86687a f195822a;

    /* renamed from: b */
    private final C86861aa f195823b;

    /* renamed from: c */
    private final C86712f f195824c;

    /* renamed from: d */
    private final C86734a f195825d;

    /* renamed from: f */
    private final String[] f195826f;

    /* renamed from: g */
    private final int f195827g;

    /* renamed from: h */
    private final String f195828h;

    static {
        Covode.recordClassIndex(102624);
    }

    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: b */
    public final void mo139953b() {
    }

    @Override // com.p2082ss.ugc.effectplatform.task.AbstractC86891b
    /* renamed from: a */
    public final void mo139952a() {
        C86841f a;
        String[] strArr = this.f195826f;
        if (strArr != null) {
            C88003f fVar = C86860d.f195829a;
            fVar.f199879a.lock();
            try {
                int i = this.f195827g;
                C86861aa aaVar = this.f195823b;
                if (aaVar == null || (a = aaVar.mo140590a(i, true)) == null) {
                    throw new RuntimeException("model list with " + i + " not found!");
                }
                m150460a(mo140585a(i, strArr, a));
                fVar.f199879a.unlock();
            } catch (Exception e) {
                C88060b.m153136a("effect_platform", "fetchModels: " + C89064i.m154508i(strArr) + " exception happens!", e);
                if (!m150462b(strArr)) {
                    throw e;
                }
            } catch (Throwable th) {
                fVar.f199879a.unlock();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (r16 == null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList<com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo> mo140585a(int r22, java.lang.String[] r23, com.p2082ss.ugc.effectplatform.model.C86841f r24) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.task.p4457a.C86859c.mo140585a(int, java.lang.String[], com.ss.ugc.effectplatform.model.f):java.util.ArrayList");
    }

    /* renamed from: a */
    public final List<C86843g> mo140586a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            C86843g a = this.f195825d.mo139972a(C87000n.m150684a(str));
            if (a != null) {
                arrayList.add(a);
            } else if (m150461a(str)) {
                String str2 = C87005s.m150695a("model") + str;
                C89219l.m154719c(str2, "");
                C86843g a2 = C86843g.C86844a.m150415a("file:///android_asset://".concat(String.valueOf(str2)));
                String b = C87000n.m150686b(str);
                int c = C87000n.m150687c(str);
                a2.mo140169b(b);
                a2.f195767b = c;
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final boolean m150462b(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (!m150461a(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Effect m150456a(ModelInfo modelInfo) {
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, false, null, null, null, null, null, null, null, null, -1, 524287, null);
        effect.setName(modelInfo.getName());
        return effect;
    }

    /* renamed from: a */
    private final void m150460a(ArrayList<ModelInfo> arrayList) {
        Exception e;
        long j;
        if (C87001o.m150692a(this.f195822a.f195435C) || !(!arrayList.isEmpty())) {
            Iterator<ModelInfo> it = arrayList.iterator();
            while (it.hasNext()) {
                ModelInfo next = it.next();
                C88060b.m153135a("effect_platform", "download model: " + next.getName() + ", version: " + next.getVersion());
                C88069d a = C88069d.C88070a.m153145a();
                try {
                    AbstractC86799h hVar = this.f195822a.f195439G;
                    if (hVar != null) {
                        C89219l.m154709a((Object) next, "");
                        hVar.onModelDownloadStart(m150456a(next), next);
                    }
                    long a2 = C87992a.m153063a();
                    C89219l.m154709a((Object) next, "");
                    EnumC86835b bVar = this.f195822a.f195436D;
                    V v = this.f195822a.f195462r.f199870a;
                    if (v == null) {
                        j = 0;
                    } else {
                        j = new C86763a(this.f195825d, v).mo140018a(next, bVar);
                        if (j > 0) {
                            Effect a3 = m150456a(next);
                            long j2 = j / ((long) C86757a.f195654a);
                            C88060b.m153135a("effect_platform", "model::" + next.getName() + ",version = " + next.getVersion() + ",size = " + String.valueOf(next.getType()) + " download success!");
                            next.setTotalSize(j2 / ((long) C86757a.f195654a));
                            long a4 = C87992a.m153063a() - a2;
                            V v2 = this.f195822a.f195463s.f199870a;
                            if (v2 != null) {
                                C86687a aVar = this.f195822a;
                                String name = next.getName();
                                String version = next.getVersion();
                                String bVar2 = this.f195822a.f195436D.toString();
                                C89378p[] pVarArr = new C89378p[2];
                                pVarArr[0] = C89387v.m154943a("size", Long.valueOf(j2));
                                try {
                                    pVarArr[1] = C89387v.m154943a("duration", Long.valueOf(a4));
                                    C86802b.m150352a(v2, true, aVar, name, version, bVar2, C89041ag.m154421a(pVarArr), "");
                                } catch (Exception e2) {
                                    e = e2;
                                    C89219l.m154709a((Object) next, "");
                                    m150458a(m150456a(next), next, e);
                                    m150459a(next, e);
                                }
                            }
                            AbstractC86799h hVar2 = this.f195822a.f195439G;
                            if (hVar2 != null) {
                                hVar2.onModelDownloadSuccess(a3, next, a.mo142623a());
                            }
                            C89219l.m154719c(next, "");
                            if (EnumC87003q.ANDROID != EnumC87003q.PC) {
                                String name2 = next.getName();
                                C86843g a5 = C86843g.C86844a.m150415a("");
                                a5.mo140167a(name2);
                                String a6 = C86836c.m150404a(next);
                                if (a6 == null) {
                                    a6 = "";
                                }
                                C89219l.m154719c(a6, "");
                                a5.f195766a = a6;
                                a5.f195767b = next.getType();
                                a5.mo140169b(next.getVersion());
                                a5.f195768c = false;
                                C86715h hVar3 = new C86715h(a5, next);
                                C88003f fVar = C86706c.f195529a;
                                fVar.f199879a.lock();
                                try {
                                    C88060b.m153135a("AlgorithmModelInfoMemoryCache", "model: " + name2 + " write in cache!");
                                    C86706c.f195530b.put(name2, hVar3);
                                } finally {
                                    fVar.f199879a.unlock();
                                }
                            }
                        }
                    }
                    RuntimeException runtimeException = new RuntimeException("download model fail, downloadFileSize = ".concat(String.valueOf(j)));
                    m150458a(m150456a(next), next, runtimeException);
                    m150459a(next, runtimeException);
                } catch (Exception e3) {
                    e = e3;
                    C89219l.m154709a((Object) next, "");
                    m150458a(m150456a(next), next, e);
                    m150459a(next, e);
                }
            }
            return;
        }
        C88060b.m153136a("effect_platform", "download " + C89070n.m154590j(arrayList) + " failed!, network unavailable!", null);
        throw new C86784d(10011, "network unavailable");
    }

    /* renamed from: a */
    private final boolean m150461a(String str) {
        boolean a = this.f195824c.mo139954a(C87005s.m150695a("model") + str);
        if (a) {
            C88060b.m153135a("effect_platform", "model: " + str + " is built in resource");
        }
        return a;
    }

    /* renamed from: a */
    private final ModelInfo m150457a(String str, int i) {
        C86841f a;
        C88067b<String, C86841f.C86842a> bVar;
        Collection<C86841f.C86842a> a2;
        try {
            C86861aa aaVar = this.f195823b;
            if (!(aaVar == null || (a = aaVar.mo140590a(i, false)) == null || (bVar = a.f195762a) == null || (a2 = bVar.mo142621a()) == null)) {
                for (C86841f.C86842a aVar : a2) {
                    if (C89219l.m154714a((Object) aVar.f195764a.getName(), (Object) str)) {
                        return aVar.f195764a;
                    }
                }
            }
        } catch (Exception e) {
            C88060b.m153136a("effect_platform", "exception happens in getLatestModelInfo", e);
        }
        return null;
    }

    /* renamed from: a */
    private final void m150459a(ModelInfo modelInfo, Exception exc) {
        C88060b.m153136a("effect_platform", "model::" + modelInfo.getName() + ",info.getVersion() = " + modelInfo.getVersion() + ", size = " + String.valueOf(modelInfo.getType()) + " download failure", exc);
        C86843g a = this.f195825d.mo139972a(modelInfo.getName());
        if (a != null) {
            String b = a.mo140168b();
            if (b == null) {
                C89219l.m154707a();
            }
            if (!C87000n.m150685a(b, modelInfo.getVersion())) {
                throw exc;
            }
            return;
        }
        throw exc;
    }

    /* renamed from: a */
    private final void m150458a(Effect effect, ModelInfo modelInfo, Exception exc) {
        String message;
        List<String> url_list;
        C86840e eVar = new C86840e(exc);
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        String str = null;
        boolean z = true;
        if (!(file_url == null || (url_list = file_url.getUrl_list()) == null || !(!url_list.isEmpty()))) {
            str = url_list.get(0);
        }
        V v = this.f195822a.f195463s.f199870a;
        if (v != null) {
            C86687a aVar = this.f195822a;
            String name = modelInfo.getName();
            String version = modelInfo.getVersion();
            String bVar = this.f195822a.f195436D.toString();
            C89378p[] pVarArr = new C89378p[2];
            pVarArr[0] = C89387v.m154943a("error_code", Integer.valueOf(eVar.f195756a));
            if (str == null) {
                str = "";
            }
            pVarArr[1] = C89387v.m154943a("download_url", str);
            Map a = C89041ag.m154421a(pVarArr);
            String message2 = exc.getMessage();
            if (message2 != null && !C89361p.m154870a((CharSequence) message2)) {
                z = false;
            }
            if (z) {
                message = C89204ab.m154669a(exc.getClass()).mo143614c();
            } else {
                message = exc.getMessage();
            }
            C86802b.m150352a(v, false, aVar, name, version, bVar, a, message);
        }
        AbstractC86799h hVar = this.f195822a.f195439G;
        if (hVar != null) {
            hVar.onModelDownloadError(effect, modelInfo, exc);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C86859c(C86687a aVar, C86861aa aaVar, C86712f fVar, C86734a aVar2, String[] strArr, int i) {
        super(null, aVar.f195443K);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(aVar2, "");
        this.f195822a = aVar;
        this.f195823b = aaVar;
        this.f195824c = fVar;
        this.f195825d = aVar2;
        this.f195826f = strArr;
        this.f195827g = i;
        this.f195828h = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C86859c(C86687a aVar, C86861aa aaVar, C86712f fVar, C86734a aVar2, String[] strArr, int i, int i2) {
        this(aVar, aaVar, fVar, aVar2, (i2 & 16) != 0 ? null : strArr, (i2 & 32) != 0 ? 0 : i);
    }
}
