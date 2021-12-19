package com.bytedance.netecho.result;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class DnsResolveResult extends Result {

    /* renamed from: ip */
    private final String f51090ip;
    private final boolean success;
    private final String throwableMsg;

    static {
        Covode.recordClassIndex(25150);
    }

    public static /* synthetic */ DnsResolveResult copy$default(DnsResolveResult dnsResolveResult, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dnsResolveResult.success;
        }
        if ((i & 2) != 0) {
            str = dnsResolveResult.f51090ip;
        }
        if ((i & 4) != 0) {
            str2 = dnsResolveResult.throwableMsg;
        }
        return dnsResolveResult.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.success;
    }

    public final String component2() {
        return this.f51090ip;
    }

    public final String component3() {
        return this.throwableMsg;
    }

    public final DnsResolveResult copy(boolean z, String str, String str2) {
        return new DnsResolveResult(z, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DnsResolveResult) {
                DnsResolveResult dnsResolveResult = (DnsResolveResult) obj;
                if (this.success != dnsResolveResult.success || !C89219l.m154714a((Object) this.f51090ip, (Object) dnsResolveResult.f51090ip) || !C89219l.m154714a((Object) this.throwableMsg, (Object) dnsResolveResult.throwableMsg)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.f51090ip;
        int i5 = 0;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.throwableMsg;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "DnsResolveResult(success=" + this.success + ", ip=" + this.f51090ip + ", throwableMsg=" + this.throwableMsg + ")";
    }

    public final String getIp() {
        return this.f51090ip;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final String getThrowableMsg() {
        return this.throwableMsg;
    }

    public DnsResolveResult(boolean z, String str, String str2) {
        this.success = z;
        this.f51090ip = str;
        this.throwableMsg = str2;
    }
}
