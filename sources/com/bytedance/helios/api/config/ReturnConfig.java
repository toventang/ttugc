package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ReturnConfig {
    @AbstractC27891c(mo46611a = "default_result")
    private final Object defaultResult;
    @AbstractC27891c(mo46611a = "default_value")
    private final String defaultValue;
    @AbstractC27891c(mo46611a = "type_info")
    private final TypeInfo typeInfo;

    static {
        Covode.recordClassIndex(17571);
    }

    public ReturnConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ReturnConfig copy$default(ReturnConfig returnConfig, String str, TypeInfo typeInfo2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = returnConfig.defaultValue;
        }
        if ((i & 2) != 0) {
            typeInfo2 = returnConfig.typeInfo;
        }
        if ((i & 4) != 0) {
            obj = returnConfig.defaultResult;
        }
        return returnConfig.copy(str, typeInfo2, obj);
    }

    public final String component1() {
        return this.defaultValue;
    }

    public final TypeInfo component2() {
        return this.typeInfo;
    }

    public final Object component3() {
        return this.defaultResult;
    }

    public final ReturnConfig copy(String str, TypeInfo typeInfo2, Object obj) {
        return new ReturnConfig(str, typeInfo2, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReturnConfig)) {
            return false;
        }
        ReturnConfig returnConfig = (ReturnConfig) obj;
        return C89219l.m154714a(this.defaultValue, returnConfig.defaultValue) && C89219l.m154714a(this.typeInfo, returnConfig.typeInfo) && C89219l.m154714a(this.defaultResult, returnConfig.defaultResult);
    }

    public final int hashCode() {
        String str = this.defaultValue;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        TypeInfo typeInfo2 = this.typeInfo;
        int hashCode2 = (hashCode + (typeInfo2 != null ? typeInfo2.hashCode() : 0)) * 31;
        Object obj = this.defaultResult;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ReturnConfig(defaultValue=" + this.defaultValue + ", typeInfo=" + this.typeInfo + ", defaultResult=" + this.defaultResult + ")";
    }

    public final Object getDefaultResult() {
        return this.defaultResult;
    }

    public final String getDefaultValue() {
        return this.defaultValue;
    }

    public final TypeInfo getTypeInfo() {
        return this.typeInfo;
    }

    public ReturnConfig(String str, TypeInfo typeInfo2, Object obj) {
        this.defaultValue = str;
        this.typeInfo = typeInfo2;
        this.defaultResult = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReturnConfig(String str, TypeInfo typeInfo2, Object obj, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : typeInfo2, (i & 4) != 0 ? null : obj);
    }
}
