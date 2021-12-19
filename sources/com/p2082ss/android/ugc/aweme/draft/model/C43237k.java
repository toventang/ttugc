package com.p2082ss.android.ugc.aweme.draft.model;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.k */
public final class C43237k {

    /* renamed from: a */
    public final int f100957a;

    /* renamed from: b */
    public final int f100958b;

    /* renamed from: c */
    public final Bitmap.Config f100959c;

    static {
        Covode.recordClassIndex(51439);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43237k)) {
            return false;
        }
        C43237k kVar = (C43237k) obj;
        return this.f100957a == kVar.f100957a && this.f100958b == kVar.f100958b && C89219l.m154714a(this.f100959c, kVar.f100959c);
    }

    public final int hashCode() {
        int i = ((this.f100957a * 31) + this.f100958b) * 31;
        Bitmap.Config config = this.f100959c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return "VideoCoverConfig(displayWidth=" + this.f100957a + ", displayHeight=" + this.f100958b + ", config=" + this.f100959c + ")";
    }

    private /* synthetic */ C43237k() {
        this(0, 0, Bitmap.Config.ARGB_8888);
    }

    public C43237k(int i, int i2, Bitmap.Config config) {
        C89219l.m154721d(config, "");
        this.f100957a = i;
        this.f100958b = i2;
        this.f100959c = config;
    }
}
