package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.gr */
public class C25994gr extends IOException {
    static {
        Covode.recordClassIndex(31409);
    }

    /* renamed from: a */
    static C25994gr m50607a() {
        return new C25994gr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C25994gr m50608b() {
        return new C25994gr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C25994gr m50609c() {
        return new C25994gr("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static C25994gr m50610d() {
        return new C25994gr("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static C25994gr m50611e() {
        return new C25994gr("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static C25997gu m50612f() {
        return new C25997gu("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static C25994gr m50613g() {
        return new C25994gr("Failed to parse the message.");
    }

    /* renamed from: h */
    static C25994gr m50614h() {
        return new C25994gr("Protocol message had invalid UTF-8.");
    }

    public C25994gr(String str) {
        super(str);
    }
}
