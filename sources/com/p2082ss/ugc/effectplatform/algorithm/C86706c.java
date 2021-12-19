package com.p2082ss.ugc.effectplatform.algorithm;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.C86843g;
import com.p2082ss.ugc.effectplatform.model.algorithm.C86836c;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import com.p2082ss.ugc.effectplatform.util.EnumC87003q;
import p4519d.p4520a.p4521a.C87989b;
import p4519d.p4520a.p4522b.p4525c.C87998a;
import p4519d.p4520a.p4522b.p4525c.C88003f;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.algorithm.c */
public final class C86706c {

    /* renamed from: a */
    public static final C88003f f195529a = new C88003f();

    /* renamed from: b */
    public static final C87989b<String, C86715h> f195530b = new C87989b<>();

    /* renamed from: c */
    public static final C87998a f195531c = new C87998a(false);

    /* renamed from: d */
    public static final C86706c f195532d = new C86706c();

    private C86706c() {
    }

    /* renamed from: a */
    public static final void m150201a() {
        C88003f fVar = f195529a;
        fVar.f199879a.lock();
        try {
            f195530b.clear();
            f195531c.mo142588a(false);
        } finally {
            fVar.f199879a.unlock();
        }
    }

    static {
        Covode.recordClassIndex(102405);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static final boolean m150202a(String str) {
        if (EnumC87003q.ANDROID == EnumC87003q.PC || str == null) {
            return false;
        }
        C88003f fVar = f195529a;
        fVar.f199879a.lock();
        try {
            C86715h hVar = f195530b.get(str);
            fVar.f199879a.unlock();
            if (hVar == null) {
                C88060b.m153136a("AlgorithmModelInfoMemoryCache", "model: " + str + " not in cache!", null);
                return false;
            }
            C86843g gVar = hVar.f195546a;
            ModelInfo modelInfo = hVar.f195547b;
            if (!C89219l.m154714a((Object) gVar.mo140168b(), (Object) modelInfo.getVersion())) {
                C88060b.m153136a("AlgorithmModelInfoMemoryCache", "model: " + str + " version not match. local version: " + gVar.mo140168b() + ", server version: " + modelInfo.getVersion(), null);
                return false;
            } else if (gVar.f195768c) {
                return true;
            } else {
                if (gVar.mo140170c() != modelInfo.getType()) {
                    C88060b.m153136a("AlgorithmModelInfoMemoryCache", "model: " + str + " size not match. local size: " + gVar.mo140170c() + ", server size: " + modelInfo.getType(), null);
                    return false;
                } else if (!(!C89219l.m154714a((Object) gVar.mo140171d(), (Object) C86836c.m150404a(modelInfo)))) {
                    return true;
                } else {
                    C88060b.m153136a("AlgorithmModelInfoMemoryCache", "model: " + str + " md5 not match. local md5: " + gVar.mo140171d() + ", server md5: " + C86836c.m150404a(modelInfo), null);
                    return false;
                }
            }
        } catch (Throwable th) {
            fVar.f199879a.unlock();
            throw th;
        }
    }
}
