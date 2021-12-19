package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.p2082ss.android.ugc.effectmanager.FetchModelType;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.algorithm.EnumC86835b;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt */
public final class ModelConverterExtKt {

    /* renamed from: com.ss.android.ugc.effectmanager.knadapt.ModelConverterExtKt$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            Covode.recordClassIndex(95761);
            int[] iArr = new int[EnumC86835b.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[EnumC86835b.ORIGIN.ordinal()] = 1;
            iArr[EnumC86835b.ZIP.ordinal()] = 2;
            int[] iArr2 = new int[FetchModelType.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[FetchModelType.ORIGIN.ordinal()] = 1;
            iArr2[FetchModelType.ZIP.ordinal()] = 2;
            int[] iArr3 = new int[DownloadableModelConfig.ModelFileEnv.values().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[DownloadableModelConfig.ModelFileEnv.TEST.ordinal()] = 1;
            iArr3[DownloadableModelConfig.ModelFileEnv.ONLINE.ordinal()] = 2;
        }
    }

    static {
        Covode.recordClassIndex(95760);
    }

    public static final EnumC86835b toKNFetchModelType(FetchModelType fetchModelType) {
        C89219l.m154719c(fetchModelType, "");
        int i = WhenMappings.$EnumSwitchMapping$1[fetchModelType.ordinal()];
        if (i == 1) {
            return EnumC86835b.ORIGIN;
        }
        if (i == 2) {
            return EnumC86835b.ZIP;
        }
        throw new C89376n();
    }

    public static final C86687a.EnumC86690c toKNModel(DownloadableModelConfig.ModelFileEnv modelFileEnv) {
        C89219l.m154719c(modelFileEnv, "");
        int i = WhenMappings.$EnumSwitchMapping$2[modelFileEnv.ordinal()];
        if (i == 1) {
            return C86687a.EnumC86690c.TEST;
        }
        if (i == 2) {
            return C86687a.EnumC86690c.ONLINE;
        }
        throw new C89376n();
    }

    public static final FetchModelType toOldFetchModelType(EnumC86835b bVar) {
        C89219l.m154719c(bVar, "");
        int i = WhenMappings.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            return FetchModelType.ORIGIN;
        }
        if (i == 2) {
            return FetchModelType.ZIP;
        }
        throw new C89376n();
    }
}
