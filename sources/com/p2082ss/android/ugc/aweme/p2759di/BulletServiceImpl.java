package com.p2082ss.android.ugc.aweme.p2759di;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1125a.AbstractC16114a;
import com.bytedance.ies.bullet.p1129c.AbstractC16239d;
import com.p2082ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.bullet.views.AbstractC35316c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.di.BulletServiceImpl */
public class BulletServiceImpl implements IBulletService {

    /* renamed from: a */
    private IBulletService f96787a;

    static {
        Covode.recordClassIndex(49382);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final AbstractC16114a mo61856b() {
        return this.f96787a.mo61856b();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: c */
    public final void mo61860c() {
        this.f96787a.mo61860c();
    }

    public BulletServiceImpl() {
        BulletService bulletService = new BulletService();
        this.f96787a = bulletService;
        C89219l.m154721d(bulletService, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final AbstractC16239d.AbstractC16241b mo61850a() {
        return this.f96787a.mo61850a();
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final Activity mo61848a(String str) {
        return this.f96787a.mo61848a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final View mo61849a(Context context) {
        return this.f96787a.mo61849a(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final String mo61857b(String str) {
        return this.f96787a.mo61857b(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final void mo61858b(Context context) {
        this.f96787a.mo61858b(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61855a(Class<?> cls) {
        this.f96787a.mo61855a(cls);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: b */
    public final boolean mo61859b(Context context, String str) {
        return this.f96787a.mo61859b(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61852a(Context context, String str) {
        this.f96787a.mo61852a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61853a(Context context, String str, Bundle bundle) {
        this.f96787a.mo61853a(context, str, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final void mo61854a(Context context, String str, String str2, Bundle bundle) {
        this.f96787a.mo61854a(context, str, str2, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.api.IBulletService
    /* renamed from: a */
    public final AbstractC35316c mo61851a(Context context, String str, String str2, int i, int i2) {
        return this.f96787a.mo61851a(context, str, str2, i, i2);
    }
}
