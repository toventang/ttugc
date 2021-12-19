package com.bytedance.ies.xbridge.system.p1357b.p1358a.p1359a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xbridge.system.b.a.a.a */
public enum EnumC18869a {
    Failed(0),
    UnauthorizedInvocation(-1),
    UnregisteredMethod(-2),
    InvalidParameter(-3),
    InvalidResult(-5),
    Success(1),
    UnauthorizedAccess(-6),
    OperationCancelled(-7),
    OperationTimeout(-8),
    ArgumentError(100),
    NoAccount(1000),
    NotFound(-9),
    NotImplemented(-10),
    AlreadyExists(-11),
    Unknown(-1000);
    

    /* renamed from: b */
    private final int f44680b;

    public final int getValue() {
        return this.f44680b;
    }

    static {
        Covode.recordClassIndex(21579);
    }

    private EnumC18869a(int i) {
        this.f44680b = i;
    }
}
