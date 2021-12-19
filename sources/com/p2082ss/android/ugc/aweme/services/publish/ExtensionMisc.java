package com.p2082ss.android.ugc.aweme.services.publish;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63199ax;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C71518t;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.publish.ExtensionMisc */
public final class ExtensionMisc {
    private final String candidateLog;
    private final ExtensionDataRepo extensionDataRepo;
    private final boolean hasEditPageWikiAnchor;
    private final MobParam mobParam;
    private final String pContext;
    private final AbstractC63199ax.AbstractC63200a publishExtensionDataContainer;
    private final C71518t transMicroAppInfo;

    static {
        Covode.recordClassIndex(79931);
    }

    public ExtensionMisc(String str, String str2, C71518t tVar, AbstractC63199ax.AbstractC63200a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2) {
        this(str, str2, tVar, aVar, extensionDataRepo2, mobParam2, false, 64, null);
    }

    public static /* synthetic */ ExtensionMisc copy$default(ExtensionMisc extensionMisc, String str, String str2, C71518t tVar, AbstractC63199ax.AbstractC63200a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = extensionMisc.candidateLog;
        }
        if ((i & 2) != 0) {
            str2 = extensionMisc.pContext;
        }
        if ((i & 4) != 0) {
            tVar = extensionMisc.transMicroAppInfo;
        }
        if ((i & 8) != 0) {
            aVar = extensionMisc.publishExtensionDataContainer;
        }
        if ((i & 16) != 0) {
            extensionDataRepo2 = extensionMisc.extensionDataRepo;
        }
        if ((i & 32) != 0) {
            mobParam2 = extensionMisc.mobParam;
        }
        if ((i & 64) != 0) {
            z = extensionMisc.hasEditPageWikiAnchor;
        }
        return extensionMisc.copy(str, str2, tVar, aVar, extensionDataRepo2, mobParam2, z);
    }

    public final String component1() {
        return this.candidateLog;
    }

    public final String component2() {
        return this.pContext;
    }

    public final C71518t component3() {
        return this.transMicroAppInfo;
    }

    public final AbstractC63199ax.AbstractC63200a component4() {
        return this.publishExtensionDataContainer;
    }

    public final ExtensionDataRepo component5() {
        return this.extensionDataRepo;
    }

    public final MobParam component6() {
        return this.mobParam;
    }

    public final boolean component7() {
        return this.hasEditPageWikiAnchor;
    }

    public final ExtensionMisc copy(String str, String str2, C71518t tVar, AbstractC63199ax.AbstractC63200a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z) {
        C89219l.m154721d(extensionDataRepo2, "");
        C89219l.m154721d(mobParam2, "");
        return new ExtensionMisc(str, str2, tVar, aVar, extensionDataRepo2, mobParam2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtensionMisc)) {
            return false;
        }
        ExtensionMisc extensionMisc = (ExtensionMisc) obj;
        return C89219l.m154714a(this.candidateLog, extensionMisc.candidateLog) && C89219l.m154714a(this.pContext, extensionMisc.pContext) && C89219l.m154714a(this.transMicroAppInfo, extensionMisc.transMicroAppInfo) && C89219l.m154714a(this.publishExtensionDataContainer, extensionMisc.publishExtensionDataContainer) && C89219l.m154714a(this.extensionDataRepo, extensionMisc.extensionDataRepo) && C89219l.m154714a(this.mobParam, extensionMisc.mobParam) && this.hasEditPageWikiAnchor == extensionMisc.hasEditPageWikiAnchor;
    }

    public final int hashCode() {
        String str = this.candidateLog;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.pContext;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C71518t tVar = this.transMicroAppInfo;
        int hashCode3 = (hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31;
        AbstractC63199ax.AbstractC63200a aVar = this.publishExtensionDataContainer;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        ExtensionDataRepo extensionDataRepo2 = this.extensionDataRepo;
        int hashCode5 = (hashCode4 + (extensionDataRepo2 != null ? extensionDataRepo2.hashCode() : 0)) * 31;
        MobParam mobParam2 = this.mobParam;
        if (mobParam2 != null) {
            i = mobParam2.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.hasEditPageWikiAnchor;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public final String toString() {
        return "ExtensionMisc(candidateLog=" + this.candidateLog + ", pContext=" + this.pContext + ", transMicroAppInfo=" + this.transMicroAppInfo + ", publishExtensionDataContainer=" + this.publishExtensionDataContainer + ", extensionDataRepo=" + this.extensionDataRepo + ", mobParam=" + this.mobParam + ", hasEditPageWikiAnchor=" + this.hasEditPageWikiAnchor + ")";
    }

    public final String getCandidateLog() {
        return this.candidateLog;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        return this.extensionDataRepo;
    }

    public final boolean getHasEditPageWikiAnchor() {
        return this.hasEditPageWikiAnchor;
    }

    public final MobParam getMobParam() {
        return this.mobParam;
    }

    public final String getPContext() {
        return this.pContext;
    }

    public final AbstractC63199ax.AbstractC63200a getPublishExtensionDataContainer() {
        return this.publishExtensionDataContainer;
    }

    public final C71518t getTransMicroAppInfo() {
        return this.transMicroAppInfo;
    }

    public ExtensionMisc(String str, String str2, C71518t tVar, AbstractC63199ax.AbstractC63200a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z) {
        C89219l.m154721d(extensionDataRepo2, "");
        C89219l.m154721d(mobParam2, "");
        this.candidateLog = str;
        this.pContext = str2;
        this.transMicroAppInfo = tVar;
        this.publishExtensionDataContainer = aVar;
        this.extensionDataRepo = extensionDataRepo2;
        this.mobParam = mobParam2;
        this.hasEditPageWikiAnchor = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtensionMisc(String str, String str2, C71518t tVar, AbstractC63199ax.AbstractC63200a aVar, ExtensionDataRepo extensionDataRepo2, MobParam mobParam2, boolean z, int i, C89214g gVar) {
        this(str, str2, tVar, aVar, extensionDataRepo2, mobParam2, (i & 64) != 0 ? false : z);
    }
}
