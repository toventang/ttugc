package com.p4501vk.api.sdk.p4504c;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.c.d */
public final class C87858d extends Exception {
    static {
        Covode.recordClassIndex(103868);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87858d(int i, String str) {
        super("Server returned httpStatusCode=" + i + " with body: " + str);
        C89219l.m154719c(str, "");
    }
}
