package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class TypeInfo {
    @AbstractC27891c(mo46611a = "argument_type_names")
    private final List<TypeInfo> argumentTypeNames;
    @AbstractC27891c(mo46611a = "owner_type_name")
    private final String ownerTypeName;
    @AbstractC27891c(mo46611a = "raw_type_name")
    private final String rawTypeName;

    static {
        Covode.recordClassIndex(17575);
    }

    public TypeInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.TypeInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypeInfo copy$default(TypeInfo typeInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = typeInfo.rawTypeName;
        }
        if ((i & 2) != 0) {
            str2 = typeInfo.ownerTypeName;
        }
        if ((i & 4) != 0) {
            list = typeInfo.argumentTypeNames;
        }
        return typeInfo.copy(str, str2, list);
    }

    public final String component1() {
        return this.rawTypeName;
    }

    public final String component2() {
        return this.ownerTypeName;
    }

    public final List<TypeInfo> component3() {
        return this.argumentTypeNames;
    }

    public final TypeInfo copy(String str, String str2, List<TypeInfo> list) {
        C89219l.m154719c(str, "");
        return new TypeInfo(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeInfo)) {
            return false;
        }
        TypeInfo typeInfo = (TypeInfo) obj;
        return C89219l.m154714a(this.rawTypeName, typeInfo.rawTypeName) && C89219l.m154714a(this.ownerTypeName, typeInfo.ownerTypeName) && C89219l.m154714a(this.argumentTypeNames, typeInfo.argumentTypeNames);
    }

    public final int hashCode() {
        String str = this.rawTypeName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ownerTypeName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<TypeInfo> list = this.argumentTypeNames;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "TypeInfo(rawTypeName=" + this.rawTypeName + ", ownerTypeName=" + this.ownerTypeName + ", argumentTypeNames=" + this.argumentTypeNames + ")";
    }

    public final List<TypeInfo> getArgumentTypeNames() {
        return this.argumentTypeNames;
    }

    public final String getOwnerTypeName() {
        return this.ownerTypeName;
    }

    public final String getRawTypeName() {
        return this.rawTypeName;
    }

    public TypeInfo(String str, String str2, List<TypeInfo> list) {
        C89219l.m154719c(str, "");
        this.rawTypeName = str;
        this.ownerTypeName = str2;
        this.argumentTypeNames = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TypeInfo(String str, String str2, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
