package com.p2082ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.C86841f;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.p4444b.C86734a;
import com.p2082ss.ugc.effectplatform.p4451h.AbstractC86799h;
import com.p2082ss.ugc.effectplatform.p4455l.C86824a;
import com.p2082ss.ugc.effectplatform.task.C86861aa;
import com.p2082ss.ugc.effectplatform.util.C87000n;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import com.p2082ss.ugc.effectplatform.util.C87008v;
import java.util.List;
import p4519d.p4520a.p4530d.p4531a.C88045d;
import p4519d.p4520a.p4530d.p4531a.C88049f;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.ugc.effectplatform.algorithm.d */
public class C86707d {
    public static final C86708a Companion = new C86708a((byte) 0);
    private final C86734a algorithmModelCache;
    private final C86712f buildInAssetsManager;
    private final AbstractC86799h eventListener;

    static {
        Covode.recordClassIndex(102406);
    }

    public long getEffectHandle() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onModelFound(String str) {
        C89219l.m154719c(str, "");
    }

    /* renamed from: com.ss.ugc.effectplatform.algorithm.d$a */
    public static final class C86708a {
        static {
            Covode.recordClassIndex(102407);
        }

        private C86708a() {
        }

        public /* synthetic */ C86708a(byte b) {
            this();
        }
    }

    private final boolean isTransRes(String str) {
        return C89361p.m154874b(str, "resource/trans?effectPath=", false);
    }

    /* access modifiers changed from: protected */
    public String getBuiltInResourceUrl(String str) {
        C89219l.m154719c(str, "");
        return "asset://model/".concat(String.valueOf(str));
    }

    public final String readAssetFileAsString(String str) {
        C89219l.m154719c(str, "");
        return this.buildInAssetsManager.mo139955b(str);
    }

    /* access modifiers changed from: protected */
    public boolean isExactBuiltInResource(String str) {
        C89219l.m154719c(str, "");
        return this.buildInAssetsManager.mo139954a("model/".concat(String.valueOf(str)));
    }

    public String findResourceUri(String str) {
        boolean z;
        C89219l.m154719c(str, "");
        C86843g a = this.algorithmModelCache.mo139972a(C87000n.m150684a(str));
        if (a != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            StringBuilder sb = new StringBuilder("file://");
            if (a != null) {
                str2 = a.f195769d;
            }
            return C87008v.m150699a(sb.append(str2).toString());
        } else if (isExactBuiltInResource(str)) {
            return getBuiltInResourceUrl(str);
        } else {
            return null;
        }
    }

    public final boolean isResourceAvailable(String str) {
        C89219l.m154719c(str, "");
        String findResourceUri = findResourceUri(str);
        if (findResourceUri == null || !(!C89219l.m154714a((Object) findResourceUri, (Object) "asset://md5_error")) || !(!C89219l.m154714a((Object) findResourceUri, (Object) "asset://not_found"))) {
            return false;
        }
        return true;
    }

    private final String findTransResUri(String str) {
        List<C88049f> a;
        String str2;
        String a2 = C89361p.m154869a(C89361p.m154869a(str, "resource/trans?effectPath=", "", false), "\"", "", false);
        if (C89361p.m154876c(a2, "/", false)) {
            a2 = a2.substring(0, a2.length() - 1);
            C89219l.m154709a((Object) a2, "");
        }
        int a3 = C89361p.m154885a((CharSequence) a2, "/");
        if (a2 != null) {
            String substring = a2.substring(0, a3);
            C89219l.m154709a((Object) substring, "");
            String substring2 = a2.substring(C89361p.m154885a((CharSequence) a2, "/") + 1, a2.length());
            C89219l.m154709a((Object) substring2, "");
            String str3 = substring + C88045d.f199951a + substring2 + "_trans_";
            C89219l.m154719c(str3, "");
            if (!C86824a.f195743a.contains(str3) && (a = C88045d.m153105a(substring)) != null) {
                for (T t : a) {
                    if (C89361p.m154874b(t.f199959a, substring2 + "_trans_", false) && (str2 = t.f199960b.f199967a) != null) {
                        return C87008v.m150699a("file://".concat(String.valueOf(str2)));
                    }
                }
            }
            return "asset://not_found";
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* access modifiers changed from: protected */
    public void onModelNotFound(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        RuntimeException runtimeException = new RuntimeException("model not found neither in asset nor disk ".concat(String.valueOf(str2)));
        AbstractC86799h hVar = this.eventListener;
        if (hVar != null) {
            hVar.onModelNotFound(null, runtimeException);
        }
    }

    public C86707d(C86734a aVar, C86712f fVar, AbstractC86799h hVar) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(fVar, "");
        this.algorithmModelCache = aVar;
        this.buildInAssetsManager = fVar;
        this.eventListener = hVar;
    }

    private final boolean checkModelMd5(String str, int i, String str2) {
        ExtendedUrlModel extendedUrlModel;
        if (str2 != null && !isExactBuiltInResource(str)) {
            String a = C87000n.m150684a(str);
            String d = C87000n.m150688d(str2);
            C86841f a2 = C86861aa.C86862a.m150471a().mo140589a(i);
            if (a2 != null) {
                try {
                    extendedUrlModel = a2.mo140162a(a);
                } catch (IllegalArgumentException e) {
                    C88060b.m153136a("AlgorithmResourceFinder", "model info not found in model list", e);
                    ModelInfo a3 = C86861aa.C86862a.m150471a().mo140588a(i, a, true);
                    if (a3 != null) {
                        extendedUrlModel = a3.getFile_url();
                    }
                }
                if (extendedUrlModel != null) {
                    String uri = extendedUrlModel.getUri();
                    if (!C87007u.m150698a(d, uri)) {
                        String str3 = str + " md5 = " + d + " expectedMd5 = " + uri;
                        C88060b.m153135a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str + "], asset://md5_error\n" + str3);
                        onModelNotFound(a, str3);
                        return true;
                    }
                }
            }
            C88060b.m153136a("AlgorithmResourceFinder", "expected model info not found in model list", null);
            return false;
        }
        return false;
    }

    public final String realFindResourceUri(int i, String str, String str2) {
        C89219l.m154719c(str2, "");
        C88060b.m153135a("AlgorithmResourceFinder", "findResourceUri() called with nameStr = [" + str2 + ']');
        if (isTransRes(str2)) {
            return findTransResUri(str2);
        }
        String findResourceUri = findResourceUri(str2);
        try {
            if (checkModelMd5(str2, i, findResourceUri)) {
                return "asset://md5_error";
            }
        } catch (RuntimeException e) {
            C88060b.m153136a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], exception hanppens", e);
        }
        if (findResourceUri == null) {
            C88060b.m153136a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [asset://not_found]", null);
            return "asset://not_found";
        }
        C88060b.m153135a("AlgorithmResourceFinder", "findResourceUri called with nameStr = [" + str2 + "], returned result: [" + findResourceUri + ']');
        onModelFound(str2);
        return findResourceUri;
    }
}
