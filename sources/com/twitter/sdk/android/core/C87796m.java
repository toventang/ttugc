package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.google.gson.C28027t;
import com.twitter.sdk.android.core.models.C87799a;
import com.twitter.sdk.android.core.models.C87800b;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import p4640l.C89781l;

/* renamed from: com.twitter.sdk.android.core.m */
public final class C87796m extends C87810s {

    /* renamed from: a */
    private final C87799a f199429a;

    /* renamed from: b */
    private final C87813t f199430b;

    /* renamed from: c */
    private final int f199431c;

    /* renamed from: d */
    private final C89781l f199432d;

    static {
        Covode.recordClassIndex(103794);
    }

    public final C89781l getResponse() {
        return this.f199432d;
    }

    public final int getStatusCode() {
        return this.f199431c;
    }

    public final C87813t getTwitterRateLimit() {
        return this.f199430b;
    }

    public final int getErrorCode() {
        C87799a aVar = this.f199429a;
        if (aVar == null) {
            return 0;
        }
        return aVar.f199440b;
    }

    public final String getErrorMessage() {
        C87799a aVar = this.f199429a;
        if (aVar == null) {
            return null;
        }
        return aVar.f199439a;
    }

    public C87796m(C89781l lVar) {
        this(lVar, readApiError(lVar), readApiRateLimit(lVar), lVar.f203560a.f204107c);
    }

    public static C87813t readApiRateLimit(C89781l lVar) {
        return new C87813t(lVar.f203560a.f204110f);
    }

    /* renamed from: a */
    private static C87799a m152812a(String str) {
        try {
            C87800b bVar = (C87800b) new C27917g().mo46679a(new SafeListAdapter()).mo46679a(new SafeMapAdapter()).mo46682b().mo46670a(str, C87800b.class);
            if (!bVar.f199441a.isEmpty()) {
                return bVar.f199441a.get(0);
            }
            return null;
        } catch (C28027t unused) {
            C87794k.m152811c().mo142112a();
            return null;
        }
    }

    public static C87799a readApiError(C89781l lVar) {
        try {
            String r = lVar.f203562c.source().mo68846a().clone().mo143848r();
            if (!TextUtils.isEmpty(r)) {
                return m152812a(r);
            }
            return null;
        } catch (Exception unused) {
            C87794k.m152811c().mo142112a();
            return null;
        }
    }

    private C87796m(C89781l lVar, C87799a aVar, C87813t tVar, int i) {
        super("HTTP request failed, Status: ".concat(String.valueOf(i)));
        this.f199429a = aVar;
        this.f199430b = tVar;
        this.f199431c = i;
        this.f199432d = lVar;
    }
}
