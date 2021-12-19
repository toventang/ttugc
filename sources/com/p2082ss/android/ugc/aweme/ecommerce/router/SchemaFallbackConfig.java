package com.p2082ss.android.ugc.aweme.ecommerce.router;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.SchemaFallbackConfig */
public final class SchemaFallbackConfig {
    @AbstractC27891c(mo46611a = "fallback")
    private final String fallback;
    @AbstractC27891c(mo46611a = "key")
    private final String key;

    static {
        Covode.recordClassIndex(53684);
    }

    public SchemaFallbackConfig() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ SchemaFallbackConfig copy$default(SchemaFallbackConfig schemaFallbackConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaFallbackConfig.key;
        }
        if ((i & 2) != 0) {
            str2 = schemaFallbackConfig.fallback;
        }
        return schemaFallbackConfig.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.fallback;
    }

    public final SchemaFallbackConfig copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new SchemaFallbackConfig(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemaFallbackConfig)) {
            return false;
        }
        SchemaFallbackConfig schemaFallbackConfig = (SchemaFallbackConfig) obj;
        return C89219l.m154714a(this.key, schemaFallbackConfig.key) && C89219l.m154714a(this.fallback, schemaFallbackConfig.fallback);
    }

    public final int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.fallback;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SchemaFallbackConfig(key=" + this.key + ", fallback=" + this.fallback + ")";
    }

    public final String getFallback() {
        return this.fallback;
    }

    public final String getKey() {
        return this.key;
    }

    public SchemaFallbackConfig(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.key = str;
        this.fallback = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SchemaFallbackConfig(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
