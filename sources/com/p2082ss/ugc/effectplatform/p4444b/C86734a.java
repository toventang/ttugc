package com.p2082ss.ugc.effectplatform.p4444b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.algorithm.C86706c;
import com.p2082ss.ugc.effectplatform.algorithm.C86712f;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.model.algorithm.C86836c;
import com.p2082ss.ugc.effectplatform.model.algorithm.EnumC86835b;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4444b.p4445a.C86735a;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4519d.p4520a.p4530d.p4531a.C88044c;
import p4519d.p4520a.p4530d.p4531a.C88051h;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.b.a */
public final class C86734a extends C86749c {

    /* renamed from: c */
    private final C86712f f195580c;

    static {
        Covode.recordClassIndex(102433);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.ugc.effectplatform.p4444b.C86749c
    /* renamed from: a */
    public final void mo139974a() {
        super.mo139974a();
        C86706c.m150201a();
    }

    /* renamed from: b */
    public final Map<String, C86843g> mo139975b() {
        C88051h hVar;
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        try {
            List<String> c = this.f195580c.mo139956c("model");
            if (c != null) {
                Iterator<T> it = c.iterator();
                while (it.hasNext()) {
                    List<String> c2 = this.f195580c.mo139956c("model/".concat(String.valueOf(it.next())));
                    if (c2 != null) {
                        for (T t : c2) {
                            try {
                                str2 = C87000n.m150684a(t);
                            } catch (Exception unused) {
                                str2 = "";
                            }
                            if (!C89219l.m154714a((Object) str2, (Object) "")) {
                                String b = C87000n.m150686b(t);
                                C86843g a = C86843g.C86844a.m150415a("");
                                a.mo140167a(str2);
                                a.mo140169b(b);
                                a.f195768c = true;
                                hashMap.put(str2, a);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            C88060b.m153136a("DiskLruCacheImpl", "getLocalModelInfoList built in error", e);
        }
        try {
            C86735a c3 = mo140008c();
            Set<String> a2 = c3 != null ? c3.mo139976a() : null;
            if (a2 != null) {
                for (T t2 : a2) {
                    String a3 = C87000n.m150684a(t2);
                    C86735a c4 = mo140008c();
                    C86735a.C86740d d = c4 != null ? c4.mo139983d(t2) : null;
                    if (!(d == null || (hVar = d.f195614a[0]) == null || (str = hVar.f199967a) == null)) {
                        C86843g a4 = C86843g.C86844a.m150415a(str);
                        a4.f195768c = false;
                        hashMap.put(a3, a4);
                    }
                }
            }
            return hashMap;
        } catch (Exception e2) {
            C88060b.m153136a("DiskLruCacheImpl", "error while getLocalModelInfoList", e2);
            return hashMap;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006b, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006f, code lost:
        r2.mo139996a();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b A[Catch:{ all -> 0x0073 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.ugc.effectplatform.model.C86843g mo139972a(java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.p4444b.C86734a.mo139972a(java.lang.String):com.ss.ugc.effectplatform.model.g");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86734a(String str, int i, C86712f fVar) {
        super(str, i, 0, Long.MAX_VALUE, null, 20);
        C89219l.m154719c(str, "");
        C89219l.m154719c(fVar, "");
        this.f195580c = fVar;
    }

    /* renamed from: a */
    public final String mo139973a(EnumC86835b bVar, ModelInfo modelInfo, C88044c cVar) {
        Set<String> a;
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(modelInfo, "");
        C89219l.m154719c(cVar, "");
        String name = modelInfo.getName();
        if (name != null) {
            String a2 = C86735a.C86736a.m150258a(name);
            C86735a c = mo140008c();
            if (!(c == null || (a = c.mo139976a()) == null)) {
                for (T t : a) {
                    if (C89219l.m154714a((Object) C87000n.m150684a(t), (Object) a2)) {
                        mo140011d(t);
                    }
                }
            }
        }
        C89219l.m154719c(modelInfo, "");
        String a3 = C86735a.C86736a.m150258a(modelInfo.getName() + "_v" + modelInfo.getVersion() + "_size" + modelInfo.getType() + "_md5" + C86836c.m150404a(modelInfo) + ".model");
        int i = C86748b.f195632a[bVar.ordinal()];
        String str = null;
        if (i == 1) {
            ExtendedUrlModel file_url = modelInfo.getFile_url();
            if (file_url != null) {
                str = file_url.getUri();
            }
            return (String) C86749c.m150282a(this, a3, cVar, str).getFirst();
        } else if (i == 2) {
            ExtendedUrlModel file_url2 = modelInfo.getFile_url();
            if (file_url2 != null) {
                str = file_url2.getUri();
            }
            return (String) C86749c.m150284b(this, a3, cVar, str).getFirst();
        } else {
            throw new C89376n();
        }
    }
}
