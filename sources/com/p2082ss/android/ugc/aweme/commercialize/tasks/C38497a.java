package com.p2082ss.android.ugc.aweme.commercialize.tasks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.a */
public final class C38497a implements IAdTaskDepend {

    /* renamed from: a */
    public static final C38497a f90936a = new C38497a();

    /* renamed from: b */
    private final /* synthetic */ IAdTaskDepend f90937b;

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final Intent mo65610a(Context context) {
        C89219l.m154721d(context, "");
        return this.f90937b.mo65610a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final String mo65611a() {
        return this.f90937b.mo65611a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final JSONObject mo65612a(Context context, Aweme aweme, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str, "");
        return this.f90937b.mo65612a(context, aweme, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final void mo65613a(Context context, int i, int i2) {
        C89219l.m154721d(context, "");
        this.f90937b.mo65613a(context, i, i2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final void mo65614a(Context context, String str, String str2, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        this.f90937b.mo65614a(context, str, str2, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final void mo65615a(String str) {
        C89219l.m154721d(str, "");
        this.f90937b.mo65615a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65616a(Context context, int i) {
        C89219l.m154721d(context, "");
        return this.f90937b.mo65616a(context, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65617a(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return this.f90937b.mo65617a(context, awemeRawAd, str, str2, str3, i);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65618a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        return this.f90937b.mo65618a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65619a(Context context, String str, String str2) {
        return this.f90937b.mo65619a(context, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65620a(Context context, String str, String str2, String str3, String str4) {
        return this.f90937b.mo65620a(context, str, str2, str3, str4);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65621a(Aweme aweme) {
        return this.f90937b.mo65621a(aweme);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65622a(AwemeRawAd awemeRawAd) {
        return this.f90937b.mo65622a(awemeRawAd);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65623a(String str, Context context, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        return this.f90937b.mo65623a(str, context, awemeRawAd);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: a */
    public final boolean mo65624a(boolean z, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return this.f90937b.mo65624a(z, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: b */
    public final void mo65625b(Context context) {
        C89219l.m154721d(context, "");
        this.f90937b.mo65625b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: b */
    public final boolean mo65626b() {
        return this.f90937b.mo65626b();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: b */
    public final boolean mo65627b(String str) {
        C89219l.m154721d(str, "");
        return this.f90937b.mo65627b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: c */
    public final boolean mo65628c(String str) {
        C89219l.m154721d(str, "");
        return this.f90937b.mo65628c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    /* renamed from: d */
    public final void mo65629d(String str) {
        C89219l.m154721d(str, "");
        this.f90937b.mo65629d(str);
    }

    static {
        Covode.recordClassIndex(46023);
    }

    private C38497a() {
        IAdTaskDepend c = AdTaskDependImpl.m75938c();
        C89219l.m154716b(c, "");
        this.f90937b = c;
    }
}
