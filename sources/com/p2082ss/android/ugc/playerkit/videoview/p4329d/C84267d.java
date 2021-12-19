package com.p2082ss.android.ugc.playerkit.videoview.p4329d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74608c;
import com.p2082ss.android.ugc.aweme.simkit.AbstractC74616d;
import com.p2082ss.android.ugc.aweme.simkit.ISimKitConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.ICommonConfig;
import com.p2082ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig;
import com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector.BitrateFilter;
import com.p2082ss.android.ugc.aweme.simkit.impl.p3911b.C74627a;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.playerkit.exp.C84191b;
import com.p2082ss.android.ugc.playerkit.model.C84197a;
import com.p2082ss.android.ugc.playerkit.model.C84223u;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.d */
public final class C84267d {

    /* renamed from: a */
    public static final C84267d f188457a = new C84267d();

    private C84267d() {
    }

    static {
        Covode.recordClassIndex(98182);
    }

    /* renamed from: a */
    private static C84237e m144908a(C84237e[] eVarArr) {
        C84237e eVar = (C84237e) C89064i.m154500c(eVarArr);
        for (C84237e eVar2 : eVarArr) {
            if (Math.abs(eVar2.getBitRate() - 1000000) < Math.abs(eVar.getBitRate() - 1000000)) {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    /* renamed from: b */
    private static C84237e m144910b(C84237e[] eVarArr) {
        int intValue = ((Number) C84191b.f187902f.getValue()).intValue();
        if (intValue == 1) {
            return (C84237e) C89064i.m154500c(eVarArr);
        }
        if (intValue != 2) {
            return m144908a(eVarArr);
        }
        C89219l.m154721d(eVarArr, "");
        if (eVarArr.length != 0) {
            return eVarArr[C89064i.m154507h(eVarArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: a */
    public final C84223u mo129297a(C84241i iVar) {
        C89219l.m154719c(iVar, "");
        ArrayList arrayList = new ArrayList();
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        ICommonConfig commonConfig = b.getCommonConfig();
        C89219l.m154709a((Object) commonConfig, "");
        arrayList.addAll(commonConfig.getColdBootVideoUrlHooks());
        AbstractC80918i b2 = C80937s.m140453b();
        AbstractC74608c a2 = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a2, "");
        ISimKitConfig b3 = a2.mo117290b();
        C89219l.m154709a((Object) b3, "");
        ICommonConfig commonConfig2 = b3.getCommonConfig();
        C89219l.m154709a((Object) commonConfig2, "");
        arrayList.add(new C74627a(b2, commonConfig2.getVideoUrlHookHook()));
        return m144907a(iVar, (ArrayList<AbstractC84278n>) arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.playerkit.videoview.d.d$a */
    public static final class C84268a<T> implements Comparator<T> {

        /* renamed from: a */
        public static final C84268a f188458a = new C84268a();

        static {
            Covode.recordClassIndex(98183);
        }

        C84268a() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C84237e eVar = (C84237e) obj;
            C84237e eVar2 = (C84237e) obj2;
            C89219l.m154719c(eVar, "");
            C89219l.m154719c(eVar2, "");
            return eVar2.getBitRate() - eVar.getBitRate();
        }
    }

    /* renamed from: a */
    private static C84237e[] m144909a(C84241i iVar, List<C84237e> list) {
        AbstractC74608c a = AbstractC74616d.m131036a();
        C89219l.m154709a((Object) a, "");
        ISimKitConfig b = a.mo117290b();
        C89219l.m154709a((Object) b, "");
        IDimensionBitrateFilterConfig dimensionBitrateFilterConfig = b.getDimensionBitrateFilterConfig();
        if (dimensionBitrateFilterConfig != null && dimensionBitrateFilterConfig.mo117322a()) {
            list = new BitrateFilter().mo117453a(list, iVar.getSourceId());
            C89219l.m154709a((Object) list, "");
        }
        if (list.isEmpty()) {
            return null;
        }
        Object[] array = list.toArray(new C84237e[0]);
        if (array != null) {
            C84237e[] eVarArr = (C84237e[]) array;
            Arrays.sort(eVarArr, C84268a.f188458a);
            return eVarArr;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    public static C84223u m144907a(C84241i iVar, ArrayList<AbstractC84278n> arrayList) {
        C84223u uVar = new C84223u();
        List<String> urlList = iVar.getUrlList();
        C89219l.m154709a((Object) urlList, "");
        Object[] array = urlList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            uVar.f188235f = iVar.getUrlKey();
            uVar.f188233d = iVar.isBytevc1();
            uVar.f188236g = iVar.getFileCheckSum();
            uVar.f188231b = iVar.getRatio();
            uVar.f188238i = false;
            List<C84237e> bitRate = iVar.getBitRate();
            C89219l.m154709a((Object) bitRate, "");
            C84237e[] a = m144909a(iVar, bitRate);
            if (a != null) {
                boolean z = true;
                if (a.length != 0) {
                    C84237e b = m144910b(a);
                    iVar.setHitBitrate(b);
                    List<String> urlList2 = b.urlList();
                    C89219l.m154709a((Object) urlList2, "");
                    Object[] array2 = urlList2.toArray(new String[0]);
                    if (array2 != null) {
                        strArr = (String[]) array2;
                        String urlKey = b.getUrlKey();
                        if (urlKey == null) {
                            urlKey = uVar.f188235f;
                        }
                        uVar.f188235f = urlKey;
                        String checksum = b.getChecksum();
                        if (checksum == null) {
                            checksum = uVar.f188236g;
                        }
                        uVar.f188236g = checksum;
                        if (b.isBytevc1() != 1) {
                            z = false;
                        }
                        uVar.f188233d = z;
                        uVar.f188234e = new C84197a(b.getBitRate(), b.getGearName(), b.getQualityType(), b.isBytevc1(), b.getUrlKey(), b.urlList(), b.getChecksum(), b.getSize());
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
            }
            List<String> a2 = C84282p.m144941a(strArr, iVar.getCreateTime(), iVar.getCdnUrlExpired());
            C89219l.m154709a((Object) a2, "");
            Object[] array3 = a2.toArray(new String[0]);
            if (array3 != null) {
                String[] strArr2 = (String[]) array3;
                uVar.f188230a = C89064i.m154503d(strArr2);
                if (arrayList != null) {
                    C84273i iVar2 = new C84273i(iVar, uVar.f188235f, strArr2);
                    C84274j a3 = new C84281o(arrayList, iVar2, 0).mo129303a(iVar2);
                    uVar.f188230a = a3.f188462a;
                    uVar.f188237h = a3.f188463b;
                }
                return uVar;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new C89388w("null cannot be cast to non-null type");
    }
}
